package X;

import android.content.Intent;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.ArrayList;

/* renamed from: X.8K8  reason: invalid class name */
public final class AnonymousClass8K8 implements C3493580b {
    public final /* synthetic */ AnonymousClass8K4 A00;

    public AnonymousClass8K8(AnonymousClass8K4 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        Intent intent;
        Integer num;
        String str;
        int i;
        Object obj4 = obj3;
        AnonymousClass80V r3 = (AnonymousClass80V) obj2;
        int ordinal = ((AnonymousClass80V) obj).ordinal();
        if (ordinal == 39) {
            AnonymousClass8K4 r15 = this.A00;
            Integer num2 = AnonymousClass05K.A01;
            Integer num3 = num2;
            if (obj4 instanceof C356438Tw) {
                C356438Tw r6 = (C356438Tw) obj4;
                num = Integer.valueOf(r6.A00);
                intent = r6.A01;
            } else if (obj4 instanceof C356458Ty) {
                C356458Ty r62 = (C356458Ty) obj4;
                int i2 = 0;
                if (r62.A01) {
                    i2 = -1;
                }
                num = Integer.valueOf(i2);
                intent = r62.A00;
                num2 = AnonymousClass05K.A0N;
            } else {
                intent = null;
                num = null;
            }
            C3499482o r8 = r15.A0I.A02;
            AnonymousClass82Y r0 = r8.A01;
            Integer num4 = r0.A0B;
            0qQ.A07(num4);
            if (num4 == num3 && r8.A01() == C365758nd.A04 && num != null && num.intValue() == -1 && intent != null) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets");
                C39892ADt aDt = new C39892ADt(parcelableArrayListExtra, intent.getParcelableArrayListExtra("bundle_extra_user_story_targets"));
                boolean booleanExtra = intent.getBooleanExtra("bundle_extra_user_tapped_done_button", false);
                boolean booleanExtra2 = intent.getBooleanExtra("ARGUMENTS_MEDIA_SHARED_TO_FEED", false);
                IngestSessionShim ingestSessionShim = (IngestSessionShim) intent.getParcelableExtra("bundle_extra_ingest_session");
                if (ingestSessionShim == null) {
                    Integer num5 = r0.A0D;
                    if (num5 != null) {
                        str = C394519yF.A00(num5);
                    } else {
                        str = "null";
                    }
                    C357638Yz r02 = r0.A0X;
                    r02.getClass();
                    0kD.A01(AnonymousClass8K4.__redex_internal_original_name, 002.A13("onExitRecipientPicker(): null ingestSession | mediaSource=", str, " | cameraDestination=", ((C279284yO) r02.A08.A00).A02, " | captureFormat=", C363828kP.A00(r8.A03())));
                } else {
                    AnonymousClass8K4.A09(r15, new C39651A3r((String) ingestSessionShim.A00.get(0)), aDt, num2, AnonymousClass0eN.A01(new C41450AuA((Bitmap) null, r15, aDt, num2)), booleanExtra, booleanExtra2);
                    if (!intent.getBooleanExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHARE_SHEET_LOGGING_REWRITE_IS_ENABLED", false) && parcelableArrayListExtra != null) {
                        UserSession userSession = r15.A0D;
                        C56293Hw6.A01(r15, userSession, userSession.A06, parcelableArrayListExtra);
                    }
                }
            } else {
                Integer num6 = r0.A0B;
                0qQ.A07(num6);
                if (num6 == AnonymousClass05K.A0C && r8.A01() == C365758nd.A04 && num != null && num.intValue() == -1 && intent != null) {
                    intent.getParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets");
                    ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("bundle_extra_user_story_targets");
                    Object obj5 = r15.A0i.get();
                    UserStoryTarget userStoryTarget = UserStoryTarget.A07;
                    if (!(parcelableArrayListExtra2 == null || !parcelableArrayListExtra2.contains(userStoryTarget) || obj5 == 28D.A3y || obj5 == 28D.A3z || obj5 == 28D.A5L || obj5 == 28D.A5M)) {
                        r15.A0J.A0l.CqO("media_posted_to_highlight");
                    }
                }
            }
        } else if (ordinal == 72 && (obj4 instanceof C356308Tj)) {
            C356308Tj r63 = (C356308Tj) obj4;
            C352218Cl r5 = r63.A01;
            if (r63.A00 == C362088hK.A0A && r5.A09 == r5.A06) {
                AnonymousClass8K4 r7 = this.A00;
                if (182.A06(0Tu.A05, r7.A0D, 36329504859308193L)) {
                    r7.A08 = true;
                }
            }
        }
        int ordinal2 = r3.ordinal();
        if (ordinal2 == 39) {
            AnonymousClass8K4.A06(this.A00);
        } else if (ordinal2 == 4) {
            AnonymousClass8K4 r1 = this.A00;
            if (r1.A0N.A02 != null) {
                C352218Cl A03 = r1.A0I.A02.A01.A03();
                if (A03 != null) {
                    i = A03.A08;
                } else {
                    i = -1;
                }
                C353788Jb r2 = r1.A0R;
                AnonymousClass8KC r12 = r1.A0L;
                0qQ.A0B(r12, 1);
                C366068o8 r03 = r2.A04;
                if (r03 != null) {
                    r03.A00 = i;
                    r03.A02 = r12;
                }
                AnonymousClass9YG r04 = r2.A03;
                if (r04 != null) {
                    r04.A00 = i;
                    r04.A02 = r12;
                }
            }
        }
    }
}
