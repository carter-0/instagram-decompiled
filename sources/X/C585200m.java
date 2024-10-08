package X;

import android.app.job.JobParameters;
import android.content.Intent;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:564)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:245)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:126)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    */
/* renamed from: X.00m  reason: invalid class name and case insensitive filesystem */
public abstract class C585200m {
    public boolean A00;
    public final 00n A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.00m.<init>(X.00n):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C585200m(X.00n r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.00m.<init>(X.00n):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C585200m.<init>(X.00n):void");
    }

    public abstract int A00(Intent intent, int i, int i2);

    public abstract void A02();

    public abstract boolean A03(JobParameters jobParameters);

    public abstract boolean A04(JobParameters jobParameters);

    public void A01() {
        this.A01.A01();
    }
}
