package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.2e4  reason: invalid class name */
public final class AnonymousClass2e4 extends Drawable.ConstantState {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public ColorStateList A04;
    public ColorFilter A05;
    public PorterDuff.Mode A06;
    public Rect A07;
    public Rect A08;
    public boolean A09;
    public final AnonymousClass2e5 A0A;
    public final AnonymousClass2e3 A0B;
    public final 2e8 A0C;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2e4.<init>(android.content.res.ColorStateList, android.graphics.ColorFilter, android.graphics.PorterDuff$Mode, X.2e3, int, int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass2e4(android.content.res.ColorStateList r1, android.graphics.ColorFilter r2, android.graphics.PorterDuff.Mode r3, X.AnonymousClass2e3 r4, int r5, int r6) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2e4.<init>(android.content.res.ColorStateList, android.graphics.ColorFilter, android.graphics.PorterDuff$Mode, X.2e3, int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2e4.<init>(android.content.res.ColorStateList, android.graphics.ColorFilter, android.graphics.PorterDuff$Mode, X.2e3, int, int):void");
    }

    public final Drawable newDrawable(Resources resources) {
        return newDrawable(resources, (Resources.Theme) null);
    }

    public final int getChangingConfigurations() {
        ColorStateList colorStateList = this.A04;
        if (colorStateList != null) {
            return colorStateList.getChangingConfigurations();
        }
        return 0;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        if (resources == null) {
            resources = Resources.getSystem();
        }
        AnonymousClass2e3 r1 = this.A0B;
        return new 2eG(this, AnonymousClass2eF.A00(resources, (float) r1.A01), AnonymousClass2eF.A00(resources, (float) r1.A00));
    }

    public final Drawable newDrawable() {
        return newDrawable((Resources) null, (Resources.Theme) null);
    }
}
