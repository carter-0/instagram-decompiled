package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;

/* renamed from: X.NSs  reason: case insensitive filesystem */
public final class C68686NSs extends C353368Hi implements AnonymousClass877 {
    public AnonymousClass878 A00;
    public boolean A01;
    public final UserSession A02;
    public final AnonymousClass878 A03;
    public final C70504O9d A04;
    public final String A05;
    public final AnonymousClass0iw A06;
    public final AnonymousClass875 A07;
    public final AnonymousClass8DT A08;
    public final boolean A09;

    public C68686NSs(Context context, AnonymousClass0iw r9, UserSession userSession, AnonymousClass875 r11, AnonymousClass8DF r12, C70504O9d o9d, String str, boolean z) {
        super(context, r12);
        this.A02 = userSession;
        this.A04 = o9d;
        this.A06 = r9;
        this.A07 = r11;
        this.A05 = str;
        AnonymousClass878 r0 = new AnonymousClass878(context, userSession, "FaceEffectAdapter");
        this.A03 = r0;
        this.A00 = r0;
        this.A08 = new AnonymousClass8DT(context, userSession, new C72284Ozt(context), str, z);
        this.A09 = "video_call".equals(str);
    }

    public final void DBg(AnonymousClass87G r13, int i) {
        Fragment A002;
        String url;
        if ("video_call".equals(this.A05)) {
            UserSession userSession = this.A02;
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36317569145378145L) && 182.A06(r2, userSession, 36317569145115999L)) {
                AnonymousClass2S0.A01.A05(5);
            }
        }
        if (this.A00 != i) {
            this.A01 = true;
        }
        C70504O9d o9d = this.A04;
        if (o9d != null) {
            C69112Ner ner = o9d.A00;
            if (!r13.A0N) {
                boolean z = false;
                if (0qQ.A0K(r13.A00(), ner.A03.A06) && !ner.A06) {
                    AnonymousClass87I r22 = r13.A04;
                    if (r22 == null) {
                        r22 = AnonymousClass87I.EMPTY;
                    }
                    if (r22 == AnonymousClass87I.AR_EFFECT) {
                        CameraAREffect A003 = r13.A00();
                        if (A003 != null) {
                            AnonymousClass87I r23 = r13.A04;
                            if (r23 == null) {
                                r23 = AnonymousClass87I.EMPTY;
                            }
                            if (r23 == AnonymousClass87I.AVATAR_PRESET) {
                                z = true;
                            }
                            OFY ofy = ner.A0M;
                            EffectAttribution effectAttribution = ner.A03.A02;
                            boolean z2 = ner.A08;
                            String str = A003.A0C;
                            if (str == null) {
                                A002 = null;
                            } else {
                                EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = new EffectInfoAttributionConfiguration(A003, str);
                                effectInfoAttributionConfiguration.A01 = EffectInfoBottomSheetMode.NORMAL;
                                effectInfoAttributionConfiguration.A0B = C66581MXm.A1a(z);
                                effectInfoAttributionConfiguration.A00 = effectAttribution;
                                ImageUrl imageUrl = A003.A05;
                                if (!(imageUrl == null || (url = imageUrl.getUrl()) == null)) {
                                    effectInfoAttributionConfiguration.A07 = url;
                                }
                                EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration = new EffectInfoBottomSheetConfiguration();
                                effectInfoBottomSheetConfiguration.A02 = ImmutableList.of(effectInfoAttributionConfiguration);
                                effectInfoBottomSheetConfiguration.A00 = 9;
                                effectInfoBottomSheetConfiguration.A01 = 28D.A5T;
                                effectInfoBottomSheetConfiguration.A06 = false;
                                effectInfoBottomSheetConfiguration.A04 = z2;
                                C72280Ozp ozp = new C72280Ozp(ofy);
                                A002 = LPQ.A00(C59725JVj.VIDEO_CHAT, ofy.A02, (C279284yO) null, effectInfoBottomSheetConfiguration, ozp, z2);
                            }
                            C331127Pr A004 = ofy.A03.A00(C73861Pky.A00, 1.0f, 1.0f, true, false, true);
                            A004.A05(ofy.A01, R.dimen.clips_audio_browser_audiomixing_height);
                            A004.A0Z = true;
                            C331157Pu A005 = A004.A00();
                            if (A002 != null) {
                                ner.A0H.A05(new C72866PNc(A002, A005, true, true));
                            }
                        }
                        ner.A01 = r13;
                    }
                }
                AnonymousClass87I r24 = r13.A04;
                if (r24 == null) {
                    r24 = AnonymousClass87I.EMPTY;
                }
                if (r24 == AnonymousClass87I.AVATAR_PLACEHOLDER) {
                    if (ner.A03.A09 == AnonymousClass05K.A01) {
                        ner.A0H.A05(POI.A00);
                    }
                    ner.A0H.A03(new C72913POx(r13, (String) null, false));
                } else {
                    CameraAREffect A006 = r13.A00();
                    if (A006 != null && A006.A0M()) {
                        AnonymousClass0eM r3 = ner.A0b;
                        if (!((OKZ) r3.getValue()).A01.getBoolean("rtc_multipeer_effect_permission_dialog_shown", false)) {
                            ner.A0H.A05(new PNW(((OKZ) r3.getValue()).A00(new MJ3(i, 49, ner)), AnonymousClass05K.A15));
                            return;
                        }
                    }
                }
                ner.A01 = r13;
            }
        }
        A04((String) null, true, true, i);
    }

    public final void onBindViewHolder(C249703kE r14, int i) {
        0qQ.A0B(r14, 0);
        AnonymousClass878 r1 = this.A00;
        C370978xN r5 = ((C67886MwU) r14).A00;
        Object obj = this.A02.get(i);
        0qQ.A07(obj);
        AnonymousClass87G r2 = (AnonymousClass87G) obj;
        AnonymousClass0iw r3 = this.A06;
        int i2 = this.A00;
        boolean z = this.A09;
        AnonymousClass8DT r6 = this.A08;
        AnonymousClass7TF.A1H(r5, r2);
        r1.A01(r2, r3, this, r5, r6, i, i2, false, false, z, false);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C67886MwU(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.effect_tile, false), this.A07);
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(-248015377, AnonymousClass0fD.A03(1694954692));
        return 0;
    }
}
