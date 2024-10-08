package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteButtonActionType;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.url.UrlHandlerActivity;

/* renamed from: X.UaB  reason: case insensitive filesystem */
public final class C15304UaB extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromotePromotionInformationFragment";
    public 2da A00;
    public C18662VwK A01;
    public String A02;
    public String A03;
    public String A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        this.A00 = r4;
        DbX.A1A(new C71403Ok2(this, 20), DbV.A0K(), r4);
    }

    public final String getModuleName() {
        return "promote_promotion_information_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G = AnonymousClass7TF.A0G(view, R.id.thumbnail_image);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.display_title);
        View A0G3 = AnonymousClass7TF.A0G(view, R.id.display_body);
        BusinessNavBar businessNavBar = (BusinessNavBar) AnonymousClass7TF.A0G(view, R.id.bottom_bar);
        businessNavBar.A01.setVisibility(8);
        businessNavBar.A02(false);
        View A0G4 = AnonymousClass7TF.A0G(view, R.id.loading_spinner);
        Dba.A16(getViewLifecycleOwner(), ((U8T) this.A06.getValue()).A00, new C58799Ixk(3, businessNavBar, this, A0G4, A0G, A0G2, A0G3), 52);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final boolean onBackPressed() {
        C18662VwK vwK = this.A01;
        if (vwK == null) {
            0qQ.A0F("adsManagerLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        vwK.A01(C16678UzE.PROMOTION_INFORMATION.toString());
        return false;
    }

    public C15304UaB() {
        C20702WxZ wxZ = new C20702WxZ(this, 49);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20702WxZ(new C20702WxZ(this, 46), 47));
        this.A06 = new C227862kA(new C20702WxZ(A002, 48), wxZ, new C41566AwY(28, (Object) null, A002), new 0Yh(U8T.class));
    }

    public static final void A00(C15304UaB uaB, PromoteButtonActionType promoteButtonActionType, String str) {
        14D A002;
        Context context;
        int ordinal = promoteButtonActionType.ordinal();
        String str2 = str;
        if (ordinal == 0) {
            SUL sul = new SUL(uaB.requireActivity(), AnonymousClass7TE.A0l(uaB.A05), 2EG.A34, str2, false);
            sul.A0S = "promote_promotion_information_fragment";
            sul.A0A();
        } else if (ordinal == 1) {
            AnonymousClass14E r1 = 14D.A04;
            if ((r1.A00() != null && (context = uaB.getContext()) != null && str != null && FHE.A0G(context, str) != null) || ((A002 = r1.A00()) != null && A002.A00(DbS.A0T(uaB.A05), str) != null)) {
                Intent intent = new Intent(uaB.requireContext(), UrlHandlerActivity.class);
                intent.setData(0cp.A03(str));
                intent.putExtra(C66579MXk.A00(3), true);
                uaB.startActivityForResult(intent, 0);
            }
        } else {
            throw new RuntimeException();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (C13989Tnp.A08(1, i) == 0) {
            DbT.A1I(this);
            W3M.A06(AnonymousClass7TE.A0l(this.A05));
            return;
        }
        throw new RuntimeException();
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        String string;
        String string2;
        String str;
        int A022 = AnonymousClass0fD.A02(-1758730481);
        C15304UaB.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("media_id")) == null) {
            illegalArgumentException = new IllegalArgumentException("PromotePromotionInformationViewModel requires a non-null MEDIA_ID");
            i = -2078845827;
        } else {
            this.A04 = string;
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (string2 = bundle3.getString("access_token")) == null) {
                illegalArgumentException = new IllegalArgumentException("PromotePromotionInformationViewModel requires a non-null ACCESS_TOKEN");
                i = -904396863;
            } else {
                this.A02 = string2;
                Bundle bundle4 = this.mArguments;
                if (bundle4 == null || (str = bundle4.getString("ad_account_id")) == null) {
                    str = "";
                }
                this.A03 = str;
                this.A01 = VA1.A00(AnonymousClass7TE.A0l(this.A05));
                AnonymousClass0fD.A09(305352961, A022);
                return;
            }
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(7888720);
        0qQ.A0B(layoutInflater, 0);
        C18662VwK vwK = this.A01;
        if (vwK == null) {
            str = "adsManagerLogger";
        } else {
            String obj = C16678UzE.PROMOTION_INFORMATION.toString();
            String str2 = this.A04;
            if (str2 == null) {
                str = "mediaId";
            } else {
                vwK.A03(obj, str2);
                View inflate = layoutInflater.inflate(R.layout.promote_promotion_information_fragment, viewGroup, false);
                AnonymousClass0fD.A09(153266945, A022);
                return inflate;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
