import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tabuleiro extends javax.swing.JFrame {
        //###############JOGADORES###############// -- COMEÇO     
        boolean presoVermelho = false;
        boolean presoAzul = false; 
        int vez = 1;
        int posicao = 1;
        int retorno;
        Jogador jAzul = new Jogador(1, "Azul", 1);
        
        Jogador jVermelho = new Jogador(2, "Vermelho", 1);
        //###############JOGADORES###############// -- FIM
        //###############LISTA PROPRIEDADES###############// -- COMEÇO
        //Lista de Propriedades
        ArrayList<Propriedade> listaPropriedades = new ArrayList<>();
        Propriedade end1 =  new Propriedade(1,"Início", 0,200, 0,640,10,3);       
        Propriedade end2 =  new Propriedade(2,"Porto do Forte", 60,40,10,640,110,0);   
        Propriedade end3 =  new Propriedade(3,"Tesouro", 0, 0, 400, 640, 165,4);
        Propriedade end4 =  new Propriedade(4,"Porto da Barra", 60, 40, 10, 640, 220,0);
        Propriedade end5 =  new Propriedade(5,"Imposto", 0, 0, 200, 640, 275,3);
        Propriedade end6 =  new Propriedade(6,"Passeio", 0, 0, 200, 640, 330,3);
        Propriedade end7 =  new Propriedade(7,"Castelhanos", 100, 80, 25, 640, 385,0);
        Propriedade end8 =  new Propriedade(8,"Chance", 0, 0, 100, 640, 440,4);
        Propriedade end9 =  new Propriedade(9,"Barra do Sahy", 100, 80, 25, 640, 495,0);
        Propriedade end10 = new Propriedade(10,"Bonete", 120, 90, 45, 640, 550,0);
        Propriedade end11 = new Propriedade(11,"Cadeia", 0, 0, 0, 640, 640,3);
        Propriedade end12 = new Propriedade(12,"Padres", 140, 110, 45, 540, 640,0);
        Propriedade end13 = new Propriedade(13,"Conta Luz", 0, 0, 100, 485, 640,3);
        Propriedade end14 = new Propriedade(14,"Falésias", 140, 110, 45, 430, 640,0);
        Propriedade end15 = new Propriedade(15,"Itaúnas", 160, 130, 65, 375, 640,0);
        Propriedade end16 = new Propriedade(16,"Passeio", 0, 0, 200, 320, 640,3);
        Propriedade end17 = new Propriedade(17,"Farol", 180, 140, 90, 265, 640,0);
        Propriedade end18 = new Propriedade(18,"Prêmio", 0, 0, 300, 210, 640,4);
        Propriedade end19 = new Propriedade(19,"Brava", 180, 140, 85, 155, 640,0);
        Propriedade end20 = new Propriedade(20,"Mansa", 200, 150, 100, 100, 640,0);
        Propriedade end21 = new Propriedade(21,"Estacionamento", 0, 0, 0, 10, 640,3);
        Propriedade end22 = new Propriedade(22,"Ilha dos Lobos", 220, 150, 110, 10, 540,0);
        Propriedade end23 = new Propriedade(23,"Chance", 0, 0, 200, 10,485,4);
        Propriedade end24 = new Propriedade(24,"Torres", 220, 140, 110, 10, 430,0);
        Propriedade end25 = new Propriedade(25,"Guarita", 240, 160, 120, 10, 375,0);
        Propriedade end26 = new Propriedade(26,"Aeroporto", 0, 0, 200, 10, 320,3);
        Propriedade end27 = new Propriedade(27,"Ponta Negra", 260, 180, 130, 10, 265,0);
        Propriedade end28 = new Propriedade(28,"Madeiro", 260, 190, 135, 10, 210,0);
        Propriedade end29 = new Propriedade(29,"Conta Água", 0, 0, 200, 10, 155,3);
        Propriedade end30 = new Propriedade(30,"Goufinhos", 280, 180, 140, 10, 100,0);
        Propriedade end31 = new Propriedade(31,"Vai Cadeia", 0, 0, 0, 10, 10,5);
        Propriedade end32 = new Propriedade(32,"Jurerê", 400, 200, 200, 110, 10,0);
        Propriedade end33 = new Propriedade(33,"Imposto Luxo", 0, 0, 100, 165, 10,3);
        Propriedade end34 = new Propriedade(34,"Lagoinha", 350, 175, 175, 220, 10,0);
        Propriedade end35 = new Propriedade(35,"Chance", 0, 0, 300, 275, 10,4);
        Propriedade end36 = new Propriedade(36,"Passeio", 0, 0, 200, 330, 10,3);
        Propriedade end37 = new Propriedade(37,"Farol", 320, 170, 160, 385, 10,0);
        Propriedade end38 = new Propriedade(38,"Tesouro", 0, 0, 400, 440, 10,4);
        Propriedade end39 = new Propriedade(39,"Azedinha", 300, 150, 150, 495, 10,0);
        Propriedade end40 = new Propriedade(40,"Ipanema", 300, 150, 150, 550, 10,0);
        
        
        //###############LISTA PROPRIEDADES###############// -- FIM
        //Cria dado
        Dado dado = new Dado();
        int valorDado;
        int retornaDado(int dadoE, int dadoD){
            valorDado = dadoE + dadoD;  
            return valorDado; 
        }
        
        void vezJogador(){
            if(jAzul.getDinheiro() <= -1000){
              JOptionPane.showMessageDialog(null, "Jogador azul perdeu o jogo!");
              System.exit(0);
            }          
            if(jVermelho.getDinheiro() <= -1000){
              JOptionPane.showMessageDialog(null, "Jogador vermelho perdeu o jogo!");
              System.exit(0);
            }              
            infoBox.setText("");
            int x, y;
            if(vez <= 1){
                
                
                if(presoVermelho == true){
                    infoBox.setForeground(new java.awt.Color(255, 0, 0));
                    infoBox.append("Jogador Vermelho está preso.\n");
                    presoVermelho = false;
                    vez--;
                }
                else{
                    infoBox.setForeground(new java.awt.Color(0, 51, 255));
                    posicao = jAzul.getPosicao();
                    posicao = posicao + valorDado;
                    if(posicao >= 40){
                        posicao = posicao - 40;
                        jAzul.setPosicao(posicao);
                    }else{
                      jAzul.setPosicao(posicao);  
                    }               
                    infoBox.setForeground(new java.awt.Color(0, 51, 255));
                    infoBox.append("####Vez jogador Azul####\n");

                    x = listaPropriedades.get(posicao).getX();
                    y = listaPropriedades.get(posicao).getY();
                    imgPecaAzul.setLocation(x, y);                



                    infoBox.append("Propriedade: " + listaPropriedades.get(posicao).getNome() + "\n");
                    vez++;
                    switch (listaPropriedades.get(posicao).getDono()) {
                        case 0:
                            //COMPRAR PROPRIEDADE
                            retorno = listaPropriedades.get(posicao).Comprar(jAzul.getDinheiro(), listaPropriedades.get(posicao).getPrecoCompra(),listaPropriedades.get(posicao).getNome());
                            System.out.println("Funciona 1");
                            System.out.println("Valor retorno: " + retorno);
                            if(retorno == 0){
                                infoBox.append("Jogador " + jAzul.getNome() + " acabou de comprar a propriedade: " + listaPropriedades.get(posicao).getNome() + "\n");
                                jAzul.setDinheiro((float) (jAzul.getDinheiro() - listaPropriedades.get(posicao).getPrecoCompra()));
                                listaPropriedades.get(posicao).setDono(1);
                                jAzul.setPropriedades(jAzul.getPropriedades() + 1);
                            }else if(retorno == 1){
                                 infoBox.append("Jogador " + jAzul.getNome() + " não possui dinheiro o suficiente para \nefetuar a compra.\n");
                            }

                            break;

                        case 1:
                            //VENDER PROPRIEDADE
                            infoBox.append("Essa propriedade já é do jogador " + jAzul.getNome() + ".\n");
                            retorno = listaPropriedades.get(posicao).Vender(listaPropriedades.get(posicao).getPrecoVenda());
                            if(retorno == 0){
                                infoBox.append("Propriedade vendida por: " +listaPropriedades.get(posicao).getPrecoVenda() +"\n");
                                jAzul.setDinheiro((float) (jAzul.getDinheiro() + listaPropriedades.get(posicao).getPrecoVenda()));
                                listaPropriedades.get(posicao).setDono(0);
                                jAzul.setPropriedades(jAzul.getPropriedades() - 1);
                            }
                            else{
                                infoBox.append("Operação cancelada.\n");                          
                            }
                            break;
                        case 2:
                            //PAGA AZUL -> VERMELHO
                            infoBox.append("Propriedade do jogador " + jVermelho.getNome() + "\n");
                            infoBox.append("Pague: R$" + listaPropriedades.get(posicao).getPrecoAluguel() +"\n");
                            jVermelho.setDinheiro((float) (jVermelho.getDinheiro() + listaPropriedades.get(posicao).getPrecoAluguel()));
                            jAzul.setDinheiro((float) (jAzul.getDinheiro() - listaPropriedades.get(posicao).getPrecoAluguel()));
                            break;

                        case 3:
                            //ALUGUEL JOGO
                            infoBox.append("Essa propriedade não pode ser comprada. Pague: " + listaPropriedades.get(posicao).getPrecoAluguel() + ".\n");
                            jAzul.setDinheiro((float) (jAzul.getDinheiro() - listaPropriedades.get(posicao).getPrecoAluguel()));
                            break;
                        case 4:
                            //PRÊMIO JOGO
                            infoBox.append("Parabéns! O jogador " + jAzul.getNome()+" acabou de ganhar R$ " + listaPropriedades.get(posicao).getPrecoAluguel() + "!\n");
                            jAzul.setDinheiro((float) (jAzul.getDinheiro() + listaPropriedades.get(posicao).getPrecoAluguel()));
                            break;
                        case 5:
                            //VAI CADEIA
                            imgPecaAzul.setLocation(640, 640);
                            infoBox.append("Jogador " + jAzul.getNome()+" está preso por uma rodada.\n");
                            jAzul.setPosicao(11);
                            presoAzul = true;    

                            break;  
                    } 
                    
                
                }
                    boxCaixaAzul.setText(String.valueOf(posicao));
                    boxDinheiroAzul.setText(String.valueOf(jAzul.getDinheiro()));
                    boxPropriedadeAzul.setText(String.valueOf(jAzul.getPropriedades()));     
                 
            } 
            else{
                
                if(presoAzul == true){
                    infoBox.setForeground(new java.awt.Color(0, 51, 255));
                    infoBox.append("Jogador Azul está preso.\n");
                    presoAzul= false;
                    vez++;                   
                }
                else{
                    infoBox.setForeground(new java.awt.Color(255, 0, 0));
                    posicao = jVermelho.getPosicao();
                    posicao = posicao + valorDado;
                    if(posicao >= 40){
                        posicao = posicao - 40;
                        jVermelho.setPosicao(posicao);
                    }else{
                      jVermelho.setPosicao(posicao);  
                    }
                    
                    infoBox.append("####Vez jogador Vermelho####\n");

                    x = listaPropriedades.get(posicao).getX();
                    y = listaPropriedades.get(posicao).getY();
                    imgPecaVermelho.setLocation(x, y);

                    infoBox.append("Propriedade: " + listaPropriedades.get(posicao).getNome() + "\n");
                    vez--;
                    switch (listaPropriedades.get(posicao).getDono()) {
                        case 0:
                            //COMPRAR PROPRIEDADE
                            retorno = listaPropriedades.get(posicao).Comprar(jVermelho.getDinheiro(), listaPropriedades.get(posicao).getPrecoCompra(),listaPropriedades.get(posicao).getNome());
                            System.out.println("Funciona 1");
                            System.out.println("Valor retorno: " + retorno);
                            if(retorno == 0){
                                infoBox.append("Jogador " + jVermelho.getNome() + " acabou de comprar a propriedade: " + listaPropriedades.get(posicao).getNome() + "\n");
                                jVermelho.setDinheiro((float) (jVermelho.getDinheiro() - listaPropriedades.get(posicao).getPrecoCompra()));
                                listaPropriedades.get(posicao).setDono(1);
                                jVermelho.setPropriedades(jVermelho.getPropriedades() + 1);
                            }else if(retorno == 1){
                                 infoBox.append("Jogador " + jVermelho.getNome() + " não possui dinheiro o suficiente para \nefetuar a compra.\n");
                            }                        
                            break;

                        case 1:
                            //PAGA VERMELHO -> AZUL
                            infoBox.append("Propriedade do jogador " + jAzul.getNome() + "\n");
                            infoBox.append("Pague: R$" + listaPropriedades.get(posicao).getPrecoAluguel() +"\n");
                            jAzul.setDinheiro((float) (jAzul.getDinheiro() + listaPropriedades.get(posicao).getPrecoAluguel()));
                            jVermelho.setDinheiro((float) (jVermelho.getDinheiro() - listaPropriedades.get(posicao).getPrecoAluguel()));
                            break;
                        case 2:
                            //VENDER PROPRIEDADE
                            infoBox.append("Essa propriedade já é do jogador " + jVermelho.getNome() + ".\n");
                            retorno = listaPropriedades.get(posicao).Vender(listaPropriedades.get(posicao).getPrecoVenda());
                            if(retorno == 0){
                                infoBox.append("Propriedade vendida por: " +listaPropriedades.get(posicao).getPrecoVenda() +"\n");
                                jVermelho.setDinheiro((float) (jVermelho.getDinheiro() + listaPropriedades.get(posicao).getPrecoVenda()));
                                listaPropriedades.get(posicao).setDono(0);
                                jVermelho.setPropriedades(jVermelho.getPropriedades() - 1);
                            }
                            else{
                                infoBox.append("Operação cancelada.\n");                          
                            }    
                            break;

                        case 3:
                            //ALUGUEL JOGO
                            infoBox.append("Essa propriedade não pode ser comprada. Pague: " + listaPropriedades.get(posicao).getPrecoAluguel() + ".\n");
                            jVermelho.setDinheiro((float) (jVermelho.getDinheiro() - listaPropriedades.get(posicao).getPrecoAluguel()));;
                            break;
                        case 4:
                            //PRÊMIO JOGO 
                            infoBox.append("Parabéns! O jogador " + jVermelho.getNome()+" acabou de ganhar R$" + listaPropriedades.get(posicao).getPrecoAluguel() + "!\n");
                            jVermelho.setDinheiro((float) (jVermelho.getDinheiro() + listaPropriedades.get(posicao).getPrecoAluguel()));
                            break;
                        case 5:
                            //VAI CADEIA
                            imgPecaVermelho.setLocation(640, 640);
                            infoBox.append("Jogador " + jVermelho.getNome()+" está preso por uma rodada.\n");
                            jVermelho.setPosicao(11);
                            presoVermelho = true;
                            break;    
                            
                    }
                    
                     
                }
                    boxCaixaVermelho.setText(String.valueOf(posicao));
                    boxDinheiroVermelho.setText(String.valueOf(jVermelho.getDinheiro()));
                    boxPropriedadeVermelho.setText(String.valueOf(jVermelho.getPropriedades()));                
            }
           
             

        }

    public Tabuleiro() {

        initComponents();
        listaPropriedades.add(end1);
        listaPropriedades.add(end2);
        listaPropriedades.add(end3);
        listaPropriedades.add(end4);
        listaPropriedades.add(end5);
        listaPropriedades.add(end6);
        listaPropriedades.add(end7);
        listaPropriedades.add(end8);
        listaPropriedades.add(end9);
        listaPropriedades.add(end10);
        listaPropriedades.add(end11);
        listaPropriedades.add(end12);
        listaPropriedades.add(end13);
        listaPropriedades.add(end14);
        listaPropriedades.add(end15);
        listaPropriedades.add(end16);
        listaPropriedades.add(end17);
        listaPropriedades.add(end18);
        listaPropriedades.add(end19);
        listaPropriedades.add(end20);
        listaPropriedades.add(end21);
        listaPropriedades.add(end22);
        listaPropriedades.add(end23);
        listaPropriedades.add(end24);
        listaPropriedades.add(end25);
        listaPropriedades.add(end26);
        listaPropriedades.add(end27);
        listaPropriedades.add(end28);
        listaPropriedades.add(end29);
        listaPropriedades.add(end30);
        listaPropriedades.add(end31);
        listaPropriedades.add(end32);
        listaPropriedades.add(end33);
        listaPropriedades.add(end34);
        listaPropriedades.add(end35);
        listaPropriedades.add(end36);
        listaPropriedades.add(end37);
        listaPropriedades.add(end38);
        listaPropriedades.add(end39);
        listaPropriedades.add(end40);
        //imgPecaAzul.setLocation(jAzul.getX(), jAzul.getY());
        //labelCasaAzul.setText(String.valueOf(posicao));
        //labelDinheiroAzul.setText(String.valueOf(jAzul.getDinheiro()));        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJogar = new javax.swing.JButton();
        imgDadoEsquerda = new javax.swing.JLabel();
        imgDadoDireita = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imgPecaAzul = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoBox = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        boxCaixaAzul = new javax.swing.JTextField();
        boxDinheiroAzul = new javax.swing.JTextField();
        boxCaixaVermelho = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        boxDinheiroVermelho = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        boxPropriedadeAzul = new javax.swing.JTextField();
        boxPropriedadeVermelho = new javax.swing.JTextField();
        imgPecaVermelho = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Money Holiday");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJogar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnJogar.setText("Jogar");
        btnJogar.setActionCommand("");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 380, 80));

        imgDadoEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-01.png"))); // NOI18N
        getContentPane().add(imgDadoEsquerda, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, -1, -1));

        imgDadoDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-01.png"))); // NOI18N
        getContentPane().add(imgDadoDireita, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, -1, -1));

        jLabel2.setText("Dados:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, -1, -1));

        imgPecaAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pecaAzul.png"))); // NOI18N
        getContentPane().add(imgPecaAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, -1));

        infoBox.setEditable(false);
        infoBox.setBackground(new java.awt.Color(255, 255, 255));
        infoBox.setColumns(20);
        infoBox.setForeground(new java.awt.Color(0, 102, 102));
        infoBox.setRows(5);
        jScrollPane1.setViewportView(infoBox);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 380, 140));

        jLabel1.setText("Informações:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jLabel3.setText("Jogadores:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pecaVermelha.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pecaAzul.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, -1, -1));

        jLabel9.setText("Azul");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, -1, -1));

        jLabel12.setText("Vermelho");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 380, -1, -1));

        jLabel13.setText("Casa:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, -1, -1));

        jLabel14.setText("R$:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, -1, -1));

        jLabel15.setText("Casa:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, -1, -1));

        jLabel16.setText("R$:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, -1, -1));

        boxCaixaAzul.setEditable(false);
        boxCaixaAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCaixaAzulActionPerformed(evt);
            }
        });
        getContentPane().add(boxCaixaAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 30, -1));

        boxDinheiroAzul.setEditable(false);
        getContentPane().add(boxDinheiroAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, 70, -1));

        boxCaixaVermelho.setEditable(false);
        getContentPane().add(boxCaixaVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 410, 30, -1));

        jLabel6.setText("Propriedades:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, -1, -1));

        boxDinheiroVermelho.setEditable(false);
        getContentPane().add(boxDinheiroVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, 70, -1));

        jLabel7.setText("Propriedades:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, -1, -1));

        boxPropriedadeAzul.setEditable(false);
        getContentPane().add(boxPropriedadeAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, 30, -1));

        boxPropriedadeVermelho.setEditable(false);
        getContentPane().add(boxPropriedadeVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 470, 30, -1));

        imgPecaVermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pecaVermelha.png"))); // NOI18N
        getContentPane().add(imgPecaVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tabuleiroFinal.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        // TODO add your handling code here:
            
            //###############DADO###############// -- COMEÇO
            
            int dadoEsquerda = dado.DadoEsquerda();
            int dadoDireita = dado.DadoDireita();
            int finalSoma = dadoEsquerda + dadoDireita;
            System.out.println("Dado Esquerda: " + dadoEsquerda);
            System.out.println("Dado Direita: " + dadoDireita);
            retornaDado(dadoEsquerda, dadoDireita);
            //Muda imagem dado Esquerda
            switch(dadoEsquerda){
            case 1:
                imgDadoEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-01.png")));
                break;
            case 2:
                imgDadoEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-02.png")));
                break;
            case 3:
                imgDadoEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-03.png")));
                break;
            case 4:
                imgDadoEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-04.png")));
                break;
            case 5:
                imgDadoEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-05.png")));
                break;
            case 6:
                imgDadoEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-06.png")));
                break;
            } 
            
            //Muda imagem dado Direita
            switch(dadoDireita){
            case 1:
                imgDadoDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-01.png")));
                break;
            case 2:
                imgDadoDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-02.png")));
                break;
            case 3:
                imgDadoDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-03.png")));
                break;
            case 4:
                imgDadoDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-04.png")));
                break;
            case 5:
                imgDadoDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-05.png")));
                break;
            case 6:
                imgDadoDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dado-06.png")));
                break;
            }   
            //###############DADO###############// -- FIM  

            
           vezJogador();
          
 
            
    }//GEN-LAST:event_btnJogarActionPerformed

    private void boxCaixaAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCaixaAzulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCaixaAzulActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabuleiro().setVisible(true);

            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxCaixaAzul;
    private javax.swing.JTextField boxCaixaVermelho;
    private javax.swing.JTextField boxDinheiroAzul;
    private javax.swing.JTextField boxDinheiroVermelho;
    private javax.swing.JTextField boxPropriedadeAzul;
    private javax.swing.JTextField boxPropriedadeVermelho;
    public javax.swing.JButton btnJogar;
    private javax.swing.JLabel imgDadoDireita;
    private javax.swing.JLabel imgDadoEsquerda;
    private javax.swing.JLabel imgPecaAzul;
    private javax.swing.JLabel imgPecaVermelho;
    public javax.swing.JTextArea infoBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
