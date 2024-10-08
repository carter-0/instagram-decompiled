package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

public final class UZS extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteSimpleErrorFragment";
    public View A00;
    public TextView A01;
    public TextView A02;
    public ErrorIdentifier A03;
    public IgdsBottomButtonLayout A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final String getModuleName() {
        return "promote_simple_error";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x003d: MOVE  (r1v23 com.instagram.base.activity.BaseFragmentActivity) = (r1v2 com.instagram.base.activity.BaseFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            super.onViewCreated(r9, r10)
            r0 = 2131438665(0x7f0b2c49, float:1.8499263E38)
            android.view.View r1 = X.DbY.A0F(r9, r0)
            r8.A00 = r1
            java.lang.String r2 = "errorView"
            if (r1 == 0) goto L_0x019a
            r0 = 2131438666(0x7f0b2c4a, float:1.8499265E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r8.A02 = r0
            android.view.View r1 = r8.A00
            if (r1 == 0) goto L_0x019a
            r0 = 2131438663(0x7f0b2c47, float:1.849926E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r8.A01 = r0
            r0 = 2131427571(0x7f0b00f3, float:1.8476762E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r0
            r8.A04 = r0
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x0044
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            if (r1 == 0) goto L_0x0044
            r1.A0a()
        L_0x0044:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A04
            java.lang.String r7 = "buttonView"
            if (r1 == 0) goto L_0x005a
            r0 = 2131970540(0x7f1349ec, float:1.9578034E38)
            java.lang.String r0 = r8.getString(r0)
            r1.setPrimaryActionText(r0)
            com.instagram.api.schemas.ErrorIdentifier r0 = r8.A03
            if (r0 != 0) goto L_0x0062
            java.lang.String r7 = "errorIdentifier"
        L_0x005a:
            X.0qQ.A0F(r7)
        L_0x005d:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0062:
            int r0 = r0.ordinal()
            java.lang.String r3 = "\n\n"
            java.lang.String r6 = "errorViewDescription"
            switch(r0) {
                case 45: goto L_0x015b;
                case 46: goto L_0x0177;
                case 47: goto L_0x006d;
                case 48: goto L_0x006d;
                case 49: goto L_0x006d;
                case 50: goto L_0x006d;
                case 51: goto L_0x006d;
                case 52: goto L_0x00ed;
                case 53: goto L_0x010b;
                case 54: goto L_0x0084;
                case 55: goto L_0x00b4;
                default: goto L_0x006d;
            }
        L_0x006d:
            android.widget.TextView r1 = r8.A02
            if (r1 != 0) goto L_0x0074
            java.lang.String r7 = "errorViewTitle"
            goto L_0x005a
        L_0x0074:
            r0 = 2131970543(0x7f1349ef, float:1.957804E38)
            r1.setText(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A04
            if (r1 == 0) goto L_0x005a
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0084:
            android.widget.TextView r1 = r8.A02
            if (r1 == 0) goto L_0x0198
            r0 = 2131970106(0x7f13483a, float:1.9577154E38)
            r1.setText(r0)
            r0 = 2131970103(0x7f134837, float:1.9577148E38)
            java.lang.String r2 = r8.getString(r0)
            r0 = 2131970104(0x7f134838, float:1.957715E38)
            java.lang.String r0 = r8.getString(r0)
            android.widget.TextView r1 = r8.A01
            if (r1 == 0) goto L_0x0193
            java.lang.String r0 = X.002.A0g(r2, r3, r0)
            r1.setText(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r3 = r8.A04
            if (r3 == 0) goto L_0x005a
            r0 = 2131970105(0x7f134839, float:1.9577152E38)
            java.lang.String r2 = r8.getString(r0)
            r1 = 7
            goto L_0x00e4
        L_0x00b4:
            android.widget.TextView r1 = r8.A02
            if (r1 == 0) goto L_0x0198
            r0 = 2131970106(0x7f13483a, float:1.9577154E38)
            r1.setText(r0)
            r0 = 2131970218(0x7f1348aa, float:1.957738E38)
            java.lang.String r2 = r8.getString(r0)
            r0 = 2131970219(0x7f1348ab, float:1.9577383E38)
            java.lang.String r0 = r8.getString(r0)
            android.widget.TextView r1 = r8.A01
            if (r1 == 0) goto L_0x0193
            java.lang.String r0 = X.002.A0g(r2, r3, r0)
            r1.setText(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r3 = r8.A04
            if (r3 == 0) goto L_0x005a
            r0 = 2131970105(0x7f134839, float:1.9577152E38)
            java.lang.String r2 = r8.getString(r0)
            r1 = 8
        L_0x00e4:
            X.WB8 r0 = new X.WB8
            r0.<init>((java.lang.Object) r8, (int) r1)
            r3.setPrimaryAction(r2, r0)
            return
        L_0x00ed:
            r8.A01()
            android.widget.TextView r1 = r8.A01
            if (r1 == 0) goto L_0x0193
            android.text.SpannableStringBuilder r0 = r8.A00()
            r1.setText(r0)
            android.widget.TextView r0 = r8.A01
            if (r0 == 0) goto L_0x0193
            X.DbT.A1H(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A04
            if (r1 == 0) goto L_0x005a
            r0 = 5
            X.WB8.A00(r1, r0, r8)
            return
        L_0x010b:
            r8.A01()
            android.widget.TextView r5 = r8.A01
            if (r5 == 0) goto L_0x0193
            r0 = 2131970531(0x7f1349e3, float:1.9578016E38)
            java.lang.String r4 = X.DbU.A0m(r8, r0)
            r0 = 2131970530(0x7f1349e2, float:1.9578014E38)
            java.lang.String r0 = X.C13991Tnr.A0d(r8, r4, r0)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r0)
            android.view.View r0 = r8.A00
            if (r0 == 0) goto L_0x019a
            android.content.Context r0 = r0.getContext()
            int r2 = X.DbV.A02(r0)
            r1 = 7
            X.UsR r0 = new X.UsR
            r0.<init>((X.UZS) r8, (int) r2, (int) r1)
            X.AnonymousClass7AV.A05(r3, r0, r4)
            r5.setText(r3)
            android.widget.TextView r0 = r8.A01
            if (r0 == 0) goto L_0x0193
            X.DbT.A1H(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A04
            if (r1 == 0) goto L_0x005a
            r0 = 6
            X.WB8.A00(r1, r0, r8)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A04
            if (r1 == 0) goto L_0x005a
            r0 = 2131970536(0x7f1349e8, float:1.9578026E38)
            java.lang.String r0 = r8.getString(r0)
            r1.setPrimaryActionText(r0)
            return
        L_0x015b:
            r8.A01()
            android.widget.TextView r1 = r8.A01
            if (r1 == 0) goto L_0x0193
            android.text.SpannableStringBuilder r0 = r8.A00()
            r1.setText(r0)
            android.widget.TextView r0 = r8.A01
            if (r0 == 0) goto L_0x0193
            X.DbT.A1H(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r8.A04
            if (r2 == 0) goto L_0x005a
            r1 = 9
            goto L_0x018a
        L_0x0177:
            r8.A01()
            android.widget.TextView r1 = r8.A01
            if (r1 == 0) goto L_0x0193
            r0 = 2131970534(0x7f1349e6, float:1.9578022E38)
            r1.setText(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r8.A04
            if (r2 == 0) goto L_0x005a
            r1 = 10
        L_0x018a:
            X.WB8 r0 = new X.WB8
            r0.<init>((java.lang.Object) r8, (int) r1)
            r2.setPrimaryActionOnClickListener(r0)
            return
        L_0x0193:
            X.0qQ.A0F(r6)
            goto L_0x005d
        L_0x0198:
            java.lang.String r2 = "errorViewTitle"
        L_0x019a:
            X.0qQ.A0F(r2)
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZS.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A01() {
        TextView textView = this.A02;
        if (textView == null) {
            0qQ.A0F("errorViewTitle");
            throw AnonymousClass00P.createAndThrow();
        } else {
            textView.setText(2131970542);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    private final SpannableStringBuilder A00() {
        String A0m = DbU.A0m(this, 2131970531);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C13991Tnr.A0d(this, A0m, 2131970532));
        View view = this.A00;
        if (view == null) {
            0qQ.A0F("errorView");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7AV.A05(spannableStringBuilder, new C16300UsR(this, DbV.A02(view.getContext()), 8), A0m);
        return spannableStringBuilder;
    }

    public final void configureActionBar(2da r3) {
        Context A0B = JTT.A0B(this, r3);
        ErrorIdentifier errorIdentifier = this.A03;
        if (errorIdentifier == null) {
            0qQ.A0F("errorIdentifier");
            throw AnonymousClass00P.createAndThrow();
        }
        r3.setTitle(C16901VAe.A00(A0B, errorIdentifier));
        Dbc.A0k(r3);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-294018745);
        UZS.super.onCreate(bundle);
        ErrorIdentifier errorIdentifier = (ErrorIdentifier) ErrorIdentifier.A01.get(C320236s2.A01(DbY.A08(this), "error_type"));
        if (errorIdentifier == null) {
            errorIdentifier = ErrorIdentifier.UNRECOGNIZED;
        }
        this.A03 = errorIdentifier;
        AnonymousClass0fD.A09(-39734461, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1397784179);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_error_view, false);
        AnonymousClass0fD.A09(2143316020, A022);
        return A0D;
    }
}
