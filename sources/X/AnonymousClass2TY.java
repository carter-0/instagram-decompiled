package X;

import com.facebook.yoga.YogaNodeJNIBase;
import java.util.List;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.2TY  reason: invalid class name */
public class AnonymousClass2TY implements AnonymousClass2Ta {
    public final 2V1 A00;
    public final 2TR A01;
    public final C245043cC A02;
    public final List A03;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2TY.<init>(X.2V1, X.2TR, X.3cC):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass2TY(X.2V1 r1, X.2TR r2, X.C245043cC r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2TY.<init>(X.2V1, X.2TR, X.3cC):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2TY.<init>(X.2V1, X.2TR, X.3cC):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2TY.A03():android.graphics.Rect, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final android.graphics.Rect A03() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2TY.A03():android.graphics.Rect, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2TY.A03():android.graphics.Rect");
    }

    public final int A00() {
        return AnonymousClass2Tt.A00(this.A02.A0K.getLayoutBorder(C244143ai.LEFT));
    }

    public final int A01() {
        return AnonymousClass2Tt.A00(this.A02.A0K.getLayoutBorder(C244143ai.RIGHT));
    }

    public final int A02() {
        return (int) Float.intBitsToFloat((int) (this.A02.A02 >> 32));
    }

    public 2TR A04() {
        return this.A01;
    }

    public void A05() {
        C245043cC r0 = this.A02;
        r0.A03 = null;
        ((YogaNodeJNIBase) r0.A0K).mData = null;
        List list = this.A03;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass2TY) list.get(i)).A05();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass2Ta AnD(int i) {
        return (AnonymousClass2TY) this.A03.get(i);
    }

    public final int AnO() {
        return this.A03.size();
    }

    public final Object BLp() {
        return this.A02.A0B;
    }

    public final int Ba8() {
        return AnonymousClass2Tt.A00(this.A02.A0K.getLayoutPadding(C244143ai.BOTTOM));
    }

    public final int Ba9() {
        return AnonymousClass2Tt.A00(this.A02.A0K.getLayoutPadding(C244143ai.LEFT));
    }

    public final int BaB() {
        return AnonymousClass2Tt.A00(this.A02.A0K.getLayoutPadding(C244143ai.RIGHT));
    }

    public final int BaC() {
        return AnonymousClass2Tt.A00(this.A02.A0K.getLayoutPadding(C244143ai.TOP));
    }

    public final /* bridge */ /* synthetic */ 2Th Blo() {
        return null;
    }

    public int CGw(int i) {
        float f;
        float[] fArr = ((YogaNodeJNIBase) ((AnonymousClass2TY) this.A03.get(i)).A02.A0K).arr;
        if (fArr != null) {
            f = fArr[3];
        } else {
            f = 0.0f;
        }
        return (int) f;
    }

    public int CHT(int i) {
        float f;
        float[] fArr = ((YogaNodeJNIBase) ((AnonymousClass2TY) this.A03.get(i)).A02.A0K).arr;
        if (fArr != null) {
            f = fArr[4];
        } else {
            f = 0.0f;
        }
        return (int) f;
    }

    public final int getHeight() {
        float f;
        float[] fArr = ((YogaNodeJNIBase) this.A02.A0K).arr;
        if (fArr != null) {
            f = fArr[2];
        } else {
            f = 0.0f;
        }
        return (int) f;
    }

    public final int getWidth() {
        float f;
        float[] fArr = ((YogaNodeJNIBase) this.A02.A0K).arr;
        if (fArr != null) {
            f = fArr[1];
        } else {
            f = 0.0f;
        }
        return (int) f;
    }
}
