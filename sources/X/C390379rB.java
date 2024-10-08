package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Map;

/* renamed from: X.9rB  reason: invalid class name and case insensitive filesystem */
public final class C390379rB extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelShareFbFundraiserStickerFragment";
    public Medium A00;
    public AnonymousClass8D5 A01;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        String str;
        0qQ.A0B(viewGroup, 0);
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A002, this);
        AnonymousClass80I r2 = AnonymousClass80H.A02;
        UserSession userSession = this.A00;
        0qQ.A06(userSession);
        AnonymousClass80D.A09(userSession, r2, A002, this);
        A002.A09 = viewGroup;
        AnonymousClass80D.A07(28D.A2w, this, A002);
        A002.A3H = true;
        A002.A47 = true;
        A002.A3Q = true;
        AnonymousClass80D.A0A(A002);
        Medium medium = this.A00;
        if (medium == null) {
            str = AppStateModule.APP_STATE_BACKGROUND;
        } else {
            A002.A0P = medium;
            A002.A0w = null;
            AnonymousClass8D5 r0 = this.A01;
            if (r0 == null) {
                str = "stickerModel";
            } else {
                A002.A1x = r0;
                return A002;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return C273654mx.A00(917);
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, X.8D5] */
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A02 = AnonymousClass0fD.A02(-417706042);
        super.onCreate(bundle);
        String string = requireArguments().getString(Pxd.A00(651));
        if (string != null) {
            File A0t = AnonymousClass7TE.A0t(string);
            long currentTimeMillis = System.currentTimeMillis();
            String absolutePath = A0t.getAbsolutePath();
            0qQ.A07(absolutePath);
            this.A00 = new Medium(Uri.fromFile(A0t), absolutePath, 0, 1, 0, 0, AnonymousClass7TE.A0P(currentTimeMillis), currentTimeMillis);
            Parcelable parcelable = requireArguments().getParcelable(Pxd.A00(781));
            if (parcelable != null) {
                Bundle requireArguments = requireArguments();
                String A002 = AnonymousClass000.A00(148);
                String string2 = requireArguments.getString(A002);
                if (string2 != null) {
                    boolean z = false;
                    if (requireArguments().getInt(Pxd.A00(789)) == 1) {
                        z = true;
                        UserSession A0k = AnonymousClass7TE.A0k(this);
                        Context requireContext = requireContext();
                        Map A0w = AnonymousClass7TF.A0w(A002, string2);
                        LTM.A06(this, A0k, "share_fundraiser_as_ig_story", AnonymousClass000.A00(1554), (String) null, (String) null, A0w);
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append(0bC.A01(requireContext.getResources(), new String[]{AnonymousClass7TF.A0Q(A0k).getUsername()}, 2131965082));
                        A1A.append("\n\n");
                        String A0l = AnonymousClass7TF.A0l(requireContext.getString(2131965083), A1A);
                        C358248ab r9 = new C358248ab(requireContext);
                        r9.A0i(requireContext.getDrawable(R.drawable.instagram_social_impact_coin_with_heart));
                        r9.A09(2131965084);
                        r9.A0q(A0l);
                        r9.A0E(new I8H(3, A0w, A0k, this));
                        r9.A0G(new I90(8, (Object) requireContext, (Object) this, (Object) A0k, (Object) A0w), 2131964884);
                        AnonymousClass0fN.A00(r9.A02());
                    }
                    String obj = parcelable.toString();
                    String string3 = requireArguments().getString("charity_pfp");
                    String string4 = requireArguments().getString(Pxd.A00(892));
                    String string5 = requireArguments().getString(Pxd.A00(891));
                    ? obj2 = new Object();
                    obj2.A02 = obj;
                    obj2.A01 = string2;
                    obj2.A05 = z;
                    obj2.A00 = string3;
                    obj2.A04 = string4;
                    obj2.A03 = string5;
                    this.A01 = obj2;
                    AnonymousClass0fD.A09(-2095825092, A02);
                    return;
                }
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = 457126138;
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = 1091762511;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 2015977129;
        }
        AnonymousClass0fD.A09(i, A02);
        throw illegalStateException;
    }
}
