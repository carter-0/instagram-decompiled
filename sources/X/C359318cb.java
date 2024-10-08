package X;

import android.animation.LayoutTransition;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8cb  reason: invalid class name and case insensitive filesystem */
public final class C359318cb implements AnonymousClass8HH, C352348Cz, C3493580b {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public ViewStub A04;
    public AnonymousClass2Fj A05;
    public 1wn A06;
    public IgImageView A07;
    public IgImageView A08;
    public AnonymousClass8d3 A09;
    public C359338cd A0A;
    public C357318Xk A0B;
    public AnonymousClass8MY A0C;
    public AnonymousClass8YU A0D;
    public IgdsMediaButton A0E;
    public IgdsMediaButton A0F;
    public ClipInfo A0G;
    public C359418cn A0H = C359418cn.A00;
    public String A0I;
    public List A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public final int A0R;
    public final Context A0S;
    public final Handler A0T;
    public final View A0U;
    public final View A0V;
    public final View A0W;
    public final FragmentActivity A0X;
    public final 28D A0Y;
    public final AnonymousClass4DH A0Z;
    public final AnonymousClass0iw A0a;
    public final UserSession A0b;
    public final IgFrameLayout A0c;
    public final C357638Yz A0d;
    public final CreationActionBar A0e;
    public final TargetViewSizeProvider A0f;
    public final ClipsAssetHubViewModel A0g;
    public final C3499582p A0h;
    public final AnonymousClass8WX A0i;
    public final AnonymousClass85O A0j;
    public final C3506885u A0k;
    public final AnonymousClass80U A0l;
    public final ClipsAudioMixingDrawerController A0m;
    public final C359448cq A0n;
    public final AnonymousClass8IA A0o;
    public final C353548Ib A0p;
    public final AnonymousClass8ZP A0q;
    public final C3507185x A0r;
    public final ClipsCreationViewModel A0s;
    public final AnonymousClass8BN A0t;
    public final C3511387s A0u;
    public final ClipsCreationDraftViewModel A0v;
    public final C2801950r A0w;
    public final AnonymousClass846 A0x;
    public final AnonymousClass861 A0y;
    public final AnonymousClass88B A0z;
    public final IgdsMediaButton A10;
    public final MusicAttributionConfig A11;
    public final AnonymousClass88G A12;
    public final InteractiveDrawableContainer A13;
    public final String A14;
    public final List A15;
    public final AnonymousClass0eK A16;
    public final AnonymousClass0eK A17;
    public final AnonymousClass0eK A18;
    public final AnonymousClass0eM A19;
    public final AnonymousClass0eM A1A;
    public final AnonymousClass0eM A1B = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LJ(this, 28));
    public final AnonymousClass0eM A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final AnonymousClass2Fj A1F;
    public final ACRType A1G;
    public final C3503284f A1H;
    public final AnonymousClass80D A1I;
    public final C314446iH A1J;
    public final Runnable A1K;
    public final String A1L;
    public final AnonymousClass0eK A1M;
    public final AnonymousClass0eM A1N;

    public static final void A01(Drawable drawable, C359318cb r6) {
        Object obj;
        AnonymousClass5MI r0;
        Drawable AfT;
        Drawable drawable2 = drawable;
        boolean z = drawable instanceof AnonymousClass5MI;
        if (z) {
            drawable2 = ((AnonymousClass5MI) drawable2).AfT();
        }
        if (!(drawable2 instanceof B3d)) {
            Drawable drawable3 = drawable;
            if (0qQ.A0K(r6.A0d.A08.A00, C3493880e.A00)) {
                Integer num = null;
                if (!(!z || (r0 = (AnonymousClass5MI) drawable) == null || (AfT = r0.AfT()) == null)) {
                    drawable3 = AfT;
                }
                if (!(drawable3 instanceof C354798Nk)) {
                    Iterator it = r6.A13.getInteractiveDrawables().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (0qQ.A0K(((C378669Qs) ((B2K) obj)).A0B, drawable3)) {
                            break;
                        }
                    }
                    B3f b3f = (B3f) obj;
                    if (b3f != null) {
                        num = ((C378669Qs) b3f).A0G;
                    }
                    if (num == AnonymousClass05K.A01) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (drawable instanceof AnonymousClass5MH) {
                ClipsCreationViewModel clipsCreationViewModel = r6.A0s;
                AnonymousClass5MI r5 = (AnonymousClass5MI) drawable;
                0qQ.A0B(r5, 0);
                clipsCreationViewModel.A0N.A01(r5);
            } else if (drawable instanceof C268714ds) {
                C3500783d r2 = r6.A0s.A0N;
                List list = r2.A01;
                list.add(drawable);
                r2.A0B.Epw(list);
                r2.A05.FIA(drawable);
            }
        }
    }

    public static final void A02(Drawable drawable, C359318cb r4) {
        Drawable drawable2 = drawable;
        if (drawable instanceof AnonymousClass5MI) {
            drawable2 = ((AnonymousClass5MI) drawable2).AfT();
        }
        if (drawable2 instanceof B3d) {
            return;
        }
        if (drawable instanceof AnonymousClass5MH) {
            ClipsCreationViewModel clipsCreationViewModel = r4.A0s;
            clipsCreationViewModel.A0c((AnonymousClass5MI) drawable);
            AnonymousClass5MH r3 = (AnonymousClass5MH) drawable;
            if (r3.A02.A00 == AnonymousClass05K.A0C) {
                String str = r3.A0B;
                0qQ.A0B(str, 0);
                clipsCreationViewModel.A0K.A0A.A01(str);
            }
        } else if (drawable instanceof C268714ds) {
            r4.A0s.A0f((C268714ds) drawable);
        }
    }

    public static final void A05(C3499482o r11, C359318cb r12, C2801950r r13, List list) {
        C359318cb r1 = r12;
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = r12.A0v;
        C3499482o r3 = r11;
        C2801950r r10 = r13;
        clipsCreationDraftViewModel.A0F(r13, r11.A01.A0i, false);
        if (r13 == C2801950r.FEED_POST) {
            27p.A01(r12.A0b).A10(C279294yP.FEED, (C371088xY) null);
        }
        28D r8 = r12.A0Y;
        if (r8 == 28D.A4b || r8 == 28D.A1W) {
            r12.A0O(r12.A0S.getString(2131955501));
        }
        UserSession userSession = r12.A0b;
        AnonymousClass8A2 A012 = AnonymousClass8A1.A01(userSession);
        String str = ((C279284yO) r12.A0d.A08.A00).A02;
        0qQ.A0B(r13, 0);
        AnonymousClass8A2.A00(r8, A012, r10, str, "prefill_import_start", "5");
        String str2 = (String) clipsCreationDraftViewModel.A0O.getValue();
        if (str2 == null) {
            str2 = 27p.A01(userSession).A04.A0L;
        }
        Context context = r1.A0S;
        2Nn A002 = AnonymousClass830.A00(context, userSession);
        CameraSpec A022 = AnonymousClass72R.A02(userSession, r1.A0f);
        C385839jc r2 = new C385839jc(r3, r1, r10);
        0qQ.A0B(list, 0);
        0qQ.A0B(A002, 3);
        C290815g0 r0 = new C290815g0(new C41362Asj(context, userSession, A022, (C39653A3t) null, A002, str2, list), 459);
        r0.A00 = r2;
        1ES.A03(r0);
    }

    public final void A0I() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnonymousClass0eM r1 = this.A1C;
        ((View) r1.getValue()).startAnimation(alphaAnimation);
        ((View) r1.getValue()).setVisibility(0);
    }

    public final void A0L(Drawable drawable) {
        ClipsCreationViewModel clipsCreationViewModel;
        int i;
        int i2 = 0;
        0qQ.A0B(drawable, 0);
        if (drawable instanceof AnonymousClass5MH) {
            if (this.A0G == null || this.A0u.A0H()) {
                this.A15.add(drawable);
                return;
            }
            AnonymousClass5MH r3 = (AnonymousClass5MH) drawable;
            Integer num = null;
            if (r3.A01 != -1 && r3.A00 != -1) {
                Drawable drawable2 = r3.A0A;
                if (drawable2 instanceof C306386Ly) {
                    C306386Ly r2 = (C306386Ly) drawable2;
                    if (r2 != null) {
                        num = r2.A0M;
                    }
                    if (num == AnonymousClass05K.A01) {
                        clipsCreationViewModel = this.A0s;
                        boolean z = !clipsCreationViewModel.A0L.A04.isEmpty();
                        i2 = r3.A01;
                        if (!z) {
                            if (!(i2 == -1 || r3.A00 == -1)) {
                                i = Math.min(ClipsCreationViewModel.A00(clipsCreationViewModel).A00, r3.A00);
                            }
                        }
                        i = ClipsCreationViewModel.A00(clipsCreationViewModel).A00;
                    }
                }
            } else if (this.A0G == null) {
                0kD.A07("ClipsPostCaptureController", "video render not set up", (Throwable) null);
                return;
            } else {
                clipsCreationViewModel = this.A0s;
                i = ClipsCreationViewModel.A00(clipsCreationViewModel).A00;
            }
            r3.Eog(i2, i);
        }
        A01(drawable, this);
        this.A0T.removeCallbacksAndMessages((Object) null);
    }

    public final void A0M(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        if (drawable instanceof AnonymousClass5MH) {
            A02(drawable, this);
            ArrayList arrayList = new ArrayList();
            List list = this.A15;
            for (Object next : list) {
                if (next == drawable) {
                    arrayList.add(next);
                }
            }
            list.removeAll(arrayList);
            return;
        }
        A02(drawable, this);
    }

    public final /* synthetic */ void DNK(float f, float f2) {
    }

    public final /* synthetic */ void E0X(float f) {
    }

    public static final AnonymousClass51M A00(C359318cb r31, C349307zv r32, int i, int i2) {
        String str;
        Integer num;
        Boolean bool;
        Long l;
        Long l2;
        C67231sQ clipsMetadata;
        C270534gt B3C;
        List<C46279DTi> B9M;
        C349307zv r5 = r32;
        Medium medium = r5.A0R;
        if (medium != null) {
            str = medium.A0Y;
            num = Integer.valueOf(medium.A05);
            bool = medium.A0K;
        } else {
            str = null;
            num = null;
            bool = null;
        }
        int i3 = r5.A0K;
        int i4 = i3;
        int i5 = r5.A08;
        int i6 = r5.A09;
        if (i6 == 90 || i6 == 270) {
            i4 = i5;
            i5 = i3;
        }
        Medium A032 = C282665Eg.A03(new File(r5.A0k), 3, 0);
        A032.A0B = i4;
        A032.A04 = i5;
        C349307zv r3 = new C349307zv(A032, i4, i5, 0);
        r3.A07 = r5.A07;
        r3.A0H = 0;
        r3.A06 = r5.A07;
        r3.A1L = r5.A1L;
        r3.A0r = r5.A0r;
        MediaUploadMetadata A022 = r5.A02();
        C359318cb r52 = r31;
        ACRType aCRType = r52.A1G;
        String str2 = r52.A1L;
        int A002 = I5p.A00(aCRType, str2, 1);
        int i7 = r3.A07;
        AnonymousClass51M r11 = new AnonymousClass51M((C53401GnY) null, (0v6) null, new AnonymousClass51S(0sn.A00, (List) null, (Set) null, 1.0f, -1, false), C39821AAs.A01(r3, r3.A06(), A002, i7, 0, i7, i7), (String) null, (String) null, (String) null, (String) null, (String) null, 1.0f, 0, 0, 0, 0, 0, 0, 1073741816, false, false, false, false);
        r11.A09 = i;
        r11.A08 = i2;
        r11.A0D = r3.A0U;
        r11.A0R = true;
        r11.A0T = false;
        AnonymousClass51R r33 = r11.A0F;
        r33.A0C = bool;
        C3498982i r2 = r52.A0z.A00;
        ArrayList arrayList = null;
        if (!(r2 == null || (clipsMetadata = r2.A04.A0C.getClipsMetadata()) == null || (B3C = clipsMetadata.B3C()) == null || (B9M = B3C.B9M()) == null)) {
            arrayList = new ArrayList(0Yv.A1E(B9M, 10));
            for (C46279DTi dTi : B9M) {
                arrayList.add(new AnonymousClass9JM((Integer) 0, AnonymousClass000.A00(618), dTi.getId(), dTi.getUsername(), dTi.getTitle(), dTi.C75()));
            }
        }
        r33.A0J = arrayList;
        r11.A0F.A0B.A01(A022);
        if (str2 != null) {
            if (str != null) {
                l = 00y.A0n(10, str);
            } else {
                l = null;
            }
            if (num != null) {
                l2 = Long.valueOf((long) num.intValue());
            } else {
                l2 = null;
            }
            r11.A0C = new C53401GnY(aCRType, l, l2, str2);
        }
        return r11;
    }

    public static final void A03(View view, C359318cb r12) {
        IgdsMediaButton igdsMediaButton = r12.A0F;
        if (igdsMediaButton != null) {
            CreationActionBar creationActionBar = r12.A0e;
            if (creationActionBar.A09.contains(igdsMediaButton)) {
                creationActionBar.addView(view);
                creationActionBar.bringChildToFront(view);
                C270354gb r5 = new C270354gb();
                r5.A0I(creationActionBar);
                r5.A0C(view.getId(), 3, igdsMediaButton.getId(), 3);
                int id = view.getId();
                int id2 = igdsMediaButton.getId();
                Context context = creationActionBar.getContext();
                0qQ.A07(context);
                r5.A0E(id, 6, id2, 7, -((int) 0nA.A04(context, 12)));
                r5.A0G(creationActionBar);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(500);
                view.startAnimation(alphaAnimation);
            }
        }
    }

    public static final void A04(ImageUrl imageUrl, C357328Xl r23, C359318cb r24, AudioOverlayTrack audioOverlayTrack, boolean z) {
        int i;
        int i2;
        C359318cb r4 = r24;
        UserSession userSession = r4.A0b;
        if (1Au.A00(userSession).A01.getInt("edit_clips_button_badge_nux", 0) != 0) {
            if (r4.A0B == null) {
                View view = r4.A0V;
                View requireViewById = view.requireViewById(R.id.layout_post_capture_button_config);
                0qQ.A07(requireViewById);
                r4.A0B = new C357318Xk((ViewGroup) requireViewById, r4.A0a, userSession, new C40305AZu(r4));
                view.requireViewById(R.id.edit_buttons_toolbar).addOnLayoutChangeListener(new C40022AOe(r4));
            }
            r4.A05.A0B(Integer.valueOf((int) r4.A0S.getResources().getDimension(R.dimen.alert_dialog_button_cell_height)));
            C357328Xl r10 = r23;
            int ordinal = r10.ordinal();
            Integer num = null;
            if (ordinal == 4) {
                i = 2131955544;
                num = Integer.valueOf(i);
            } else if (ordinal == 5 || ordinal == 6 || ordinal == 3) {
                i = 2131955546;
                num = Integer.valueOf(i);
            } else {
                0kD.A07("ClipsPostCaptureController", "Sticky Toast Type not supported", (Throwable) null);
            }
            Integer num2 = null;
            if (ordinal == 4) {
                i2 = 2131955545;
                num2 = Integer.valueOf(i2);
            } else if (ordinal == 5 || ordinal == 6 || ordinal == 3) {
                i2 = 2131955547;
                num2 = Integer.valueOf(i2);
            } else {
                0kD.A07("ClipsPostCaptureController", "Sticky Toast Type not supported", (Throwable) null);
            }
            if (num != null && num2 != null) {
                C339287jM r5 = new C339287jM((Drawable) null, (View.OnClickListener) null, imageUrl, (C66504MUi) null, r10, (AnonymousClass4Ke) null, (String) null, (String) null, 0, num.intValue(), num2.intValue(), 0, R.dimen.abc_alert_dialog_button_dimen, false, false, true, false, false);
                C357318Xk r0 = r4.A0B;
                if (r0 != null) {
                    r0.A05.put(r10, new C40307AZw(r10, r4, audioOverlayTrack, z));
                }
                C357318Xk r2 = r4.A0B;
                if (r2 != null) {
                    r2.A02(r5, 2000);
                }
                Handler handler = r4.A0T;
                Runnable runnable = r4.A1K;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 9000);
            }
        }
    }

    public static final void A06(C359318cb r2) {
        View view = r2.A03;
        if (r2.A01 != null && view != null && view.getVisibility() == 0 && r2.A0L) {
            LayoutTransition layoutTransition = C3019160o.A01(view).getLayoutTransition();
            0qQ.A07(layoutTransition);
            layoutTransition.disableTransitionType(3);
            View view2 = r2.A03;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    public static final void A07(C359318cb r4) {
        if (182.A06(0Tu.A06, r4.A0b, 36318531217791198L) && r4.A01 == null) {
            try {
                r4.A01 = ((ViewStub) r4.A0c.requireViewById(R.id.preview_container)).inflate();
            } catch (Exception e) {
                0kD.A07("ClipsPostCaptureController", "Failed to inflate long press preview", e);
            }
        }
    }

    public static final void A08(C359318cb r7) {
        Runnable akI;
        1Au.A00(r7.A0b);
        if (!r7.A0Q) {
            if (!r7.A0X.isFinishing() && r7.A0w == C2801950r.FEED_POST) {
                1Av r5 = r7.A0n.A07;
                if (!((Boolean) r5.A3K.CDM(r5, 1Av.A8a[321])).booleanValue()) {
                    akI = new C65878M2t(r7);
                    11Z.A04(akI, 1000);
                    r7.A0Q = true;
                }
            }
            AnonymousClass8d3 r0 = r7.A09;
            if (r0 != null) {
                1Av r52 = r0.A02;
                if (!((Boolean) r52.A2e.CDM(r52, 1Av.A8a[322])).booleanValue() && !r52.A1o()) {
                    akI = new C40848AkI(r7);
                    11Z.A04(akI, 1000);
                    r7.A0Q = true;
                }
            }
        }
    }

    public static final void A09(C359318cb r3) {
        AnonymousClass2Fj r2 = r3.A1F;
        if (r3.A0d.A08.A00 instanceof AnonymousClass80O) {
            r2.A0A(new AnonymousClass88W(C60340gF.A00));
        }
    }

    public static final void A0A(C359318cb r7) {
        int i;
        if (!r7.A0O) {
            AnonymousClass831 r0 = (AnonymousClass831) r7.A0s.A0F.A02();
            if (r0 != null) {
                i = r0.A01.size();
            } else {
                i = 0;
            }
            AnonymousClass8A2 A012 = AnonymousClass8A1.A01(r7.A0b);
            Object obj = r7.A18.get();
            0qQ.A07(obj);
            28D r4 = (28D) obj;
            0qQ.A0B(r4, 0);
            AE4 A013 = A012.A0J.A01("postcapture", 838614012);
            String name = r4.name();
            0qQ.A0B(name, 1);
            A013.A04.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, name);
            A013.A05("num_segments", i);
            A012.A07 = A013.A01();
            ((AnonymousClass80T) r7.A0l).A01.A04(new Object());
        } else {
            ((AnonymousClass80T) r7.A0l).A01.A04(new Object());
        }
        r7.A0O(r7.A0S.getString(2131969783));
    }

    public static final void A0B(C359318cb r3) {
        IgdsMediaButton igdsMediaButton;
        int i;
        C3498982i r1 = r3.A0z.A00;
        AnonymousClass831 r2 = (AnonymousClass831) r3.A0s.A0F.A02();
        if ((r1 == null || r1.A00 != AnonymousClass8JI.SEQUENTIAL_REMIX || r2 == null || r2.A01.size() > 1) && !((Boolean) r3.A1A.getValue()).booleanValue()) {
            igdsMediaButton = r3.A10;
            if (igdsMediaButton != null) {
                i = 0;
            } else {
                return;
            }
        } else {
            igdsMediaButton = r3.A10;
            if (igdsMediaButton != null) {
                i = 8;
            } else {
                return;
            }
        }
        igdsMediaButton.setVisibility(i);
    }

    public static final void A0C(C359318cb r13, AudioOverlayTrack audioOverlayTrack) {
        List A042;
        UserSession userSession = r13.A0b;
        if (AnonymousClass30D.A08(userSession) && !r13.A0s.A0n() && r13.A0g.A01 == null && r13.A0u.A04 == null && !r13.A0l.CQ0(AnonymousClass80V.CLIPS_EDITOR) && !A0D(r13, audioOverlayTrack)) {
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36324539877044362L)) {
                C353548Ib r6 = r13.A0p;
                AnonymousClass4DH r8 = r13.A0Z;
                MusicProduct musicProduct = MusicProduct.CLIPS_CAMERA_FORMAT_V2;
                MusicBrowseCategory A012 = C64181LSn.A01("clips_browse");
                String str = r13.A14;
                LinkedHashMap linkedHashMap = null;
                if (182.A06(r2, userSession, 36324539877240973L) && (A042 = ((C3500883e) r13.A19.getValue()).A04()) != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object next : A042) {
                        String str2 = ((C381469bo) next).A02;
                        Object obj = linkedHashMap2.get(str2);
                        if (obj == null) {
                            obj = new ArrayList();
                            linkedHashMap2.put(str2, obj);
                        }
                        ((List) obj).add(next);
                    }
                    linkedHashMap = new LinkedHashMap(0se.A0L(linkedHashMap2.size()));
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        Object key = entry.getKey();
                        Iterable<C381469bo> iterable = (Iterable) entry.getValue();
                        int A0L2 = 0se.A0L(0Yv.A1E(iterable, 10));
                        if (A0L2 < 16) {
                            A0L2 = 16;
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(A0L2);
                        for (C381469bo r0 : iterable) {
                            linkedHashMap3.put(r0.A01, Float.valueOf(r0.A00));
                        }
                        linkedHashMap.put(key, linkedHashMap3);
                    }
                }
                r6.A00(musicProduct, r8, userSession, A012, str, linkedHashMap);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a3, code lost:
        if (r6 != null) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0D(X.C359318cb r10, com.instagram.music.common.model.AudioOverlayTrack r11) {
        /*
            X.8Ib r2 = r10.A0p
            X.05G r1 = r2.A01
            java.lang.Object r0 = r1.getValue()
            X.JZC r0 = (X.JZC) r0
            if (r0 == 0) goto L_0x0068
            X.MWx r0 = r0.A00()
            if (r0 == 0) goto L_0x0068
            com.instagram.common.typedurl.ImageUrl r6 = r0.As5()
        L_0x0016:
            X.2Fk r0 = r2.A00
            java.lang.Object r9 = r0.A02()
            java.lang.Object r0 = r1.getValue()
            X.JZC r0 = (X.JZC) r0
            if (r0 == 0) goto L_0x0066
            X.MWx r8 = r0.A00()
        L_0x0028:
            com.instagram.music.common.config.MusicAttributionConfig r3 = r10.A11
            if (r3 == 0) goto L_0x0064
            com.instagram.music.common.model.MusicAssetModel r0 = r3.A02
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = r0.A0E
        L_0x0032:
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L_0x006a
            int r0 = r0.length()
            if (r0 == 0) goto L_0x006a
            com.instagram.common.session.UserSession r5 = r10.A0b
            X.0Tu r4 = X.0Tu.A05
            r0 = 36324067430641371(0x810c8c00002edb, double:3.0348247361925225E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x006a
            if (r3 == 0) goto L_0x0063
            com.instagram.music.common.model.MusicAssetModel r0 = r3.A02
            if (r0 == 0) goto L_0x0063
            com.instagram.common.typedurl.ImageUrl r3 = r0.A03
            if (r3 == 0) goto L_0x0063
            X.8Xl r2 = X.C357328Xl.CLIPS_PRELOADED_SETTINGS_IN_CAMERA_PROMOTION
            r0 = 36324067430706908(0x810c8c00012edc, double:3.0348247362339684E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            A04(r3, r2, r10, r11, r0)
        L_0x0063:
            return r7
        L_0x0064:
            r0 = 0
            goto L_0x0032
        L_0x0066:
            r8 = 0
            goto L_0x0028
        L_0x0068:
            r6 = 0
            goto L_0x0016
        L_0x006a:
            if (r9 == 0) goto L_0x00a3
            if (r6 == 0) goto L_0x00ac
            if (r8 == 0) goto L_0x00a5
            com.instagram.common.session.UserSession r5 = r10.A0b
            X.0Tu r4 = X.0Tu.A05
            r0 = 36324067430641371(0x810c8c00002edb, double:3.0348247361925225E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00a5
            com.instagram.pendingmedia.model.ClipInfo r0 = r10.A0G
            if (r0 == 0) goto L_0x00ac
            int r1 = r0.A05
            int r0 = r0.A07
            int r1 = r1 - r0
            com.instagram.music.common.model.MusicAssetModel r0 = com.instagram.music.common.model.MusicAssetModel.A02(r8)
            X.0qQ.A0A(r0)
            com.instagram.music.common.model.AudioOverlayTrack r3 = new com.instagram.music.common.model.AudioOverlayTrack
            r3.<init>(r0, r2, r1)
            X.8Xl r2 = X.C357328Xl.CLIPS_POSTCAP_TOP_SUGGESTED_AUDIO_UPSELL
            r0 = 36324067430706908(0x810c8c00012edc, double:3.0348247362339684E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            A04(r6, r2, r10, r3, r0)
            return r7
        L_0x00a3:
            if (r6 == 0) goto L_0x00ac
        L_0x00a5:
            X.8Xl r1 = X.C357328Xl.CLIPS_POSTCAP_AUDIO_UPSELL
            r0 = 0
            A04(r6, r1, r10, r0, r2)
            return r7
        L_0x00ac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359318cb.A0D(X.8cb, com.instagram.music.common.model.AudioOverlayTrack):boolean");
    }

    public static final boolean A0E(C359318cb r1, AnonymousClass80V r2) {
        if (r2 != AnonymousClass80V.MEDIA_EDIT || !(r1.A0d.A08.A00 instanceof AnonymousClass80O)) {
            return false;
        }
        return true;
    }

    public final void A0F() {
        ClipsCreationViewModel clipsCreationViewModel = this.A0s;
        clipsCreationViewModel.AHr();
        AnonymousClass83A r1 = clipsCreationViewModel.A0K.A0A;
        Map map = r1.A02;
        map.clear();
        AnonymousClass83A.A00(r1, map);
    }

    public final void A0G() {
        ((Dialog) this.A1N.getValue()).dismiss();
    }

    public final void A0H() {
        if (this.A0s.A0u()) {
            this.A0l.E3H(new C356208Sz(C390839rv.POST_CAPTURE, true, false, (Boolean) null, (Integer) null, false, false));
            return;
        }
        this.A0l.E3H(new C356208Sz(C390839rv.POST_CAPTURE, false, (Boolean) null, (Boolean) null, (Integer) null, false, false));
        if (!this.A1D && this.A0R == 1) {
            0xY AR4 = 1Au.A00(this.A0b).A01.AR4();
            AR4.E5Z("edit_clips_button_badge_nux", -1);
            AR4.apply();
        }
        View view = this.A02;
        if (view != null) {
            view.setVisibility(8);
        }
        27p.A01(this.A0b).A0w(C279294yP.CLIPS);
    }

    /* JADX WARNING: type inference failed for: r0v63, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r0v71, types: [X.9jq, X.11X] */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012e, code lost:
        if (r0.A01.size() != 1) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013a, code lost:
        if (r5.A0F.A08 == 0) goto L_0x013c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J() {
        /*
            r18 = this;
            r4 = r18
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r4.A0s
            java.lang.String r7 = r6.A0L()
            r3 = 0
            if (r7 == 0) goto L_0x004c
            androidx.fragment.app.FragmentActivity r1 = r4.A0X
            boolean r0 = r1.isDestroyed()
            r5 = 1
            if (r0 != 0) goto L_0x01b7
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x01b7
            X.8ab r3 = new X.8ab
            r3.<init>((android.app.Activity) r1)
            r0 = 2131955493(0x7f130f25, float:1.9547515E38)
            r3.A09(r0)
            android.content.Context r2 = r4.A0S
            r1 = 2131955492(0x7f130f24, float:1.9547513E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r7}
            java.lang.String r0 = r2.getString(r1, r0)
            r3.A0q(r0)
            r3.A06()
            r3.A0s(r5)
            android.app.Dialog r0 = r3.A02()
            X.AnonymousClass0fN.A00(r0)
            com.instagram.common.session.UserSession r0 = r4.A0b
            X.27r r0 = X.27p.A01(r0)
            r0.A0d()
        L_0x004b:
            return
        L_0x004c:
            boolean r0 = r6.A0o()
            if (r0 == 0) goto L_0x005e
            androidx.fragment.app.FragmentActivity r1 = r4.A0X
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r4.A0f
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            int r0 = r0.A0H
            X.LSX.A01(r1, r0)
            return
        L_0x005e:
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r6.A0K
            X.2Fk r0 = r0.A06
            java.lang.Object r0 = r0.A02()
            X.8fx r0 = (X.C361278fx) r0
            r5 = 0
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r9 = r0.A01
            com.instagram.music.common.model.AudioOverlayTrack r9 = (com.instagram.music.common.model.AudioOverlayTrack) r9
        L_0x006f:
            com.instagram.common.session.UserSession r7 = r4.A0b
            X.27r r0 = X.27p.A01(r7)
            X.29I r8 = r0.A02
            if (r9 == 0) goto L_0x00cb
            java.lang.String r2 = r9.A0A
            java.lang.String r1 = r9.A0B
            com.instagram.music.common.model.MusicAssetModel r0 = r9.A08
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = r0.A0I
        L_0x0083:
            r8.A03(r2, r1, r0)
            X.8ZP r0 = r4.A0q
            X.1QP r8 = r0.A02
            long r0 = r0.A01
            java.lang.String r2 = "REELS_POST_CAPTURE_NEXT_TAPPED"
            r8.flowMarkPoint(r0, r2)
            X.27r r0 = X.27p.A01(r7)
            X.29K r9 = r0.A04
            X.29E r8 = r9.A03
            r2 = 0
            r13 = 838600141(0x31fc05cd, float:7.3348247E-9)
            r14 = 15000(0x3a98, double:7.411E-320)
            r12 = r2
            r10 = r8
            r11 = r2
            long r0 = r10.A04(r11, r12, r13, r14)
            r9.A00 = r0
            java.lang.String r11 = "use_case"
            java.lang.String r12 = "open_clips_share_sheet"
            r9 = r0
            r13 = r3
            r8.A0B(r9, r11, r12, r13)
            com.instagram.pendingmedia.model.ClipInfo r9 = r4.A0G
            X.2Fk r0 = r6.A0C
            java.lang.Object r0 = r0.A02()
            X.8fx r0 = (X.C361278fx) r0
            r8 = 1
            if (r0 == 0) goto L_0x00d1
            int r0 = r0.A00
            if (r0 != r8) goto L_0x00d1
            android.content.Context r1 = r4.A0S
            r0 = 2131955615(0x7f130f9f, float:1.9547762E38)
            X.C59689JTv.A01(r1, r2, r0, r3)
            return
        L_0x00cb:
            r2 = r5
            r1 = r5
        L_0x00cd:
            r0 = r5
            goto L_0x0083
        L_0x00cf:
            r9 = r5
            goto L_0x006f
        L_0x00d1:
            X.88B r1 = r4.A0z
            X.2Fj r0 = r1.A06
            java.lang.Object r10 = r0.A02()
            X.88C r0 = X.AnonymousClass88C.SUCCESS
            if (r10 != r0) goto L_0x01d8
            if (r9 == 0) goto L_0x01d8
            X.83H r0 = r6.A0L
            X.8J0 r11 = r0.A00
            X.831 r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A00(r6)
            int r10 = r0.A00
            java.lang.Integer r0 = r6.A0I(r3)
            android.content.Context r12 = r4.A0S
            boolean r0 = X.C52345GOp.A08(r12, r11, r7, r0, r10)
            if (r0 != 0) goto L_0x004b
            X.2gB r10 = r6.A0F
            java.lang.Object r0 = r10.A02()
            X.831 r0 = (X.AnonymousClass831) r0
            if (r0 == 0) goto L_0x01b4
            X.51O r11 = r0.A04(r3)
            X.51N r11 = (X.AnonymousClass51N) r11
        L_0x0105:
            boolean r0 = r11 instanceof X.AnonymousClass51M
            if (r0 == 0) goto L_0x010c
            r5 = r11
            X.51M r5 = (X.AnonymousClass51M) r5
        L_0x010c:
            boolean r0 = r6.A0r()
            r14 = r0 ^ 1
            boolean r0 = r6.A0s()
            r15 = r0 ^ 1
            boolean r0 = r6.A0s()
            if (r0 != 0) goto L_0x0130
            java.lang.Object r0 = r10.A02()
            X.831 r0 = (X.AnonymousClass831) r0
            if (r0 == 0) goto L_0x0130
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            r16 = 1
            if (r0 == r8) goto L_0x0132
        L_0x0130:
            r16 = 0
        L_0x0132:
            if (r5 == 0) goto L_0x013c
            X.51R r0 = r5.A0F
            int r0 = r0.A08
            r17 = 1
            if (r0 != 0) goto L_0x013e
        L_0x013c:
            r17 = 0
        L_0x013e:
            X.82i r0 = r1.A00
            if (r0 == 0) goto L_0x01b2
            X.8JI r13 = r0.A00
        L_0x0144:
            boolean r0 = X.C52345GOp.A09(r12, r13, r14, r15, r16, r17)
            if (r0 != 0) goto L_0x004b
            X.0Tu r5 = X.0Tu.A05
            r0 = 36609382108764005(0x82100a000a1765, double:3.21525888750727E-306)
            long r0 = X.182.A01(r5, r7, r0)
            int r5 = (int) r0
            if (r5 != 0) goto L_0x015e
            int r0 = r9.A09
            int r5 = X.LTE.A00(r0)
        L_0x015e:
            X.0eK r0 = r4.A17
            java.lang.Object r6 = r0.get()
            X.8Ww r6 = (X.C357188Ww) r6
            if (r6 == 0) goto L_0x004b
            X.A3v r1 = new X.A3v
            r1.<init>(r4)
            X.87i r0 = r6.A03
            X.9X8 r11 = r0.A09
            if (r11 == 0) goto L_0x01d0
            X.A3w r9 = new X.A3w
            r9.<init>(r1)
            X.8LU r10 = r6.A09
            X.4DH r0 = r6.A01
            X.0gy r7 = X.AnonymousClass07i.A00(r0)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r10.A0i
            X.0qQ.A0B(r0, r3)
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r1 = r0.A0K
            int r0 = r1.getWidth()
            float r6 = (float) r0
            int r0 = r1.getHeight()
            float r4 = (float) r0
            r1 = 0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1, r1, r6, r4)
            android.graphics.Bitmap r4 = r10.A0F(r2, r0, r11)
            if (r4 == 0) goto L_0x01c6
            android.app.Activity r2 = r10.A0W
            X.0qQ.A0B(r2, r3)
            X.6ST r1 = new X.6ST
            r1.<init>(r2, r8)
            X.9jq r0 = new X.9jq
            r0.<init>(r4, r9, r1, r5)
            X.1ES.A00(r2, r7, r0)
            return
        L_0x01b2:
            r13 = 0
            goto L_0x0144
        L_0x01b4:
            r11 = r5
            goto L_0x0105
        L_0x01b7:
            android.content.Context r0 = r4.A0S
            X.C64169LRs.A00(r0, r7)
            com.instagram.common.session.UserSession r0 = r4.A0b
            X.27r r0 = X.27p.A01(r0)
            r0.A0e()
            return
        L_0x01c6:
            X.A3v r0 = r9.A00
            X.8cb r0 = r0.A00
            r0.A0I = r2
            A0A(r0)
            return
        L_0x01d0:
            X.8cb r0 = r1.A00
            r0.A0I = r2
            A0A(r0)
            return
        L_0x01d8:
            X.82p r0 = r4.A0h
            X.82o r0 = r0.A02
            X.82Y r3 = r0.A01
            X.7zv r0 = r3.A04()
            if (r0 != 0) goto L_0x01f8
            java.lang.String r1 = "ClipsPostCaptureController"
            java.lang.String r0 = "Attempting to call onNextButtonClicked() with no active captured video."
            X.0kD.A07(r1, r0, r2)
            android.content.Context r3 = r4.A0S
            java.lang.Integer r2 = X.AnonymousClass05K.A1I
            java.lang.String r1 = "Capture session has no active captured media when navigating to share sheet"
            r0 = 2131974093(0x7f1357cd, float:1.958524E38)
            X.C64169LRs.A02(r3, r2, r1, r0)
            return
        L_0x01f8:
            X.1Av r2 = X.1Au.A00(r7)
            X.0s0 r1 = r2.A2o
            X.0YZ[] r9 = X.1Av.A8a
            r6 = 383(0x17f, float:5.37E-43)
            r0 = r9[r6]
            java.lang.Object r0 = r1.CDM(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0288
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r4.A13
            java.lang.Class<X.5MH> r0 = X.AnonymousClass5MH.class
            java.util.HashMap r0 = r1.A0X(r0)
            java.util.Set r0 = r0.keySet()
            java.util.stream.Stream r1 = r0.stream()
            X.Asz r0 = X.C41378Asz.A00
            java.util.stream.Stream r1 = r1.map(r0)
            X.At1 r0 = X.C41380At1.A00
            java.util.stream.Stream r1 = r1.filter(r0)
            X.At2 r0 = X.C41381At2.A00
            boolean r0 = r1.anyMatch(r0)
            if (r0 == 0) goto L_0x0288
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317874088515198(0x8106ea000b167e, double:3.030908041693344E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0288
            androidx.fragment.app.FragmentActivity r1 = r4.A0X
            X.8ab r2 = new X.8ab
            r2.<init>((android.app.Activity) r1)
            r0 = 2131237655(0x7f081b17, float:1.8091567E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.A0j(r0)
            r0 = 2131955541(0x7f130f55, float:1.9547612E38)
            r2.A09(r0)
            r0 = 2131955540(0x7f130f54, float:1.954761E38)
            r2.A08(r0)
            X.AK1 r0 = new X.AK1
            r0.<init>(r4)
            r2.A0E(r0)
            r1 = 2131964884(0x7f1333d4, float:1.9566562E38)
            X.AK2 r0 = new X.AK2
            r0.<init>(r4)
            r2.A0G(r0, r1)
            android.app.Dialog r0 = r2.A02()
            X.AnonymousClass0fN.A00(r0)
            X.1Av r3 = X.1Au.A00(r7)
            X.0s0 r2 = r3.A2o
            r1 = r9[r6]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r2.Epx(r3, r0, r1)
            return
        L_0x0288:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r4.A13
            java.lang.Class<X.JZg> r0 = X.C59812JZg.class
            java.util.ArrayList r0 = r1.A0V(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0298
            r3.A09 = r5
        L_0x0298:
            A0A(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359318cb.A0J():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.7nt} */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.8bo] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K() {
        /*
            r8 = this;
            X.85O r0 = r8.A0j
            X.05G r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d4
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = r8.A0s
            boolean r0 = r3.A0l()
            if (r0 == 0) goto L_0x00db
            com.instagram.common.session.UserSession r4 = r8.A0b
            X.27r r0 = X.27p.A01(r4)
            java.lang.String r6 = "post_capture"
            X.29Z r7 = r0.A0F
            X.0wc r2 = r7.A01
            java.lang.String r1 = "ig_camera_ui_tool_click"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x009a
            X.80P r1 = X.AnonymousClass80P.CLIPS_ADD
            java.lang.String r0 = "tool_type"
            r2.A8M(r1, r0)
            java.lang.String r1 = "IG_CAMERA_ADD_CLIPS"
            java.lang.String r0 = "legacy_falco_event_name"
            r2.AAJ(r0, r1)
            X.283 r5 = r7.A04
            java.lang.String r1 = r5.A0L
            if (r1 != 0) goto L_0x0048
            java.lang.String r1 = ""
        L_0x0048:
            java.lang.String r0 = "camera_session_id"
            r2.AAJ(r0, r1)
            X.4yP r1 = X.C279294yP.CLIPS
            java.lang.String r0 = "camera_destination"
            r2.A8M(r1, r0)
            X.28D r1 = r5.A09
            java.lang.String r0 = "entry_point"
            r2.A8M(r1, r0)
            r0 = 2
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A8k(r1, r0)
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            java.lang.String r0 = "surface"
            r2.A8M(r1, r0)
            X.8fP r1 = r7.A0I()
            java.lang.String r0 = "capture_type"
            r2.A8M(r1, r0)
            java.lang.String r0 = "module"
            r2.AAJ(r0, r6)
            X.28t r1 = X.28t.A06
            java.lang.String r0 = "media_type"
            r2.A8M(r1, r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r1)
            boolean r0 = r5.A0W
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_panavision"
            r2.A7p(r0, r1)
            r2.Cgf()
        L_0x009a:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321765328234188(0x810a74000126cc, double:3.0333688773603977E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00d5
            X.831 r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A00(r3)
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            X.7nt r2 = new X.7nt
            r2.<init>(r1, r0)
        L_0x00bb:
            X.0eK r0 = r8.A16
            java.lang.Object r1 = r0.get()
            X.2Fj r0 = r3.A0I
            r0.A0B(r1)
            X.80U r0 = r8.A0l
            X.80T r0 = (X.AnonymousClass80T) r0
            X.80W r1 = r0.A01
            X.8Sc r0 = new X.8Sc
            r0.<init>(r2)
            r1.A04(r0)
        L_0x00d4:
            return
        L_0x00d5:
            X.9cp r2 = new X.9cp
            r2.<init>()
            goto L_0x00bb
        L_0x00db:
            android.content.Context r1 = r8.A0S
            r0 = 2131955693(0x7f130fed, float:1.954792E38)
            X.C59689JTv.A07(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359318cb.A0K():void");
    }

    public final void A0N(C390839rv r10) {
        Boolean bool = Boolean.FALSE;
        this.A0l.E3H(new C356208Sz(r10, bool, bool, bool, (Integer) null, false, false));
    }

    public final void A0O(String str) {
        AnonymousClass0eM r1 = this.A1N;
        ((AnonymousClass6ST) r1.getValue()).A00(str);
        AnonymousClass0fN.A00((Dialog) r1.getValue());
    }

    public final boolean A0P() {
        ClipsCreationViewModel clipsCreationViewModel = this.A0s;
        if (clipsCreationViewModel.A03 == C2801950r.CLIPS || clipsCreationViewModel.A0t()) {
            return true;
        }
        return false;
    }

    public final void DBP(boolean z) {
        AnonymousClass80U r2 = this.A0l;
        boolean z2 = true;
        if (r2.CQ0(AnonymousClass80V.MUSIC_OVERLAY_IN_STACKED_TIMELINE) || r2.CQ0(AnonymousClass80V.CLIPS_EDITOR) || r2.CQ0(AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE)) {
            z2 = false;
        }
        if ((this.A0d.A08.A00 instanceof AnonymousClass80O) && r2.CZU() && z2) {
            C294975nL.A04((C295005nO) null, new View[]{this.A0U}, false);
        }
        if (z) {
            A09(this);
        }
    }

    public final void DBQ() {
        if ((this.A0d.A08.A00 instanceof AnonymousClass80O) && this.A0l.CZU()) {
            C294975nL.A05(new View[]{this.A0U}, false);
        }
    }

    public final void DNM(float f) {
        if (this.A0G != null) {
            0kD.A07("ClipsPostCaptureController", "drawable is null", (Throwable) null);
        }
    }

    public final void Dfu(float f) {
        if (this.A0G != null) {
            0kD.A07("ClipsPostCaptureController", "drawable is null", (Throwable) null);
        }
    }

    public final void DiR(float f) {
        ClipInfo clipInfo = this.A0G;
        if (clipInfo != null) {
            this.A0y.A06((int) (f * ((float) (clipInfo.A05 - clipInfo.A07))));
        }
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        AnonymousClass80V r8 = (AnonymousClass80V) obj2;
        0qQ.A0B(obj, 0);
        0qQ.A0B(r8, 1);
        if (r8 == AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY) {
            A0F();
        }
        if (r8 != AnonymousClass80V.MEDIA_EDIT) {
            C357318Xk r0 = this.A0B;
            if (r0 != null) {
                r0.A04(false);
            }
        } else if (C367268qT.A00(this.A0Y) && !this.A0M) {
            if (182.A06(0Tu.A05, this.A0b, 36323676588617088L)) {
                A0C(this, (AudioOverlayTrack) null);
            }
        }
        AnonymousClass80V r02 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        if (r8 == r02) {
            AnonymousClass0eM r1 = this.A1C;
            ViewParent parent = ((View) r1.getValue()).getParent();
            IgFrameLayout igFrameLayout = this.A0c;
            if (parent != igFrameLayout) {
                igFrameLayout.addView((View) r1.getValue(), -1, new FrameLayout.LayoutParams(-2, -2, 81));
            }
            A0I();
        } else if (obj == r02) {
            ((View) this.A1C.getValue()).setVisibility(8);
        }
        A07(this);
        View view = this.A01;
        if (A0E(this, r8)) {
            if (182.A06(0Tu.A05, this.A0b, 36318531217791198L) && !this.A0L && view != null) {
                this.A03 = view.requireViewById(R.id.preview_instruction_prompt);
                Handler handler = this.A0T;
                handler.postDelayed(new C40849AkJ(this), 1000);
                handler.postDelayed(new C40850AkK(this), 3000);
                this.A0L = true;
                return;
            }
        }
        A06(this);
    }

    public final void Dsj(boolean z) {
        29R r4 = 27p.A01(this.A0b).A09;
        1Ln A082 = 1Ln.A08(r4.A02);
        if (A082.A00.isSampled()) {
            A082.A0t("IG_CAMERA_CLIPS_TIMELINE_SCROLL");
            A082.A0r("CLIPS_TIMELINE_SCROLL");
            29R.A00(A082, r4);
            AnonymousClass283 r3 = r4.A04;
            int i = 2;
            if (r3.A01 != 2) {
                i = 1;
            }
            A082.A0V(i);
            A082.A0M(r4.A0I(), "capture_type");
            A082.A0b(r3.A09);
            A082.A0T();
            A082.A0c(r3.A0A);
            A082.A0n(27x.A09.getModuleName());
            A082.A0U();
            A082.A0Q("capture_format_index", 0L);
            A082.A0u(AnonymousClass1QI.A00.A02.A00);
            A082.Cgf();
        }
    }

    public final void Dsh(boolean z) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: type inference failed for: r10v4, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r12v2, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r4v21, types: [X.8d3, X.8aQ] */
    /* JADX WARNING: type inference failed for: r7v26, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x039a, code lost:
        if (X.C367268qT.A01(r32, (com.instagram.common.gallery.Medium) r10.get(0), r2) != false) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x03a6, code lost:
        if (r12 != false) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x01fb, code lost:
        if (r13.A04 != null) goto L_0x01fd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x048c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C359318cb(android.view.View r34, X.AnonymousClass2Fj r35, X.28D r36, X.AnonymousClass4DH r37, X.C3503284f r38, X.AnonymousClass0iw r39, com.instagram.common.session.UserSession r40, com.instagram.common.ui.base.IgFrameLayout r41, X.C357638Yz r42, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r43, X.C3499582p r44, X.AnonymousClass80D r45, X.AnonymousClass8WX r46, X.AnonymousClass85O r47, X.C314446iH r48, X.AnonymousClass80U r49, com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r50, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r51, X.AnonymousClass846 r52, X.C234462xu r53, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r54, java.lang.String r55, java.util.List r56, java.util.List r57, X.AnonymousClass0eK r58, X.AnonymousClass0eK r59, X.AnonymousClass0eK r60, X.AnonymousClass0eK r61) {
        /*
            r33 = this;
            r17 = 1
            r2 = r40
            r0 = r17
            X.0qQ.A0B(r2, r0)
            r0 = 2
            r5 = r37
            X.0qQ.A0B(r5, r0)
            r1 = 3
            r29 = r47
            r0 = r29
            X.0qQ.A0B(r0, r1)
            r0 = 4
            r10 = r41
            X.0qQ.A0B(r10, r0)
            r1 = 6
            r25 = r42
            r0 = r25
            X.0qQ.A0B(r0, r1)
            r1 = 7
            r18 = r53
            r0 = r18
            X.0qQ.A0B(r0, r1)
            r0 = 8
            r15 = r43
            X.0qQ.A0B(r15, r0)
            r0 = 9
            r12 = r50
            X.0qQ.A0B(r12, r0)
            r0 = 10
            r14 = r48
            X.0qQ.A0B(r14, r0)
            r16 = 11
            r30 = r44
            r1 = r30
            r0 = r16
            X.0qQ.A0B(r1, r0)
            r0 = 12
            r13 = r49
            X.0qQ.A0B(r13, r0)
            r0 = 13
            r4 = r54
            X.0qQ.A0B(r4, r0)
            r0 = 14
            r11 = r34
            X.0qQ.A0B(r11, r0)
            r0 = 19
            r7 = r52
            X.0qQ.A0B(r7, r0)
            r1 = 20
            r32 = r36
            r0 = r32
            X.0qQ.A0B(r0, r1)
            r0 = 22
            r1 = r55
            X.0qQ.A0B(r1, r0)
            r3 = 23
            r31 = r39
            r0 = r31
            X.0qQ.A0B(r0, r3)
            r3 = 24
            r24 = r51
            r0 = r24
            X.0qQ.A0B(r0, r3)
            r0 = 25
            r8 = r46
            X.0qQ.A0B(r8, r0)
            r6 = 26
            r9 = r38
            X.0qQ.A0B(r9, r6)
            r3 = r33
            r3.<init>()
            r3.A0b = r2
            r3.A0Z = r5
            r0 = r29
            r3.A0j = r0
            r3.A0c = r10
            r0 = r58
            r3.A17 = r0
            r0 = r25
            r3.A0d = r0
            r3.A0f = r15
            r3.A0m = r12
            r3.A1J = r14
            r0 = r30
            r3.A0h = r0
            r3.A0l = r13
            r3.A13 = r4
            r3.A0V = r11
            r12 = r45
            r3.A1I = r12
            r0 = r35
            r3.A1F = r0
            r0 = r57
            r3.A0J = r0
            r3.A0x = r7
            r0 = r32
            r3.A0Y = r0
            r0 = r59
            r3.A18 = r0
            r3.A14 = r1
            r0 = r31
            r3.A0a = r0
            r0 = r24
            r3.A0v = r0
            r3.A0i = r8
            r3.A1H = r9
            r0 = r60
            r3.A16 = r0
            r0 = r61
            r3.A1M = r0
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            r3.A0X = r1
            android.content.Context r15 = r10.getContext()
            X.0qQ.A07(r15)
            r3.A0S = r15
            X.82v r0 = new X.82v
            r0.<init>(r2, r1)
            X.2YN r4 = new X.2YN
            r4.<init>(r0, r1)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel> r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.class
            X.2YL r4 = r4.A00(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r4 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r4
            r3.A0s = r4
            X.85w r0 = new X.85w
            r0.<init>(r2, r1)
            X.2YN r7 = new X.2YN
            r7.<init>(r0, r1)
            java.lang.Class<X.85x> r0 = X.C3507185x.class
            X.2YL r0 = r7.A00(r0)
            X.85x r0 = (X.C3507185x) r0
            r3.A0r = r0
            X.2YN r7 = new X.2YN
            r7.<init>(r1)
            java.lang.Class<X.88B> r0 = X.AnonymousClass88B.class
            X.2YL r9 = r7.A00(r0)
            X.88B r9 = (X.AnonymousClass88B) r9
            r3.A0z = r9
            X.87r r0 = new X.87r
            r0.<init>(r1, r2)
            X.2YN r7 = new X.2YN
            r7.<init>(r0, r1)
            java.lang.Class<X.87s> r0 = X.C3511387s.class
            X.2YL r13 = r7.A00(r0)
            X.87s r13 = (X.C3511387s) r13
            r3.A0u = r13
            X.2YN r7 = new X.2YN
            r7.<init>(r1)
            java.lang.Class<X.8Ib> r0 = X.C353548Ib.class
            X.2YL r8 = r7.A00(r0)
            X.8Ib r8 = (X.C353548Ib) r8
            r3.A0p = r8
            X.8BM r0 = new X.8BM
            r0.<init>(r1, r2)
            X.2YN r7 = new X.2YN
            r7.<init>(r0, r5)
            java.lang.Class<X.8BN> r0 = X.AnonymousClass8BN.class
            X.2YL r0 = r7.A00(r0)
            X.8BN r0 = (X.AnonymousClass8BN) r0
            r3.A0t = r0
            android.app.Application r7 = r1.getApplication()
            X.0qQ.A07(r7)
            X.85R r0 = new X.85R
            r0.<init>(r7, r2)
            X.2YN r7 = new X.2YN
            r7.<init>(r0, r1)
            java.lang.Class<com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel> r0 = com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel.class
            X.2YL r0 = r7.A00(r0)
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r0 = (com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel) r0
            r3.A0g = r0
            X.2YN r7 = new X.2YN
            r7.<init>(r1)
            java.lang.Class<X.860> r0 = X.AnonymousClass860.class
            X.2YL r7 = r7.A00(r0)
            X.860 r7 = (X.AnonymousClass860) r7
            java.lang.String r0 = "post_capture"
            X.861 r0 = r7.A00(r0)
            r3.A0y = r0
            android.app.Application r7 = r1.getApplication()
            X.0qQ.A07(r7)
            X.8cc r0 = new X.8cc
            r0.<init>(r7, r2)
            X.2YN r7 = new X.2YN
            r7.<init>(r0, r5)
            java.lang.Class<X.8cd> r0 = X.C359338cd.class
            X.2YL r0 = r7.A00(r0)
            X.8cd r0 = (X.C359338cd) r0
            r3.A0A = r0
            X.8I9 r0 = new X.8I9
            r0.<init>(r2)
            X.2YN r7 = new X.2YN
            r7.<init>(r0, r1)
            java.lang.Class<X.8IA> r0 = X.AnonymousClass8IA.class
            X.2YL r0 = r7.A00(r0)
            X.8IA r0 = (X.AnonymousClass8IA) r0
            r3.A0o = r0
            X.8cn r0 = X.C359418cn.A00
            r3.A0H = r0
            X.0eO r14 = X.0eO.A02
            r7 = 28
            X.9LJ r0 = new X.9LJ
            r0.<init>(r3, r7)
            X.0eM r0 = X.AnonymousClass0eN.A00(r14, r0)
            r3.A1B = r0
            boolean r0 = r12.A3z
            r3.A1E = r0
            X.50r r7 = r12.A0H()
            X.0qQ.A07(r7)
            r3.A0w = r7
            java.lang.String r0 = r12.A2Y
            r3.A1L = r0
            com.instagram.api.schemas.ACRType r0 = r12.A0G
            r3.A1G = r0
            com.instagram.music.common.config.MusicAttributionConfig r0 = r12.A1N
            r3.A11 = r0
            X.50r r0 = X.C2801950r.FEED_POST
            if (r7 == r0) goto L_0x01fd
            X.4gw r13 = r13.A04
            r0 = 0
            if (r13 == 0) goto L_0x01fe
        L_0x01fd:
            r0 = 1
        L_0x01fe:
            r3.A1D = r0
            X.1Av r0 = X.1Au.A00(r2)
            X.0xa r13 = r0.A01
            java.lang.String r0 = "edit_clips_button_badge_nux"
            r14 = 0
            int r0 = r13.getInt(r0, r14)
            r3.A0R = r0
            X.85u r13 = new X.85u
            r0 = r18
            r13.<init>(r15, r2, r0)
            r3.A0k = r13
            X.8ZP r0 = X.AnonymousClass8ZO.A00(r2)
            r3.A0q = r0
            r0 = 2131430172(0x7f0b0b1c, float:1.8482037E38)
            android.view.View r13 = r10.requireViewById(r0)
            X.0qQ.A07(r13)
            r3.A0U = r13
            r0 = 2131437981(0x7f0b299d, float:1.8497876E38)
            android.view.View r0 = r11.requireViewById(r0)
            X.0qQ.A07(r0)
            r3.A0W = r0
            r0 = 2131429980(0x7f0b0a5c, float:1.8481648E38)
            android.view.View r10 = r13.requireViewById(r0)
            X.0qQ.A07(r10)
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r10 = (com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar) r10
            r3.A0e = r10
            r11 = 29
            X.9LJ r0 = new X.9LJ
            r0.<init>(r3, r11)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A1N = r0
            r0 = 2131238615(0x7f081ed7, float:1.8093514E38)
            r3.A00 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.A15 = r0
            r11 = 30
            X.9LJ r0 = new X.9LJ
            r0.<init>(r3, r11)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A1C = r0
            X.8co r0 = new X.8co
            r0.<init>(r3)
            r3.A12 = r0
            X.8cp r0 = new X.8cp
            r0.<init>(r3)
            r3.A06 = r0
            X.9LJ r0 = new X.9LJ
            r0.<init>(r3, r6)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A19 = r0
            r6 = 27
            X.9LJ r0 = new X.9LJ
            r0.<init>(r3, r6)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A1A = r0
            X.8cq r0 = new X.8cq
            r0.<init>(r1, r5, r2)
            r3.A0n = r0
            X.8cr r0 = new X.8cr
            r0.<init>(r3)
            r3.A1K = r0
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r6)
            r3.A0T = r0
            X.2Fj r0 = new X.2Fj
            r0.<init>()
            r3.A05 = r0
            com.instagram.api.schemas.MusicProduct r6 = r12.A0K
            X.83H r0 = r4.A0L
            X.05G r0 = r0.A05
            r0.Epw(r6)
            r4.A03 = r7
            X.8cs r0 = new X.8cs
            r0.<init>(r3)
            r13.addOnLayoutChangeListener(r0)
            r0 = 2131430216(0x7f0b0b48, float:1.8482127E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r6 = r10.A0D(r0)
            r3.A10 = r6
            X.5pj r0 = X.C296235pj.CREATION_FLOW_BLUE_DARK_BACKGROUND_OVERRIDE
            r6.setButtonStyle(r0)
            r0 = r24
            X.2Fk r10 = r0.A05
            r0 = 47
            X.9Ks r6 = new X.9Ks
            r6.<init>(r3, r0)
            X.8ct r0 = new X.8ct
            r0.<init>(r6)
            r10.A06(r5, r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r0 = r3.A0v
            X.2Fj r11 = r0.A08
            X.4DH r10 = r3.A0Z
            X.8cu r6 = new X.8cu
            r6.<init>(r3)
            X.6q2 r0 = new X.6q2
            r0.<init>(r6)
            r11.A06(r10, r0)
            X.2Fk r10 = r4.A0B
            X.8cv r6 = new X.8cv
            r6.<init>(r3)
            X.6q2 r0 = new X.6q2
            r0.<init>(r6)
            r10.A06(r5, r0)
            X.07U r21 = X.07U.A05
            X.07Z r20 = r5.getViewLifecycleOwner()
            X.0xx r11 = X.AnonymousClass07a.A00(r20)
            r22 = 0
            r23 = 33
            X.9KF r10 = new X.9KF
            r18 = r10
            r19 = r3
            r18.<init>(r19, r20, r21, r22, r23)
            X.19B r0 = X.19B.A00
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            X.1Eo.A03(r6, r0, r10, r11)
            X.07Z r20 = r5.getViewLifecycleOwner()
            X.0xx r11 = X.AnonymousClass07a.A00(r20)
            r23 = 34
            X.9KF r10 = new X.9KF
            r18 = r10
            r18.<init>(r19, r20, r21, r22, r23)
            X.1Eo.A03(r6, r0, r10, r11)
            X.07Z r20 = r5.getViewLifecycleOwner()
            X.0xx r11 = X.AnonymousClass07a.A00(r20)
            r23 = 35
            X.9KF r10 = new X.9KF
            r18 = r10
            r18.<init>(r19, r20, r21, r22, r23)
            X.1Eo.A03(r6, r0, r10, r11)
            X.861 r13 = r3.A0y
            X.2Fj r11 = r13.A0G
            X.4DH r12 = r3.A0Z
            X.8cw r10 = new X.8cw
            r10.<init>(r3)
            r11.A06(r12, r10)
            X.2Fj r11 = r13.A0A
            X.8cx r10 = new X.8cx
            r10.<init>(r3)
            r11.A06(r12, r10)
            X.2Fj r11 = r13.A05
            X.8cy r10 = new X.8cy
            r10.<init>(r3)
            r11.A06(r12, r10)
            X.2Fj r11 = r13.A0C
            X.8cz r10 = new X.8cz
            r10.<init>(r3)
            r11.A06(r12, r10)
            r10 = r56
            if (r56 == 0) goto L_0x039c
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x039c
            int r12 = r10.size()
            r11 = r17
            if (r12 != r11) goto L_0x04c2
            java.lang.Object r12 = r10.get(r14)
            com.instagram.common.gallery.Medium r12 = (com.instagram.common.gallery.Medium) r12
            r11 = r32
            boolean r11 = X.C367268qT.A01(r11, r12, r2)
            if (r11 == 0) goto L_0x04c2
        L_0x039c:
            r13 = 0
        L_0x039d:
            java.util.List r11 = r3.A0J
            if (r11 == 0) goto L_0x03a8
            boolean r12 = r11.isEmpty()
            r11 = 0
            if (r12 == 0) goto L_0x03a9
        L_0x03a8:
            r11 = 1
        L_0x03a9:
            r11 = r11 ^ 1
            if (r13 == 0) goto L_0x048c
            X.8A2 r23 = X.AnonymousClass8A1.A01(r2)
            if (r56 == 0) goto L_0x0488
            int r28 = r10.size()
        L_0x03b7:
            r11 = r25
            X.80m r11 = r11.A08
            java.lang.Object r11 = r11.A00
            X.4yO r11 = (X.C279284yO) r11
            java.lang.String r12 = r11.A02
            X.27r r11 = X.27p.A01(r2)
            X.283 r11 = r11.A04
            java.lang.String r11 = r11.A0L
            r24 = r32
            r25 = r7
            r26 = r12
            r27 = r11
            r23.A04(r24, r25, r26, r27, r28)
            int r12 = r32.ordinal()
            r11 = 357(0x165, float:5.0E-43)
            if (r12 != r11) goto L_0x0484
            X.9mx r11 = X.C387899mx.A00
        L_0x03de:
            r4.A0X(r11)
            r4 = r30
            X.82o r4 = r4.A02
            A05(r4, r3, r7, r10)
        L_0x03e8:
            X.82i r4 = r9.A00
            if (r4 == 0) goto L_0x0481
            X.8JI r7 = r4.A00
        L_0x03ee:
            X.8JI r4 = X.AnonymousClass8JI.REMIX
            if (r7 != r4) goto L_0x0400
            X.88B r4 = r3.A0z
            X.2Fj r9 = r4.A06
            X.4DH r7 = r3.A0Z
            X.APi r4 = new X.APi
            r4.<init>(r3)
            r9.A06(r7, r4)
        L_0x0400:
            X.0Tu r4 = X.0Tu.A06
            r9 = 36319257067527260(0x81082c00041c5c, double:3.031782643189381E-306)
            boolean r4 = X.182.A06(r4, r2, r9)
            if (r4 == 0) goto L_0x0426
            X.07V r4 = r5.getLifecycle()
            X.0xx r7 = X.C71772f0.A00(r4)
            X.MHJ r4 = new X.MHJ
            r9 = r4
            r10 = r5
            r11 = r21
            r12 = r3
            r13 = r22
            r14 = r16
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (X.AnonymousClass4D7) r13, (int) r14)
            X.1Eo.A05(r0, r4, r7)
        L_0x0426:
            X.2Fk r8 = r8.A00
            r4 = 46
            X.9Ks r7 = new X.9Ks
            r7.<init>(r3, r4)
            X.8ct r4 = new X.8ct
            r4.<init>(r7)
            r8.A06(r5, r4)
            r4 = r29
            X.05G r4 = r4.A07
            androidx.lifecycle.CoroutineLiveData r4 = X.C226292g8.A00(r0, r4)
            X.2gB r7 = X.AnonymousClass72Y.A00(r4)
            X.8d0 r4 = new X.8d0
            r4.<init>(r3)
            r7.A06(r5, r4)
            X.1wn r8 = r3.A06
            if (r8 == 0) goto L_0x045a
            com.instagram.common.session.UserSession r4 = r3.A0b
            X.1Ng r7 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Class<X.8d1> r4 = X.AnonymousClass8d1.class
            r7.A01(r8, r4)
        L_0x045a:
            X.07Z r9 = r5.getViewLifecycleOwner()
            X.0xx r5 = X.AnonymousClass07a.A00(r9)
            r12 = 36
            X.9KF r4 = new X.9KF
            r7 = r4
            r8 = r3
            r10 = r21
            r11 = r22
            r7.<init>(r8, r9, r10, r11, r12)
            X.1Eo.A03(r6, r0, r4, r5)
            X.8d2 r5 = new X.8d2
            r5.<init>(r3)
            X.8d3 r4 = new X.8d3
            r0 = r31
            r4.<init>(r1, r0, r2, r5)
            r3.A09 = r4
            return
        L_0x0481:
            r7 = 0
            goto L_0x03ee
        L_0x0484:
            X.9mr r11 = X.C387839mr.A00
            goto L_0x03de
        L_0x0488:
            r28 = 0
            goto L_0x03b7
        L_0x048c:
            if (r11 == 0) goto L_0x03e8
            X.8cd r4 = r3.A0A
            X.2Fk r10 = r4.A04
            X.APh r7 = new X.APh
            r7.<init>(r3)
            X.6q2 r4 = new X.6q2
            r4.<init>(r7)
            r10.A06(r5, r4)
            X.8cd r4 = r3.A0A
            X.2Fk r10 = r4.A03
            X.APf r7 = new X.APf
            r7.<init>(r3)
            X.6q2 r4 = new X.6q2
            r4.<init>(r7)
            r10.A06(r5, r4)
            r4 = r24
            X.2gB r10 = r4.A06
            X.07Z r7 = r5.getViewLifecycleOwner()
            X.APg r4 = new X.APg
            r4.<init>(r3)
            r10.A06(r7, r4)
            goto L_0x03e8
        L_0x04c2:
            r13 = 1
            goto L_0x039d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359318cb.<init>(android.view.View, X.2Fj, X.28D, X.4DH, X.84f, X.0iw, com.instagram.common.session.UserSession, com.instagram.common.ui.base.IgFrameLayout, X.8Yz, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.82p, X.80D, X.8WX, X.85O, X.6iH, X.80U, com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel, X.846, X.2xu, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.lang.String, java.util.List, java.util.List, X.0eK, X.0eK, X.0eK, X.0eK):void");
    }
}
