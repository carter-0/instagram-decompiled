package X;

/* renamed from: X.0BG  reason: invalid class name */
public abstract class AnonymousClass0BG {
    public static final String[] A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0BG.A00():X.0BF, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final X.AnonymousClass0BF A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0BG.A00():X.0BF, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BG.A00():X.0BF");
    }

    static {
        String[] strArr = new String[15];
        A00 = strArr;
        strArr[0] = "pgpgin";
        strArr[1] = "pgpgout";
        strArr[2] = "pgmajfault";
        strArr[3] = "allocstall";
        strArr[4] = "allocstall_high";
        strArr[5] = "allocstall_dma";
        strArr[6] = "allocstall_dma32";
        strArr[7] = "allocstall_normal";
        strArr[8] = "allocstall_movable";
        strArr[9] = "pgsteal_kswapd_normal";
        strArr[10] = "pgsteal_kswapd_high";
        strArr[11] = "pgsteal_kswapd_movable";
        strArr[12] = "pgsteal_direct_normal";
        strArr[13] = "pgsteal_direct_high";
        strArr[14] = "pgsteal_direct_movable";
    }
}
