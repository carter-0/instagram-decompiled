package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.E0o  reason: case insensitive filesystem */
public final class C47396E0o extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DataTransparencyBottomSheet";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "profile_data_transparency_bottom_Sheet";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (r0 != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            super.onViewCreated(r6, r7)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r1, r0)
            X.0eE r0 = X.AnonymousClass0t1.A01
            X.0eM r1 = r5.A00
            com.instagram.user.model.User r0 = X.DbX.A0l(r0, r1)
            boolean r0 = X.2Ek.A01(r0)
            if (r0 != 0) goto L_0x002d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            boolean r0 = X.AnonymousClass431.A00(r0)
            r1 = 2131969934(0x7f13478e, float:1.9576805E38)
            if (r0 == 0) goto L_0x0030
        L_0x002d:
            r1 = 2131969935(0x7f13478f, float:1.9576807E38)
        L_0x0030:
            android.content.Context r0 = r5.requireContext()
            java.lang.String r3 = X.DbY.A0c(r0, r4, r1)
            r0 = 2131428824(0x7f0b05d8, float:1.8479303E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r6, r0)
            int r1 = X.DbZ.A01(r5)
            X.ESx r0 = new X.ESx
            r0.<init>((X.C47396E0o) r5, (int) r1)
            X.AnonymousClass7AV.A07(r0, r2, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47396E0o.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1943311558);
        0qQ.A0B(layoutInflater, 0);
        C47396E0o.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.edit_profile_transparency_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(1826598053, A02);
        return inflate;
    }
}
