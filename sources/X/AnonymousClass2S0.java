package X;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: X.2S0  reason: invalid class name */
public final class AnonymousClass2S0 {
    public static AnonymousClass2S0 A01;
    public Vibrator A00;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2S0.A01(android.content.Context):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static void A01(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2S0.A01(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2S0.A01(android.content.Context):void");
    }

    private void A00() {
        if (Build.VERSION.SDK_INT >= 29 && this.A00 != null) {
            A07(VibrationEffect.createPredefined(2));
        }
    }

    private boolean A02() {
        if (Build.VERSION.SDK_INT < 29 || this.A00 == null) {
            return false;
        }
        return A07(VibrationEffect.createPredefined(0));
    }

    public final void A03() {
        A05(30);
    }

    public final void A04() {
        if (Build.VERSION.SDK_INT >= 29 && this.A00 != null) {
            A00();
        }
    }

    public final void A05(long j) {
        Vibrator vibrator = this.A00;
        if (vibrator != null) {
            try {
                vibrator.vibrate(j);
            } catch (NullPointerException unused) {
            }
        }
    }

    public final boolean A06() {
        if (Build.VERSION.SDK_INT < 29 || this.A00 == null) {
            return false;
        }
        return A02();
    }

    public final boolean A07(VibrationEffect vibrationEffect) {
        Vibrator vibrator = this.A00;
        if (vibrator == null) {
            return false;
        }
        try {
            vibrator.vibrate(vibrationEffect);
            return true;
        } catch (NullPointerException unused) {
            return false;
        }
    }
}
