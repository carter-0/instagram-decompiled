package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.KGh  reason: case insensitive filesystem */
public final class C61657KGh extends C232232tF {
    public final Activity A00;
    public final Object A01;

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x001f: MOVE  (r3v1 androidx.fragment.app.FragmentActivity) = (r3v0 androidx.fragment.app.FragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r5, X.C249703kE r6) {
        /*
            r4 = this;
            X.74g r5 = (X.C3258174g) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            android.app.Activity r3 = r4.A00
            boolean r0 = X.AnonymousClass3HA.A00(r3)
            if (r0 == 0) goto L_0x0038
            java.util.List r1 = X.C63559Kz8.A00
        L_0x0010:
            java.lang.String r0 = r5.A00
            X.K4J r2 = new X.K4J
            r2.<init>()
            r2.A05 = r1
            r2.A04 = r0
            boolean r0 = r3 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x0037
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            if (r3 == 0) goto L_0x0037
            X.0hq r0 = r3.getSupportFragmentManager()
            if (r0 == 0) goto L_0x0037
            X.0s1 r1 = new X.0s1
            r1.<init>(r0)
            r0 = 2131433135(0x7f0b16af, float:1.8488047E38)
            r1.A0A(r2, r0)
            r1.A00()
        L_0x0037:
            return
        L_0x0038:
            java.util.List r1 = X.C63559Kz8.A01
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61657KGh.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C3258174g.class;
    }

    public C61657KGh(Activity activity, Object obj) {
        this.A01 = obj;
        this.A00 = activity;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C68061MzS(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_thread_null_state_container, false));
    }
}
