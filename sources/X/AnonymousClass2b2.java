package X;

import android.view.View;
import android.view.ViewGroup;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.2b2  reason: invalid class name */
public final class AnonymousClass2b2 implements C252063oV {
    public final View A00;
    public final boolean A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2b2.<init>(android.view.View):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public AnonymousClass2b2(android.view.View r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2b2.<init>(android.view.View):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2b2.<init>(android.view.View):void");
    }

    public final void EeU(C2365734g r1) {
    }

    public final ViewGroup.LayoutParams BLw() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.A00;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return new ViewGroup.LayoutParams(0, 0);
        }
        return layoutParams;
    }

    public final int CFV() {
        View view = this.A00;
        if (view != null) {
            return view.getVisibility();
        }
        return 8;
    }

    public final boolean CVM() {
        return this.A01;
    }

    public final /* synthetic */ View E2D() {
        if (this.A01) {
            return this.A00;
        }
        return null;
    }

    public final void Ebw(ViewGroup.LayoutParams layoutParams) {
        View view = this.A00;
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }

    public final View getView() {
        return this.A00;
    }

    public final void setVisibility(int i) {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(i);
        }
    }
}
