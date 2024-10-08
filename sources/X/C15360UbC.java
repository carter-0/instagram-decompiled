package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.UbC  reason: case insensitive filesystem */
public final class C15360UbC extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "CaptionSheetFragment";
    public IgTextView A00;
    public IgdsBottomButtonLayout A01;
    public C255773uh A02;
    public C17518VYw A03;
    public String A04;
    public String A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v50, types: [X.U22, android.text.method.LinkMovementMethod] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            r17 = this;
            r2 = 0
            r1 = r18
            X.0qQ.A0B(r1, r2)
            r14 = r17
            r0 = r19
            super.onViewCreated(r1, r0)
            r0 = 2131429606(0x7f0b08e6, float:1.848089E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r1, r0)
            r14.A00 = r0
            r0 = 2131428897(0x7f0b0621, float:1.8479451E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r0
            r14.A01 = r0
            com.instagram.common.ui.base.IgTextView r0 = r14.A00
            java.lang.String r9 = "captionTextView"
            if (r0 == 0) goto L_0x003b
            android.content.Context r0 = r0.getContext()
            int r5 = X.DbV.A02(r0)
            X.0eM r6 = r14.A06
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r1 = r14.A04
            if (r1 != 0) goto L_0x0043
            java.lang.String r9 = "captionText"
        L_0x003b:
            X.0qQ.A0F(r9)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0043:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r1)
            X.3q3 r4 = new X.3q3
            r4.<init>(r0, r3)
            r4.A03 = r5
            r4.A01 = r5
            r1 = 3
            X.WXF r0 = new X.WXF
            r0.<init>(r14, r1)
            r4.A03(r0)
            r3 = 1
            X.WXE r0 = new X.WXE
            r0.<init>(r14, r3)
            r4.A02(r0)
            android.text.SpannableStringBuilder r1 = r4.A00()
            X.0qQ.A07(r1)
            com.instagram.common.ui.base.IgTextView r0 = r14.A00
            if (r0 == 0) goto L_0x003b
            r0.setText(r1)
            com.instagram.common.ui.base.IgTextView r1 = r14.A00
            if (r1 == 0) goto L_0x003b
            X.U22 r0 = X.U22.A00
            if (r0 != 0) goto L_0x0080
            X.U22 r0 = new X.U22
            r0.<init>()
            X.U22.A00 = r0
        L_0x0080:
            r1.setMovementMethod(r0)
            X.3uh r5 = r14.A02
            java.lang.String r9 = "bottomButton"
            if (r5 == 0) goto L_0x0190
            boolean r0 = X.AnonymousClass4EQ.A0G(r5)
            if (r0 == 0) goto L_0x0190
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r14.A01
            if (r0 == 0) goto L_0x003b
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            r15 = 0
            java.lang.CharSequence r0 = X.AnonymousClass4EQ.A05(r1, r0, r5)
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L_0x0190
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r14.A01
            if (r0 == 0) goto L_0x003b
            r0.setVisibility(r2)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r14.A01
            if (r0 == 0) goto L_0x003b
            r0.setPrimaryActionText(r1)
            X.0lg r0 = X.DbT.A0X(r6)
            X.3Dp r4 = X.C238833Dp.A00(r0)
            X.0qQ.A07(r4)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r14.A01
            if (r1 == 0) goto L_0x003b
            X.3Ds r0 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            r4.A05(r1, r0)
            java.lang.String r0 = "Required value was null."
            X.1Xj r13 = r5.A0b
            if (r13 == 0) goto L_0x019a
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r14.A01
            if (r2 == 0) goto L_0x003b
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r14.A01
            if (r0 == 0) goto L_0x003b
            android.content.Context r1 = r0.getContext()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.6Q1 r11 = new X.6Q1
            r11.<init>(r1, r0, r13)
            X.0lg r8 = X.DbT.A0X(r6)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36883529870869006(0x8309600004020e, double:3.388631036166905E-306)
            java.lang.String r1 = X.182.A04(r7, r8, r0)
            java.lang.String r0 = ","
            java.util.List r1 = X.DbV.A18(r1, r0)
            if (r1 == 0) goto L_0x0165
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x014a
            int r0 = r1.size()
            java.util.ListIterator r7 = r1.listIterator(r0)
        L_0x010c:
            boolean r0 = r7.hasPrevious()
            if (r0 == 0) goto L_0x014a
            java.lang.Object r0 = r7.previous()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 == 0) goto L_0x010c
            int r0 = r7.nextIndex()
            int r0 = r0 + 1
            java.util.List r0 = X.00k.A0d(r1, r0)
        L_0x0128:
            if (r0 == 0) goto L_0x0165
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r0.iterator()
        L_0x0133:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x014d
            java.lang.Object r1 = r8.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0133
            r7.add(r1)
            goto L_0x0133
        L_0x014a:
            X.0sn r0 = X.0sn.A00
            goto L_0x0128
        L_0x014d:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0156:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0167
            java.lang.Object r1 = r7.next()
            java.util.LinkedHashSet r0 = X.094.A01(r1, r0)
            goto L_0x0156
        L_0x0165:
            X.0sl r0 = X.0sl.A00
        L_0x0167:
            X.3e7 r10 = new X.3e7
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r4.A0A(r2, r10)
            X.0lg r4 = X.DbT.A0X(r6)
            java.lang.String r2 = r5.A0k
            r1 = 17
            X.J6L r0 = new X.J6L
            r0.<init>(r14, r1)
            X.3aW r1 = new X.3aW
            r5 = r2
            r6 = r15
            r7 = r0
            r8 = r3
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r14.A01
            if (r0 == 0) goto L_0x003b
            r0.setPrimaryActionOnClickListener(r1)
            return
        L_0x0190:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r14.A01
            if (r1 == 0) goto L_0x003b
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x019a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15360UbC.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A0C;
    }

    public final String getModuleName() {
        String str = this.A05;
        if (str != null) {
            return C49092EpH.A00(this, str);
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(665212959);
        C15360UbC.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = C320236s2.A01(requireArguments, C273654mx.A00(1485));
        this.A05 = C320236s2.A01(requireArguments, "args_previous_module_name");
        AnonymousClass0fD.A09(1092631082, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1771513062);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.caption_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-2133184884, A022);
        return inflate;
    }
}
