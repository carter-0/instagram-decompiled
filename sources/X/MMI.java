package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.archive.fragment.ArchiveReelHighlightsFragment;
import com.instagram.archive.fragment.ArchiveReelRecycleBinFragment;
import com.instagram.common.session.UserSession;
import go.Seq;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import org.webrtc.EglBase14Impl;

public final class MMI extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMI(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new MMI(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Context context;
        JZ8 jz8;
        switch (this.A00) {
            case 0:
                return new C64823Lij((LFO) this.A01, AnonymousClass12T.A00);
            case 1:
                Fragment fragment = (Fragment) this.A01;
                String A0m = DbU.A0m(fragment, 2131953031);
                Integer valueOf = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                return new Ou7(A0m, valueOf, valueOf, valueOf, valueOf, AnonymousClass05K.A0C, Integer.valueOf(2Yu.A08(fragment.getContext())), R.style.PrivacyTextStyle);
            case 2:
                2YL A0H = DbS.A0H(((K8G) this.A01).A09);
                MHA.A03(A0H, C318116oQ.A00(A0H), 41);
                break;
            case 3:
                K8G k8g = (K8G) this.A01;
                Bundle requireArguments = k8g.requireArguments();
                UserSession A0l = AnonymousClass7TE.A0l(k8g.A08);
                String str2 = k8g.A00;
                String A012 = C320236s2.A01(requireArguments, "arg_media_id");
                String A013 = C320236s2.A01(requireArguments, "arg_creator_id");
                String string = requireArguments.getString("arg_entry_point");
                if (string == null) {
                    string = "unknown";
                }
                LRN lrn = new LRN(new QP5(str2, A012, A013, string, 4), k8g, A0l);
                LRO.A01(LRN.A01(lrn, AnonymousClass05K.A0j, AnonymousClass05K.A05), lrn);
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                if (new BitSet(0).nextClearBit(0) >= 0) {
                    C11844ShW shW = new C11844ShW("com.bloks.www.screen_query.BloksStarsIGCreatorXarInfoScreenQuery", (String) null, (String) null, 0Yt.A0B(A1H), 0Yt.A0E(), 719983200, 0, true);
                    C307506Qj A002 = C48721Ej6.A00(09i.A0A.A05(k8g.requireContext()), false);
                    Context requireContext = k8g.requireContext();
                    FRI fri = new FRI((UKI) null, (Boolean) null, (Integer) null, (Integer) null, 1.0f, false, false, false, true);
                    0qQ.A0B(A002, 1);
                    shW.E0s(requireContext, fri, A002);
                    break;
                } else {
                    throw AnonymousClass7TE.A0z("Missing required params");
                }
            case 4:
                Fragment fragment2 = (Fragment) this.A01;
                String A0m2 = DbU.A0m(fragment2, 2131953037);
                Integer valueOf2 = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                return new Ou7(A0m2, valueOf2, Integer.valueOf(R.dimen.abc_button_padding_horizontal_material), valueOf2, valueOf2, AnonymousClass05K.A00, Integer.valueOf(2Yu.A07(fragment2.getContext())), R.style.igds_emphasized_label);
            case 5:
                Fragment fragment3 = (Fragment) this.A01;
                String A0m3 = DbU.A0m(fragment3, 2131953041);
                Integer valueOf3 = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                return new Ou7(A0m3, valueOf3, valueOf3, valueOf3, valueOf3, AnonymousClass05K.A0C, Integer.valueOf(2Yu.A08(fragment3.getContext())), R.style.PrivacyTextStyle);
            case 6:
                return new C63584KzX((K8G) this.A01);
            case 7:
                return new KGO(JTP.A0k(DbV.A05((Fragment) this.A01), R.dimen.achievements_list_container_height), true);
            case 8:
                return new KGO(Integer.valueOf(Dbb.A01(DbT.A08(this.A01))), true);
            case 9:
                return AnonymousClass7TE.A1I(new KGO(Integer.valueOf((int) (((float) AnonymousClass0nB.A00(DbT.A08(this.A01))) * 0.4f)), true));
            case 10:
            case 15:
            case 19:
            case 28:
            case 38:
            case 45:
                return this.A01;
            case 11:
            case 16:
            case 20:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 39:
            case 46:
                return DbT.A0r(this.A01);
            case 13:
                K8G k8g2 = (K8G) this.A01;
                Bundle requireArguments2 = k8g2.requireArguments();
                String str3 = k8g2.A00;
                String A014 = C320236s2.A01(requireArguments2, "arg_media_id");
                String A015 = C320236s2.A01(requireArguments2, "arg_creator_id");
                String string2 = requireArguments2.getString("arg_entry_point");
                if (string2 == null) {
                    string2 = "unknown";
                }
                return new KDD(new QP5(str3, A014, A015, string2, 4), k8g2, AnonymousClass7TE.A0l(k8g2.A08));
            case 14:
                return new C63585KzY((K86) this.A01);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                K86 k86 = (K86) this.A01;
                Bundle requireArguments3 = k86.requireArguments();
                return new KEN(k86.requireActivity(), k86, AnonymousClass7TE.A0l(k86.A07), C320236s2.A01(requireArguments3, "arg_gifting_media_id"), C320236s2.A01(requireArguments3, "arg_gifting_creator_id"), C320236s2.A01(requireArguments3, "arg_gifting_entry_point"));
            case 22:
                K80 k80 = (K80) this.A01;
                UserSession A0l2 = AnonymousClass7TE.A0l(k80.A03);
                return new C355608Qq(k80.requireContext(), A0l2, AnonymousClass05K.A00, DbX.A07(k80.A02), DbX.A07(k80.A01), true);
            case 23:
                Fragment fragment4 = (K2U) this.A01;
                Context requireContext2 = fragment4.requireContext();
                0gy A003 = AnonymousClass07i.A00(fragment4);
                Object value = fragment4.A01.getValue();
                0qQ.A0B(value, 2);
                return new C61588KDp(0, requireContext2, A003, value);
            case 24:
                UserSession userSession = ((C60084JfQ) this.A01).A02;
                0Tu r2 = 0Tu.A05;
                List A004 = JZ9.A00(182.A04(r2, userSession, 36880793976963432L));
                if (!A004.isEmpty()) {
                    return A004;
                }
                if (182.A06(r2, userSession, 36327627958729289L)) {
                    return AnonymousClass7TE.A1I(JZ8.CAMERA_ROLL);
                }
                0qQ.A0B(userSession, 0);
                JZ8[] jz8Arr = new JZ8[2];
                if (182.A06(r2, userSession, 36327627958598215L)) {
                    jz8Arr[0] = JZ8.CAMERA_ROLL;
                    jz8 = JZ8.SCENE;
                } else {
                    jz8Arr[0] = JZ8.SCENE;
                    jz8 = JZ8.CAMERA_ROLL;
                }
                jz8Arr[1] = jz8;
                return 0sr.A1P(jz8Arr);
            case 25:
                String A04 = 182.A04(0Tu.A05, ((C63794L7a) this.A01).A02, 36880793977028969L);
                if (!0sc.A07(new String[]{"tile", "fit", "fill"}).contains(A04)) {
                    A04 = "fill";
                }
                return new JSONObject(DbY.A0p("aspectRatio", A04, AnonymousClass7TE.A1L("mediaType", "gif")));
            case 26:
            case 34:
                return C51971G9r.A0U(this.A01);
            case 27:
            case 35:
                return JTR.A0b(this.A01);
            case 31:
                return new KBO(JTR.A0R((Fragment) this.A01));
            case 32:
                return Integer.valueOf(JTO.A05((float) DbX.A07(((K80) this.A01).A02), 0.5625f));
            case 33:
                K80 k802 = (K80) this.A01;
                Context requireContext3 = k802.requireContext();
                k802.A03.getValue();
                return Integer.valueOf(AnonymousClass8XE.A01(requireContext3));
            case 36:
                ((AnonymousClass8XW) this.A01).A08();
                break;
            case 37:
                return new GJ0((UserSession) this.A01);
            case Seq.NULL_REFNUM:
                K71 k71 = (K71) this.A01;
                UserSession A0l3 = AnonymousClass7TE.A0l(k71.A0B);
                String str4 = k71.A07;
                if (str4 == null) {
                    str = "profileTabSessionId";
                } else {
                    String str5 = k71.A08;
                    if (str5 != null) {
                        return new KDE(A0l3, str4, str5);
                    }
                    str = "targetUserId";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case Seq.RefTracker.REF_OFFSET:
                1ZN A005 = C297725sE.A00();
                C15331Uag uag = (C15331Uag) this.A01;
                return A005.A02(uag.requireContext(), C16601Uxv.IG_AR_ADS, new VM7(), AnonymousClass7TE.A0l(uag.A0M), uag.getModuleName());
            case 43:
                1ZN A006 = C297725sE.A00();
                C15331Uag uag2 = (C15331Uag) this.A01;
                return A006.A02(uag2.requireContext(), C16601Uxv.IG_AR_DYNAMIC_ADS, new VM7(), AnonymousClass7TE.A0l(uag2.A0M), AnonymousClass000.A00(3365));
            case 44:
                return new U9T(this.A01, 1);
            case 48:
                ArchiveReelHighlightsFragment archiveReelHighlightsFragment = (ArchiveReelHighlightsFragment) this.A01;
                AnonymousClass0eM r1 = archiveReelHighlightsFragment.A05;
                UserSession A0l4 = AnonymousClass7TE.A0l(r1);
                Context context2 = archiveReelHighlightsFragment.getContext();
                if (context2 != null) {
                    context = context2.getApplicationContext();
                } else {
                    context = null;
                }
                0qQ.A0C(context, AnonymousClass000.A00(29));
                return new KES((Application) context, archiveReelHighlightsFragment, A0l4, DbU.A0u(r1), 12, true);
            case 49:
                return new KCR(AnonymousClass7TE.A0l(((ArchiveReelRecycleBinFragment) this.A01).A0B));
            default:
                return DbY.A0I(this.A01);
        }
        return C60340gF.A00;
    }
}
