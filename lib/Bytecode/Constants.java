// $ANTLR 2.7.7 (20060930): "prova.g" -> "ProvaLexic.java"$



//	Ajuda a la confeccio de codi en Bytecode. Practiques de MEC
//
//
//
//
//	Interface per les constants(variables) utilitzades a Bytecode
//
//
//
//
//
//
//
//	Josep Suy, Marc Massot 		Ultima modificacio: 8 de maig de 2007
//
//
//
//




public interface Constants {





// Constants per fer mascares per als modificadors de classe i elements
Long ACC_PUBLIC=0x0001L;
Long ACC_PRIVATE=0x0002L;
Long ACC_PROTECTED=0x0004L;
Long ACC_STATIC=0x0008L;
Long ACC_FINAL=0x0010L;
Long ACC_SUPER=0x0020L;
Long ACC_SINCHRONIZED=0x0020L;
Long ACC_VOLATILE=0x0040L;
Long ACC_TRANSIENT=0x0080L;
Long ACC_NATIVE=0x0100L;
Long ACC_INTERFACE=0x0200L;
Long ACC_ABSTRACT=0x0400L;

// Constant per la creacio de array unidimensioals
Long T_BOOLEAN=4L;
Long T_CHAR=5L;
Long T_FLOAT=6L;
Long T_INT=10L;

// Opcodes for JVM
Long NOP=0L;
Long ACONST_NULL=1L;
Long ICONST_M1=2L;
Long ICONST_0=3L;
Long ICONST_1=4L;
Long ICONST_2=5L;
Long ICONST_3=6L;
Long ICONST_4=7L; 
Long ICONST_5=8L; 
Long LCONST_0=9L;
Long LCONST_1=10L;
Long FCONST_0=11L;
Long FCONST_1=12L;
Long FCONST_2=13L;
Long DCONST_0=14L;
Long DCONST_1=15L;
Long BIPUSH=16L;
Long SIPUSH=17L;
Long LDC=18L;
Long LDC_W=19L;
Long LDC2_W=20L;
Long ILOAD=21L;
Long LLOAD=22L;
Long FLOAD=23L;
Long DLOAD=24L;
Long ALOAD=25L;
Long ILOAD_0=26L;
Long ILOAD_1=27L;
Long ILOAD_2=28L;
Long ILOAD_3=29L;
Long LLOAD_0=30L;
Long LLOAD_1=31L;
Long LLOAD_2=32L;
Long LLOAD_3=33L;
Long FLOAD_0=34L;
Long FLOAD_1=35L;
Long FLOAD_2=36L;
Long FLOAD_3=37L;
Long DLOAD_0=38L;
Long DLOAD_1=39L;
Long DLOAD_2=40L;
Long DLOAD_3=41L;
Long ALOAD_0=42L;
Long ALOAD_1=43L;
Long ALOAD_2=44L;
Long ALOAD_3=45L;
Long IALOAD=46L;
Long LALOAD=47L;
Long FALOAD=48L;
Long DALOAD=49L;
Long AALOAD=50L;
Long BALOAD=51L;
Long CALOAD=52L;
Long SALOAD=53L;
Long ISTORE=54L;
Long LSTORE=55L;
Long FSTORE=56L;
Long DSTORE=57L;
Long ASTORE=58L;
Long ISTORE_0=59L;
Long ISTORE_1=60L;
Long ISTORE_2=61L;
Long ISTORE_3=62L;
Long LSTORE_0=63L;
Long LSTORE_1=64L;
Long LSTORE_2=65L;
Long LSTORE_3=66L;
Long FSTORE_0=67L;
Long FSTORE_1=68L;
Long FSTORE_2=69L;
Long FSTORE_3=70L;
Long DSTORE_0=71L;
Long DSTORE_1=72L;
Long DSTORE_2=73L;
Long DSTORE_3=74L;
Long ASTORE_0=75L;
Long ASTORE_1=76L;
Long ASTORE_2=77L;
Long ASTORE_3=78L;
Long IASTORE=79L;
Long LASTORE=80L;
Long FASTORE=81L;
Long DASTORE=82L;
Long AASTORE=83L;
Long BASTORE=84L;
Long CASTORE=85L;
Long SASTORE=86L;
Long POP=87L;
Long POP2=88L;
Long DUP=89L;
Long DUP_X1=90L;
Long DUP_X2=91L;
Long DUP2=92L;
Long DUP2_X1=93L;
Long DUP2_X2=94L;
Long SWAP=95L;
Long IADD=96L;
Long LADD=97L;
Long FADD=98L;
Long DADD=99L;
Long ISUB=100L;
Long LSUB=101L;
Long FSUB=102L;
Long DSUB=103L;
Long IMUL=104L;
Long LMUL=105L;
Long FMUL=106L;
Long DMUL=107L;
Long IDIV=108L;
Long LDIV=109L;
Long FDIV=110L;
Long DDIV=111L;
Long IREM=112L;
Long LREM=113L;
Long FREM=114L;
Long DREM=115L;
Long INEG=116L;
Long LNEG=117L;
Long FNEG=118L;
Long DNEG=119L;
Long ISHL=120L;
Long LSHL=121L;
Long ISHR=122L;
Long LSHR=123L;
Long IUSHR=124L;
Long LUSHR=125L;
Long IAND=126L;
Long LAND=127L;
Long IOR=128L;
Long LOR=129L;
Long IXOR=130L;
Long LXOR=131L;
Long IINC=132L;
Long I2L=133L;
Long I2F=134L;
Long I2D=135L;
Long L2I=136L;
Long L2F=137L;
Long L2D=138L;
Long F2I=139L;
Long F2L=140L;
Long F2D=141L;
Long D2I=142L;
Long D2L=143L;
Long D2F=144L;
Long I2B=145L;
Long I2C=146L;
Long I2S=147L;
Long LCMP=148L;
Long FCMPL=149L;
Long FCMPG=150L;
Long DCMPL=151L;
Long DCMPG=152L;
Long IFEQ=153L;
Long IFNE=154L;
Long IFLT=155L;
Long IFGE=156L;
Long IFGT=157L;
Long IFLE=158L;
Long IF_ICMPEQ=159L;
Long IF_ICMPNE=160L;
Long IF_ICMPLT=161L;
Long IF_ICMPGE=162L;
Long IF_ICMPGT=163L;
Long IF_ICMPLE=164L;
Long IF_ACMPEQ=165L;
Long IF_ACMPNE=166L;
Long GOTO=167L;
Long JSR=168L;
Long RET=169L;
Long TABLESWITCH=170L;
Long LOOKUPSWITCH=171L;
Long IRETURN=172L;
Long LRETURN=173L;
Long FRETURN=174L;
Long DRETURN=175L;
Long ARETURN=176L;
Long RETURN=177L;
Long GETSTATIC=178L;
Long PUTSTATIC=179L;
Long GETFIELD=180L;
Long PUTFIELD=181L;
Long INVOKEVIRTUAL=182L;
Long INVOKESPECIAL=183L;
Long INVOKESTATIC=184L;
Long INVOKEINTERFACE=185L;
Long XXXUNUSEDXXX=186L;
Long NEW=187L;
Long NEWARRAY=188L;
Long ANEWARRAY=189L;
Long ARRAYLENGTH=190L;
Long ATHROW=191L;
Long CHECKCAST=192L;
Long INSTANCEOF=193L;
Long MONITORENTER=194L;
Long MONITOREXIT=195L;
Long WIDE=196L;
Long MULTIANEWARRAY=197L;
Long IFNULL=198L;
Long IFNONNULL=199L;
Long GOTO_W=200L;
Long JSR_W=201L;
Long BREAKPOINT=202L;
Long LDC_QUICK=203L;
Long LDC_W_QUICK=204L;
Long LDC2_W_QUICK=205L;
Long GETFIELD_QUICK=206L;
Long PUTFIELD_QUICK=207L;
Long GETFIELD2_QUICK=208L;
Long PUTFIELD2_QUICK=209L;
Long GETSTATIC_QUICK=210L;
Long PUTSTATIC_QUICK=211L;
Long GETSTATIC2_QUICK=212L;
Long PUTSTATIC2_QUICK=213L;
Long INVOKEVIRTUAL_QUICK=214L;
Long INVOKENONVIRTUAL_QUICK=215L;
Long INVOKESUPER_QUICK=216L;
Long INVOKESTATIC_QUICK=217L;
Long INVOKEINTERFACE_QUICK=218L;
Long INVOKEVIRTUALOBJECT_QUICK=219L;
Long NEW_QUICK=221L;
Long ANEWARRAY_QUICK=222L;
Long MULTIANEWARRAY_QUICK=223L;
Long CHECKCAST_QUICK=224L;
Long INSTANCEOF_QUICK=225L;
Long INVOKEVIRTUAL_QUICK_W=226L;
Long GETFIELD_QUICK_W=227L;
Long PUTFIELD_QUICK_W=228L;
Long IMPDEP1=254L;
Long IMPDEP2=255L;


}
