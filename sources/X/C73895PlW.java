package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.EglBase14Impl;

/* renamed from: X.PlW  reason: case insensitive filesystem */
public final class C73895PlW extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73895PlW(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73895PlW(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                UserSession userSession = ((C70978OTz) this.A01).A00;
                return new C70591OCo(userSession, 2Ix.A00(userSession));
            case 1:
                return new L8O(((C70978OTz) this.A01).A00);
            case 2:
                return new OAC(((C70978OTz) this.A01).A00);
            case 3:
                return Boolean.valueOf(((C70978OTz) this.A01).A02.A0K.A06);
            case 4:
                return ((C71080Oaz) this.A01).A03;
            case 6:
                return ((C71080Oaz) this.A01).A04;
            case 8:
                C70978OTz oTz = (C70978OTz) this.A01;
                C69120Nez nez = oTz.A02.A0M;
                AnonymousClass0r6 r2 = oTz.A0G;
                0qQ.A0B(r2, 0);
                return AnonymousClass10H.A03(new C66193MHj((Object) nez, (AnonymousClass4D7) null, 36, 42), new C73522Pe8(9, nez, new MC9(r2, 55)), new C62170rn(new C66166MGd((Object) AnonymousClass7TE.A0v(), (AnonymousClass4D7) null, 48), nez.A02.A06));
            case 9:
                return C66581MXm.A0T(((C69079NeJ) this.A01).A08, R.id.ai_status_stub);
            case 10:
                return ((PM7) this.A01).A01.getView().findViewById(R.id.ai_status_compose_view);
            case 11:
                return new C70504O9d((C69112Ner) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return JTR.A0V(((C69112Ner) this.A01).A0A, R.id.ar_effect_picker_background_stub);
            case 13:
                return Float.valueOf(((C69112Ner) this.A01).A0A.getResources().getDimension(R.dimen.ar_effect_picker_halo_vertical_offset));
            case 14:
                return new C72288Ozx((C69112Ner) this.A01);
            case 15:
                C69112Ner ner = (C69112Ner) this.A01;
                Context A0S = AnonymousClass7TE.A0S(ner.A0A);
                UserSession userSession2 = ner.A0F;
                C70753OJz oJz = ner.A0I;
                View inflate = ((ViewStub) ner.A0k.getValue()).inflate();
                0qQ.A07(inflate);
                AnonymousClass8DM r10 = (AnonymousClass8DM) ner.A0U.getValue();
                C69378NkI nkI = ner.A03.A07;
                OKY oky = ner.A0G;
                OLE ole = ner.A0K;
                ArrayList A1C = AnonymousClass7TE.A1C();
                A1C.add(C69378NkI.EFFECT);
                if (182.A06(0Tu.A05, ole.A03.A00, 36317113878582051L)) {
                    A1C.add(C69378NkI.SOLO_BACKGROUNDS);
                }
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                A1C2.add(C69378NkI.AVATAR);
                C71139Odj odj = new C71139Odj(A0S, inflate, userSession2, r10, oky, oJz, nkI, A1C, A1C2);
                odj.A01 = new C70509O9i(ner);
                return odj;
            case 16:
                return Float.valueOf(-((C69112Ner) this.A01).A0A.getResources().getDimension(R.dimen.account_group_management_clickable_width));
            case 17:
                C69112Ner ner2 = (C69112Ner) this.A01;
                OES oes = ner2.A0J;
                AnonymousClass0iw r8 = ner2.A0C;
                AnonymousClass80W r13 = (AnonymousClass80W) ner2.A0j.getValue();
                View view = ner2.A0A;
                C72288Ozx ozx = (C72288Ozx) ner2.A0R.getValue();
                C70504O9d o9d = (C70504O9d) ner2.A0O.getValue();
                AnonymousClass7TG.A0w(1, r13, ozx, o9d);
                C72287Ozw ozw = new C72287Ozw(oes);
                AnonymousClass86A r0 = new AnonymousClass86A((HashSet) null, (DefaultConstructorMarker) null, 1);
                UserSession userSession3 = oes.A01;
                AnonymousClass8DI r102 = new AnonymousClass8DI(userSession3, ozw, r0);
                C72286Ozv ozv = new C72286Ozv(view, r8, userSession3, r102, ozx, o9d, r13, "video_call", true, true);
                ozv.EUK(true);
                r102.A00 = ozv;
                return ozv;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C69112Ner ner3 = (C69112Ner) this.A01;
                OES oes2 = ner3.A0J;
                Context A0S2 = AnonymousClass7TE.A0S(ner3.A0A);
                Activity activity = ner3.A09;
                AnonymousClass07Z r7 = (AnonymousClass07Z) activity;
                AnonymousClass8AL r4 = new AnonymousClass8AL(A0S2, C66581MXm.A0B(ner3.A0h), r7, (GalleryPickerServiceDataSource) null, oes2.A01, (C357638Yz) null, (TargetViewSizeProvider) null, (AnonymousClass8AH) null, new C72282Ozr(ner3), new C72283Ozs(ner3), (C3504884v) null, (AnonymousClass825) null, R.drawable.floating_button_black_background, true, false, false);
                View view2 = r4.A0J;
                view2.setFitsSystemWindows(true);
                view2.requestApplyInsets();
                0qQ.A0C(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                C68687NSt nSt = new C68687NSt(r4, (AnonymousClass80W) ner3.A0j.getValue(), AnonymousClass07a.A00(r7));
                nSt.A00 = new C353338Hf(A0S2, ner3.A0C, ner3.A0F, nSt);
                nSt.A02 = new C70508O9h(ner3);
                float f = ner3.A00;
                nSt.A00 = f;
                nSt.A05.A0P.setTranslationY(f);
                return nSt;
            case 19:
                C69112Ner ner4 = (C69112Ner) this.A01;
                Activity activity2 = ner4.A09;
                0qQ.A0C(activity2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                OIF oif = new OIF((ViewStub) ner4.A0c.getValue(), (AnonymousClass80W) ner4.A0j.getValue(), AnonymousClass07a.A00((AnonymousClass07Z) activity2), DbX.A07(ner4.A0i));
                oif.A02.A0F = new PRH(ner4);
                return oif;
            case 20:
                return ((C69112Ner) this.A01).A0A.getContext().getDrawable(R.drawable.avatar_effect_placeholder);
            case 21:
                C69112Ner ner5 = (C69112Ner) this.A01;
                View view3 = ner5.A0A;
                Context context = view3.getContext();
                Drawable drawable = context.getDrawable(R.drawable.instagram_browse_effects_pano_outline_24);
                0qQ.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
                Bitmap A002 = 0fO.A00(((BitmapDrawable) drawable).getBitmap(), dimensionPixelSize, dimensionPixelSize, true);
                0qQ.A07(A002);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), A002);
                DbX.A11(context, bitmapDrawable, 2Yu.A05(ner5.A09));
                DbS.A0F(view3, R.id.effect_gallery_entry_button_view_stub).inflate();
                ImageView A0G = DbS.A0G(view3, R.id.gallery_entry_button);
                A0G.setImageDrawable(bitmapDrawable);
                AnonymousClass0fU.A00(new C71305Oi1(ner5), A0G);
                return A0G;
            case 22:
                return ((C69112Ner) this.A01).A0A.findViewById(R.id.ar_effect_loading_indicator_stub);
            case 23:
                ViewStub viewStub = (ViewStub) ((C69112Ner) this.A01).A0Z.getValue();
                0qQ.A07(viewStub);
                return new C3504384q(viewStub);
            case 24:
                return new OKZ(AnonymousClass7TE.A0S(((C69112Ner) this.A01).A0A));
            case 25:
                return ((C69112Ner) this.A01).A0A.requireViewById(R.id.rtc_effect_slider_stub);
            case 26:
                return new C71837Ore((C69112Ner) this.A01);
            case 27:
                return new C70506O9f((C69112Ner) this.A01);
            case 28:
                C69112Ner ner6 = (C69112Ner) this.A01;
                UserSession userSession4 = ner6.A0F;
                FragmentActivity fragmentActivity = ner6.A09;
                DbS.A1X(fragmentActivity);
                AnonymousClass0iw r103 = ner6.A0C;
                return new C357648Za(DbT.A05(fragmentActivity), fragmentActivity, (AnonymousClass4DH) null, r103, userSession4);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return Float.valueOf(((C69112Ner) this.A01).A0A.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height));
            case 30:
                return ((C69112Ner) this.A01).A0A.findViewById(R.id.floating_button_picker_stub);
            case 31:
                return Integer.valueOf(C51972G9s.A08(((C69112Ner) this.A01).A0A.getContext()));
            case 32:
                AnonymousClass80V r3 = AnonymousClass80V.CAPTURE;
                AnonymousClass80W r6 = new AnonymousClass80W(r3);
                Class<AnonymousClass8SF> cls = AnonymousClass8SF.class;
                AnonymousClass80V r02 = AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY;
                r6.A03(cls, r3, r02);
                r6.A03(cls, r02, r3);
                r6.A02(new PQ5((C69112Ner) this.A01));
                return r6;
            case 33:
                return ((C69112Ner) this.A01).A0A.findViewById(R.id.ar_effect_picker_tabs_view_stub);
            case 34:
                return new C72289Ozy((C69112Ner) this.A01);
            case 35:
                C69112Ner ner7 = (C69112Ner) this.A01;
                return new C17881VhY(ner7.A09, ner7.A0F, "video_call", false);
            case 36:
                return JTR.A0V(((PM8) this.A01).A01, R.id.effect_delivery_debug_info_stub);
            case 37:
                return AnonymousClass7TH.A06(((PM8) this.A01).A03).findViewById(R.id.debug_text_view);
            case 38:
                return Float.valueOf(DbU.A05(((C69105Nek) this.A01).A09).getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            case 39:
                ((C69105Nek) this.A01).A0C.A00(new C72787PKb(AnonymousClass05K.A1F));
                return C60340gF.A00;
            case 40:
                ((C69105Nek) this.A01).A0C.A00(C72795PKj.A00);
                return C60340gF.A00;
            case Seq.NULL_REFNUM:
                PMT pmt = (PMT) this.A01;
                return PMT.A00(AnonymousClass7TH.A06(pmt.A0L), pmt, Integer.valueOf(R.drawable.instagram_photo_filter_outline_44), C66580MXl.A15(pmt.A05(), 44), (C62320sa) null, R.id.avatar_backgrounds_button);
            case Seq.RefTracker.REF_OFFSET:
                PMT pmt2 = (PMT) this.A01;
                return PMT.A00(AnonymousClass7TH.A06(pmt2.A0L), pmt2, (Integer) null, C66580MXl.A15(pmt2.A05(), 45), (C62320sa) null, R.id.avatar_thumbnail_button);
            case 43:
                return AnonymousClass7TH.A06(((PMT) this.A01).A0L).findViewById(R.id.ig_avatar_thumbnail_loader);
            case 44:
                return AnonymousClass7TH.A06(((PMT) this.A01).A0L).findViewById(R.id.avatar_cross_mini_icon);
            case 45:
                PMT pmt3 = (PMT) this.A01;
                View A06 = AnonymousClass7TH.A06(pmt3.A0L);
                boolean A062 = 182.A06(0Tu.A05, pmt3.A06, 36322465407838403L);
                int i = R.drawable.instagram_facebook_avatars_outline_44;
                if (A062) {
                    i = R.drawable.instagram_avatars_outline_44;
                }
                return PMT.A00(A06, pmt3, Integer.valueOf(i), C66580MXl.A15(pmt3.A05(), 46), C66580MXl.A15(pmt3.A05(), 47), R.id.avatars_button);
            case 46:
                PMT pmt4 = (PMT) this.A01;
                return PMT.A00(AnonymousClass7TH.A06(pmt4.A0L), pmt4, Integer.valueOf(R.drawable.instagram_chevron_down_outline_44), C66580MXl.A15(pmt4.A05(), 48), (C62320sa) null, R.id.chevron_button);
            case 47:
                PMT pmt5 = (PMT) this.A01;
                return PMT.A00(AnonymousClass7TH.A06(pmt5.A0L), pmt5, Integer.valueOf(R.drawable.instagram_dual_camera_pano_outline_24), C66580MXl.A15(pmt5.A05(), 49), (C62320sa) null, R.id.dual_camera_button);
            case 48:
                PMT pmt6 = (PMT) this.A01;
                return PMT.A00(AnonymousClass7TH.A06(pmt6.A0L), pmt6, Integer.valueOf(C338887ih.A00(pmt6.A06)), C66580MXl.A15(pmt6.A05(), 50), (C62320sa) null, R.id.effects_button);
            case 49:
                PMT pmt7 = (PMT) this.A01;
                View A063 = AnonymousClass7TH.A06(pmt7.A0L);
                boolean booleanValue = C306096Kt.A00(pmt7.A06).booleanValue();
                int i2 = R.drawable.instagram_color_filters_outline_44;
                if (booleanValue) {
                    i2 = R.drawable.instagram_palette_outline_44;
                }
                return PMT.A00(A063, pmt7, Integer.valueOf(i2), C66580MXl.A15(pmt7.A05(), 51), (C62320sa) null, R.id.filters_button);
            default:
                return ((C71080Oaz) this.A01).A02;
        }
    }
}
