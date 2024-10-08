package X;

import java.io.File;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.1JF  reason: invalid class name */
public final class AnonymousClass1JF {
    public int A00;
    public long A01;
    public C61480nO A02;
    public File A03;
    public AnonymousClass0eK A04;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1JF.A01():X.1JG, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.1JG A01() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1JF.A01():X.1JG, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1JF.A01():X.1JG");
    }

    public static AnonymousClass1JF A00(int i) {
        AnonymousClass1JP r2;
        AnonymousClass1JF r6 = new AnonymousClass1JF();
        r6.A03 = AnonymousClass1F2.A00().CGg((1LJ) null, i);
        long j = 31457280;
        switch (i) {
            case 26195652:
            case 257799610:
            case 274028206:
            case 528374993:
            case 607242469:
            case 630639402:
            case 789611494:
            case 914945323:
            case 1000143069:
            case 1048132585:
            case 1162909345:
            case 1353049725:
            case 1427466249:
            case 1474091397:
            case 1640735657:
            case 1762211433:
            case 1791411823:
            case 1861410123:
            case 1863054121:
            case 1931339941:
                r2 = new AnonymousClass1JP();
                r2.A01 = 5242880;
                break;
            case 841047303:
            case 1557477396:
                r2 = new AnonymousClass1JP();
                break;
            case 1648037800:
                r2 = new AnonymousClass1JP();
                j = 52428800;
                break;
            default:
                return r6;
        }
        r2.A01 = j;
        r2.A00 = 1000;
        r2.A05 = true;
        1Ff A002 = r2.A00();
        long j2 = A002.A01;
        if (j2 > 0) {
            r6.A01 = j2;
        }
        long j3 = A002.A00;
        if (j3 >= 0) {
            r6.A00 = (int) j3;
            return r6;
        }
        return r6;
    }
}
