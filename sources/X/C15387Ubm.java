package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ubm  reason: case insensitive filesystem */
public final class C15387Ubm extends AnonymousClass32G implements AnonymousClass4DR, AnonymousClass4DS, CallerContextable {
    public static final String __redex_internal_original_name = "LocationPageInfoPageFragment";
    public UserSession A00;
    public W05 A01;
    public C15260UXv A02;
    public C231002qi A03;
    public C230882qT A04;
    public String A05;
    public String A06;
    public C15460UdB A07;
    public String A08;
    public final Handler A09 = AnonymousClass7TF.A0D();

    public final void configureActionBar(2da r5) {
        String str;
        C17362VSp vSp;
        r5.Eu4(true);
        if (getActivity() != null) {
            AnonymousClass3JR r2 = new AnonymousClass3JR();
            r2.A02(AnonymousClass05K.A00);
            DbX.A19(new FP1(this, 65), r2, r5);
            String str2 = this.A02.A08;
            String string = DbV.A05(this).getString(2131951981);
            AnonymousClass7TF.A1B(str2, 1, string);
            r5.EfN(str2, string);
            C15260UXv uXv = this.A02;
            if (uXv == null || (vSp = uXv.A00) == null || vSp.A01 == null) {
                UserSession userSession = this.A00;
                0eE r22 = AnonymousClass0t1.A01;
                if (r22.A01(userSession).CPm() && (str = this.A05) != null && !str.equals(r22.A01(this.A00).A03.BaE())) {
                    if (DbY.A1Y(0Tu.A05, this.A00, 36312548328342690L)) {
                        AnonymousClass3JR r3 = new AnonymousClass3JR();
                        r3.A0A = R.layout.location_page_info_page_edit_button;
                        r3.A05 = 2131955122;
                        r3.A0G = new FP1(this, 66);
                        TextView textView = (TextView) r5.AA5(new AnonymousClass3Jb(r3));
                        textView.setText(2131955122);
                        String A002 = AnonymousClass000.A00(2787);
                        W05 A012 = A01(this);
                        A012.A04 = "impression";
                        A012.A07 = "information_page";
                        A012.A01 = A002;
                        A012.A05 = this.A05;
                        A012.A06 = this.A06;
                        A012.A01();
                        this.A04.A00(textView, QPTooltipAnchor.CLAIM_LOCATION_PAGE_BUTTON, this.A03);
                    }
                }
            }
        }
    }

    public final String getModuleName() {
        return "location_page_info_page";
    }

    public static W05 A01(C15387Ubm ubm) {
        W05 w05 = ubm.A01;
        if (w05 == null) {
            w05 = new W05(ubm.A00);
            ubm.A01 = w05;
        }
        w05.A02 = ubm.A08;
        return w05;
    }

    public static void A03(C15387Ubm ubm) {
        String str;
        String str2;
        W05 A012 = A01(ubm);
        A012.A04 = "impression";
        A012.A07 = "information_page";
        A012.A01 = "claim_location_success";
        A012.A05 = ubm.A05;
        A012.A06 = ubm.A06;
        A012.A01();
        Context context = ubm.getContext();
        ImageUrl A0X = DbX.A0X(ubm.A00);
        C15260UXv uXv = ubm.A02;
        if (uXv == null || (str2 = uXv.A05) == null) {
            str = null;
        } else {
            str = 002.A11(str2.trim(), " ", uXv.A07, " ", uXv.A0B).trim();
        }
        W5U w5u = new W5U(ubm, 28);
        String A0h = DbW.A0h(context, str, 2131955127);
        int A0C = Pxj.A0C(A0h) - Pxj.A0C(str);
        int A0C2 = Pxj.A0C(A0h);
        SpannableString spannableString = new SpannableString(0mp.A06("%s\n\n%s", new Object[]{A0h, context.getString(2131955128)}));
        spannableString.setSpan(new StyleSpan(1), A0C, A0C2, 0);
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.grey_9)), A0C, A0C2, 0);
        C358248ab r1 = new C358248ab(context);
        r1.A0r(true);
        r1.A0s(true);
        r1.A0n(A0X, ubm);
        r1.A0E(w5u);
        r1.A09(2131955129);
        r1.A0q(spannableString);
        DbT.A1V(r1);
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A00;
    }

    public static void A02(C15387Ubm ubm) {
        C309516Yo r5 = new C309516Yo(ubm.requireActivity(), ubm.A00);
        1a1 A022 = C46447Df9.A02();
        UserSession userSession = ubm.A00;
        C46474Dfc.A02(r5, userSession, A022, C46548Dgp.A01(userSession, ubm.A02.A00.A01.getId(), "location_feed_info_page_related_business", "location_page_info_page"));
    }

    public static void A04(C15387Ubm ubm, Integer num) {
        String str;
        int intValue = num.intValue();
        if (intValue == 0) {
            str = "address";
        } else if (intValue == 4) {
            str = "website";
        } else if (intValue != 5) {
            str = null;
        } else {
            str = "call";
        }
        A01(ubm).A02((0xF) null, (0xF) null, "information_page", "tap_component", str, ubm.A06, ubm.A05, (String) null, (Map) null);
    }

    public static void A05(C15387Ubm ubm, String str) {
        A01(ubm).A02((0xF) null, (0xF) null, "information_page", "tap_component", str, ubm.A06, ubm.A05, (String) null, (Map) null);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        LoginClient$Result loginClient$Result;
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            W05 A012 = A01(this);
            A012.A04 = "finish_step";
            A012.A07 = "edit_location_page";
            A012.A05 = this.A05;
            A012.A06 = this.A06;
            A012.A01();
            return;
        }
        CallerContext callerContext = 1KM.A00;
        if (i == 64206 && i2 == -1) {
            UserSession userSession = this.A00;
            String str = null;
            boolean z = false;
            if (!(intent == null || (extras = intent.getExtras()) == null)) {
                Object obj = extras.get(AnonymousClass000.A00(554));
                if ((obj instanceof LoginClient$Result) && (loginClient$Result = (LoginClient$Result) obj) != null) {
                    LoginClient$Request loginClient$Request = loginClient$Result.A01;
                    str = loginClient$Request.A01;
                    z = loginClient$Request.A02;
                }
            }
            C49822F8k.A00();
            HashMap hashMap = new HashMap();
            hashMap.put(AnonymousClass000.A00(601), String.valueOf(AnonymousClass1G3.A03()));
            hashMap.put("exception", (Object) null);
            C9831Rht.A00(userSession, AnonymousClass000.A00(1336), str, hashMap, z);
        }
    }

    public final boolean onBackPressed() {
        W05 A012 = A01(this);
        A012.A04 = "cancel";
        A012.A07 = "information_page";
        A012.A06 = this.A06;
        A012.A05 = this.A05;
        A012.A01();
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v44, types: [X.VSp, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1657016802);
        C15387Ubm.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        this.A06 = requireArguments.getString("location_id_key");
        this.A05 = requireArguments.getString("fb_page_id_key");
        this.A08 = requireArguments.getString("info_page_logging_entry_point");
        String A002 = AnonymousClass000.A00(693);
        if (requireArguments.containsKey(A002)) {
            LocationPageInformation locationPageInformation = (LocationPageInformation) requireArguments.getParcelable(A002);
            String str = locationPageInformation.A08;
            String str2 = locationPageInformation.A09;
            String str3 = locationPageInformation.A0A;
            String str4 = locationPageInformation.A06;
            String str5 = locationPageInformation.A05;
            String str6 = locationPageInformation.A07;
            Integer num = locationPageInformation.A04;
            String str7 = locationPageInformation.A0B;
            User A003 = locationPageInformation.A00();
            LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse = locationPageInformation.A01;
            boolean z = locationPageInformation.A0C;
            Integer num2 = locationPageInformation.A02;
            1XQ r1 = new 1XQ();
            r1.A08 = str;
            r1.A09 = str2;
            r1.A0A = str3;
            r1.A06 = str4;
            r1.A05 = str5;
            r1.A07 = str6;
            r1.A04 = num;
            r1.A0B = str7;
            ? obj = new Object();
            r1.A00 = obj;
            obj.A01 = A003;
            r1.A01 = locationPageInfoPageOperationHourResponse;
            r1.A0C = z;
            r1.A02 = num2;
            this.A02 = r1;
        }
        Context context = getContext();
        C15260UXv uXv = this.A02;
        C15460UdB udB = new C15460UdB(context, this, this.A00, uXv, new VOS(this), new C18420VrP(this));
        this.A07 = udB;
        A0V(udB);
        W05 A012 = A01(this);
        A012.A04 = "start_step";
        A012.A07 = "information_page";
        A012.A05 = this.A05;
        A012.A06 = this.A06;
        C15260UXv uXv2 = this.A02;
        ArrayList arrayList = new ArrayList();
        C17362VSp vSp = uXv2.A00;
        if (!(vSp == null || vSp.A01 == null)) {
            arrayList.add("business");
        }
        if (!TextUtils.isEmpty(uXv2.A05)) {
            arrayList.add("address");
        }
        if (!TextUtils.isEmpty(uXv2.A06)) {
            arrayList.add("category");
        }
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse2 = uXv2.A01;
        if (!(locationPageInfoPageOperationHourResponse2 == null || locationPageInfoPageOperationHourResponse2.A03 == null)) {
            arrayList.add("hours");
        }
        if (uXv2.A03 != null) {
            arrayList.add("price");
        }
        if (!TextUtils.isEmpty(uXv2.A0A)) {
            arrayList.add("website");
        }
        if (!TextUtils.isEmpty(uXv2.A09)) {
            arrayList.add("call");
        }
        A012.A08 = arrayList;
        A012.A01();
        1YN A004 = AnonymousClass2bO.A00();
        UserSession userSession = this.A00;
        HashMap hashMap = new HashMap();
        hashMap.put(QPTooltipAnchor.EDIT_LOCATION_PAGE_INFO_BUTTON, new Object());
        hashMap.put(QPTooltipAnchor.CLAIM_LOCATION_PAGE_BUTTON, new Object());
        C230882qT A042 = A004.A04(userSession, hashMap);
        this.A04 = A042;
        registerLifecycleListener(A042);
        1YN A005 = AnonymousClass2bO.A00();
        UserSession userSession2 = this.A00;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0d;
        AnonymousClass2bO.A00();
        C231002qi A023 = A005.A02(this, this, userSession2, 2bV.A06(new WZY(this, 1), this.A04), quickPromotionSlot);
        this.A03 = A023;
        A023.Dh3();
        AnonymousClass0fD.A09(95494320, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(832165024);
        unregisterLifecycleListener(this.A04);
        super.onDestroy();
        AnonymousClass0fD.A09(-1651159732, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1643288601);
        C15387Ubm.super.onPause();
        W05 A012 = A01(this);
        A012.A04 = "finish_step";
        A012.A07 = "information_page";
        A012.A05 = this.A05;
        A012.A06 = this.A06;
        A012.A01();
        AnonymousClass0fD.A09(1479322369, A022);
    }

    public final void onResume() {
        C17362VSp vSp;
        User user;
        int A022 = AnonymousClass0fD.A02(1951326751);
        super.onResume();
        this.A07.A0C();
        C15260UXv uXv = this.A02;
        if (!(uXv == null || (vSp = uXv.A00) == null || (user = vSp.A01) == null)) {
            String id = user.getId();
            0xF r4 = new 0xF();
            0xF.A00(r4, id, "profile_id");
            C295745oq r0 = this.A02.A00.A00;
            if (r0 != null) {
                C295775ot r02 = r0.A01;
                0qQ.A0A(r02);
                List<C295795ov> list = r02.A0E;
                if (list != null) {
                    0xE r2 = new 0xE();
                    for (C295795ov A002 : list) {
                        r2.A04(A002.A00());
                    }
                    0xF.A00(r4, r2, "available_media");
                }
            }
            W05 A012 = A01(this);
            A012.A04 = "impression";
            A012.A07 = "information_page";
            A012.A01 = "related_profile";
            A012.A05 = this.A05;
            A012.A06 = this.A06;
            A012.A00 = r4;
            A012.A01();
        }
        AnonymousClass0fD.A09(1189106793, A022);
    }
}
