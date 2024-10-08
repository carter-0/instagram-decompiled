package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public final class AOW implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AOW(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        C365758nd r0;
        C365758nd r1;
        Integer num;
        C370038vj r02;
        C370058vl r03;
        List<A6D> list;
        C2802350v r04;
        C2802350v r12;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(-2122702520);
                Intent intent = new Intent("android.intent.action.VIEW");
                C39678A4u a4u = (C39678A4u) this.A02;
                Context context = a4u.A00;
                0kR.A0D(context, intent.setData(0oI.A01.buildUpon().appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, context.getPackageName()).build()));
                C381729cE r13 = a4u.A01;
                r13.A06 = true;
                r13.A00(context);
                ((Dialog) this.A01).dismiss();
                i = 304264639;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(1669702851);
                C39678A4u a4u2 = (C39678A4u) this.A02;
                C381729cE r14 = a4u2.A01;
                r14.A01 = 0;
                r14.A00(a4u2.A00);
                ((Dialog) this.A01).dismiss();
                i = -1147059828;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(-1040719002);
                C39678A4u a4u3 = (C39678A4u) this.A02;
                C381729cE r15 = a4u3.A01;
                r15.A05 = true;
                r15.A00(a4u3.A00);
                ((Dialog) this.A01).dismiss();
                i = 453815376;
                break;
            case 3:
                A05 = AnonymousClass0fD.A05(1311773381);
                C334397bC r16 = (C334397bC) this.A01;
                if (r16 != null) {
                    r16.DrU((C381459bn) this.A02);
                }
                i = 957115292;
                break;
            case 4:
                A05 = AnonymousClass0fD.A05(-1672350237);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ai-disclaimer-accepted", true);
                AnonymousClass80Q r05 = ((C342847pG) this.A02).A02.A00.A06;
                if (r05 != null) {
                    r05.A00.A0M.A00().A09(jSONObject);
                }
                ((C331157Pu) this.A01).A07();
                i = -1361593098;
                break;
            case 5:
                A05 = AnonymousClass0fD.A05(226286231);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ai-disclaimer-accepted", false);
                AnonymousClass80Q r06 = ((C342847pG) this.A02).A02.A00.A06;
                if (r06 != null) {
                    r06.A00.A0M.A00().A09(jSONObject2);
                }
                C59689JTv.A0G("Effect not available.");
                ((C331157Pu) this.A01).A07();
                i = -736394558;
                break;
            case 6:
                A05 = A00(this, -1525253734);
                i = 1793264952;
                break;
            case 7:
                A05 = A00(this, 2048442215);
                i = 944049752;
                break;
            case 8:
                A05 = AnonymousClass0fD.A05(-1426675980);
                C380629Yx r5 = (C380629Yx) this.A02;
                C369988ve r4 = r5.A00;
                if (r4 != null) {
                    C362358hl r17 = r5.A09;
                    boolean z = true;
                    if (r17.A02) {
                        Set set = r17.A0A;
                        boolean remove = set.remove(r4);
                        if (!remove) {
                            set.add(r4);
                        }
                        r17.A07.DSc(set.size());
                        boolean z2 = !remove;
                        C59740JVy jVy = r5.A0A;
                        int i2 = -1;
                        if (z2) {
                            i2 = 1;
                        }
                        jVy.A00(i2);
                        C394599yN.A00(r5.A02, z2, true);
                    } else {
                        String str = r4.A07;
                        if (str != null) {
                            ImageView imageView = (ImageView) this.A01;
                            if (imageView.getDrawable() != null) {
                                int bindingAdapterPosition = r5.getBindingAdapterPosition();
                                27r A012 = 27p.A01(r17.A04);
                                C363928ka A002 = r4.A00();
                                if (A002 != null) {
                                    r0 = A002.A02;
                                } else {
                                    r0 = null;
                                }
                                28t A06 = C59895JbK.A06(r0);
                                String str2 = r4.A05;
                                String str3 = r17.A09;
                                Pair pair = new Pair(Integer.valueOf((bindingAdapterPosition / 3) + 1), Integer.valueOf((bindingAdapterPosition % 3) + 1));
                                29O r11 = A012.A06;
                                0qQ.A0B(A06, 0);
                                0qQ.A0B(str2, 1);
                                0Aj A0e = AnonymousClass7TE.A0e(r11.A01, "ig_camera_draft");
                                if (A0e.isSampled()) {
                                    A0e.AAJ("step", "EDIT_STORY_TEMP");
                                    A0e.AAK(r11.A0M(), "creation_session_state");
                                    AnonymousClass283 r7 = r11.A04;
                                    String str4 = r7.A0L;
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    A0e.AAJ("camera_session_id", str4);
                                    AnonymousClass7TH.A0W(A0e, r11);
                                    AnonymousClass7TE.A1V(A0e, r7);
                                    A0e.A8M(r7.A0C, "surface");
                                    A0e.A8M(r7.A0A, "media_type");
                                    A0e.AAJ("module", 27x.A08.getModuleName());
                                    A0e.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                                    A0e.AAJ("module", str3);
                                    ArrayList A1C = AnonymousClass7TE.A1C();
                                    AnonymousClass7TE.A1Y(A1C, (long) AnonymousClass7TE.A0M(pair.first));
                                    AnonymousClass7TE.A1Y(A1C, (long) AnonymousClass7TE.A0M(pair.second));
                                    AnonymousClass7TE.A1W(A0e, "event_type", 2);
                                    A0e.AAJ("composition_str_id", str2);
                                    A0e.A8M(A06, "composition_media_type");
                                    A0e.AAe("draft_position", A1C);
                                    A0e.A8M((AnonymousClass0Ac) null, "media_source");
                                    A0e.A8M((AnonymousClass0Ac) null, "capture_type");
                                    A0e.A8D("draft_creation_time", (Double) null);
                                    A0e.A7p("is_organic_product_tagging_eligible_user", Boolean.valueOf(C367088qA.A05(r11.A03, false)));
                                    A0e.AAJ("legacy_falco_event_name", "IG_CAMERA_STORIES_EDIT_DRAFT");
                                    A0e.Cgf();
                                }
                                UserSession userSession = r5.A07;
                                C365928nu A003 = C365918nt.A00(userSession);
                                C363928ka A004 = r4.A00();
                                if (A004 != null) {
                                    r1 = A004.A02;
                                } else {
                                    r1 = null;
                                }
                                if (r1 != C365758nd.A07) {
                                    z = false;
                                }
                                29E r10 = A003.A04;
                                long A03 = r10.A03(518925558, 12000);
                                A003.A00 = A03;
                                if (z) {
                                    num = AnonymousClass05K.A01;
                                } else {
                                    num = AnonymousClass05K.A00;
                                }
                                r10.A09(A03, "media_type", C365948nw.A00(num));
                                27p.A01(userSession).A1p(str);
                                C370018vh r07 = r4.A04;
                                if (!(r07 == null || (r02 = r07.A02) == null || (r03 = r02.A04) == null || (list = r03.A03) == null)) {
                                    for (A6D a6d : list) {
                                        AnonymousClass513 r08 = a6d.A00;
                                        if (r08 != null) {
                                            r04 = r08.A00();
                                        } else {
                                            r04 = null;
                                        }
                                        if (r04 instanceof Af1) {
                                            AnonymousClass513 r09 = a6d.A00;
                                            if (r09 != null) {
                                                r12 = r09.A00();
                                            } else {
                                                r12 = null;
                                            }
                                            0qQ.A0C(r12, "null cannot be cast to non-null type com.instagram.reels.music.view.LyricsStickerClientModel");
                                            MusicOverlayStickerModel BUu = ((Af1) r12).BUu();
                                            29I r112 = 27p.A01(userSession).A02;
                                            String str5 = r4.A05;
                                            String str6 = BUu.A0S;
                                            String str7 = BUu.A0T;
                                            String str8 = BUu.A0m;
                                            0qQ.A0B(str5, 1);
                                            AnonymousClass7TG.A1K(r112);
                                            29I.A01(r112, "user_post_capture_restored_draft_with_music", str6, str7, str8, str5, (String) null, (String) null, (String) null, (String) null);
                                        }
                                    }
                                }
                                C362018hC r42 = r5.A08;
                                Drawable drawable = imageView.getDrawable();
                                0qQ.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                                0qQ.A07(bitmap);
                                r42.Dnm(bitmap, str);
                            }
                        }
                    }
                    i = -803317224;
                    break;
                } else {
                    i = -239171930;
                    break;
                }
            case 9:
                A05 = AnonymousClass0fD.A05(-94275261);
                AnonymousClass9QZ.A00((AnonymousClass9QZ) this.A02, (Integer) this.A01);
                i = -300987978;
                break;
            case 10:
                A05 = AnonymousClass0fD.A05(403960073);
                int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                MagicMediaRemixEditController magicMediaRemixEditController = ((C380489Yj) this.A02).A02;
                String str9 = ((AYO) this.A01).A01;
                0qQ.A0B(str9, 0);
                Iterator it = magicMediaRemixEditController.A0H.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                    } else if (!0qQ.A0K(((AYO) it.next()).A01, str9)) {
                        i4++;
                    }
                }
                int i5 = magicMediaRemixEditController.A00;
                AnonymousClass2t9 r43 = magicMediaRemixEditController.A07;
                AnonymousClass2tH r3 = r43.A04;
                Object obj = r3.Au8().get(i5);
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixMediaSelectorItemViewModel");
                ((AYO) obj).A02 = false;
                r43.notifyItemChanged(i5);
                magicMediaRemixEditController.A00 = i4;
                Object obj2 = r3.Au8().get(i4);
                0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixMediaSelectorItemViewModel");
                ((AYO) obj2).A02 = true;
                r43.notifyItemChanged(i4);
                i = 2047542672;
                break;
            case 11:
                A05 = AnonymousClass0fD.A05(979088329);
                Dialog dialog = ((C358248ab) this.A02).A0P;
                ((DialogInterface.OnClickListener) this.A01).onClick(dialog, -3);
                dialog.dismiss();
                i = -109591787;
                break;
            default:
                A05 = AnonymousClass0fD.A05(-1638549661);
                Dialog dialog2 = ((C358248ab) this.A02).A0P;
                ((DialogInterface.OnClickListener) this.A01).onClick(dialog2, -3);
                dialog2.dismiss();
                i = 1908710337;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }

    public static int A00(AOW aow, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        C346607vS r3 = (C346607vS) aow.A02;
        r3.A0F.A0G(((C3499182k) aow.A01).BAL(), r3.A0H.A01.A0k.booleanValue());
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(r3.A08);
        if (A012 != null) {
            A012.A0B();
        }
        return A05;
    }
}
