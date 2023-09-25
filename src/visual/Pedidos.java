/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.util.Arrays;
/**
 *
 * @author Fermin Covarrubias Ramos - 4k - 20110309
 */
public class Pedidos extends javax.swing.JFrame {
int CantidadDePedido=102; //Se inicia desde esta cantidad por el precio original de la Hamburguesa

    /**
     * Creates new form Pedidos
     */
    public Pedidos() {
        initComponents();
    }   
        public static String nocebollaFinal="";
        public static String nojitomateFinal="";
        public static String nolechugaFinal="";
        public static String noquesoameAparteFinal="";
        public static String nomayonesaFinal="";
        public static String nopepinillosFinal="";
        public static String nosalsaespecialFinal="";
        public static String salsaportobelloextraFinal="";
        public static String salsadequesoextraFinal="";
        public static String mostazadulceextraFinal="";
        public static String pepinillosextraFinal="";
        public static String jalapeñosextraFinal="";
        public static String salsaranchextraFinal="";
        public static String salsabbqextraFinal="";
        public static String salsabuffaloextraFinal="";
        public static String mostazaextraFinal="";
        public static String mayonesaextraFinal="";
        public static String ketchupextraFinal="";
        public static String carneextraAparteFinal="";
        public static String carneangusextraFinal="";
        public static String tocinoextraFinal="";
        public static String pollobbqextraFinal="";
        public static String pechugaempaextraFinal="";
        public static String quesoameextraFinal="";
        public static String quesosuiextraFinal="";
        public static String guacamoleextraFinal="";
        public static String chilesantafeextraFinal="";
        public static String jitomateextraFinal="";
        public static String piñaextraFinal="";
        public static String chiliextraFinal="";
        public static String papasmedFinal="";
        public static String cocaoriginalFinal="";
        public static String cocasinazucarFinal="";
        public static String aroscebollaAparteFinal="";
        public static String cielFinal="";
        public static String comentarioFinal="";
        public static String panFinal="";
        public static String carneFinal="";
        public static String salsaAparteFinal="";

    public static String getNocebollaFinal() {
        return nocebollaFinal;
    }

    public static void setNocebollaFinal(String nocebollaFinal) {
        Pedidos.nocebollaFinal = nocebollaFinal;
    }

    public static String getNojitomateFinal() {
        return nojitomateFinal;
    }

    public static void setNojitomateFinal(String nojitomateFinal) {
        Pedidos.nojitomateFinal = nojitomateFinal;
    }

    public static String getNolechugaFinal() {
        return nolechugaFinal;
    }

    public static void setNolechugaFinal(String nolechugaFinal) {
        Pedidos.nolechugaFinal = nolechugaFinal;
    }

    public static String getNoquesoameAparteFinal() {
        return noquesoameAparteFinal;
    }

    public static void setNoquesoameAparteFinal(String noquesoameAparteFinal) {
        Pedidos.noquesoameAparteFinal = noquesoameAparteFinal;
    }

    public static String getNomayonesaFinal() {
        return nomayonesaFinal;
    }

    public static void setNomayonesaFinal(String nomayonesaFinal) {
        Pedidos.nomayonesaFinal = nomayonesaFinal;
    }

    public static String getNopepinillosFinal() {
        return nopepinillosFinal;
    }

    public static void setNopepinillosFinal(String nopepinillosFinal) {
        Pedidos.nopepinillosFinal = nopepinillosFinal;
    }

    public static String getNosalsaespecialFinal() {
        return nosalsaespecialFinal;
    }

    public static void setNosalsaespecialFinal(String nosalsaespecialFinal) {
        Pedidos.nosalsaespecialFinal = nosalsaespecialFinal;
    }

    public static String getSalsaportobelloextraFinal() {
        return salsaportobelloextraFinal;
    }

    public static void setSalsaportobelloextraFinal(String salsaportobelloextraFinal) {
        Pedidos.salsaportobelloextraFinal = salsaportobelloextraFinal;
    }

    public static String getSalsadequesoextraFinal() {
        return salsadequesoextraFinal;
    }

    public static void setSalsadequesoextraFinal(String salsadequesoextraFinal) {
        Pedidos.salsadequesoextraFinal = salsadequesoextraFinal;
    }

    public static String getMostazadulceextraFinal() {
        return mostazadulceextraFinal;
    }

    public static void setMostazadulceextraFinal(String mostazadulceextraFinal) {
        Pedidos.mostazadulceextraFinal = mostazadulceextraFinal;
    }

    public static String getPepinillosextraFinal() {
        return pepinillosextraFinal;
    }

    public static void setPepinillosextraFinal(String pepinillosextraFinal) {
        Pedidos.pepinillosextraFinal = pepinillosextraFinal;
    }

    public static String getJalapeñosextraFinal() {
        return jalapeñosextraFinal;
    }

    public static void setJalapeñosextraFinal(String jalapeñosextraFinal) {
        Pedidos.jalapeñosextraFinal = jalapeñosextraFinal;
    }

    public static String getSalsaranchextraFinal() {
        return salsaranchextraFinal;
    }

    public static void setSalsaranchextraFinal(String salsaranchextraFinal) {
        Pedidos.salsaranchextraFinal = salsaranchextraFinal;
    }

    public static String getSalsabbqextraFinal() {
        return salsabbqextraFinal;
    }

    public static void setSalsabbqextraFinal(String salsabbqextraFinal) {
        Pedidos.salsabbqextraFinal = salsabbqextraFinal;
    }

    public static String getSalsabuffaloextraFinal() {
        return salsabuffaloextraFinal;
    }

    public static void setSalsabuffaloextraFinal(String salsabuffaloextraFinal) {
        Pedidos.salsabuffaloextraFinal = salsabuffaloextraFinal;
    }

    public static String getMostazaextraFinal() {
        return mostazaextraFinal;
    }

    public static void setMostazaextraFinal(String mostazaextraFinal) {
        Pedidos.mostazaextraFinal = mostazaextraFinal;
    }

    public static String getMayonesaextraFinal() {
        return mayonesaextraFinal;
    }

    public static void setMayonesaextraFinal(String mayonesaextraFinal) {
        Pedidos.mayonesaextraFinal = mayonesaextraFinal;
    }

    public static String getKetchupextraFinal() {
        return ketchupextraFinal;
    }

    public static void setKetchupextraFinal(String ketchupextraFinal) {
        Pedidos.ketchupextraFinal = ketchupextraFinal;
    }

    public static String getCarneextraAparteFinal() {
        return carneextraAparteFinal;
    }

    public static void setCarneextraAparteFinal(String carneextraAparteFinal) {
        Pedidos.carneextraAparteFinal = carneextraAparteFinal;
    }

    public static String getCarneangusextraFinal() {
        return carneangusextraFinal;
    }

    public static void setCarneangusextraFinal(String carneangusextraFinal) {
        Pedidos.carneangusextraFinal = carneangusextraFinal;
    }

    public static String getTocinoextraFinal() {
        return tocinoextraFinal;
    }

    public static void setTocinoextraFinal(String tocinoextraFinal) {
        Pedidos.tocinoextraFinal = tocinoextraFinal;
    }

    public static String getPollobbqextraFinal() {
        return pollobbqextraFinal;
    }

    public static void setPollobbqextraFinal(String pollobbqextraFinal) {
        Pedidos.pollobbqextraFinal = pollobbqextraFinal;
    }

    public static String getPechugaempaextraFinal() {
        return pechugaempaextraFinal;
    }

    public static void setPechugaempaextraFinal(String pechugaempaextraFinal) {
        Pedidos.pechugaempaextraFinal = pechugaempaextraFinal;
    }

    public static String getQuesoameextraFinal() {
        return quesoameextraFinal;
    }

    public static void setQuesoameextraFinal(String quesoameextraFinal) {
        Pedidos.quesoameextraFinal = quesoameextraFinal;
    }

    public static String getQuesosuiextraFinal() {
        return quesosuiextraFinal;
    }

    public static void setQuesosuiextraFinal(String quesosuiextraFinal) {
        Pedidos.quesosuiextraFinal = quesosuiextraFinal;
    }

    public static String getGuacamoleextraFinal() {
        return guacamoleextraFinal;
    }

    public static void setGuacamoleextraFinal(String guacamoleextraFinal) {
        Pedidos.guacamoleextraFinal = guacamoleextraFinal;
    }

    public static String getChilesantafeextraFinal() {
        return chilesantafeextraFinal;
    }

    public static void setChilesantafeextraFinal(String chilesantafeextraFinal) {
        Pedidos.chilesantafeextraFinal = chilesantafeextraFinal;
    }

    public static String getJitomateextraFinal() {
        return jitomateextraFinal;
    }

    public static void setJitomateextraFinal(String jitomateextraFinal) {
        Pedidos.jitomateextraFinal = jitomateextraFinal;
    }

    public static String getPiñaextraFinal() {
        return piñaextraFinal;
    }

    public static void setPiñaextraFinal(String piñaextraFinal) {
        Pedidos.piñaextraFinal = piñaextraFinal;
    }

    public static String getChiliextraFinal() {
        return chiliextraFinal;
    }

    public static void setChiliextraFinal(String chiliextraFinal) {
        Pedidos.chiliextraFinal = chiliextraFinal;
    }

    public static String getPapasmedFinal() {
        return papasmedFinal;
    }

    public static void setPapasmedFinal(String papasmedFinal) {
        Pedidos.papasmedFinal = papasmedFinal;
    }

    public static String getCocaoriginalFinal() {
        return cocaoriginalFinal;
    }

    public static void setCocaoriginalFinal(String cocaoriginalFinal) {
        Pedidos.cocaoriginalFinal = cocaoriginalFinal;
    }

    public static String getCocasinazucarFinal() {
        return cocasinazucarFinal;
    }

    public static void setCocasinazucarFinal(String cocasinazucarFinal) {
        Pedidos.cocasinazucarFinal = cocasinazucarFinal;
    }

    public static String getAroscebollaAparteFinal() {
        return aroscebollaAparteFinal;
    }

    public static void setAroscebollaAparteFinal(String aroscebollaAparteFinal) {
        Pedidos.aroscebollaAparteFinal = aroscebollaAparteFinal;
    }

    public static String getCielFinal() {
        return cielFinal;
    }

    public static void setCielFinal(String cielFinal) {
        Pedidos.cielFinal = cielFinal;
    }

    public static String getComentarioFinal() {
        return comentarioFinal;
    }

    public static void setComentarioFinal(String comentarioFinal) {
        Pedidos.comentarioFinal = comentarioFinal;
    }

    public static String getPanFinal() {
        return panFinal;
    }

    public static void setPanFinal(String panFinal) {
        Pedidos.panFinal = panFinal;
    }

    public static String getCarneFinal() {
        return carneFinal;
    }

    public static void setCarneFinal(String carneFinal) {
        Pedidos.carneFinal = carneFinal;
    }

    public static String getSalsaAparteFinal() {
        return salsaAparteFinal;
    }

    public static void setSalsaAparteFinal(String salsaAparteFinal) {
        Pedidos.salsaAparteFinal = salsaAparteFinal;
    }
        
        
                
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoDePanes = new javax.swing.ButtonGroup();
        GrupoDeCarnes = new javax.swing.ButtonGroup();
        LogoEmpresa = new javax.swing.JLabel();
        Bienvenida = new javax.swing.JLabel();
        armatuhamburgesatexto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pantexto = new javax.swing.JLabel();
        Boton1panAjon = new javax.swing.JRadioButton();
        Boton2panliso = new javax.swing.JRadioButton();
        Carnetexto = new javax.swing.JLabel();
        carnederes = new javax.swing.JRadioButton();
        carnevegana = new javax.swing.JRadioButton();
        perzonalizatext = new javax.swing.JLabel();
        nocebolla = new javax.swing.JCheckBox();
        nojitomate = new javax.swing.JCheckBox();
        nolechuga = new javax.swing.JCheckBox();
        noqueso = new javax.swing.JCheckBox();
        nomayonesa = new javax.swing.JCheckBox();
        nopepinillos = new javax.swing.JCheckBox();
        nosalsa = new javax.swing.JCheckBox();
        salsatext = new javax.swing.JLabel();
        aderezotext = new javax.swing.JLabel();
        sinoSalsa = new javax.swing.JComboBox<>();
        salsaportobello = new javax.swing.JCheckBox();
        salsadequeso = new javax.swing.JCheckBox();
        mostazadulce = new javax.swing.JCheckBox();
        pepinillos = new javax.swing.JCheckBox();
        jalapeños = new javax.swing.JCheckBox();
        salsaranch = new javax.swing.JCheckBox();
        salsabbq = new javax.swing.JCheckBox();
        salsabuffalo = new javax.swing.JCheckBox();
        mostaza = new javax.swing.JCheckBox();
        mayonesa = new javax.swing.JCheckBox();
        ketchup = new javax.swing.JCheckBox();
        extraportobellotext = new javax.swing.JLabel();
        extraquesotext = new javax.swing.JLabel();
        extramostazadulcetext = new javax.swing.JLabel();
        extrapepinillostext = new javax.swing.JLabel();
        extrajalapeñostext = new javax.swing.JLabel();
        extraranchtext = new javax.swing.JLabel();
        extrabbqtext = new javax.swing.JLabel();
        extrabuffalotext = new javax.swing.JLabel();
        extramostazatext = new javax.swing.JLabel();
        extramayonesatext = new javax.swing.JLabel();
        extracatsuptext = new javax.swing.JLabel();
        extratext = new javax.swing.JLabel();
        extracarne = new javax.swing.JCheckBox();
        extraangus = new javax.swing.JCheckBox();
        extratocino = new javax.swing.JCheckBox();
        extrapollobbq = new javax.swing.JCheckBox();
        extrapechuga = new javax.swing.JCheckBox();
        extraquesoame = new javax.swing.JCheckBox();
        extraquesosui = new javax.swing.JCheckBox();
        extraguacamole = new javax.swing.JCheckBox();
        extrachilesantafe = new javax.swing.JCheckBox();
        extrajitomate = new javax.swing.JCheckBox();
        extrapiña = new javax.swing.JCheckBox();
        extrachili = new javax.swing.JCheckBox();
        extracarnetext = new javax.swing.JLabel();
        extraangustext = new javax.swing.JLabel();
        extratocinotext = new javax.swing.JLabel();
        extrapollobbqtext = new javax.swing.JLabel();
        extrapechugatext = new javax.swing.JLabel();
        extraquesoametext = new javax.swing.JLabel();
        extraquesosuitext = new javax.swing.JLabel();
        extraguacamoletext = new javax.swing.JLabel();
        extrachilesantafetext = new javax.swing.JLabel();
        extrajitomatetext = new javax.swing.JLabel();
        extrapiñatext = new javax.swing.JLabel();
        extrachilitext = new javax.swing.JLabel();
        Acompanamientotext = new javax.swing.JLabel();
        papascheck = new javax.swing.JCheckBox();
        aroscheck = new javax.swing.JCheckBox();
        cocanoazucarcheck = new javax.swing.JCheckBox();
        cocaoriginalcheck = new javax.swing.JCheckBox();
        cielcheck = new javax.swing.JCheckBox();
        hamburguesalogo = new javax.swing.JLabel();
        ComentariosCasilla = new javax.swing.JTextField();
        comentariostext = new javax.swing.JLabel();
        BotonDeEnviar = new javax.swing.JButton();
        logoHamburguesaAzul = new javax.swing.JLabel();
        TotalDelPedido = new javax.swing.JLabel();
        preciocieltext = new javax.swing.JLabel();
        precioarostext = new javax.swing.JLabel();
        preciopapasmediatext = new javax.swing.JLabel();
        preciococanoazucartext = new javax.swing.JLabel();
        preciococaorgtext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arma tu Carls");

        LogoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/fotos/OkOMoafq_400x400.png"))); // NOI18N

        Bienvenida.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 48)); // NOI18N
        Bienvenida.setText("BIENVENIDO AL MENU");

        armatuhamburgesatexto.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        armatuhamburgesatexto.setText("Arma tu Hamburguesa");

        pantexto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pantexto.setText("Tipo de Pan:");

        GrupoDePanes.add(Boton1panAjon);
        Boton1panAjon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton1panAjon.setText("Ajonjoli");
        Boton1panAjon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1panAjonActionPerformed(evt);
            }
        });

        GrupoDePanes.add(Boton2panliso);
        Boton2panliso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton2panliso.setText("Pan liso de Mantequilla");
        Boton2panliso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2panlisoActionPerformed(evt);
            }
        });

        Carnetexto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Carnetexto.setText("Tipo de Carne:");
        Carnetexto.setAlignmentY(0.4F);

        GrupoDeCarnes.add(carnederes);
        carnederes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        carnederes.setText("Carne 100% de Res");
        carnederes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carnederesActionPerformed(evt);
            }
        });

        GrupoDeCarnes.add(carnevegana);
        carnevegana.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        carnevegana.setText("Carne Vegana");
        carnevegana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carneveganaActionPerformed(evt);
            }
        });

        perzonalizatext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        perzonalizatext.setText("Personaliza tu Hamburguesa:");

        nocebolla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nocebolla.setText("Sin cebolla");
        nocebolla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nocebollaActionPerformed(evt);
            }
        });

        nojitomate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nojitomate.setText("Sin Jitomate");
        nojitomate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nojitomateActionPerformed(evt);
            }
        });

        nolechuga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nolechuga.setText("Sin Lechuga");
        nolechuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolechugaActionPerformed(evt);
            }
        });

        noqueso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noqueso.setText("Sin Queso Americano");
        noqueso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noquesoActionPerformed(evt);
            }
        });

        nomayonesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomayonesa.setText("Sin Mayonesa");
        nomayonesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomayonesaActionPerformed(evt);
            }
        });

        nopepinillos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nopepinillos.setText("Sin pepinillos");
        nopepinillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nopepinillosActionPerformed(evt);
            }
        });

        nosalsa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nosalsa.setText("Sin salsa especial");
        nosalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nosalsaActionPerformed(evt);
            }
        });

        salsatext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salsatext.setText("¿Deseas tu Salsa Aparte?:");

        aderezotext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        aderezotext.setText("¿Alguna Salsa Extra?");

        sinoSalsa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sinoSalsa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));
        sinoSalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinoSalsaActionPerformed(evt);
            }
        });

        salsaportobello.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salsaportobello.setText("Salsa Portobello");
        salsaportobello.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salsaportobelloActionPerformed(evt);
            }
        });

        salsadequeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salsadequeso.setText("Salsa de Queso");
        salsadequeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salsadequesoActionPerformed(evt);
            }
        });

        mostazadulce.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mostazadulce.setText("Mostaza Dulce");
        mostazadulce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostazadulceActionPerformed(evt);
            }
        });

        pepinillos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pepinillos.setText("Pepinillos");
        pepinillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepinillosActionPerformed(evt);
            }
        });

        jalapeños.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jalapeños.setText("Jalapeños");
        jalapeños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jalapeñosActionPerformed(evt);
            }
        });

        salsaranch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salsaranch.setText("Salsa Ranch");
        salsaranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salsaranchActionPerformed(evt);
            }
        });

        salsabbq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salsabbq.setText("Salsa BBQ");
        salsabbq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salsabbqActionPerformed(evt);
            }
        });

        salsabuffalo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salsabuffalo.setText("Salsa Buffalo");
        salsabuffalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salsabuffaloActionPerformed(evt);
            }
        });

        mostaza.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mostaza.setText("Mostaza");
        mostaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostazaActionPerformed(evt);
            }
        });

        mayonesa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mayonesa.setText("Mayonesa");
        mayonesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayonesaActionPerformed(evt);
            }
        });

        ketchup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ketchup.setText("Ketchup");
        ketchup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketchupActionPerformed(evt);
            }
        });

        extraportobellotext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extraportobellotext.setText("(+ $28.00)");

        extraquesotext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extraquesotext.setText("(+ $18.00)");

        extramostazadulcetext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extramostazadulcetext.setText("(+ $7.00)");

        extrapepinillostext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrapepinillostext.setText("(+ $7.00)");

        extrajalapeñostext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrajalapeñostext.setText("(+ $7.00)");

        extraranchtext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extraranchtext.setText("(+ $7.00)");

        extrabbqtext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrabbqtext.setText("(+ $7.00)");

        extrabuffalotext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrabuffalotext.setText("(+ $7.00)");

        extramostazatext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extramostazatext.setText("(+ $2.00)");

        extramayonesatext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extramayonesatext.setText("(+ $2.00)");

        extracatsuptext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extracatsuptext.setText("(+ $2.00)");

        extratext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        extratext.setText("¿Deseas algun Extra?");

        extracarne.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extracarne.setText("Carne Extra");
        extracarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extracarneActionPerformed(evt);
            }
        });

        extraangus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extraangus.setText("Carne Angus Extra");
        extraangus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraangusActionPerformed(evt);
            }
        });

        extratocino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extratocino.setText("Tocino");
        extratocino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extratocinoActionPerformed(evt);
            }
        });

        extrapollobbq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrapollobbq.setText("Pollo BBQ");
        extrapollobbq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrapollobbqActionPerformed(evt);
            }
        });

        extrapechuga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrapechuga.setText("Pechuga Empanizada");
        extrapechuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrapechugaActionPerformed(evt);
            }
        });

        extraquesoame.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extraquesoame.setText("Queso Americano");
        extraquesoame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraquesoameActionPerformed(evt);
            }
        });

        extraquesosui.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extraquesosui.setText("Queso Suizo");
        extraquesosui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraquesosuiActionPerformed(evt);
            }
        });

        extraguacamole.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extraguacamole.setText("Guacamole");
        extraguacamole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraguacamoleActionPerformed(evt);
            }
        });

        extrachilesantafe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrachilesantafe.setText("Chile Santa Fe");
        extrachilesantafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrachilesantafeActionPerformed(evt);
            }
        });

        extrajitomate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrajitomate.setText("Jitomate");
        extrajitomate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrajitomateActionPerformed(evt);
            }
        });

        extrapiña.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrapiña.setText("Piña");
        extrapiña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrapiñaActionPerformed(evt);
            }
        });

        extrachili.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrachili.setText("Chili");
        extrachili.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrachiliActionPerformed(evt);
            }
        });

        extracarnetext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extracarnetext.setText("(+ $40.00)");

        extraangustext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extraangustext.setText("(+ $63.00)");

        extratocinotext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extratocinotext.setText("(+ $22.00)");

        extrapollobbqtext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrapollobbqtext.setText("(+ $50.00)");

        extrapechugatext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrapechugatext.setText("(+ $50.00)");

        extraquesoametext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extraquesoametext.setText("(+ $14.00)");

        extraquesosuitext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extraquesosuitext.setText("(+ $14.00)");

        extraguacamoletext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extraguacamoletext.setText("(+ $18.00)");

        extrachilesantafetext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrachilesantafetext.setText("(+ $12.00)");

        extrajitomatetext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrajitomatetext.setText("(+ $3.00)");

        extrapiñatext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrapiñatext.setText("(+ $16.00)");

        extrachilitext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        extrachilitext.setText("(+ $37.00)");

        Acompanamientotext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Acompanamientotext.setText("¿Desea Algun Acompañamiento?");

        papascheck.setText("Papas a la francesa Medianas");
        papascheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papascheckActionPerformed(evt);
            }
        });

        aroscheck.setText("Aros de Cebolla");
        aroscheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aroscheckActionPerformed(evt);
            }
        });

        cocanoazucarcheck.setText("Coca-Cola Sin Azucar 600 ml");
        cocanoazucarcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocanoazucarcheckActionPerformed(evt);
            }
        });

        cocaoriginalcheck.setText("Coca-Cola Original 600 ml");
        cocaoriginalcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocaoriginalcheckActionPerformed(evt);
            }
        });

        cielcheck.setText("Ciel Natural 600 ml");
        cielcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cielcheckActionPerformed(evt);
            }
        });

        hamburguesalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/fotos/ezgif.com-gif-maker (5).png"))); // NOI18N
        hamburguesalogo.setMaximumSize(new java.awt.Dimension(550, 550));
        hamburguesalogo.setMinimumSize(new java.awt.Dimension(550, 550));

        ComentariosCasilla.setToolTipText("");
        ComentariosCasilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ComentariosCasillaKeyTyped(evt);
            }
        });

        comentariostext.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 30)); // NOI18N
        comentariostext.setText("Comentarios Adicionales de su pedido:");

        BotonDeEnviar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonDeEnviar.setText("Enviar");
        BotonDeEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDeEnviarActionPerformed(evt);
            }
        });

        logoHamburguesaAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/fotos/ezgif.com-gif-maker (5)azul.png"))); // NOI18N

        TotalDelPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TotalDelPedido.setToolTipText("");

        preciocieltext.setText("(+ $28.00)");

        precioarostext.setText("(+ $58.00)");

        preciopapasmediatext.setText("(+ $51.00)");

        preciococanoazucartext.setText("(+ $44.00)");

        preciococaorgtext.setText("(+ $44.00)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TotalDelPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonDeEnviar)
                        .addGap(387, 387, 387))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogoEmpresa)
                            .addComponent(hamburguesalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoHamburguesaAzul))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(158, 158, 158)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nocebolla)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(nojitomate)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(nolechuga)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(noqueso)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(nomayonesa))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(198, 198, 198)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(cocanoazucarcheck)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cielcheck)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(preciocieltext))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(salsaportobello)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(extraportobellotext))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(salsadequeso)
                                                                    .addComponent(mostazadulce)
                                                                    .addComponent(pepinillos)
                                                                    .addComponent(jalapeños)
                                                                    .addComponent(salsaranch)
                                                                    .addComponent(salsabbq)
                                                                    .addComponent(salsabuffalo)
                                                                    .addComponent(mostaza)
                                                                    .addComponent(mayonesa)
                                                                    .addComponent(ketchup))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(extrajalapeñostext)
                                                                    .addComponent(extrapepinillostext)
                                                                    .addComponent(extramostazadulcetext)
                                                                    .addComponent(extraquesotext)
                                                                    .addComponent(extraranchtext)
                                                                    .addComponent(extrabbqtext)
                                                                    .addComponent(extrabuffalotext)
                                                                    .addComponent(extramostazatext)
                                                                    .addComponent(extramayonesatext)
                                                                    .addComponent(extracatsuptext)))
                                                            .addComponent(Acompanamientotext)
                                                            .addComponent(aderezotext)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(papascheck)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(preciopapasmediatext)
                                                                    .addComponent(preciococanoazucartext))
                                                                .addGap(37, 37, 37)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(aroscheck)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(precioarostext))
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(cocaoriginalcheck)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(preciococaorgtext))))))))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGap(39, 39, 39)
                                                    .addComponent(Bienvenida)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(pantexto)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(Boton1panAjon)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(Boton2panliso))
                                                    .addComponent(perzonalizatext))
                                                .addGap(70, 70, 70)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(carnederes)
                                                    .addComponent(Carnetexto))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(carnevegana))
                                            .addComponent(salsatext)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(extrapechuga)
                                                    .addComponent(extraquesosui)
                                                    .addComponent(extraguacamole)
                                                    .addComponent(extrachilesantafe)
                                                    .addComponent(extrajitomate)
                                                    .addComponent(extrapiña)
                                                    .addComponent(extrachili)
                                                    .addComponent(extraquesoame))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(extrachilitext)
                                                    .addComponent(extrapiñatext)
                                                    .addComponent(extrajitomatetext)
                                                    .addComponent(extrachilesantafetext)
                                                    .addComponent(extraguacamoletext)
                                                    .addComponent(extraquesosuitext)
                                                    .addComponent(extraquesoametext)
                                                    .addComponent(extrapechugatext)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(extraangus)
                                                    .addComponent(extratocino)
                                                    .addComponent(extrapollobbq)
                                                    .addComponent(extracarne))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(extracarnetext)
                                                    .addComponent(extrapollobbqtext)
                                                    .addComponent(extratocinotext)
                                                    .addComponent(extraangustext)))
                                            .addComponent(extratext)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(sinoSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(ComentariosCasilla)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(258, 258, 258)
                                        .addComponent(armatuhamburgesatexto))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(301, 301, 301)
                                        .addComponent(nopepinillos)
                                        .addGap(76, 76, 76)
                                        .addComponent(nosalsa)))
                                .addGap(50, 50, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comentariostext)
                                .addGap(178, 178, 178))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carnevegana)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bienvenida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(armatuhamburgesatexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(pantexto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Boton2panliso)
                                            .addComponent(Boton1panAjon)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Carnetexto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(carnederes)))))
                        .addGap(27, 27, 27)
                        .addComponent(perzonalizatext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nocebolla)
                            .addComponent(nojitomate)
                            .addComponent(nolechuga)
                            .addComponent(noqueso)
                            .addComponent(nomayonesa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nopepinillos)
                            .addComponent(nosalsa)))
                    .addComponent(LogoEmpresa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aderezotext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salsaportobello)
                            .addComponent(extraportobellotext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salsadequeso)
                            .addComponent(extraquesotext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mostazadulce)
                            .addComponent(extramostazadulcetext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pepinillos)
                            .addComponent(extrapepinillostext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jalapeños)
                            .addComponent(extrajalapeñostext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salsaranch)
                            .addComponent(extraranchtext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salsabbq)
                            .addComponent(extrabbqtext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salsabuffalo)
                            .addComponent(extrabuffalotext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mostaza)
                            .addComponent(extramostazatext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mayonesa)
                            .addComponent(extramayonesatext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ketchup)
                            .addComponent(extracatsuptext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Acompanamientotext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(papascheck)
                            .addComponent(preciopapasmediatext)
                            .addComponent(cocaoriginalcheck)
                            .addComponent(preciococaorgtext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cocanoazucarcheck)
                            .addComponent(preciococanoazucartext)
                            .addComponent(aroscheck)
                            .addComponent(precioarostext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cielcheck)
                            .addComponent(preciocieltext)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salsatext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sinoSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(extratext)
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(extracarne)
                                            .addComponent(extracarnetext))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(extraangus)
                                            .addComponent(extraangustext))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(extratocino)
                                            .addComponent(extratocinotext))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(extrapollobbq)
                                            .addComponent(extrapollobbqtext))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(extrapechuga)
                                            .addComponent(extrapechugatext))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(extraquesoame)
                                            .addComponent(extraquesoametext))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(extraquesosui)
                                            .addComponent(extraquesosuitext)))
                                    .addComponent(hamburguesalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(extraguacamole)
                                    .addComponent(extraguacamoletext))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(extrachilesantafe)
                                    .addComponent(extrachilesantafetext))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(extrajitomate)
                                    .addComponent(extrajitomatetext))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(extrapiña)
                                            .addComponent(extrapiñatext))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(extrachili)
                                            .addComponent(extrachilitext))
                                        .addGap(28, 28, 28)
                                        .addComponent(comentariostext)
                                        .addGap(18, 18, 18)
                                        .addComponent(ComentariosCasilla, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(logoHamburguesaAzul))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalDelPedido)
                    .addComponent(BotonDeEnviar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        cocaoriginalcheck.getAccessibleContext().setAccessibleName("Coca-Cola Sin Azucar 600 ml");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cielcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cielcheckActionPerformed

        System.out.println("Elegiste Ciel Natural 600ml");
        if (cielcheck.isSelected() ) {
            CantidadDePedido=CantidadDePedido+28;
            setCielFinal("Ciel Natural 600 ml");
        } else {
            CantidadDePedido=CantidadDePedido-28;
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));
            
    }//GEN-LAST:event_cielcheckActionPerformed

    private void cocaoriginalcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocaoriginalcheckActionPerformed

        System.out.println("Elegiste Coca-Cola Original 600ml");
        if (cocaoriginalcheck.isSelected() ) {
            CantidadDePedido=CantidadDePedido+44;
            setCocaoriginalFinal("Coca-Cola Original 600ml");
        } else {
            CantidadDePedido=CantidadDePedido-44;
            setCocaoriginalFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_cocaoriginalcheckActionPerformed

    private void Boton1panAjonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1panAjonActionPerformed
       
        System.out.println("Presionaste Pan de Ajonjoli");
        panFinal=Arrays.toString(Boton1panAjon.getSelectedObjects());
        if (Boton1panAjon.isSelected() ) {
            CantidadDePedido=CantidadDePedido+0;
            setPanFinal("Con Pan de Ajonjoli");
        } else {
            CantidadDePedido=CantidadDePedido-0;
            setPanFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));
        
    }//GEN-LAST:event_Boton1panAjonActionPerformed

    private void Boton2panlisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2panlisoActionPerformed

        System.out.println("Presionaste Pan liso de Mantequilla");
        panFinal=Arrays.toString(Boton2panliso.getSelectedObjects());
         if (Boton2panliso.isSelected() ) {
            CantidadDePedido=CantidadDePedido+0;
            setPanFinal("Con Pan liso de Mantequilla");
        } else {
            CantidadDePedido=CantidadDePedido-0;
            setPanFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));
        
    }//GEN-LAST:event_Boton2panlisoActionPerformed

    private void carnederesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carnederesActionPerformed
       
        System.out.println("Presionaste Carne 100% de Res");
        carneFinal=Arrays.toString(carnederes.getSelectedObjects());
         if (carnederes.isSelected() ) {
            CantidadDePedido=CantidadDePedido+0;
            setCarneFinal("Con Carne 100% de Res");
        } else {
            CantidadDePedido=CantidadDePedido-0;
            setCarneFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));
        
    }//GEN-LAST:event_carnederesActionPerformed

    private void carneveganaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carneveganaActionPerformed
        
        System.out.println("Presionaste Carne Vegana");
        carneFinal=Arrays.toString(carnevegana.getSelectedObjects());
         if (carnevegana.isSelected() ) {
            CantidadDePedido=CantidadDePedido+0;
            setCarneFinal("Con Carne Vegana");
        } else {
            CantidadDePedido=CantidadDePedido-0;
            setCarneFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));
        
    }//GEN-LAST:event_carneveganaActionPerformed

    private void nocebollaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nocebollaActionPerformed
     
        System.out.println("Presionaste Sin Cebolla");
        if(nocebolla.isSelected()){
            setNocebollaFinal("Sin cebolla");
        }else{
            setNocebollaFinal("");
        }
        
    }//GEN-LAST:event_nocebollaActionPerformed

    private void nojitomateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nojitomateActionPerformed

        System.out.println("Presionaste Sin Jitomate");
        if(nojitomate.isSelected()){
            setNojitomateFinal("Sin jitomate");
        }else{
            setNojitomateFinal("");
        }
    }//GEN-LAST:event_nojitomateActionPerformed

    private void nolechugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolechugaActionPerformed

        System.out.println("Presionaste Sin Lechuga");
                if(nolechuga.isSelected()){
            setNolechugaFinal("Sin lechuga");
        }else{
            setNolechugaFinal("");
        }
    }//GEN-LAST:event_nolechugaActionPerformed

    private void noquesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noquesoActionPerformed

        System.out.println("Presionaste Sin Queso Americano");
                if(noqueso.isSelected()){
            setNoquesoameAparteFinal("Sin Queso Americano");
        }else{
            setNoquesoameAparteFinal("");
        }

    }//GEN-LAST:event_noquesoActionPerformed

    private void nomayonesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomayonesaActionPerformed

        System.out.println("Presionaste Sin Mayonesa");
                if(nomayonesa.isSelected()){
            setNomayonesaFinal("Sin mayonesa");
        }else{
            setNomayonesaFinal("");
        }
    }//GEN-LAST:event_nomayonesaActionPerformed

    private void nopepinillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nopepinillosActionPerformed

        System.out.println("Presionaste Sin Pepinillos");
                if(nopepinillos.isSelected()){
            setNopepinillosFinal("Sin pepinillos");
        }else{
            setNopepinillosFinal("");
        }

    }//GEN-LAST:event_nopepinillosActionPerformed

    private void nosalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nosalsaActionPerformed

        System.out.println("Presionaste Sin Salsa");
                if(nosalsa.isSelected()){
            setNosalsaespecialFinal("Sin salsa especial");
        }else{
            setNosalsaespecialFinal("");
        }

    }//GEN-LAST:event_nosalsaActionPerformed

    private void sinoSalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinoSalsaActionPerformed

        System.out.println("Elegiste una opcion de Salsa Aparte");
        salsaAparteFinal=sinoSalsa.getSelectedItem().toString();

    }//GEN-LAST:event_sinoSalsaActionPerformed

    private void salsaportobelloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salsaportobelloActionPerformed
        
        System.out.println("Elegiste Salsa Portobello");
        if (salsaportobello.isSelected() ) {
            CantidadDePedido=CantidadDePedido+28;
            setSalsaportobelloextraFinal("Salsa Portobello Extra");
        } else {
            CantidadDePedido=CantidadDePedido-28;
            setSalsaportobelloextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));
        
    }//GEN-LAST:event_salsaportobelloActionPerformed

    private void salsadequesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salsadequesoActionPerformed

        System.out.println("Elegiste Salsa de Queso");
        if (salsadequeso.isSelected() ) {
            CantidadDePedido=CantidadDePedido+18;
            setSalsadequesoextraFinal("Salsa de Queso Extra");
        } else {
            CantidadDePedido=CantidadDePedido-18;
            setSalsadequesoextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));
        
    }//GEN-LAST:event_salsadequesoActionPerformed

    private void mostazadulceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostazadulceActionPerformed

        System.out.println("Elegiste Mostaza Dulce");
        if (mostazadulce.isSelected() ) {
            CantidadDePedido=CantidadDePedido+7;
            setMostazadulceextraFinal("Mostaza Dulce Extra");
        } else {
            CantidadDePedido=CantidadDePedido-7;
            setMostazadulceextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_mostazadulceActionPerformed

    private void pepinillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepinillosActionPerformed

        System.out.println("Elegiste Pepinillos");
        if (pepinillos.isSelected() ) {
            CantidadDePedido=CantidadDePedido+7;
            setPepinillosextraFinal("Pepinillos Extra");
        } else {
            CantidadDePedido=CantidadDePedido-7;
            setPepinillosextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_pepinillosActionPerformed

    private void jalapeñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jalapeñosActionPerformed

        System.out.println("Elegiste Jalapeños");
        if (jalapeños.isSelected() ) {
            CantidadDePedido=CantidadDePedido+7;
            setJalapeñosextraFinal("Jalapeños Extra");
        } else {
            CantidadDePedido=CantidadDePedido-7;
            setJalapeñosextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_jalapeñosActionPerformed

    private void salsaranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salsaranchActionPerformed

        System.out.println("Elegiste Salsa Ranch");
        if (salsaranch.isSelected() ) {
            CantidadDePedido=CantidadDePedido+7;
            setSalsaranchextraFinal("Salsa Ranch Extra");
        } else {
            CantidadDePedido=CantidadDePedido-7;
            setSalsaranchextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_salsaranchActionPerformed

    private void salsabbqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salsabbqActionPerformed

        System.out.println("Elegiste Salsa BBQ");
        if (salsabbq.isSelected() ) {
            CantidadDePedido=CantidadDePedido+7;
            setSalsabbqextraFinal("Salsa BBQ Extra");
        } else {
            CantidadDePedido=CantidadDePedido-7;
            setSalsaranchextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_salsabbqActionPerformed

    private void salsabuffaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salsabuffaloActionPerformed

        System.out.println("Elegiste Salsa Buffalo");
        if (salsabuffalo.isSelected() ) {
            CantidadDePedido=CantidadDePedido+7;
            setSalsabuffaloextraFinal("Salsa Buffalo Extra");
        } else {
            CantidadDePedido=CantidadDePedido-7;
            setSalsabuffaloextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_salsabuffaloActionPerformed

    private void mostazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostazaActionPerformed

        System.out.println("Elegiste Mostaza");
        if (mostaza.isSelected() ) {
            CantidadDePedido=CantidadDePedido+2;
            setMostazaextraFinal("Mostaza Extra");
        } else {
            CantidadDePedido=CantidadDePedido-2;
            setMostazaextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_mostazaActionPerformed

    private void mayonesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayonesaActionPerformed

        System.out.println("Elegiste Mayonesa");
        if (mayonesa.isSelected() ) {
            CantidadDePedido=CantidadDePedido+2;
            setMayonesaextraFinal("Mayonesa Extra");
        } else {
            CantidadDePedido=CantidadDePedido-2;
            setMayonesaextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_mayonesaActionPerformed

    private void ketchupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketchupActionPerformed

        System.out.println("Elegiste Ketchup");
        if (ketchup.isSelected() ) {
            CantidadDePedido=CantidadDePedido+2;
            setKetchupextraFinal("Ketchup Extra");
        } else {
            CantidadDePedido=CantidadDePedido-2;
            setKetchupextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_ketchupActionPerformed

    private void papascheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papascheckActionPerformed

        System.out.println("Elegiste Papas a la Francesa Medianas");
        if (papascheck.isSelected() ) {
            CantidadDePedido=CantidadDePedido+51;
            setPapasmedFinal("Papas a la Francesa Medianas");
        } else {
            CantidadDePedido=CantidadDePedido-51;
            setPapasmedFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_papascheckActionPerformed

    private void aroscheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aroscheckActionPerformed

        System.out.println("Elegiste Aros de Cebolla");
        if (aroscheck.isSelected() ) {
            CantidadDePedido=CantidadDePedido+58;
            setAroscebollaAparteFinal("Aros de Cebolla");
        } else {
            CantidadDePedido=CantidadDePedido-58;
            setAroscebollaAparteFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_aroscheckActionPerformed

    private void cocanoazucarcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocanoazucarcheckActionPerformed

        System.out.println("Elegiste Coca-Cola Sin Azucar 600ml");
        if (cocanoazucarcheck.isSelected() ) {
            CantidadDePedido=CantidadDePedido+44;
            setCocasinazucarFinal("Coca-Cola Sin Azucar 600ml");
        } else {
            CantidadDePedido=CantidadDePedido-44;
            setCocasinazucarFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_cocanoazucarcheckActionPerformed

    private void extracarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extracarneActionPerformed

        System.out.println("Elegiste Carne Extra");
        if (extracarne.isSelected() ) {
            CantidadDePedido=CantidadDePedido+40;
            setCarneextraAparteFinal("Carne Extra");
        } else {
            CantidadDePedido=CantidadDePedido-40;
            setCarneextraAparteFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_extracarneActionPerformed

    private void extraangusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraangusActionPerformed

        System.out.println("Elegiste Carne Angus Extra");
        if (extraangus.isSelected() ) {
            CantidadDePedido=CantidadDePedido+63;
            setCarneangusextraFinal("Carne Angus Extra");
        } else {
            CantidadDePedido=CantidadDePedido-63;
            setCarneangusextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_extraangusActionPerformed

    private void extratocinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extratocinoActionPerformed

        System.out.println("Elegiste Tocino Extra");
        if (extratocino.isSelected() ) {
            CantidadDePedido=CantidadDePedido+22;
            setTocinoextraFinal("Tocino Extra");
        } else {
            CantidadDePedido=CantidadDePedido-22;
            setTocinoextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_extratocinoActionPerformed

    private void extrapollobbqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrapollobbqActionPerformed

        System.out.println("Elegiste Pollo BBQ Extra");
        if (extrapollobbq.isSelected() ) {
            CantidadDePedido=CantidadDePedido+50;
            setPollobbqextraFinal("Pollo BBQ Extra");
        } else {
            CantidadDePedido=CantidadDePedido-50;
            setPollobbqextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_extrapollobbqActionPerformed

    private void extrapechugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrapechugaActionPerformed

        System.out.println("Elegiste Pechuga Empanizada Extra");
        if (extrapechuga.isSelected() ) {
            CantidadDePedido=CantidadDePedido+50;
            setPechugaempaextraFinal("Pechuga Empanizada Extra");
        } else {
            CantidadDePedido=CantidadDePedido-50;
            setPechugaempaextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_extrapechugaActionPerformed

    private void extraquesoameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraquesoameActionPerformed

        System.out.println("Elegiste Queso Americano Extra");
        if (extraquesoame.isSelected() ) {
            CantidadDePedido=CantidadDePedido+14;
            setQuesoameextraFinal("Queso Americano Extra");
        } else {
            CantidadDePedido=CantidadDePedido-14;
            setQuesoameextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_extraquesoameActionPerformed

    private void extraquesosuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraquesosuiActionPerformed

        System.out.println("Elegiste Queso Suizo Extra");
        if (extraquesosui.isSelected() ) {
            CantidadDePedido=CantidadDePedido+14;
            setQuesosuiextraFinal("Queso Suizo Extra");
        } else {
            CantidadDePedido=CantidadDePedido-14;
            setQuesosuiextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_extraquesosuiActionPerformed

    private void extraguacamoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraguacamoleActionPerformed

        System.out.println("Elegiste Guacamole Extra");
        if (extraguacamole.isSelected() ) {
            CantidadDePedido=CantidadDePedido+18;
            setGuacamoleextraFinal("Guacamole Extra");
        } else {
            CantidadDePedido=CantidadDePedido-18;
            setGuacamoleextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_extraguacamoleActionPerformed

    private void extrachilesantafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrachilesantafeActionPerformed

        System.out.println("Elegiste Chile Santa Fe Extra");
        if (extrachilesantafe.isSelected() ) {
            CantidadDePedido=CantidadDePedido+12;
            setChilesantafeextraFinal("Chile Santa Fe Extra");
        } else {
            CantidadDePedido=CantidadDePedido-12;
            setChilesantafeextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_extrachilesantafeActionPerformed

    private void extrajitomateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrajitomateActionPerformed

        System.out.println("Elegiste Jitomate Extra");
        if (extrajitomate.isSelected() ) {
            CantidadDePedido=CantidadDePedido+3;
            setJitomateextraFinal("Jitomate Extra");
        } else {
            CantidadDePedido=CantidadDePedido-3;
            setJitomateextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_extrajitomateActionPerformed

    private void extrapiñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrapiñaActionPerformed

        System.out.println("Elegiste Piña Extra");
        if (extrapiña.isSelected() ) {
            CantidadDePedido=CantidadDePedido+16;
            setPiñaextraFinal("Piña Extra");
        } else {
            CantidadDePedido=CantidadDePedido-16;
            setPiñaextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_extrapiñaActionPerformed

    private void extrachiliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrachiliActionPerformed

        System.out.println("Elegiste Chili Extra");
        if (extrachili.isSelected() ) {
            CantidadDePedido=CantidadDePedido+37;
            setChiliextraFinal("Chili Extra");
        } else {
            CantidadDePedido=CantidadDePedido-37;
            setChiliextraFinal("");
        }
            TotalDelPedido.setText("Su pedido es de: $"+String.valueOf(CantidadDePedido));

    }//GEN-LAST:event_extrachiliActionPerformed

    private void BotonDeEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDeEnviarActionPerformed

        System.out.println("Presionaste Enviar");
        comentarioFinal=ComentariosCasilla.getText();
        PantallaFinal pfr = new PantallaFinal();
        pfr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonDeEnviarActionPerformed

    private void ComentariosCasillaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ComentariosCasillaKeyTyped

        System.out.println("Introduciendo datos en Comentarios");
        
    }//GEN-LAST:event_ComentariosCasillaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acompanamientotext;
    private javax.swing.JLabel Bienvenida;
    public javax.swing.JRadioButton Boton1panAjon;
    private javax.swing.JRadioButton Boton2panliso;
    private javax.swing.JButton BotonDeEnviar;
    private javax.swing.JLabel Carnetexto;
    public javax.swing.JTextField ComentariosCasilla;
    private javax.swing.ButtonGroup GrupoDeCarnes;
    public javax.swing.ButtonGroup GrupoDePanes;
    private javax.swing.JLabel LogoEmpresa;
    private javax.swing.JLabel TotalDelPedido;
    private javax.swing.JLabel aderezotext;
    private javax.swing.JLabel armatuhamburgesatexto;
    private javax.swing.JCheckBox aroscheck;
    private javax.swing.JRadioButton carnederes;
    private javax.swing.JRadioButton carnevegana;
    private javax.swing.JCheckBox cielcheck;
    private javax.swing.JCheckBox cocanoazucarcheck;
    private javax.swing.JCheckBox cocaoriginalcheck;
    private javax.swing.JLabel comentariostext;
    private javax.swing.JCheckBox extraangus;
    private javax.swing.JLabel extraangustext;
    private javax.swing.JLabel extrabbqtext;
    private javax.swing.JLabel extrabuffalotext;
    private javax.swing.JCheckBox extracarne;
    private javax.swing.JLabel extracarnetext;
    private javax.swing.JLabel extracatsuptext;
    private javax.swing.JCheckBox extrachilesantafe;
    private javax.swing.JLabel extrachilesantafetext;
    private javax.swing.JCheckBox extrachili;
    private javax.swing.JLabel extrachilitext;
    private javax.swing.JCheckBox extraguacamole;
    private javax.swing.JLabel extraguacamoletext;
    private javax.swing.JLabel extrajalapeñostext;
    private javax.swing.JCheckBox extrajitomate;
    private javax.swing.JLabel extrajitomatetext;
    private javax.swing.JLabel extramayonesatext;
    private javax.swing.JLabel extramostazadulcetext;
    private javax.swing.JLabel extramostazatext;
    private javax.swing.JCheckBox extrapechuga;
    private javax.swing.JLabel extrapechugatext;
    private javax.swing.JLabel extrapepinillostext;
    private javax.swing.JCheckBox extrapiña;
    private javax.swing.JLabel extrapiñatext;
    private javax.swing.JCheckBox extrapollobbq;
    private javax.swing.JLabel extrapollobbqtext;
    private javax.swing.JLabel extraportobellotext;
    private javax.swing.JCheckBox extraquesoame;
    private javax.swing.JLabel extraquesoametext;
    private javax.swing.JCheckBox extraquesosui;
    private javax.swing.JLabel extraquesosuitext;
    private javax.swing.JLabel extraquesotext;
    private javax.swing.JLabel extraranchtext;
    private javax.swing.JLabel extratext;
    private javax.swing.JCheckBox extratocino;
    private javax.swing.JLabel extratocinotext;
    private javax.swing.JLabel hamburguesalogo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox jalapeños;
    private javax.swing.JCheckBox ketchup;
    private javax.swing.JLabel logoHamburguesaAzul;
    private javax.swing.JCheckBox mayonesa;
    private javax.swing.JCheckBox mostaza;
    private javax.swing.JCheckBox mostazadulce;
    private javax.swing.JCheckBox nocebolla;
    private javax.swing.JCheckBox nojitomate;
    private javax.swing.JCheckBox nolechuga;
    private javax.swing.JCheckBox nomayonesa;
    private javax.swing.JCheckBox nopepinillos;
    private javax.swing.JCheckBox noqueso;
    private javax.swing.JCheckBox nosalsa;
    private javax.swing.JLabel pantexto;
    private javax.swing.JCheckBox papascheck;
    private javax.swing.JCheckBox pepinillos;
    private javax.swing.JLabel perzonalizatext;
    private javax.swing.JLabel precioarostext;
    private javax.swing.JLabel preciocieltext;
    private javax.swing.JLabel preciococanoazucartext;
    private javax.swing.JLabel preciococaorgtext;
    private javax.swing.JLabel preciopapasmediatext;
    private javax.swing.JCheckBox salsabbq;
    private javax.swing.JCheckBox salsabuffalo;
    private javax.swing.JCheckBox salsadequeso;
    private javax.swing.JCheckBox salsaportobello;
    private javax.swing.JCheckBox salsaranch;
    private javax.swing.JLabel salsatext;
    private javax.swing.JComboBox<String> sinoSalsa;
    // End of variables declaration//GEN-END:variables
}
