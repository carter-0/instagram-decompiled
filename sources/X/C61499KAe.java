package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.tagging.model.Tag;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.KAe  reason: case insensitive filesystem */
public final class C61499KAe extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C61499KAe(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(1OC r1, Object obj, Object obj2, int i) {
        r1.A00 = new C61499KAe(i, obj, obj2);
    }

    public final void onFail(C268654dm r7) {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(387835945);
                i2 = -1266719154;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-415596245);
                ((0sP) this.A02).invoke((Object) null);
                i2 = -1762923287;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1739471477);
                0qQ.A0B(r7, 0);
                C61499KAe.super.onFail(r7);
                C59811JZf jZf = ((L07) this.A01).A00;
                SpinnerImageView spinnerImageView = jZf.A04;
                if (spinnerImageView != null) {
                    spinnerImageView.setLoadingStatus(C255943uy.FAILED);
                }
                jZf.A0G.A02 = false;
                i2 = 974930647;
                break;
            case 4:
                i = AnonymousClass0fD.A03(536761556);
                Fragment fragment = (Fragment) this.A02;
                2da r1 = (2da) this.A01;
                r1.ART(false);
                r1.setIsLoading(false);
                r1.ARb(0, true);
                FragmentActivity requireActivity = fragment.requireActivity();
                Resources resources = fragment.requireActivity().getResources();
                if (resources != null) {
                    str = resources.getString(2131961521);
                } else {
                    str = null;
                }
                C59689JTv.A03(requireActivity, str, "save_edits_failed", 0);
                i2 = 183055832;
                break;
            case 9:
                i = AnonymousClass0fD.A03(-1089976787);
                C353638Im r12 = (C353638Im) this.A02;
                if (r12.A00) {
                    r12.A00 = false;
                    ((C66496MTz) this.A01).DAH();
                    i2 = 1688107445;
                    break;
                } else {
                    i2 = 434550384;
                    break;
                }
            case 10:
                i = AnonymousClass0fD.A03(-526565374);
                C353638Im r13 = (C353638Im) this.A02;
                if (r13.A00) {
                    r13.A00 = false;
                    ((C66496MTz) this.A01).DAH();
                    i2 = 1888501441;
                    break;
                } else {
                    i2 = -1773844198;
                    break;
                }
            case 13:
                i = AnonymousClass0fD.A03(-430070735);
                DbS.A1U(this.A01);
                i2 = -400270284;
                break;
            case 15:
                i = AnonymousClass7TG.A0D(r7, -93684593);
                C61499KAe.super.onFail(r7);
                ((MT8) this.A01).Cz5();
                i2 = 1827366483;
                break;
            case 16:
                i = AnonymousClass7TG.A0D(r7, 663654459);
                C61499KAe.super.onFail(r7);
                int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                TextView textView = ((C14899UEd) this.A02).A04;
                textView.setClickable(true);
                textView.setAlpha(1.0f);
                i2 = -144059039;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = AnonymousClass0fD.A03(38796479);
                C59689JTv.A0C((Context) this.A01, "change_push_notification_settings_failed");
                ((UE3) this.A02).A05.setChecked(false);
                i2 = 1262642355;
                break;
            case 19:
                i = AnonymousClass0fD.A03(-270380269);
                C59689JTv.A0F((Context) this.A01, "clips_third_party_download_eligibility_failed", 2131974097);
                i2 = -1944967047;
                break;
            default:
                C61499KAe.super.onFail(r7);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r0v75, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        Reel reel;
        String str;
        long j;
        View view;
        int i3;
        int i4;
        String str2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1919363508);
                int A03 = AnonymousClass0fD.A03(-1098062257);
                ((AnonymousClass2hV) this.A02).apply(((DvK) obj).A00);
                AnonymousClass0fD.A0A(-1398626638, A03);
                i2 = 312542076;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-1053234203);
                AnonymousClass3JC r15 = (AnonymousClass3JC) obj;
                int A0D = AnonymousClass7TG.A0D(r15, 1498044445);
                C60855JsO jsO = (C60855JsO) r15.A01;
                if (jsO != null) {
                    reel = C63098KrR.A00(((C63917LCd) this.A01).A01, jsO, C66579MXk.A00(292), 4);
                } else {
                    reel = null;
                }
                C51965G9l.A1W(this.A02, reel);
                AnonymousClass0fD.A0A(-1979068652, A0D);
                i2 = -2037221651;
                break;
            case 2:
                i = AnonymousClass0fD.A03(575103667);
                K1S k1s = (K1S) obj;
                int A032 = AnonymousClass0fD.A03(-1676933839);
                0qQ.A0B(k1s, 0);
                C61499KAe.super.onSuccess(k1s);
                L07 l07 = (L07) this.A01;
                String str3 = k1s.A01;
                Boolean bool = k1s.A00;
                if (str3 != null) {
                    l07.A00.A0G.A00 = str3;
                }
                if (bool != null) {
                    l07.A00.A0G.A01 = bool.booleanValue();
                }
                C59811JZf jZf = l07.A00;
                SpinnerImageView spinnerImageView = jZf.A04;
                if (spinnerImageView != null) {
                    JTO.A1X(spinnerImageView);
                }
                jZf.A0G.A02 = false;
                if (jZf.A0F == C62496Kgm.GALLERY_SAVED && JTO.A19(jZf.A0H.A07).isEmpty() && str3 == null && !DbX.A1a(bool) && (view = jZf.A01) != null) {
                    view.setVisibility(0);
                }
                05G r9 = ((C321086tY) this.A02).A05;
                Map A18 = JTO.A18(r9);
                LinkedHashMap A033 = 0Yt.A03(JTO.A18(r9));
                List list = k1s.A02;
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C317966o8 A0a = JTO.A0a(it);
                    C317876nz r0 = C317876nz.A1e;
                    String str4 = A0a.A0S;
                    0qQ.A07(str4);
                    C317876nz r2 = new C317876nz((C318046oG) null, str4, AnonymousClass7TE.A1I(A0a));
                    if (A0a.A04() == AnonymousClass05K.A00) {
                        j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                    } else {
                        j = (long) (A0a.A03 * 1000.0f);
                    }
                    r2.A0G = Long.valueOf(j);
                    A0r.add(r2);
                }
                Iterator it2 = A0r.iterator();
                while (it2.hasNext()) {
                    C317876nz r4 = (C317876nz) it2.next();
                    String str5 = r4.A0Z;
                    C376649Iu r02 = (C376649Iu) A18.get(str5);
                    if (r02 != null) {
                        str = r02.A01;
                    } else {
                        str = null;
                    }
                    A033.put(str5, new C376649Iu(r4, str));
                }
                r9.Epw(A033);
                AnonymousClass0fD.A0A(-1661218199, A032);
                i2 = -1907951526;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-1878384520);
                CGO cgo = (CGO) obj;
                int A0D2 = AnonymousClass7TG.A0D(cgo, 1036702879);
                C60394Jkn jkn = ((C63926LDj) this.A02).A03;
                List list2 = jkn.A00;
                list2.clear();
                int min = Math.min(cgo.A05.size(), 5);
                for (int i5 = 0; i5 < min; i5++) {
                    list2.add(cgo.A05.get(i5));
                }
                jkn.notifyDataSetChanged();
                DbS.A1U(this.A01);
                AnonymousClass0fD.A0A(-3441813, A0D2);
                i2 = -69687148;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-520602526);
                C61290K1b k1b = (C61290K1b) obj;
                int A034 = AnonymousClass0fD.A03(1330030911);
                0qQ.A0B(k1b, 0);
                K67 k67 = (K67) this.A02;
                2da r03 = (2da) this.A01;
                r03.ART(false);
                r03.setIsLoading(false);
                r03.ARb(0, true);
                DbX.A0d(k67.A0Q).A01(k1b.A00(), true, false);
                DbT.A1J(k67);
                AnonymousClass0fD.A0A(-1828835471, A034);
                i2 = -1785550024;
                break;
            case 5:
                i = AnonymousClass0fD.A03(-1995980789);
                int A035 = AnonymousClass0fD.A03(544107406);
                C60272JiT jiT = (C60272JiT) this.A02;
                AnonymousClass7TE.A1Z(new C66182MGt((Object) jiT, (AnonymousClass4D7) null, 35), jiT.A07);
                1Ng A002 = AnonymousClass1Nd.A00((0lg) this.A01);
                C60272JiT.A00(jiT).size();
                A002.A00(new Object());
                AnonymousClass0fD.A0A(2126560771, A035);
                i2 = -1793819567;
                break;
            case 6:
                i = AnonymousClass0fD.A03(-308573212);
                K1B k1b2 = (K1B) obj;
                int A0D3 = AnonymousClass7TG.A0D(k1b2, -1878423096);
                String str6 = k1b2.A00;
                if (str6 != null) {
                    ((L4U) this.A02).A00 = str6;
                    K9I k9i = ((L1K) this.A01).A00.A0H;
                    if (k9i != null) {
                        k9i.A06();
                    }
                }
                AnonymousClass0fD.A0A(3560943, A0D3);
                i2 = 993001512;
                break;
            case 7:
                i = AnonymousClass0fD.A03(-2074344977);
                DvJ dvJ = (DvJ) obj;
                int A036 = AnonymousClass0fD.A03(-1244030644);
                0qQ.A0B(dvJ, 0);
                ((Object[]) this.A02)[0] = dvJ.A00;
                G9w.A1Z((Object[]) this.A01, 7062, 0);
                AnonymousClass0fD.A0A(1753321800, A036);
                i2 = -1083911107;
                break;
            case 8:
                i = AnonymousClass0fD.A03(-1532775760);
                1XO r152 = (1XO) obj;
                int A037 = AnonymousClass0fD.A03(-800964665);
                0qQ.A0B(r152, 0);
                C61499KAe.super.onSuccess(r152);
                List list3 = r152.A06;
                0qQ.A07(list3);
                1Xj r22 = (1Xj) 00k.A0O(list3, 0);
                if (r22 != null) {
                    1E7.A00((UserSession) this.A02).A03(r22);
                    ((C249523jv) this.A01).FIG(r22);
                }
                AnonymousClass0fD.A0A(671935402, A037);
                i2 = 1237547972;
                break;
            case 9:
                i = AnonymousClass0fD.A03(1547152334);
                K1D k1d = (K1D) obj;
                int A038 = AnonymousClass0fD.A03(1951945094);
                0qQ.A0B(k1d, 0);
                C353638Im r1 = (C353638Im) this.A02;
                if (!r1.A00) {
                    i3 = 1882821031;
                } else {
                    r1.A00 = false;
                    List list4 = k1d.A00;
                    if (list4.isEmpty()) {
                        ((C66496MTz) this.A01).DAH();
                        i3 = -217459276;
                    } else {
                        ((C66496MTz) this.A01).DAG(((C63662L1y) list4.get(0)).A00);
                        i3 = -417240019;
                    }
                }
                AnonymousClass0fD.A0A(i3, A038);
                i2 = 1131731721;
                break;
            case 10:
                i = AnonymousClass0fD.A03(-2113716523);
                CFB cfb = (CFB) obj;
                int A039 = AnonymousClass0fD.A03(2095910929);
                0qQ.A0B(cfb, 0);
                C353638Im r12 = (C353638Im) this.A02;
                if (!r12.A00) {
                    i4 = -1436548744;
                } else {
                    r12.A00 = false;
                    boolean isEmpty = cfb.A00.isEmpty();
                    C66496MTz mTz = (C66496MTz) this.A01;
                    if (isEmpty) {
                        mTz.DAH();
                        i4 = 1679924987;
                    } else {
                        mTz.DAG(MusicAssetModel.A00((OriginalSoundDataIntf) cfb.A00.get(0), false));
                        i4 = 654319021;
                    }
                }
                AnonymousClass0fD.A0A(i4, A039);
                i2 = 1127279147;
                break;
            case 11:
                i = AnonymousClass0fD.A03(-488428127);
                K1P k1p = (K1P) obj;
                int A0D4 = AnonymousClass7TG.A0D(k1p, -5238232);
                C61992KUp kUp = ((LAU) this.A02).A04;
                if (0qQ.A0K(C61992KUp.A00(kUp).A01, this.A01)) {
                    C65512Lua lua = kUp.A02;
                    if (lua == null) {
                        0qQ.A0F("musicSearchResultsView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    lua.A01(k1p);
                }
                AnonymousClass0fD.A0A(2026004826, A0D4);
                i2 = 1177079252;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = AnonymousClass0fD.A03(1800731421);
                K1P k1p2 = (K1P) obj;
                int A0D5 = AnonymousClass7TG.A0D(k1p2, -950425633);
                LFH lfh = (LFH) this.A01;
                k1p2.A00 = lfh.A01;
                C63865L9u l9u = (C63865L9u) this.A02;
                16f r13 = l9u.A03.A01.A01;
                if (lfh.A02) {
                    r13.A06(lfh, k1p2);
                }
                l9u.A00.A0A(k1p2);
                AnonymousClass0fD.A0A(1949280187, A0D5);
                i2 = -271570602;
                break;
            case 13:
                i = AnonymousClass0fD.A03(784129754);
                int A0310 = AnonymousClass0fD.A03(1091445176);
                DbS.A1U(this.A02);
                AnonymousClass0fD.A0A(872697828, A0310);
                i2 = 1564927580;
                break;
            case 14:
                i = AnonymousClass0fD.A03(-1546843613);
                int A0311 = AnonymousClass0fD.A03(708558419);
                C62108KaF kaF = (C62108KaF) this.A02;
                C66470MSy mSy = kaF.A04;
                if (mSy != null) {
                    Object tag = kaF.getTag();
                    0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.tagging.model.Tag<*>");
                    mSy.EDf((1Xj) this.A01, (Tag) tag);
                }
                AnonymousClass0fD.A0A(-1708905247, A0311);
                i2 = 789530184;
                break;
            case 15:
                i = AnonymousClass0fD.A03(-987796445);
                C270194gL r153 = (C270194gL) obj;
                int A0312 = AnonymousClass0fD.A03(-1344552870);
                0qQ.A0B(r153, 0);
                ((MT8) this.A01).Cz5();
                VU2 vu2 = (VU2) this.A02;
                UserSession userSession = vu2.A01;
                Reel A0G = 1OP.A05(userSession).A0G(r153);
                AnonymousClass3BQ r7 = AnonymousClass3BQ.UPCOMING_EVENTS_BOTTOM_SHEET;
                C270194gL r04 = A0G.A0H;
                if (r04 != null) {
                    C278114wI r05 = r04.A06;
                    if (r05 == null) {
                        r05 = C278114wI.UNKNOWN;
                    }
                    if (r05.A00()) {
                        C59689JTv.A07(vu2.A00, 2131965437);
                        AnonymousClass0fD.A0A(-2001742731, A0312);
                        i2 = 1350892825;
                        break;
                    }
                }
                F8Q.A01(vu2.A00, userSession, A0G, r7, (String) null, (String) null, AnonymousClass7TE.A1I(A0G), 0, false, false);
                AnonymousClass0fD.A0A(-2001742731, A0312);
                i2 = 1350892825;
            case 16:
                i = AnonymousClass0fD.A03(-1747336534);
                int A0D6 = AnonymousClass7TG.A0D(obj, -1125074282);
                C61499KAe.super.onSuccess(obj);
                C310336ap A0W = DbV.A0W();
                int i6 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                Resources resources = ((C14899UEd) this.A02).A04.getResources();
                User user = ((WSZ) this.A01).A01;
                A0W.A0D = AnonymousClass7TF.A0e(resources, user.getUsername(), 2131965455);
                A0W.A09 = user.Bh3();
                A0W.A0B(C310356ar.CIRCULAR);
                DbY.A1N(A0W);
                AnonymousClass0fD.A0A(-664949863, A0D6);
                i2 = 517873253;
                break;
            case 17:
                i = AnonymousClass0fD.A03(39367935);
                DwO dwO = (DwO) obj;
                int A0313 = AnonymousClass0fD.A03(1336481259);
                0qQ.A0B(dwO, 0);
                for (C47157DrY drY : dwO.A01) {
                    List<AnonymousClass9JM> list5 = drY.A06;
                    if (!list5.isEmpty()) {
                        AnonymousClass9JM r06 = (AnonymousClass9JM) 00k.A0O(list5, 0);
                        if (r06 != null) {
                            str2 = r06.A01;
                        } else {
                            str2 = null;
                        }
                        if ("live_broadcast".equals(str2)) {
                            for (AnonymousClass9JM r07 : list5) {
                                String str7 = r07.A03;
                                if (str7 == null) {
                                    str7 = "off";
                                }
                                if (AnonymousClass7TF.A1Y(r07.A00, true)) {
                                    ((LA4) this.A02).A00 = str7;
                                }
                            }
                        }
                    }
                }
                ((LA4) this.A02).A01 = true;
                DbS.A1U(this.A01);
                AnonymousClass0fD.A0A(-749421107, A0313);
                i2 = 995749760;
                break;
            case 19:
                i = AnonymousClass0fD.A03(-1307416901);
                K17 k17 = (K17) obj;
                int A0314 = AnonymousClass0fD.A03(293412111);
                0qQ.A0B(k17, 0);
                if (k17.A00) {
                    ((C49705F2q) this.A02).A00();
                } else {
                    C59689JTv.A01((Context) this.A01, "clips_not_downloadable", 2131974097, 0);
                }
                AnonymousClass0fD.A0A(154149702, A0314);
                i2 = -270291013;
                break;
            default:
                C61499KAe.super.onSuccess(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
