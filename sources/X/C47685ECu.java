package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.ECu  reason: case insensitive filesystem */
public final class C47685ECu extends 1P0 {
    public final int A00;
    public final Object A01;

    public C47685ECu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFail(C268654dm r6) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(919027586);
                Fragment fragment = (Fragment) ((C50109FOz) this.A01).A01;
                if (fragment.getContext() != null) {
                    C59689JTv.A03(fragment.getContext(), fragment.getString(2131974093), "something_went_wrong", 0);
                }
                i2 = 305663334;
                break;
            case 1:
                i = AnonymousClass0fD.A03(1403893040);
                Fragment fragment2 = (Fragment) this.A01;
                if (fragment2.getContext() != null) {
                    C59689JTv.A0B(fragment2.getContext(), "something_went_wrong");
                }
                i2 = 1312344154;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1218529032);
                C59689JTv.A0F((Context) this.A01, "nominate_clips_failed", 2131968489);
                i2 = -1347900103;
                break;
            case 7:
                i = AnonymousClass0fD.A03(251262470);
                i2 = 132255243;
                break;
            case 8:
                i = AnonymousClass0fD.A03(507746444);
                i2 = -110875583;
                break;
            default:
                C47685ECu.super.onFail(r6);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        if (this.A00 != 0) {
            C47685ECu.super.onFinish();
            return;
        }
        int A03 = AnonymousClass0fD.A03(-1745289291);
        DbW.A1K(((E5A) ((C50109FOz) this.A01).A01).A04);
        AnonymousClass0fD.A0A(-1802394082, A03);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(327058961);
                i2 = 89006107;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-2099255106);
                i2 = -56753666;
                break;
            default:
                C47685ECu.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        String string;
        View.OnClickListener fOz;
        C48236EbH ebH;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(1027141155);
                int A032 = AnonymousClass0fD.A03(-312148054);
                Fragment fragment = (Fragment) ((C50109FOz) this.A01).A01;
                if (fragment.getContext() != null) {
                    DbZ.A0w(fragment.getContext(), fragment, 2131974818);
                }
                AnonymousClass0fD.A0A(825156921, A032);
                i = 1468502009;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(1515456894);
                DwJ dwJ = (DwJ) obj;
                int A033 = AnonymousClass0fD.A03(569328990);
                E6Y e6y = (E6Y) this.A01;
                dwJ.getClass();
                e6y.A04 = dwJ;
                C47570E8i e8i = e6y.A03;
                e8i.A00 = dwJ;
                e8i.A06();
                e8i.A00.getClass();
                DwJ dwJ2 = e8i.A00;
                String str = dwJ2.A09;
                String str2 = dwJ2.A08;
                if (!TextUtils.isEmpty(str)) {
                    e8i.A08(e8i.A03, str);
                }
                List unmodifiableList = Collections.unmodifiableList(e8i.A00.A0D);
                if (unmodifiableList != null) {
                    for (int i2 = 0; i2 < unmodifiableList.size(); i2++) {
                        e8i.A08(e8i.A02, unmodifiableList.get(i2));
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    DwJ dwJ3 = e8i.A00;
                    int intValue = dwJ3.A03.intValue();
                    if (intValue == 4 || intValue == 2) {
                        e8i.A08(e8i.A01, dwJ3);
                    }
                }
                e8i.A07();
                if (e6y.getContext() != null) {
                    DwJ dwJ4 = e6y.A04;
                    if (dwJ4 == null || (ebH = dwJ4.A01) == null) {
                        igdsBottomButtonLayout = e6y.A01;
                        string = e6y.getString(2131974797);
                        fOz = new C50109FOz((Object) e6y, 9);
                    } else {
                        igdsBottomButtonLayout = e6y.A01;
                        string = ebH.A00;
                        fOz = new FP7(38, (Object) e6y, (Object) ebH);
                    }
                    igdsBottomButtonLayout.setPrimaryAction(string, fOz);
                    e6y.A01.setPrimaryButtonEnabled(true);
                    e6y.A01.setVisibility(0);
                }
                e6y.A04.getClass();
                if (1Wj.A00 != null) {
                    HashMap A1E = AnonymousClass7TE.A1E();
                    String str3 = e6y.A04.A0B;
                    if (str3 == null) {
                        str3 = "";
                    }
                    A1E.put("sd_reporter_tag", str3);
                    1Wj.A00.A00(e6y.requireActivity(), e6y.A00, "282648673464909", A1E);
                }
                AnonymousClass0fD.A0A(545571323, A033);
                i = -1500710642;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(2096022229);
                1XR r10 = (1XR) obj;
                int A0D = AnonymousClass7TG.A0D(r10, 1108219555);
                if (r10.isOk()) {
                    Context context = (Context) this.A01;
                    Drawable drawable = context.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
                    if (drawable != null) {
                        DbX.A11(context, drawable, R.color.design_dark_default_color_on_background);
                        C310336ap A0a = DbS.A0a();
                        A0a.A0B(C310356ar.CIRCULAR);
                        DbT.A1D(context.getResources(), A0a, 2131968492);
                        A0a.A0N = true;
                        A0a.A0I = context.getResources().getString(2131968491);
                        A0a.A04 = drawable;
                        A0a.A06();
                        DbY.A1N(A0a);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                AnonymousClass0fD.A0A(-33393272, A0D);
                i = -662487950;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(391022718);
                int A034 = AnonymousClass0fD.A03(-175540213);
                C59689JTv.A07((Context) this.A01, 2131952386);
                AnonymousClass0fD.A0A(-509319873, A034);
                i = 1011044947;
                break;
            case 4:
                A03 = AnonymousClass0fD.A03(1929229139);
                AnonymousClass370 r102 = (AnonymousClass370) obj;
                int A0D2 = AnonymousClass7TG.A0D(r102, 439961389);
                ((C284945Oz) this.A01).Epw(C324696zk.A00(r102));
                AnonymousClass0fD.A0A(-1240855705, A0D2);
                i = -1586801317;
                break;
            case 5:
                A03 = AnonymousClass0fD.A03(2118295348);
                1XO r103 = (1XO) obj;
                int A035 = AnonymousClass0fD.A03(-2026118640);
                if (!r103.A06.isEmpty()) {
                    boolean z = false;
                    1Xj A0T = DbZ.A0T(r103.A06, 0);
                    A0T.getClass();
                    C47497E5c e5c = (C47497E5c) this.A01;
                    User A2A = A0T.A2A(e5c.A00);
                    e5c.A01 = A2A;
                    A2A.getClass();
                    e5c.A05 = true;
                    if (e5c.A01.B6o() == FollowStatus.A06) {
                        z = true;
                    }
                    e5c.A06 = z;
                    e5c.A03 = new FAJ(e5c.requireContext(), e5c.A00, A0T);
                    C47497E5c.A01(e5c);
                }
                AnonymousClass0fD.A0A(-688771578, A035);
                i = -939542723;
                break;
            case 6:
                A03 = AnonymousClass0fD.A03(248518484);
                C324576zY r104 = (C324576zY) obj;
                int A036 = AnonymousClass0fD.A03(1346755144);
                if (r104.A00() != null) {
                    C47498E5d e5d = (C47498E5d) this.A01;
                    e5d.A02 = 1OP.A05(e5d.A01).A0I(r104.A00(), false);
                    C47498E5d.A01(e5d);
                }
                AnonymousClass0fD.A0A(807543680, A036);
                i = -1238640035;
                break;
            case 7:
                A03 = AnonymousClass0fD.A03(-190792729);
                int A037 = AnonymousClass0fD.A03(194829593);
                C51031FnN fnN = (C51031FnN) this.A01;
                0xY A0p = AnonymousClass7TE.A0p(1Au.A00(fnN.A04));
                A0p.E5T(AnonymousClass000.A00(1744), true);
                A0p.apply();
                C310336ap A0a2 = DbS.A0a();
                Fragment fragment2 = fnN.A02;
                DbS.A19(fragment2.requireContext(), A0a2, 2131971620);
                A0a2.A0I = fragment2.requireContext().getString(2131971619);
                DbW.A0q(fragment2.requireContext(), A0a2, 2131971618);
                A0a2.A0L = true;
                FdH.A00(A0a2, fnN, 13);
                A0a2.A06();
                A0a2.A0J = true;
                A0a2.A0R = true;
                DbY.A1N(A0a2);
                AnonymousClass0fD.A0A(-13510503, A037);
                i = 261846557;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-678515246);
                int A038 = AnonymousClass0fD.A03(1409008754);
                C310336ap A0a3 = DbS.A0a();
                C51031FnN fnN2 = (C51031FnN) this.A01;
                Fragment fragment3 = fnN2.A02;
                DbS.A19(fragment3.requireContext(), A0a3, 2131971609);
                A0a3.A0I = fragment3.requireContext().getString(2131971608);
                DbW.A0q(fragment3.requireContext(), A0a3, 2131971607);
                A0a3.A0L = true;
                FdH.A00(A0a3, fnN2, 14);
                A0a3.A06();
                A0a3.A0J = true;
                A0a3.A0R = true;
                DbY.A1N(A0a3);
                AnonymousClass0fD.A0A(-119636030, A038);
                i = -2028651303;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
