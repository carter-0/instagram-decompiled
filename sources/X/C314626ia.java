package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.IOException;
import java.io.StringWriter;
import java.util.UUID;

/* renamed from: X.6ia  reason: invalid class name and case insensitive filesystem */
public final class C314626ia {
    public Fragment A00;
    public C255783ui A01;
    public C275794rx A02;
    public final int A03;
    public final Context A04;
    public final View A05;
    public final AnonymousClass4DH A06;
    public final UserSession A07;
    public final C314616iZ A08;
    public final AnonymousClass32A A09;
    public final AnonymousClass4DU A0A;

    public C314626ia(Context context, View view, AnonymousClass4DH r5, UserSession userSession, AnonymousClass4DU r7, C314616iZ r8) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r8, 7);
        this.A04 = context;
        this.A0A = r7;
        this.A05 = view;
        this.A07 = userSession;
        this.A06 = r5;
        this.A08 = r8;
        this.A09 = new AnonymousClass32A(r5, userSession, new AnonymousClass328(r5, -1));
        this.A03 = context.getResources().getDimensionPixelOffset(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
    }

    public final void A02(MusicOverlayStickerModel musicOverlayStickerModel) {
        FragmentActivity activity = this.A06.getActivity();
        if (activity != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
                C255673uX.A00(A0A2, musicOverlayStickerModel, true);
                A0A2.close();
                String obj = stringWriter.toString();
                UserSession userSession = this.A07;
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
                bundle.putString("source_media_id", (String) null);
                if (obj != null) {
                    bundle.putString("music_sticker_model_json", obj);
                }
                K72 k72 = new K72();
                k72.setArguments(bundle);
                String obj2 = UUID.randomUUID().toString();
                0qQ.A07(obj2);
                k72.A0B = new L53(this, obj2);
                k72.A08 = new C65490LuE(this);
                C331127Pr r1 = new C331127Pr(userSession);
                r1.A0T = new C50970Flx(this);
                r1.A00().A02(activity, k72);
            } catch (IOException unused) {
                this.A08.DcF();
                0wb.A03("ReelInteractiveController", "Could not json serialize MusicOverlayStickerModel for the music consumption sheet");
            }
        }
    }

    private final void A00(DDv dDv) {
        String str = dDv.A06;
        if (str != null && str.length() != 0) {
            this.A08.EJZ(str, dDv.A0A);
        }
    }

    public final boolean A04() {
        C275794rx r0 = this.A02;
        if (r0 == null || !r0.isShowing()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0182, code lost:
        r8 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x018d, code lost:
        if (X.182.A06(r8, r15, 36325201302860503L) == false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x018f, code lost:
        r4 = r0.A06.requireActivity();
        r6 = new X.C66297MMg(r0, 46);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a5, code lost:
        if (X.182.A06(r8, r15, 36325201302991577L) == false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a7, code lost:
        r7 = X.AnonymousClass2k4.NIGHT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a9, code lost:
        r10 = new android.os.Bundle();
        r10.putString("IgSessionManager.SESSION_TOKEN_KEY", r15.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01be, code lost:
        if (X.182.A06(r8, r15, 36325201303057114L) == false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c0, code lost:
        r10.putParcelable("args_music_vinyl_cover_artwork_uri", r5.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c7, code lost:
        r3 = new X.K7O();
        r3.setArguments(r10);
        r3.dayNightMode = r7;
        r2 = new X.C331127Pr(r15);
        r2.A0T = r3;
        r2.A0O = r7;
        r2.A03 = 0.66f;
        r2.A0U = new X.C72949PQh(r6);
        r2.A0T = r3;
        r2.A14 = false;
        r2.A0g = r4.getString(2131967776);
        r2.A0K = new X.LX1(r3);
        r2.A0h = r4.getString(2131968513);
        r2.A0L = new X.AN9(r4);
        r0 = r2.A00();
        r0.A0R(true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0213, code lost:
        r7 = X.AnonymousClass2k4.DEFAULT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0216, code lost:
        A01(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0219, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x021e, code lost:
        if (r2.A10 == X.AnonymousClass3WT.AVATAR) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x022b, code lost:
        if (X.182.A06(X.0Tu.A05, r15, 36323844092341824L) == false) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x022d, code lost:
        r3 = r0.A06.requireActivity();
        r6 = r2.A1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0235, code lost:
        if (r6 == null) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0237, code lost:
        r5 = new X.C66297MMg(r0, 44);
        r2 = new X.K7Q();
        r1 = new android.os.Bundle();
        r1.putString("MEDIA_ID", r6);
        r2.setArguments(r1);
        r4 = new X.C331127Pr(r15);
        r4.A0T = r2;
        r4.A0d = r3.getString(2131974462);
        r4.A0g = r3.getString(2131974461);
        r4.A0K = new X.FNV(r15, r3, r6);
        r0 = new X.C72950PQi(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x027c, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027d, code lost:
        r3 = r2.A1b;
        r2 = r2.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0281, code lost:
        if (r2 == null) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0283, code lost:
        r1 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0285, code lost:
        if (r1 == null) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0287, code lost:
        r1.Bh3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028a, code lost:
        r6 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028c, code lost:
        if (r6 == null) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x028e, code lost:
        if (r3 == null) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0290, code lost:
        r5 = new X.C49390Eus(r0);
        r4 = r0.A06.requireActivity();
        r0 = X.17h.A00(r15).A02(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a3, code lost:
        if (r0 == null) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a5, code lost:
        r3 = new X.E1B();
        r2 = new android.os.Bundle();
        X.C227642jf.A04(r2, r15);
        r2.putString("ShareToFriendsStoryConsumptionFragment.ARGUMENTS_KEY_CONSUMPTION_REEL_OWNER", r0.getUsername());
        r2.putParcelable("ShareToFriendsStoryConsumptionFragment.ARGUMENTS_KEY_CONSUMPTION_REEL_PRODUCER", r6);
        r3.setArguments(r2);
        r3.A00 = r5;
        r1 = new X.C331127Pr(r15);
        r1.A0d = r4.getString(2131956556);
        r0 = r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d7, code lost:
        r0.A02(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02da, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02db, code lost:
        r1 = r2.A1C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02dd, code lost:
        if (r1 == null) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02df, code lost:
        A00(r1);
        r0 = X.1Au.A00(r15);
        r2 = r1.A00;
        r1 = r0.A01.AR4();
        r0 = "anti_bully_tooltip_shown_count";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02f1, code lost:
        r1 = r2.A1D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f3, code lost:
        if (r1 == null) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02f5, code lost:
        A00(r1);
        r0 = X.1Au.A00(r15);
        r2 = r1.A00;
        r1 = r0.A01.AR4();
        r0 = "anti_bully_global_tooltip_shown_count";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        r3 = r2.A11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0307, code lost:
        r1 = r2.A1G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0309, code lost:
        if (r1 == null) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x030b, code lost:
        A00(r1);
        r0 = X.1Au.A00(r15);
        r2 = r1.A00;
        r1 = r0.A01.AR4();
        r0 = "voter_registration_tooltip_shown_count";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x031c, code lost:
        r1.E5Z(r0, r2);
        r1.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0322, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0323, code lost:
        r4 = r2.A1F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0325, code lost:
        if (r4 == null) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0327, code lost:
        r3 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0329, code lost:
        if (r3 == null) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r3 == X.AnonymousClass3WT.NOTIFY_ME) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x032f, code lost:
        if (r3.length() != 0) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0331, code lost:
        A00(r4);
        r2 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0336, code lost:
        if (r2 == null) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0338, code lost:
        X.1Au.A00(r15).A10(r2, r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0341, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0342, code lost:
        r8.D43(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0345, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0346, code lost:
        r8.DEu(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0349, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x034a, code lost:
        r8.DEy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x034d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x034e, code lost:
        r8.DUk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0351, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0352, code lost:
        r8.Ct6();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0355, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0356, code lost:
        r3 = r0.A06.requireActivity();
        r1 = new X.C66297MMg(r0, 45);
        r2 = new X.K7U();
        r4 = new X.C331127Pr(r15);
        r4.A0T = r2;
        r4.A0d = r3.getString(2131964449);
        r4.A0g = r3.getString(2131964448);
        r4.A0K = new X.C71328OiZ(r3, r15);
        r0 = new X.C72948PQg(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x038d, code lost:
        r4.A0U = r0;
        r0 = r4.A00();
        r0.A0Q(true);
        r0.A02(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0399, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x039a, code lost:
        r1 = r2.A0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x039c, code lost:
        if (r1 == null) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r3 != X.AnonymousClass3WT.ACHIEVEMENT_STICKER) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x039e, code lost:
        r2 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a0, code lost:
        if (r2 == null) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03a2, code lost:
        r13 = X.FC8.A01();
        r14 = r0.A06.requireActivity();
        r1 = X.C49280EsP.A00;
        r13.A03(r14, r15, new X.Fm4(r0), r2, "promo_story_sticker");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03bc, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03c2, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03ce, code lost:
        if (X.182.A06(X.0Tu.A05, r15, 36319858362752697L) != false) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03d0, code lost:
        r8.CxO(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03d3, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r8.Ck1(r2, r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03d6, code lost:
        if (r2.A0j == null) goto L_0x05ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03d8, code lost:
        r3 = r8.AqN();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03dc, code lost:
        if (r3 == null) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03de, code lost:
        r12 = X.C56591I2v.A00(r3, r15);
        r10 = r2.A11.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03ea, code lost:
        if (r10 == 4) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03ee, code lost:
        if (r10 == 26) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03f0, code lost:
        switch(r10) {
            case 5: goto L_0x0497;
            case 7: goto L_0x0497;
            case 10: goto L_0x0497;
            case 11: goto L_0x048f;
            case com.instagram.react.modules.base.IgReactQEModule.CONFIG_KEY_OFFSET :int: goto L_0x0497;
            case 15: goto L_0x0497;
            case org.webrtc.EglBase14Impl.EGLExt_SDK_VERSION :int: goto L_0x048f;
            case 19: goto L_0x0497;
            case 21: goto L_0x0497;
            case 23: goto L_0x048a;
            case 24: goto L_0x048a;
            case 27: goto L_0x048a;
            case 28: goto L_0x048a;
            case 30: goto L_0x0481;
            case 32: goto L_0x0497;
            case 33: goto L_0x0497;
            case 37: goto L_0x0497;
            case 38: goto L_0x0497;
            case 43: goto L_0x0497;
            case 44: goto L_0x0497;
            case 48: goto L_0x0497;
            case com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE :int: goto L_0x0497;
            case 52: goto L_0x0497;
            case 58: goto L_0x0497;
            case 59: goto L_0x03fb;
            case 63: goto L_0x0469;
            case 66: goto L_0x0497;
            case 70: goto L_0x0466;
            case 73: goto L_0x0497;
            default: goto L_0x03f3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03fa, code lost:
        throw new java.lang.UnsupportedOperationException("Unsupported interactive type for popup bubble");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0406, code lost:
        if (X.182.A06(X.0Tu.A05, r15, 36318282109818949L) == false) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0408, code lost:
        r4 = r2.A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x040a, code lost:
        if (r4 == null) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x040c, code lost:
        r4 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x040e, code lost:
        if (r4 != null) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0410, code lost:
        r4 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0412, code lost:
        X.C9761RgJ.A00(r15, "ig_story_tooltip_displayed", r15.A06, r4, r2.A1d, (java.util.Map) null);
        r10 = r0.A04;
        r13 = r12.A08;
        r11 = android.view.LayoutInflater.from(r13.getContext()).inflate(com.instagram.android.R.layout.fb_tag_sticker_popup_bubble, (android.view.ViewGroup) r13, false);
        r13 = r11.requireViewById(com.instagram.android.R.id.fb_tag_tooltip_text);
        X.0qQ.A07(r13);
        r4 = java.lang.String.format(java.util.Locale.getDefault(), r10.getString(2131962095), new java.lang.Object[]{"Facebook"});
        X.0qQ.A07(r4);
        ((android.widget.TextView) r13).setText(r4);
        r12.A02 = X.C54604HKn.A02;
        r12.A01 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0466, code lost:
        r2.A1N = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0469, code lost:
        r10 = r0.A04;
        r4 = r10.getString(2131971762, new java.lang.Object[]{X.C319886rO.A00(r15)});
        X.0qQ.A07(r4);
        X.C55097Hc6.A00(r10, r12, r4, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0485, code lost:
        if (X.C379169St.A01(r2) == false) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0487, code lost:
        r4 = X.C54604HKn.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x048a, code lost:
        r4 = X.C54604HKn.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x048c, code lost:
        r12.A02 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x048f, code lost:
        r4 = r2.A0W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0491, code lost:
        if (r4 == null) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0493, code lost:
        r2.A1N = r4.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0497, code lost:
        r11 = r0.A04;
        X.C55097Hc6.A00(r11, r12, r2.A0M(r11.getResources(), r15), r2.A1N);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04a6, code lost:
        r0.A02 = new X.C275794rx(r12);
        X.C56591I2v.A01(r8.AqN(), r8.AuD(), r0.A02);
        r10 = r0.A06;
        r12 = r0.A02;
        r8 = r2.A11.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04c6, code lost:
        if (r8 == 24) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04ca, code lost:
        if (r8 == 23) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04cc, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04cf, code lost:
        if (r8 == 30) goto L_0x056d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04d3, code lost:
        if (r8 == 28) goto L_0x054d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04d7, code lost:
        if (r8 == 27) goto L_0x054d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04d9, code lost:
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        r4 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04df, code lost:
        if (r4 == null) goto L_0x05c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04e1, code lost:
        r12 = r4.getContentView();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04e5, code lost:
        if (r12 == null) goto L_0x05c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04e7, code lost:
        r12.measure(r8, r8);
        r5 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04ec, code lost:
        if (r5 == null) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04ee, code lost:
        r5.A03 = new X.C65804Lzw(r3, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04f5, code lost:
        r10 = r0.A04;
        r11 = (int) X.0nA.A04(r10, r2.A08 + 40);
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0507, code lost:
        if ((r29 - r11) >= r12.getMeasuredHeight()) goto L_0x050a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0509, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x050a, code lost:
        r4 = r3.getHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x050e, code lost:
        if (r5 != false) goto L_0x0511;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0510, code lost:
        r11 = -r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0511, code lost:
        r8 = java.lang.Math.min(r4, java.lang.Math.max(0, r29 + r11));
        r6 = r3.getWidth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0523, code lost:
        if (X.C316216lI.A0C(r10) == false) goto L_0x054b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0527, code lost:
        if (X.2Y9.A00 == false) goto L_0x054b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0529, code lost:
        r1 = X.C316216lI.A01(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x052d, code lost:
        r4 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x052f, code lost:
        if (r4 == null) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0531, code lost:
        r4.A02(r3, r28 - ((r6 + (r1 * 2)) / 2), r8 - (r3.getHeight() / 2), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0542, code lost:
        r0.A01 = r2;
        r2.A1H = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x054a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x054b, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x054d, code lost:
        r4 = r2.A0u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x054f, code lost:
        if (r4 == null) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0551, code lost:
        r4 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0553, code lost:
        if (r4 == null) goto L_0x0559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0555, code lost:
        r11 = r4.Bh3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0559, code lost:
        if (r12 == null) goto L_0x04d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x055b, code lost:
        r14 = 2131967797;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x055f, code lost:
        if (r12 == null) goto L_0x04d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0561, code lost:
        r4 = r2.A1B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0563, code lost:
        if (r4 == null) goto L_0x05d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0565, code lost:
        r11 = r4.Bh3();
        r14 = 2131970049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0571, code lost:
        if (X.C379169St.A01(r2) == false) goto L_0x04d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0573, code lost:
        r4 = r2.A0I().A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0579, code lost:
        if (r4 == null) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x057b, code lost:
        r11 = X.1iI.A03(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x057f, code lost:
        if (r12 == null) goto L_0x04d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0581, code lost:
        r14 = 2131969814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0584, code lost:
        r4 = r12.getContentView();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0588, code lost:
        if (r4 == null) goto L_0x05d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x058a, code lost:
        r13 = r2.A0M(r4.getResources(), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0592, code lost:
        if (r13 != null) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0594, code lost:
        r13 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x059a, code lost:
        if (r2.A11 != X.AnonymousClass3WT.PRODUCT) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05a4, code lost:
        if (r2.A0I().A05 != com.instagram.api.schemas.ProductReviewStatus.APPROVED) goto L_0x05ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05ac, code lost:
        if (r2.A07() != com.instagram.api.schemas.TextReviewStatus.REJECTED) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05ae, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05af, code lost:
        X.C56591I2v.A02(r10, r11, r12, r13, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05b2, code lost:
        if (r11 != null) goto L_0x04d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05b4, code lost:
        X.0wb.A03("ReelInteractiveController", X.002.A0R("Null image given to popup bubble of type ", r2.A11.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05c5, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05cc, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        if (X.182.A06(r5, r15, r3) != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05d2, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05d8, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05de, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05e1, code lost:
        if (r2.A1q == false) goto L_0x05ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05e3, code lost:
        X.C59689JTv.A00(r0.A04, r2.A1Q, (java.lang.String) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05ea, code lost:
        r8.DcF();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05ed, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05ee, code lost:
        r18 = new X.C19787WfU();
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05f8, code lost:
        if (r2.A0h != com.instagram.api.schemas.UpcomingEventStickerSource.FEED_RESHARE) goto L_0x05fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05fa, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05fb, code lost:
        r20 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x05fd, code lost:
        if (r3 == false) goto L_0x0635;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x05ff, code lost:
        r3 = r2.A1a;
        r23 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0603, code lost:
        if (r3 == null) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0605, code lost:
        r20 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0607, code lost:
        X.C63468KxX.A00();
        r3 = r0.A06;
        r14 = r3.requireActivity();
        r6 = r0.A0A;
        r4 = r3.getModuleName();
        r3 = r2.A1A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0618, code lost:
        if (r3 == null) goto L_0x0642;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x061a, code lost:
        r2 = new X.Fm3(r0);
        X.0qQ.A0B(r4, 4);
        X.1ZC.A00(r14, r15, r6, r2, r18, r3, r20, r4, "story_sticker_bottom_sheet", r23, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0634, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0635, code lost:
        r3 = r2.A0s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0637, code lost:
        if (r3 == null) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0639, code lost:
        r3 = r3.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x063b, code lost:
        if (r3 != null) goto L_0x063f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x063d, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x063f, code lost:
        r23 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0647, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        if (r3.A00 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b4, code lost:
        if ("upcoming_event_card".equals(r2.A1g) != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d0, code lost:
        if (X.182.A06(r5, r15, r3) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d2, code lost:
        r8.DcH(r2, r7, r6);
        r8.Ck1(r2, r7, r6);
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e1, code lost:
        switch(r2.A11.ordinal()) {
            case 0: goto L_0x02db;
            case 1: goto L_0x02f1;
            case 2: goto L_0x00e4;
            case 3: goto L_0x0648;
            case 4: goto L_0x0323;
            case 5: goto L_0x03d8;
            case 6: goto L_0x0648;
            case 7: goto L_0x03d8;
            case 8: goto L_0x0648;
            case 9: goto L_0x00e4;
            case 10: goto L_0x03d8;
            case 11: goto L_0x03d8;
            case com.instagram.react.modules.base.IgReactQEModule.CONFIG_KEY_OFFSET :int: goto L_0x03d4;
            case 13: goto L_0x0346;
            case 14: goto L_0x0648;
            case 15: goto L_0x03d8;
            case 16: goto L_0x034a;
            case 17: goto L_0x00e4;
            case org.webrtc.EglBase14Impl.EGLExt_SDK_VERSION :int: goto L_0x0145;
            case 19: goto L_0x03d8;
            case 20: goto L_0x00e4;
            case 21: goto L_0x021a;
            case 22: goto L_0x0342;
            case 23: goto L_0x03d8;
            case 24: goto L_0x03d8;
            case 25: goto L_0x00e4;
            case 26: goto L_0x00ec;
            case 27: goto L_0x0155;
            case 28: goto L_0x0155;
            case com.facebook.catalyst.modules.cameraroll.CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL :int: goto L_0x0648;
            case 30: goto L_0x03d8;
            case 31: goto L_0x00e4;
            case 32: goto L_0x03d8;
            case 33: goto L_0x03d8;
            case 34: goto L_0x00e4;
            case 35: goto L_0x00e4;
            case 36: goto L_0x00e4;
            case 37: goto L_0x03d8;
            case 38: goto L_0x03d8;
            case 39: goto L_0x0648;
            case 40: goto L_0x00e4;
            case go.Seq.NULL_REFNUM :int: goto L_0x00e4;
            case go.Seq.RefTracker.REF_OFFSET :int: goto L_0x0648;
            case 43: goto L_0x03d8;
            case 44: goto L_0x03d8;
            case 45: goto L_0x0648;
            case 46: goto L_0x0648;
            case 47: goto L_0x00e4;
            case 48: goto L_0x03d8;
            case 49: goto L_0x00e4;
            case com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE :int: goto L_0x05df;
            case 51: goto L_0x0307;
            case 52: goto L_0x03d8;
            case 53: goto L_0x039a;
            case 54: goto L_0x0648;
            case 55: goto L_0x00e4;
            case 56: goto L_0x00e4;
            case 57: goto L_0x03c3;
            case 58: goto L_0x03d8;
            case 59: goto L_0x03d8;
            case 60: goto L_0x00e4;
            case 61: goto L_0x00e4;
            case 62: goto L_0x00e4;
            case 63: goto L_0x03d8;
            case 64: goto L_0x00e4;
            case 65: goto L_0x027d;
            case 66: goto L_0x03d8;
            case 67: goto L_0x00e4;
            case 68: goto L_0x00e4;
            case 69: goto L_0x034e;
            case 70: goto L_0x03d8;
            case 71: goto L_0x00e4;
            case 72: goto L_0x00e4;
            case 73: goto L_0x03d8;
            case 74: goto L_0x00e4;
            case 75: goto L_0x00e4;
            case 76: goto L_0x00e4;
            case 77: goto L_0x0352;
            case 78: goto L_0x0356;
            default: goto L_0x00e4;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        throw new java.lang.UnsupportedOperationException("ReelInteractiveType passed isTappable but is not handled in onReelInteractiveTapped");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ec, code lost:
        r3 = r2.A13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        if (r3 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f0, code lost:
        r10 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f2, code lost:
        if (r10 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f6, code lost:
        if (r10.A01 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fc, code lost:
        if (r10.A03 == com.instagram.reels.chat.model.ChatStickerChannelType.AI_AGENT) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fe, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010a, code lost:
        if (X.182.A06(X.0Tu.A05, r15, 36319407396035932L) != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010c, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0111, code lost:
        if (r10.A03 != com.instagram.reels.chat.model.ChatStickerChannelType.AI_AGENT) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0113, code lost:
        r3 = r10.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0115, code lost:
        if (r3 == null) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011b, code lost:
        if (r3.length() == 0) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011d, code lost:
        r3 = r10.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011f, code lost:
        if (r3 == null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0121, code lost:
        r11 = r3.AaX();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0125, code lost:
        r3 = com.instagram.api.schemas.IGAIAgentType.A06;
        r10 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0129, code lost:
        if (r11 != r3) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012b, code lost:
        r3 = 36325613619131473L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0134, code lost:
        if (X.182.A06(r10, r15, r3) == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0136, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0137, code lost:
        if (r12 != false) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0139, code lost:
        if (r13 != false) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013b, code lost:
        r8.DRp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013f, code lost:
        r3 = 36327065318733968L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0149, code lost:
        if (r8.Es9(r2) == false) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x014b, code lost:
        r0 = r8.AqN();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x014f, code lost:
        if (r0 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0151, code lost:
        r8.DNg(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0154, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0155, code lost:
        r5 = r2.A0u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0157, code lost:
        if (r5 == null) goto L_0x05ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0163, code lost:
        if (X.0qQ.A0K(r2.A1g, X.AnonymousClass6KJ.MUSIC_VINYL.A02) == false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0169, code lost:
        if (r8.CQz() != false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0176, code lost:
        if (X.182.A06(X.0Tu.A05, r15, 36325201303122651L) == false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0180, code lost:
        if (X.C349167zh.A00(r15).booleanValue() == false) goto L_0x0216;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.C255783ui r27, int r28, int r29) {
        /*
            r26 = this;
            r7 = r28
            r6 = r29
            r1 = 0
            r2 = r27
            X.0qQ.A0B(r2, r1)
            r0 = r26
            X.3ui r3 = r0.A01
            r9 = 1
            r13 = 0
            if (r3 == 0) goto L_0x0020
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.A1p
            if (r3 == 0) goto L_0x0020
        L_0x001c:
            r0.A03(r2, r9, r1)
            return r9
        L_0x0020:
            r0.A03(r2, r1, r9)
            X.6iZ r8 = r0.A08
            boolean r3 = r8.Cml(r2, r7, r6)
            if (r3 != 0) goto L_0x0648
            com.instagram.common.session.UserSession r15 = r0.A07
            X.3WT r4 = r2.A11
            int r3 = r4.ordinal()
            switch(r3) {
                case 0: goto L_0x00d2;
                case 1: goto L_0x00d2;
                case 2: goto L_0x004e;
                case 3: goto L_0x004e;
                case 4: goto L_0x00d2;
                case 5: goto L_0x00d2;
                case 6: goto L_0x004e;
                case 7: goto L_0x00d2;
                case 8: goto L_0x004e;
                case 9: goto L_0x0036;
                case 10: goto L_0x00d2;
                case 11: goto L_0x00d2;
                case 12: goto L_0x00d2;
                case 13: goto L_0x00d2;
                case 14: goto L_0x004e;
                case 15: goto L_0x00d2;
                case 16: goto L_0x00d2;
                case 17: goto L_0x0036;
                case 18: goto L_0x00d2;
                case 19: goto L_0x00d2;
                case 20: goto L_0x0036;
                case 21: goto L_0x00d2;
                case 22: goto L_0x00d2;
                case 23: goto L_0x00d2;
                case 24: goto L_0x00d2;
                case 25: goto L_0x0036;
                case 26: goto L_0x00d2;
                case 27: goto L_0x0087;
                case 28: goto L_0x0087;
                case 29: goto L_0x004e;
                case 30: goto L_0x00d2;
                case 31: goto L_0x0036;
                case 32: goto L_0x00d2;
                case 33: goto L_0x006f;
                case 34: goto L_0x0036;
                case 35: goto L_0x0036;
                case 36: goto L_0x0036;
                case 37: goto L_0x00d2;
                case 38: goto L_0x00d2;
                case 39: goto L_0x004e;
                case 40: goto L_0x0036;
                case 41: goto L_0x0036;
                case 42: goto L_0x004e;
                case 43: goto L_0x00d2;
                case 44: goto L_0x00d2;
                case 45: goto L_0x004e;
                case 46: goto L_0x004e;
                case 47: goto L_0x0036;
                case 48: goto L_0x00d2;
                case 49: goto L_0x0036;
                case 50: goto L_0x009e;
                case 51: goto L_0x00d2;
                case 52: goto L_0x00d2;
                case 53: goto L_0x0087;
                case 54: goto L_0x0087;
                case 55: goto L_0x0036;
                case 56: goto L_0x0036;
                case 57: goto L_0x00d2;
                case 58: goto L_0x00d2;
                case 59: goto L_0x0077;
                case 60: goto L_0x0036;
                case 61: goto L_0x0036;
                case 62: goto L_0x0036;
                case 63: goto L_0x00d2;
                case 64: goto L_0x0036;
                case 65: goto L_0x00d2;
                case 66: goto L_0x00b7;
                case 67: goto L_0x0036;
                case 68: goto L_0x0036;
                case 69: goto L_0x005c;
                case 70: goto L_0x00d2;
                case 71: goto L_0x0036;
                case 72: goto L_0x0036;
                case 73: goto L_0x0095;
                case 74: goto L_0x0036;
                case 75: goto L_0x0036;
                case 76: goto L_0x0036;
                case 77: goto L_0x007f;
                case 78: goto L_0x00d2;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r0 = r4.A00
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r9)
            java.lang.String r0 = "Unsupported ReelInteractiveType: %s"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            X.0qQ.A07(r3)
            java.lang.String r0 = "UnsupportedReelInteractiveType"
            X.0wb.A03(r0, r3)
        L_0x004e:
            X.3WT r3 = r2.A11
            X.3WT r0 = X.AnonymousClass3WT.NOTIFY_ME
            if (r3 == r0) goto L_0x0058
            X.3WT r0 = X.AnonymousClass3WT.ACHIEVEMENT_STICKER
            if (r3 != r0) goto L_0x005b
        L_0x0058:
            r8.Ck1(r2, r7, r6)
        L_0x005b:
            return r1
        L_0x005c:
            X.0Tu r5 = X.0Tu.A05
            r3 = 36321864112744257(0x810a8b00052741, double:3.0334313490823386E-306)
            boolean r3 = X.182.A06(r5, r15, r3)
            if (r3 != 0) goto L_0x00d2
            r3 = 36321864112940867(0x810a8b00082743, double:3.0334313492066756E-306)
            goto L_0x00cc
        L_0x006f:
            X.0Tu r5 = X.0Tu.A05
            r3 = 36330015960351137(0x8111f5000041a1, double:3.038586610333785E-306)
            goto L_0x008e
        L_0x0077:
            X.0Tu r5 = X.0Tu.A05
            r3 = 36318282109818949(0x81074900021845, double:3.031166076008806E-306)
            goto L_0x008e
        L_0x007f:
            X.0Tu r5 = X.0Tu.A05
            r3 = 36323058115226431(0x810ba1001d2b3f, double:3.0341864410599275E-306)
            goto L_0x008e
        L_0x0087:
            X.0Tu r5 = X.0Tu.A05
            r3 = 36318677246744949(0x8107a500011975, double:3.031415962191897E-306)
        L_0x008e:
            boolean r3 = X.182.A06(r5, r15, r3)
            if (r3 != 0) goto L_0x00d2
            goto L_0x004e
        L_0x0095:
            X.BG5 r3 = r2.A0M
            if (r3 == 0) goto L_0x004e
            java.lang.String r3 = r3.A00
            if (r3 == 0) goto L_0x004e
            goto L_0x00d2
        L_0x009e:
            boolean r3 = r2.A1q
            if (r3 != 0) goto L_0x00d2
            com.instagram.api.schemas.UpcomingEventStickerSource r4 = r2.A0h
            com.instagram.api.schemas.UpcomingEventStickerSource r3 = com.instagram.api.schemas.UpcomingEventStickerSource.FEED_RESHARE
            if (r4 == r3) goto L_0x00d2
            com.instagram.api.schemas.UpcomingEventStickerSource r3 = com.instagram.api.schemas.UpcomingEventStickerSource.STICKER_TRAY
            if (r4 != r3) goto L_0x00d2
            java.lang.String r4 = r2.A1g
            java.lang.String r3 = "upcoming_event_card"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00d2
            goto L_0x004e
        L_0x00b7:
            X.BEf r3 = r2.A0G
            if (r3 == 0) goto L_0x004e
            java.util.List r3 = r3.A00
            if (r3 == 0) goto L_0x004e
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x004e
            X.0Tu r5 = X.0Tu.A05
            r3 = 36320081701117900(0x8108ec00021fcc, double:3.032304144792635E-306)
        L_0x00cc:
            boolean r3 = X.182.A06(r5, r15, r3)
            if (r3 == 0) goto L_0x004e
        L_0x00d2:
            r8.DcH(r2, r7, r6)
            r8.Ck1(r2, r7, r6)
            X.3WT r3 = r2.A11
            int r3 = r3.ordinal()
            r11 = 0
            java.lang.String r5 = "Required value was null."
            switch(r3) {
                case 0: goto L_0x02db;
                case 1: goto L_0x02f1;
                case 2: goto L_0x00e4;
                case 3: goto L_0x0648;
                case 4: goto L_0x0323;
                case 5: goto L_0x03d8;
                case 6: goto L_0x0648;
                case 7: goto L_0x03d8;
                case 8: goto L_0x0648;
                case 9: goto L_0x00e4;
                case 10: goto L_0x03d8;
                case 11: goto L_0x03d8;
                case 12: goto L_0x03d4;
                case 13: goto L_0x0346;
                case 14: goto L_0x0648;
                case 15: goto L_0x03d8;
                case 16: goto L_0x034a;
                case 17: goto L_0x00e4;
                case 18: goto L_0x0145;
                case 19: goto L_0x03d8;
                case 20: goto L_0x00e4;
                case 21: goto L_0x021a;
                case 22: goto L_0x0342;
                case 23: goto L_0x03d8;
                case 24: goto L_0x03d8;
                case 25: goto L_0x00e4;
                case 26: goto L_0x00ec;
                case 27: goto L_0x0155;
                case 28: goto L_0x0155;
                case 29: goto L_0x0648;
                case 30: goto L_0x03d8;
                case 31: goto L_0x00e4;
                case 32: goto L_0x03d8;
                case 33: goto L_0x03d8;
                case 34: goto L_0x00e4;
                case 35: goto L_0x00e4;
                case 36: goto L_0x00e4;
                case 37: goto L_0x03d8;
                case 38: goto L_0x03d8;
                case 39: goto L_0x0648;
                case 40: goto L_0x00e4;
                case 41: goto L_0x00e4;
                case 42: goto L_0x0648;
                case 43: goto L_0x03d8;
                case 44: goto L_0x03d8;
                case 45: goto L_0x0648;
                case 46: goto L_0x0648;
                case 47: goto L_0x00e4;
                case 48: goto L_0x03d8;
                case 49: goto L_0x00e4;
                case 50: goto L_0x05df;
                case 51: goto L_0x0307;
                case 52: goto L_0x03d8;
                case 53: goto L_0x039a;
                case 54: goto L_0x0648;
                case 55: goto L_0x00e4;
                case 56: goto L_0x00e4;
                case 57: goto L_0x03c3;
                case 58: goto L_0x03d8;
                case 59: goto L_0x03d8;
                case 60: goto L_0x00e4;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00e4;
                case 63: goto L_0x03d8;
                case 64: goto L_0x00e4;
                case 65: goto L_0x027d;
                case 66: goto L_0x03d8;
                case 67: goto L_0x00e4;
                case 68: goto L_0x00e4;
                case 69: goto L_0x034e;
                case 70: goto L_0x03d8;
                case 71: goto L_0x00e4;
                case 72: goto L_0x00e4;
                case 73: goto L_0x03d8;
                case 74: goto L_0x00e4;
                case 75: goto L_0x00e4;
                case 76: goto L_0x00e4;
                case 77: goto L_0x0352;
                case 78: goto L_0x0356;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            java.lang.String r1 = "ReelInteractiveType passed isTappable but is not handled in onReelInteractiveTapped"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x00ec:
            X.8D7 r3 = r2.A13
            if (r3 == 0) goto L_0x005b
            X.UOB r10 = r3.A0E
            if (r10 == 0) goto L_0x005b
            X.XAt r3 = r10.A01
            if (r3 == 0) goto L_0x010c
            com.instagram.reels.chat.model.ChatStickerChannelType r4 = r10.A03
            com.instagram.reels.chat.model.ChatStickerChannelType r3 = com.instagram.reels.chat.model.ChatStickerChannelType.AI_AGENT
            if (r4 == r3) goto L_0x010c
            X.0Tu r12 = X.0Tu.A05
            r3 = 36319407396035932(0x81084f004b1d5c, double:3.03187771154359E-306)
            boolean r3 = X.182.A06(r12, r15, r3)
            r12 = 1
            if (r3 != 0) goto L_0x010d
        L_0x010c:
            r12 = 0
        L_0x010d:
            com.instagram.reels.chat.model.ChatStickerChannelType r4 = r10.A03
            com.instagram.reels.chat.model.ChatStickerChannelType r3 = com.instagram.reels.chat.model.ChatStickerChannelType.AI_AGENT
            if (r4 != r3) goto L_0x0137
            java.lang.String r3 = r10.A0E
            if (r3 == 0) goto L_0x0137
            int r3 = r3.length()
            if (r3 == 0) goto L_0x0137
            com.instagram.api.schemas.AiAgentMetadataDict r3 = r10.A00
            if (r3 == 0) goto L_0x0125
            com.instagram.api.schemas.IGAIAgentType r11 = r3.AaX()
        L_0x0125:
            com.instagram.api.schemas.IGAIAgentType r3 = com.instagram.api.schemas.IGAIAgentType.A06
            X.0Tu r10 = X.0Tu.A05
            if (r11 != r3) goto L_0x013f
            r3 = 36325613619131473(0x810df400043451, double:3.0358025520196644E-306)
        L_0x0130:
            boolean r3 = X.182.A06(r10, r15, r3)
            if (r3 == 0) goto L_0x0137
            r13 = 1
        L_0x0137:
            if (r12 != 0) goto L_0x03d8
            if (r13 != 0) goto L_0x03d8
            r8.DRp()
            return r9
        L_0x013f:
            r3 = 36327065318733968(0x810f46000e3890, double:3.036720612693807E-306)
            goto L_0x0130
        L_0x0145:
            boolean r3 = r8.Es9(r2)
            if (r3 == 0) goto L_0x03d8
            android.view.View r0 = r8.AqN()
            if (r0 == 0) goto L_0x005b
            r8.DNg(r0, r2)
            return r9
        L_0x0155:
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r2.A0u
            if (r5 == 0) goto L_0x05ea
            java.lang.String r3 = r2.A1g
            X.6KJ r2 = X.AnonymousClass6KJ.MUSIC_VINYL
            java.lang.String r2 = r2.A02
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x0216
            boolean r2 = r8.CQz()
            if (r2 != 0) goto L_0x0178
            X.0Tu r4 = X.0Tu.A05
            r2 = 36325201303122651(0x810d94001132db, double:3.035541801715422E-306)
            boolean r2 = X.182.A06(r4, r15, r2)
            if (r2 == 0) goto L_0x0216
        L_0x0178:
            java.lang.Boolean r2 = X.C349167zh.A00(r15)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0216
            X.0Tu r8 = X.0Tu.A05
            r2 = 36325201302860503(0x810d94000d32d7, double:3.0355418015496386E-306)
            boolean r2 = X.182.A06(r8, r15, r2)
            if (r2 == 0) goto L_0x0216
            X.4DH r2 = r0.A06
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            r2 = 46
            X.MMg r6 = new X.MMg
            r6.<init>(r0, r2)
            r2 = 36325201302991577(0x810d94000f32d9, double:3.03554180163253E-306)
            boolean r0 = X.182.A06(r8, r15, r2)
            if (r0 == 0) goto L_0x0213
            X.2k4 r7 = X.AnonymousClass2k4.NIGHT
        L_0x01a9:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            java.lang.String r2 = r15.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r10.putString(r0, r2)
            r2 = 36325201303057114(0x810d94001032da, double:3.035541801673976E-306)
            boolean r0 = X.182.A06(r8, r15, r2)
            if (r0 == 0) goto L_0x01c7
            com.instagram.common.typedurl.ImageUrl r2 = r5.A04
            java.lang.String r0 = "args_music_vinyl_cover_artwork_uri"
            r10.putParcelable(r0, r2)
        L_0x01c7:
            X.K7O r3 = new X.K7O
            r3.<init>()
            r3.setArguments(r10)
            r3.dayNightMode = r7
            X.7Pr r2 = new X.7Pr
            r2.<init>(r15)
            r2.A0T = r3
            r2.A0O = r7
            r0 = 1059648963(0x3f28f5c3, float:0.66)
            r2.A03 = r0
            X.PQh r0 = new X.PQh
            r0.<init>(r6)
            r2.A0U = r0
            r2.A0T = r3
            r2.A14 = r1
            r0 = 2131967776(0x7f133f20, float:1.9572428E38)
            java.lang.String r0 = r4.getString(r0)
            r2.A0g = r0
            X.LX1 r0 = new X.LX1
            r0.<init>(r3)
            r2.A0K = r0
            r0 = 2131968513(0x7f134201, float:1.9573923E38)
            java.lang.String r0 = r4.getString(r0)
            r2.A0h = r0
            X.AN9 r0 = new X.AN9
            r0.<init>(r4)
            r2.A0L = r0
            X.7Pu r0 = r2.A00()
            r0.A0R(r9, r9)
            goto L_0x02d7
        L_0x0213:
            X.2k4 r7 = X.AnonymousClass2k4.DEFAULT
            goto L_0x01a9
        L_0x0216:
            r0.A01(r5)
            return r9
        L_0x021a:
            X.3WT r4 = r2.A10
            X.3WT r3 = X.AnonymousClass3WT.AVATAR
            if (r4 == r3) goto L_0x0648
            X.0Tu r10 = X.0Tu.A05
            r3 = 36323844092341824(0x810c5800002e40, double:3.034683496152578E-306)
            boolean r3 = X.182.A06(r10, r15, r3)
            if (r3 == 0) goto L_0x03d8
            X.4DH r1 = r0.A06
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            java.lang.String r6 = r2.A1a
            if (r6 == 0) goto L_0x0277
            r1 = 44
            X.MMg r5 = new X.MMg
            r5.<init>(r0, r1)
            X.K7Q r2 = new X.K7Q
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "MEDIA_ID"
            r1.putString(r0, r6)
            r2.setArguments(r1)
            X.7Pr r4 = new X.7Pr
            r4.<init>(r15)
            r4.A0T = r2
            r0 = 2131974462(0x7f13593e, float:1.9585989E38)
            java.lang.String r0 = r3.getString(r0)
            r4.A0d = r0
            r0 = 2131974461(0x7f13593d, float:1.9585987E38)
            java.lang.String r0 = r3.getString(r0)
            r4.A0g = r0
            X.FNV r0 = new X.FNV
            r0.<init>(r15, r3, r6)
            r4.A0K = r0
            X.PQi r0 = new X.PQi
            r0.<init>(r5)
            goto L_0x038d
        L_0x0277:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x027d:
            java.lang.String r3 = r2.A1b
            X.BFl r2 = r2.A0L
            if (r2 == 0) goto L_0x0648
            com.instagram.user.model.User r1 = r2.A00
            if (r1 == 0) goto L_0x028a
            r1.Bh3()
        L_0x028a:
            com.instagram.user.model.User r6 = r2.A00
            if (r6 == 0) goto L_0x0648
            if (r3 == 0) goto L_0x0648
            X.Eus r5 = new X.Eus
            r5.<init>(r0)
            X.4DH r0 = r0.A06
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            X.17i r0 = X.17h.A00(r15)
            com.instagram.user.model.User r0 = r0.A02(r3)
            if (r0 == 0) goto L_0x0648
            X.E1B r3 = new X.E1B
            r3.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            X.C227642jf.A04(r2, r15)
            java.lang.String r1 = r0.getUsername()
            java.lang.String r0 = "ShareToFriendsStoryConsumptionFragment.ARGUMENTS_KEY_CONSUMPTION_REEL_OWNER"
            r2.putString(r0, r1)
            java.lang.String r0 = "ShareToFriendsStoryConsumptionFragment.ARGUMENTS_KEY_CONSUMPTION_REEL_PRODUCER"
            r2.putParcelable(r0, r6)
            r3.setArguments(r2)
            r3.A00 = r5
            X.7Pr r1 = new X.7Pr
            r1.<init>(r15)
            r0 = 2131956556(0x7f13134c, float:1.9549671E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A0d = r0
            X.7Pu r0 = r1.A00()
        L_0x02d7:
            r0.A02(r4, r3)
            return r9
        L_0x02db:
            X.DDv r1 = r2.A1C
            if (r1 == 0) goto L_0x0648
            r0.A00(r1)
            X.1Av r0 = X.1Au.A00(r15)
            int r2 = r1.A00
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "anti_bully_tooltip_shown_count"
            goto L_0x031c
        L_0x02f1:
            X.DDv r1 = r2.A1D
            if (r1 == 0) goto L_0x0648
            r0.A00(r1)
            X.1Av r0 = X.1Au.A00(r15)
            int r2 = r1.A00
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "anti_bully_global_tooltip_shown_count"
            goto L_0x031c
        L_0x0307:
            X.DDv r1 = r2.A1G
            if (r1 == 0) goto L_0x0648
            r0.A00(r1)
            X.1Av r0 = X.1Au.A00(r15)
            int r2 = r1.A00
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "voter_registration_tooltip_shown_count"
        L_0x031c:
            r1.E5Z(r0, r2)
            r1.apply()
            return r9
        L_0x0323:
            X.DDv r4 = r2.A1F
            if (r4 == 0) goto L_0x0648
            java.lang.String r3 = r4.A05
            if (r3 == 0) goto L_0x0331
            int r3 = r3.length()
            if (r3 != 0) goto L_0x03d8
        L_0x0331:
            r0.A00(r4)
            java.lang.String r2 = r4.A09
            if (r2 == 0) goto L_0x0648
            X.1Av r1 = X.1Au.A00(r15)
            int r0 = r4.A00
            r1.A10(r2, r0)
            return r9
        L_0x0342:
            r8.D43(r2)
            return r9
        L_0x0346:
            r8.DEu(r2)
            return r9
        L_0x034a:
            r8.DEy()
            return r9
        L_0x034e:
            r8.DUk()
            return r9
        L_0x0352:
            r8.Ct6()
            return r9
        L_0x0356:
            X.4DH r1 = r0.A06
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            r2 = 45
            X.MMg r1 = new X.MMg
            r1.<init>(r0, r2)
            X.K7U r2 = new X.K7U
            r2.<init>()
            X.7Pr r4 = new X.7Pr
            r4.<init>(r15)
            r4.A0T = r2
            r0 = 2131964449(0x7f133221, float:1.956568E38)
            java.lang.String r0 = r3.getString(r0)
            r4.A0d = r0
            r0 = 2131964448(0x7f133220, float:1.9565678E38)
            java.lang.String r0 = r3.getString(r0)
            r4.A0g = r0
            X.OiZ r0 = new X.OiZ
            r0.<init>(r3, r15)
            r4.A0K = r0
            X.PQg r0 = new X.PQg
            r0.<init>(r1)
        L_0x038d:
            r4.A0U = r0
            X.7Pu r0 = r4.A00()
            r0.A0Q(r9)
            r0.A02(r3, r2)
            return r9
        L_0x039a:
            com.instagram.api.schemas.SubscriptionStickerDict r1 = r2.A0e
            if (r1 == 0) goto L_0x03bd
            java.lang.String r2 = r1.A01
            if (r2 == 0) goto L_0x03bd
            X.1Yy r13 = X.FC8.A01()
            X.4DH r1 = r0.A06
            androidx.fragment.app.FragmentActivity r14 = r1.requireActivity()
            java.util.Set r1 = X.C49280EsP.A00
            java.lang.String r18 = "promo_story_sticker"
            X.Fm4 r1 = new X.Fm4
            r1.<init>(r0)
            r16 = r1
            r17 = r2
            r13.A03(r14, r15, r16, r17, r18)
            return r9
        L_0x03bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x03c3:
            X.0Tu r3 = X.0Tu.A05
            r0 = 36319858362752697(0x8108b800011eb9, double:3.032162904711169E-306)
            boolean r0 = X.182.A06(r3, r15, r0)
            if (r0 != 0) goto L_0x0648
            r8.CxO(r2)
            return r9
        L_0x03d4:
            X.BIZ r3 = r2.A0j
            if (r3 == 0) goto L_0x05ea
        L_0x03d8:
            android.view.View r3 = r8.AqN()
            if (r3 == 0) goto L_0x0648
            X.Hp8 r12 = X.C56591I2v.A00(r3, r15)
            X.3WT r4 = r2.A11
            int r10 = r4.ordinal()
            r4 = 4
            r13 = 0
            if (r10 == r4) goto L_0x0497
            r4 = 26
            if (r10 == r4) goto L_0x0497
            switch(r10) {
                case 5: goto L_0x0497;
                case 7: goto L_0x0497;
                case 10: goto L_0x0497;
                case 11: goto L_0x048f;
                case 12: goto L_0x0497;
                case 15: goto L_0x0497;
                case 18: goto L_0x048f;
                case 19: goto L_0x0497;
                case 21: goto L_0x0497;
                case 23: goto L_0x048a;
                case 24: goto L_0x048a;
                case 27: goto L_0x048a;
                case 28: goto L_0x048a;
                case 30: goto L_0x0481;
                case 32: goto L_0x0497;
                case 33: goto L_0x0497;
                case 37: goto L_0x0497;
                case 38: goto L_0x0497;
                case 43: goto L_0x0497;
                case 44: goto L_0x0497;
                case 48: goto L_0x0497;
                case 50: goto L_0x0497;
                case 52: goto L_0x0497;
                case 58: goto L_0x0497;
                case 59: goto L_0x03fb;
                case 63: goto L_0x0469;
                case 66: goto L_0x0497;
                case 70: goto L_0x0466;
                case 73: goto L_0x0497;
                default: goto L_0x03f3;
            }
        L_0x03f3:
            java.lang.String r1 = "Unsupported interactive type for popup bubble"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x03fb:
            X.0Tu r4 = X.0Tu.A05
            r10 = 36318282109818949(0x81074900021845, double:3.031166076008806E-306)
            boolean r4 = X.182.A06(r4, r15, r10)
            if (r4 == 0) goto L_0x04a6
            X.BGp r4 = r2.A0T
            if (r4 == 0) goto L_0x0410
            java.lang.String r4 = r4.A02
            if (r4 != 0) goto L_0x0412
        L_0x0410:
            java.lang.String r4 = ""
        L_0x0412:
            java.lang.String r11 = r2.A1d
            java.lang.String r10 = r15.A06
            java.lang.String r16 = "ig_story_tooltip_displayed"
            r17 = r10
            r18 = r4
            r19 = r11
            r20 = r13
            X.C9761RgJ.A00(r15, r16, r17, r18, r19, r20)
            android.content.Context r10 = r0.A04
            android.view.View r13 = r12.A08
            android.content.Context r4 = r13.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r4)
            r4 = 2131625437(0x7f0e05dd, float:1.8878082E38)
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            android.view.View r11 = r11.inflate(r4, r13, r1)
            r4 = 2131432676(0x7f0b14e4, float:1.8487116E38)
            android.view.View r13 = r11.requireViewById(r4)
            X.0qQ.A07(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r4 = 2131962095(0x7f1328ef, float:1.9560905E38)
            java.lang.String r14 = r10.getString(r4)
            java.lang.String r4 = "Facebook"
            java.lang.Object[] r10 = new java.lang.Object[]{r4}
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = java.lang.String.format(r4, r14, r10)
            X.0qQ.A07(r4)
            r13.setText(r4)
            X.HKn r4 = X.C54604HKn.A02
            r12.A02 = r4
            r12.A01 = r11
            goto L_0x04a6
        L_0x0466:
            r2.A1N = r13
            goto L_0x0497
        L_0x0469:
            android.content.Context r10 = r0.A04
            r11 = 2131971762(0x7f134eb2, float:1.9580512E38)
            java.lang.String r4 = X.C319886rO.A00(r15)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r4 = r10.getString(r11, r4)
            X.0qQ.A07(r4)
            X.C55097Hc6.A00(r10, r12, r4, r13)
            goto L_0x04a6
        L_0x0481:
            boolean r4 = X.C379169St.A01(r2)
            if (r4 == 0) goto L_0x0497
            X.HKn r4 = X.C54604HKn.A03
            goto L_0x048c
        L_0x048a:
            X.HKn r4 = X.C54604HKn.A01
        L_0x048c:
            r12.A02 = r4
            goto L_0x04a6
        L_0x048f:
            com.instagram.api.schemas.StoryLinkInfoDict r4 = r2.A0W
            if (r4 == 0) goto L_0x0497
            java.lang.String r4 = r4.A07
            r2.A1N = r4
        L_0x0497:
            android.content.Context r11 = r0.A04
            android.content.res.Resources r4 = r11.getResources()
            java.lang.String r10 = r2.A0M(r4, r15)
            java.lang.String r4 = r2.A1N
            X.C55097Hc6.A00(r11, r12, r10, r4)
        L_0x04a6:
            X.4rx r4 = new X.4rx
            r4.<init>(r12)
            r0.A02 = r4
            android.view.View r10 = r8.AqN()
            android.view.View r8 = r8.AuD()
            X.4rx r4 = r0.A02
            X.C56591I2v.A01(r10, r8, r4)
            X.4DH r10 = r0.A06
            X.4rx r12 = r0.A02
            X.3WT r4 = r2.A11
            int r8 = r4.ordinal()
            r4 = 24
            if (r8 == r4) goto L_0x055f
            r4 = 23
            if (r8 == r4) goto L_0x055f
            r4 = 30
            r11 = 0
            if (r8 == r4) goto L_0x056d
            r4 = 28
            if (r8 == r4) goto L_0x054d
            r4 = 27
            if (r8 == r4) goto L_0x054d
        L_0x04d9:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            X.4rx r4 = r0.A02
            if (r4 == 0) goto L_0x05c7
            android.view.View r12 = r4.getContentView()
            if (r12 == 0) goto L_0x05c7
            r12.measure(r8, r8)
            X.4rx r5 = r0.A02
            if (r5 == 0) goto L_0x04f5
            X.Lzw r4 = new X.Lzw
            r4.<init>(r3, r2, r0)
            r5.A03 = r4
        L_0x04f5:
            android.content.Context r10 = r0.A04
            int r4 = r2.A08
            int r4 = r4 + 40
            float r4 = X.0nA.A04(r10, r4)
            int r11 = (int) r4
            int r8 = r29 - r11
            int r4 = r12.getMeasuredHeight()
            r5 = 0
            if (r8 >= r4) goto L_0x050a
            r5 = 1
        L_0x050a:
            int r4 = r3.getHeight()
            if (r5 != 0) goto L_0x0511
            int r11 = -r11
        L_0x0511:
            int r6 = r29 + r11
            int r1 = java.lang.Math.max(r1, r6)
            int r8 = java.lang.Math.min(r4, r1)
            int r6 = r3.getWidth()
            boolean r1 = X.C316216lI.A0C(r10)
            if (r1 == 0) goto L_0x054b
            boolean r1 = X.2Y9.A00
            if (r1 == 0) goto L_0x054b
            int r1 = X.C316216lI.A01(r10)
        L_0x052d:
            X.4rx r4 = r0.A02
            if (r4 == 0) goto L_0x0542
            int r1 = r1 * 2
            int r6 = r6 + r1
            int r1 = r6 / 2
            int r7 = r28 - r1
            int r1 = r3.getHeight()
            int r1 = r1 / 2
            int r8 = r8 - r1
            r4.A02(r3, r7, r8, r5)
        L_0x0542:
            r0.A01 = r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r2.A1H = r0
            return r9
        L_0x054b:
            r1 = 0
            goto L_0x052d
        L_0x054d:
            com.instagram.music.common.model.MusicOverlayStickerModel r4 = r2.A0u
            if (r4 == 0) goto L_0x05cd
            com.instagram.user.model.User r4 = r4.A05
            if (r4 == 0) goto L_0x0559
            com.instagram.common.typedurl.ImageUrl r11 = r4.Bh3()
        L_0x0559:
            if (r12 == 0) goto L_0x04d9
            r14 = 2131967797(0x7f133f35, float:1.957247E38)
            goto L_0x0584
        L_0x055f:
            if (r12 == 0) goto L_0x04d9
            com.instagram.user.model.User r4 = r2.A1B
            if (r4 == 0) goto L_0x05d9
            com.instagram.common.typedurl.ImageUrl r11 = r4.Bh3()
            r14 = 2131970049(0x7f134801, float:1.9577038E38)
            goto L_0x0584
        L_0x056d:
            boolean r4 = X.C379169St.A01(r2)
            if (r4 == 0) goto L_0x04d9
            com.instagram.user.model.Product r4 = r2.A0I()
            com.instagram.model.mediasize.ImageInfo r4 = r4.A08
            if (r4 == 0) goto L_0x057f
            com.instagram.model.mediasize.ExtendedImageUrl r11 = X.1iI.A03(r4)
        L_0x057f:
            if (r12 == 0) goto L_0x04d9
            r14 = 2131969814(0x7f134716, float:1.9576561E38)
        L_0x0584:
            android.view.View r4 = r12.getContentView()
            if (r4 == 0) goto L_0x05d3
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r13 = r2.A0M(r4, r15)
            if (r13 != 0) goto L_0x0596
            java.lang.String r13 = ""
        L_0x0596:
            X.3WT r8 = r2.A11
            X.3WT r4 = X.AnonymousClass3WT.PRODUCT
            if (r8 != r4) goto L_0x05c5
            com.instagram.user.model.Product r4 = r2.A0I()
            com.instagram.api.schemas.ProductReviewStatus r8 = r4.A05
            com.instagram.api.schemas.ProductReviewStatus r4 = com.instagram.api.schemas.ProductReviewStatus.APPROVED
            if (r8 != r4) goto L_0x05ae
            com.instagram.api.schemas.TextReviewStatus r8 = r2.A07()
            com.instagram.api.schemas.TextReviewStatus r4 = com.instagram.api.schemas.TextReviewStatus.REJECTED
            if (r8 != r4) goto L_0x05c5
        L_0x05ae:
            r15 = 1
        L_0x05af:
            X.C56591I2v.A02(r10, r11, r12, r13, r14, r15)
            if (r11 != 0) goto L_0x04d9
            java.lang.String r8 = "Null image given to popup bubble of type "
            X.3WT r4 = r2.A11
            java.lang.String r4 = r4.A00
            java.lang.String r8 = X.002.A0R(r8, r4)
            java.lang.String r4 = "ReelInteractiveController"
            X.0wb.A03(r4, r8)
            goto L_0x04d9
        L_0x05c5:
            r15 = 0
            goto L_0x05af
        L_0x05c7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x05cd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x05d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x05d9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x05df:
            boolean r3 = r2.A1q
            if (r3 == 0) goto L_0x05ee
            android.content.Context r3 = r0.A04
            java.lang.String r0 = r2.A1Q
            X.C59689JTv.A00(r3, r0, r11, r1)
        L_0x05ea:
            r8.DcF()
            return r9
        L_0x05ee:
            X.WfU r18 = new X.WfU
            r18.<init>()
            com.instagram.api.schemas.UpcomingEventStickerSource r6 = r2.A0h
            com.instagram.api.schemas.UpcomingEventStickerSource r4 = com.instagram.api.schemas.UpcomingEventStickerSource.FEED_RESHARE
            r3 = 0
            if (r6 != r4) goto L_0x05fb
            r3 = 1
        L_0x05fb:
            java.lang.String r20 = ""
            if (r3 == 0) goto L_0x0635
            java.lang.String r3 = r2.A1a
            r23 = 0
            if (r3 == 0) goto L_0x0607
        L_0x0605:
            r20 = r3
        L_0x0607:
            X.C63468KxX.A00()
            X.4DH r3 = r0.A06
            androidx.fragment.app.FragmentActivity r14 = r3.requireActivity()
            X.4DU r6 = r0.A0A
            java.lang.String r4 = r3.getModuleName()
            com.instagram.user.model.UpcomingEventImpl r3 = r2.A1A
            if (r3 == 0) goto L_0x0642
            X.Fm3 r2 = new X.Fm3
            r2.<init>(r0)
            java.lang.String r22 = "story_sticker_bottom_sheet"
            r0 = 4
            X.0qQ.A0B(r4, r0)
            r21 = r4
            r24 = r1
            r25 = r1
            r16 = r6
            r17 = r2
            r19 = r3
            X.1ZC.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r9
        L_0x0635:
            com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl r3 = r2.A0s
            if (r3 == 0) goto L_0x063d
            java.lang.String r3 = r3.A06
            if (r3 != 0) goto L_0x063f
        L_0x063d:
            r3 = r20
        L_0x063f:
            r23 = 1
            goto L_0x0605
        L_0x0642:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0648:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314626ia.A05(X.3ui, int, int):boolean");
    }

    public final void A01(MusicOverlayStickerModel musicOverlayStickerModel) {
        Bundle A022 = C250563lf.A02((C54689HOu) null, AnonymousClass8ZN.STORY_VIEWER_BOTTOM_SHEET, LT9.A05(musicOverlayStickerModel), UUID.randomUUID().toString());
        UserSession userSession = this.A07;
        0qQ.A0B(A022, 1);
        GVT gvt = new GVT();
        gvt.setArguments(A022);
        this.A00 = gvt;
        C331127Pr r1 = new C331127Pr(userSession);
        r1.A0a = true;
        r1.A03 = 0.66f;
        r1.A0U = new Fm5(this);
        r1.A0T = gvt;
        r1.A00().A02(this.A06.requireActivity(), gvt);
    }

    public final void A03(C255783ui r4, boolean z, boolean z2) {
        if (A04()) {
            if (z2) {
                C275794rx r0 = this.A02;
                if (r0 != null) {
                    r0.A03 = null;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C275794rx r02 = this.A02;
            if (r02 != null) {
                r02.A03(z);
                this.A01 = null;
                if (r4 != null) {
                    r4.A1H = false;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
