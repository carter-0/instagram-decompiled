package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputContentInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.avatar.expresso.instagram.ExpressoImpl;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.CancelReason;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.ClipsTemplatesStickerType;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.RingSpec;
import com.instagram.api.schemas.SoundPlatformProduct;
import com.instagram.api.schemas.StickerTraySectionCTAType;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase14Impl;

/* renamed from: X.8ME  reason: invalid class name */
public final class AnonymousClass8ME implements AnonymousClass8MF, AnonymousClass8MG, AnonymousClass88G, AnonymousClass8MH, C252213ok, C3493580b, AnonymousClass8MW, AnonymousClass8MX, AnonymousClass89Y, AnonymousClass8MY, AnonymousClass84H {
    public int A00;
    public int A01;
    public long A02;
    public Drawable A03;
    public View A04;
    public C279284yO A05;
    public C39714A6f A06;
    public AnonymousClass8BE A07;
    public C39885ADh A08;
    public C55924Hpl A09;
    public KWF A0A;
    public C369458un A0B;
    public Integer A0C;
    public Integer A0D;
    public Runnable A0E;
    public Runnable A0F;
    public String A0G;
    public String A0H;
    public HashMap A0I;
    public List A0J;
    public List A0K;
    public Map A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public Integer A0c;
    public boolean A0d;
    public final int A0e;
    public final Context A0f;
    public final SparseArray A0g = new SparseArray();
    public final View A0h;
    public final ViewGroup A0i;
    public final TextView A0j;
    public final 28D A0k;
    public final AnonymousClass4DH A0l;
    public final C3503284f A0m;
    public final C3512087z A0n;
    public final AnonymousClass0iw A0o;
    public final 1wn A0p;
    public final 1wn A0q;
    public final UserSession A0r;
    public final AnonymousClass3E6 A0s;
    public final C357638Yz A0t;
    public final AnonymousClass8N2 A0u;
    public final C354898Nu A0v;
    public final C354928Nx A0w;
    public final C3510387i A0x;
    public final AnonymousClass8BA A0y;
    public final C354538Mk A0z;
    public final TargetViewSizeProvider A10;
    public final ClipsAssetHubViewModel A11;
    public final C3506485o A12;
    public final C3499582p A13;
    public final AnonymousClass88K A14;
    public final C354508Mh A15;
    public final C354648Mv A16;
    public final AnonymousClass8C9 A17;
    public final C3506685r A18;
    public final C314446iH A19;
    public final AnonymousClass88Z A1A;
    public final AnonymousClass80U A1B;
    public final C354468Md A1C;
    public final C354588Mp A1D;
    public final C354608Mr A1E;
    public final C352168Bz A1F;
    public final C3507185x A1G;
    public final ClipsCreationViewModel A1H;
    public final AnonymousClass8BN A1I;
    public final C3511387s A1J;
    public final AnonymousClass869 A1K;
    public final C314676if A1L;
    public final C314676if A1M;
    public final C314676if A1N;
    public final C314676if A1O;
    public final C314676if A1P;
    public final C314676if A1Q;
    public final C314676if A1R;
    public final C314676if A1S;
    public final C314676if A1T;
    public final C314676if A1U;
    public final C314676if A1V;
    public final C314676if A1W;
    public final C314676if A1X;
    public final C314676if A1Y;
    public final C314676if A1Z;
    public final C314676if A1a;
    public final C314676if A1b;
    public final C314676if A1c;
    public final C314676if A1d;
    public final C314676if A1e;
    public final AnonymousClass861 A1f;
    public final C351818An A1g;
    public final C234462xu A1h;
    public final PromptStickerModel A1i;
    public final AvatarStickerPreRenderInteractor A1j;
    public final FittingTextView A1k;
    public final EyedropperColorPickerTool A1l;
    public final InteractiveDrawableContainer A1m;
    public final C3511187q A1n;
    public final String A1o = AnonymousClass9PE.__redex_internal_original_name;
    public final String A1p;
    public final List A1q = new ArrayList();
    public final List A1r;
    public final Map A1s = new HashMap();
    public final AnonymousClass0eK A1t;
    public final AnonymousClass0eM A1u = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LJ(this, 13));
    public final boolean A1v;
    public final boolean A1w;
    public final boolean A1x;
    public final C354518Mi A1y;
    public final AnonymousClass8BL A1z;
    public final C354878Ns A20;
    public final C314676if A21;
    public final C314676if A22;
    public final C314676if A23;
    public final C314676if A24;
    public final C314676if A25;
    public final C314676if A26;
    public final C314676if A27;
    public final C314676if A28;
    public final C314676if A29;
    public final C314676if A2A;
    public final C314676if A2B;
    public final C314676if A2C;
    public final C314676if A2D;
    public final C314676if A2E;
    public final C314676if A2F;
    public final C314676if A2G;
    public final C314676if A2H;
    public final C314676if A2I;
    public final AnonymousClass8N0 A2J;
    public final C354438Ma A2K;
    public final ConstrainedEditText A2L;
    public final Map A2M = new HashMap();
    public final boolean A2N;
    public final boolean A2O;

    private final void A0J(int i, int i2, int i3) {
        List list;
        InteractiveDrawableContainer interactiveDrawableContainer;
        Runnable ak7;
        if (this.A0J != null && (list = this.A0K) != null) {
            AnonymousClass8BH r3 = null;
            float f = 1.0f;
            float f2 = 0.0f;
            int i4 = i;
            int i5 = i3;
            if (i <= i5 || i >= i2) {
                if (i == 0 && this.A00 > 0) {
                    interactiveDrawableContainer = this.A1m;
                    ak7 = new C40837Ak7(this);
                }
                if (i >= i5 && i < i2) {
                    List list2 = this.A0J;
                    list2.getClass();
                    C317876nz r8 = (C317876nz) list2.get(i - i3);
                    C39890ADo aDo = new C39890ADo();
                    aDo.A0F = true;
                    aDo.A0N = true;
                    if (r3 == null) {
                        DisplayMetrics displayMetrics = this.A0f.getResources().getDisplayMetrics();
                        r3 = new AnonymousClass8BG(1.0f, 1.0f + (TypedValue.applyDimension(1, 5.0f, displayMetrics) / ((float) displayMetrics.heightPixels)));
                    }
                    aDo.A06 = r3;
                    aDo.A04 = f;
                    aDo.A03 = f2;
                    aDo.A05 = 4;
                    String str = ((C317966o8) r8.A0O.get(0)).A0M;
                    if (str == null) {
                        str = this.A0f.getString(2131953506);
                        0qQ.A07(str);
                    }
                    aDo.A0D = str;
                    this.A1m.post(new C41235AqX(r8, this, aDo, i4, i5));
                    return;
                }
            }
            Drawable drawable = (Drawable) list.get((i - i3) - 1);
            int i6 = drawable.getBounds().left;
            int i7 = drawable.getBounds().top;
            int i8 = drawable.getBounds().right;
            int i9 = drawable.getBounds().bottom;
            interactiveDrawableContainer = this.A1m;
            r3 = new C16336Ut6(new Rect(i6 + ((int) interactiveDrawableContainer.A0F(drawable)), i7 + ((int) interactiveDrawableContainer.A0G(drawable)), i8 + ((int) interactiveDrawableContainer.A0F(drawable)), i9 + ((int) interactiveDrawableContainer.A0G(drawable))));
            f2 = interactiveDrawableContainer.A0H(drawable);
            Float A0R2 = interactiveDrawableContainer.A0R(drawable);
            if (A0R2 != null) {
                f = A0R2.floatValue();
            }
            ak7 = new C41045AnT(drawable, this);
            interactiveDrawableContainer.post(ak7);
            if (i >= i5) {
            }
        }
    }

    public final int A0y(Drawable drawable, C317876nz r13, C310416b1 r14, String str) {
        ArrayList A012;
        String str2;
        String str3;
        String str4;
        0qQ.A0B(r13, 0);
        if (r13.A04()) {
            A012 = r13.A02();
        } else {
            A012 = r13.A01();
        }
        AnonymousClass57C r2 = AnonymousClass57C.ASSET_PICKER;
        if (r13.A0V) {
            str2 = r13.A0Z;
        } else {
            str2 = null;
        }
        if (r13.A04()) {
            str3 = r13.A0Z;
        } else {
            str3 = null;
        }
        if (r13.A00() == C318046oG.AI_STICKER) {
            str4 = r13.A00().toString();
        } else {
            str4 = null;
        }
        return A0x(drawable, r2, (MusicOverlayStickerModel) null, r14, (Product) null, str2, str3, str4, str, A012);
    }

    public final int A0z(Drawable drawable, C310416b1 r13, String str, List list) {
        0qQ.A0B(list, 0);
        Drawable drawable2 = drawable;
        0qQ.A0B(drawable, 2);
        C310416b1 r4 = r13;
        0qQ.A0B(r13, 3);
        return A0x(drawable2, AnonymousClass57C.ASSET_PICKER, (MusicOverlayStickerModel) null, r4, (Product) null, (String) null, str, (String) null, (String) null, list);
    }

    public final void A1G(Drawable drawable, int i) {
        ArrayList arrayList;
        C391529tE[] r1;
        C391529tE r0;
        0qQ.A0B(drawable, 1);
        if (drawable instanceof AnonymousClass5MH) {
            drawable = ((AnonymousClass5MH) drawable).A0A;
        }
        if (drawable instanceof C347017w8) {
            C347017w8 r4 = (C347017w8) drawable;
            Drawable A042 = r4.A04();
            0qQ.A07(A042);
            if (A042 instanceof C389739q7) {
                C389739q7 r12 = (C389739q7) A042;
                if (r12.A02) {
                    this.A1B.E3H(new AnonymousClass8UF(r12.A00, r12.A02()));
                    return;
                }
            }
            Class<C389639px> cls = C389639px.class;
            if (r4.A0E(cls)) {
                ((C389639px) r4.A06(cls).get(0)).A03.A00();
            }
            if (r4.A04() instanceof C389649py) {
                Drawable A043 = r4.A04();
                0qQ.A0C(A043, "null cannot be cast to non-null type com.instagram.reels.notifyme.view.NotifyMeStickerV2Drawable");
                ((C389649py) A043).A0G.A00();
            }
            C39809AAg.A01(drawable);
            if ((r4.A0E(C369778vJ.class) || r4.A0E(C369838vP.class)) && this.A0J != null) {
                boolean z = this.A0R;
                int size = r4.A08.size();
                if (z) {
                    int i2 = r4.A00;
                    int i3 = size - this.A00;
                    if (i2 < i3 || i2 >= size) {
                        r4.A0D();
                    } else {
                        int i4 = i2 - i3;
                        if (this.A0K != null) {
                            List allDrawables = this.A1m.getAllDrawables();
                            if (!(allDrawables instanceof Collection) || !allDrawables.isEmpty()) {
                                Iterator it = allDrawables.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Object next = it.next();
                                    List list = this.A0K;
                                    0qQ.A0A(list);
                                    if (0qQ.A0K(next, list.get(i4))) {
                                        break;
                                    }
                                }
                                r4.A0D();
                            }
                        }
                        r4.A0B(0);
                    }
                    int i5 = r4.A00;
                    Object obj = this.A0g.get(i);
                    obj.getClass();
                    ((C273914nO) obj).A01(i5);
                    A0J(i5, size, i3);
                    return;
                }
                int i6 = this.A00 + size;
                int i7 = this.A01;
                int i8 = 0;
                if (i7 < i6 - 1) {
                    i8 = i7 + 1;
                }
                this.A01 = i8;
                A0J(i8, i6, size);
            } else if (r4.A0D()) {
                if (r4.A04() instanceof C369768vI) {
                    Drawable A044 = r4.A04();
                    0qQ.A0C(A044, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.StickerItemDrawable");
                    if (((C369768vI) A044).A0M == C318046oG.AVATAR_STATIC) {
                        Drawable A045 = r4.A04();
                        0qQ.A0C(A045, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.StickerItemDrawable");
                        int intValue = ((C369768vI) A045).A07.intValue();
                        if (intValue != 0) {
                            if (intValue == 1) {
                                r1 = new C391529tE[1];
                                r0 = C391529tE.MIRROR;
                            } else if (intValue == 2) {
                                r1 = new C391529tE[1];
                                r0 = C391529tE.BLACK_AND_WHITE;
                            } else if (intValue == 3) {
                                r1 = new C391529tE[1];
                                r0 = C391529tE.MOTION_BLUR;
                            } else {
                                throw new RuntimeException();
                            }
                            r1[0] = r0;
                            arrayList = 0sr.A1L(r1);
                        } else {
                            arrayList = new ArrayList();
                        }
                        27r A012 = 27p.A01(this.A0r);
                        C59725JVj A132 = A13();
                        Drawable A046 = r4.A04();
                        0qQ.A0C(A046, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.StickerItemDrawable");
                        A012.A1J(A132, C391619tN.A04, ((C369768vI) A046).A0L.A0S, arrayList);
                        Drawable A047 = r4.A04();
                        0qQ.A0C(A047, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.StickerItemDrawable");
                        String str = ((C369768vI) A047).A0L.A0S;
                        0qQ.A07(str);
                        this.A0I.put(str, arrayList);
                    }
                }
                if (A0w(this)) {
                    AnonymousClass0eK r02 = this.A1t;
                    r02.getClass();
                    C359318cb r2 = (C359318cb) r02.get();
                    r2.A0s.A0Q.A01(C359548d5.STICKER_CHANGE);
                    C359318cb.A09(r2);
                    0qQ.A0B(AnonymousClass80V.CLIPS_EDITOR, 0);
                }
                if (r4.A04() instanceof C369508us) {
                    UserSession userSession = this.A0r;
                    Context context = this.A0f;
                    r4.A0C(new C387209lq(context, drawable, userSession, context.getString(2131963332)));
                }
            }
        }
    }

    public final void A1H(Drawable drawable, C317876nz r3, C39890ADo aDo) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(aDo, 2);
        A1I(drawable, r3, aDo, (String) null);
    }

    public final void A1K(Drawable drawable, C310416b1 r3, List list) {
        0qQ.A0B(list, 0);
        0qQ.A0B(drawable, 1);
        0qQ.A0B(r3, 2);
        A0z(drawable, r3, (String) null, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        if (r10.A1B.CQ0(X.AnonymousClass80V.COMPOSE_TEXT_IN_STACKED_TIMELINE) != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x028a, code lost:
        if (X.AnonymousClass7TF.A0R(X.0Tu.A05, r10.A0r, 36320962169283563L).booleanValue() != false) goto L_0x028c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1N(java.lang.Integer r11) {
        /*
            r10 = this;
            r5 = 0
            java.lang.Integer r4 = r10.A0D
            if (r4 == r11) goto L_0x0079
            boolean r9 = r10.A0q()
            r10.A0D = r11
            r3 = 1
            r1 = 16
            if (r4 == 0) goto L_0x0028
            int r0 = r4.intValue()
            if (r0 != r1) goto L_0x0028
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r10.A1m
            r0.A0I = r5
            r0.A0H = r5
            r0.A0G = r5
            r0.A0T = r3
            r0.setLongPressEnabled(r5)
            java.util.List r0 = r0.A0E
            r0.clear()
        L_0x0028:
            java.lang.Integer r0 = r10.A0D
            if (r0 == 0) goto L_0x0033
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x009d;
                case 1: goto L_0x022e;
                case 2: goto L_0x0130;
                case 3: goto L_0x016c;
                case 4: goto L_0x0033;
                case 5: goto L_0x014a;
                case 6: goto L_0x014a;
                case 7: goto L_0x014a;
                case 8: goto L_0x014a;
                case 9: goto L_0x014a;
                case 10: goto L_0x0136;
                case 11: goto L_0x014a;
                case 12: goto L_0x0033;
                case 13: goto L_0x0033;
                case 14: goto L_0x0129;
                case 15: goto L_0x014a;
                case 16: goto L_0x029e;
                default: goto L_0x0033;
            }
        L_0x0033:
            boolean r0 = r10.A0q()
            if (r0 == 0) goto L_0x007a
            if (r9 != 0) goto L_0x0058
            X.8BA r0 = r10.A0y
            r0.DV9(r10)
        L_0x0040:
            X.88K r2 = r10.A14
            X.6if r1 = r10.A1e
            java.lang.Object r0 = r1.get()
            X.8LV r0 = (X.AnonymousClass8LV) r0
            r2.A06(r0)
            java.lang.Object r0 = r1.get()
            X.8an r0 = (X.C358368an) r0
            com.instagram.ui.widget.drawing.StrokeWidthTool r0 = r0.A1m
            r0.A07()
        L_0x0058:
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            if (r0 != r4) goto L_0x0061
            X.8BA r0 = r10.A0y
            r0.D48(r10)
        L_0x0061:
            java.lang.Integer r1 = X.AnonymousClass05K.A05
            r0 = 0
            if (r4 != r1) goto L_0x0067
            r0 = 1
        L_0x0067:
            if (r11 == r1) goto L_0x006c
            r3 = 0
            if (r0 == 0) goto L_0x0079
        L_0x006c:
            X.6if r0 = r10.A1e
            java.lang.Object r0 = r0.get()
            X.8an r0 = (X.C358368an) r0
            r0.A0d = r3
            X.C358368an.A0F(r0)
        L_0x0079:
            return
        L_0x007a:
            if (r9 == 0) goto L_0x0092
            X.8BA r0 = r10.A0y
            r0.D48(r10)
            X.88K r2 = r10.A14
            X.6if r0 = r10.A1e
            java.lang.Object r1 = r0.get()
            X.0qQ.A0B(r1, r5)
            java.util.List r0 = r2.A09
            r0.remove(r1)
            goto L_0x0058
        L_0x0092:
            X.80U r1 = r10.A1B
            X.80V r0 = X.AnonymousClass80V.COMPOSE_TEXT_IN_STACKED_TIMELINE
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x0058
            goto L_0x0040
        L_0x009d:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r10.A1m
            X.9RV r0 = X.AnonymousClass9RV.A00
            r2.A0w(r0)
            X.6if r6 = r10.A1e
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = r6.get()
            X.8an r0 = (X.C358368an) r0
            r0.A0Y()
        L_0x00b3:
            X.4yO r1 = r10.A05
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r1 != r0) goto L_0x00cc
            X.6if r1 = r10.A1d
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r0 = r1.get()
            X.Ljc r0 = (X.C64876Ljc) r0
            X.JjN r0 = X.C64876Ljc.A00(r0)
            r0.A08()
        L_0x00cc:
            X.8Bz r0 = r10.A1F
            if (r0 == 0) goto L_0x00d3
            r0.A04()
        L_0x00d3:
            java.lang.Runnable r0 = r10.A0E
            r2.removeCallbacks(r0)
            r1 = 0
            r10.A0E = r1
            java.lang.Runnable r0 = r10.A0F
            r2.removeCallbacks(r0)
            r10.A0F = r1
            X.3E6 r0 = r10.A0s
            r0.EEH(r10)
            r2.A0z(r10)
            r2.A0T = r5
            X.6if r1 = r10.A1L
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x011a
            java.lang.Object r0 = r1.get()
            X.JY9 r0 = (X.JY9) r0
            r0.A0m = r5
            java.lang.Object r0 = r1.get()
            X.JY9 r0 = (X.JY9) r0
            X.JZ7 r2 = r0.A0B
            if (r2 == 0) goto L_0x011a
            java.util.List r0 = r2.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x010a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x011a
            java.lang.Object r0 = r1.next()
            X.LMR r0 = (X.LMR) r0
            r2.A02(r0, r5)
            goto L_0x010a
        L_0x011a:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r6.get()
            X.8an r0 = (X.C358368an) r0
            r0.A0W()
            goto L_0x0033
        L_0x0129:
            X.8BA r0 = r10.A0y
            r0.DV9(r10)
            goto L_0x0033
        L_0x0130:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r10.A1m
            r0.A0S = r5
            goto L_0x0033
        L_0x0136:
            com.instagram.ui.text.ConstrainedEditText r0 = r10.A2L
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A08(r0, r5)
            com.instagram.ui.text.fittingtextview.FittingTextView r0 = r10.A1k
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A08(r0, r5)
            goto L_0x0033
        L_0x014a:
            com.instagram.ui.text.fittingtextview.FittingTextView r2 = r10.A1k
            if (r2 == 0) goto L_0x0159
            X.8BE r1 = r10.A07
            android.content.Context r0 = r10.A0f
            java.lang.String r0 = r1.Ayb(r0)
            r2.setText(r0)
        L_0x0159:
            com.instagram.ui.text.ConstrainedEditText r0 = r10.A2L
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A08(r0, r5)
            android.view.View[] r1 = new android.view.View[]{r2}
            r0 = 0
            X.C294975nL.A04(r0, r1, r3)
            goto L_0x0033
        L_0x016c:
            boolean r0 = r10.A1w
            if (r0 == 0) goto L_0x0175
            X.3E6 r0 = r10.A0s
            r0.A9Y(r10)
        L_0x0175:
            com.instagram.ui.text.fittingtextview.FittingTextView r2 = r10.A1k
            if (r2 == 0) goto L_0x0184
            X.8BE r1 = r10.A07
            android.content.Context r0 = r10.A0f
            java.lang.String r0 = r1.Ayb(r0)
            r2.setText(r0)
        L_0x0184:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r10.A1m
            r0.A0S = r5
            java.lang.Class<X.8uq> r2 = X.C369488uq.class
            X.7w8 r0 = A07(r10, r2)
            if (r0 != 0) goto L_0x0206
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x0192:
            X.6if r8 = r10.A1e
            java.lang.Object r0 = r8.get()
            X.8an r0 = (X.C358368an) r0
            r0.A0f(r1)
            X.7w8 r7 = A07(r10, r2)
            if (r7 == 0) goto L_0x0033
            X.6if r0 = r10.A1Q
            java.lang.Object r0 = r0.get()
            X.8bk r0 = (X.C358958bk) r0
            X.6Ly r1 = r10.A15()
            java.util.Map r0 = r0.A03
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x01bb
            boolean r0 = r10.A0W
            if (r0 == 0) goto L_0x0033
        L_0x01bb:
            com.instagram.common.session.UserSession r6 = r10.A0r
            android.content.Context r2 = r10.A0f
            android.graphics.drawable.Drawable r1 = r7.A04()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.UniversalLocationDrawable"
            X.0qQ.A0C(r1, r0)
            X.8uq r1 = (X.C369488uq) r1
            com.instagram.model.venue.Venue r1 = r1.A01
            r1.getClass()
            java.lang.Object r0 = r8.get()
            X.8an r0 = (X.C358368an) r0
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.7w8 r6 = X.AHM.A01(r2, r6, r1, r0)
            int r0 = r7.A00
            r6.A0B(r0)
            java.lang.Object r2 = r8.get()
            X.8an r2 = (X.C358368an) r2
            r2.A0H = r6
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r2.A1K
            if (r1 == 0) goto L_0x0201
            r1.setVisibility(r5)
            r1.setImageDrawable(r6)
            r1.invalidate()
            X.AOf r0 = new X.AOf
            r0.<init>(r2)
            r1.addOnLayoutChangeListener(r0)
        L_0x0201:
            r7.setVisible(r5, r5)
            goto L_0x0033
        L_0x0206:
            X.6if r0 = r10.A1Q
            java.lang.Object r0 = r0.get()
            X.8bk r0 = (X.C358958bk) r0
            X.6Ly r1 = r10.A15()
            java.util.Map r0 = r0.A03
            java.lang.Object r0 = r0.get(r1)
            X.9IZ r0 = (X.AnonymousClass9IZ) r0
            if (r0 == 0) goto L_0x0228
            java.lang.Object r1 = r0.A03
        L_0x021e:
            X.7w8 r0 = A07(r10, r2)
            if (r1 != r0) goto L_0x022a
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0192
        L_0x0228:
            r1 = 0
            goto L_0x021e
        L_0x022a:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x0192
        L_0x022e:
            X.3E6 r0 = r10.A0s
            r0.A9Y(r10)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r8 = r10.A1m
            r8.A0y(r10)
            r8.A0S = r3
            X.6if r0 = r10.A1e
            java.lang.Object r2 = r0.get()
            X.8an r2 = (X.C358368an) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            r0 = 0
            if (r4 != r1) goto L_0x0248
            r0 = 1
        L_0x0248:
            r2.A0h(r0)
            r10.A0W = r5
            X.80U r1 = r10.A1B
            X.80V r0 = X.AnonymousClass80V.VIDEO_TRIMMING
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x0260
            com.instagram.ui.text.fittingtextview.FittingTextView r0 = r10.A1k
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A08(r0, r5)
        L_0x0260:
            X.8BE r0 = r10.A07
            boolean r0 = r0.CRa()
            r8.A0T = r0
            boolean r0 = r1.CZU()
            r7 = 1
            if (r0 == 0) goto L_0x029c
            java.util.List r0 = r8.getAllDrawables()
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x029c
            com.instagram.common.session.UserSession r6 = r10.A0r
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320962169283563(0x8109b9000023eb, double:3.032860956405961E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r6, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x029c
        L_0x028c:
            r8.setLongPressEnabled(r7)
            java.lang.Class<X.8uq> r0 = X.C369488uq.class
            X.7w8 r0 = A07(r10, r0)
            if (r0 == 0) goto L_0x0033
            r0.setVisible(r3, r5)
            goto L_0x0033
        L_0x029c:
            r7 = 0
            goto L_0x028c
        L_0x029e:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r10.A1m
            r2.A0I = r3
            r2.A0H = r3
            r2.A0G = r3
            r2.A0T = r5
            java.lang.Class<X.8Nk> r0 = X.C354798Nk.class
            java.util.ArrayList r1 = r2.A0V(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0033
            java.lang.Object r0 = r1.get(r5)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r0}
            r2.setStickersWithGesturesEnabled(r0)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.A1N(java.lang.Integer):void");
    }

    public final /* bridge */ /* synthetic */ boolean A76(Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
        if ((AnonymousClass80V.MEDIA_EDIT == obj || AnonymousClass80V.CAPTURE == obj) && this.A0D == AnonymousClass05K.A0Y) {
            return false;
        }
        return true;
    }

    public final void AAQ(Drawable drawable, C310416b1 r6) {
        C347017w8 A072;
        C306386Ly r2;
        if (A0s(drawable)) {
            if (drawable instanceof C306386Ly) {
                r2 = (C306386Ly) drawable;
            } else {
                r2 = null;
            }
            if (this.A13.A02.A01() == C365758nd.A04) {
                this.A1K.A01(r2);
            }
        }
        A00(drawable, this, r6);
        if (this.A0W && (A072 = A07(this, C369488uq.class)) != null) {
            C314676if r1 = this.A1Q;
            ((C358958bk) r1.get()).A03(drawable, A072);
            C358958bk r22 = (C358958bk) r1.get();
            ((C358368an) this.A1e.get()).A1Z.get();
            C358958bk.A02(drawable, r22, new C66312MMv(38, drawable, r22));
        }
        this.A0W = false;
    }

    public final void AR7(Drawable drawable, Object obj) {
        0qQ.A0B(obj, 0);
        this.A1B.E3H(obj);
        AnonymousClass0eK r0 = this.A1t;
        r0.getClass();
        r0.get();
    }

    public final void CIk(AnonymousClass05V r6) {
        0qQ.A0B(r6, 0);
        ((C358368an) this.A1e.get()).A0U();
        InputContentInfo inputContentInfo = r6.A00.A00;
        if ("image/gif".equals(inputContentInfo.getDescription().getMimeType(0))) {
            String obj = inputContentInfo.getContentUri().toString();
            0qQ.A07(obj);
            C40834Ak4 ak4 = new C40834Ak4(r6);
            String A0R2 = 002.A0R("keyboard_content_gif__", obj);
            C331897Sw r0 = C331897Sw.A0A;
            C331917Sy.A00(this.A0f).A05(new C65344Lrk(this, ak4, A0R2, obj), obj);
            return;
        }
        Uri contentUri = inputContentInfo.getContentUri();
        0qQ.A07(contentUri);
        0nY.A00().ATE(new C386849lG(contentUri, r6, this));
    }

    public final void CgT(Medium medium, long j, long j2, boolean z) {
        0qQ.A0B(medium, 0);
        ((JY9) this.A1L.get()).A0K(new KK0(medium, j, j2, z), (Integer) null);
    }

    public final void CnL(View view, StickerTraySectionCTAType stickerTraySectionCTAType) {
        0qQ.A0B(stickerTraySectionCTAType, 1);
        if (stickerTraySectionCTAType == StickerTraySectionCTAType.EDIT) {
            JY9 jy9 = (JY9) this.A1L.get();
            UserSession userSession = jy9.A18;
            if (182.A06(0Tu.A05, userSession, 36319003664194351L)) {
                0xa r1 = 26G.A00(userSession).A00;
                String A002 = AnonymousClass000.A00(3482);
                if (!r1.getBoolean(A002, false)) {
                    view.postDelayed(new M6S(view, jy9), 500);
                    0xY AR4 = 26G.A00(userSession).A00.AR4();
                    AR4.E5T(A002, true);
                    AR4.apply();
                }
            }
        }
    }

    public final void Csq(View view, C317966o8 r16, String str) {
        C317966o8 r0 = r16;
        0qQ.A0B(r0, 0);
        UserSession userSession = this.A0r;
        AnonymousClass0iw r2 = this.A0o;
        String str2 = r0.A0S;
        0qQ.A07(str2);
        new C70986OVa(view, r2, userSession, (C70438O6p) null, AnonymousClass05K.A01, str2, (String) null, str, (String) null, 0, false, false, false).A01();
    }

    public final void CtK(Drawable drawable) {
        C359008bp r2;
        0qQ.A0B(drawable, 0);
        if ((drawable instanceof C354798Nk) && ((C354798Nk) drawable).A0B.A0M()) {
            this.A0B = this.A1m.A0O(drawable);
        }
        if ((drawable instanceof C359008bp) && (r2 = (C359008bp) drawable) != null) {
            r2.A0B();
        }
    }

    public final /* synthetic */ void CtX() {
    }

    public final /* synthetic */ void CtY() {
    }

    public final void Ctb(C384659hg r14) {
        String str;
        String str2;
        boolean z;
        if (ABT.A01(this.A1m)) {
            C59689JTv.A07(this.A0f, 2131968822);
            return;
        }
        UserSession userSession = this.A0r;
        0wc A012 = AnonymousClass0kN.A01(this.A0o, userSession);
        0Aj A002 = A012.A00(A012.A00, "ig_cg_create_standalone_fundraiser_sticker_begin");
        A002.AAJ("source_name", "STICKER_TRAY");
        A002.Cgf();
        User A013 = AnonymousClass0t1.A01.A01(userSession);
        AE3 ae3 = new AE3(A013.getUsername(), A013.Bh3().getUrl(), A013.isVerified());
        User user = r14.A01;
        if (user != null) {
            str = user.getUsername();
            str2 = user.Bh3().getUrl();
            z = user.isVerified();
        } else {
            str = r14.A03;
            if (str == null) {
                str = "";
            }
            str2 = r14.A04;
            z = false;
        }
        AE3 ae32 = new AE3(str, str2, z);
        String str3 = r14.A07;
        String str4 = r14.A06;
        1Xj r0 = r14.A00;
        r0.getClass();
        ImageUrl A1Q2 = r0.A1Q();
        A1Q2.getClass();
        C3499082j r2 = new C3499082j((NewFundraiserInfo) null, ae32, ae3, A1Q2.getUrl(), "STICKER_TRAY", r14.A08, str4, "", str3, 0);
        A0Y(this, r2);
        this.A1B.E3H(new C39647A3n(r2));
    }

    public final /* synthetic */ void CuV(Drawable drawable, int i) {
    }

    public final void Cw1(View view, C317466nJ r11) {
        String str;
        0qQ.A0B(r11, 0);
        C317876nz BzU = r11.BzU();
        if (BzU == null) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Failed to long press a sticker as StaticSticker of AssetItem is null. Type is %s. Image Url is %s", r11.CAW(), r11.CCI());
            0qQ.A07(formatStrLocaleSafe);
            0kD.A0I(formatStrLocaleSafe, (Throwable) null, 0Yt.A0E());
            return;
        }
        int ordinal = BzU.A00().ordinal();
        if (ordinal == 19 || ordinal == 18) {
            Context context = this.A0f;
            UserSession userSession = this.A0r;
            KA8 ka8 = new KA8(r11, BzU, this);
            0qQ.A0B(context, 0);
            String str2 = BzU.A0Z;
            C46498Dg1 dg1 = new C46498Dg1(context, userSession);
            String str3 = userSession.A06;
            C317966o8 r0 = (C317966o8) 00k.A0O(BzU.A0O, 0);
            if (r0 != null) {
                str = r0.A0V;
            } else {
                str = null;
            }
            if (0qQ.A0K(str3, str)) {
                dg1.A0D(context.getString(2131957337), context.getString(2131957336));
            }
            String string = context.getString(2131957531);
            0qQ.A07(string);
            dg1.A0A(string, new C71331Oic(ka8, userSession, str2));
            String string2 = context.getString(2131954722);
            0qQ.A07(string2);
            dg1.A0C(string2, new ANG(userSession, str2));
            new C49945FFy(dg1).A05(context);
        }
    }

    public final void Cw2(Drawable drawable, View view, C317466nJ r6) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(view, 1);
        int ordinal = r6.CAW().ordinal();
        if (ordinal == 1) {
            C317486nL B0p = r6.B0p();
            B0p.getClass();
            drawable.getClass();
            DBs(drawable, view, B0p);
        } else if (ordinal == 0) {
            C317876nz BzU = r6.BzU();
            BzU.getClass();
            Dn1(drawable, BzU, (Long) null);
        } else {
            throw new UnsupportedOperationException("Unknown AssetItem type");
        }
    }

    public final void CxD() {
        C64435Lbq lbq;
        this.A0M = true;
        this.A0N = false;
        JY9 jy9 = (JY9) this.A1L.get();
        C64969Ll8 ll8 = jy9.A0D;
        if (!(ll8 == null || (lbq = jy9.A0A) == null)) {
            lbq.A02(ll8, true);
        }
        jy9.A16.A04();
        A0n(false);
    }

    public final void CxF() {
        this.A0N = true;
        this.A0M = false;
        A0n(true);
        onBackPressed();
    }

    public final void CxR() {
        this.A0M = true;
        this.A0N = false;
        A0n(false);
    }

    public final void D6Q(C19476WaO waO) {
        Dn8(waO, (String) null);
    }

    public final void D6e() {
        A0k(C389629pw.class);
        this.A1B.E3H(new AnonymousClass8TO((C19476WaO) null));
    }

    public final void D7a(Medium medium, Integer num) {
        Integer num2;
        0qQ.A0B(medium, 0);
        if (medium.A05()) {
            ((JY9) this.A1L.get()).A0K(new C61734KJz(medium), num);
        } else if (!medium.CeS()) {
        } else {
            if (A0p() || (!A05().isEmpty())) {
                LSX.A00(this.A0l.requireActivity(), ((NineSixteenLayoutConfigImpl) this.A10).A0G);
                return;
            }
            JY9 jy9 = (JY9) this.A1L.get();
            C64962Ll1 ll1 = jy9.A0E;
            if (ll1 != null) {
                ll1.A00 = medium;
                Object obj = jy9.A19.A08.A00;
                ll1.A01 = (C279284yO) obj;
                if (obj instanceof AnonymousClass80O) {
                    num2 = AnonymousClass05K.A0j;
                } else {
                    num2 = AnonymousClass05K.A0u;
                }
                0qQ.A0B(num2, 0);
                ll1.A03 = num2;
                C64435Lbq lbq = jy9.A0A;
                if (lbq != null) {
                    lbq.A02(ll1, true);
                }
                jy9.A16.A04();
            }
        }
    }

    public final void D7b(Bitmap bitmap, String str) {
        float f;
        0qQ.A0B(bitmap, 0);
        if (str != null) {
            C59689JTv.A07(this.A0f, 2131957329);
        }
        ((JY9) this.A1L.get()).A0O(true);
        StringBuilder sb = new StringBuilder();
        sb.append("cutout_photo_");
        Object obj = str;
        if (str == null) {
            obj = UUID.randomUUID();
        }
        sb.append(obj);
        String obj2 = sb.toString();
        C317876nz r0 = C317876nz.A0a;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        if (width / height > 1.9f) {
            f = (width * 0.15789475f) / height;
        } else {
            f = 0.3f;
        }
        C317876nz A032 = C317886o0.A03(bitmap, C318046oG.CUTOUT_PHOTO, obj2, f);
        Dn1(C347017w8.A01(this.A0f, this.A0r, A032), A032, (Long) null);
    }

    public final /* synthetic */ void D7e() {
    }

    public final void D7f(C381579bz r22) {
        C381579bz r2 = r22;
        0qQ.A0B(r2, 0);
        String str = r2.A06;
        if (str == null) {
            this.A1B.E3H(new Object());
            LPO.A02(this.A0l.requireContext());
            return;
        }
        String A0R2 = 002.A0R(AnonymousClass000.A00(1260), str);
        LSX.A01(this.A0l.requireActivity(), ((NineSixteenLayoutConfigImpl) this.A10).A0H);
        Bitmap bitmap = r2.A05;
        float f = (float) r2.A01;
        float f2 = (float) r2.A00;
        C317966o8 r9 = new C317966o8();
        r9.A0S = A0R2;
        r9.A0U = "cut_out_video_sticker_webp";
        if (bitmap != null) {
            r9.A0o.add(bitmap);
        }
        r9.A01 = f;
        r9.A00 = f2;
        r9.A02 = 1.0f;
        r9.A09 = 30;
        C317876nz r0 = C317876nz.A0a;
        List singletonList = Collections.singletonList(r9);
        0qQ.A07(singletonList);
        C317876nz r11 = new C317876nz(C318046oG.CUTOUT_VIDEO, A0R2, singletonList);
        boolean z = r2.A08;
        if (z) {
            r11.A0G = Long.valueOf(r2.A02 - r2.A03);
        }
        Context context = this.A0f;
        UserSession userSession = this.A0r;
        C347017w8 A002 = C347017w8.A00(context, (Resources.Theme) null, (AnonymousClass9V0) null, userSession, r11, C353578Ie.A00(userSession));
        Drawable A042 = A002.A04();
        0qQ.A0C(A042, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.CutoutVideoDrawable");
        AnonymousClass8BA.A0G(this.A0y, false, false);
        C354898Nu r15 = this.A0v;
        r15.A00();
        long max = Math.max((long) ((((double) (r2.A02 - r2.A03)) * 5.0d) - 5000.0d), 2000);
        r15.A00 = new AnonymousClass9XZ(r15, max, (max / 102) * 2);
        r15.A03.Epw(true);
        CountDownTimer countDownTimer = r15.A00;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
        AnonymousClass8N2 r1 = this.A0u;
        if (r1 != null) {
            Bitmap bitmap2 = r2.A04;
            0sn r23 = r2.A07;
            if (r23 == null) {
                r23 = 0sn.A00;
            }
            C11020S5r s5r = new C11020S5r(bitmap2, r23, z);
            C58790Ixb ixb = new C58790Ixb(7, r9, A002, r11, A042, this);
            C318136oS A003 = C318116oQ.A00(r1);
            r1.A03 = 1Eo.A02(19B.A00, new C59674JTf(ixb, s5r, r1, (AnonymousClass4D7) null, 6, true), A003);
        }
        Dn1(A002, r11, (Long) null);
    }

    public final void DAq(Drawable drawable, int i) {
    }

    public final void DAs(Drawable drawable) {
        View view;
        0qQ.A0B(drawable, 0);
        if (this.A1B.CQ0(AnonymousClass80V.CLIPS_EDITOR) && drawable == this.A1I.A00() && AnonymousClass8IK.A05(this.A0r) && (view = this.A04) != null) {
            this.A0i.removeView(view);
        }
    }

    public final void DBs(Drawable drawable, View view, C317486nL r38) {
        C317486nL r2 = r38;
        0qQ.A0B(r2, 0);
        Drawable drawable2 = drawable;
        0qQ.A0B(drawable2, 2);
        this.A1B.E3H(new Object());
        int A002 = A00(drawable2, this, new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) "StickerOverlayController", (String) null, (List) null, -1.0f, 30.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, true, true, true, true, true, true, false, false));
        SparseArray sparseArray = this.A0g;
        C273914nO r7 = new C273914nO();
        StringBuilder sb = new StringBuilder();
        String str = r2.A02;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            sb.append("\\u");
            sb.append(Integer.toHexString(str.charAt(i)));
        }
        ArrayList arrayList = new ArrayList();
        String obj = sb.toString();
        0qQ.A07(obj);
        arrayList.add(obj);
        r7.A06 = arrayList;
        r7.A01 = C273924nP.EMOJIS;
        sparseArray.put(A002, r7);
        this.A1y.A05(r2);
    }

    public final void DHX(Medium medium, boolean z) {
        Object r1;
        IgSimpleImageView igSimpleImageView;
        Medium medium2 = medium;
        0qQ.A0B(medium2, 0);
        AnonymousClass80U r5 = this.A1B;
        Object obj = ((AnonymousClass80T) r5).A01.A00.second;
        0qQ.A07(obj);
        if (obj instanceof C356488Ub) {
            AZU azu = (AZU) this.A1M.get();
            if (azu.A0D) {
                azu.A04 = medium2;
                igSimpleImageView = azu.A09;
            } else {
                azu.A03 = medium2;
                igSimpleImageView = azu.A08;
            }
            if (igSimpleImageView != null) {
                igSimpleImageView.setImageURI(medium2.A02());
                ViewTreeObserver viewTreeObserver = igSimpleImageView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(new WCA(igSimpleImageView, azu));
                }
            }
            r1 = new Object();
        } else if (obj instanceof C356568Uj) {
            r1 = new C356578Uk(medium2, ((C356568Uj) obj).A00);
        } else if (!z || !medium2.CeS()) {
            UserSession userSession = this.A0r;
            boolean A062 = 182.A06(0Tu.A05, userSession, 36325519129785352L);
            C317876nz r2 = C317876nz.A0a;
            C317876nz A002 = C317886o0.A00();
            if (A062) {
                Context context = this.A0f;
                InteractiveDrawableContainer interactiveDrawableContainer = this.A1m;
                Context context2 = context;
                Medium medium3 = medium2;
                A1K(new C369908vW(context2, (Bitmap) null, medium3, (ImageUrl) null, C354668Mx.RECTANGLE, (Integer) null, C39898AIf.A01(context, Integer.valueOf(interactiveDrawableContainer.getWidth())), C39898AIf.A00(context, Integer.valueOf(interactiveDrawableContainer.getHeight())), true, false, false, false), new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) "StickerOverlayController", (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, true, true, true, true, true, true, false, false), A002.A01());
                return;
            }
            Context context3 = this.A0f;
            InteractiveDrawableContainer interactiveDrawableContainer2 = this.A1m;
            C347017w8 A032 = C39898AIf.A03(context3, medium2, userSession, Integer.valueOf(interactiveDrawableContainer2.getWidth()), Integer.valueOf(interactiveDrawableContainer2.getHeight()), false);
            A1K(A032, new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) "StickerOverlayController", (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, true, true, true, true, true, true, false, false), A002.A01());
            A032.A9D(new C40280AYv(A032, this));
            return;
        } else if (A0p() || (!A05().isEmpty())) {
            LSX.A00(this.A0l.requireActivity(), ((NineSixteenLayoutConfigImpl) this.A10).A0G);
            return;
        } else {
            JY9 jy9 = (JY9) this.A1L.get();
            C64961Ll0 ll0 = jy9.A0K;
            if (ll0 != null) {
                ll0.A00 = medium2;
                Object obj2 = jy9.A19.A08.A00;
                ll0.A01 = (C279284yO) obj2;
                ll0.A03 = !(obj2 instanceof AnonymousClass80O);
                C64435Lbq lbq = jy9.A0A;
                if (lbq != null) {
                    lbq.A02(ll0, true);
                }
                jy9.A16.A04();
                return;
            }
            return;
        }
        r5.E3H(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        if ((r7 instanceof X.C359008bp) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r6.A2N == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DP7(android.graphics.drawable.Drawable r7, int r8, float r9, float r10) {
        /*
            r6 = this;
            r2 = 1
            X.0qQ.A0B(r7, r2)
            boolean r0 = r7 instanceof X.C347017w8
            r1 = 0
            if (r0 == 0) goto L_0x0012
            r0 = r7
            X.7w8 r0 = (X.C347017w8) r0
            if (r0 == 0) goto L_0x0012
            android.graphics.drawable.Drawable r1 = r0.A04()
        L_0x0012:
            boolean r0 = r1 instanceof X.C300655xZ
            if (r0 == 0) goto L_0x001b
            boolean r0 = r6.A2N
            r5 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r6.A1m
            java.util.List r0 = r3.getAllDrawables()
            java.util.Iterator r4 = r0.iterator()
        L_0x0026:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r4.next()
            boolean r0 = r1 instanceof X.C354808Nl
            if (r0 == 0) goto L_0x0026
        L_0x0035:
            boolean r0 = r1 instanceof X.C354808Nl
            if (r0 == 0) goto L_0x0072
            X.8Nl r1 = (X.C354808Nl) r1
            if (r1 == 0) goto L_0x0072
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r1.BTZ()
            boolean r0 = r1.A0M()
            if (r0 == 0) goto L_0x0072
            boolean r0 = r1.A0L()
            if (r0 == 0) goto L_0x0072
            boolean r0 = r7 instanceof X.C359008bp
            if (r0 == 0) goto L_0x0072
        L_0x0051:
            if (r5 == 0) goto L_0x0071
            X.7w8 r7 = (X.C347017w8) r7
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            r6.A1N(r0)
            r7.A08()
            android.util.SparseArray r0 = r6.A0g
            java.lang.Object r1 = r0.get(r8)
            r1.getClass()
            X.4nO r1 = (X.C273914nO) r1
            int r0 = r7.A00
            r1.A01(r0)
            X.8Mh r0 = r6.A15
            r0.A00 = r7
        L_0x0071:
            return
        L_0x0072:
            X.80U r4 = r6.A1B
            boolean r0 = r4.CZU()
            if (r0 == 0) goto L_0x0051
            java.util.List r0 = r3.getAllDrawables()
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x0051
            com.instagram.common.session.UserSession r3 = r6.A0r
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320962169283563(0x8109b9000023eb, double:3.032860956405961E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0051
            X.8VI r0 = new X.8VI
            r0.<init>(r8, r10, r5)
            r4.E3H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.DP7(android.graphics.drawable.Drawable, int, float, float):void");
    }

    public final /* synthetic */ void DPH() {
    }

    public final void DR4(Medium medium) {
    }

    public final void DWc(Bitmap bitmap, String str) {
        float f;
        0qQ.A0B(bitmap, 0);
        0qQ.A0B(str, 1);
        C317876nz r0 = C317876nz.A0a;
        String A0R2 = 002.A0R("cutout_photo_upload_id_", str);
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        if (width / height > 1.9f) {
            f = (width * 0.15789475f) / height;
        } else {
            f = 0.3f;
        }
        C317876nz A032 = C317886o0.A03(bitmap, C318046oG.CUTOUT_PHOTO, A0R2, f);
        Dn1(C347017w8.A01(this.A0f, this.A0r, A032), A032, (Long) null);
    }

    public final void DdI(Drawable drawable, int i, boolean z) {
        0qQ.A0B(drawable, 1);
        A0P(drawable, this, i, z, false);
    }

    public final void DdW(Drawable drawable) {
        EDV(drawable, false);
    }

    public final void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
        0qQ.A0B(drawable, 0);
        AnonymousClass8BA r4 = this.A0y;
        C357068Wi r3 = (C357068Wi) r4.A1v.get();
        if (r3 != null) {
            if (r3.A07.A08.A00 instanceof AnonymousClass80O) {
                AnonymousClass8LU r2 = r3.A0B;
                if (r2.A09 == AnonymousClass8YU.PLAYING) {
                    r3.A01 = true;
                }
                r3.A0N.A00().EyM();
                r3.A0O.A00().EyM();
                C378369Pn r0 = r2.A0B;
                if (r0 != null) {
                    r0.A09(false);
                }
            }
            C3502083s r02 = r3.A0I;
            if (r02 != null) {
                r02.CLd();
            }
        }
        r4.A1M.E3H(new Object());
        C39809AAg.A01(drawable);
        AnonymousClass80U r32 = this.A1B;
        AnonymousClass80V r22 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        if (r32.CQ0(r22)) {
            AnonymousClass0eK r03 = this.A1t;
            r03.getClass();
            ((View) ((C359318cb) r03.get()).A1C.getValue()).setVisibility(8);
        }
        A1N(AnonymousClass05K.A05);
        if (this.A1I.A00() == drawable && !r32.CQ0(r22) && AnonymousClass8IK.A05(this.A0r)) {
            A0M(drawable, this);
        }
    }

    public final void Dn1(Drawable drawable, C317876nz r12, Long l) {
        String str;
        C347017w8 r0;
        C317876nz r8 = r12;
        Drawable drawable2 = null;
        if ((drawable instanceof C347017w8) && (r0 = (C347017w8) drawable) != null) {
            drawable2 = (Drawable) 00k.A0A(r0.A05());
        }
        if ((drawable2 instanceof AnonymousClass8N6) && !00p.A0k(r12.A0Z, AnonymousClass000.A00(1260), false)) {
            FragmentActivity requireActivity = this.A0l.requireActivity();
            UserSession userSession = this.A0r;
            ClipsDraftRepository A002 = AnonymousClass72U.A00(requireActivity, userSession);
            C321016tR r4 = (C321016tR) drawable2;
            String str2 = r4.A0D;
            if (str2 != null || (str2 = r4.A0F) != null) {
                if (A1X()) {
                    String A0R2 = 002.A0R(r4.A0k, "_webp");
                    File file = new File(str2);
                    0qQ.A0B(A0R2, 0);
                    C293505kq A092 = A002.A09();
                    if (!(A092 == null || (str = A092.A0T) == null)) {
                        File file2 = new File(new File(A002.A07.A01(), str), A0R2);
                        if (!file2.exists()) {
                            try {
                                AnonymousClass5Kg.A08(file, file2, false);
                            } catch (IOException unused) {
                            }
                        }
                        file = file2;
                    }
                    StringWriter stringWriter = new StringWriter();
                    17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
                    C369248u6.A00(A0A2, r12);
                    A0A2.close();
                    r8 = C369248u6.parseFromJson(16P.A00(stringWriter.toString()));
                    C317966o8 r2 = (C317966o8) 00k.A0J(r8.A0O);
                    if (r2 != null) {
                        r2.A0H = new SimpleImageUrl(Uri.fromFile(file).toString());
                    }
                }
                drawable = C347017w8.A00(this.A0f, (Resources.Theme) null, (AnonymousClass9V0) null, userSession, r8, (C321086tY) null);
            } else {
                return;
            }
        }
        Dn2(drawable, r8, l, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        if (r10 != true) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a1, code lost:
        r15 = r9.A04;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0351  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dn2(android.graphics.drawable.Drawable r20, X.C317876nz r21, java.lang.Long r22, boolean r23) {
        /*
            r19 = this;
            r5 = 0
            r6 = r21
            X.0qQ.A0B(r6, r5)
            X.6oG r1 = r6.A00()
            X.6oG r0 = X.C318046oG.CUTOUT_VIDEO
            r7 = r19
            if (r1 != r0) goto L_0x002c
            com.google.common.collect.ImmutableList r0 = r7.A05()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002c
            X.4DH r0 = r7.A0l
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r7.A10
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            int r0 = r0.A0G
            X.LSX.A00(r1, r0)
        L_0x002b:
            return
        L_0x002c:
            com.instagram.common.session.UserSession r4 = r7.A0r
            X.27r r9 = X.27p.A01(r4)
            boolean r0 = r6.A04()
            if (r0 == 0) goto L_0x0457
            java.util.ArrayList r0 = r6.A02()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0457
            java.util.ArrayList r0 = r6.A02()
            java.lang.Object r11 = r0.get(r5)
            java.lang.String r11 = (java.lang.String) r11
        L_0x004e:
            r3 = 0
            java.lang.String r2 = r6.A0Z
            X.6oG r0 = r6.A00()
            java.lang.String r0 = r0.toString()
            X.9tN r17 = X.AED.A01(r2, r0)
            X.82p r0 = r7.A13
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.50r r0 = r0.A0g
            if (r0 == 0) goto L_0x0454
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 != r0) goto L_0x0454
            X.4yP r1 = X.C279294yP.FEED
        L_0x0070:
            X.8C9 r0 = r7.A17
            r8 = 1
            if (r0 == 0) goto L_0x007c
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r0.A03
            boolean r10 = r0.A0G
            r0 = 1
            if (r10 == r8) goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r0)
            r0 = r23
            java.lang.String r10 = X.AED.A02(r6, r0)
            int r12 = X.AED.A00(r6)
            X.0wc r14 = r9.A01
            r0 = 3290(0xcda, float:4.61E-42)
            java.lang.String r13 = X.AnonymousClass000.A00(r0)
            X.0kJ r0 = r14.A00
            X.0Aj r13 = r14.A00(r0, r13)
            boolean r0 = r13.isSampled()
            r18 = r22
            if (r0 == 0) goto L_0x0153
            X.283 r15 = r9.A04
            java.lang.String r14 = r15.A0L
            if (r14 == 0) goto L_0x0153
            if (r1 != 0) goto L_0x00ad
            X.4yP r1 = r9.A0J()
        L_0x00ad:
            java.lang.String r0 = "camera_session_id"
            r13.AAJ(r0, r14)
            java.lang.String r0 = "camera_destination"
            r13.A8M(r1, r0)
            X.28D r14 = r15.A09
            java.lang.String r0 = "entry_point"
            r13.A8M(r14, r0)
            r0 = 2
            java.lang.String r14 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.A8k(r14, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r14 = r0.getModuleName()
            java.lang.String r0 = "module"
            r13.AAJ(r0, r14)
            java.lang.String r0 = "sticker_id"
            r13.AAJ(r0, r11)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r0) goto L_0x0450
            r0 = r12
        L_0x00dd:
            java.lang.String r14 = "sticker_source"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.A8k(r14, r0)
            java.lang.String r14 = r15.A0U
            java.lang.String r0 = "sticker_tray_session_id"
            r13.AAJ(r0, r14)
            java.lang.String r14 = r15.A0M
            java.lang.String r0 = "composition_str_id"
            r13.AAJ(r0, r14)
            X.28t r14 = r15.A0A
            java.lang.String r0 = "composition_media_type"
            r13.A8M(r14, r0)
            X.JVj r14 = r15.A0C
            java.lang.String r0 = "surface"
            r13.A8M(r14, r0)
            java.lang.String r14 = "sticker_type"
            r0 = r17
            r13.A8M(r0, r14)
            int r14 = r15.A01
            r0 = 2
            if (r14 == r0) goto L_0x010f
            r0 = 1
        L_0x010f:
            java.lang.String r14 = "camera_position"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.A8k(r14, r0)
            com.instagram.common.session.UserSession r14 = r9.A03
            boolean r0 = X.C367088qA.A05(r14, r5)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_organic_product_tagging_eligible_user"
            r13.A7p(r0, r15)
            java.lang.String r15 = "ads_mode_boost_story_enabled"
            r0 = r16
            r13.A7p(r15, r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r15 = r0.A00
            java.lang.String r0 = "nav_chain"
            r13.AAJ(r0, r15)
            X.02m r0 = r9.A00
            X.8aX r14 = X.2AL.A07(r0, r14)
            java.lang.String r0 = "system_info"
            r13.AAK(r14, r0)
            java.lang.String r14 = "position"
            r0 = r18
            r13.A9F(r14, r0)
            java.lang.String r0 = "sticker_action_type"
            r13.AAJ(r0, r10)
            r13.Cgf()
        L_0x0153:
            X.29Z r13 = r9.A0F
            X.0qQ.A0B(r11, r5)
            X.0wc r14 = r13.A01
            java.lang.String r9 = "ig_camera_ui_tool_click"
            X.0kJ r0 = r14.A00
            X.0Aj r9 = r14.A00(r0, r9)
            boolean r0 = r9.isSampled()
            if (r0 == 0) goto L_0x0246
            X.80P r14 = X.AnonymousClass80P.STICKER
            java.lang.String r0 = "tool_type"
            r9.A8M(r14, r0)
            r0 = 2302(0x8fe, float:3.226E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "legacy_falco_event_name"
            r9.AAJ(r0, r14)
            X.283 r15 = r13.A04
            java.lang.String r14 = r15.A0L
            if (r14 != 0) goto L_0x0182
            java.lang.String r14 = ""
        L_0x0182:
            java.lang.String r0 = "camera_session_id"
            r9.AAJ(r0, r14)
            if (r1 != 0) goto L_0x018d
            X.4yP r1 = r13.A0J()
        L_0x018d:
            java.lang.String r0 = "camera_destination"
            r9.A8M(r1, r0)
            X.28D r1 = r15.A09
            java.lang.String r0 = "entry_point"
            r9.A8M(r1, r0)
            r14 = 2
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r9.A8k(r1, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r9.AAJ(r0, r1)
            java.lang.String r0 = "sticker_id"
            r9.AAJ(r0, r11)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 != r0) goto L_0x01b9
            int r12 = r15.A03
        L_0x01b9:
            java.lang.String r1 = "sticker_source"
            if (r12 == r0) goto L_0x044b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r9.A8k(r1, r0)
        L_0x01c4:
            java.lang.String r1 = r15.A0U
            java.lang.String r0 = "sticker_tray_session_id"
            r9.AAJ(r0, r1)
            java.lang.String r1 = r15.A0M
            java.lang.String r0 = "composition_str_id"
            r9.AAJ(r0, r1)
            X.28t r1 = r15.A0A
            java.lang.String r0 = "composition_media_type"
            r9.A8M(r1, r0)
            X.JVj r1 = r15.A0C
            java.lang.String r0 = "surface"
            r9.A8M(r1, r0)
            java.lang.String r1 = "sticker_type"
            r0 = r17
            r9.A8M(r0, r1)
            java.lang.String r0 = "sticker_action_type"
            r9.AAJ(r0, r10)
            int r1 = r15.A01
            r0 = 2
            if (r1 == r14) goto L_0x01f2
            r0 = 1
        L_0x01f2:
            java.lang.String r1 = "camera_position"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A8k(r1, r0)
            com.instagram.common.session.UserSession r10 = r13.A03
            boolean r0 = X.C367088qA.A05(r10, r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_organic_product_tagging_eligible_user"
            r9.A7p(r0, r1)
            java.lang.String r1 = "ads_mode_boost_story_enabled"
            r0 = r16
            r9.A7p(r1, r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r9.AAJ(r0, r1)
            X.02m r0 = r13.A00
            X.8aX r1 = X.2AL.A07(r0, r10)
            java.lang.String r0 = "system_info"
            r9.AAK(r1, r0)
            java.lang.String r1 = "position"
            r0 = r18
            r9.A9F(r1, r0)
            X.Jqq r0 = r13.A0K()
            X.Jqq[] r0 = new X.C60759Jqq[]{r0}
            java.util.ArrayList r1 = X.0sr.A1M(r0)
            r0 = 1583(0x62f, float:2.218E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.AAe(r0, r1)
            r9.Cgf()
        L_0x0246:
            X.ADo r10 = new X.ADo
            r10.<init>()
            r10.A0F = r8
            java.lang.Float r0 = r6.A0D
            if (r0 == 0) goto L_0x0257
            float r0 = r0.floatValue()
            r10.A01 = r0
        L_0x0257:
            boolean r0 = r6.A04()
            if (r0 == 0) goto L_0x0441
            r0 = 1069547520(0x3fc00000, float:1.5)
        L_0x025f:
            r10.A00 = r0
        L_0x0261:
            X.6oG r1 = r6.A00()
            X.6oG r0 = X.C318046oG.AVATAR_STATIC
            if (r1 == r0) goto L_0x0271
            X.6oG r1 = r6.A00()
            X.6oG r0 = X.C318046oG.AVATAR_ANIMATED
            if (r1 != r0) goto L_0x028b
        L_0x0271:
            java.util.List r0 = r6.A0O
            java.lang.Object r0 = r0.get(r5)
            X.6o8 r0 = (X.C317966o8) r0
            java.lang.String r0 = r0.A0M
            if (r0 != 0) goto L_0x0289
            android.content.Context r1 = r7.A0f
            r0 = 2131953506(0x7f130762, float:1.9543485E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
        L_0x0289:
            r10.A0D = r0
        L_0x028b:
            java.lang.Boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0295
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x02a8
        L_0x0295:
            boolean r0 = r7.A1X()
            if (r0 == 0) goto L_0x043e
            X.0Tu r9 = X.0Tu.A06
            r0 = 36320043047067544(0x8108e3000c1f98, double:3.0322796998155424E-306)
            boolean r0 = X.182.A06(r9, r4, r0)
            if (r0 == 0) goto L_0x043e
        L_0x02a8:
            r10.A0P = r8
            r0 = r20
            r7.A1H(r0, r6, r10)
            X.6nz r0 = X.C317876nz.A1R
            java.lang.String r0 = r0.A0Z
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0351
            X.4DH r0 = r7.A0l
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x02bd:
            X.4os r6 = X.C49959FGr.A03(r4, r2)
            X.0wc r3 = X.AnonymousClass0kN.A01(r0, r4)
            java.lang.String r1 = "instagram_smb_partner_flow_producer"
            X.0kJ r0 = r3.A00
            X.0Aj r3 = r3.A00(r0, r1)
            long r0 = X.C49959FGr.A00(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "igid"
            r3.A9F(r0, r1)
            r0 = 4059(0xfdb, float:5.688E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "step"
            r3.AAJ(r0, r1)
            java.lang.String r1 = "tap"
            java.lang.String r0 = "action"
            r3.AAJ(r0, r1)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            X.0qQ.A07(r1)
            r4 = 10
            r0 = 18
            java.lang.String r0 = X.C39829ABa.A00(r5, r4, r0)
            r3.AAJ(r0, r1)
            r0 = 0
            if (r6 == 0) goto L_0x0306
            r0 = 1
        L_0x0306:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_support_partner_enabled"
            r3.A7p(r0, r1)
            if (r6 == 0) goto L_0x034f
            java.lang.String r1 = r6.Bao()
        L_0x0315:
            r0 = 3117(0xc2d, float:4.368E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.AAJ(r0, r1)
            if (r6 == 0) goto L_0x034d
            java.lang.String r0 = r6.Ac5()
            if (r0 == 0) goto L_0x034d
            java.lang.Long r1 = X.00y.A0n(r4, r0)
        L_0x032a:
            java.lang.String r0 = "partner_id"
            r3.A9F(r0, r1)
            if (r6 == 0) goto L_0x034b
            java.lang.String r1 = r6.getUrl()
        L_0x0335:
            java.lang.String r0 = "url"
            r3.AAJ(r0, r1)
            java.lang.String r8 = X.VG1.A00(r2)
            r0 = 3313(0xcf1, float:4.643E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
        L_0x0344:
            r3.AAJ(r0, r8)
        L_0x0347:
            r3.Cgf()
            return
        L_0x034b:
            r1 = 0
            goto L_0x0335
        L_0x034d:
            r1 = 0
            goto L_0x032a
        L_0x034f:
            r1 = 0
            goto L_0x0315
        L_0x0351:
            X.6nz r0 = X.C317876nz.A1P
            java.lang.String r0 = r0.A0Z
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0361
            X.4DH r0 = r7.A0l
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x02bd
        L_0x0361:
            X.6nz r0 = X.C317876nz.A1Q
            java.lang.String r0 = r0.A0Z
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0371
            X.4DH r0 = r7.A0l
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x02bd
        L_0x0371:
            X.6nz r0 = X.C317876nz.A1Y
            java.lang.String r8 = r0.A0Z
            boolean r0 = X.0qQ.A0K(r2, r8)
            if (r0 == 0) goto L_0x03d2
            X.4DH r0 = r7.A0l
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r4)
            java.lang.String r1 = "instagram_smb_partner_flow_producer"
            X.0kJ r0 = r2.A00
            X.0Aj r3 = r2.A00(r0, r1)
            java.lang.String r0 = r4.A06
            r2 = 10
            java.lang.Long r0 = X.00y.A0n(r2, r0)
            if (r0 == 0) goto L_0x03cf
            long r0 = r0.longValue()
        L_0x0397:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "igid"
            r3.A9F(r0, r1)
            java.lang.String r1 = "share_business_sticker_tray"
            java.lang.String r0 = "step"
            r3.AAJ(r0, r1)
            java.lang.String r1 = "tap"
            java.lang.String r0 = "action"
            r3.AAJ(r0, r1)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            X.0qQ.A07(r1)
            r0 = 18
            java.lang.String r0 = X.C39829ABa.A00(r5, r2, r0)
            r3.AAJ(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "is_support_partner_enabled"
            r3.A7p(r0, r1)
            java.lang.String r0 = "sticker_type"
            goto L_0x0344
        L_0x03cf:
            r0 = 0
            goto L_0x0397
        L_0x03d2:
            X.6nz r0 = X.C317876nz.A1W
            java.lang.String r0 = r0.A0Z
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x03e4
            X.4DH r1 = r7.A0l
            java.lang.String r0 = "tap_sticker"
            X.LQK.A00(r1, r4, r0)
            return
        L_0x03e4:
            X.6nz r0 = X.C317876nz.A1e
            java.lang.String r0 = r0.A0Z
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x002b
            X.KVj r4 = X.C63492Kxw.A00(r4)
            java.util.List r0 = r6.A0O
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0409
            java.util.List r0 = r6.A0O
            java.lang.Object r0 = r0.get(r5)
            X.6o8 r0 = (X.C317966o8) r0
            java.lang.String r1 = r0.A0T
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r4.A01(r0, r1, r3, r3)
        L_0x0409:
            X.0wc r2 = r4.A00
            r0 = 1442(0x5a2, float:2.02E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.0kJ r0 = r2.A00
            X.0Aj r3 = r2.A00(r0, r1)
            X.LMi r2 = r4.A01
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "media_id"
            r3.AAJ(r0, r1)
            java.lang.String r1 = "live"
            java.lang.String r0 = "product"
            r3.AAJ(r0, r1)
            java.lang.String r1 = "badges"
            java.lang.String r0 = "product_type"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "container_module"
            r3.AAJ(r0, r1)
            X.EZV r1 = X.EZV.STICKER_TRAY
            java.lang.String r0 = "origin"
            r3.A8M(r1, r0)
            goto L_0x0347
        L_0x043e:
            r8 = 0
            goto L_0x02a8
        L_0x0441:
            java.lang.Float r0 = r6.A0C
            if (r0 == 0) goto L_0x0261
            float r0 = r0.floatValue()
            goto L_0x025f
        L_0x044b:
            r9.AAJ(r1, r3)
            goto L_0x01c4
        L_0x0450:
            int r0 = r15.A03
            goto L_0x00dd
        L_0x0454:
            r1 = 0
            goto L_0x0070
        L_0x0457:
            java.lang.String r11 = r6.A0Z
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.Dn2(android.graphics.drawable.Drawable, X.6nz, java.lang.Long, boolean):void");
    }

    public final void Dn7() {
        this.A0B = null;
        ((C358368an) this.A1e.get()).A0Z();
        A1N(AnonymousClass05K.A01);
    }

    public final void DnF(StickerTraySectionCTAType stickerTraySectionCTAType) {
        0qQ.A0B(stickerTraySectionCTAType, 0);
        if (stickerTraySectionCTAType == StickerTraySectionCTAType.GIPHY) {
            ((JY9) this.A1L.get()).A0L(AnonymousClass05K.A0C);
        } else if (stickerTraySectionCTAType == StickerTraySectionCTAType.MUSIC && A0r()) {
            ((JY9) this.A1L.get()).A0J(C3515589i.STORY_MUSIC_STICKER, A13(), false);
        } else if (stickerTraySectionCTAType == StickerTraySectionCTAType.MUSIC_BROWSE && A0r()) {
            ((JY9) this.A1L.get()).A0J(C3515589i.STORY_MUSIC_STICKER, A13(), true);
        } else if (stickerTraySectionCTAType == StickerTraySectionCTAType.CUTOUT_STICKERS) {
            JY9 jy9 = (JY9) this.A1L.get();
            C59811JZf jZf = jy9.A0J;
            if (jZf != null) {
                C64435Lbq lbq = jy9.A0A;
                if (lbq != null) {
                    lbq.A02(jZf, true);
                }
                jy9.A16.A04();
            }
            29R r2 = 27p.A01(this.A0r).A09;
            1Ln A082 = 1Ln.A08(r2.A01);
            C279294yP A0J2 = r2.A0J();
            if (A082.A00.isSampled() && A0J2 != null) {
                A082.A0t("IG_CAMERA_ENTITY_TAP");
                A082.A0r("CUTOUT_STICKER_SEE_ALL_TAP");
                29R.A00(A082, r2);
                A082.A0a(A0J2);
                AnonymousClass283 r22 = r2.A04;
                A082.A0b(r22.A09);
                A082.A0T();
                A082.A0U();
                A082.A0n(27x.A08.getModuleName());
                A082.A0R("sticker_tray_session_id", r22.A0U);
                A082.A0c(r22.A0A);
                A082.A0R("composition_str_id", r22.A0M);
                A082.A0M(r22.A0A, "composition_media_type");
                A082.A0u(AnonymousClass1QI.A00.A02.A00);
                A082.Cgf();
            }
        } else {
            throw new UnsupportedOperationException("Unhandled CTA type.");
        }
    }

    public final void EDV(Drawable drawable, boolean z) {
        List list;
        Drawable drawable2;
        0qQ.A0B(drawable, 0);
        C314676if r2 = this.A1Q;
        if (((C358958bk) r2.get()).A03.containsKey(drawable)) {
            C358958bk r1 = (C358958bk) r2.get();
            AnonymousClass9IZ r0 = (AnonymousClass9IZ) ((C358958bk) r2.get()).A03.get(drawable);
            if (r0 != null) {
                drawable2 = (Drawable) r0.A03;
            } else {
                drawable2 = null;
            }
            r1.A04(drawable, drawable2);
            this.A0W = true;
        }
        boolean z2 = drawable instanceof AnonymousClass5MH;
        if (z2) {
            Drawable drawable3 = ((AnonymousClass5MH) drawable).A0A;
            if ((drawable3 instanceof AnonymousClass9X8) && ((AnonymousClass9X8) drawable3).A0C == C391149sQ.GALLERY_STICKER) {
                this.A1H.A0P();
            }
        }
        if (z && z2 && (list = this.A1r) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C248923io r22 = (C248923io) it.next();
                if (0qQ.A0K(r22.getId(), ((AnonymousClass5MH) drawable).A04)) {
                    this.A0G = r22.getId();
                    break;
                }
            }
        }
        this.A1m.A0S(drawable);
    }

    public static final int A02(AnonymousClass8ME r4) {
        List<C279454yf> BrX;
        C3511387s r1 = r4.A1J;
        if (!r1.A0H()) {
            return ClipsCreationViewModel.A00(r4.A1H).A00;
        }
        C270564gw r0 = r1.A04;
        long j = 0;
        if (!(r0 == null || (BrX = r0.BrX()) == null)) {
            for (C279454yf durationInMs : BrX) {
                j += durationInMs.getDurationInMs();
            }
        }
        return (int) j;
    }

    public static final Drawable A03(AnonymousClass8ME r0, Class cls) {
        ArrayList A0V2 = r0.A1m.A0V(cls);
        0qQ.A0B(A0V2, 0);
        return (Drawable) 00k.A0J(A0V2);
    }

    public static final AnonymousClass9IM A04(AnonymousClass8ME r9) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        InteractiveDrawableContainer interactiveDrawableContainer = r9.A1m;
        Iterator it = interactiveDrawableContainer.A0V(C306386Ly.class).iterator();
        int i = 0;
        while (it.hasNext()) {
            C306386Ly r1 = (C306386Ly) it.next();
            if (r1 != r9.A15() || !((C358368an) r9.A1e.get()).A1j.hasFocus()) {
                Spannable spannable = r1.A0F;
                0qQ.A07(spannable);
                ArrayList arrayList = new ArrayList(r6);
                for (AnonymousClass91O r0 : (AnonymousClass91O[]) C263324Kh.A06(spannable, AnonymousClass91O.class)) {
                    arrayList.add(r0.A00);
                }
                linkedHashSet.addAll(arrayList);
                i += r6;
            }
        }
        Iterator it2 = interactiveDrawableContainer.A0T(C347007w7.A00).iterator();
        while (it2.hasNext()) {
            Drawable drawable = (Drawable) it2.next();
            0qQ.A0C(drawable, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.MentionableSticker");
            C41816B1w b1w = (C41816B1w) drawable;
            i += b1w.BRc();
            linkedHashSet.addAll(b1w.BRk());
        }
        Iterator it3 = interactiveDrawableContainer.A0V(C347017w8.class).iterator();
        while (it3.hasNext()) {
            Drawable A042 = ((C347017w8) it3.next()).A04();
            0qQ.A07(A042);
            if (A042 instanceof C41816B1w) {
                C41816B1w b1w2 = (C41816B1w) A042;
                i += b1w2.BRc();
                linkedHashSet.addAll(b1w2.BRk());
            }
        }
        return new AnonymousClass9IM(00k.A0a(linkedHashSet), i + r9.A1s.size(), 3);
    }

    public static final C381839cd A06(AnonymousClass8ME r13, AnonymousClass5MH r14, C369458un r15) {
        C347017w8 r1;
        String str;
        ClipsTemplatesStickerType clipsTemplatesStickerType;
        Drawable drawable = r14.A0A;
        if ((drawable instanceof C347017w8) && (r1 = (C347017w8) drawable) != null) {
            Drawable A042 = r1.A04();
            0qQ.A07(A042);
            if (A042 instanceof C369768vI) {
                C369768vI r2 = (C369768vI) A042;
                if (r2.A0M == C318046oG.CUTOUT_PHOTO) {
                    str = r2.A0L.A0S;
                    clipsTemplatesStickerType = ClipsTemplatesStickerType.CUTOUT_PHOTO;
                    AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) r13.A10).A0K;
                    int width = r0.getWidth();
                    float f = (float) width;
                    float height = (float) r0.getHeight();
                    float intrinsicHeight = ((float) A042.getIntrinsicHeight()) / height;
                    float f2 = (float) r14.A00;
                    float f3 = r15.A05;
                    float f4 = r15.A06;
                    float f5 = (float) r14.A01;
                    int i = r15.A0B;
                    0qQ.A0B(str, 7);
                    C381839cd r3 = new C381839cd(clipsTemplatesStickerType, str, f2, intrinsicHeight, r15.A03 / f, r15.A04 / height, f3, f4, f5, ((float) A042.getIntrinsicWidth()) / f, i);
                    float f6 = r3.A00;
                    float f7 = r3.A01;
                    float f8 = r3.A02;
                    float f9 = r3.A03;
                    float f10 = r3.A04;
                    float f11 = r3.A05;
                    float f12 = r3.A06;
                    return new C381839cd(r3.A09, r3.A0A, f6, f7, f8, f9, f10, f11, f12, r3.A07, r3.A08);
                }
            }
            if (A042 instanceof AnonymousClass8N6) {
                str = ((C321016tR) A042).A0k;
                clipsTemplatesStickerType = ClipsTemplatesStickerType.CUTOUT_VIDEO;
            } else if (A042 instanceof C321016tR) {
                str = ((C321016tR) A042).A0k;
                clipsTemplatesStickerType = ClipsTemplatesStickerType.GIF;
            }
            AnonymousClass81W r02 = ((NineSixteenLayoutConfigImpl) r13.A10).A0K;
            int width2 = r02.getWidth();
            float f13 = (float) width2;
            float height2 = (float) r02.getHeight();
            float intrinsicHeight2 = ((float) A042.getIntrinsicHeight()) / height2;
            float f22 = (float) r14.A00;
            float f32 = r15.A05;
            float f42 = r15.A06;
            float f52 = (float) r14.A01;
            int i2 = r15.A0B;
            0qQ.A0B(str, 7);
            C381839cd r32 = new C381839cd(clipsTemplatesStickerType, str, f22, intrinsicHeight2, r15.A03 / f13, r15.A04 / height2, f32, f42, f52, ((float) A042.getIntrinsicWidth()) / f13, i2);
            float f62 = r32.A00;
            float f72 = r32.A01;
            float f82 = r32.A02;
            float f92 = r32.A03;
            float f102 = r32.A04;
            float f112 = r32.A05;
            float f122 = r32.A06;
            return new C381839cd(r32.A09, r32.A0A, f62, f72, f82, f92, f102, f112, f122, r32.A07, r32.A08);
        }
        return null;
    }

    public static final C347017w8 A07(AnonymousClass8ME r2, Class cls) {
        Object obj;
        Iterator it = r2.A1m.A0V(C347017w8.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C347017w8) obj).A0E(cls)) {
                break;
            }
        }
        return (C347017w8) obj;
    }

    private final C369768vI A08(C369768vI r9) {
        UserSession userSession = this.A0r;
        Context context = this.A0f;
        C317966o8 r4 = r9.A0L;
        String str = r9.A0O;
        return new C369768vI(context, r9.A0I, userSession, r4, r9.A0M, r9.A0N, str);
    }

    public static final C66540MVu A09(C279284yO r4, AnonymousClass8ME r5) {
        AnonymousClass4DH r1 = r5.A0l;
        if (r1.getContext() == null || r1.mDetached || r1.mRemoving) {
            return null;
        }
        return C63154KsN.A00(r1.requireActivity(), r1.getViewLifecycleOwner(), r5.A0r, r4, r5.A13);
    }

    public static final C365798nh A0A(AnonymousClass8ME r1) {
        C3499482o r12 = r1.A13.A02;
        if (r12.A01.A07()) {
            return r12.A00();
        }
        return null;
    }

    public static final AnonymousClass5MH A0C(Drawable drawable, AnonymousClass8ME r4, C310416b1 r5) {
        if ("sticky_text_drawable_tag".equals(r5.A0C) && (drawable instanceof AnonymousClass5MH)) {
            return (AnonymousClass5MH) drawable;
        }
        int i = AnonymousClass5MH.A0D;
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        return new AnonymousClass5MH(r4.A0f, drawable, obj);
    }

    public static final KWF A0D(AnonymousClass8ME r1) {
        return (KWF) 00k.A0J(r1.A1m.A0V(KWF.class));
    }

    public static final ArrayList A0E(AnonymousClass8ME r6) {
        HashSet hashSet = new HashSet();
        InteractiveDrawableContainer interactiveDrawableContainer = r6.A1m;
        Iterator it = interactiveDrawableContainer.A0V(C306386Ly.class).iterator();
        while (it.hasNext()) {
            Spannable spannable = ((C306386Ly) it.next()).A0F;
            0qQ.A07(spannable);
            for (AnonymousClass91O r0 : (AnonymousClass91O[]) C263324Kh.A06(spannable, AnonymousClass91O.class)) {
                hashSet.add(r0.A00.getId());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = interactiveDrawableContainer.A0V(C347017w8.class).iterator();
        while (it2.hasNext()) {
            Object obj = ((C347017w8) it2.next()).A03;
            if (obj instanceof C387369m6) {
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.model.MentionStickerClientModel");
                User user = ((C387369m6) obj).A03;
                if (user != null) {
                    arrayList.add(user.getId());
                }
            }
        }
        hashSet.addAll(arrayList);
        return new ArrayList(hashSet);
    }

    public static final Set A0F(AnonymousClass8ME r4) {
        if (182.A06(0Tu.A05, r4.A0r, 36319939968114497L)) {
            return ((AnonymousClass8C4) r4.A1u.getValue()).A00;
        }
        C352168Bz r0 = r4.A1F;
        if (r0 != null) {
            return 00k.A0k(r0.A00);
        }
        return null;
    }

    private final void A0G() {
        29H r2 = 27p.A01(this.A0r).A03;
        String str = this.A0H;
        29E r3 = r2.A0E;
        long j = r2.A02;
        if (str == null) {
            str = "music_browser_open_cancelled";
        }
        r2.A02 = r3.A06(CancelReason.SYSTEM_CANCELLED, str, 17641988, j);
        this.A0H = "";
    }

    private final void A0H() {
        ArrayList arrayList = new ArrayList();
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1m;
        Class<C389539pn> cls = C389539pn.class;
        Iterator it = interactiveDrawableContainer.A0V(cls).iterator();
        while (it.hasNext()) {
            arrayList.add(((C389539pn) it.next()).A03);
        }
        Map map = this.A2M;
        map.putAll(interactiveDrawableContainer.A0Y(cls));
        Class<C354798Nk> cls2 = C354798Nk.class;
        C354798Nk r0 = (C354798Nk) A03(this, cls2);
        if (r0 != null) {
            PromptStickerModel promptStickerModel = r0.A0B;
            if (promptStickerModel.A0G()) {
                map.putAll(interactiveDrawableContainer.A0Y(cls2));
                arrayList.add(promptStickerModel);
            }
        }
        A0Z(this, cls);
        A0Z(this, cls2);
        AnonymousClass80U r3 = this.A1B;
        C39869ACq aCq = null;
        if (!arrayList.isEmpty()) {
            aCq = new C39869ACq(arrayList);
        }
        r3.E3H(new C356478Ua(aCq, false));
    }

    private final void A0I() {
        C389529pm r2;
        Class<C389529pm> cls = C389529pm.class;
        Iterator it = this.A1m.A0V(cls).iterator();
        while (true) {
            if (!it.hasNext()) {
                r2 = null;
                break;
            }
            r2 = (C389529pm) it.next();
            if (!r2.A0o) {
                break;
            }
        }
        A0Z(this, cls);
        this.A1B.E3H(new AnonymousClass8T8(r2));
    }

    private final void A0K(Drawable drawable) {
        Drawable drawable2;
        C39885ADh aDh = this.A08;
        if (aDh != null) {
            InteractiveDrawableContainer interactiveDrawableContainer = this.A1m;
            interactiveDrawableContainer.A0i(this.A03);
            interactiveDrawableContainer.A0S(this.A03);
            C381499br r0 = (C381499br) aDh.A02.get(drawable);
            if (r0 != null) {
                drawable2 = r0.A03;
            } else {
                drawable2 = null;
            }
            aDh.A01(drawable, drawable2);
            this.A03 = null;
        }
    }

    private final void A0L(Drawable drawable) {
        Object r0;
        if (drawable instanceof C347017w8) {
            if (!182.A06(0Tu.A06, this.A0r, 36323960056458883L)) {
                this.A1B.E3H(new Object());
                this.A0H = "Existing music sticker is a RotatableDrawable, which cannot be edited";
                A0G();
                return;
            }
        }
        boolean z = false;
        if (this.A08 != null) {
            if (this.A03 != null) {
                A0K(drawable);
            } else {
                z = true;
            }
        }
        boolean A0C2 = C271404in.A0C(drawable);
        AnonymousClass80U r2 = this.A1B;
        boolean A0w2 = A0w(this);
        if (A0C2) {
            r0 = new AnonymousClass8UP(z);
        } else {
            r0 = new AnonymousClass8UO(z, A0w2);
        }
        r2.E3H(r0);
    }

    public static final void A0M(Drawable drawable, AnonymousClass8ME r13) {
        float f;
        int i;
        View view = r13.A04;
        if (view != null) {
            r13.A0i.removeView(view);
        }
        if ((r13.A1I.A01() instanceof C388479nt) && !AnonymousClass8IK.A05(r13.A0r)) {
            return;
        }
        if (drawable == null) {
            r13.A04 = null;
            return;
        }
        Context context = r13.A0f;
        boolean A022 = 0mk.A02(context);
        InteractiveDrawableContainer interactiveDrawableContainer = r13.A1m;
        0qQ.A0B(context, 0);
        IgImageView igImageView = new IgImageView(context);
        igImageView.setBackgroundDrawable(context.getDrawable(R.drawable.clips_stacked_timeline_dotted_border));
        Rect copyBounds = drawable.copyBounds();
        0qQ.A07(copyBounds);
        float A0H2 = interactiveDrawableContainer.A0H(drawable);
        Float A0R2 = interactiveDrawableContainer.A0R(drawable);
        if (A0R2 != null) {
            f = A0R2.floatValue();
        } else {
            f = 0.0f;
        }
        float width = (((float) copyBounds.width()) * f) + 50.0f;
        float height = (((float) copyBounds.height()) * f) + 50.0f;
        Rect A0L2 = interactiveDrawableContainer.A0L(drawable);
        float exactCenterX = A0L2.exactCenterX();
        float exactCenterY = A0L2.exactCenterY();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AnonymousClass1GB.A01(width), AnonymousClass1GB.A01(height));
        int A012 = AnonymousClass1GB.A01(exactCenterX - (width / 2.0f));
        int A013 = AnonymousClass1GB.A01(exactCenterY - (height / 2.0f));
        int i2 = 0;
        if (A022) {
            layoutParams.setMargins(0, A013, igImageView.getResources().getDisplayMetrics().widthPixels - AnonymousClass1GB.A01(((float) A012) + width), 0);
        } else {
            layoutParams.setMargins(A012, A013, 0, 0);
        }
        layoutParams.width = AnonymousClass1GB.A01(width);
        layoutParams.height = AnonymousClass1GB.A01(height);
        igImageView.setLayoutParams(layoutParams);
        igImageView.setRotation(A0H2);
        if (!drawable.isVisible()) {
            i2 = 8;
        }
        igImageView.setVisibility(i2);
        r13.A04 = igImageView;
        if (drawable instanceof AnonymousClass5MH) {
            boolean A092 = ((AnonymousClass5MH) drawable).A09();
            View view2 = r13.A04;
            if (A092) {
                if (view2 != null) {
                    i = 0;
                }
            } else if (view2 != null) {
                i = 8;
            }
            view2.setVisibility(i);
        }
        r13.A0i.addView(r13.A04);
    }

    public static final void A0O(Drawable drawable, AnonymousClass8ME r3) {
        if (drawable instanceof C268684dp) {
            C268684dp r1 = (C268684dp) drawable;
            if (r1.isLoading()) {
                r1.A9D(new C40283AYy(drawable, r1, r3));
            } else {
                r3.A1m.A0m(drawable);
            }
        }
        r3.A1A.Dn6(drawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e5, code lost:
        if (r3.A03.A0G != true) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e1, code lost:
        if (r35 != false) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0167 A[EDGE_INSN: B:143:0x0167->B:74:0x0167 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0P(android.graphics.drawable.Drawable r32, X.AnonymousClass8ME r33, int r34, boolean r35, boolean r36) {
        /*
            r1 = r33
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r11 = r1.A1m
            java.util.List r0 = r11.getAllDrawables()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001f
            X.80U r2 = r1.A1B
            X.80V r0 = X.AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE
            boolean r0 = r2.CQ0(r0)
            if (r0 == 0) goto L_0x001f
            X.8BN r2 = r1.A1I
            X.9nx r0 = X.C388519nx.A00
            r2.A03(r0)
        L_0x001f:
            X.8Bz r7 = r1.A1F
            r5 = r32
            r12 = r34
            r10 = r35
            if (r7 == 0) goto L_0x0035
            r0 = 1
            X.0qQ.A0B(r5, r0)
            if (r35 != 0) goto L_0x0302
            X.B3d r0 = X.C271404in.A09(r5)
            if (r0 == 0) goto L_0x0302
        L_0x0035:
            boolean r2 = r5 instanceof X.AnonymousClass5MH
            r0 = r5
            if (r2 == 0) goto L_0x003e
            X.5MH r0 = (X.AnonymousClass5MH) r0
            android.graphics.drawable.Drawable r0 = r0.A0A
        L_0x003e:
            java.lang.String r32 = ""
            boolean r9 = r0 instanceof X.C306386Ly
            r4 = 0
            if (r9 == 0) goto L_0x02e5
            X.6Ly r2 = r1.A15()
            if (r0 != r2) goto L_0x0057
            X.6if r2 = r1.A1e
            java.lang.Object r2 = r2.get()
            X.8an r2 = (X.C358368an) r2
            r2.A0L = r4
            r2.A04 = r4
        L_0x0057:
            r15 = r4
            r33 = r4
        L_0x005a:
            boolean r2 = r0 instanceof X.C346997w6
            if (r2 == 0) goto L_0x006a
            X.85r r2 = r1.A18
            if (r35 == 0) goto L_0x006a
            X.C3506685r.A01(r2)
            X.2xu r2 = r2.A04
            r2.A00()
        L_0x006a:
            X.87i r3 = r1.A0x
            int r2 = r3.A05
            r8 = 1
            if (r2 == r12) goto L_0x01b7
            boolean r2 = r0 instanceof X.AnonymousClass9X8
            if (r2 != 0) goto L_0x01b7
            r14 = 0
            X.0qQ.A0B(r0, r14)
            X.B3d r2 = X.C271404in.A09(r0)
            if (r2 == 0) goto L_0x01c1
            r1.A0K(r0)
            X.85r r6 = r1.A18
            if (r35 != 0) goto L_0x0088
            if (r36 == 0) goto L_0x010f
        L_0x0088:
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = X.C271404in.A02(r0)
            java.lang.String r3 = r6.A00
            java.lang.String r2 = r2.A0l
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x009b
            X.C3506685r.A01(r6)
            r6.A00 = r4
        L_0x009b:
            X.2xu r2 = r6.A04
            r2.A00()
            if (r35 == 0) goto L_0x010f
            X.82p r2 = r1.A13
            X.82o r2 = r2.A02
            X.8nh r6 = r2.A00()
            X.8nd r3 = r6.A05
            X.8nd r2 = X.C365758nd.A07
            if (r3 != r2) goto L_0x00b7
            X.7zv r2 = r6.A03
            r2.getClass()
            r2.A0V = r4
        L_0x00b7:
            com.instagram.common.session.UserSession r2 = r1.A0r
            X.27r r28 = X.27p.A01(r2)
            r3 = r33
            X.9tN r31 = X.AED.A01(r3, r15)
            X.82p r3 = r1.A13
            X.82o r3 = r3.A02
            X.82Y r3 = r3.A01
            X.50r r3 = r3.A0g
            if (r3 == 0) goto L_0x01b3
            int r3 = r3.ordinal()
            if (r3 != r8) goto L_0x01b3
            X.4yP r29 = X.C279294yP.FEED
        L_0x00d5:
            X.JVj r30 = r1.A13()
            r34 = 0
            X.8C9 r3 = r1.A17
            if (r3 == 0) goto L_0x00e7
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r3 = r3.A03
            boolean r3 = r3.A0G
            r35 = 1
            if (r3 == r8) goto L_0x00e9
        L_0x00e7:
            r35 = 0
        L_0x00e9:
            java.lang.String r33 = "TRASH_CAN"
            r28.A12(r29, r30, r31, r32, r33, r34, r35)
            boolean r3 = r0 instanceof X.B3d
            if (r3 == 0) goto L_0x010f
            X.27r r2 = X.27p.A01(r2)
            X.29I r6 = r2.A02
            X.29D r3 = r6.A00
            X.27x r2 = r3.A00
            X.4yP r2 = r2.A0J()
            java.lang.String.valueOf(r2)
            X.JVj r2 = r3.A00()
            java.lang.String.valueOf(r2)
            java.lang.String r2 = "user_post_capture_music_remove"
            X.29I.A00(r6, r2)
        L_0x010f:
            boolean r2 = A0w(r1)
            if (r2 == 0) goto L_0x0123
            X.0eK r2 = r1.A1t
            r2.getClass()
            java.lang.Object r2 = r2.get()
            X.8cb r2 = (X.C359318cb) r2
            r2.A0M(r5)
        L_0x0123:
            android.graphics.drawable.Drawable r2 = r1.A03
            if (r5 != r2) goto L_0x0129
            r1.A03 = r4
        L_0x0129:
            java.util.Map r8 = r1.A1s
            java.util.Set r2 = r8.keySet()
            java.util.Iterator r7 = r2.iterator()
        L_0x0133:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0167
            java.lang.Object r6 = r7.next()
            java.lang.Object r4 = r8.get(r6)
            java.util.AbstractCollection r4 = (java.util.AbstractCollection) r4
            if (r4 == 0) goto L_0x0133
            java.util.Iterator r3 = r4.iterator()
            X.0qQ.A07(r3)
        L_0x014c:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0133
            java.lang.Object r2 = r3.next()
            X.0qQ.A07(r2)
            if (r2 != r5) goto L_0x014c
            r4.remove(r2)
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x01af
            r8.remove(r6)
        L_0x0167:
            r2 = r36 ^ 1
            r1.A1P(r2)
            X.88Z r2 = r1.A1A
            r2.DnD(r0)
            if (r9 == 0) goto L_0x0186
            X.6Ly r0 = (X.C306386Ly) r0
            android.text.Spannable r2 = r0.A0F
            X.0qQ.A07(r2)
            java.lang.Class<X.91O> r0 = X.AnonymousClass91O.class
            java.lang.Object[] r0 = X.C263324Kh.A06(r2, r0)
            X.91O[] r0 = (X.AnonymousClass91O[]) r0
            int r0 = r0.length
            if (r0 != 0) goto L_0x01a3
        L_0x0185:
            return
        L_0x0186:
            boolean r2 = r0 instanceof X.C41816B1w
            if (r2 != 0) goto L_0x019b
            boolean r2 = r0 instanceof X.C347017w8
            if (r2 == 0) goto L_0x0185
            X.7w8 r0 = (X.C347017w8) r0
            android.graphics.drawable.Drawable r0 = r0.A04()
            X.0qQ.A07(r0)
            boolean r2 = r0 instanceof X.C41816B1w
            if (r2 == 0) goto L_0x0185
        L_0x019b:
            X.B1w r0 = (X.C41816B1w) r0
            int r0 = r0.BRc()
            if (r0 <= 0) goto L_0x0185
        L_0x01a3:
            X.6if r0 = r1.A1e
            java.lang.Object r0 = r0.get()
            X.8an r0 = (X.C358368an) r0
            X.C358368an.A0F(r0)
            return
        L_0x01af:
            r8.put(r6, r4)
            goto L_0x0167
        L_0x01b3:
            r29 = 0
            goto L_0x00d5
        L_0x01b7:
            boolean r2 = r3.A0B()
            if (r2 == 0) goto L_0x01e1
            r3.A06()
            goto L_0x01e1
        L_0x01c1:
            boolean r2 = A0s(r0)
            if (r2 == 0) goto L_0x01e5
            X.82p r2 = r1.A13
            X.82o r2 = r2.A02
            X.8nd r3 = r2.A01()
            X.8nd r2 = X.C365758nd.A04
            if (r3 != r2) goto L_0x01e5
            X.869 r3 = r1.A1K
            X.AWM r2 = new X.AWM
            r2.<init>(r1)
            java.util.ArrayList r2 = r11.A0T(r2)
            r3.A02(r2)
        L_0x01e1:
            if (r35 == 0) goto L_0x010f
            goto L_0x00b7
        L_0x01e5:
            boolean r2 = r0 instanceof X.AnonymousClass5MM
            if (r2 == 0) goto L_0x0206
            if (r35 == 0) goto L_0x0206
            X.6if r2 = r1.A1O
            java.lang.Object r3 = r2.get()
            X.Lh1 r3 = (X.C64724Lh1) r3
            X.MVu r2 = r3.A06
            if (r2 == 0) goto L_0x01fa
            r2.AHT()
        L_0x01fa:
            X.MVu r2 = r3.A06
            if (r2 == 0) goto L_0x0201
            r2.reset()
        L_0x0201:
            r3.A0A()
            goto L_0x00b7
        L_0x0206:
            boolean r2 = r0 instanceof X.C347017w8
            if (r2 == 0) goto L_0x02c2
            if (r35 == 0) goto L_0x02c2
            X.82p r2 = r1.A13
            X.82o r13 = r2.A02
            X.82Y r2 = r13.A01
            boolean r2 = r2.A07()
            if (r2 == 0) goto L_0x02c2
            r2 = r0
            X.7w8 r2 = (X.C347017w8) r2
            android.graphics.drawable.Drawable r12 = r2.A04()
            X.0qQ.A07(r12)
            boolean r2 = r12 instanceof X.C387259lv
            if (r2 == 0) goto L_0x0278
            r2 = r12
            X.9lv r2 = (X.C387259lv) r2
            X.9V0 r11 = r2.A00
            if (r11 == 0) goto L_0x0278
            X.8Nx r6 = r1.A0w
            X.0wc r7 = r6.A00
            java.lang.String r3 = "ig_fitness_stickers"
            X.0kJ r2 = r7.A00
            X.0Aj r10 = r7.A00(r2, r3)
            boolean r2 = r10.isSampled()
            if (r2 == 0) goto L_0x0278
            java.lang.String r3 = r6.A01
            java.lang.String r2 = "story_session_uuid"
            r10.AAJ(r2, r3)
            java.lang.String r3 = "REMOVE_FITNESS_STICKER"
            java.lang.String r2 = "event_name"
            r10.AAJ(r2, r3)
            long r6 = r11.A01
            long r2 = java.lang.System.currentTimeMillis()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r16
            long r2 = r2 - r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r6.toDays(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "days_since_selected_sticker_generated"
            r10.A9F(r2, r3)
            java.lang.String r3 = r11.A02
            java.lang.String r2 = "selected_sticker_type"
            r10.AAJ(r2, r3)
            java.lang.String r3 = r11.A03
            java.lang.String r2 = "selected_sticker_image"
            r10.AAJ(r2, r3)
            r10.Cgf()
        L_0x0278:
            X.6if r2 = r1.A1a
            java.lang.Object r3 = r2.get()
            X.AJ2 r3 = (X.AJ2) r3
            r13.A00()
            boolean r2 = r12 instanceof X.C389739q7
            if (r2 == 0) goto L_0x00b7
            X.9q7 r12 = (X.C389739q7) r12
            X.Khv r6 = r12.A00
            X.Khv r2 = X.C62565Khv.AUTO_TAG
            if (r6 != r2) goto L_0x00b7
            com.instagram.user.model.Product r11 = r12.A02()
            com.instagram.common.session.UserSession r10 = r3.A04
            X.0iw r7 = r3.A03
            java.lang.String r6 = r3.A08
            java.lang.String r3 = r11.A0H
            java.lang.Integer r22 = java.lang.Integer.valueOf(r14)
            java.lang.String r24 = "remove"
            java.lang.String r28 = "stories"
            java.lang.String r29 = "seller"
            r17 = r4
            r18 = r7
            r19 = r10
            r20 = r2
            r21 = r4
            r23 = r6
            r25 = r3
            r26 = r3
            r27 = r4
            r30 = r14
            r31 = r14
            r16 = r4
            X.LTQ.A04(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x00b7
        L_0x02c2:
            boolean r2 = r0 instanceof X.C354798Nk
            if (r2 == 0) goto L_0x01e1
            r2 = r0
            X.8Nk r2 = (X.C354798Nk) r2
            com.instagram.reels.prompt.model.PromptStickerModel r2 = r2.A0B
            boolean r2 = r2.A0M()
            if (r2 == 0) goto L_0x01e1
            if (r35 == 0) goto L_0x02de
            X.8Mr r3 = r1.A1E
            if (r3 == 0) goto L_0x00b7
            X.9nR r2 = X.C388199nR.A00
            X.C354608Mr.A00(r2, r3)
            goto L_0x00b7
        L_0x02de:
            if (r7 == 0) goto L_0x010f
            r7.A04()
            goto L_0x010f
        L_0x02e5:
            android.util.SparseArray r6 = r1.A0g
            java.lang.Object r3 = r6.get(r12)
            X.4nO r3 = (X.C273914nO) r3
            if (r3 == 0) goto L_0x02fe
            java.lang.String r32 = r3.A00()
            java.lang.String r2 = r3.A04
            r33 = r2
            java.lang.String r15 = r3.A05
        L_0x02f9:
            r6.remove(r12)
            goto L_0x005a
        L_0x02fe:
            r15 = r4
            r33 = r4
            goto L_0x02f9
        L_0x0302:
            X.C352168Bz.A01(r5, r7, r12, r10)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.A0P(android.graphics.drawable.Drawable, X.8ME, int, boolean, boolean):void");
    }

    public static final void A0Q(C279284yO r3, AnonymousClass8ME r4) {
        C354798Nk r1 = (C354798Nk) A03(r4, C354798Nk.class);
        if (r1 != null) {
            if (0qQ.A0K(r3, C3493880e.A00)) {
                r1.A03 = true;
                r1.A0A.A00();
                r4.A1m.A0i(r1);
            } else {
                r1.A03 = false;
                r4.A1m.A0l(r1);
            }
        }
        C314676if r12 = r4.A1O;
        if (r12.A03) {
            C64724Lh1 lh1 = (C64724Lh1) r12.get();
            C66540MVu A092 = A09(r3, r4);
            if (!0qQ.A0K(A092, lh1.A06)) {
                lh1.A06 = A092;
                C64724Lh1.A02(lh1);
            }
        }
        if (r4.A0q()) {
            r4.DMp();
        }
        C279284yO r0 = r4.A05;
        if (r0 != r3) {
            C3493880e r13 = C3493880e.A00;
            if (!0qQ.A0K(r0, r13) && !0qQ.A0K(r3, r13)) {
                r4.A1m.A0b();
            }
            r4.A0g.clear();
            r4.A05 = r3;
        }
        r4.A1m.setCameraDestination(r3);
    }

    public static final void A0S(AnonymousClass8ME r3) {
        for (Drawable drawable : r3.A1m.getAllDrawables()) {
            C359318cb r0 = (C359318cb) r3.A1t.get();
            if (r0 != null) {
                r0.A0M(drawable);
            }
            r3.EDV(drawable, false);
        }
        for (C61084JwM jwM : r3.A0n.A02) {
            jwM.A00 = null;
        }
    }

    public static final void A0T(AnonymousClass8ME r24) {
        String str;
        String str2;
        AnonymousClass8ME r6 = r24;
        UserSession userSession = r6.A0r;
        boolean A052 = C367088qA.A05(userSession, false);
        AnonymousClass0iw r7 = r6.A0o;
        String moduleName = r7.getModuleName();
        Integer num = AnonymousClass05K.A0C;
        C16581Uxb uxb = C16581Uxb.MULTI_PRODUCT_STORY_STICKER;
        String str3 = r6.A1p;
        0qQ.A0B(moduleName, 1);
        0qQ.A0B(num, 2);
        0qQ.A0B(uxb, 3);
        0qQ.A0B(str3, 4);
        List list = 0sn.A00;
        ShoppingTaggingFeedClientState shoppingTaggingFeedClientState = new ShoppingTaggingFeedClientState(list, list, list, list, list, list, list);
        AnonymousClass88Z r8 = r6.A1A;
        if (!r8.Cb8(C3512188a.A0g) || !r8.Cb8(C3512188a.A0e)) {
            str = ((AJ2) r6.A1a.get()).A07.A04;
        } else {
            str = null;
        }
        List A0W2 = 00k.A0W(0Yv.A1F(0sr.A1P(new List[]{shoppingTaggingFeedClientState.A04, 0sr.A1N(str)})));
        0qQ.A0B(A0W2, 0);
        shoppingTaggingFeedClientState.A04 = A0W2;
        if (r8.Cb8(C3512188a.A0G)) {
            str2 = null;
        } else {
            str2 = ((AJ2) r6.A1a.get()).A07.A03;
        }
        shoppingTaggingFeedClientState.A00 = 0sr.A1N(str2);
        if (A052) {
            List A0W3 = 00k.A0W(0Yv.A1F(0sr.A1P(new List[]{shoppingTaggingFeedClientState.A06, A0E(r6)})));
            0qQ.A0B(A0W3, 0);
            shoppingTaggingFeedClientState.A06 = A0W3;
        }
        C17053VGb.A00(userSession).A05((String) null, r7.getModuleName(), AnonymousClass0t1.A01.A01(userSession).A1x(), "stories");
        C249713kF r72 = C249713kF.A00;
        AnonymousClass4DH r82 = r6.A0l;
        r72.A0j(r82, r82.requireActivity(), (FragmentActivity) null, userSession, C64174LSb.A01((ClipInfo) null, uxb, shoppingTaggingFeedClientState, (TaggingFeedMultiSelectState) null, num, (Long) null, (String) null, (String) null, moduleName, (String) null, (String) null, (String) null, str3, (List) null, A052), (String) null, false, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x027c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0283, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0135, code lost:
        if (r0 != null) goto L_0x0137;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0V(X.AnonymousClass8ME r20, X.AnonymousClass863 r21) {
        /*
            r9 = r20
            X.80U r4 = r9.A1B
            X.80V r10 = r4.Atr()
            X.82p r0 = r9.A13
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.50r r0 = r0.A0g
            r8 = 0
            if (r0 == 0) goto L_0x0039
            X.80V r0 = X.AnonymousClass80V.CLIPS_EDITOR
            if (r10 != r0) goto L_0x0039
            com.instagram.common.session.UserSession r3 = r9.A0r
            X.0Tu r2 = X.0Tu.A06
            r0 = 36318161850603473(0x81072d000017d1, double:3.031090023596694E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0039
            X.861 r0 = r9.A1f
            X.2Fj r0 = r0.A06
            java.lang.Object r0 = r0.A02()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0039
        L_0x0038:
            return
        L_0x0039:
            int r7 = r21.CEG()
            int r6 = r21.Bd7()
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r9.A1m
            r3.A0e(r7, r6)
            X.861 r2 = r9.A1f
            X.2Fj r5 = r2.A0A
            java.lang.Object r1 = r5.A02()
            X.8YU r0 = X.AnonymousClass8YU.PLAYING
            if (r1 != r0) goto L_0x005b
            int r0 = r2.A00()
            if (r7 >= r0) goto L_0x005b
            r3.A0d()
        L_0x005b:
            android.widget.TextView r11 = r9.A0j
            int r0 = r11.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x010b
            X.87s r1 = r9.A1J
            boolean r0 = r1.A0M()
            if (r0 == 0) goto L_0x010b
            int r13 = r21.CEG()
            X.4gw r0 = r1.A04
            if (r0 == 0) goto L_0x0098
            java.util.List r0 = r0.BrX()
            if (r0 == 0) goto L_0x0098
            java.util.Iterator r20 = r0.iterator()
            r18 = 0
            r1 = 0
        L_0x0082:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0098
            java.lang.Object r14 = r20.next()
            int r17 = r1 + 1
            if (r1 >= 0) goto L_0x009b
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0098:
            r17 = 0
            goto L_0x00ac
        L_0x009b:
            X.4yf r14 = (X.C279454yf) r14
            long r0 = (long) r13
            int r12 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r12 <= 0) goto L_0x00fb
            long r15 = r14.getDurationInMs()
            long r15 = r15 + r18
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r12 > 0) goto L_0x00fb
        L_0x00ac:
            r13 = 1
            if (r17 <= 0) goto L_0x00f8
            android.content.Context r12 = r9.A0f
            r1 = 2131975061(0x7f135b95, float:1.9587204E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r12.getString(r1, r0)
        L_0x00c0:
            r11.setText(r0)
            int r1 = r11.getVisibility()
            r0 = 4
            if (r1 != r0) goto L_0x010b
            r0 = 2
            int[] r0 = new int[r0]
            r11.getLocationOnScreen(r0)
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            r11.getHitRect(r12)
            java.util.List r0 = r3.getAllDrawables()
            java.util.Iterator r1 = r0.iterator()
        L_0x00e0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r1.next()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            android.graphics.Rect r0 = r3.A0L(r0)
            boolean r0 = r12.intersect(r0)
            if (r0 == 0) goto L_0x00e0
            r13 = 0
            goto L_0x00e0
        L_0x00f8:
            java.lang.String r0 = ""
            goto L_0x00c0
        L_0x00fb:
            long r0 = r14.getDurationInMs()
            long r18 = r18 + r0
            r1 = r17
            goto L_0x0082
        L_0x0105:
            if (r13 == 0) goto L_0x0108
            r2 = 0
        L_0x0108:
            r11.setVisibility(r2)
        L_0x010b:
            android.view.View r0 = r9.A04
            if (r0 == 0) goto L_0x013a
            X.8BN r1 = r9.A1I
            X.2Fk r0 = r1.A00
            java.lang.Object r0 = r0.A02()
            X.88W r0 = (X.AnonymousClass88W) r0
            if (r0 == 0) goto L_0x0279
            java.lang.Object r0 = r0.A01
        L_0x011d:
            boolean r0 = r0 instanceof X.C388439np
            r2 = r0 ^ 1
            android.graphics.drawable.Drawable r1 = r1.A00()
            X.80V r0 = X.AnonymousClass80V.CLIPS_EDITOR
            if (r10 != r0) goto L_0x0271
            if (r1 == 0) goto L_0x0271
            if (r2 != 0) goto L_0x0271
            boolean r0 = r1.isVisible()
            if (r0 == 0) goto L_0x0271
            android.view.View r0 = r9.A04
            if (r0 == 0) goto L_0x013a
        L_0x0137:
            r0.setVisibility(r8)
        L_0x013a:
            X.6if r1 = r9.A1O
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0163
            java.lang.Object r2 = r1.get()
            X.Lh1 r2 = (X.C64724Lh1) r2
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0163
            java.lang.Integer r1 = r2.A0A
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0163
            X.7w8 r0 = r2.A04
            if (r0 == 0) goto L_0x0163
            android.graphics.drawable.Drawable r1 = r0.A04()
            boolean r0 = r1 instanceof X.AnonymousClass5MM
            if (r0 == 0) goto L_0x0163
            X.5MM r1 = (X.AnonymousClass5MM) r1
            if (r1 == 0) goto L_0x0163
            r1.EXC(r7, r6)
        L_0x0163:
            java.util.List r0 = r3.getAllDrawables()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0038
            java.lang.Object r1 = r5.A02()
            X.8YU r0 = X.AnonymousClass8YU.PAUSED
            if (r1 != r0) goto L_0x0038
            X.80V r1 = r4.Atr()
            X.80V r0 = X.AnonymousClass80V.CLIPS_SHARESHEET
            if (r1 == r0) goto L_0x0038
            java.util.List r0 = r3.getAllDrawables()
            java.util.Iterator r19 = r0.iterator()
        L_0x0187:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r2 = r19.next()
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            boolean r0 = r2 instanceof X.AnonymousClass5MH
            if (r0 == 0) goto L_0x0187
            X.5MH r2 = (X.AnonymousClass5MH) r2
            if (r2 == 0) goto L_0x0187
            int r8 = r2.A01
            int r1 = r2.A00
            int r0 = r21.CEG()
            if (r8 > r0) goto L_0x0187
            int r0 = r21.CEG()
            if (r1 <= r0) goto L_0x0187
            android.graphics.drawable.Drawable r1 = r2.A0A
            boolean r0 = r1 instanceof X.C347017w8
            if (r0 == 0) goto L_0x0187
            X.7w8 r1 = (X.C347017w8) r1
            if (r1 == 0) goto L_0x0187
            java.lang.Iterable r0 = r1.A05()
            java.util.Iterator r18 = r0.iterator()
        L_0x01bd:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0187
            java.lang.Object r10 = r18.next()
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            boolean r0 = r10 instanceof X.C321016tR
            if (r0 == 0) goto L_0x01bd
            X.6tR r10 = (X.C321016tR) r10
            if (r10 == 0) goto L_0x01bd
            int r3 = r21.CEG()
            int r3 = r3 - r8
            long r1 = r10.AzG()
            r16 = 0
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x01bd
            long r2 = (long) r3
            long r0 = r10.AzG()
            long r2 = r2 % r0
            int r0 = (int) r2
            r10.A02 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r10.A05 = r0
            X.0eM r0 = r10.A0r
            java.lang.Object r5 = r0.getValue()
            X.A6z r5 = (X.C39733A6z) r5
            X.0ng r11 = r10.A0b
            monitor-enter(r5)
            r0 = 1
            X.0qQ.A0B(r11, r0)     // Catch:{ all -> 0x028c }
            java.lang.String r1 = "TaskDebouncer.executeWithDebounce"
            r0 = -1070882761(0xffffffffc02ba037, float:-2.6816537)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x028c }
            java.util.Map r9 = r5.A03     // Catch:{ all -> 0x0284 }
            java.lang.Object r1 = r9.get(r10)     // Catch:{ all -> 0x0284 }
            java.util.concurrent.ScheduledFuture r1 = (java.util.concurrent.ScheduledFuture) r1     // Catch:{ all -> 0x0284 }
            if (r1 == 0) goto L_0x021d
            boolean r0 = r1.isDone()     // Catch:{ all -> 0x0284 }
            if (r0 != 0) goto L_0x021d
            r0 = 0
            r10.hashCode()     // Catch:{ all -> 0x0284 }
            r1.cancel(r0)     // Catch:{ all -> 0x0284 }
        L_0x021d:
            r6 = 100
            r3 = 0
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0284 }
            java.util.Map r0 = r5.A02     // Catch:{ all -> 0x0284 }
            java.lang.Object r2 = r0.get(r10)     // Catch:{ all -> 0x0284 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0284 }
            if (r2 != 0) goto L_0x0236
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0284 }
            r0.put(r10, r2)     // Catch:{ all -> 0x0284 }
        L_0x0236:
            r0 = 20
            long r12 = r2.longValue()     // Catch:{ all -> 0x0284 }
            long r14 = r14 - r12
            long r6 = r6 - r14
            long r1 = java.lang.Math.min(r0, r6)     // Catch:{ all -> 0x0284 }
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0247
            r3 = r1
        L_0x0247:
            java.lang.String r1 = "TaskDebouncer.scheduleTask"
            r0 = 1166617737(0x45892c89, float:4389.567)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x0284 }
            java.util.concurrent.ScheduledExecutorService r2 = r5.A04     // Catch:{ all -> 0x027c }
            X.TIY r1 = new X.TIY     // Catch:{ all -> 0x027c }
            r1.<init>(r5, r10, r11)     // Catch:{ all -> 0x027c }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x027c }
            java.util.concurrent.ScheduledFuture r0 = r2.schedule(r1, r3, r0)     // Catch:{ all -> 0x027c }
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x027c }
            r9.put(r10, r0)     // Catch:{ all -> 0x027c }
            r0 = -1136225891(0xffffffffbc46919d, float:-0.012119678)
            X.0fh.A00(r0)     // Catch:{ all -> 0x0284 }
            r0 = -1817500088(0xffffffff93ab2648, float:-4.3204217E-27)
            X.0fh.A00(r0)     // Catch:{ all -> 0x028c }
            monitor-exit(r5)
            goto L_0x01bd
        L_0x0271:
            android.view.View r0 = r9.A04
            if (r0 == 0) goto L_0x013a
            r8 = 8
            goto L_0x0137
        L_0x0279:
            r0 = 0
            goto L_0x011d
        L_0x027c:
            r1 = move-exception
            r0 = -1921165698(0xffffffff8d7d567e, float:-7.8065755E-31)
            X.0fh.A00(r0)     // Catch:{ all -> 0x0284 }
            throw r1     // Catch:{ all -> 0x0284 }
        L_0x0284:
            r1 = move-exception
            r0 = -110338608(0xfffffffff96c5dd0, float:-7.67053E34)
            X.0fh.A00(r0)     // Catch:{ all -> 0x028c }
            throw r1     // Catch:{ all -> 0x028c }
        L_0x028c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.A0V(X.8ME, X.863):void");
    }

    public static final void A0W(AnonymousClass8ME r2, C369728vE r3) {
        A0Z(r2, C369728vE.class);
        AnonymousClass80U r22 = r2.A1B;
        C40609Aex aex = r3.A05;
        0qQ.A0C(aex, "null cannot be cast to non-null type com.instagram.reels.itakecare.model.ITakeCareStickerModel");
        r22.E3H(new AnonymousClass8TV(aex));
    }

    public static final void A0X(AnonymousClass8ME r1, C18603Vuw vuw) {
        A0Z(r1, C16147UpY.class);
        r1.A1B.E3H(new AnonymousClass8TQ(vuw));
    }

    public static final void A0Y(AnonymousClass8ME r13, C3499082j r14) {
        String str;
        Integer num;
        String str2;
        List list;
        UserSession userSession = r13.A0r;
        Context context = r13.A0f;
        TargetViewSizeProvider targetViewSizeProvider = r13.A10;
        0qQ.A0B(context, 1);
        0qQ.A0B(r14, 2);
        List A1P2 = 0sr.A1P(new String[]{"standalone_fundraiser_sticker_id", "multiple_avatar_standalone_sticker_id"});
        if (182.A06(0Tu.A05, userSession, 36316624252572189L)) {
            Collections.rotate(A1P2, -1);
        }
        String str3 = null;
        C347017w8 A002 = ABT.A00(context, userSession, targetViewSizeProvider, r14, A1P2);
        if (r14.A01 != null && 182.A06(0Tu.A06, userSession, 36318449613412481L)) {
            A002.A0C(new C387169lm(context, userSession, A002, context.getString(2131968309)));
            NewFundraiserInfo newFundraiserInfo = r14.A01;
            FragmentActivity requireActivity = r13.A0l.requireActivity();
            if (newFundraiserInfo != null) {
                str = newFundraiserInfo.A01;
            } else {
                str = null;
            }
            str.getClass();
            if (newFundraiserInfo != null) {
                str3 = newFundraiserInfo.A07;
                num = Integer.valueOf(newFundraiserInfo.A00);
                str2 = newFundraiserInfo.A05;
                list = newFundraiserInfo.A08;
            } else {
                num = null;
                str2 = null;
                list = null;
            }
            LTV.A08(requireActivity, userSession, num, str, str3, str2, r13.A1p, list);
        }
        C317876nz r0 = C317876nz.A0a;
        r13.A1H(A002, C317886o0.A01(), r13.A16());
    }

    public static final void A0Z(AnonymousClass8ME r4, Class cls) {
        InteractiveDrawableContainer interactiveDrawableContainer = r4.A1m;
        Iterator it = interactiveDrawableContainer.A0V(cls).iterator();
        while (it.hasNext()) {
            C299875vz r1 = (C299875vz) it.next();
            if (r1.A0A()) {
                r4.A0B = interactiveDrawableContainer.A0O(r1);
                AnonymousClass0eK r0 = r4.A1t;
                r0.getClass();
                ((C359318cb) r0.get()).A0M(r1);
                interactiveDrawableContainer.A0S(r1);
            }
        }
    }

    public static final void A0a(AnonymousClass8ME r2, Integer num) {
        for (Drawable drawable : r2.A1q) {
            if (drawable instanceof AnonymousClass5MH) {
                ((AnonymousClass5MH) drawable).A03 = num;
            }
        }
    }

    public static final void A0b(AnonymousClass8ME r18, List list) {
        AnonymousClass8ME r4 = r18;
        int A022 = A02(r4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C61084JwM jwM = (C61084JwM) it.next();
            Drawable drawable = (Drawable) jwM.A00;
            B39 b39 = (B39) jwM.A02;
            if (drawable != null) {
                float f = (float) A022;
                if (b39.Byr() >= f) {
                    C359318cb r0 = (C359318cb) r4.A1t.get();
                    if (r0 != null) {
                        r0.A0M(drawable);
                    }
                    r4.EDV(drawable, false);
                    jwM.A00 = null;
                } else {
                    ((AnonymousClass5MH) drawable).Eog((int) b39.Byr(), (int) Math.min(b39.B1g(), f));
                }
            } else if (b39.Byr() < ((float) A022)) {
                C317876nz r6 = (C317876nz) jwM.A01;
                C347017w8 A002 = C347017w8.A00(r4.A0f, (Resources.Theme) null, (AnonymousClass9V0) null, r4.A0r, r6, (C321086tY) null);
                C39890ADo aDo = new C39890ADo();
                aDo.A0F = false;
                aDo.A06 = new C16338Ut8(17, 0.0f, 0.0f);
                AnonymousClass81W r10 = ((NineSixteenLayoutConfigImpl) r4.A10).A0K;
                aDo.A01((b39.BXs() - 0.5f) * ((float) r10.getWidth()), (b39.BXu() - 0.5f) * ((float) r10.getHeight()));
                aDo.A03 = b39.Bog();
                aDo.A04 = (b39.BpU() * b39.CGW()) / 0.4f;
                aDo.A0B = Integer.valueOf((int) b39.Byr());
                aDo.A09 = Integer.valueOf(Math.min((int) b39.B1g(), A022));
                int i = 1;
                aDo.A0H = true;
                if (r4.A1S()) {
                    i = -2;
                }
                aDo.A05 = i;
                r4.A0y(A002, r6, new C310416b1(aDo), (String) null);
                if (!r4.A1J.A0M()) {
                    C3512087z r1 = r4.A0n;
                    jwM.A00 = r1.A00;
                    r1.A00 = null;
                }
            }
        }
    }

    public static final void A0c(AnonymousClass8ME r45, List list) {
        AnonymousClass91c r6;
        Layout.Alignment alignment;
        C306576Mr r8;
        C306386Ly r5;
        List list2 = list;
        if (list != null && !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList(list2);
            01V.A1D(arrayList, C41289ArU.A00);
            Iterator it = arrayList.iterator();
            0qQ.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                0qQ.A07(next);
                C248923io r7 = (C248923io) next;
                AnonymousClass8ME r4 = r45;
                Context context = r4.A0f;
                UserSession userSession = r4.A0r;
                0qQ.A0B(r7, 0);
                0qQ.A0B(context, 1);
                Editable newEditable = Editable.Factory.getInstance().newEditable(r7.getText());
                C358868bb A012 = C358878bc.A01(r7.C5D().A00, false, false, false, false);
                0qQ.A0A(newEditable);
                AnonymousClass91Z.A00(newEditable, A012);
                C360708f1 r12 = A012.A04;
                AnonymousClass91U.A02(context, newEditable, A012);
                int A002 = A012.A06.A00(context);
                boolean z = true;
                if (r7.isAnimated() != 1 || !C358878bc.A0A().contains(A012.A09)) {
                    r6 = new C306386Ly(context, A002);
                } else {
                    AnonymousClass91c A013 = C39813AAk.A01(context, userSession, A012, A002);
                    A013.EXC(-1, (int) (r7.B1g() - r7.Byr()));
                    r6 = A013;
                }
                ClipsTextAlignment Aah = r7.Aah();
                0qQ.A0B(Aah, 0);
                int[] iArr = A2P.A00;
                int ordinal = Aah.ordinal();
                if (ordinal == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (ordinal != 3) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
                r6.A0K(alignment);
                r6.A0L(newEditable);
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                float B78 = r7.B78();
                RectF rectF = 0nA.A01;
                r6.A0A(TypedValue.applyDimension(1, B78, displayMetrics));
                r6.A0I(AnonymousClass0qo.A00(context).A02(0qm.A0z));
                r6.A09();
                Integer num = AnonymousClass05K.A01;
                r6.A0M = num;
                AnonymousClass91Y.A00((TextView) null, A012, r6);
                C358948bj.A03(newEditable);
                ClipsTextEmphasisMode C56 = r7.C56();
                0qQ.A0B(C56, 0);
                int ordinal2 = C56.ordinal();
                if (ordinal2 == 5) {
                    r8 = C306576Mr.INVERTED;
                } else if (ordinal2 == 1) {
                    r8 = C306576Mr.DEFAULT;
                } else if (ordinal2 == 2) {
                    r8 = C306576Mr.OUTLINED;
                } else if (ordinal2 != 6) {
                    r8 = C306576Mr.DISABLED;
                } else {
                    r8 = C306576Mr.INVERTED_OUTLINED;
                }
                C358948bj.A02(context, r8, r12, r6);
                if (C358948bj.A06(newEditable) || !C358948bj.A05(newEditable) || r12 == null || !(r12 instanceof C360848fF)) {
                    z = false;
                }
                AnonymousClass91S.A01(newEditable, A012, z);
                TextPaint textPaint = r6.A0b;
                0qQ.A07(textPaint);
                AnonymousClass91W.A01(context, textPaint, newEditable, A012);
                int i = 0;
                for (C248643iK r122 : r7.Ap5()) {
                    int count = i + r122.getCount();
                    int A0B2 = 0nH.A0B(r122.getHexRgbaColor(), -16777216);
                    C358838bY.A03(context, newEditable, i, count, A0B2, 0nH.A04(A0B2));
                    i = count;
                }
                r6.A0C(C39815AAm.A00(context, newEditable, A012, r6, textPaint.getTextSize()), C39815AAm.A01(context, newEditable, A012, r6, textPaint.getTextSize()));
                int i2 = AnonymousClass5MH.A0D;
                String obj = UUID.randomUUID().toString();
                0qQ.A07(obj);
                AnonymousClass5MH r82 = new AnonymousClass5MH(context, (Drawable) r6, obj);
                r82.A04 = r7.getId();
                if (r7.B1g() >= r7.Byr() && r7.B1g() > 0.0f) {
                    r82.Eog((int) r7.Byr(), (int) r7.B1g());
                }
                boolean z2 = true;
                float f = C358878bc.A01(r7.C5D().A00, false, false, false, false).A06.A02;
                float BpU = r7.BpU();
                float Bog = r7.Bog();
                if (r7.isAnimated() != 1) {
                    z2 = false;
                }
                AnonymousClass8BG r16 = new AnonymousClass8BG(r7.BXs(), r7.BXu());
                C310416b1 r15 = new C310416b1((AnonymousClass8BH) r16, (AnonymousClass8DA) null, (C3510487j) null, num, (Integer) null, (Integer) null, (Object) "sticky_text_drawable_tag", (String) null, (List) null, -1.0f, f, BpU, -1.0f, Bog, 0, true, false, true, true, false, false, z2, true, true, true, true, true, false, false);
                Drawable drawable = r82.A0A;
                if (A0s(drawable) && 182.A06(0Tu.A05, userSession, 36317874088187517L)) {
                    AnonymousClass869 r1 = r4.A1K;
                    if (drawable instanceof C306386Ly) {
                        r5 = (C306386Ly) drawable;
                    } else {
                        r5 = null;
                    }
                    r1.A01(r5);
                }
                r4.AAQ(r82, r15);
                ((C358368an) r4.A1e.get()).A0b(r82);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.instagram.music.common.model.AudioOverlayTrack} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.instagram.music.common.model.AudioOverlayTrack} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.instagram.music.common.model.AudioOverlayTrack} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.instagram.music.common.model.AudioOverlayTrack} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0d(X.AnonymousClass8ME r8, java.util.List r9) {
        /*
            X.4yO r1 = r8.A05
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r1 == r0) goto L_0x009b
            X.80e r0 = X.C3493880e.A00
            if (r1 == r0) goto L_0x009b
            android.graphics.drawable.Drawable r5 = r8.A11()
            r1 = 0
            if (r5 == 0) goto L_0x009c
            com.instagram.music.common.model.MusicOverlayStickerModel r3 = X.C39809AAg.A00(r5)
            if (r3 == 0) goto L_0x009b
            java.lang.String r7 = r3.A0S
            r6 = 0
            if (r7 == 0) goto L_0x00ab
            java.util.Iterator r4 = r9.iterator()
        L_0x0020:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            java.lang.String r0 = r0.A0A
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0020
            r6 = r2
        L_0x0036:
            com.instagram.music.common.model.AudioOverlayTrack r6 = (com.instagram.music.common.model.AudioOverlayTrack) r6
            if (r6 == 0) goto L_0x00ab
            X.B3d r7 = X.C271404in.A09(r5)
            if (r7 == 0) goto L_0x009b
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r8.A1H
            X.831 r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A00(r0)
            int r4 = r0.A00
            int r8 = r6.A03
            int r0 = r6.A04
            int r8 = r8 - r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            X.A9I r0 = new X.A9I
            r0.<init>(r3)
            r0.A0O = r2
            com.instagram.music.common.model.MusicOverlayStickerModel r3 = r0.A00()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            X.A9I r0 = new X.A9I
            r0.<init>(r3)
            r0.A0K = r2
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = r0.A00()
            X.8IJ r0 = r6.A05
            if (r0 == 0) goto L_0x007d
            com.instagram.api.schemas.AudioFilterType r1 = r0.A04
            com.instagram.api.schemas.AudioFilterInfo r0 = new com.instagram.api.schemas.AudioFilterInfo
            r0.<init>(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r1)
        L_0x007d:
            X.A9I r0 = new X.A9I
            r0.<init>(r2)
            r0.A0o = r1
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.A00()
            r7.DT8(r0)
            boolean r0 = r5 instanceof X.AnonymousClass5MI
            if (r0 == 0) goto L_0x009b
            X.5MI r5 = (X.AnonymousClass5MI) r5
            int r1 = r6.A04
            int r0 = r6.A01
            if (r0 == 0) goto L_0x0098
            r4 = r0
        L_0x0098:
            r5.Eog(r1, r4)
        L_0x009b:
            return
        L_0x009c:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x009b
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r8.A1H
            boolean r0 = r2.A0n()
            if (r0 == 0) goto L_0x00b2
            return
        L_0x00ab:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r8.A1m
            r0.A0S(r5)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r8.A1H
        L_0x00b2:
            X.05G r0 = r2.A0Z
            r0.Epw(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.A0d(X.8ME, java.util.List):void");
    }

    public static final void A0e(AnonymousClass8ME r5, boolean z) {
        AnonymousClass80V r0;
        AnonymousClass80V r02;
        AnonymousClass80V r03;
        AnonymousClass80V r04;
        AnonymousClass80V r05;
        AnonymousClass80V r06;
        AnonymousClass80V r07;
        AnonymousClass80V r08;
        AnonymousClass80V r09;
        AnonymousClass80V r010;
        AnonymousClass80V r011;
        AnonymousClass80V r012;
        AnonymousClass80V r013;
        AnonymousClass80V r014;
        AnonymousClass80V r015;
        AnonymousClass80V r016;
        AnonymousClass80V r017;
        AnonymousClass80V r018;
        AnonymousClass80U r4 = r5.A1B;
        AnonymousClass80V r1 = AnonymousClass80V.PROMPT_STICKER_COMPOSE;
        Class<AnonymousClass8T3> cls = AnonymousClass8T3.class;
        if (z) {
            r0 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r0 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r1, r0, cls);
        AnonymousClass80V r12 = AnonymousClass80V.KARAOKE_STICKER_COMPOSE;
        if (z) {
            r02 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r02 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r12, r02, cls);
        AnonymousClass80V r13 = AnonymousClass80V.POLLING_STICKER_COMPOSE;
        if (z) {
            r03 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r03 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r13, r03, cls);
        Class<AnonymousClass8TY> cls2 = AnonymousClass8TY.class;
        if (z) {
            r04 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r04 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r13, r04, cls2);
        Class<AnonymousClass8TZ> cls3 = AnonymousClass8TZ.class;
        if (z) {
            r05 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r05 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r13, r05, cls3);
        AnonymousClass80V r14 = AnonymousClass80V.QUIZ_STICKER_COMPOSE;
        if (z) {
            r06 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r06 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r14, r06, cls);
        if (z) {
            r07 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r07 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r14, r07, cls2);
        if (z) {
            r08 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r08 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r14, r08, cls3);
        AnonymousClass80V r15 = AnonymousClass80V.SLIDER_STICKER_COMPOSE;
        if (z) {
            r09 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r09 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r15, r09, cls);
        if (z) {
            r010 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r010 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r15, r010, cls2);
        if (z) {
            r011 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r011 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r15, r011, cls3);
        AnonymousClass80V r16 = AnonymousClass80V.CLIPS_PROMPT_STICKER_COMPOSE;
        if (z) {
            r012 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r012 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r16, r012, cls);
        if (z) {
            r013 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r013 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r16, r013, cls2);
        Class<AnonymousClass8SD> cls4 = AnonymousClass8SD.class;
        if (z) {
            r014 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r014 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r16, r014, cls4);
        AnonymousClass80V r17 = AnonymousClass80V.QUESTION_STICKER_COMPOSE;
        if (z) {
            r015 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r015 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r17, r015, cls);
        if (z) {
            r016 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r016 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r17, r016, cls2);
        if (z) {
            r017 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r017 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r17, r017, cls4);
        AnonymousClass80V r18 = AnonymousClass80V.MUSIC_PICK_STICKER_COMPOSE;
        if (z) {
            r018 = AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE;
        } else {
            r018 = AnonymousClass80V.MEDIA_EDIT;
        }
        r4.A7x(r18, r018, cls);
    }

    private final void A0g(PromptStickerModel promptStickerModel) {
        A0Z(this, C59812JZg.class);
        this.A1B.E3H(new AnonymousClass8UU(promptStickerModel));
    }

    private final void A0h(C354798Nk r3) {
        AnonymousClass80U r1;
        Object obj;
        if (r3.A0B.A0L()) {
            r1 = this.A1B;
            obj = new Object();
        } else {
            ((JY9) this.A1L.get()).A0I();
            r1 = this.A1B;
            obj = new Object();
        }
        r1.E3H(obj);
    }

    private final void A0i(C16152Upd upd) {
        List arrayList;
        A0k(C16152Upd.class);
        AnonymousClass80U r5 = this.A1B;
        C19477WaP waP = upd.A0D;
        if (waP != null) {
            arrayList = waP.A06();
        } else {
            arrayList = new ArrayList();
        }
        boolean A0u2 = A0u(this);
        boolean contains = arrayList.contains(QuestionResponseType.MEDIA);
        arrayList.contains(QuestionResponseType.MUSIC);
        r5.E3H(new AnonymousClass8TC(waP, A0u2, contains, !arrayList.isEmpty()));
    }

    private final void A0j(User user) {
        String Amu;
        if (this.A0d && !ABT.A01(this.A1m) && user.A03.Amu() != null && LKR.A01(user)) {
            UserSession userSession = this.A0r;
            C253353qe AYk = AnonymousClass0t1.A01.A01(userSession).A03.AYk();
            if (AYk != null) {
                for (C46322DUz Amv : AYk.B8h()) {
                    if (2Ob.A00(Amv.Amv(), user.getUsername())) {
                        return;
                    }
                }
            }
            if (182.A06(0Tu.A05, userSession, 36317985757271769L) && (Amu = user.A03.Amu()) != null) {
                String id = user.getId();
                LTM.A05(this.A0o, userSession, "STICKER_TRAY", id);
                Context context = this.A0f;
                C39939AKf aKf = new C39939AKf(this, user, id, Amu);
                AKO ako = new AKO(this, id);
                C358248ab r4 = new C358248ab(context);
                r4.A0i(context.getDrawable(R.drawable.ig_illustrations_illo_donations_refresh));
                r4.A09(2131956862);
                r4.A0q(0bC.A01(context.getResources(), new String[]{user.getUsername()}, 2131956859));
                r4.A0J(aKf, 2131956861);
                r4.A0H(ako, 2131956860);
                AnonymousClass0fN.A00(r4.A02());
                this.A0d = false;
            }
        }
    }

    private final void A0k(Class cls) {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1m;
        Iterator it = interactiveDrawableContainer.A0V(cls).iterator();
        while (it.hasNext()) {
            C299875vz r2 = (C299875vz) it.next();
            if (r2.A0A()) {
                this.A0B = interactiveDrawableContainer.A0O(r2);
                UserSession userSession = this.A0r;
                0Tu r4 = 0Tu.A05;
                if (!182.A06(r4, userSession, 36323302926462007L) || ((C16149Upa.class.isAssignableFrom(cls) || C369648v6.class.isAssignableFrom(cls)) && !182.A06(r4, userSession, 36323302926593081L))) {
                    AnonymousClass0eK r0 = this.A1t;
                    r0.getClass();
                    ((C359318cb) r0.get()).A0M(r2);
                    interactiveDrawableContainer.A0S(r2);
                }
            }
        }
    }

    private final void A0l(HashMap hashMap, HashMap hashMap2) {
        if (this.A0X) {
            this.A0X = false;
            UserSession userSession = this.A0r;
            hashMap.put(AnonymousClass000.A00(1919), String.valueOf(182.A06(0Tu.A05, userSession, 36317358692242511L)));
            if (hashMap2.get("initial_price") == null) {
                hashMap2.put("initial_price", "0");
            }
            FragmentActivity requireActivity = this.A0l.requireActivity();
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
            igBloksScreenConfig.A05 = new C384999iE(this);
            C46649DiU A062 = C46649DiU.A06(AnonymousClass000.A00(550), hashMap, hashMap2);
            0qQ.A0A(A062);
            new AnonymousClass6W8(requireActivity, C49891FBs.A00(igBloksScreenConfig, A062), userSession, ModalActivity.class, "bloks").A0C(requireActivity);
        }
    }

    private final void A0m(boolean z) {
        UserSession userSession = this.A0r;
        02m.A0p.markerStart(31789744);
        Bundle bundle = new Bundle();
        bundle.putString(AnonymousClass000.A00(450), "STORY");
        bundle.putBoolean(AnonymousClass000.A00(2311), true);
        bundle.putBoolean(AnonymousClass000.A00(2310), z);
        try {
            C3499482o r2 = this.A13.A02;
            if (r2.A01() == C365758nd.A04) {
                C352218Cl A032 = r2.A01.A03();
                A032.getClass();
                double[] A042 = C379829Vm.A04(new C227922kK(A032.A06()));
                if (A042 != null) {
                    Location location = new Location("media_exif");
                    location.setLatitude(A042[0]);
                    location.setLongitude(A042[1]);
                    bundle.putParcelable(AnonymousClass000.A00(4357), location);
                }
            }
        } catch (IOException e) {
            0KC.A0F("StickerOverlayController", "Failed to read exif location", e);
        }
        AnonymousClass4DH r22 = this.A0l;
        Object A002 = 0mE.A00(r22.getContext(), Activity.class);
        A002.getClass();
        new AnonymousClass6W8((Activity) A002, bundle, userSession, ModalActivity.class, C273654mx.A00(164)).A0D(r22, 2);
    }

    private final void A0n(boolean z) {
        if (z) {
            ((JY9) this.A1L.get()).A0N((String) null);
            return;
        }
        C354438Ma r1 = this.A2K;
        C66309MMs mMs = new C66309MMs(this, 48);
        1NY r2 = new 1NY(r1.A00.A00, -2);
        r2.A05();
        r2.A0A("creatives/avatar_sticker_info/");
        r2.A0Q(CE6.class, C45507Cxh.class);
        1OC A0M2 = r2.A0M();
        A0M2.A00 = new CH7(mMs);
        1ES.A03(A0M2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (r0.A0E == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r0.A0M == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r1 != false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0o() {
        /*
            r4 = this;
            X.AWO r1 = new X.AWO
            r1.<init>(r4)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r4.A1m
            java.util.ArrayList r0 = r0.A0T(r1)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0064
            com.instagram.common.session.UserSession r3 = r4.A0r
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319939967590201(0x8108cb00081f39, double:3.032214511939003E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0066
            X.82p r0 = r4.A13
            X.82o r2 = r0.A02
            X.8nd r1 = r2.A01()
            X.8nd r0 = X.C365758nd.A04
            r3 = 0
            if (r1 != r0) goto L_0x0030
            r3 = 1
        L_0x0030:
            X.82Y r0 = r2.A01
            X.8Cl r0 = r0.A03()
            if (r0 == 0) goto L_0x003d
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A0E
            r2 = 1
            if (r0 != 0) goto L_0x003e
        L_0x003d:
            r2 = 0
        L_0x003e:
            X.84f r0 = r4.A0m
            X.81C r0 = r0.A00
            X.81E r0 = r0.A00()
            X.84i r0 = (X.C3503584i) r0
            X.8sn r0 = r0.AXb()
            if (r0 == 0) goto L_0x0053
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A0M
            r1 = 1
            if (r0 != 0) goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            if (r2 != 0) goto L_0x0059
            r0 = 0
            if (r1 == 0) goto L_0x005a
        L_0x0059:
            r0 = 1
        L_0x005a:
            if (r3 == 0) goto L_0x0066
            if (r0 != 0) goto L_0x0066
            boolean r0 = r4.A1T()
            if (r0 != 0) goto L_0x0066
        L_0x0064:
            r0 = 1
            return r0
        L_0x0066:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.A0o():boolean");
    }

    private final boolean A0p() {
        for (Drawable drawable : this.A1m.getAllDrawables()) {
            if (drawable instanceof AnonymousClass5MH) {
                Drawable drawable2 = ((AnonymousClass5MH) drawable).A0A;
                if ((drawable2 instanceof AnonymousClass9X8) && ((AnonymousClass9X8) drawable2).A0C == C391149sQ.GALLERY_STICKER) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean A0q() {
        Integer num = this.A0D;
        if (num != null) {
            C314446iH r1 = this.A19;
            if (!r1.CJX() || r1.AYe() == this) {
                switch (num.intValue()) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    case 13:
                    case 15:
                        return true;
                    default:
                        return false;
                }
            }
        }
        return false;
    }

    private final boolean A0r() {
        int i;
        AnonymousClass88Z r5 = this.A1A;
        if (!r5.Cb8(C3512188a.A0b)) {
            Context context = this.A0f;
            0qQ.A0B(context, 0);
            C59689JTv.A07(context, 2131967837);
        } else {
            UserSession userSession = this.A0r;
            SoundPlatformProduct soundPlatformProduct = SoundPlatformProduct.IG_MUSIC_OVERLAY_POST_CAPTURE;
            if (C56327Hwe.A01(soundPlatformProduct, userSession)) {
                if (this.A09 == null) {
                    this.A09 = new C55924Hpl();
                }
                String A002 = C56327Hwe.A00(soundPlatformProduct, userSession);
                this.A0H = A002;
                C55924Hpl hpl = this.A09;
                if (hpl != null) {
                    hpl.A00(this.A0f, A002, true);
                    return false;
                }
            } else if (CXt()) {
                return true;
            } else {
                if (!r5.Cb8(C3512188a.A08)) {
                    i = 2131967800;
                } else if (!r5.Cb8(C3512188a.A0Z)) {
                    i = 2131967799;
                } else {
                    i = 0;
                    if (!r5.Cb8(C3512188a.A0l)) {
                        i = 2131973835;
                    }
                    this.A0H = this.A0f.getString(i, new Object[]{Locale.ENGLISH});
                    return false;
                }
                C59689JTv.A07(this.A0f, i);
                this.A0H = this.A0f.getString(i, new Object[]{Locale.ENGLISH});
                return false;
            }
        }
        return false;
    }

    public static final boolean A0s(Drawable drawable) {
        if ((drawable instanceof AnonymousClass91c) || AnonymousClass9SF.A03(drawable)) {
            return true;
        }
        return false;
    }

    public static final boolean A0t(C3512388c r15, AnonymousClass8ME r16, boolean z) {
        for (C3512388c r1 : 0sr.A1P(new C3512388c[]{C3512188a.A0A, C3512188a.A0T, C3512188a.A0R, C3512188a.A0S, C3512188a.A0W, C3512188a.A0C, C3512188a.A0n, C3512188a.A0h, C3512188a.A0K, C3512188a.A0b})) {
            if (r1 != r15) {
                AnonymousClass8ME r5 = r16;
                if (!r5.A1A.Cb8(r1)) {
                    if (z) {
                        Context context = r5.A0f;
                        0qQ.A0B(context, 0);
                        C59689JTv.A07(context, 2131968821);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A0u(AnonymousClass8ME r0) {
        return r0.A0t.A08.A00 instanceof AnonymousClass80N;
    }

    public static final boolean A0w(AnonymousClass8ME r1) {
        if (r1.A0t.A08.A00 instanceof AnonymousClass80O) {
            return true;
        }
        return false;
    }

    public final int A0x(Drawable drawable, AnonymousClass57C r39, MusicOverlayStickerModel musicOverlayStickerModel, C310416b1 r41, Product product, String str, String str2, String str3, String str4, List list) {
        Rect bounds;
        C391619tN A012;
        String str5;
        String str6;
        C279294yP r29;
        JZ7 jz7;
        MusicOverlayStickerModel musicOverlayStickerModel2 = musicOverlayStickerModel;
        Drawable drawable2 = drawable;
        0qQ.A0B(drawable2, 1);
        C310416b1 r6 = r41;
        0qQ.A0B(r6, 2);
        AnonymousClass57C r33 = r39;
        0qQ.A0B(r33, 3);
        boolean z = drawable2 instanceof C386069k0;
        if (z && ((C386069k0) drawable2).A08() == 1iA.A0a.A00) {
            r6.A08 = this.A0x;
        }
        int A013 = A01(drawable2, this, r6, str, str2, str3, list);
        if (drawable2 instanceof C16152Upd) {
            C16152Upd upd = (C16152Upd) drawable2;
            if (upd.A0E()) {
                upd.A0B().A01();
            }
        }
        if (drawable2 instanceof C389559pp) {
            ((C389559pp) drawable2).A08.A01();
        }
        if (z) {
            C386069k0 r10 = (C386069k0) drawable2;
            if (r10.A08() == 1iA.A0a.A00) {
                Drawable drawable3 = r10.A01;
                0qQ.A0C(drawable3, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.VideoStickerDrawable");
                int i = r10.getBounds().left;
                int i2 = r10.getBounds().top;
                int i3 = r10.A04.A01;
                drawable3.setBounds(i, i2 + i3, r10.A02 + r10.getBounds().left, r10.A00 + r10.getBounds().top + i3);
                C3510387i r7 = this.A0x;
                r7.A08 = drawable2;
                Context context = this.A0f;
                Drawable drawable4 = r10.A01;
                drawable4.getClass();
                r7.A0A(context, (AnonymousClass9X8) drawable4, 1.0f, 0.0f, 15000);
                r7.Cwo(AnonymousClass05K.A01, false);
            }
        }
        if (drawable2 instanceof C354808Nl) {
            C354808Nl r72 = (C354808Nl) drawable2;
            PromptStickerModel BTZ = r72.BTZ();
            if (!BTZ.A0A && (!BTZ.A0B ? BTZ.A0L() : !BTZ.A0L())) {
                r72.Euc();
            }
        }
        if ((drawable2 instanceof C354798Nk) && A1V()) {
            C314676if r3 = this.A1L;
            if (r3.A03 && (jz7 = ((JY9) r3.get()).A0B) != null) {
                0fE.A00(jz7, -883493503);
            }
        }
        if (drawable2 instanceof C16149Upa) {
            C16149Upa upa = (C16149Upa) drawable2;
            upa.A05 = true;
            upa.A01 = System.currentTimeMillis();
            upa.invalidateSelf();
        }
        boolean z2 = drawable2 instanceof C347017w8;
        boolean z3 = z2;
        if (z2) {
            C347017w8 r102 = (C347017w8) drawable2;
            r102.A07();
            Class<C389639px> cls = C389639px.class;
            if (r102.A0E(cls) && this.A1B.CZe()) {
                ((C389639px) r102.A06(cls).get(0)).A03.A01();
            }
            if (r102.A04() instanceof C389649py) {
                Drawable A042 = r102.A04();
                0qQ.A0C(A042, "null cannot be cast to non-null type com.instagram.reels.notifyme.view.NotifyMeStickerV2Drawable");
                ((C389649py) A042).A0G.A01();
            }
            ArrayList A062 = r102.A06(C369768vI.class);
            if (!A062.isEmpty()) {
                Iterator it = A062.iterator();
                while (it.hasNext()) {
                    C369768vI r9 = (C369768vI) it.next();
                    r9.A04();
                    if (r9.A0M == C318046oG.AVATAR_STATIC) {
                        if (182.A06(0Tu.A05, this.A0r, 36323204142214143L)) {
                            A0R(r102, r9);
                            r102.A09();
                        }
                    }
                }
            }
        }
        if (drawable2 instanceof C16147UpY) {
            ((C16147UpY) drawable2).A09.A01();
        }
        if ((drawable2 instanceof C389569pq) && this.A1B.CZU()) {
            C389569pq r32 = (C389569pq) drawable2;
            if (r32.A0D) {
                r32.A0B.A01();
            }
        }
        if (drawable2 instanceof C387269lw) {
            C387269lw r2 = (C387269lw) drawable2;
            this.A0x.A09(this.A0f, r2.A02, (AnonymousClass9X8) drawable2, 0.0f, 0.0f, r6.A04, r2.A00, r2.A01, r6.A03, r2.A08, true);
        } else if (drawable2 instanceof AnonymousClass9X8) {
            AnonymousClass9X8 r22 = (AnonymousClass9X8) drawable2;
            float f = r6.A04;
            0qQ.A0B(r22, 0);
            float f2 = (float) r22.getBounds().left;
            float f3 = (float) r22.getBounds().top;
            C376429Hy r11 = r22.A03;
            boolean z4 = r22.A06;
            0qQ.A0B(r11, 4);
            Medium medium = r22.A0B;
            C3510387i r103 = this.A0x;
            float f4 = r103.A04;
            0qQ.A0B(medium, 0);
            C39712A6d a6d = new C39712A6d(medium, f4, 15000, true);
            Context context2 = this.A0f;
            0qQ.A0B(context2, 0);
            r103.A09 = r22;
            C3506485o r62 = r103.A0R;
            if (!r62.A04) {
                r62.A04 = true;
                C3506485o.A00(r62, false);
            }
            r103.Cwo(r62.A01(), false);
            r22.A00 = a6d.A00;
            r22.A05 = r103;
            SimpleVideoLayout simpleVideoLayout = r103.A0T;
            ViewGroup.LayoutParams layoutParams = simpleVideoLayout.getLayoutParams();
            if (layoutParams != null) {
                Rect bounds2 = r22.getBounds();
                0qQ.A07(bounds2);
                int width = bounds2.width();
                int height = bounds2.height();
                layoutParams.width = width;
                layoutParams.height = height;
                simpleVideoLayout.setLayoutParams(layoutParams);
                r103.A02 = f2;
                r103.A03 = f3;
                r103.A00 = 0.0f;
                r103.A01 = 0.0f;
                RoundedCornerFrameLayout roundedCornerFrameLayout = r103.A0U;
                roundedCornerFrameLayout.setX(f2);
                roundedCornerFrameLayout.setY(f3);
                Drawable drawable5 = r103.A08;
                if (!(drawable5 == null || (bounds = drawable5.getBounds()) == null)) {
                    roundedCornerFrameLayout.setPivotX(bounds.exactCenterX() - r103.A02);
                    roundedCornerFrameLayout.setPivotY(bounds.exactCenterY() - r103.A03);
                }
                roundedCornerFrameLayout.setTranslationX(f2 + 0.0f);
                roundedCornerFrameLayout.setTranslationY(f3 + 0.0f);
                roundedCornerFrameLayout.setRotation(0.0f);
                float f5 = f;
                if (z4) {
                    f5 = -f;
                }
                roundedCornerFrameLayout.setScaleX(f5);
                roundedCornerFrameLayout.setScaleY(f);
                roundedCornerFrameLayout.A01(r11.A02, r11.A03, r11.A00, r11.A01);
                roundedCornerFrameLayout.setVisibility(0);
                simpleVideoLayout.setVisibility(0);
                r103.A0G.setVisibility(8);
                r103.A0I.setVisibility(8);
                r103.A0H.setVisibility(8);
                r103.A0P.A03(context2, a6d, simpleVideoLayout);
            }
        }
        if (drawable2 instanceof KWD) {
            C59899JbO A002 = JZM.A00(this.A0r);
            0wc r5 = A002.A04;
            0Aj A003 = r5.A00(r5.A00, AnonymousClass000.A00(302));
            A003.A8M(C62666KkS.BIO_IG_STORY, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A003.AAJ("seller_igid", A002.A05.A06);
            A003.AAJ("event", "seller_view_bio_sticker_created");
            A003.Cgf();
        }
        SparseArray sparseArray = this.A0g;
        C273914nO r73 = (C273914nO) sparseArray.get(A013);
        Product product2 = null;
        if (r73 == null) {
            A012 = null;
            str5 = null;
        } else {
            A012 = AED.A01(r73.A04, r73.A05);
            str5 = r73.A05;
        }
        int i4 = 1;
        if (0qQ.A0K(str5, C318046oG.AI_STICKER.toString())) {
            i4 = 8;
        }
        AnonymousClass80U r34 = this.A1B;
        if (r34.CZU()) {
            C273914nO r23 = (C273914nO) sparseArray.get(A013);
            if (r23 != null) {
                str6 = r23.A00();
            } else {
                str6 = null;
            }
            27r A014 = 27p.A01(this.A0r);
            C59725JVj A132 = A13();
            if (product == null) {
                Drawable drawable6 = drawable2;
                if (z3) {
                    drawable6 = ((C347017w8) drawable6).A04();
                }
                if (drawable6 instanceof C369528uu) {
                    product2 = ((C369528uu) drawable6).A02();
                } else if (drawable6 instanceof C369568uy) {
                    product2 = ((C369568uy) drawable6).A07;
                }
            } else {
                product2 = product;
            }
            if (musicOverlayStickerModel == null) {
                musicOverlayStickerModel2 = C39809AAg.A00(drawable2);
            }
            C2801950r r0 = this.A13.A02.A01.A0g;
            if (r0 == null || r0.ordinal() != 1) {
                r29 = null;
            } else {
                r29 = C279294yP.FEED;
            }
            A014.A0s(r33, r29, A132, A012, musicOverlayStickerModel2, product2, str6, str4, i4);
        }
        r34.E3H(new Object());
        return A013;
    }

    public final Drawable A11() {
        ArrayList A0T2 = this.A1m.A0T(C346977w4.A00);
        0qQ.A0B(A0T2, 0);
        return (Drawable) 00k.A0J(A0T2);
    }

    public final Spannable A12() {
        if (this.A05 != AnonymousClass9QA.A00) {
            return null;
        }
        C314676if r1 = this.A1d;
        if (r1.A03) {
            return ((C61051Jvp) C64876Ljc.A00((C64876Ljc) r1.get()).A08.getValue()).A01;
        }
        return null;
    }

    public final C59725JVj A13() {
        return C59895JbK.A08(this.A0t.A08(), !this.A1B.CZU());
    }

    public final C347017w8 A14() {
        Object obj;
        Iterator it = this.A1m.A0V(C347017w8.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C347017w8) obj).A0E(C369778vJ.class)) {
                break;
            }
        }
        return (C347017w8) obj;
    }

    public final C306386Ly A15() {
        C314676if r1 = this.A1e;
        if (r1.A03) {
            return ((C358368an) r1.get()).A0L;
        }
        return null;
    }

    public final C39890ADo A16() {
        C39890ADo aDo = new C39890ADo();
        aDo.A0F = true;
        aDo.A0H = true;
        aDo.A00 = 1.5f;
        aDo.A01 = 0.25f;
        aDo.A06 = this.A07.Az4();
        aDo.A0P = true;
        aDo.A0C = "StickerOverlayController";
        return aDo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0c48, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0c4a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0c74, code lost:
        if (r3.length() != 0) goto L_0x0c4a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A17() {
        /*
            r70 = this;
            r69 = r70
            r0 = r69
            com.instagram.common.session.UserSession r0 = r0.A0r
            r68 = r0
            r0 = r69
            X.28D r0 = r0.A0k
            r67 = r0
            r0 = r69
            X.8Yz r0 = r0.A0t
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            r66 = r0
            r0 = r69
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r0.A1m
            r65 = r0
            java.util.Set r19 = A0F(r69)
            X.6Ma r0 = X.C306406Ma.A00
            r21 = 2
            r1 = r66
            r0 = r21
            X.0qQ.A0B(r1, r0)
            r20 = 3
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r0 = r65
            java.util.HashMap r0 = r0.A0X(r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r17 = r0.iterator()
        L_0x0044:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x12b0
            java.lang.Object r0 = r17.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r10 = r0.getKey()
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            java.lang.Object r7 = r0.getValue()
            X.8un r7 = (X.C369458un) r7
            r3 = 0
            r4 = 1
            r0 = r20
            X.0qQ.A0B(r10, r0)
            r9 = 4
            X.0qQ.A0B(r7, r9)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            boolean r0 = r10 instanceof X.C347017w8
            r13 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x1286
            r0 = r10
            X.7w8 r0 = (X.C347017w8) r0
            int r0 = r0.A00
            r16 = r0
        L_0x007c:
            X.6Ma r0 = X.C306406Ma.A00
            android.graphics.drawable.Drawable r1 = r0.A0B(r10)
            X.3ui r0 = new X.3ui
            r0.<init>()
            r22 = r1
            r23 = r0
            r24 = r65
            r25 = r7
            r26 = r4
            r27 = r3
            X.C306406Ma.A01(r22, r23, r24, r25, r26, r27)
            boolean r2 = r1 instanceof X.C369468uo
            if (r2 == 0) goto L_0x00d6
            r2 = r1
            X.8uo r2 = (X.C369468uo) r2
            X.6Ly r5 = r2.A07
            android.text.Spannable r3 = r5.A0F
            if (r3 == 0) goto L_0x00de
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Class<X.91P> r2 = X.AnonymousClass91P.class
            java.lang.Object[] r6 = X.C263324Kh.A06(r3, r2)
            X.91P[] r6 = (X.AnonymousClass91P[]) r6
            int r4 = r6.length
            r3 = 0
        L_0x00b2:
            if (r3 >= r4) goto L_0x00bc
            r2 = r6[r3]
            r8.add(r2)
            int r3 = r3 + 1
            goto L_0x00b2
        L_0x00bc:
            java.util.Iterator r4 = r8.iterator()
        L_0x00c0:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x00de
            java.lang.Object r3 = r4.next()
            X.91P r3 = (X.AnonymousClass91P) r3
            r2 = r65
            X.3ui r2 = X.C306406Ma.A00(r3, r5, r2, r7)
            r11.add(r2)
            goto L_0x00c0
        L_0x00d6:
            boolean r2 = r1 instanceof X.C369478up
            if (r2 == 0) goto L_0x00f8
            X.3WT r2 = X.AnonymousClass3WT.MEMORIES
        L_0x00dc:
            r0.A11 = r2
        L_0x00de:
            r11.add(r0)
            boolean r2 = r1 instanceof X.C300645xY
            if (r2 == 0) goto L_0x00f1
            r2 = r16
            r0.A07 = r2
            X.5xY r1 = (X.C300645xY) r1
            java.lang.String r1 = r1.C4F()
            r0.A1k = r1
        L_0x00f1:
            r0 = r18
            r0.addAll(r11)
            goto L_0x0044
        L_0x00f8:
            boolean r5 = r1 instanceof X.C369488uq
            r2 = 0
            if (r5 == 0) goto L_0x0115
            r3 = r1
            X.8uq r3 = (X.C369488uq) r3
            com.instagram.model.venue.Venue r4 = r3.A01
            X.3WT r3 = X.AnonymousClass3WT.LOCATION
            r0.A11 = r3
            if (r4 == 0) goto L_0x0113
            com.instagram.model.venue.LocationDictIntf r3 = r4.A00
            com.instagram.model.venue.LocationDict r3 = r3.FG5()
        L_0x010e:
            r0.A0t = r3
            r0.A1N = r2
            goto L_0x00de
        L_0x0113:
            r3 = 0
            goto L_0x010e
        L_0x0115:
            boolean r5 = r1 instanceof X.C369498ur
            if (r5 == 0) goto L_0x013b
            r7 = r1
            X.6Ly r7 = (X.C306386Ly) r7
            android.text.Spannable r5 = r7.A0F
            int r6 = r5.length()
            r5 = r21
            if (r6 <= r5) goto L_0x00de
            android.text.Spannable r5 = r7.A0F
            java.lang.String r5 = r5.toString()
            java.lang.String r4 = r5.substring(r4)
            X.0qQ.A07(r4)
            com.instagram.model.hashtag.HashtagImpl r4 = X.C281965Ag.A00(r4)
            X.C306406Ma.A08(r4, r0, r2, r3)
            goto L_0x00de
        L_0x013b:
            boolean r5 = r1 instanceof X.C369508us
            if (r5 == 0) goto L_0x0168
            r2 = r1
            X.8us r2 = (X.C369508us) r2
            com.instagram.user.model.User r3 = r2.A00
            if (r3 == 0) goto L_0x00f1
            java.lang.String r4 = r2.A01
            java.lang.String r2 = "mention_sticker_valentines"
            boolean r2 = X.0qQ.A0K(r4, r2)
            if (r2 == 0) goto L_0x015a
            r2 = 3024(0xbd0, float:4.238E-42)
        L_0x0152:
            java.lang.String r2 = X.C273654mx.A00(r2)
        L_0x0156:
            X.C306406Ma.A09(r0, r3, r2)
            goto L_0x00de
        L_0x015a:
            java.lang.String r2 = "mention_sticker_anti_valentines"
            boolean r2 = X.0qQ.A0K(r4, r2)
            if (r2 == 0) goto L_0x0165
            r2 = 3021(0xbcd, float:4.233E-42)
            goto L_0x0152
        L_0x0165:
            java.lang.String r2 = "mention_username"
            goto L_0x0156
        L_0x0168:
            boolean r5 = r1 instanceof X.C369518ut
            if (r5 == 0) goto L_0x0184
            r4 = r1
            X.8ut r4 = (X.C369518ut) r4
            X.9m6 r2 = r4.A01
            com.instagram.user.model.User r3 = r2.A03
            if (r3 == 0) goto L_0x00f1
            r2 = 358(0x166, float:5.02E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.C306406Ma.A09(r0, r3, r2)
            X.A7J r3 = r4.A02
        L_0x0180:
            r0.A15 = r3
            goto L_0x00de
        L_0x0184:
            boolean r5 = r1 instanceof X.C369528uu
            if (r5 == 0) goto L_0x0275
            r5 = r1
            X.8uu r5 = (X.C369528uu) r5
            X.3WT r3 = X.AnonymousClass3WT.PRODUCT
            r0.A11 = r3
            java.lang.String r4 = r5.A03()
            java.util.Map r3 = com.instagram.api.schemas.ProductItemStickerBundleStyle.A01
            java.lang.Object r4 = r3.get(r4)
            com.instagram.api.schemas.ProductItemStickerBundleStyle r4 = (com.instagram.api.schemas.ProductItemStickerBundleStyle) r4
            if (r4 != 0) goto L_0x019f
            com.instagram.api.schemas.ProductItemStickerBundleStyle r4 = com.instagram.api.schemas.ProductItemStickerBundleStyle.UNRECOGNIZED
        L_0x019f:
            com.instagram.api.schemas.StoryProductItemStickerTappableData r3 = new com.instagram.api.schemas.StoryProductItemStickerTappableData
            r3.<init>(r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r3)
            X.C255783ui.A06(r0)
            com.instagram.model.shopping.reels.ProductSticker r4 = r0.A0q
            r4.getClass()
            X.Cwc r3 = new X.Cwc
            r3.<init>(r4)
            r3.A0E = r6
            com.instagram.model.shopping.reels.ProductSticker r3 = r3.A00()
            r0.A0q = r3
            com.instagram.user.model.Product r6 = r5.A02()
            X.C255783ui.A06(r0)
            com.instagram.model.shopping.reels.ProductSticker r3 = r0.A0q
            r3.getClass()
            X.Cwc r4 = new X.Cwc
            r4.<init>(r3)
            com.instagram.user.model.ProductDetailsProductItemDict r3 = r6.A01
            r4.A03 = r3
            com.instagram.model.shopping.reels.ProductSticker r3 = r4.A00()
            r0.A0q = r3
            java.lang.String r6 = r5.A04()
            X.C255783ui.A06(r0)
            com.instagram.model.shopping.reels.ProductSticker r4 = r0.A0q
            r4.getClass()
            X.Cwc r3 = new X.Cwc
            r3.<init>(r4)
            r3.A0A = r6
            com.instagram.model.shopping.reels.ProductSticker r3 = r3.A00()
            r0.A0q = r3
            int r6 = r5.A01()
            X.C255783ui.A06(r0)
            com.instagram.model.shopping.reels.ProductSticker r3 = r0.A0q
            r3.getClass()
            X.Cwc r4 = new X.Cwc
            r4.<init>(r3)
            r3 = -1
            if (r6 == r3) goto L_0x0273
            java.lang.String r3 = X.0nH.A0F(r6)
        L_0x020d:
            r4.A0D = r3
            com.instagram.model.shopping.reels.ProductSticker r3 = r4.A00()
            r0.A0q = r3
            r0.A1N = r2
            boolean r4 = r5.A06()
            X.C255783ui.A06(r0)
            com.instagram.model.shopping.reels.ProductSticker r2 = r0.A0q
            r2.getClass()
            X.Cwc r3 = new X.Cwc
            r3.<init>(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r3.A06 = r2
            com.instagram.model.shopping.reels.ProductSticker r2 = r3.A00()
            r0.A0q = r2
            java.lang.String r4 = X.AES.A01(r5)
            X.C255783ui.A06(r0)
            com.instagram.model.shopping.reels.ProductSticker r3 = r0.A0q
            r3.getClass()
            X.Cwc r2 = new X.Cwc
            r2.<init>(r3)
            r2.A0B = r4
            com.instagram.model.shopping.reels.ProductSticker r2 = r2.A00()
            r0.A0q = r2
            boolean r2 = r5 instanceof X.C41780B0j
            r4 = 0
            if (r2 == 0) goto L_0x025c
            X.B0j r5 = (X.C41780B0j) r5
            X.9q7 r5 = (X.C389739q7) r5
            X.Khv r2 = r5.A00
            if (r2 == 0) goto L_0x025c
            java.lang.String r4 = r2.A00
        L_0x025c:
            X.C255783ui.A06(r0)
            com.instagram.model.shopping.reels.ProductSticker r3 = r0.A0q
            r3.getClass()
            X.Cwc r2 = new X.Cwc
            r2.<init>(r3)
            r2.A07 = r4
            com.instagram.model.shopping.reels.ProductSticker r2 = r2.A00()
            r0.A0q = r2
            goto L_0x00de
        L_0x0273:
            r3 = 0
            goto L_0x020d
        L_0x0275:
            boolean r5 = r1 instanceof X.C369538uv
            if (r5 == 0) goto L_0x02dc
            r4 = r1
            X.8uv r4 = (X.C369538uv) r4
            X.3WT r5 = X.AnonymousClass3WT.MULTI_PRODUCT
            r0.A11 = r5
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r3)
            java.util.List r31 = java.util.Collections.emptyList()
            r5 = r4
            X.9q4 r5 = (X.C389709q4) r5
            java.util.List r3 = r5.A02
            java.util.List r32 = X.C14502TxO.A04(r3)
            java.lang.String r6 = r5.A01
            java.util.Map r3 = com.instagram.api.schemas.ProductItemStickerBundleStyle.A01
            java.lang.Object r6 = r3.get(r6)
            com.instagram.api.schemas.ProductItemStickerBundleStyle r6 = (com.instagram.api.schemas.ProductItemStickerBundleStyle) r6
            if (r6 != 0) goto L_0x029f
            com.instagram.api.schemas.ProductItemStickerBundleStyle r6 = com.instagram.api.schemas.ProductItemStickerBundleStyle.UNRECOGNIZED
        L_0x029f:
            com.instagram.api.schemas.StoryProductItemStickerTappableData r3 = new com.instagram.api.schemas.StoryProductItemStickerTappableData
            r3.<init>(r6)
            java.util.List r33 = java.util.Collections.singletonList(r3)
            X.0qQ.A07(r33)
            X.9Wl r3 = r5.A00
            java.lang.String r5 = r3.A0E
            if (r5 != 0) goto L_0x02b3
            java.lang.String r5 = ""
        L_0x02b3:
            java.lang.String r27 = X.AES.A01(r4)
            com.instagram.api.schemas.TextReviewStatus r4 = com.instagram.api.schemas.TextReviewStatus.APPROVED
            java.lang.String r28 = r4.toString()
            int r4 = r3.A02
            r3 = -1
            if (r4 != r3) goto L_0x02d7
            r30 = 0
        L_0x02c4:
            com.instagram.model.shopping.reels.MultiProductSticker r3 = new com.instagram.model.shopping.reels.MultiProductSticker
            r22 = r3
            r24 = r2
            r25 = r2
            r26 = r5
            r29 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0.A0n = r3
            goto L_0x00de
        L_0x02d7:
            java.lang.String r30 = X.0nH.A0F(r4)
            goto L_0x02c4
        L_0x02dc:
            boolean r5 = r1 instanceof X.C369548uw
            if (r5 == 0) goto L_0x0385
            r12 = r1
            X.8uw r12 = (X.C369548uw) r12
            X.3WT r4 = X.AnonymousClass3WT.PRODUCT_COLLECTION
            r0.A11 = r4
            X.1hu r5 = new X.1hu
            r5.<init>(r2)
            r9 = 6
            X.1E9 r4 = new X.1E9
            r4.<init>(r5, r9, r3)
            X.BIk r4 = new X.BIk
            r22 = r4
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r2
            r27 = r2
            r28 = r2
            r29 = r2
            r30 = r2
            r31 = r2
            r32 = r2
            r33 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            com.instagram.model.shopping.drops.DropsLaunchAnimation r8 = r4.A01
            com.instagram.api.schemas.DropsEventPageNavigationMetadata r7 = r4.A00
            r6 = r12
            X.9q5 r6 = (X.C389719q5) r6
            java.lang.String r5 = r6.A02
            X.BHH r4 = new X.BHH
            r4.<init>(r5)
            java.util.List r5 = java.util.Collections.singletonList(r4)
            X.0qQ.A07(r5)
            com.instagram.user.model.ProductCollection r10 = r6.A01
            java.lang.String r29 = r10.getTitle()
            if (r29 != 0) goto L_0x032e
            java.lang.String r29 = ""
        L_0x032e:
            X.9Wl r4 = r6.A00
            int r6 = r4.A02
            r4 = -1
            if (r6 == r4) goto L_0x0339
            java.lang.String r32 = X.0nH.A0F(r6)
        L_0x0339:
            java.lang.String r30 = X.AES.A01(r12)
            com.instagram.user.model.ProductCollectionImpl r25 = r10.FGp(r2)
            X.1hu r6 = new X.1hu
            r6.<init>(r2)
            X.1E9 r4 = new X.1E9
            r4.<init>(r6, r9, r3)
            if (r8 == 0) goto L_0x0351
            com.instagram.model.shopping.drops.DropsLaunchAnimation r24 = r8.FFR()
        L_0x0351:
            if (r7 == 0) goto L_0x0357
            com.instagram.api.schemas.DropsEventPageNavigationMetadataImpl r23 = r7.F2h()
        L_0x0357:
            r3 = 10
            int r3 = X.0Yv.A1E(r5, r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            java.util.Iterator r5 = r5.iterator()
        L_0x0366:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x037a
            java.lang.Object r3 = r5.next()
            X.DS8 r3 = (X.DS8) r3
            X.BHH r3 = r3.FBE()
            r4.add(r3)
            goto L_0x0366
        L_0x037a:
            X.BIk r3 = new X.BIk
            r22 = r3
            r33 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0498
        L_0x0385:
            boolean r5 = r1 instanceof X.C369558ux
            if (r5 == 0) goto L_0x03c7
            r5 = r1
            X.8ux r5 = (X.C369558ux) r5
            X.3WT r4 = X.AnonymousClass3WT.STOREFRONT
            r0.A11 = r4
            X.1hu r7 = new X.1hu
            r7.<init>(r2)
            r6 = 6
            X.1E9 r4 = new X.1E9
            r4.<init>(r7, r6, r3)
            r4 = r5
            X.9q8 r4 = (X.C389749q8) r4
            com.instagram.user.model.User r7 = r4.A02
            java.lang.String r6 = r4.A03
            X.BHN r3 = new X.BHN
            r3.<init>(r6)
            java.util.List r6 = java.util.Collections.singletonList(r3)
            X.0qQ.A07(r6)
            java.lang.String r5 = X.AES.A01(r5)
            X.9Wl r3 = r4.A01
            int r4 = r3.A02
            r3 = -1
            if (r4 != r3) goto L_0x03c2
            r3 = 0
        L_0x03ba:
            X.BIn r2 = X.C44947Cnh.A00(r7, r2, r5, r3, r6)
        L_0x03be:
            r0.A0r = r2
            goto L_0x00de
        L_0x03c2:
            java.lang.String r3 = X.0nH.A0F(r4)
            goto L_0x03ba
        L_0x03c7:
            boolean r5 = r1 instanceof X.C369568uy
            if (r5 == 0) goto L_0x03fb
            r6 = r1
            X.8uy r6 = (X.C369568uy) r6
            X.3WT r4 = X.AnonymousClass3WT.PRODUCT_SHARE
            r0.A11 = r4
            X.1hu r5 = new X.1hu
            r5.<init>(r2)
            r7 = 6
            X.1E9 r4 = new X.1E9
            r4.<init>(r5, r7, r3)
            com.instagram.user.model.Product r4 = r6.A07
            X.0qQ.A07(r4)
            com.instagram.user.model.ProductDetailsProductItemDict r6 = r4.A01
            r5 = 0
            X.1hu r4 = new X.1hu
            r4.<init>(r2)
            X.1E9 r2 = new X.1E9
            r2.<init>(r4, r7, r3)
            if (r6 == 0) goto L_0x03f2
            r5 = r6
        L_0x03f2:
            X.BIl r2 = new X.BIl
            r2.<init>(r5)
            r0.A0p = r2
            goto L_0x00de
        L_0x03fb:
            boolean r5 = r1 instanceof X.C369578uz
            if (r5 == 0) goto L_0x049c
            r5 = r1
            X.8uz r5 = (X.C369578uz) r5
            X.3WT r4 = X.AnonymousClass3WT.PRODUCT_COLLECTION
            r0.A11 = r4
            java.lang.String r35 = r5.Aoi()
            if (r35 == 0) goto L_0x00de
            java.lang.String r6 = r5.Aov()
            if (r6 == 0) goto L_0x00de
            java.lang.String r8 = r5.BRr()
            r4 = 92
            java.lang.String r9 = X.C273654mx.A00(r4)
            r4 = r21
            X.0qQ.A0B(r8, r4)
            r34 = 0
            X.1hu r5 = new X.1hu
            r5.<init>(r2)
            r10 = 6
            X.1E9 r4 = new X.1E9
            r4.<init>(r5, r10, r3)
            com.instagram.user.model.ProductCollectionImpl r4 = new com.instagram.user.model.ProductCollectionImpl
            r22 = r4
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r2
            r27 = r2
            r28 = r2
            r29 = r2
            r30 = r2
            r31 = r2
            r32 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata r7 = r4.A03
            java.util.List r12 = r4.A09
            com.instagram.api.schemas.ProductCollectionV2Type r31 = X.V81.A00(r6)
            com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus r32 = com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus.APPROVED
            com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl r6 = new com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl
            r6.<init>(r2, r2)
            java.lang.String r29 = ""
            X.1hu r5 = new X.1hu
            r5.<init>(r2)
            X.1E9 r4 = new X.1E9
            r4.<init>(r5, r10, r3)
            if (r7 == 0) goto L_0x046a
            com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl r34 = r7.FFb()
        L_0x046a:
            com.instagram.user.model.ProductCollectionImpl r25 = new com.instagram.user.model.ProductCollectionImpl
            r30 = r25
            r33 = r6
            r36 = r2
            r37 = r29
            r38 = r29
            r39 = r29
            r40 = r12
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            X.BHH r3 = new X.BHH
            r3.<init>(r9)
            java.util.List r33 = java.util.Collections.singletonList(r3)
            X.0qQ.A07(r33)
            X.BIk r3 = new X.BIk
            r22 = r3
            r28 = r8
            r30 = r2
            r31 = r2
            r32 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x0498:
            r0.A0o = r3
            goto L_0x00de
        L_0x049c:
            boolean r5 = r1 instanceof X.C369588v0
            if (r5 == 0) goto L_0x04f0
            r7 = r1
            X.8v2 r7 = (X.C369608v2) r7
            X.3WT r4 = X.AnonymousClass3WT.STOREFRONT
            r0.A11 = r4
            X.1hu r6 = new X.1hu
            r6.<init>(r2)
            r5 = 6
            X.1E9 r4 = new X.1E9
            r4.<init>(r6, r5, r3)
            X.8v0 r7 = (X.C369588v0) r7
            android.os.Parcelable$Creator r4 = com.instagram.user.model.User.CREATOR
            com.instagram.shopping.model.share.ShopShareInfo r6 = r7.A01
            boolean r4 = r6.A08
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r4)
            com.instagram.api.schemas.MerchantCheckoutStyle r22 = com.instagram.api.schemas.MerchantCheckoutStyle.NONE
            java.lang.String r5 = r6.A03
            com.instagram.common.typedurl.ImageUrl r4 = r6.A00
            com.instagram.api.schemas.SellerShoppableFeedType r23 = com.instagram.api.schemas.SellerShoppableFeedType.A06
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = r6.A04
            r24 = r4
            r25 = r2
            r28 = r5
            r29 = r2
            r30 = r3
            com.instagram.user.model.User r5 = X.1aC.A02(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r4 = "storefront_reshare_sticker"
            X.BHN r3 = new X.BHN
            r3.<init>(r4)
            java.util.List r4 = java.util.Collections.singletonList(r3)
            X.0qQ.A07(r4)
            java.lang.String r3 = ""
            X.BIn r2 = X.C44947Cnh.A00(r5, r3, r2, r2, r4)
            goto L_0x03be
        L_0x04f0:
            boolean r5 = r1 instanceof X.C389629pw
            if (r5 == 0) goto L_0x050b
            r3 = r1
            X.9pw r3 = (X.C389629pw) r3
            X.3WT r2 = X.AnonymousClass3WT.COUNTDOWN
            r0.A11 = r2
            X.WaO r2 = r3.A00
            X.BGi r2 = r2.A00
            r0.A0R = r2
            r2 = 572(0x23c, float:8.02E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
        L_0x0507:
            r0.A1k = r2
            goto L_0x00de
        L_0x050b:
            boolean r5 = r1 instanceof X.C369618v3
            if (r5 == 0) goto L_0x051e
            r3 = r1
            X.8v3 r3 = (X.C369618v3) r3
            X.3WT r2 = X.AnonymousClass3WT.FUNDRAISER
            r0.A11 = r2
            X.WaN r2 = r3.A09
            X.8YF r2 = r2.A00
            r0.A0y = r2
            goto L_0x00de
        L_0x051e:
            boolean r5 = r1 instanceof X.C369628v4
            if (r5 == 0) goto L_0x0531
            r3 = r1
            X.8v4 r3 = (X.C369628v4) r3
            X.3WT r2 = X.AnonymousClass3WT.FB_FUNDRAISER
            r0.A11 = r2
            X.8D5 r2 = r3.A01
            java.lang.String r2 = r2.A01
            r0.A1S = r2
            goto L_0x00de
        L_0x0531:
            boolean r5 = r1 instanceof X.C369638v5
            if (r5 == 0) goto L_0x0546
            r3 = r1
            X.8v5 r3 = (X.C369638v5) r3
            X.3WT r2 = X.AnonymousClass3WT.FB_COMMUNITY
            r0.A11 = r2
            X.9lz r2 = r3.A00
            if (r2 == 0) goto L_0x128a
            X.BGm r2 = r2.A00
            r0.A0S = r2
            goto L_0x00de
        L_0x0546:
            boolean r5 = r1 instanceof X.C16147UpY
            if (r5 == 0) goto L_0x055f
            r3 = r1
            X.UpY r3 = (X.C16147UpY) r3
            X.3WT r2 = X.AnonymousClass3WT.SMB_SUPPORT
            r0.A11 = r2
            X.Vuw r2 = r3.A00
            if (r2 != 0) goto L_0x10eb
            java.lang.String r0 = "smbSupportStickerModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x055f:
            boolean r5 = r1 instanceof X.C389529pm
            if (r5 == 0) goto L_0x05fa
            r10 = r1
            X.9pm r10 = (X.C389529pm) r10
            X.3WT r5 = X.AnonymousClass3WT.POLLING
            r0.A11 = r5
            android.content.Context r8 = r10.A0h
            X.6Ly r7 = r10.A0k
            android.text.TextPaint r5 = r7.A0b
            float r5 = r5.getTextSize()
            float r5 = X.0nA.A01(r8, r5)
            java.lang.Float r8 = java.lang.Float.valueOf(r5)
            android.text.Spannable r5 = r7.A0F
            java.lang.String r7 = r5.toString()
            X.4jw r5 = new X.4jw
            r5.<init>(r8, r6, r7)
            java.util.List r39 = java.util.Collections.singletonList(r5)
            X.0qQ.A07(r39)
            X.AnonymousClass7TH.A0K()
            X.4jy r5 = new X.4jy
            r22 = r5
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r2
            r27 = r2
            r28 = r2
            r29 = r2
            r30 = r2
            r31 = r2
            r32 = r2
            r33 = r2
            r34 = r2
            r35 = r2
            r36 = r2
            r37 = r2
            r38 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.Integer r13 = r5.A08
            java.util.List r12 = r5.A0E
            X.3ye r8 = r5.A01
            java.lang.Integer r7 = r5.A09
            java.lang.Boolean r5 = r5.A07
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r10.A0o
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r3)
            java.lang.String r9 = r10.A0m
            if (r9 != 0) goto L_0x05d2
            java.lang.String r9 = ""
        L_0x05d2:
            com.instagram.api.schemas.PollType r24 = com.instagram.api.schemas.PollType.POLL
            X.A6c r3 = r10.A0j
            if (r3 == 0) goto L_0x05f8
            java.lang.String r3 = r3.A03
        L_0x05da:
            java.lang.Boolean r30 = java.lang.Boolean.valueOf(r4)
            r25 = r8
            r28 = r27
            r31 = r5
            r32 = r13
            r33 = r7
            r34 = r6
            r36 = r9
            r37 = r3
            r38 = r12
            X.4jy r2 = X.C44982CoL.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
        L_0x05f4:
            r0.A14 = r2
            goto L_0x00de
        L_0x05f8:
            r3 = 0
            goto L_0x05da
        L_0x05fa:
            boolean r5 = r1 instanceof X.C369648v6
            if (r5 == 0) goto L_0x06a2
            r13 = r1
            X.8v6 r13 = (X.C369648v6) r13
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            X.WaM r9 = r13.A09
            java.util.List r5 = r9.A06
            java.util.Iterator r12 = r5.iterator()
        L_0x060e:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x062c
            java.lang.Object r7 = r12.next()
            X.4jw r7 = (X.C272004jw) r7
            int r5 = r13.A01
            float r5 = (float) r5
            java.lang.Float r8 = java.lang.Float.valueOf(r5)
            java.lang.String r7 = r7.A02
            X.4jw r5 = new X.4jw
            r5.<init>(r8, r6, r7)
            r10.add(r5)
            goto L_0x060e
        L_0x062c:
            X.3WT r5 = X.AnonymousClass3WT.POLLING
            r0.A11 = r5
            X.AnonymousClass7TH.A0K()
            X.4jy r7 = new X.4jy
            r22 = r7
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r2
            r27 = r2
            r28 = r2
            r29 = r2
            r30 = r2
            r31 = r2
            r32 = r2
            r33 = r2
            r34 = r2
            r35 = r2
            r36 = r2
            r37 = r2
            r38 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.Integer r5 = r7.A08
            r30 = r5
            java.util.List r14 = r7.A0E
            X.3ye r12 = r7.A01
            java.lang.Integer r8 = r7.A09
            java.lang.Boolean r7 = r7.A07
            java.lang.String r15 = r9.A02
            java.util.Map r5 = com.instagram.api.schemas.StoryPollColorType.A01
            java.lang.Object r5 = r5.get(r15)
            com.instagram.api.schemas.StoryPollColorType r5 = (com.instagram.api.schemas.StoryPollColorType) r5
            if (r5 != 0) goto L_0x0674
            com.instagram.api.schemas.StoryPollColorType r5 = com.instagram.api.schemas.StoryPollColorType.UNRECOGNIZED
        L_0x0674:
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r4)
            boolean r3 = r13.A0B
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = r9.A03
            com.instagram.api.schemas.PollType r22 = com.instagram.api.schemas.PollType.POLL
            java.lang.String r4 = r9.A04
            r23 = r12
            r24 = r5
            r28 = r26
            r29 = r7
            r31 = r8
            r32 = r6
            r34 = r3
            r35 = r4
            r36 = r14
            r37 = r10
            X.4jy r2 = X.C44982CoL.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x05f4
        L_0x06a2:
            boolean r5 = r1 instanceof X.C16152Upd
            if (r5 == 0) goto L_0x06c4
            r4 = r1
            X.Upd r4 = (X.C16152Upd) r4
            X.3WT r3 = X.AnonymousClass3WT.QUESTION
            r0.A11 = r3
            X.WaP r4 = r4.A0D
            if (r4 == 0) goto L_0x00de
            java.lang.String r3 = r4.A05()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x06be
            r4.A07(r2)
        L_0x06be:
            X.UNR r2 = r4.A00
            r0.A0O = r2
            goto L_0x00de
        L_0x06c4:
            boolean r5 = r1 instanceof X.C369658v7
            if (r5 == 0) goto L_0x06d5
            r3 = r1
            X.8v7 r3 = (X.C369658v7) r3
            X.3WT r2 = X.AnonymousClass3WT.INSTAPAL
            r0.A11 = r2
            X.LwM r2 = r3.A03
            r0.A0z = r2
            goto L_0x00de
        L_0x06d5:
            boolean r5 = r1 instanceof X.C354808Nl
            if (r5 == 0) goto L_0x06f5
            r2 = r1
            X.8Nl r2 = (X.C354808Nl) r2
            com.instagram.reels.prompt.model.PromptStickerModel r3 = r2.BTZ()
            boolean r2 = r3.A0H()
            if (r2 == 0) goto L_0x06f2
            X.3WT r2 = X.AnonymousClass3WT.CLIPS_PROMPT
        L_0x06e8:
            r0.A11 = r2
            com.instagram.api.schemas.StoryPromptTappableData r2 = r3.A02()
            r0.A0Z = r2
            goto L_0x00de
        L_0x06f2:
            X.3WT r2 = X.AnonymousClass3WT.PROMPT
            goto L_0x06e8
        L_0x06f5:
            boolean r5 = r1 instanceof X.C389539pn
            if (r5 == 0) goto L_0x0708
            r3 = r1
            X.9pn r3 = (X.C389539pn) r3
            X.3WT r2 = X.AnonymousClass3WT.BEFORE_AND_AFTER
            r0.A11 = r2
            X.Aef r2 = r3.A03
            com.instagram.api.schemas.StoryThenAndNowStickerDict r2 = r2.A00
            r0.A0d = r2
            goto L_0x00de
        L_0x0708:
            boolean r5 = r1 instanceof X.C389639px
            if (r5 == 0) goto L_0x0721
            r2 = r1
            X.9px r2 = (X.C389639px) r2
            X.9m3 r3 = r2.A04
            X.3WT r2 = X.AnonymousClass3WT.GROUP_MENTION
            r0.A11 = r2
            com.instagram.api.schemas.StoryGroupMentionTappableData r2 = r3.A00()
            r0.A0V = r2
            java.lang.String r2 = r3.A02
            r0.A1V = r2
            goto L_0x00de
        L_0x0721:
            boolean r5 = r1 instanceof X.C369668v8
            if (r5 == 0) goto L_0x073d
            r3 = r1
            X.8v8 r3 = (X.C369668v8) r3
            r2 = r66
            boolean r2 = r2 instanceof X.AnonymousClass80O
            if (r2 == 0) goto L_0x073a
            X.3WT r2 = X.AnonymousClass3WT.CLIPS_JOIN_CHAT
        L_0x0730:
            r0.A11 = r2
            X.WaH r2 = r3.A03
            X.UOB r2 = r2.A00
            r0.A0x = r2
            goto L_0x00de
        L_0x073a:
            X.3WT r2 = X.AnonymousClass3WT.JOIN_CHAT
            goto L_0x0730
        L_0x073d:
            boolean r5 = r1 instanceof X.C369678v9
            if (r5 == 0) goto L_0x074e
            r3 = r1
            X.8v9 r3 = (X.C369678v9) r3
            X.3WT r2 = X.AnonymousClass3WT.CHALLENGE_CHAT
            r0.A11 = r2
            X.LwN r2 = r3.A08
            r0.A0w = r2
            goto L_0x00de
        L_0x074e:
            boolean r5 = r1 instanceof X.C369688vA
            if (r5 == 0) goto L_0x075f
            r2 = r1
            X.8vA r2 = (X.C369688vA) r2
            X.Jvb r3 = r2.A01
        L_0x0757:
            X.3WT r2 = X.AnonymousClass3WT.PROMPT_V2_SHAREABLE
            r0.A11 = r2
            r0.A0B = r3
            goto L_0x00de
        L_0x075f:
            boolean r5 = r1 instanceof X.C369698vB
            if (r5 == 0) goto L_0x0769
            r2 = r1
            X.8vB r2 = (X.C369698vB) r2
            X.Jvb r3 = r2.A06
            goto L_0x0757
        L_0x0769:
            boolean r5 = r1 instanceof X.C369708vC
            if (r5 == 0) goto L_0x077a
            r2 = r1
            X.8vC r2 = (X.C369708vC) r2
            java.lang.Integer r3 = r2.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r3 != r2) goto L_0x00f1
            X.3WT r2 = X.AnonymousClass3WT.ROLL_CALL_FIRST_TAKE
            goto L_0x00dc
        L_0x077a:
            boolean r5 = r1 instanceof X.C369718vD
            if (r5 == 0) goto L_0x0789
            r3 = r1
            X.8vD r3 = (X.C369718vD) r3
            X.3WT r2 = X.AnonymousClass3WT.WHATSAPP_STICKER
            r0.A11 = r2
            java.lang.String r2 = r3.A0K
            goto L_0x0507
        L_0x0789:
            boolean r5 = r1 instanceof X.C369728vE
            if (r5 == 0) goto L_0x07a5
            X.3WT r2 = X.AnonymousClass3WT.BLOKS_TAPPABLE
            r0.A11 = r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2 = 2456(0x998, float:3.442E-42)
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.DDv r4 = new X.DDv
            r4.<init>(r2, r3)
        L_0x07a1:
            r0.A1F = r4
            goto L_0x00de
        L_0x07a5:
            boolean r5 = r1 instanceof X.C386069k0
            if (r5 != 0) goto L_0x10d3
            boolean r5 = r1 instanceof X.C369738vF
            if (r5 != 0) goto L_0x10d3
            boolean r5 = r1 instanceof X.C16149Upa
            if (r5 == 0) goto L_0x07d4
            r3 = r1
            X.Upa r3 = (X.C16149Upa) r3
            X.3WT r2 = X.AnonymousClass3WT.QUIZ
            r0.A11 = r2
            java.lang.String r2 = "quiz_story_sticker_default"
            r0.A1k = r2
            X.WaJ r3 = r3.A0H
            if (r3 == 0) goto L_0x00de
            java.lang.String r2 = r3.A01
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x07ce
            X.UNZ r2 = r3.A02
            java.lang.String r2 = r2.A04
            r3.A01 = r2
        L_0x07ce:
            X.UNZ r2 = r3.A02
            r0.A0a = r2
            goto L_0x00de
        L_0x07d4:
            boolean r5 = r1 instanceof X.C16145UpW
            if (r5 == 0) goto L_0x07e7
            r3 = r1
            X.UpW r3 = (X.C16145UpW) r3
            X.3WT r2 = X.AnonymousClass3WT.SLIDER
            r0.A11 = r2
            X.WaK r2 = r3.A0B
            X.BHJ r2 = r2.A00
            r0.A0b = r2
            goto L_0x00de
        L_0x07e7:
            boolean r5 = r1 instanceof X.C346997w6
            if (r5 == 0) goto L_0x0842
            r5 = r1
            X.7w6 r5 = (X.C346997w6) r5
            com.instagram.reels.musicpick.model.MusicPickStickerModel r6 = r5.A01
            java.lang.String r5 = r6.A02
            if (r5 == 0) goto L_0x07ff
            int r5 = r5.length()
            if (r5 == 0) goto L_0x07ff
            r27 = r4
            X.C306406Ma.A01(r22, r23, r24, r25, r26, r27)
        L_0x07ff:
            X.3WT r4 = X.AnonymousClass3WT.MUSIC_PICK_STICKER
            r0.A11 = r4
            com.instagram.api.schemas.StoryMusicPickTappableData r7 = r6.A00
            r0.A0X = r7
            com.instagram.api.schemas.TrackData r6 = r7.A04
            if (r6 != 0) goto L_0x080f
            com.instagram.api.schemas.OriginalSoundData r4 = r7.A01
            if (r4 == 0) goto L_0x00de
        L_0x080f:
            com.instagram.api.schemas.MusicProduct r5 = com.instagram.api.schemas.MusicProduct.UNSET
            if (r6 == 0) goto L_0x083b
            com.instagram.music.common.model.MusicAssetModel r6 = com.instagram.music.common.model.MusicAssetModel.A01(r6, r3)
        L_0x0817:
            X.0qQ.A0A(r6)
            r3 = 15000(0x3a98, float:2.102E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = ""
            com.instagram.music.common.model.MusicOverlayStickerModel r6 = X.C59670JTa.A04(r5, r6, r4, r3)
            X.3ui r5 = new X.3ui
            r5.<init>()
            X.6KJ r3 = X.AnonymousClass6KJ.HIDDEN
            java.lang.String r4 = r3.toString()
            r3 = r68
            X.C306406Ma.A05(r3, r6, r5, r4, r2)
        L_0x0836:
            r11.add(r5)
            goto L_0x00de
        L_0x083b:
            com.instagram.api.schemas.OriginalSoundData r4 = r7.A01
            com.instagram.music.common.model.MusicAssetModel r6 = com.instagram.music.common.model.MusicAssetModel.A00(r4, r3)
            goto L_0x0817
        L_0x0842:
            r24 = r2
            boolean r5 = r1 instanceof X.B3d
            if (r5 == 0) goto L_0x08c0
            r9 = r1
            X.B3d r9 = (X.B3d) r9
            if (r19 == 0) goto L_0x085f
            int r3 = r7.A08
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r3 = r19
            boolean r3 = r3.contains(r5)
            if (r3 != r4) goto L_0x085f
            java.lang.String r3 = r7.A0C
            r0.A1l = r3
        L_0x085f:
            int r10 = r9.Aox()
            X.0Tu r8 = X.0Tu.A05
            r5 = 36319939968376645(0x8108cb00141f45, double:3.032214512436353E-306)
            r3 = r68
            boolean r3 = X.182.A06(r8, r3, r5)
            if (r3 == 0) goto L_0x08bb
            java.lang.String r3 = X.0nH.A0G(r10)
        L_0x0876:
            r0.A1P = r3
            boolean r3 = r1 instanceof X.AnonymousClass9XK
            if (r3 == 0) goto L_0x10f1
            X.3WT r2 = X.AnonymousClass3WT.MUSIC_LYRICS
            r0.A11 = r2
            X.6KJ r2 = r9.BV4()
            java.lang.String r2 = r2.A02
            r0.A1g = r2
            com.instagram.music.common.model.MusicOverlayStickerModel r6 = r9.BUu()
            X.9XK r9 = (X.AnonymousClass9XK) r9
            java.lang.String r8 = r9.C4F()
            X.3ui r3 = new X.3ui
            r3.<init>()
            X.6KJ r2 = X.AnonymousClass6KJ.HIDDEN
            java.lang.String r5 = r2.toString()
            r2 = r68
            X.C306406Ma.A05(r2, r6, r3, r5, r8)
            r11.add(r3)
            if (r19 == 0) goto L_0x00de
            int r2 = r7.A08
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r2 = r19
            boolean r2 = r2.contains(r5)
            if (r2 != r4) goto L_0x00de
            java.lang.String r2 = r7.A0C
            r3.A1l = r2
            goto L_0x00de
        L_0x08bb:
            java.lang.String r3 = X.0nH.A0E(r10)
            goto L_0x0876
        L_0x08c0:
            boolean r5 = r1 instanceof X.C369748vG
            if (r5 != 0) goto L_0x1279
            boolean r5 = r1 instanceof X.C369758vH
            if (r5 == 0) goto L_0x08dc
            r2 = r1
            X.8vH r2 = (X.C369758vH) r2
            java.lang.String r4 = r2.getFundraiserId()
            com.instagram.model.fundraiser.NewFundraiserInfo r3 = r2.BVw()
            java.lang.String r2 = r2.AsL()
            X.C306406Ma.A07(r3, r0, r4, r2)
            goto L_0x00de
        L_0x08dc:
            boolean r5 = r1 instanceof X.C321016tR
            if (r5 == 0) goto L_0x08f6
            r13 = r1
            X.6tR r13 = (X.C321016tR) r13
            X.6oG r5 = r13.A0d
            X.6oG r3 = X.C318046oG.BLOKS_ANIMATED
            if (r5 != r3) goto L_0x117f
            X.3WT r3 = X.AnonymousClass3WT.BLOKS_TAPPABLE
            r0.A11 = r3
            java.lang.String r3 = r13.A0C
            X.DDv r4 = new X.DDv
            r4.<init>(r2, r2, r3)
            goto L_0x07a1
        L_0x08f6:
            boolean r5 = r1 instanceof X.C369768vI
            if (r5 == 0) goto L_0x0915
            r8 = r1
            X.8vI r8 = (X.C369768vI) r8
            X.6o8 r12 = r8.A0L
            com.instagram.model.hashtag.HashtagImpl r6 = r12.A0J
            com.instagram.model.venue.LocationDict r5 = r12.A0K
            if (r5 == 0) goto L_0x106a
            java.lang.String r3 = r12.A0N
            X.3WT r2 = X.AnonymousClass3WT.LOCATION
            r0.A11 = r2
            com.instagram.model.venue.LocationDict r2 = r5.FG5()
            r0.A0t = r2
            r0.A1N = r3
            goto L_0x00de
        L_0x0915:
            boolean r5 = r1 instanceof X.C369778vJ
            if (r5 == 0) goto L_0x0971
            r13 = r1
            X.8vJ r13 = (X.C369778vJ) r13
            X.UkT r12 = r13.A0c
            java.lang.String r10 = r12.A0E
            java.lang.String r9 = r12.A07
            java.lang.String r8 = r12.A0F
            com.instagram.model.mediatype.ProductType r6 = r13.A0e
            java.lang.String r5 = r12.A0A
            r0.A1a = r10
            if (r9 == 0) goto L_0x092e
            r0.A1O = r9
        L_0x092e:
            r0.A1b = r8
            r0.A0m = r6
            if (r5 == 0) goto L_0x096a
            X.3WT r6 = X.AnonymousClass3WT.UPCOMING_EVENT
            r0.A11 = r6
            r0.A1m = r5
            java.lang.String r5 = "upcoming_event_feed_reshare"
            r0.A1g = r5
        L_0x093e:
            X.9XA r6 = r13.A06
            if (r6 == 0) goto L_0x00de
            boolean r5 = r13.A07()
            if (r5 == 0) goto L_0x00de
            java.lang.String r8 = r12.A0D
            X.3ui r5 = new X.3ui
            r5.<init>()
            r22 = r6
            r23 = r5
            r24 = r65
            X.C306406Ma.A01(r22, r23, r24, r25, r26, r27)
            X.C306406Ma.A07(r2, r5, r8, r2)
        L_0x095b:
            int r3 = r7.A09
            r2 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r2
            int r2 = r7.A0B
            int r3 = r3 + r2
            int r2 = r3 + 1
            r5.A09 = r2
            goto L_0x0836
        L_0x096a:
            X.3WT r5 = X.AnonymousClass3WT.MEDIA
            r0.A11 = r5
            r0.A12 = r2
            goto L_0x093e
        L_0x0971:
            boolean r5 = r1 instanceof X.C369798vL
            if (r5 == 0) goto L_0x09af
            r10 = r1
            X.8vL r10 = (X.C369798vL) r10
            java.lang.String r9 = r10.A07
            com.instagram.user.model.User r8 = r10.A06
            java.lang.String r5 = r8.getId()
            com.instagram.model.mediatype.ProductType r6 = com.instagram.model.mediatype.ProductType.IGTV
            r0.A1a = r9
            r0.A1b = r5
            r0.A0m = r6
            X.3WT r5 = X.AnonymousClass3WT.MEDIA
            r0.A11 = r5
            r0.A12 = r2
            X.9XA r2 = r10.A01
            if (r2 == 0) goto L_0x00de
            java.lang.String r8 = r8.getId()
            X.3ui r5 = new X.3ui
            r5.<init>()
            r22 = r2
            r23 = r5
            r24 = r65
            X.C306406Ma.A01(r22, r23, r24, r25, r26, r27)
            r5.A1a = r9
            r5.A1b = r8
            r5.A0m = r6
        L_0x09aa:
            X.3WT r2 = X.AnonymousClass3WT.RESHARE_VIEW_SHOP_CTA
            r5.A11 = r2
            goto L_0x095b
        L_0x09af:
            boolean r5 = r1 instanceof X.C369808vM
            if (r5 == 0) goto L_0x09d0
            r3 = r1
            X.8vM r3 = (X.C369808vM) r3
            X.8vL r3 = r3.A01
            java.lang.String r5 = r3.A07
            com.instagram.user.model.User r3 = r3.A06
            java.lang.String r4 = r3.getId()
            com.instagram.model.mediatype.ProductType r3 = com.instagram.model.mediatype.ProductType.IGTV
            r0.A1a = r5
            r0.A1b = r4
            r0.A0m = r3
            X.3WT r3 = X.AnonymousClass3WT.MEDIA
            r0.A11 = r3
            r0.A12 = r2
            goto L_0x00de
        L_0x09d0:
            boolean r5 = r1 instanceof X.C369818vN
            if (r5 == 0) goto L_0x0a14
            r9 = r1
            X.8vN r9 = (X.C369818vN) r9
            java.lang.String r8 = r9.A06
            com.instagram.user.model.User r5 = r9.A01
            java.lang.String r6 = r5.getId()
            com.instagram.model.mediatype.ProductType r5 = r9.A00
            r0.A1a = r8
            r0.A1b = r6
            r0.A0m = r5
            X.3WT r5 = X.AnonymousClass3WT.MEDIA
            r0.A11 = r5
            r0.A12 = r2
            X.9XA r6 = r9.A00
            if (r6 == 0) goto L_0x00de
            boolean r5 = r9.A00()
            if (r5 == 0) goto L_0x00de
            X.1Xj r5 = r9.A05
            if (r5 == 0) goto L_0x0a12
            java.lang.String r8 = r5.A2w()
        L_0x09ff:
            X.3ui r5 = new X.3ui
            r5.<init>()
            r22 = r6
            r23 = r5
            r24 = r65
            X.C306406Ma.A01(r22, r23, r24, r25, r26, r27)
            X.C306406Ma.A07(r2, r5, r8, r2)
            goto L_0x095b
        L_0x0a12:
            r8 = r2
            goto L_0x09ff
        L_0x0a14:
            boolean r5 = r1 instanceof X.C369838vP
            if (r5 == 0) goto L_0x0ae5
            r4 = r1
            X.8vP r4 = (X.C369838vP) r4
            X.9ne r10 = r4.A01
            X.0Tu r8 = X.0Tu.A05
            r4 = 36323225617116168(0x810bc800012c08, double:3.034292369929473E-306)
            r7 = r68
            boolean r4 = X.182.A06(r8, r7, r4)
            if (r4 == 0) goto L_0x11fe
            X.9sJ r4 = X.C391079sJ.UNDEFINED
            X.ADJ r9 = new X.ADJ
            r9.<init>(r4, r2)
            float r4 = r0.A03
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r9.A09 = r4
            float r4 = r0.A04
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r9.A0A = r4
            int r4 = r0.A09
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9.A0F = r4
            float r4 = r0.A02
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r9.A08 = r4
            float r4 = r0.A00
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r9.A06 = r4
            float r4 = r0.A01
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r9.A07 = r4
            X.9sJ r4 = X.C391079sJ.VIDEO
            X.0qQ.A0B(r4, r3)
            r9.A00 = r4
            com.instagram.model.mediatype.ProductType r3 = com.instagram.model.mediatype.ProductType.CLIPS
            java.lang.String r3 = r3.A00
            r9.A0J = r3
            r9.A0D = r6
            java.lang.String r8 = r10.A0A
            r9.A0H = r8
            r9.A0B = r6
            java.lang.String r3 = r10.C4F()
            r9.A0M = r3
            r9.A0C = r6
            java.lang.String r3 = r0.A1O
            r9.A0G = r3
            r9.A0E = r6
            int r3 = r10.getDurationInMs()
            float r4 = (float) r3
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r3
            java.lang.Float r3 = java.lang.Float.valueOf(r4)
            r9.A05 = r3
            X.3WT r7 = X.AnonymousClass3WT.MEDIA
            java.lang.String r3 = r7.A00
            r9.A0L = r3
            r9.A0K = r8
            boolean r3 = r10.A04
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r9.A03 = r3
            android.content.Context r3 = r65.getContext()
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r4 = r3.getDisplayMetrics()
            X.0qQ.A07(r4)
            int r3 = r4.widthPixels
            float r3 = (float) r3
            float r4 = r4.density
            float r3 = r3 / r4
            float r4 = r0.A02
            java.lang.Float r6 = java.lang.Float.valueOf(r4)
            float r4 = r0.A00
            java.lang.Float r5 = java.lang.Float.valueOf(r4)
            int r3 = (int) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            X.AD7 r3 = new X.AD7
            r3.<init>(r6, r5, r4, r2)
            r9.A01 = r3
            com.instagram.user.model.User r2 = r10.A03
            java.lang.String r3 = r2.getId()
            com.instagram.model.mediatype.ProductType r2 = r10.A00
            r0.A1a = r8
            r0.A1b = r3
            r0.A0m = r2
            r0.A11 = r7
            r0.A12 = r9
            goto L_0x00de
        L_0x0ae5:
            boolean r5 = r1 instanceof X.C369848vQ
            java.lang.String r8 = "reel_mention_post"
            if (r5 == 0) goto L_0x0b3c
            r12 = r1
            X.8vQ r12 = (X.C369848vQ) r12
            X.3WT r5 = X.AnonymousClass3WT.MENTION_RESHARE
            r0.A11 = r5
            com.instagram.user.model.User r10 = r12.A04
            r0.A1B = r10
            java.lang.String r9 = r12.A05
            r0.A1a = r9
            java.lang.String r5 = "mention_reshare"
            r0.A1g = r5
            X.28D r6 = X.28D.A2V
            r5 = r67
            if (r5 != r6) goto L_0x0b18
            X.1Av r5 = X.1Au.A00(r68)
            boolean r5 = r5.A20()
            if (r5 == 0) goto L_0x0b36
            java.lang.String r5 = "reel_mention_post_fullscreen_photo"
            r12.A00 = r5
            r1.setVisible(r3, r3)
            r13 = 1
        L_0x0b16:
            r16 = r13
        L_0x0b18:
            X.9XA r6 = r12.A03
            if (r6 == 0) goto L_0x00de
            java.lang.String r8 = r10.getId()
            X.3ui r5 = new X.3ui
            r5.<init>()
            r22 = r6
            r23 = r5
            r24 = r65
            X.C306406Ma.A01(r22, r23, r24, r25, r26, r27)
            r5.A1a = r9
            r5.A1b = r8
            r5.A0m = r2
            goto L_0x09aa
        L_0x0b36:
            r12.A00 = r8
            r1.setVisible(r4, r3)
            goto L_0x0b16
        L_0x0b3c:
            boolean r5 = r1 instanceof X.C369858vR
            if (r5 == 0) goto L_0x0b47
            r3 = r1
            X.8vR r3 = (X.C369858vR) r3
            com.instagram.user.model.User r3 = r3.A01
            goto L_0x0156
        L_0x0b47:
            boolean r5 = r1 instanceof X.C369868vS
            if (r5 == 0) goto L_0x0b6d
            X.8vS r1 = (X.C369868vS) r1
            X.6Ly r3 = r1.A00
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.text.Spannable r1 = r3.A0F
            X.0qQ.A07(r1)
            java.lang.Class<X.91P> r0 = X.AnonymousClass91P.class
            java.lang.Object[] r4 = X.C263324Kh.A06(r1, r0)
            X.91P[] r4 = (X.AnonymousClass91P[]) r4
            int r2 = r4.length
            r1 = 0
        L_0x0b63:
            if (r1 >= r2) goto L_0x1216
            r0 = r4[r1]
            r5.add(r0)
            int r1 = r1 + 1
            goto L_0x0b63
        L_0x0b6d:
            boolean r5 = r1 instanceof X.C369878vT
            if (r5 == 0) goto L_0x0b9e
            r2 = r1
            X.8vT r2 = (X.C369878vT) r2
            X.8vQ r3 = r2.Bgf()
            if (r3 == 0) goto L_0x00de
            X.3WT r2 = X.AnonymousClass3WT.MENTION_RESHARE
            r0.A11 = r2
            com.instagram.user.model.User r2 = r3.A04
            r0.A1B = r2
            java.lang.String r2 = r3.A05
            r0.A1a = r2
            java.lang.String r2 = "mention_reshare"
            r0.A1g = r2
            X.28D r3 = X.28D.A2V
            r2 = r67
            if (r2 == r3) goto L_0x0b9a
            X.28D r3 = X.28D.A4u
            if (r2 == r3) goto L_0x0b98
            X.28D r3 = X.28D.A2W
            if (r2 != r3) goto L_0x00de
        L_0x0b98:
            java.lang.String r8 = "remix_reply_post"
        L_0x0b9a:
            r0.A1k = r8
            goto L_0x00de
        L_0x0b9e:
            boolean r5 = r1 instanceof X.C369948va
            if (r5 == 0) goto L_0x0bc5
            r2 = r1
            X.8va r2 = (X.C369948va) r2
            X.A6i r4 = r2.Bla()
            if (r4 == 0) goto L_0x00f1
            java.lang.String r5 = r4.A03
            X.9Tg r3 = r4.A01
            X.9Tg r2 = X.C379289Tg.STORY
            if (r3 != r2) goto L_0x1230
            X.3WT r2 = X.AnonymousClass3WT.MENTION_RESHARE
            r0.A11 = r2
            com.instagram.user.model.User r2 = r4.A02
            r0.A1B = r2
            r0.A1a = r5
            java.lang.String r2 = "mention_reshare"
            r0.A1g = r2
            java.lang.String r2 = r4.A00
            goto L_0x0507
        L_0x0bc5:
            boolean r5 = r1 instanceof X.C299335ux
            if (r5 == 0) goto L_0x0be4
            r3 = r1
            X.5ux r3 = (X.C299335ux) r3
            X.3WT r2 = X.AnonymousClass3WT.UPCOMING_EVENT
            r0.A11 = r2
            X.5uw r3 = (X.C299325uw) r3
            com.instagram.user.model.UpcomingEvent r2 = r3.A05
            java.lang.String r2 = r2.getId()
            r0.A1m = r2
            r2 = 3457(0xd81, float:4.844E-42)
            java.lang.String r2 = X.C273654mx.A00(r2)
            r0.A1g = r2
            goto L_0x00de
        L_0x0be4:
            boolean r5 = r1 instanceof X.C389969qW
            if (r5 == 0) goto L_0x0bef
            X.3WT r2 = X.AnonymousClass3WT.INTERNAL
            r0.A11 = r2
            java.lang.String r8 = "internal_sticker"
            goto L_0x0b9a
        L_0x0bef:
            boolean r5 = r1 instanceof X.C306386Ly
            if (r5 == 0) goto L_0x0c13
            X.6Ly r1 = (X.C306386Ly) r1
            android.text.Spannable r2 = r1.A0F
            X.0qQ.A07(r2)
            java.lang.Class<X.91P> r0 = X.AnonymousClass91P.class
            java.lang.Object[] r5 = X.C263324Kh.A06(r2, r0)
            X.91P[] r5 = (X.AnonymousClass91P[]) r5
            int r4 = r5.length
        L_0x0c03:
            if (r3 >= r4) goto L_0x00f1
            r2 = r5[r3]
            r0 = r65
            X.3ui r0 = X.C306406Ma.A00(r2, r1, r0, r7)
            r11.add(r0)
            int r3 = r3 + 1
            goto L_0x0c03
        L_0x0c13:
            boolean r5 = r1 instanceof X.C389569pq
            if (r5 == 0) goto L_0x0c51
            r5 = r1
            X.9pq r5 = (X.C389569pq) r5
            X.3WT r2 = X.AnonymousClass3WT.MENTION
            r0.A11 = r2
            com.instagram.reels.smb.model.ProfileStickerModel r6 = r5.A0C
            com.instagram.user.model.User r2 = r6.A03
            r0.A1B = r2
            java.lang.Integer r7 = r6.A05
            int r2 = r7.intValue()
            if (r2 == r3) goto L_0x0c4e
            if (r2 != r4) goto L_0x1292
            r2 = 814(0x32e, float:1.14E-42)
        L_0x0c30:
            java.lang.String r2 = X.C273654mx.A00(r2)
            r0.A1g = r2
            java.lang.String r3 = r6.A00()
            if (r3 == 0) goto L_0x00de
            boolean r2 = r5.A0D
            if (r2 == 0) goto L_0x00de
            boolean r2 = r5.A04
            if (r2 != 0) goto L_0x00de
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x00de
        L_0x0c4a:
            r0.A1W = r3
            goto L_0x00de
        L_0x0c4e:
            r2 = 3022(0xbce, float:4.235E-42)
            goto L_0x0c30
        L_0x0c51:
            boolean r5 = r1 instanceof X.C389579pr
            if (r5 == 0) goto L_0x0c78
            r4 = r1
            X.9pr r4 = (X.C389579pr) r4
            X.3WT r2 = X.AnonymousClass3WT.MENTION
            r0.A11 = r2
            com.instagram.reels.smb.model.ProfileStickerModel r3 = r4.A01
            com.instagram.user.model.User r2 = r3.A03
            r0.A1B = r2
            java.lang.String r2 = "mention_profile_sticker"
            r0.A1g = r2
            java.lang.String r3 = r3.A00()
            if (r3 == 0) goto L_0x00de
            boolean r2 = r4.A00
            if (r2 != 0) goto L_0x00de
            int r2 = r3.length()
            if (r2 != 0) goto L_0x0c4a
            goto L_0x00de
        L_0x0c78:
            boolean r5 = r1 instanceof X.C389599pt
            if (r5 == 0) goto L_0x0d45
            r5 = r1
            X.9pt r5 = (X.C389599pt) r5
            com.instagram.reels.smb.model.ProfileStickerModel r7 = r5.A07
            com.instagram.reels.smb.model.ProfileStickerAiAgentData r8 = r7.A02
            if (r8 == 0) goto L_0x00de
            java.lang.String r8 = r8.A04
            if (r8 == 0) goto L_0x00de
            com.instagram.user.model.User r7 = r7.A03
            if (r7 == 0) goto L_0x00de
            java.lang.String r44 = r7.getFullName()
            if (r44 == 0) goto L_0x00de
            X.UOB r7 = X.C18711Vyh.A00()
            java.lang.Integer r15 = r7.A08
            com.instagram.api.schemas.AiAgentMetadataDict r14 = r7.A00
            java.lang.Integer r13 = r7.A0A
            com.instagram.api.schemas.StoryJoinChatStatus r12 = r7.A02
            X.XAt r10 = r7.A01
            com.instagram.user.model.User r9 = r7.A05
            java.util.List r7 = r7.A0N
            com.instagram.reels.chat.model.ChatStickerChannelType r25 = com.instagram.reels.chat.model.ChatStickerChannelType.AI_AGENT
            r22 = -1
            java.lang.Long r34 = java.lang.Long.valueOf(r22)
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r3)
            com.instagram.reels.chat.model.ChatStickerStickerType r26 = com.instagram.reels.chat.model.ChatStickerStickerType.AGENT_PROFILE_STICKER
            r22 = r14
            r23 = r10
            r24 = r12
            r27 = r9
            r30 = r15
            r31 = r6
            r32 = r13
            r33 = r6
            r35 = r2
            r36 = r2
            r37 = r2
            r38 = r2
            r39 = r2
            r40 = r2
            r41 = r2
            r42 = r8
            r43 = r2
            r45 = r7
            X.UOB r28 = X.C17032VFg.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            X.UNW r4 = new X.UNW
            r29 = r4
            r30 = r2
            r31 = r2
            r32 = r2
            r33 = r2
            r34 = r2
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.Boolean r6 = r4.A00
            float r4 = r5.A00
            java.lang.Float r31 = java.lang.Float.valueOf(r4)
            float r4 = r5.A01
            java.lang.Float r32 = java.lang.Float.valueOf(r4)
            float r4 = r5.A02
            java.lang.Float r33 = java.lang.Float.valueOf(r4)
            float r4 = r5.A03
            java.lang.Float r34 = java.lang.Float.valueOf(r4)
            float r4 = r5.A04
            java.lang.Float r35 = java.lang.Float.valueOf(r4)
            r4 = 0
            java.lang.Float r36 = java.lang.Float.valueOf(r4)
            X.UNW r25 = new X.UNW
            r29 = r25
            r30 = r6
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.String r29 = ""
            X.8D7 r4 = new X.8D7
            r22 = r4
            r23 = r2
            r24 = r2
            r26 = r2
            r27 = r2
            r30 = r29
            r31 = r2
            r32 = r2
            r33 = r2
            r34 = r3
            r35 = r3
            r36 = r3
            r37 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r0.A13 = r4
            X.3WT r2 = X.AnonymousClass3WT.MESSAGE_SHARE
            goto L_0x00dc
        L_0x0d45:
            boolean r5 = r1 instanceof X.C380099Wq
            if (r5 == 0) goto L_0x0d4d
            X.3WT r2 = X.AnonymousClass3WT.VOTING_INFO_CENTER
            goto L_0x00dc
        L_0x0d4d:
            boolean r5 = r1 instanceof X.C300635xX
            if (r5 == 0) goto L_0x0d62
            r3 = r1
            X.5xX r3 = (X.C300635xX) r3
            X.3WT r2 = X.AnonymousClass3WT.LINK
            r0.A11 = r2
            X.6MT r2 = r3.A0U
            if (r2 == 0) goto L_0x12a2
            com.instagram.api.schemas.StoryLinkInfoDict r2 = r2.A00
            r0.A0W = r2
            goto L_0x00de
        L_0x0d62:
            boolean r5 = r1 instanceof X.U1Q
            if (r5 == 0) goto L_0x0d7b
            r3 = r1
            X.U1Q r3 = (X.U1Q) r3
            X.3WT r2 = X.AnonymousClass3WT.BLOKS_TAPPABLE
            r0.A11 = r2
            java.lang.String r3 = r3.A04
        L_0x0d6f:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            X.DDv r4 = new X.DDv
            r4.<init>(r3, r2)
            goto L_0x07a1
        L_0x0d7b:
            boolean r5 = r1 instanceof X.U1P
            if (r5 == 0) goto L_0x0d89
            r3 = r1
            X.U1P r3 = (X.U1P) r3
            X.3WT r2 = X.AnonymousClass3WT.BLOKS_TAPPABLE
            r0.A11 = r2
            java.lang.String r3 = r3.A04
            goto L_0x0d6f
        L_0x0d89:
            boolean r5 = r1 instanceof X.C16144UpV
            if (r5 == 0) goto L_0x0da2
            r3 = r1
            X.UpV r3 = (X.C16144UpV) r3
            X.3WT r2 = X.AnonymousClass3WT.BADGES_SUPPORTER_THANKS
            r0.A11 = r2
            r2 = 560(0x230, float:7.85E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            r0.A1k = r2
            X.JzL r2 = r3.A0A
            r0.A18 = r2
            goto L_0x00de
        L_0x0da2:
            boolean r5 = r1 instanceof X.C16143UpU
            if (r5 == 0) goto L_0x0dae
            X.3WT r2 = X.AnonymousClass3WT.SUBSCRIPTIONS
            r0.A11 = r2
            java.lang.String r8 = "subscriptions_sticker_bundle_id"
            goto L_0x0b9a
        L_0x0dae:
            boolean r5 = r1 instanceof X.C16148UpZ
            if (r5 == 0) goto L_0x0dc5
            r3 = r1
            X.UpZ r3 = (X.C16148UpZ) r3
            X.3WT r2 = X.AnonymousClass3WT.REACTION
            r0.A11 = r2
            X.WaI r2 = r3.A01
            if (r2 == 0) goto L_0x0dc3
            X.5Hn r2 = r2.A00
        L_0x0dbf:
            r0.A16 = r2
            goto L_0x00de
        L_0x0dc3:
            r2 = 0
            goto L_0x0dbf
        L_0x0dc5:
            boolean r5 = r1 instanceof X.U1R
            if (r5 == 0) goto L_0x0ddd
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.commentreply.drawable.ReelsVisualRepliesDrawable"
            X.0qQ.A0C(r1, r2)
            r2 = r1
            X.U1R r2 = (X.U1R) r2
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r3 = r2.A01
        L_0x0dd3:
            X.3WT r2 = X.AnonymousClass3WT.REELS_VISUAL_REPLIES
            r0.A11 = r2
            com.instagram.api.schemas.MediaVCRTappableData r2 = r3.A00
            r0.A0K = r2
            goto L_0x00de
        L_0x0ddd:
            boolean r5 = r1 instanceof X.U1S
            if (r5 == 0) goto L_0x0dec
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.commentshare.drawable.CommentShareDrawable"
            X.0qQ.A0C(r1, r2)
            r2 = r1
            X.U1S r2 = (X.U1S) r2
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r3 = r2.A01
            goto L_0x0dd3
        L_0x0dec:
            boolean r5 = r1 instanceof X.AnonymousClass9X0
            if (r5 == 0) goto L_0x0dfd
            r3 = r1
            X.9X0 r3 = (X.AnonymousClass9X0) r3
            X.3WT r2 = X.AnonymousClass3WT.MESSAGE_SHARE
            r0.A11 = r2
            X.8D7 r2 = r3.A06
        L_0x0df9:
            r0.A13 = r2
            goto L_0x00de
        L_0x0dfd:
            boolean r5 = r1 instanceof X.C61681KHo
            if (r5 == 0) goto L_0x0e0b
            r3 = r1
            X.KHo r3 = (X.C61681KHo) r3
            X.3WT r2 = X.AnonymousClass3WT.MESSAGE_SHARE
            r0.A11 = r2
            X.8D7 r2 = r3.A02
            goto L_0x0df9
        L_0x0e0b:
            boolean r5 = r1 instanceof X.AnonymousClass9XD
            if (r5 == 0) goto L_0x0ecf
            r4 = r1
            X.9XD r4 = (X.AnonymousClass9XD) r4
            com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel r4 = r4.A03
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel"
            X.0qQ.A0C(r4, r5)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r5 = r4.A07
            java.lang.String r6 = r5.A03
            java.lang.String r5 = "com.instagram.barcelona"
            boolean r5 = X.0qQ.A0K(r6, r5)
            if (r5 == 0) goto L_0x00f1
            X.3WT r5 = X.AnonymousClass3WT.TEXT_POST_STICKER
            r0.A11 = r5
            java.lang.String r6 = r4.A09
            com.instagram.common.gallery.metadata.MediaUploadMetadata r5 = r4.A07
            java.lang.String r5 = r5.A03
            X.BHt r12 = new X.BHt
            r12.<init>(r5, r2, r6)
            X.1hu r6 = new X.1hu
            r6.<init>(r2)
            r13 = 6
            X.1E9 r5 = new X.1E9
            r5.<init>(r6, r13, r3)
            X.BHu r5 = new X.BHu
            r22 = r5
            r23 = r2
            r25 = r2
            r26 = r2
            r27 = r2
            r28 = r2
            r29 = r2
            r30 = r2
            r31 = r2
            r32 = r2
            r33 = r2
            r34 = r2
            r35 = r2
            r36 = r2
            r37 = r2
            r38 = r2
            r39 = r2
            r40 = r2
            r41 = r2
            r42 = r2
            r43 = r2
            r44 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            java.lang.Float r6 = r5.A04
            r27 = r6
            java.lang.Integer r6 = r5.A0B
            r34 = r6
            java.lang.Integer r6 = r5.A0C
            r35 = r6
            java.lang.Integer r6 = r5.A0D
            r36 = r6
            java.lang.Integer r6 = r5.A0E
            r37 = r6
            java.lang.Float r6 = r5.A05
            r28 = r6
            java.lang.Integer r6 = r5.A0F
            r38 = r6
            com.instagram.api.schemas.SubscriptionStickerDict r10 = r5.A01
            com.instagram.api.schemas.StickerTraySurface r15 = r5.A00
            java.lang.Float r14 = r5.A07
            java.lang.Float r9 = r5.A08
            java.lang.Float r8 = r5.A09
            java.lang.Float r7 = r5.A0A
            java.lang.String r6 = r4.A09
            float r5 = r4.A01
            java.lang.Float r29 = java.lang.Float.valueOf(r5)
            float r4 = r4.A00
            java.lang.Float r26 = java.lang.Float.valueOf(r4)
            X.1hu r5 = new X.1hu
            r5.<init>(r2)
            X.1E9 r4 = new X.1E9
            r4.<init>(r5, r13, r3)
            if (r10 == 0) goto L_0x0eb6
            com.instagram.api.schemas.SubscriptionStickerDict r24 = r10.FC2(r4)
        L_0x0eb6:
            X.BHu r3 = new X.BHu
            r22 = r3
            r23 = r15
            r25 = r12
            r30 = r14
            r31 = r9
            r32 = r8
            r33 = r7
            r40 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r0.A0f = r3
            goto L_0x00de
        L_0x0ecf:
            boolean r5 = r1 instanceof X.AnonymousClass9XO
            if (r5 == 0) goto L_0x0ee5
            r3 = r1
            X.9XO r3 = (X.AnonymousClass9XO) r3
            X.3WT r2 = X.AnonymousClass3WT.EXPLORE_SHAREABLE_GRID
            r0.A11 = r2
            java.util.List r3 = r3.A02
            X.BEf r2 = new X.BEf
            r2.<init>(r3)
            r0.A0G = r2
            goto L_0x00de
        L_0x0ee5:
            boolean r5 = r1 instanceof X.C389559pp
            if (r5 == 0) goto L_0x0eed
            X.3WT r2 = X.AnonymousClass3WT.POLAROID_STICKER
            goto L_0x00dc
        L_0x0eed:
            boolean r5 = r1 instanceof X.C389649py
            if (r5 == 0) goto L_0x0fb1
            r4 = r1
            X.9py r4 = (X.C389649py) r4
            X.9m0 r4 = r4.A0F
        L_0x0ef6:
            X.3WT r5 = X.AnonymousClass3WT.NOTIFY_ME
            r0.A11 = r5
            r45 = 0
            X.1hu r6 = new X.1hu
            r6.<init>(r2)
            r10 = 6
            X.1E9 r5 = new X.1E9
            r5.<init>(r6, r10, r3)
            X.BH4 r5 = new X.BH4
            r22 = r5
            r23 = r2
            r25 = r2
            r26 = r2
            r27 = r2
            r28 = r2
            r29 = r2
            r30 = r2
            r31 = r2
            r32 = r2
            r33 = r2
            r34 = r2
            r35 = r2
            r36 = r2
            r37 = r2
            r38 = r2
            r39 = r2
            r40 = r2
            r41 = r2
            r42 = r2
            r43 = r2
            r44 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            java.lang.Float r6 = r5.A04
            r27 = r6
            java.lang.Integer r6 = r5.A0B
            r26 = r6
            java.lang.Integer r6 = r5.A0C
            r25 = r6
            java.lang.Integer r6 = r5.A0D
            r24 = r6
            java.lang.Integer r6 = r5.A0E
            r23 = r6
            X.DS7 r9 = r5.A01
            java.lang.Float r6 = r5.A05
            r22 = r6
            java.lang.Integer r15 = r5.A0F
            com.instagram.api.schemas.SubscriptionStickerDict r8 = r5.A02
            com.instagram.api.schemas.StickerTraySurface r14 = r5.A00
            java.lang.Float r13 = r5.A07
            java.lang.Float r12 = r5.A08
            java.lang.Float r7 = r5.A09
            java.lang.Float r6 = r5.A0A
            float r5 = r4.A01
            java.lang.Float r49 = java.lang.Float.valueOf(r5)
            float r4 = r4.A00
            java.lang.Float r46 = java.lang.Float.valueOf(r4)
            X.1hu r5 = new X.1hu
            r5.<init>(r2)
            X.1E9 r4 = new X.1E9
            r4.<init>(r5, r10, r3)
            if (r9 == 0) goto L_0x0f7c
            X.DGg r44 = r9.FAb()
        L_0x0f7c:
            if (r8 == 0) goto L_0x0f82
            com.instagram.api.schemas.SubscriptionStickerDict r45 = r8.FC2(r4)
        L_0x0f82:
            X.BH4 r3 = new X.BH4
            r42 = r3
            r43 = r14
            r47 = r27
            r48 = r22
            r50 = r13
            r51 = r12
            r52 = r7
            r53 = r6
            r54 = r26
            r55 = r25
            r56 = r24
            r57 = r23
            r58 = r15
            r59 = r2
            r60 = r2
            r61 = r2
            r62 = r2
            r63 = r2
            r64 = r2
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            r0.A0Y = r3
            goto L_0x00de
        L_0x0fb1:
            boolean r5 = r1 instanceof X.C389659pz
            if (r5 == 0) goto L_0x0fbc
            r4 = r1
            X.9pz r4 = (X.C389659pz) r4
            X.9m0 r4 = r4.A00
            goto L_0x0ef6
        L_0x0fbc:
            boolean r2 = r1 instanceof X.KWD
            if (r2 == 0) goto L_0x1029
            X.KWD r10 = (X.KWD) r10
            X.Aeq r2 = r10.A00
            X.3WT r4 = X.AnonymousClass3WT.BIO_PRODUCT
            r0.A11 = r4
            java.lang.String r6 = r2.A02
            java.lang.String r4 = "[^0-9]"
            X.11S r5 = new X.11S
            r5.<init>(r4)
            java.lang.String r4 = ""
            java.lang.String r6 = r5.A00(r6, r4)
            int r5 = r6.length()
            r4 = 0
            if (r5 == 0) goto L_0x0fe2
            int r4 = java.lang.Integer.parseInt(r6)
        L_0x0fe2:
            long r4 = (long) r4
            java.lang.String r8 = r2.A01
            java.lang.String r7 = r2.A04
            java.lang.String r6 = r2.A03
            X.0qQ.A0B(r8, r9)
            r2 = 5
            X.0qQ.A0B(r7, r2)
            r2 = 6
            X.0qQ.A0B(r6, r2)
            r26 = 0
            X.1ea r2 = new X.1ea
            r22 = r2
            r23 = r8
            r24 = r7
            r25 = r6
            r28 = r26
            r30 = r4
            r32 = r3
            r22.<init>(r23, r24, r25, r26, r28, r30, r32)
            long r4 = r2.A02
            java.lang.String r8 = r2.A03
            java.lang.String r7 = r2.A04
            java.lang.String r6 = r2.A05
            X.1ea r2 = new X.1ea
            r22 = r2
            r23 = r8
            r24 = r7
            r25 = r6
            r30 = r4
            r22.<init>(r23, r24, r25, r26, r28, r30, r32)
            X.9bm r3 = new X.9bm
            r3.<init>(r2)
            r0.A0I = r3
            goto L_0x00de
        L_0x1029:
            boolean r2 = r1 instanceof X.C346987w5
            if (r2 == 0) goto L_0x1041
            r3 = r1
            X.7w5 r3 = (X.C346987w5) r3
            X.3WT r2 = X.AnonymousClass3WT.SECRET_STICKER
            r0.A11 = r2
            X.Aej r3 = r3.A02
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.model.SecretStickerClientModel"
            X.0qQ.A0C(r3, r2)
            java.lang.String r2 = r3.A01
            r0.A1e = r2
            goto L_0x00de
        L_0x1041:
            boolean r2 = r1 instanceof X.C59993Jd2
            if (r2 == 0) goto L_0x1057
            r3 = r1
            X.Jd2 r3 = (X.C59993Jd2) r3
            X.3WT r2 = X.AnonymousClass3WT.PUBLIC_COLLECTION
            r0.A11 = r2
            java.lang.String r3 = r3.A0G
            X.BG5 r2 = new X.BG5
            r2.<init>(r3)
            r0.A0M = r2
            goto L_0x00de
        L_0x1057:
            boolean r2 = r1 instanceof X.C389609pu
            if (r2 == 0) goto L_0x1240
            r3 = r1
            X.9pu r3 = (X.C389609pu) r3
            X.3WT r2 = X.AnonymousClass3WT.QUESTION
            r0.A11 = r2
            X.Aeh r2 = r3.A03
            if (r2 == 0) goto L_0x00de
            X.WaP r4 = r2.A00
            goto L_0x06be
        L_0x106a:
            if (r6 == 0) goto L_0x1073
            java.lang.String r2 = r12.A0N
            X.C306406Ma.A08(r6, r0, r2, r4)
            goto L_0x00de
        L_0x1073:
            java.util.List r6 = X.C306406Ma.A01
            java.lang.String r5 = r12.A0S
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x1081
            X.3WT r2 = X.AnonymousClass3WT.SOUND_ON
            goto L_0x00dc
        L_0x1081:
            X.6oG r6 = r8.A0M
            X.6oG r5 = X.C318046oG.ELECTION_STICKER
            if (r6 != r5) goto L_0x1097
            X.3WT r2 = X.AnonymousClass3WT.ELECTION
            r0.A11 = r2
            java.lang.String r2 = r12.A0S
            r0.A1g = r2
            r2 = r16
            r0.A07 = r2
        L_0x1093:
            java.lang.String r2 = r12.A0S
            goto L_0x0507
        L_0x1097:
            X.6oG r5 = X.C318046oG.ANTI_BULLY_ENG_ONLY
            if (r6 != r5) goto L_0x10a8
            X.3WT r2 = X.AnonymousClass3WT.ANTI_BULLY_ENG_ONLY
            r0.A11 = r2
            X.DDv r2 = new X.DDv
            r2.<init>()
            r0.A1C = r2
            goto L_0x00de
        L_0x10a8:
            X.6oG r5 = X.C318046oG.ANTI_BULLY_GLOBAL
            if (r6 != r5) goto L_0x10b9
            X.3WT r2 = X.AnonymousClass3WT.ANTI_BULLY_GLOBAL
            r0.A11 = r2
            X.DDv r2 = new X.DDv
            r2.<init>()
            r0.A1D = r2
            goto L_0x00de
        L_0x10b9:
            X.6oG r5 = X.C318046oG.VOTER_REGISTRATION
            if (r6 == r5) goto L_0x1279
            X.6oG r5 = X.C318046oG.BLOKS
            if (r6 != r5) goto L_0x111e
            X.3WT r2 = X.AnonymousClass3WT.BLOKS_TAPPABLE
            r0.A11 = r2
            java.lang.String r5 = r8.A0O
            com.instagram.api.schemas.RingSpec r4 = r8.A0I
            X.3ID r3 = r8.A0N
            X.DDv r2 = new X.DDv
            r2.<init>(r4, r3, r5)
            r0.A1F = r2
            goto L_0x1093
        L_0x10d3:
            r2 = r1
            X.B1b r2 = (X.C41796B1b) r2
            X.A7J r3 = r2.Bik()
            java.lang.Boolean r2 = r3.A01
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x10e8
            X.3WT r2 = X.AnonymousClass3WT.CLIPS_QUESTION_RESPONSE
        L_0x10e4:
            r0.A11 = r2
            goto L_0x0180
        L_0x10e8:
            X.3WT r2 = X.AnonymousClass3WT.QUESTION_RESPONSE
            goto L_0x10e4
        L_0x10eb:
            com.instagram.api.schemas.SMBSupportStickerDict r2 = r2.A00
            r0.A0P = r2
            goto L_0x00de
        L_0x10f1:
            boolean r3 = r1 instanceof X.C41796B1b
            if (r3 == 0) goto L_0x110a
            r3 = r1
            X.B1b r3 = (X.C41796B1b) r3
            X.A7J r4 = r3.Bik()
            java.lang.Boolean r3 = r4.A01
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x111b
            X.3WT r3 = X.AnonymousClass3WT.CLIPS_QUESTION_RESPONSE
        L_0x1106:
            r0.A11 = r3
            r0.A15 = r4
        L_0x110a:
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r9.BUu()
            X.6KJ r3 = r9.BV4()
            java.lang.String r4 = r3.A02
            r3 = r68
            X.C306406Ma.A05(r3, r5, r0, r4, r2)
            goto L_0x00de
        L_0x111b:
            X.3WT r3 = X.AnonymousClass3WT.QUESTION_RESPONSE
            goto L_0x1106
        L_0x111e:
            X.6oG r5 = X.C318046oG.AVATAR_STATIC
            if (r6 != r5) goto L_0x11e6
            com.google.common.collect.ImmutableList r5 = r12.A02()
            if (r5 == 0) goto L_0x1134
            java.lang.Object r3 = r5.get(r3)
            X.A3c r3 = (X.C39638A3c) r3
            if (r3 == 0) goto L_0x1134
            java.lang.String r13 = r3.A00
            if (r13 != 0) goto L_0x113d
        L_0x1134:
            com.instagram.common.typedurl.ImageUrl r3 = r12.A0H
            java.lang.String r13 = r3.getUrl()
            X.0qQ.A07(r13)
        L_0x113d:
            X.3WT r3 = X.AnonymousClass3WT.AVATAR
            r0.A11 = r3
            java.lang.String r10 = r12.A0S
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r4)
            java.lang.String r31 = "Image"
            java.lang.String r9 = r12.A0i
            com.instagram.avatars.common.AvatarInfo r3 = r12.A0G
            if (r3 == 0) goto L_0x117d
            java.lang.String r2 = r3.A02
            java.lang.String r8 = r3.A00
        L_0x1153:
            if (r3 == 0) goto L_0x117a
            java.lang.String r6 = r3.A01
        L_0x1157:
            if (r3 == 0) goto L_0x1177
            java.lang.String r5 = r3.A03
        L_0x115b:
            X.ToH r3 = new X.ToH
            r22 = r3
            r25 = r8
            r26 = r6
            r27 = r10
            r28 = r2
            r29 = r13
            r30 = r5
            r32 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0.A0D = r3
            r0.A0C = r3
            java.lang.String r2 = r12.A0c
            goto L_0x11be
        L_0x1177:
            r5 = r24
            goto L_0x115b
        L_0x117a:
            r6 = r24
            goto L_0x1157
        L_0x117d:
            r8 = r2
            goto L_0x1153
        L_0x117f:
            X.6oG r3 = X.C318046oG.AVATAR_ANIMATED
            if (r5 != r3) goto L_0x11de
            X.3WT r3 = X.AnonymousClass3WT.AVATAR
            r0.A11 = r3
            java.lang.String r12 = r13.A0C
            java.lang.String r10 = r13.A0l
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r4)
            java.lang.String r31 = "Animation"
            java.lang.String r9 = r13.A0G
            com.instagram.avatars.common.AvatarInfo r3 = r13.A09
            if (r3 == 0) goto L_0x11dc
            java.lang.String r2 = r3.A02
            java.lang.String r8 = r3.A00
        L_0x119b:
            if (r3 == 0) goto L_0x11d9
            java.lang.String r6 = r3.A01
        L_0x119f:
            if (r3 == 0) goto L_0x11d6
            java.lang.String r5 = r3.A03
        L_0x11a3:
            X.ToH r3 = new X.ToH
            r22 = r3
            r25 = r8
            r26 = r6
            r27 = r12
            r28 = r2
            r29 = r10
            r30 = r5
            r32 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0.A0D = r3
            r0.A0C = r3
            java.lang.String r2 = r13.A0n
        L_0x11be:
            r0.A1j = r2
            if (r19 == 0) goto L_0x00de
            int r2 = r7.A08
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r2 = r19
            boolean r2 = r2.contains(r3)
            if (r2 != r4) goto L_0x00de
            java.lang.String r2 = r7.A0C
            r0.A1l = r2
            goto L_0x00de
        L_0x11d6:
            r5 = r24
            goto L_0x11a3
        L_0x11d9:
            r6 = r24
            goto L_0x119f
        L_0x11dc:
            r8 = r2
            goto L_0x119b
        L_0x11de:
            X.6oG r2 = X.C318046oG.CUTOUT_VIDEO
            if (r5 != r2) goto L_0x00f1
            X.3WT r2 = X.AnonymousClass3WT.CUTOUT_VIDEO
            goto L_0x00dc
        L_0x11e6:
            X.6oG r2 = X.C318046oG.CUTOUT_PHOTO
            if (r6 != r2) goto L_0x11ee
            X.3WT r2 = X.AnonymousClass3WT.CUTOUT_PHOTO
            goto L_0x00dc
        L_0x11ee:
            X.6oG r2 = X.C318046oG.AI_STICKER
            if (r6 != r2) goto L_0x11f6
            X.3WT r2 = X.AnonymousClass3WT.AI_STICKER
            goto L_0x00dc
        L_0x11f6:
            X.6oG r2 = X.C318046oG.ACHIEVEMENTS
            if (r6 != r2) goto L_0x00f1
            X.3WT r2 = X.AnonymousClass3WT.ACHIEVEMENT_STICKER
            goto L_0x00dc
        L_0x11fe:
            java.lang.String r5 = r10.A0A
            com.instagram.user.model.User r3 = r10.A03
            java.lang.String r4 = r3.getId()
            com.instagram.model.mediatype.ProductType r3 = r10.A00
            r0.A1a = r5
            r0.A1b = r4
            r0.A0m = r3
            X.3WT r3 = X.AnonymousClass3WT.MEDIA
            r0.A11 = r3
            r0.A12 = r2
            goto L_0x00de
        L_0x1216:
            java.util.Iterator r2 = r5.iterator()
        L_0x121a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r1 = r2.next()
            X.91P r1 = (X.AnonymousClass91P) r1
            r0 = r65
            X.3ui r0 = X.C306406Ma.A00(r1, r3, r0, r7)
            r11.add(r0)
            goto L_0x121a
        L_0x1230:
            X.3WT r2 = X.AnonymousClass3WT.MEDIA
            r0.A11 = r2
            r0.A1a = r5
            com.instagram.user.model.User r2 = r4.A02
            java.lang.String r2 = r2.getId()
            r0.A1b = r2
            goto L_0x00de
        L_0x1240:
            boolean r2 = r1 instanceof X.C359008bp
            if (r2 == 0) goto L_0x00f1
            r5 = r1
            X.8bp r5 = (X.C359008bp) r5
            X.3WT r2 = X.AnonymousClass3WT.FILLABLE
            r0.A11 = r2
            java.lang.Integer r2 = r5.A0I
            int r2 = r2.intValue()
            if (r2 == r3) goto L_0x1276
            if (r2 != r4) goto L_0x12aa
            X.6oG r2 = X.C318046oG.FILLABLE_MUSIC_STICKER
        L_0x1257:
            java.lang.String r2 = r2.toString()
            r0.A1T = r2
            X.Aew r2 = r5.A0H
            if (r2 == 0) goto L_0x1274
            X.8Mx r3 = r2.A00()
        L_0x1265:
            r2 = 0
            if (r3 == 0) goto L_0x126c
            com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes r2 = X.C48786Ek9.A00(r3)
        L_0x126c:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.A1U = r2
            goto L_0x00de
        L_0x1274:
            r3 = 0
            goto L_0x1265
        L_0x1276:
            X.6oG r2 = X.C318046oG.FILLABLE_GALLERY_STICKER
            goto L_0x1257
        L_0x1279:
            X.3WT r2 = X.AnonymousClass3WT.VOTER_REGISTRATION
            r0.A11 = r2
            X.DDv r2 = new X.DDv
            r2.<init>()
            r0.A1G = r2
            goto L_0x00de
        L_0x1286:
            r16 = 0
            goto L_0x007c
        L_0x128a:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1292:
            java.lang.String r1 = "Unexpected SupportBusinessProfileSticker Theme: "
            java.lang.String r0 = X.A16.A00(r7)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x12a2:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x12aa:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x12b0:
            java.util.ArrayList r1 = new java.util.ArrayList
            r0 = r18
            r1.<init>(r0)
            r0 = r69
            X.4yO r2 = r0.A05
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r2 != r0) goto L_0x130b
            r0 = r69
            X.6if r2 = r0.A1d
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x130b
            java.lang.Object r0 = r2.get()
            X.Ljc r0 = (X.C64876Ljc) r0
            X.JjN r0 = X.C64876Ljc.A00(r0)
            X.0Ud r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            X.Jvp r0 = (X.C61051Jvp) r0
            android.text.Spannable r2 = r0.A01
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Class<X.91P> r0 = X.AnonymousClass91P.class
            java.lang.Object[] r6 = X.C263324Kh.A06(r2, r0)
            X.91P[] r6 = (X.AnonymousClass91P[]) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r4 = r6.length
            r3 = 0
        L_0x12ee:
            if (r3 >= r4) goto L_0x1308
            r2 = r6[r3]
            boolean r0 = r2 instanceof X.AnonymousClass91O
            if (r0 != 0) goto L_0x12fa
            boolean r0 = r2 instanceof X.C15915Ukf
            if (r0 == 0) goto L_0x1305
        L_0x12fa:
            X.3ui r0 = new X.3ui
            r0.<init>()
            X.C306406Ma.A06(r2, r0)
            r5.add(r0)
        L_0x1305:
            int r3 = r3 + 1
            goto L_0x12ee
        L_0x1308:
            r1.addAll(r5)
        L_0x130b:
            r0 = r69
            X.8Bz r0 = r0.A1F
            r3 = 1
            if (r0 == 0) goto L_0x1611
            java.util.ArrayList r6 = r69.A19()
            java.util.ArrayList r17 = r69.A18()
            boolean r15 = r0.A07()
            X.28D r2 = X.28D.A4Y
            r16 = 0
            r0 = r67
            if (r0 != r2) goto L_0x1328
            r16 = 1
        L_0x1328:
            r8 = 0
            X.3WT r0 = X.AnonymousClass3WT.PROMPT
            X.3ui r5 = X.C289745e8.A00(r0, r1)
            if (r5 == 0) goto L_0x160c
            com.instagram.reels.prompt.model.PromptStickerModel r10 = r5.A0F()
            if (r10 == 0) goto L_0x160c
            boolean r0 = r10.A0L()
            if (r0 == r3) goto L_0x160c
            boolean r0 = r10.A0M()
            if (r0 != r3) goto L_0x160c
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r10.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r0 = r0.C1M()
            if (r0 != 0) goto L_0x160c
            java.util.TreeMap r9 = new java.util.TreeMap
            r9.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r6.iterator()
        L_0x1359:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x1376
            java.lang.Object r6 = r7.next()
            r2 = r6
            X.5Ek r2 = (X.C282705Ek) r2
            X.5El r0 = r2.A01
            if (r0 == 0) goto L_0x1359
            java.lang.Integer r0 = r0.A05
            if (r0 == 0) goto L_0x1359
            java.lang.String r0 = r2.A08
            if (r0 == 0) goto L_0x1359
            r4.add(r6)
            goto L_0x1359
        L_0x1376:
            r12 = 10
            int r0 = X.0Yv.A1E(r4, r12)
            int r0 = X.0se.A0L(r0)
            r7 = 16
            if (r0 >= r7) goto L_0x1386
            r0 = 16
        L_0x1386:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>(r0)
            java.util.Iterator r11 = r4.iterator()
        L_0x138f:
            boolean r0 = r11.hasNext()
            java.lang.String r6 = "Required value was null."
            if (r0 == 0) goto L_0x13bf
            java.lang.Object r4 = r11.next()
            X.5Ek r4 = (X.C282705Ek) r4
            X.5El r0 = r4.A01
            if (r0 == 0) goto L_0x13b9
            java.lang.Integer r2 = r0.A05
            if (r2 == 0) goto L_0x13b3
            java.lang.String r0 = r4.A08
            if (r0 == 0) goto L_0x13ad
            r13.put(r2, r0)
            goto L_0x138f
        L_0x13ad:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x13b3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x13b9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x13bf:
            r9.putAll(r13)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r14 = r17.iterator()
        L_0x13cb:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x13ea
            java.lang.Object r13 = r14.next()
            r11 = r13
            X.3ui r11 = (X.C255783ui) r11
            java.lang.String r4 = r11.A1h
            java.lang.String r0 = "gif"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x13cb
            java.lang.String r0 = r11.A1l
            if (r0 == 0) goto L_0x13cb
            r2.add(r13)
            goto L_0x13cb
        L_0x13ea:
            int r0 = X.0Yv.A1E(r2, r12)
            int r0 = X.0se.A0L(r0)
            if (r0 >= r7) goto L_0x13f6
            r0 = 16
        L_0x13f6:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>(r0)
            java.util.Iterator r11 = r2.iterator()
        L_0x13ff:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x141f
            java.lang.Object r4 = r11.next()
            X.3ui r4 = (X.C255783ui) r4
            int r0 = r4.A09
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r4.A1l
            if (r0 == 0) goto L_0x1419
            r13.put(r2, r0)
            goto L_0x13ff
        L_0x1419:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x141f:
            r9.putAll(r13)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r14 = r1.iterator()
        L_0x142b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x1446
            java.lang.Object r13 = r14.next()
            r11 = r13
            X.3ui r11 = (X.C255783ui) r11
            X.3WT r2 = r11.A11
            X.3WT r0 = X.AnonymousClass3WT.MUSIC_OVERLAY
            if (r2 != r0) goto L_0x142b
            java.lang.String r0 = r11.A1l
            if (r0 == 0) goto L_0x142b
            r4.add(r13)
            goto L_0x142b
        L_0x1446:
            int r0 = X.0Yv.A1E(r4, r12)
            int r0 = X.0se.A0L(r0)
            if (r0 >= r7) goto L_0x1452
            r0 = 16
        L_0x1452:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>(r0)
            java.util.Iterator r11 = r4.iterator()
        L_0x145b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x147b
            java.lang.Object r4 = r11.next()
            X.3ui r4 = (X.C255783ui) r4
            int r0 = r4.A09
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r4.A1l
            if (r0 == 0) goto L_0x1475
            r13.put(r2, r0)
            goto L_0x145b
        L_0x1475:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x147b:
            r9.putAll(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r14 = r17.iterator()
        L_0x1487:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x14a6
            java.lang.Object r11 = r14.next()
            r4 = r11
            X.3ui r4 = (X.C255783ui) r4
            java.lang.String r2 = r4.A1h
            java.lang.String r0 = "local_image_sticker"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x1487
            java.lang.String r0 = r4.A1l
            if (r0 == 0) goto L_0x1487
            r13.add(r11)
            goto L_0x1487
        L_0x14a6:
            java.util.Iterator r13 = r13.iterator()
            boolean r0 = r13.hasNext()
            if (r0 != 0) goto L_0x14ea
            r11 = 0
        L_0x14b1:
            X.3ui r11 = (X.C255783ui) r11
            if (r11 == 0) goto L_0x14c6
            int r0 = r11.A09
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L_0x14c6
            r0 = 1877(0x755, float:2.63E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.put(r2, r0)
        L_0x14c6:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r14 = r1.iterator()
        L_0x14cf:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x150d
            java.lang.Object r13 = r14.next()
            r11 = r13
            X.3ui r11 = (X.C255783ui) r11
            X.3WT r2 = r11.A11
            X.3WT r0 = X.AnonymousClass3WT.AVATAR
            if (r2 != r0) goto L_0x14cf
            java.lang.String r0 = r11.A1l
            if (r0 == 0) goto L_0x14cf
            r4.add(r13)
            goto L_0x14cf
        L_0x14ea:
            java.lang.Object r11 = r13.next()
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x14b1
            r0 = r11
            X.3ui r0 = (X.C255783ui) r0
            int r4 = r0.A09
        L_0x14f9:
            java.lang.Object r2 = r13.next()
            r0 = r2
            X.3ui r0 = (X.C255783ui) r0
            int r0 = r0.A09
            if (r4 >= r0) goto L_0x1506
            r11 = r2
            r4 = r0
        L_0x1506:
            boolean r0 = r13.hasNext()
            if (r0 != 0) goto L_0x14f9
            goto L_0x14b1
        L_0x150d:
            int r0 = X.0Yv.A1E(r4, r12)
            int r0 = X.0se.A0L(r0)
            if (r0 >= r7) goto L_0x1519
            r0 = 16
        L_0x1519:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r0)
            java.util.Iterator r7 = r4.iterator()
        L_0x1522:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x1542
            java.lang.Object r4 = r7.next()
            X.3ui r4 = (X.C255783ui) r4
            int r0 = r4.A09
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r4.A1l
            if (r0 == 0) goto L_0x153c
            r11.put(r2, r0)
            goto L_0x1522
        L_0x153c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x1542:
            r9.putAll(r11)
            if (r15 == 0) goto L_0x158e
            r2 = 0
            java.lang.String r0 = "template_background_id"
            com.instagram.api.schemas.StoryTemplateAssetDict r17 = X.C394589yM.A00(r0, r2, r2, r8)
        L_0x154e:
            com.instagram.reels.prompt.model.PromptStickerModel r6 = r10.A04()
            java.util.Collection r0 = r9.values()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r12 = r1.iterator()
        L_0x1569:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x1591
            java.lang.Object r9 = r12.next()
            r11 = r9
            X.3ui r11 = (X.C255783ui) r11
            X.3WT r7 = r11.A11
            X.3WT r2 = X.AnonymousClass3WT.FILLABLE
            if (r7 != r2) goto L_0x1569
            java.lang.String r7 = r11.A1T
            X.6oG r2 = X.C318046oG.FILLABLE_GALLERY_STICKER
            java.lang.String r2 = r2.toString()
            boolean r2 = X.0qQ.A0K(r7, r2)
            if (r2 == 0) goto L_0x1569
            r10.add(r9)
            goto L_0x1569
        L_0x158e:
            r17 = 0
            goto L_0x154e
        L_0x1591:
            java.util.Iterator r15 = r10.iterator()
        L_0x1595:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x15e0
            java.lang.Object r2 = r15.next()
            X.3ui r2 = (X.C255783ui) r2
            float r14 = r2.A00
            float r13 = r2.A01
            float r12 = r2.A02
            float r11 = r2.A03
            float r10 = r2.A04
            int r9 = r2.A09
            java.lang.String r7 = r2.A1U
            java.util.Map r2 = com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes.A01
            java.lang.Object r7 = r2.get(r7)
            com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes r7 = (com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes) r7
            if (r7 != 0) goto L_0x15bb
            com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes r7 = com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes.UNRECOGNIZED
        L_0x15bb:
            java.lang.Float r20 = java.lang.Float.valueOf(r14)
            java.lang.Float r21 = java.lang.Float.valueOf(r13)
            java.lang.Float r22 = java.lang.Float.valueOf(r12)
            java.lang.Float r23 = java.lang.Float.valueOf(r11)
            java.lang.Float r24 = java.lang.Float.valueOf(r10)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r9)
            com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl r2 = new com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl
            r18 = r2
            r19 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r0.add(r2)
            goto L_0x1595
        L_0x15e0:
            r7 = 0
            com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl r2 = new com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl
            r2.<init>(r7, r0)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r8)
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r16)
            com.instagram.api.schemas.StoryTemplateDict r0 = new com.instagram.api.schemas.StoryTemplateDict
            r16 = r0
            r18 = r2
            r19 = r7
            r20 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r26 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6.A07(r0)
            com.instagram.api.schemas.StoryPromptTappableData r0 = r6.A02()
            r5.A0Z = r0
        L_0x160c:
            X.8OX r0 = X.AnonymousClass8OX.A00
            X.018.A1A(r1, r0)
        L_0x1611:
            X.8Oa r4 = X.AnonymousClass8OY.A00(r68)
            r0 = r69
            X.82p r0 = r0.A13
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            java.lang.String r2 = r0.A0F
            X.0qQ.A07(r2)
            java.util.HashMap r0 = r4.A00
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x1658
            boolean r0 = r2.isEmpty()
            if (r0 != r3) goto L_0x1658
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r2.iterator()
        L_0x163b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1655
            java.lang.Object r3 = r4.next()
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            X.3ui r2 = new X.3ui
            r2.<init>()
            java.lang.String r0 = "invisible_mention"
            X.C306406Ma.A09(r2, r3, r0)
            r5.add(r2)
            goto L_0x163b
        L_0x1655:
            r1.addAll(r5)
        L_0x1658:
            X.8Ob r2 = X.C354968Ob.A00
            X.8Oc r0 = new X.8Oc
            r0.<init>(r2)
            java.util.Collections.sort(r1, r0)
            int r3 = r1.size()
            r2 = 0
        L_0x1667:
            if (r2 >= r3) goto L_0x1674
            java.lang.Object r0 = r1.get(r2)
            X.3ui r0 = (X.C255783ui) r0
            r0.A09 = r2
            int r2 = r2 + 1
            goto L_0x1667
        L_0x1674:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.A17():java.util.ArrayList");
    }

    public final ArrayList A18() {
        String A0R2;
        String str;
        List A062;
        AnonymousClass3WT r1;
        String str2;
        String str3;
        28D r7 = this.A0k;
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1m;
        Set A0F2 = A0F(this);
        C306406Ma r0 = C306406Ma.A00;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : interactiveDrawableContainer.A0X(Drawable.class).entrySet()) {
            Drawable drawable = (Drawable) entry.getKey();
            C369458un r9 = (C369458un) entry.getValue();
            C255783ui r2 = new C255783ui();
            C306406Ma r02 = C306406Ma.A00;
            C306406Ma.A01(drawable, r2, interactiveDrawableContainer, r9, false, false);
            Drawable A0B2 = r02.A0B(drawable);
            String str4 = "rollcall_v2_timestamp_sticker";
            String str5 = "date_sticker";
            String str6 = "memories";
            String str7 = "";
            boolean z = false;
            if (A0B2 instanceof C369768vI) {
                C369768vI r10 = (C369768vI) A0B2;
                switch (r10.A0M.ordinal()) {
                    case 4:
                    case 5:
                    case 9:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    case 22:
                    case 108:
                        break;
                    case EglBase14Impl.EGLExt_SDK_VERSION:
                        str3 = "cutout_photo";
                        z = true;
                        break;
                    default:
                        C317966o8 r8 = r10.A0L;
                        if (r8.A0J == null && r8.A0K == null && !C306406Ma.A01.contains(r8.A0S)) {
                            str3 = str7;
                            break;
                        }
                }
                C317966o8 r12 = r10.A0L;
                A0R2 = r12.A0S;
                if (!z) {
                    str3 = r12.A0U;
                }
                str2 = null;
            } else {
                if (A0B2 instanceof C321016tR) {
                    C321016tR r102 = (C321016tR) A0B2;
                    C318046oG r13 = r102.A0d;
                    if (!(r13 == C318046oG.BLOKS_ANIMATED || r13 == C318046oG.AVATAR_ANIMATED)) {
                        if (r13 == C318046oG.CUTOUT_VIDEO) {
                            str6 = "cutout_video";
                        } else {
                            A0R2 = r102.A0k;
                            if (A0F2 == null || !A0F2.contains(Integer.valueOf(r9.A08))) {
                                str5 = "gif";
                                str2 = null;
                                str7 = null;
                            } else {
                                str2 = r9.A0C;
                                str5 = "gif";
                                str7 = null;
                            }
                        }
                    }
                } else {
                    if (A0B2 instanceof C369888vU) {
                        A0R2 = ((C369888vU) A0B2).getId();
                        if (!(A0B2 instanceof C380169Wx) || !((C380169Wx) A0B2).A03) {
                            str5 = "time";
                        }
                    } else {
                        if (A0B2 instanceof C369468uo) {
                            if (r7 == 28D.A3P) {
                                str4 = C318046oG.MEMORIES.toString();
                            } else {
                                A0R2 = ((C369468uo) A0B2).A08;
                            }
                        } else if (!(A0B2 instanceof C369478up)) {
                            if (A0B2 instanceof C369898vV) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("emoji_");
                                sb.append(((C306386Ly) A0B2).A0F);
                                A0R2 = sb.toString();
                                str5 = "emoji";
                            } else if (A0B2 instanceof C369908vW) {
                                A0R2 = ((C369908vW) A0B2).A0G;
                                if (0qQ.A0K(A0R2, "rollcall_v2_photo_sticker")) {
                                    str5 = "rollcall_v2_media_sticker";
                                } else {
                                    str5 = "local_image_sticker";
                                }
                                if (A0F2 != null && A0F2.contains(Integer.valueOf(r9.A08))) {
                                    str2 = r9.A0C;
                                    str7 = null;
                                }
                            } else if (A0B2 instanceof C369948va) {
                                C39717A6i Bla = ((C369948va) A0B2).Bla();
                                if (Bla != null) {
                                    A0R2 = Bla.A00;
                                } else {
                                    A0R2 = null;
                                }
                                str5 = "mention";
                            } else {
                                if (A0B2 instanceof C369848vQ) {
                                    str5 = str7;
                                    if (r7 == 28D.A0O) {
                                        str5 = str6;
                                    }
                                } else if (A0B2 instanceof AnonymousClass9X8) {
                                    A0R2 = ((AnonymousClass9X8) A0B2).A0D;
                                    if (0qQ.A0K(A0R2, "gallery_story_video_sticker")) {
                                        str5 = C318046oG.GALLERY.toString();
                                    } else {
                                        str5 = str7;
                                        if (0qQ.A0K(A0R2, "rollcall_v2_video_sticker")) {
                                            str5 = "rollcall_v2_media_sticker";
                                        }
                                    }
                                } else if (A0B2 instanceof AnonymousClass5MM) {
                                    AnonymousClass5MM r103 = (AnonymousClass5MM) A0B2;
                                    A0R2 = r103.A05().BkW().A00();
                                    str5 = C318046oG.KARAOKE_CAPTION.toString();
                                    UOC A052 = r103.A05();
                                    if (A052.A08) {
                                        r1 = AnonymousClass3WT.CLIPS_KARAOKE_CAPTIONS_STICKER;
                                    } else {
                                        r1 = AnonymousClass3WT.KARAOKE_CAPTIONS;
                                    }
                                    r2.A11 = r1;
                                    r2.A0i = A052;
                                    if (drawable instanceof AnonymousClass5MH) {
                                        AnonymousClass5MH r82 = (AnonymousClass5MH) drawable;
                                        r2.A1K = Float.valueOf((float) r82.A01);
                                        r2.A1J = Float.valueOf((float) r82.A00);
                                    }
                                } else if (A0B2 instanceof U1R) {
                                    str4 = C318046oG.REELS_VISUAL_REPLIES.toString();
                                    ReelsVisualRepliesModel reelsVisualRepliesModel = ((U1R) A0B2).A01;
                                    r2.A11 = AnonymousClass3WT.REELS_VISUAL_REPLIES;
                                    r2.A0K = reelsVisualRepliesModel.A00;
                                } else if (A0B2 instanceof C16152Upd) {
                                    C19477WaP waP = ((C16152Upd) A0B2).A0D;
                                    if (waP == null || (A062 = waP.A06()) == null || !(!A062.isEmpty())) {
                                        str = str7;
                                    } else {
                                        str = "expressive_question";
                                    }
                                    str5 = "question";
                                } else if (A0B2 instanceof C41796B1b) {
                                    str5 = "question_reshare";
                                    if (A0B2 instanceof C386069k0) {
                                        A0R2 = "question_response_reshare_media";
                                    } else if (A0B2 instanceof C389779qB) {
                                        A0R2 = "question_response_reshare_text";
                                    } else if (A0B2 instanceof B3c) {
                                        A0R2 = "question_response_reshare_music";
                                    }
                                } else if (!(A0B2 instanceof C369708vC)) {
                                    if (A0B2 instanceof C306386Ly) {
                                        A0R2 = 002.A0R("text_sticker_", r9.A0C);
                                        r2.A11 = AnonymousClass3WT.CLIPS_TEXT;
                                        r2.A19 = (C306386Ly) A0B2;
                                        if (drawable instanceof AnonymousClass5MH) {
                                            AnonymousClass5MH r83 = (AnonymousClass5MH) drawable;
                                            r2.A1K = Float.valueOf((float) r83.A01);
                                            r2.A1J = Float.valueOf((float) r83.A00);
                                        }
                                        str5 = "text_sticker";
                                    }
                                }
                                A0R2 = str5;
                            }
                        }
                        str5 = A0R2;
                    }
                    str2 = null;
                    str7 = null;
                }
                str5 = str6;
                A0R2 = str7;
                str2 = null;
                str7 = null;
            }
            r2.A1i = A0R2;
            r2.A1h = str3;
            r2.A1l = str2;
            r2.A1Y = str7;
            arrayList.add(r2);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.5Ek, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v1, types: [java.lang.Object, X.5El] */
    /* JADX WARNING: type inference failed for: r1v13, types: [X.5Ek, java.lang.Object] */
    public final ArrayList A19() {
        Spannable A122;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1m;
        if (interactiveDrawableContainer.getInteractiveDrawables().size() > 0) {
            for (Map.Entry entry : interactiveDrawableContainer.A0X(C306386Ly.class).entrySet()) {
                C306386Ly r11 = (C306386Ly) entry.getKey();
                C369458un r10 = (C369458un) entry.getValue();
                float f = r10.A06;
                float width = (((float) r10.A0A) * f) / ((float) interactiveDrawableContainer.getWidth());
                float height = (((float) r10.A07) * f) / ((float) interactiveDrawableContainer.getHeight());
                float width2 = r10.A03 / ((float) interactiveDrawableContainer.getWidth());
                float height2 = r10.A04 / ((float) interactiveDrawableContainer.getHeight());
                C306406Ma r0 = C306406Ma.A00;
                int i = (r10.A09 * 1000000) + r10.A0B;
                float radians = (float) Math.toRadians((double) r10.A05);
                float A012 = 0nA.A01(this.A0f, r11.A0b.getTextSize());
                Spannable spannable = r11.A0F;
                0qQ.A07(spannable);
                C358868bb r02 = (C358868bb) C263324Kh.A00(spannable, C358868bb.class);
                if (r02 != null) {
                    str = r02.A09;
                    if (r11 instanceof AnonymousClass91c) {
                        str2 = ((AnonymousClass91c) r11).A0X().A00;
                    }
                    str2 = "";
                } else {
                    str = "";
                    str2 = "";
                }
                C306396Lz r03 = r11.A0I;
                if (r03 == null || (str3 = r03.A00) == null) {
                    str3 = "";
                }
                Spannable spannable2 = r11.A0F;
                0qQ.A07(spannable2);
                String str4 = null;
                C306576Mr A002 = C358948bj.A00(spannable2, 0, spannable2.length());
                Set A0F2 = A0F(this);
                if (A0F2 != null && A0F2.contains(Integer.valueOf(r10.A08))) {
                    str4 = r10.A0C;
                }
                Float valueOf = Float.valueOf(width2);
                Float valueOf2 = Float.valueOf(height2);
                Integer valueOf3 = Integer.valueOf(i);
                Float valueOf4 = Float.valueOf(height);
                Float valueOf5 = Float.valueOf(width);
                Float valueOf6 = Float.valueOf(radians);
                ? obj = new Object();
                obj.A03 = valueOf;
                obj.A04 = valueOf2;
                obj.A05 = valueOf3;
                obj.A00 = valueOf4;
                obj.A02 = valueOf5;
                obj.A01 = valueOf6;
                C306576Mr r2 = C306576Mr.INVERTED;
                Spannable spannable3 = r11.A0F;
                if (A002 == r2) {
                    0qQ.A07(spannable3);
                    arrayList = new ArrayList();
                    for (AnonymousClass6MP BfU : (AnonymousClass6MP[]) C263324Kh.A06(spannable3, AnonymousClass6MP.class)) {
                        arrayList.add(0nH.A0G(BfU.BfU()));
                    }
                } else {
                    0qQ.A07(spannable3);
                    arrayList = C358838bY.A00(spannable3);
                }
                String obj2 = r11.A0F.toString();
                Float valueOf7 = Float.valueOf(f);
                Float valueOf8 = Float.valueOf(A012);
                List singletonList = Collections.singletonList(A002.A00);
                0qQ.A07(singletonList);
                AnonymousClass9UN r22 = AnonymousClass9UV.A00;
                Layout.Alignment alignment = r11.A0E;
                0qQ.A07(alignment);
                String lowerCase = AnonymousClass9UV.A00(r22.A00(alignment)).toLowerCase(Locale.ROOT);
                0qQ.A07(lowerCase);
                int i2 = r10.A08;
                ? obj3 = new Object();
                obj3.A09 = obj2;
                obj3.A0C = false;
                obj3.A01 = obj;
                obj3.A03 = valueOf7;
                obj3.A02 = valueOf8;
                obj3.A06 = str;
                obj3.A0B = singletonList;
                obj3.A0A = arrayList;
                obj3.A04 = lowerCase;
                obj3.A05 = str2;
                obj3.A07 = str3;
                obj3.A08 = str4;
                obj3.A00 = i2;
                arrayList2.add(obj3);
            }
        }
        if (!(this.A05 != AnonymousClass9QA.A00 || (A122 = A12()) == null || A122.toString().length() == 0)) {
            String obj4 = A122.toString();
            ? obj5 = new Object();
            obj5.A09 = obj4;
            obj5.A0C = true;
            obj5.A01 = null;
            obj5.A03 = null;
            obj5.A02 = null;
            obj5.A06 = null;
            obj5.A0B = null;
            obj5.A0A = null;
            obj5.A04 = null;
            obj5.A05 = null;
            obj5.A07 = null;
            obj5.A08 = null;
            obj5.A00 = -1;
            arrayList2.add(obj5);
        }
        return arrayList2;
    }

    public final LinkedHashMap A1B() {
        boolean z;
        Object obj = this.A0t.A08.A00;
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1m;
        UserSession userSession = this.A0r;
        if (!C355008Of.A01(interactiveDrawableContainer) || ((!(obj instanceof AnonymousClass80O) || !182.A06(0Tu.A05, userSession, 36324372373450799L)) && !182.A06(0Tu.A05, userSession, 36324372373319725L))) {
            z = false;
        } else {
            z = true;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List allDrawables = interactiveDrawableContainer.getAllDrawables();
        boolean z2 = false;
        if (!(allDrawables instanceof Collection) || !allDrawables.isEmpty()) {
            Iterator it = allDrawables.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (AnonymousClass9SF.A01((Drawable) it.next()) != null) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        boolean z3 = true;
        if (!z) {
            z3 = false;
        }
        interactiveDrawableContainer.A0u(new C355018Og(new Matrix(), interactiveDrawableContainer, linkedHashMap, z2, z3));
        return linkedHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1C() {
        /*
            r9 = this;
            java.lang.Integer r1 = r9.A0D
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r7 = 1
            r3 = 0
            if (r1 != r0) goto L_0x0018
            r9.A0d = r7
            X.6if r1 = r9.A1S
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r1.get()
            X.ALf r0 = (X.C39963ALf) r0
            r0.A0A = r3
        L_0x0018:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            r9.A1N(r6)
            X.80U r0 = r9.A1B
            boolean r0 = r0.CZU()
            if (r0 == 0) goto L_0x005a
            X.82p r0 = r9.A13
            X.82o r2 = r0.A02
            X.8nd r0 = r2.A01()
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0043
            if (r1 == r7) goto L_0x005c
            r0 = 2
            if (r1 == r0) goto L_0x005a
            r0 = 3
            if (r1 == r0) goto L_0x005a
            java.lang.String r0 = "Unknown media type"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        L_0x0043:
            X.82Y r0 = r2.A01
            X.8Cl r5 = r0.A03()
            if (r5 == 0) goto L_0x005a
            long r3 = r5.A0B
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0055
            long r3 = r5.A0A
        L_0x0055:
            r9.A02 = r3
            boolean r0 = r5.A12
            goto L_0x006a
        L_0x005a:
            r0 = 0
            goto L_0x006a
        L_0x005c:
            X.82Y r0 = r2.A01
            X.7zv r2 = r0.A04()
            if (r2 == 0) goto L_0x005a
            long r0 = r2.A0M
            r9.A02 = r0
            boolean r0 = r2.A18
        L_0x006a:
            X.82p r1 = r9.A13
            X.82o r1 = r1.A02
            X.82Y r4 = r1.A01
            X.802 r1 = r4.A02()
            if (r1 == 0) goto L_0x00c4
            android.text.Editable r1 = r1.A04
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r1 != 0) goto L_0x00a6
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r9.A1m
            java.lang.Class<X.6Ly> r1 = X.C306386Ly.class
            java.util.ArrayList r2 = r5.A0V(r1)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x00a3
            java.lang.Object r2 = r2.get(r3)
            X.6Ly r2 = (X.C306386Ly) r2
            r5.A0t(r2, r7)
            r5.A0k(r2)
            X.6if r1 = r9.A1e
            java.lang.Object r1 = r1.get()
            X.8an r1 = (X.C358368an) r1
            r1.A0L = r2
        L_0x00a3:
            r9.A1E()
        L_0x00a6:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r9.A1m
            java.lang.Class<X.9pm> r1 = X.C389529pm.class
            java.util.ArrayList r2 = r2.A0V(r1)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x00c4
            int r1 = r2.size()
            if (r1 != r7) goto L_0x011c
            java.lang.Object r2 = r2.get(r3)
            X.9pm r2 = (X.C389529pm) r2
            r1 = 0
            r2.A0B(r1)
        L_0x00c4:
            X.A6f r3 = r9.A06
            r1 = 500(0x1f4, double:2.47E-321)
            if (r3 == 0) goto L_0x00f3
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x00f2
            r3.A00 = r7
            X.4DH r0 = r9.A0l
            android.os.Bundle r3 = r0.requireArguments()
            java.lang.String r0 = "follower_id"
            java.lang.String r4 = r3.getString(r0)
            r0 = 3144(0xc48, float:4.406E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r3.getString(r0)
            X.ApC r3 = new X.ApC
            r3.<init>(r9, r4, r0)
            r9.A0F = r3
        L_0x00ed:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r9.A1m
            r0.postDelayed(r3, r1)
        L_0x00f2:
            return
        L_0x00f3:
            java.lang.Integer r3 = r4.A0B
            X.0qQ.A07(r3)
            if (r3 != r6) goto L_0x00f2
            if (r0 == 0) goto L_0x00f2
            long r7 = r9.A02
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00f2
            java.util.ArrayList r0 = X.C378999Sa.A00
            long r5 = java.lang.System.currentTimeMillis()
            r3 = 3153600000000(0x2de41353000, double:1.558085420725E-311)
            long r5 = r5 - r3
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f2
            X.Ak5 r3 = new X.Ak5
            r3.<init>(r9)
            r9.A0E = r3
            goto L_0x00ed
        L_0x011c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "There should only be one polling sticker coming from type mode, but instead had multiple: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.A1C():void");
    }

    public final void A1D() {
        C16581Uxb uxb;
        String str;
        String str2;
        UserSession userSession = this.A0r;
        C64834Liw A002 = C17053VGb.A00(userSession);
        boolean A1x2 = AnonymousClass0t1.A01.A01(userSession).A1x();
        AnonymousClass0iw r2 = this.A0o;
        A002.A05((String) null, r2.getModuleName(), A1x2, "stories");
        C249713kF r24 = C249713kF.A00;
        AnonymousClass4DH r3 = this.A0l;
        FragmentActivity requireActivity = r3.requireActivity();
        String moduleName = r2.getModuleName();
        Integer num = AnonymousClass05K.A0C;
        if (C367088qA.A05(userSession, false)) {
            uxb = C16581Uxb.MULTI_PRODUCT_STORY_STICKER;
        } else {
            uxb = C16581Uxb.STORY_STICKER;
        }
        String str3 = this.A1p;
        0qQ.A0B(moduleName, 1);
        0qQ.A0B(num, 2);
        0qQ.A0B(str3, 4);
        List list = 0sn.A00;
        ShoppingTaggingFeedClientState shoppingTaggingFeedClientState = new ShoppingTaggingFeedClientState(list, list, list, list, list, list, list);
        AnonymousClass88Z r7 = this.A1A;
        if (!r7.Cb8(C3512188a.A0g) || !r7.Cb8(C3512188a.A0e)) {
            str = ((AJ2) this.A1a.get()).A07.A04;
        } else {
            str = null;
        }
        List A0W2 = 00k.A0W(0Yv.A1F(0sr.A1P(new List[]{shoppingTaggingFeedClientState.A04, 0sr.A1N(str)})));
        0qQ.A0B(A0W2, 0);
        shoppingTaggingFeedClientState.A04 = A0W2;
        if (r7.Cb8(C3512188a.A0G)) {
            str2 = null;
        } else {
            str2 = ((AJ2) this.A1a.get()).A07.A03;
        }
        shoppingTaggingFeedClientState.A00 = 0sr.A1N(str2);
        String str4 = moduleName;
        UserSession userSession2 = userSession;
        AnonymousClass4DH r25 = r3;
        r24.A0j(r25, requireActivity, (FragmentActivity) null, userSession2, C64174LSb.A01((ClipInfo) null, uxb, shoppingTaggingFeedClientState, (TaggingFeedMultiSelectState) null, num, (Long) null, (String) null, (String) null, str4, (String) null, (String) null, (String) null, str3, (List) null, C367088qA.A05(userSession, false)), (String) null, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == X.AnonymousClass05K.A0C) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1E() {
        /*
            r5 = this;
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r5.A1m
            java.lang.Class<X.6Ly> r0 = X.C306386Ly.class
            java.util.ArrayList r0 = r1.A0V(r0)
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L_0x000d:
            r2 = 0
        L_0x000e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r4.next()
            X.6Ly r0 = (X.C306386Ly) r0
            java.lang.Integer r1 = X.C306496Mj.A00(r0)
            if (r3 != 0) goto L_0x0025
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r3 = 0
            if (r1 != r0) goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            if (r2 != 0) goto L_0x002c
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x000d
        L_0x002c:
            r2 = 1
            goto L_0x000e
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.A1E():void");
    }

    public final void A1F(Drawable drawable) {
        if (drawable != null) {
            InteractiveDrawableContainer interactiveDrawableContainer = this.A1m;
            this.A0B = interactiveDrawableContainer.A0O(drawable);
            interactiveDrawableContainer.A0S(drawable);
        }
        this.A1B.E3H(new Object());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (r6 == com.instagram.api.schemas.MusicProduct.A0F) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1J(android.graphics.drawable.Drawable r30, X.C40599Aen r31, boolean r32, boolean r33) {
        /*
            r29 = this;
            r14 = r29
            android.graphics.drawable.Drawable r1 = r14.A11()
            r5 = 0
            if (r1 == 0) goto L_0x0015
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r14.A1m
            r0.A0S(r1)
            java.lang.String r1 = "StickerOverlayController"
            java.lang.String r0 = "a music sticker shouldn't be added to the InteractiveDrawableContainer at this point"
            X.0kD.A0E(r1, r0, r5)
        L_0x0015:
            X.85o r0 = r14.A12
            r1 = r32
            r0.A06 = r1
            r3 = 0
            r0.A07 = r3
            X.C3506485o.A00(r0, r3)
            r2 = r30
            if (r30 == 0) goto L_0x01cd
            boolean r0 = A0u(r14)
            if (r0 != 0) goto L_0x0030
            X.85r r0 = r14.A18
            X.C3506685r.A00(r2, r0)
        L_0x0030:
            android.content.Context r13 = r14.A0f
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131165245(0x7f07003d, float:1.7944702E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r1 = r31
            if (r31 == 0) goto L_0x01ca
            int r4 = r0 / 2
            r7 = 17
            r6 = 0
            float r4 = (float) r4
            X.Ut8 r10 = new X.Ut8
            r10.<init>(r7, r6, r4)
        L_0x004c:
            com.instagram.common.session.UserSession r11 = r14.A0r
            com.instagram.api.schemas.MusicProduct r6 = X.C271404in.A01(r2)
            com.instagram.api.schemas.MusicProduct r4 = com.instagram.api.schemas.MusicProduct.MUSIC_CAMERA_FORMAT
            if (r6 == r4) goto L_0x005c
            com.instagram.api.schemas.MusicProduct r4 = com.instagram.api.schemas.MusicProduct.MUSIC_FIRST
            r26 = 0
            if (r6 != r4) goto L_0x005e
        L_0x005c:
            r26 = 1
        L_0x005e:
            boolean r7 = r2 instanceof X.B3d
            r8 = 0
            if (r7 == 0) goto L_0x006c
            r4 = r2
            X.B3d r4 = (X.B3d) r4
            if (r4 == 0) goto L_0x006c
            X.6KJ r8 = r4.BV4()
        L_0x006c:
            X.6KJ r6 = X.AnonymousClass6KJ.MUSIC_ONLY
            r27 = 0
            if (r8 == r6) goto L_0x0074
            r27 = 1
        L_0x0074:
            r28 = 1
            r8 = r2
            boolean r4 = r2 instanceof X.AnonymousClass5MI
            r23 = 0
            if (r4 == 0) goto L_0x008a
            r9 = r8
            X.5MI r9 = (X.AnonymousClass5MI) r9
            if (r9 == 0) goto L_0x008a
            int r9 = r9.Byn()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r9)
        L_0x008a:
            r24 = 0
            if (r4 == 0) goto L_0x009a
            X.5MI r8 = (X.AnonymousClass5MI) r8
            if (r8 == 0) goto L_0x009a
            int r8 = r8.B1e()
            java.lang.Integer r24 = java.lang.Integer.valueOf(r8)
        L_0x009a:
            java.lang.String r25 = "StickerOverlayController"
            r20 = r13
            r21 = r11
            r22 = r10
            X.6b1 r18 = X.C39900AIi.A04(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r15 = r2
            com.instagram.music.common.model.MusicOverlayStickerModel r17 = X.C271404in.A02(r2)
            boolean r8 = r2 instanceof X.C347017w8
            if (r8 == 0) goto L_0x01b4
            r8 = r2
            X.7w8 r8 = (X.C347017w8) r8
            java.lang.Class<X.B3d> r4 = X.B3d.class
            java.util.ArrayList r4 = r8.A06(r4)
        L_0x00b8:
            java.util.ArrayList r24 = X.C271404in.A0A(r4)
            X.57C r16 = X.AnonymousClass57C.ASSET_PICKER
            r20 = r5
            r21 = r5
            r22 = r5
            r23 = r5
            r19 = r5
            int r4 = r14.A0x(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            if (r31 == 0) goto L_0x0143
            int r10 = r1.A00
            android.graphics.drawable.Drawable r4 = r2.getCurrent()
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 / 2
            int r4 = -r4
            r9 = 0
            float r8 = (float) r4
            X.Ut8 r4 = new X.Ut8
            r4.<init>(r10, r9, r8)
            X.8Yz r8 = r14.A0t
            X.80m r8 = r8.A08
            java.lang.Object r8 = r8.A00
            X.4yO r8 = (X.C279284yO) r8
            r15 = r13
            r16 = r11
            r17 = r8
            r18 = r1
            r19 = r4
            r20 = r25
            r21 = r3
            r22 = r3
            X.6b1 r4 = X.C39900AIi.A03(r15, r16, r17, r18, r19, r20, r21, r22)
            android.graphics.drawable.Drawable r8 = r1.A01
            r14.A03 = r8
            X.6nz r1 = r1.A02
            java.util.ArrayList r1 = r1.A01()
            r14.A1K(r8, r4, r1)
            X.ADh r9 = r14.A08
            if (r9 != 0) goto L_0x011b
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r14.A1m
            X.ADh r9 = new X.ADh
            r9.<init>(r1)
            r14.A08 = r9
        L_0x011b:
            float r11 = (float) r0
            int r1 = r8.getIntrinsicHeight()
            float r1 = (float) r1
            float r11 = r11 / r1
            X.9br r4 = new X.9br
            r4.<init>(r8, r11, r10, r0)
            java.util.Map r0 = r9.A02
            r0.put(r2, r4)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r9.A01
            X.Ago r0 = new X.Ago
            r0.<init>(r2, r9)
            r1.setPropertyListener(r2, r0)
            X.Agq r0 = new X.Agq
            r0.<init>(r2, r8, r4, r9)
            r1.setPropertyListener(r8, r0)
            X.88G r0 = r9.A00
            r1.A0y(r0)
        L_0x0143:
            if (r33 == 0) goto L_0x0180
            if (r7 == 0) goto L_0x0180
            r0 = r2
            X.B3d r0 = (X.B3d) r0
            if (r0 == 0) goto L_0x0180
            X.6KJ r0 = r0.BV4()
            if (r0 != r6) goto L_0x0180
            X.6if r0 = r14.A1V
            java.lang.Object r6 = r0.get()
            X.A59 r6 = (X.A59) r6
            java.lang.Runnable r1 = r6.A00
            if (r1 == 0) goto L_0x0167
            X.3oV r0 = r6.A01
            android.view.View r0 = r0.getView()
            r0.removeCallbacks(r1)
        L_0x0167:
            X.3oV r1 = r6.A01
            android.view.View r0 = r1.getView()
            r0.setVisibility(r3)
            android.view.View r4 = r1.getView()
            r0 = 1000(0x3e8, double:4.94E-321)
            X.Ajy r3 = new X.Ajy
            r3.<init>(r6)
            r4.postDelayed(r3, r0)
            r6.A00 = r3
        L_0x0180:
            X.8un r1 = r14.A0B
            if (r1 == 0) goto L_0x018d
            if (r30 == 0) goto L_0x018b
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r14.A1m
            r0.A0r(r2, r1)
        L_0x018b:
            r14.A0B = r5
        L_0x018d:
            X.8Bz r1 = r14.A1F
            if (r1 == 0) goto L_0x0198
            java.lang.Integer r0 = r14.A0C
            r1.A05(r0, r12)
            r14.A0C = r5
        L_0x0198:
            X.6if r1 = r14.A1L
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x01ae
            java.lang.Object r0 = r1.get()
            X.JY9 r0 = (X.JY9) r0
            X.Lbq r2 = r0.A0A
            if (r2 == 0) goto L_0x01ae
            X.MXG r1 = r2.A02
            r0 = 1
            r2.A02(r1, r0)
        L_0x01ae:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r14.A1N(r0)
            return
        L_0x01b4:
            if (r4 == 0) goto L_0x01c1
            X.5MI r15 = (X.AnonymousClass5MI) r15
            android.graphics.drawable.Drawable r15 = r15.AfT()
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.reels.music.view.MusicStickerDrawable"
            X.0qQ.A0C(r15, r4)
        L_0x01c1:
            java.util.List r4 = java.util.Collections.singletonList(r15)
            X.0qQ.A07(r4)
            goto L_0x00b8
        L_0x01ca:
            r10 = r5
            goto L_0x004c
        L_0x01cd:
            r12 = r5
            goto L_0x0180
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.A1J(android.graphics.drawable.Drawable, X.Aen, boolean, boolean):void");
    }

    public final void A1L(C2802350v r4) {
        C314676if r1 = this.A1O;
        if (!r1.A03) {
            r1.get();
        }
        Drawable A102 = A10();
        if (A102 != null) {
            InteractiveDrawableContainer interactiveDrawableContainer = this.A1m;
            this.A0B = interactiveDrawableContainer.A0O(A102);
            interactiveDrawableContainer.A0S(A102);
            Dn8(r4, (String) null);
        }
    }

    public final void A1M(Integer num) {
        User A012 = AnonymousClass0t1.A01.A01(this.A0r);
        C14272Tsv tsv = C14272Tsv.GRADIENT_PURPLE_BLUE;
        Integer num2 = num;
        if (num2 == AnonymousClass05K.A01) {
            tsv = C14272Tsv.GRADIENT_RED_YELLOW;
        }
        if (num2 == AnonymousClass05K.A0C) {
            tsv = C14272Tsv.SOLID_LIGHT_GREY;
        }
        int[] A022 = C14276Tsz.A02(tsv);
        int i = A022[0];
        A0X(this, new C18603Vuw(A012, num2, (String) null, (String) null, (String) null, C14276Tsz.A00(tsv), A022[1], 0, i, -6710887, -16777216, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r0 != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cb, code lost:
        if (r0 != false) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1P(boolean r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0108
            java.lang.Class<X.8Nk> r0 = X.C354798Nk.class
            android.graphics.drawable.Drawable r4 = A03(r8, r0)
            X.8Nk r4 = (X.C354798Nk) r4
            r5 = 1
            if (r4 == 0) goto L_0x004a
            boolean r0 = X.C339157j9.A02(r4)
            if (r0 != r5) goto L_0x004a
            X.80U r1 = r8.A1B
            boolean r0 = r1.CZe()
            if (r0 != 0) goto L_0x0104
            X.80V r0 = X.AnonymousClass80V.STORIES_TEMPLATE_PIN_COMPOSE
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x00e8
            com.instagram.common.session.UserSession r3 = r8.A0r
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319939968835402(0x8108cb001b1f4a, double:3.032214512726473E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0104
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0034:
            com.instagram.common.session.UserSession r7 = r8.A0r
            r6 = 0
            r0 = 2
            X.6M4 r3 = r4.A0A
            int r1 = r1.intValue()
            if (r1 == r6) goto L_0x009d
            if (r1 == r5) goto L_0x007e
            if (r1 == r0) goto L_0x00b2
            r0 = 3
            if (r1 == r0) goto L_0x007a
            r3.A00()
        L_0x004a:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r8.A1m
            java.lang.Class<X.8bp> r0 = X.C359008bp.class
            java.util.ArrayList r0 = r1.A0V(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0056:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0108
            java.lang.Object r2 = r3.next()
            X.8bp r2 = (X.C359008bp) r2
            if (r4 == 0) goto L_0x0056
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r4.BTZ()
            boolean r0 = r1.A0M()
            if (r0 == 0) goto L_0x0056
            boolean r0 = r1.A0L()
            if (r0 == 0) goto L_0x0056
            X.6M4 r0 = r2.A0G
            r0.A00()
            goto L_0x0056
        L_0x007a:
            r2 = 2131974567(0x7f1359a7, float:1.9586202E38)
            goto L_0x00a1
        L_0x007e:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319939968311108(0x8108cb00131f44, double:3.0322145123949074E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0099
            r0 = 36319858362752697(0x8108b800011eb9, double:3.032162904711169E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            r2 = 2131974558(0x7f13599e, float:1.9586183E38)
            if (r0 == 0) goto L_0x00d0
        L_0x0099:
            r2 = 2131974557(0x7f13599d, float:1.9586181E38)
            goto L_0x00d0
        L_0x009d:
            int r2 = X.C339157j9.A00(r7, r4)
        L_0x00a1:
            X.6Ly r1 = r3.A05
            android.content.res.Resources r0 = r3.A03
            java.lang.String r0 = r0.getString(r2)
            r1.A0M(r0)
            r3.invalidateSelf()
            r3.A00 = r5
            goto L_0x00e0
        L_0x00b2:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319939968311108(0x8108cb00131f44, double:3.0322145123949074E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00cd
            r0 = 36319858362752697(0x8108b800011eb9, double:3.032162904711169E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            r2 = 2131974564(0x7f1359a4, float:1.9586196E38)
            if (r0 == 0) goto L_0x00d0
        L_0x00cd:
            r2 = 2131974563(0x7f1359a3, float:1.9586194E38)
        L_0x00d0:
            X.6Ly r1 = r3.A05
            android.content.res.Resources r0 = r3.A03
            java.lang.String r0 = r0.getString(r2)
            r1.A0M(r0)
            r3.invalidateSelf()
            r3.A00 = r6
        L_0x00e0:
            r3.invalidateSelf()
            r4.Euc()
            goto L_0x004a
        L_0x00e8:
            boolean r0 = r8.A0o()
            if (r0 == 0) goto L_0x0100
            X.8Bz r0 = r8.A1F
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r0.A08()
            if (r0 != r5) goto L_0x00fc
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x0034
        L_0x00fc:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0034
        L_0x0100:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0034
        L_0x0104:
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            goto L_0x0034
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.A1P(boolean):void");
    }

    public final void A1Q(boolean z) {
        FittingTextView fittingTextView = this.A1k;
        if (fittingTextView != null) {
            fittingTextView.setEnabled(z);
            C71392co r0 = C315596kB.A02;
            C294975nL A012 = C294975nL.A01(fittingTextView, 0);
            float f = 0.5f;
            if (z) {
                f = 1.0f;
            }
            A012.A0I(f);
            A012.A0H();
        }
    }

    public final boolean A1R() {
        if ((this.A1r != null || this.A1v) && !A1A().isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean A1T() {
        ArrayList A0V2 = this.A1m.A0V(C354798Nk.class);
        if (!(A0V2 instanceof Collection) || !A0V2.isEmpty()) {
            Iterator it = A0V2.iterator();
            while (it.hasNext()) {
                if (((C354798Nk) it.next()).A0B.A0C) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A1V() {
        ArrayList A0V2 = this.A1m.A0V(C354798Nk.class);
        if ((A0V2 instanceof Collection) && A0V2.isEmpty()) {
            return false;
        }
        Iterator it = A0V2.iterator();
        while (it.hasNext()) {
            PromptStickerModel promptStickerModel = ((C354798Nk) it.next()).A0B;
            if (promptStickerModel.A0M() && !promptStickerModel.A0L()) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1W() {
        C346997w6 r0 = (C346997w6) A03(this, C346997w6.class);
        if (r0 != null && TextUtils.isEmpty(r0.A01.A02)) {
            return true;
        }
        C352168Bz r02 = this.A1F;
        if (r02 != null) {
            return r02.A07();
        }
        return false;
    }

    public final boolean A1X() {
        C357638Yz r0 = this.A13.A02.A01.A0X;
        r0.getClass();
        return r0.A08.A00 instanceof AnonymousClass80O;
    }

    public final boolean AFr() {
        return this.A1A.Cb8(C3512188a.A0O);
    }

    public final long AyD() {
        return this.A02;
    }

    public final int B9T() {
        Iterator it = this.A1m.A0V(C306386Ly.class).iterator();
        int i = 0;
        while (it.hasNext()) {
            C306386Ly r1 = (C306386Ly) it.next();
            if (r1 != A15()) {
                Spannable spannable = r1.A0F;
                0qQ.A07(spannable);
                i += ((C15915Ukf[]) C263324Kh.A06(spannable, C15915Ukf.class)).length;
            }
        }
        return i;
    }

    public final AnonymousClass4DH BZy() {
        return this.A0l;
    }

    public final boolean CWK() {
        return this.A1A.Cb8(C3512188a.A0l);
    }

    public final boolean CXt() {
        AnonymousClass88Z r1 = this.A1A;
        if (!r1.Cb8(C3512188a.A08) || !r1.Cb8(C3512188a.A0Z)) {
            return false;
        }
        return true;
    }

    public final boolean CZu(boolean z) {
        AnonymousClass88Z r1 = this.A1A;
        if (!r1.Cb8(C3512188a.A0Y)) {
            return false;
        }
        if (!r1.Cb8(C3512188a.A0G)) {
            C314676if r12 = this.A1a;
            if (!r12.A03) {
                return false;
            }
            AJ2 aj2 = (AJ2) r12.get();
            if (!AnonymousClass0t1.A01.A01(aj2.A04).A1R() || !aj2.A07.A06()) {
                return false;
            }
        }
        if (z || C367088qA.A06(this.A0r, false)) {
            return true;
        }
        return false;
    }

    public final boolean Cc2() {
        if (!C367088qA.A02(this.A0r) || !this.A1A.Cb8(C3512188a.A0U)) {
            return false;
        }
        return true;
    }

    public final boolean CcX() {
        return this.A2O;
    }

    public final boolean Cd8() {
        if (this.A0D == AnonymousClass05K.A0N) {
            return true;
        }
        return false;
    }

    public final void CnB(Drawable drawable) {
        if (this.A0G != null && (drawable instanceof C306386Ly)) {
            ((C306386Ly) drawable).A0M = AnonymousClass05K.A01;
        }
    }

    public final void Cnq(Drawable drawable) {
        B3f A002 = InteractiveDrawableContainer.A00(drawable, this.A1m);
        if (A002 != null) {
            A002.Cno(true);
        }
    }

    public final void Cut(C317966o8 r12, String str) {
        UserSession userSession = this.A0r;
        Context context = this.A0f;
        C318046oG r8 = C318046oG.AI_STICKER;
        C369768vI r3 = new C369768vI(context, (RingSpec) null, userSession, r12, r8, (AnonymousClass3ID) null, C273654mx.A00(535));
        r3.A04();
        C317876nz r0 = C317876nz.A0a;
        String str2 = r12.A0S;
        0qQ.A07(str2);
        List singletonList = Collections.singletonList(r12);
        0qQ.A07(singletonList);
        C317876nz r2 = new C317876nz(r8, str2, singletonList);
        C39890ADo A162 = A16();
        A162.A04 = 0.35f;
        A1I(r3, r2, A162, str);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8TZ, java.lang.Object] */
    public final void D0n(boolean z) {
        ? obj = new Object();
        obj.A00 = z;
        this.A1B.E3H(obj);
    }

    public final void D4A() {
        Drawable background;
        JY9 jy9 = (JY9) this.A1L.get();
        View view = jy9.A01;
        if (view != null && (background = view.getBackground()) != null) {
            background.setColorFilter(jy9.A10, PorterDuff.Mode.SRC_IN);
        }
    }

    public final void D9o() {
        this.A1B.E3H(AnonymousClass8T3.A00);
    }

    public final void DAr(float f, float f2) {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1m;
        if (interactiveDrawableContainer.getInteractiveDrawables().size() >= 2) {
            UserSession userSession = this.A0r;
            if (AnonymousClass7TF.A0R(0Tu.A05, userSession, 36320962169283563L).booleanValue()) {
                1Av A002 = 1Au.A00(userSession);
                0xa r4 = A002.A01;
                int i = r4.getInt("layering_tool_tooltip_seen_count", 0);
                boolean z = false;
                if (System.currentTimeMillis() - r4.getLong("layering_tool_tooltip_last_seen_ms", 0) < TimeUnit.DAYS.toMillis(3)) {
                    z = true;
                }
                if (!((Boolean) A002.A20.CDM(A002, 1Av.A8a[458])).booleanValue() && i < 3 && !z) {
                    FragmentActivity requireActivity = this.A0l.requireActivity();
                    Context context = this.A0f;
                    String string = context.getString(2131974214);
                    0qQ.A07(string);
                    AnonymousClass5Gt r7 = new AnonymousClass5Gt(requireActivity, new C315476jx((CharSequence) string));
                    r7.A05(new AnonymousClass9UE(interactiveDrawableContainer, (int) f, (int) f2, true));
                    r7.A06(C226262fy.BELOW_ANCHOR);
                    r7.A01 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                    r7.A00().A07((UserSession) null);
                    int i2 = r4.getInt("layering_tool_tooltip_seen_count", 0) + 1;
                    0xY AR4 = r4.AR4();
                    AR4.E5Z("layering_tool_tooltip_seen_count", i2);
                    AR4.apply();
                    long currentTimeMillis = System.currentTimeMillis();
                    0xY AR42 = r4.AR4();
                    AR42.E5c("layering_tool_tooltip_last_seen_ms", currentTimeMillis);
                    AR42.apply();
                }
            }
        }
    }

    public final void DDX() {
        C64962Ll1 ll1 = ((JY9) this.A1L.get()).A0E;
        if (ll1 != null) {
            ll1.A04 = true;
        }
    }

    public final void DDs(int i) {
        B27 b27;
        Integer num = this.A0c;
        if (num != null) {
            A1N(num);
            if (this.A0c == AnonymousClass05K.A0N) {
                27p.A01(this.A0r).A1I(A13(), i, 3);
                C314676if r1 = this.A1e;
                ((C358368an) r1.get()).A0a(i);
                ((C358368an) r1.get()).A0X();
                if (this.A1w && (b27 = this.A0y.A18.A1A) != null) {
                    b27.DDr();
                }
            }
        }
    }

    public final void DDt() {
        this.A0c = this.A0D;
        onBackPressed();
        A1N(AnonymousClass05K.A0Y);
    }

    public final void DFg(boolean z) {
        UserSession userSession = this.A0r;
        AnonymousClass8A1.A01(userSession).A09("StickerOverlayController#onFinishEditingText");
        A1N(AnonymousClass05K.A01);
        ConstrainedEditText constrainedEditText = this.A2L;
        0nA.A0N(constrainedEditText);
        A1E();
        if (A0w(this)) {
            AnonymousClass0eK r0 = this.A1t;
            r0.getClass();
            ((C359318cb) r0.get()).A0y.A03();
        }
        if (z) {
            ((C39963ALf) this.A1S.get()).A03();
        }
        ArrayList arrayList = new ArrayList(C63213KtK.A00(constrainedEditText.getText().toString()));
        if (!arrayList.isEmpty()) {
            ArrayList A002 = LKR.A00(userSession, arrayList);
            if (!A002.isEmpty()) {
                A0j((User) A002.get(0));
            }
        }
    }

    public final void DG0(AnonymousClass9V0 r12, C317876nz r13) {
        C317876nz r9 = new C317876nz(C318046oG.FITNESS_STICKER_CREATION, r13.A0Z, r13.A0O);
        C347017w8 A002 = C347017w8.A00(this.A0f, (Resources.Theme) null, r12, this.A0r, r9, (C321086tY) null);
        C39890ADo A162 = A16();
        A162.A04 = 0.35f;
        A1I(A002, r9, A162, (String) null);
        C354928Nx r3 = this.A0w;
        0wc r2 = r3.A00;
        0Aj A003 = r2.A00(r2.A00, "ig_fitness_stickers");
        if (A003.isSampled()) {
            A003.AAJ("story_session_uuid", r3.A01);
            A003.AAJ(TraceFieldType.AdhocEventName, "ADD_FITNESS_STICKER");
            long j = r12.A01;
            A003.A9F("days_since_selected_sticker_generated", Long.valueOf(TimeUnit.SECONDS.toDays((System.currentTimeMillis() / 1000) - j)));
            A003.AAJ("selected_sticker_type", r12.A02);
            A003.AAJ("selected_sticker_image", r12.A03);
            A003.Cgf();
        }
    }

    public final void DHJ(User user, String str) {
        C19475WaN A012 = C14628Tza.A01(this.A0f, user, "STICKER_TRAY");
        A0Z(this, C369618v3.class);
        this.A1B.E3H(new AnonymousClass8TP(A012));
    }

    public final void DMp() {
        this.A1B.E3H(new Object());
    }

    public final void DMr(int i, boolean z) {
        int ordinal = this.A1B.Atr().ordinal();
        if (ordinal != 20 && ordinal != 21 && ordinal != 25) {
            switch (ordinal) {
                case 17:
                case 19:
                case 31:
                case 32:
                    return;
                default:
                    switch (ordinal) {
                        case 27:
                        case 28:
                        case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                        case 30:
                        case 33:
                        case 59:
                            return;
                        default:
                            ((C358368an) this.A1e.get()).DMr(i, z);
                            return;
                    }
            }
        }
    }

    public final void DNj() {
        C347017w8 A072 = A07(this, C369488uq.class);
        if (A072 != null) {
            A072.A0D();
            C314676if r1 = this.A1e;
            C347017w8 r0 = ((C358368an) r1.get()).A0H;
            r0.getClass();
            r0.A0D();
            IgImageView igImageView = ((C358368an) r1.get()).A1K;
            if (igImageView != null) {
                igImageView.invalidate();
            }
        }
    }

    public final void DVK() {
        Context context;
        View view;
        Drawable background;
        JY9 jy9 = (JY9) this.A1L.get();
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = jy9.A09;
        if (touchInterceptorFrameLayout != null && (context = touchInterceptorFrameLayout.getContext()) != null && (view = jy9.A01) != null && (background = view.getBackground()) != null) {
            background.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.elevatedBackgroundColorDark)), PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Aei, java.lang.Object] */
    public final void DXx(Medium medium) {
        A0Z(this, C389559pp.class);
        ? obj = new Object();
        obj.A00 = medium;
        obj.A01 = null;
        this.A1B.E3H(new AnonymousClass8UW(obj));
    }

    public final void DlC(Drawable drawable, int i, float f, float f2) {
        AnonymousClass80U r4;
        Object r3;
        CameraTool cameraTool;
        String str;
        PromptStickerModel promptStickerModel;
        PromptStickerModel promptStickerModel2;
        GenAIToolInfoDictIntf B91;
        PromptStickerModel promptStickerModel3;
        C19470WaI waI;
        PromptStickerModel promptStickerModel4;
        C389669q0 r1;
        NewFundraiserInfo newFundraiserInfo;
        Set A0F2;
        C19472WaK waK;
        C19474WaM waM;
        String str2;
        int i2;
        int i3;
        int i4;
        int round;
        float pivotY;
        Drawable drawable2 = drawable;
        0qQ.A0B(drawable2, 1);
        boolean z = drawable2 instanceof AnonymousClass5MH;
        Drawable drawable3 = drawable2;
        if (z) {
            drawable3 = ((AnonymousClass5MH) drawable3).A0A;
        }
        if ((drawable3 instanceof C306386Ly) && !(drawable3 instanceof C369898vV)) {
            C356178Sw r7 = new C356178Sw(drawable2, (C306386Ly) drawable3);
            if (!A0u(this) || !(r7.A00 instanceof AnonymousClass5MI) || !this.A1B.CQ0(AnonymousClass80V.MEDIA_EDIT) || !C48789EkC.A00() || AnonymousClass8IK.A01(this.A0r)) {
                this.A1B.E3H(r7);
                AnonymousClass0eK r0 = this.A1t;
                r0.getClass();
                r0.get();
                return;
            }
            C358368an r8 = (C358368an) this.A1e.get();
            C355148Ov r5 = new C355148Ov(r8.A0q, r8.A1J, Integer.valueOf(R.drawable.tts_context_menu_background), true);
            ArrayList arrayList = new ArrayList();
            Resources resources = r8.A0r;
            arrayList.add(new C367618rI(resources.getDrawable(R.drawable.instagram_edit_pano_outline_24), new C40548Adv(drawable2, r8, r7), resources.getString(2131955916)));
            arrayList.add(new C367618rI(resources.getDrawable(R.drawable.instagram_text_to_speech_pano_outline_24), new C65351Lrr(r8, r7), resources.getString(2131955931)));
            r5.A02(arrayList);
            InteractiveDrawableContainer interactiveDrawableContainer = r8.A1n;
            0eP activeDrawableLocation = interactiveDrawableContainer.getActiveDrawableLocation();
            Integer activeDrawableHeight = interactiveDrawableContainer.getActiveDrawableHeight();
            if (activeDrawableLocation == null || activeDrawableHeight == null) {
                round = Math.round(interactiveDrawableContainer.getPivotX());
                pivotY = interactiveDrawableContainer.getPivotY();
            } else {
                round = Math.round(((Number) activeDrawableLocation.A00).floatValue());
                pivotY = ((Number) activeDrawableLocation.A01).floatValue() + ((float) (activeDrawableHeight.intValue() / 3));
            }
            r5.showAsDropDown(interactiveDrawableContainer, round, Math.round(pivotY));
        } else if (drawable3 instanceof C389629pw) {
            C389629pw r32 = (C389629pw) drawable3;
            if (r32.A02) {
                A0k(C389629pw.class);
                this.A1B.E3H(new AnonymousClass8TO(r32.A00));
            }
        } else {
            if (drawable3 instanceof C369618v3) {
                C19475WaN waN = ((C369618v3) drawable3).A09;
                if (waN.A00.A02 != null) {
                    A0Z(this, C369618v3.class);
                    r4 = this.A1B;
                    r3 = new AnonymousClass8TP(waN);
                } else {
                    return;
                }
            } else if (drawable3 instanceof C16147UpY) {
                C18603Vuw vuw = ((C16147UpY) drawable3).A00;
                if (vuw == null) {
                    0qQ.A0F("smbSupportStickerModel");
                    throw AnonymousClass00P.createAndThrow();
                } else if (vuw.A00.A0A == null) {
                    A0X(this, vuw);
                    return;
                } else {
                    return;
                }
            } else {
                int i5 = i;
                if (drawable3 instanceof C389569pq) {
                    C389569pq r33 = (C389569pq) drawable3;
                    boolean z2 = r33.A0D;
                    if (z2) {
                        r33.A0B.A00();
                        boolean z3 = !r33.A04;
                        r33.A04 = z3;
                        if (z3) {
                            i2 = r33.A08;
                        } else {
                            i2 = r33.A06;
                        }
                        r33.A02 = i2;
                        if (z3) {
                            i3 = r33.A00;
                        } else {
                            i3 = r33.A07;
                        }
                        r33.A03 = i3;
                        if (z3) {
                            i4 = r33.A0A;
                        } else {
                            i4 = r33.A09;
                        }
                        r33.A01 = i4;
                        C389569pq.A00(r33);
                        Rect bounds = r33.getBounds();
                        0qQ.A07(bounds);
                        int i6 = (int) (((float) (r33.getBounds().left + r33.getBounds().right)) / 2.0f);
                        int i7 = r33.A03 / 2;
                        int i8 = bounds.top;
                        r33.setBounds(i6 - i7, i8, i6 + i7, r33.A02 + i8);
                        r33.invalidateSelf();
                    }
                    B3f A002 = InteractiveDrawableContainer.A00(r33, this.A1m);
                    if (A002 != null) {
                        A002.Cno(true);
                    }
                    Object obj = this.A0g.get(i5);
                    obj.getClass();
                    C273914nO r12 = (C273914nO) obj;
                    if (!z2 || r33.A04) {
                        str2 = "share_professional_no_thumbnails";
                    } else {
                        str2 = "share_professional_thumbnails";
                    }
                    List singletonList = Collections.singletonList(str2);
                    0qQ.A07(singletonList);
                    r12.A06 = singletonList;
                    return;
                } else if (drawable3 instanceof C389529pm) {
                    A0I();
                    return;
                } else if (drawable3 instanceof C369648v6) {
                    C369648v6 r34 = (C369648v6) drawable3;
                    if (r34 == null || r34.A0B) {
                        waM = null;
                    } else {
                        waM = r34.A09;
                    }
                    A0k(C369648v6.class);
                    r4 = this.A1B;
                    r3 = new AnonymousClass8UC(waM);
                } else if (drawable3 instanceof C369668v8) {
                    C369668v8 r35 = (C369668v8) drawable3;
                    C19469WaH waH = r35.A03;
                    if (waH.A09()) {
                        A0Z(this, C369668v8.class);
                        r4 = this.A1B;
                        r3 = new AnonymousClass8UE(waH);
                    } else {
                        A0f(r35);
                        return;
                    }
                } else if (drawable3 instanceof C16152Upd) {
                    A0i((C16152Upd) drawable3);
                    return;
                } else if (drawable3 instanceof C59812JZg) {
                    PromptStickerModel promptStickerModel5 = ((C59812JZg) drawable3).A06;
                    if (promptStickerModel5.A0L()) {
                        return;
                    }
                    if (promptStickerModel5.A0H()) {
                        A0g(promptStickerModel5);
                        return;
                    }
                    A0k(C59812JZg.class);
                    r4 = this.A1B;
                    r3 = new AnonymousClass8T9(promptStickerModel5);
                } else if (drawable3 instanceof C369658v7) {
                    A0k(C369658v7.class);
                    r4 = this.A1B;
                    r3 = new Object();
                } else if (drawable3 instanceof C369728vE) {
                    A0W(this, (C369728vE) drawable3);
                    return;
                } else if (drawable3 instanceof C16149Upa) {
                    A0k(C16149Upa.class);
                    r4 = this.A1B;
                    r3 = new AnonymousClass8T7(((C16149Upa) drawable3).A0H);
                } else if (drawable3 instanceof C16145UpW) {
                    C16145UpW upW = (C16145UpW) drawable3;
                    A0k(C16145UpW.class);
                    r4 = this.A1B;
                    if (upW != null) {
                        waK = upW.A0B;
                    } else {
                        waK = null;
                    }
                    r3 = new AnonymousClass8TB(waK);
                } else if (drawable3 instanceof B3d) {
                    A0L(drawable3);
                    return;
                } else if (drawable3 instanceof AnonymousClass5MM) {
                    if (!z) {
                        drawable2 = drawable3;
                    }
                    A1F(drawable2);
                    return;
                } else if (drawable3 instanceof C16144UpV) {
                    C61227JzL jzL = ((C16144UpV) drawable3).A0A;
                    jzL.getClass();
                    A0Z(this, C16144UpV.class);
                    r4 = this.A1B;
                    r3 = new AnonymousClass8TT(jzL);
                } else if (drawable3 instanceof C347017w8) {
                    C347017w8 r2 = (C347017w8) drawable3;
                    Drawable A042 = r2.A04();
                    0qQ.A07(A042);
                    if (!(A042 instanceof C369768vI) || ((C369768vI) A042).A0M != C318046oG.AVATAR_STATIC || (A0F2 = A0F(this)) == null || !A0F2.contains(Integer.valueOf(i5))) {
                        0qQ.A0C(drawable3, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.RotatableDrawable");
                        Object obj2 = r2.A03;
                        if ((obj2 instanceof C3499082j) && ((C3499082j) obj2).A01 != null) {
                            UserSession userSession = this.A0r;
                            if (182.A06(0Tu.A06, userSession, 36318449613412481L)) {
                                0qQ.A0C(drawable3, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.RotatableDrawable");
                                Object obj3 = r2.A03;
                                if (!(obj3 instanceof C3499082j)) {
                                    newFundraiserInfo = null;
                                } else {
                                    newFundraiserInfo = ((C3499082j) obj3).A01;
                                }
                                newFundraiserInfo.getClass();
                                FragmentActivity requireActivity = this.A0l.requireActivity();
                                String str3 = newFundraiserInfo.A01;
                                str3.getClass();
                                String str4 = newFundraiserInfo.A07;
                                Integer valueOf = Integer.valueOf(newFundraiserInfo.A00);
                                String str5 = newFundraiserInfo.A05;
                                List list = newFundraiserInfo.A08;
                                String str6 = this.A1p;
                                String A003 = AnonymousClass000.A00(1026);
                                HashMap hashMap = new HashMap();
                                hashMap.put("charity_id", str3);
                                hashMap.put("source_name", A003);
                                if (str4 != null) {
                                    hashMap.put(AnonymousClass000.A00(1463), str4);
                                }
                                if (valueOf != null) {
                                    hashMap.put(AnonymousClass000.A00(1458), valueOf.toString());
                                }
                                if (str5 != null) {
                                    hashMap.put(AnonymousClass000.A00(1457), str5);
                                }
                                if (list != null) {
                                    hashMap.put(AnonymousClass000.A00(1461), list.toString());
                                }
                                hashMap.put(AnonymousClass000.A00(1529), "True");
                                if (str6 != null) {
                                    hashMap.put(Pxd.A00(14), str6);
                                }
                                C46649DiU A043 = C46649DiU.A04(AnonymousClass000.A00(2879), hashMap);
                                IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
                                igBloksScreenConfig.A0l = false;
                                igBloksScreenConfig.A0k = false;
                                igBloksScreenConfig.A0i = true;
                                AnonymousClass6W8 r10 = new AnonymousClass6W8(requireActivity, C49891FBs.A00(igBloksScreenConfig, A043), userSession, ModalActivity.class, "bloks");
                                r10.A07();
                                r10.A0C(requireActivity);
                                return;
                            }
                        }
                        Drawable A044 = r2.A04();
                        0qQ.A07(A044);
                        if (A044 instanceof C369768vI) {
                            String str7 = ((C369768vI) A044).A0O;
                            0qQ.A07(str7);
                            if (00l.A0d(str7, "earth_day", false)) {
                                UserSession userSession2 = this.A0r;
                                if (182.A06(0Tu.A05, userSession2, 36318870520207909L)) {
                                    LTV.A06(this.A0l.requireActivity(), userSession2, AnonymousClass05K.A00, "STORY_COMPOSITION");
                                    return;
                                }
                            }
                        }
                        Object obj4 = r2.A03;
                        if (obj4 instanceof C387339m3) {
                            0qQ.A0C(obj4, "null cannot be cast to non-null type com.instagram.reels.groupmention.model.GroupMentionStickerModel");
                            if (((C387339m3) obj4).A04.length() == 0) {
                                Drawable A045 = r2.A04();
                                0qQ.A0C(A045, "null cannot be cast to non-null type com.instagram.reels.groupmention.view.GroupMentionStickerDrawable");
                                C387339m3 r13 = ((C389639px) A045).A04;
                                r13.getClass();
                                AnonymousClass0eK r02 = this.A1t;
                                r02.getClass();
                                ((C359318cb) r02.get()).A0M(r2);
                                this.A1m.A0S(r2);
                                r4 = this.A1B;
                                r3 = new C356378Tq(r13);
                            }
                        }
                        Drawable A046 = r2.A04();
                        StoryPromptType storyPromptType = null;
                        if (!(A046 instanceof C389669q0) || (r1 = (C389669q0) A046) == null) {
                            promptStickerModel4 = null;
                        } else {
                            promptStickerModel4 = r1.A04;
                            if (promptStickerModel4 != null) {
                                storyPromptType = promptStickerModel4.A03();
                            }
                        }
                        if (storyPromptType != StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP || promptStickerModel4.A0L()) {
                            A1G(drawable3, i5);
                            return;
                        } else {
                            this.A0y.A0i(C318046oG.MAGIC_MOD_ADD_YOURS_BACKDROP);
                            return;
                        }
                    } else {
                        C59689JTv.A0F(this.A0f, "item_cant_be_changed", 2131964513);
                        return;
                    }
                } else if (drawable3 instanceof C16148UpZ) {
                    C16148UpZ upZ = (C16148UpZ) drawable3;
                    A0k(C16148UpZ.class);
                    r4 = this.A1B;
                    if (upZ != null) {
                        waI = upZ.A01;
                    } else {
                        waI = null;
                    }
                    r3 = new AnonymousClass8UG(waI);
                } else if (drawable3 instanceof C389539pn) {
                    A0H();
                    return;
                } else {
                    if (drawable3 instanceof C354798Nk) {
                        C354798Nk r14 = (C354798Nk) drawable3;
                        if (r14.A0B.A0M()) {
                            A0h(r14);
                            return;
                        }
                    }
                    if (drawable3 instanceof KWD) {
                        KWD kwd = (KWD) drawable3;
                        C40602Aeq aeq = kwd.A00;
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("entrypoint", "bio_ig_story");
                        hashMap2.put("currency_code", aeq.A01);
                        hashMap2.put("variants", aeq.A04);
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("initial_price", aeq.A02);
                        hashMap3.put(AnonymousClass000.A00(1460), aeq.A03);
                        hashMap3.put("callback", new Q3B(new G4S(new B0C(1, this, aeq, kwd), 49)));
                        A0l(hashMap2, hashMap3);
                        return;
                    } else if (drawable3 instanceof C346987w5) {
                        C40595Aej aej = ((C346987w5) drawable3).A02;
                        0qQ.A0C(aej, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.model.SecretStickerClientModel");
                        A0k(C346987w5.class);
                        r4 = this.A1B;
                        r3 = new AnonymousClass8UX(aej);
                    } else if (drawable3 instanceof KWF) {
                        KWF A0D2 = A0D(this);
                        if (A0D2 == null || (promptStickerModel3 = A0D2.A04) == null || !promptStickerModel3.A0L()) {
                            KWF A0D3 = A0D(this);
                            if (A0D3 == null || (promptStickerModel2 = A0D3.A04) == null || (B91 = promptStickerModel2.A00.B91()) == null) {
                                cameraTool = null;
                            } else {
                                cameraTool = B91.C8A();
                            }
                            if (cameraTool != CameraTool.MEMU_IN_FEED_WITH_MIMICRY) {
                                if (A0D(this) != null) {
                                    this.A0A = A0D(this);
                                    A0k(KWF.class);
                                }
                                C314676if r22 = this.A1R;
                                C64875Ljb ljb = (C64875Ljb) r22.get();
                                ComposeView composeView = ljb.A00;
                                if (composeView != null) {
                                    composeView.setVisibility(0);
                                }
                                ljb.A02 = false;
                                ljb.A05.A01();
                                C64875Ljb ljb2 = (C64875Ljb) r22.get();
                                KWF kwf = this.A0A;
                                if (kwf == null || (promptStickerModel = kwf.A04) == null || (str = promptStickerModel.A00.getText()) == null) {
                                    str = "";
                                }
                                C52961GgE ggE = ljb2.A08;
                                String substring = str.substring(0, str.length() - " me".length());
                                0qQ.A07(substring);
                                C285975Tl A004 = HY8.A00(new C285975Tl(substring, C285965Tk.A01));
                                0qQ.A0B(A004, 0);
                                C284945Oz r03 = ggE.A01;
                                r03.Epw(A004);
                                Object value = r03.getValue();
                                0qQ.A0B(value, 0);
                                ggE.A00.Epw(value);
                                r4 = this.A1B;
                                r3 = new Object();
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (drawable3 instanceof C346997w6) {
                        MusicPickStickerModel musicPickStickerModel = ((C346997w6) drawable3).A01;
                        A0k(C346997w6.class);
                        r4 = this.A1B;
                        r3 = new C356588Ul((MusicPickReelTag) null, musicPickStickerModel);
                    } else if (drawable3 instanceof C389609pu) {
                        C40593Aeh aeh = ((C389609pu) drawable3).A03;
                        C40593Aeh aeh2 = null;
                        if (aeh != null) {
                            aeh2 = aeh;
                        }
                        A0Z(this, C389609pu.class);
                        A0Z(this, C16152Upd.class);
                        r4 = this.A1B;
                        r3 = new C356598Um(aeh2);
                    } else {
                        if (drawable3 instanceof C369908vW) {
                            if (!182.A06(0Tu.A05, this.A0r, 36325519129785352L)) {
                                return;
                            }
                        } else if (drawable3 instanceof C359008bp) {
                            C359008bp r36 = (C359008bp) drawable3;
                            if (r36.A02 == null || r36.A0I != AnonymousClass05K.A00) {
                                Integer num = r36.A0I;
                                if (num.intValue() == 0) {
                                    r4 = this.A1B;
                                    r3 = new C356568Uj(i5, num);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                        r4 = this.A1B;
                        r3 = new C356508Ud(i5);
                    }
                }
            }
            r4.E3H(r3);
        }
    }

    public final void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1m;
        ArrayList A0V2 = interactiveDrawableContainer.A0V(C369818vN.class);
        float f5 = f;
        float f6 = f2;
        if ((!A0V2.isEmpty()) && ((Drawable) A0V2.get(0)).getBounds().contains((int) f, (int) f2)) {
            UserSession userSession = this.A0r;
            if (!182.A06(0Tu.A05, userSession, 36319858362752697L) && 25x.A00(userSession).A01.A00 == C299715vi.A00) {
                if (!A0V2.isEmpty()) {
                    ((C369818vN) A0V2.get(0)).A04.A00();
                }
                int i2 = this.A00 + 1;
                int i3 = this.A01;
                int i4 = 0;
                if (i3 < i2 - 1) {
                    i4 = i3 + 1;
                }
                this.A01 = i4;
                A0J(i4, i2, 1);
                return;
            }
        }
        C357638Yz r1 = this.A0t;
        if (!(r1.A08.A00 instanceof AnonymousClass80O) && !r1.A0V(C358088aL.A0o)) {
            AnonymousClass82Y r0 = this.A13.A02.A01;
            UserSession userSession2 = this.A0r;
            C3498482b r6 = r0.A04;
            AnonymousClass81W r12 = ((NineSixteenLayoutConfigImpl) this.A10).A0K;
            if (!AnonymousClass91L.A07(this.A0f, userSession2, r6, interactiveDrawableContainer, f5, f6, (float) r12.getWidth(), (float) r12.getHeight())) {
                this.A1B.E3H(new Object());
            }
        }
    }

    public final void DmS() {
        A1N(AnonymousClass05K.A0N);
    }

    public final void Dn0(View view, C317876nz r3) {
        Cw1(view, new C317456nI(r3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0044, code lost:
        if ((((X.C347017w8) r6).A04() instanceof X.C389669q0) == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x036e, code lost:
        if (X.182.A06(X.0Tu.A05, r9, 36323302926462007L) == false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dn8(X.C2802350v r44, java.lang.String r45) {
        /*
            r43 = this;
            r4 = r44
            r7 = 0
            X.0qQ.A0B(r4, r7)
            r5 = r43
            X.6if r0 = r5.A1e
            java.lang.Object r0 = r0.get()
            X.8an r0 = (X.C358368an) r0
            r0.A0Z()
            X.8BE r0 = r5.A07
            boolean r0 = r0.AFN(r4)
            r3 = 1
            if (r0 == 0) goto L_0x01bc
            android.content.Context r10 = r5.A0f
            com.instagram.common.session.UserSession r9 = r5.A0r
            X.0iw r0 = r5.A0o
            java.lang.String r17 = r0.getModuleName()
            X.4yO r0 = r5.A05
            r15 = 0
            r11 = r9
            r12 = r0
            r13 = r15
            r14 = r4
            r16 = r15
            r18 = r3
            android.graphics.drawable.Drawable r6 = X.C39900AIi.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = r6 instanceof X.C347017w8
            r2 = 0
            if (r0 == 0) goto L_0x0046
            r0 = r6
            X.7w8 r0 = (X.C347017w8) r0
            android.graphics.drawable.Drawable r0 = r0.A04()
            boolean r0 = r0 instanceof X.C389669q0
            r14 = 1
            if (r0 != 0) goto L_0x0047
        L_0x0046:
            r14 = 0
        L_0x0047:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r11 = r5.A10
            boolean r0 = r11.CTv()
            if (r0 == 0) goto L_0x0372
            r8 = 0
        L_0x0050:
            java.lang.Integer r0 = r4.CAk()
            int r0 = r0.intValue()
            switch(r0) {
                case 8: goto L_0x032d;
                case 26: goto L_0x0347;
                case 28: goto L_0x0306;
                case 31: goto L_0x02fb;
                case 33: goto L_0x0354;
                case 34: goto L_0x02ee;
                case 36: goto L_0x033a;
                case 47: goto L_0x0313;
                case 65: goto L_0x0320;
                default: goto L_0x005b;
            }
        L_0x005b:
            r12 = 0
        L_0x005c:
            if (r14 == 0) goto L_0x02d7
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.RotatableDrawable"
            X.0qQ.A0C(r6, r0)
            r0 = r6
            X.7w8 r0 = (X.C347017w8) r0
            android.graphics.drawable.Drawable r1 = r0.A04()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.reels.prompt.view.AnimatedPromptMagicModStickerDrawable"
            X.0qQ.A0C(r1, r0)
            X.9q0 r1 = (X.C389669q0) r1
            int r0 = r1.A01
            int r0 = r0 - r8
            r11 = 81
            r8 = 0
            float r0 = (float) r0
            X.Ut8 r1 = new X.Ut8
            r1.<init>(r11, r8, r0)
        L_0x007d:
            X.0qQ.A0A(r1)
            java.lang.Integer r0 = r4.CAk()
            int r0 = r0.intValue()
            switch(r0) {
                case 2: goto L_0x02d4;
                case 3: goto L_0x02d4;
                case 25: goto L_0x02d4;
                case 28: goto L_0x02d4;
                case 29: goto L_0x02d4;
                case 30: goto L_0x02d4;
                case 31: goto L_0x02d4;
                case 32: goto L_0x02d4;
                case 33: goto L_0x02d4;
                case 34: goto L_0x02d4;
                case 36: goto L_0x02d4;
                case 56: goto L_0x02d4;
                case 63: goto L_0x02d4;
                case 65: goto L_0x02d4;
                case 70: goto L_0x02d4;
                case 74: goto L_0x02d4;
                default: goto L_0x008b;
            }
        L_0x008b:
            boolean r0 = r6 instanceof X.C346997w6
            if (r0 == 0) goto L_0x02b6
            X.6if r0 = r5.A1T
            java.lang.Object r0 = r0.get()
            X.LmU r0 = (X.C65050LmU) r0
            com.instagram.reels.musicpick.model.MusicPickReelTag r11 = r0.A01
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            if (r11 == 0) goto L_0x0298
            android.view.ViewGroup r0 = r5.A0i
            int r9 = r0.getWidth()
            int r1 = r0.getHeight()
            float r0 = r11.A00
            X.C306746Ni.A01(r8, r11, r0, r9, r1)
            int r1 = r6.getIntrinsicWidth()
            int r10 = r6.getIntrinsicHeight()
            int r0 = r8.width()
            float r9 = (float) r0
            float r0 = (float) r1
            float r9 = r9 / r0
            int r0 = r8.height()
            float r1 = (float) r0
            float r0 = (float) r10
            float r1 = r1 / r0
            float r25 = java.lang.Math.max(r9, r1)
            float r1 = r11.A01
            r0 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 * r0
            X.Ut6 r14 = new X.Ut6
            r14.<init>(r8)
            java.lang.String r20 = "StickerOverlayController"
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            r23 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.6b1 r13 = new X.6b1
            r18 = r15
            r19 = r15
            r21 = r15
            r22 = r15
            r24 = r23
            r26 = r23
            r27 = r1
            r28 = r7
            r29 = r3
            r30 = r7
            r31 = r3
            r32 = r7
            r33 = r7
            r34 = r7
            r35 = r3
            r36 = r7
            r37 = r7
            r38 = r7
            r39 = r7
            r40 = r7
            r41 = r7
            r42 = r7
            r13.<init>((X.AnonymousClass8BH) r14, (X.AnonymousClass8DA) r15, (X.C3510487j) r16, (java.lang.Integer) r17, (java.lang.Integer) r18, (java.lang.Integer) r19, (java.lang.Object) r20, (java.lang.String) r21, (java.util.List) r22, (float) r23, (float) r24, (float) r25, (float) r26, (float) r27, (int) r28, (boolean) r29, (boolean) r30, (boolean) r31, (boolean) r32, (boolean) r33, (boolean) r34, (boolean) r35, (boolean) r36, (boolean) r37, (boolean) r38, (boolean) r39, (boolean) r40, (boolean) r41, (boolean) r42)
        L_0x010a:
            r13.A0P = r2
            java.lang.Integer r0 = r4.CAk()
            int r1 = r0.intValue()
            r0 = 13
            r2 = r45
            if (r1 == r0) goto L_0x0290
            r0 = 20
            if (r1 == r0) goto L_0x0270
            X.4nO r0 = r4.BkW()
            java.util.List r0 = r0.A06
            X.0qQ.A07(r0)
        L_0x0127:
            r5.A0z(r6, r13, r2, r0)
        L_0x012a:
            X.8un r2 = r5.A0B
            if (r2 == 0) goto L_0x0187
            if (r12 == 0) goto L_0x0269
            X.8Md r9 = r5.A1C
            X.0qQ.A0B(r6, r3)
            X.8Mg r8 = r9.A03
            r8.A07 = r6
            X.8Md r0 = r8.A08
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r10 = r0.A04
            float r1 = r10.A0F(r6)
            r8.A01 = r1
            float r0 = r2.A01
            float r0 = r0 - r1
            r8.A05 = r0
            float r1 = r10.A0G(r6)
            r8.A02 = r1
            float r0 = r2.A02
            float r0 = r0 - r1
            r8.A06 = r0
            java.lang.Float r0 = r10.A0R(r6)
            if (r0 == 0) goto L_0x0265
            float r1 = r0.floatValue()
        L_0x015d:
            r8.A00 = r1
            float r0 = r2.A06
            float r0 = r0 - r1
            r8.A04 = r0
            float r2 = r2.A05
            float r1 = java.lang.Math.abs(r2)
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x017b
            r0 = 0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r0 = -360(0xfffffffffffffe98, float:NaN)
            if (r1 >= 0) goto L_0x0179
            r0 = 360(0x168, float:5.04E-43)
        L_0x0179:
            float r0 = (float) r0
            float r2 = r2 + r0
        L_0x017b:
            r8.A03 = r2
            X.2cs r0 = r9.A01
            r0.A0A(r8)
            r0.A03()
        L_0x0185:
            r5.A0B = r15
        L_0x0187:
            java.util.Map r8 = r5.A2M
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x01bc
            boolean r0 = r6 instanceof X.C299875vz
            if (r0 == 0) goto L_0x01bc
            r0 = r6
            X.5vz r0 = (X.C299875vz) r0
            java.lang.String r2 = r0.A09()
            X.0qQ.A07(r2)
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x01bc
            boolean r0 = r8.containsKey(r2)
            if (r0 == 0) goto L_0x01bc
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r5.A1m
            java.lang.Object r0 = r8.get(r2)
            X.0qQ.A0A(r0)
            X.8un r0 = (X.C369458un) r0
            r1.A0r(r6, r0)
            r8.remove(r2)
        L_0x01bc:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r5.A1N(r0)
            r5.A1Q(r3)
            X.8BA r0 = r5.A0y
            X.0eK r0 = r0.A1v
            java.lang.Object r6 = r0.get()
            X.8Wi r6 = (X.C357068Wi) r6
            if (r6 == 0) goto L_0x0264
            boolean r0 = r4 instanceof com.instagram.reels.prompt.model.PromptStickerModel
            if (r0 == 0) goto L_0x01de
            X.82p r0 = r6.A0E
            X.82o r0 = r0.A02
            com.instagram.reels.prompt.model.PromptStickerModel r4 = (com.instagram.reels.prompt.model.PromptStickerModel) r4
            X.82Y r0 = r0.A01
            r0.A09 = r4
        L_0x01de:
            com.instagram.common.session.UserSession r8 = r6.A06
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r8)
            boolean r0 = r0.A2L()
            if (r0 == 0) goto L_0x0264
            X.8BA r1 = r6.A0A
            X.8C9 r0 = r1.A1D
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r0.A03
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x0264
            java.util.ArrayList r0 = r1.A0V()
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x0264
            int r0 = r6.A00
            long r4 = (long) r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36603094276117357(0x820a520002136d, double:3.21128243682246E-306)
            long r1 = X.182.A01(r2, r8, r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0264
            X.8Wh r5 = r6.A04
            X.3Q2 r0 = X.C357068Wi.A00(r6)
            X.AuN r4 = new X.AuN
            r4.<init>(r6)
            X.0qQ.A0B(r0, r7)
            X.2IV r3 = X.C357058Wh.A00(r5, r0, r3)
            r15 = 0
            X.2IS r2 = new X.2IS
            r2.<init>()
            X.2IS r1 = new X.2IS
            r1.<init>()
            java.lang.String r0 = "input"
            r2.A00(r3, r0)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r9 = X.AnonymousClass1vS.A00()
            java.util.Map r11 = r2.getParamsCopy()
            java.util.Map r12 = r1.getParamsCopy()
            java.lang.Class<X.9eU> r13 = X.C382769eU.class
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.lang.String r10 = "ValidateIgStoryInteractiveElementsForAdsEligibilityQuery"
            java.lang.String r18 = "validate_ig_story_interactive_elements_for_ads_eligibility"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r7
            r17 = r15
            r8 = r3
            r14 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1vn r2 = r5.A05
            X.ASv r1 = new X.ASv
            r1.<init>(r5, r4)
            X.ASl r0 = X.C40120ASl.A00
            r2.ATL(r0, r1, r3)
        L_0x0264:
            return
        L_0x0265:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x015d
        L_0x0269:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r5.A1m
            r0.A0r(r6, r2)
            goto L_0x0185
        L_0x0270:
            X.6nz r0 = X.C317876nz.A18
            java.util.ArrayList r0 = r0.A01()
            r5.A0z(r6, r13, r2, r0)
            r0 = r4
            X.9m6 r0 = (X.C387369m6) r0
            com.instagram.user.model.User r1 = r0.A03
            if (r1 == 0) goto L_0x012a
            X.6if r0 = r5.A1S
            java.lang.Object r0 = r0.get()
            X.ALf r0 = (X.C39963ALf) r0
            r0.A03()
            r5.A0j(r1)
            goto L_0x012a
        L_0x0290:
            X.6nz r0 = X.C317876nz.A0u
            java.util.ArrayList r0 = r0.A01()
            goto L_0x0127
        L_0x0298:
            X.8Yz r0 = r5.A0t
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            java.lang.String r21 = "StickerOverlayController"
            r16 = r10
            r17 = r9
            r18 = r0
            r19 = r4
            r20 = r1
            r22 = r7
            r23 = r7
            X.6b1 r13 = X.C39900AIi.A03(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x010a
        L_0x02b6:
            X.8Yz r0 = r5.A0t
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            java.lang.String r21 = "StickerOverlayController"
            r16 = r10
            r17 = r9
            r18 = r0
            r19 = r4
            r20 = r1
            r22 = r7
            r23 = r7
            X.6b1 r13 = X.C39900AIi.A03(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x010a
        L_0x02d4:
            r2 = 1
            goto L_0x008b
        L_0x02d7:
            X.8BE r1 = r5.A07
            if (r12 == 0) goto L_0x02e8
            r13.getClass()
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r11 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r11
            int r0 = r11.A0J
            X.8BH r1 = r1.Az5(r13, r0)
            goto L_0x007d
        L_0x02e8:
            X.8BH r1 = r1.Az4()
            goto L_0x007d
        L_0x02ee:
            X.6if r0 = r5.A1X
            java.lang.Object r0 = r0.get()
            X.AOd r0 = (X.C40021AOd) r0
            android.view.View r13 = r0.Azx()
            goto L_0x0360
        L_0x02fb:
            X.6if r0 = r5.A2B
            java.lang.Object r0 = r0.get()
            X.WBM r0 = (X.WBM) r0
            android.view.View r13 = r0.A02
            goto L_0x0360
        L_0x0306:
            X.6if r0 = r5.A2A
            java.lang.Object r0 = r0.get()
            X.LmT r0 = (X.C65049LmT) r0
            android.view.View r13 = r0.Azx()
            goto L_0x0360
        L_0x0313:
            X.6if r0 = r5.A2D
            java.lang.Object r0 = r0.get()
            X.WUZ r0 = (X.WUZ) r0
            android.view.View r13 = r0.Azx()
            goto L_0x0360
        L_0x0320:
            X.6if r0 = r5.A1T
            java.lang.Object r0 = r0.get()
            X.LmU r0 = (X.C65050LmU) r0
            android.view.View r13 = r0.Azx()
            goto L_0x0360
        L_0x032d:
            X.6if r0 = r5.A21
            java.lang.Object r0 = r0.get()
            X.WUv r0 = (X.C19339WUv) r0
            android.view.View r13 = r0.Azx()
            goto L_0x0360
        L_0x033a:
            X.6if r0 = r5.A2F
            java.lang.Object r0 = r0.get()
            X.WDA r0 = (X.WDA) r0
            android.view.View r13 = r0.Azx()
            goto L_0x0360
        L_0x0347:
            X.6if r0 = r5.A28
            java.lang.Object r0 = r0.get()
            X.WUa r0 = (X.C19318WUa) r0
            android.view.View r13 = r0.Azx()
            goto L_0x0360
        L_0x0354:
            X.6if r0 = r5.A2C
            java.lang.Object r0 = r0.get()
            X.WBN r0 = (X.WBN) r0
            android.view.View r13 = r0.Azx()
        L_0x0360:
            if (r13 == 0) goto L_0x005b
            X.0Tu r12 = X.0Tu.A05
            r0 = 36323302926462007(0x810bda00002c37, double:3.0343412606710815E-306)
            boolean r0 = X.182.A06(r12, r9, r0)
            r12 = 1
            if (r0 != 0) goto L_0x005c
            goto L_0x005b
        L_0x0372:
            r0 = r11
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            int r8 = r0.A08
            int r0 = r0.A0B
            int r8 = r8 - r0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.Dn8(X.50v, java.lang.String):void");
    }

    public final void DnA() {
        Integer num = AnonymousClass05K.A01;
        A1N(num);
        this.A0c = num;
    }

    public final void Dqy(String str) {
        C354158Kw r6;
        C357068Wi r0 = (C357068Wi) this.A0y.A1v.get();
        if (r0 != null) {
            AnonymousClass8K4 r3 = r0.A09;
            C3499482o r2 = r3.A0I.A02;
            C357638Yz r02 = r2.A01.A0X;
            r02.getClass();
            if (r02.A08.A00 == AnonymousClass9QA.A00 && r2.A01() == C365758nd.A04 && (r6 = r3.A0c) != null) {
                L0E l0e = new L0E(r3);
                AnonymousClass19S A022 = 19E.A02(new AnonymousClass12U().AOJ(497892810, 3));
                1Eo.A05(19B.A00, new C59842JaI(l0e, r6, str, (AnonymousClass4D7) null, 21), A022);
                11Z.A02(new C40770Aj0(r3));
            }
        }
    }

    public final void Dr4() {
        this.A1B.E3H(new Object());
        boolean z = false;
        if (A07(this, C369488uq.class) != null) {
            z = true;
        }
        A0m(z);
    }

    public final void Dsb() {
        Integer num;
        Integer num2 = this.A0D;
        if (num2 == AnonymousClass05K.A05) {
            C357068Wi r2 = (C357068Wi) this.A0y.A1v.get();
            if (r2 != null) {
                if (r2.A01) {
                    r2.A0N.A00().Exh();
                    if (r2.A0J.CZe()) {
                        C314676if r1 = r2.A0A.A1g;
                        if (r1.A03 && ((AnonymousClass8ME) r1.get()).A1R()) {
                            r2.A0O.A00().Exh();
                        }
                    }
                    C378369Pn r0 = r2.A0B.A0B;
                    if (r0 != null) {
                        r0.CnC();
                    }
                    r2.A01 = false;
                }
                C3502083s r02 = r2.A0I;
                if (r02 != null) {
                    r02.EvX();
                }
            }
            AnonymousClass80U r22 = this.A1B;
            if (r22.CQ0(AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE)) {
                AnonymousClass0eK r03 = this.A1t;
                r03.getClass();
                ((C359318cb) r03.get()).A0I();
            }
            if (r22.Atr() == AnonymousClass80V.ASSET_PICKER && ((JY9) this.A1L.get()).A0Q()) {
                num = AnonymousClass05K.A04;
            } else if (!r22.CZe() || this.A1m.getInteractiveDrawables().size() > 0) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0C;
            }
            A1N(num);
        } else if (num2 == AnonymousClass05K.A06) {
            C354508Mh r12 = this.A15;
            if (r12.A00 != null) {
                AnonymousClass88K r04 = r12.A02;
                r04.A05();
                r04.A06(r12);
            }
        }
        AnonymousClass80U r13 = this.A1B;
        if (r13.CQ0(AnonymousClass80V.STICKER_LAYERING)) {
            r13.E3H(new Object());
        }
        if (r13.CQ0(AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE)) {
            ((C359318cb) this.A1t.get()).DBP(true);
        }
    }

    public final void DvI(UpcomingEvent upcomingEvent) {
        Dn8(new C40592Aeg(upcomingEvent), (String) null);
    }

    public final void E0r(int i) {
        Drawable drawable;
        B3f A0P2 = this.A1m.A0P(i);
        if (A0P2 != null) {
            drawable = ((C378669Qs) A0P2).A0B;
        } else {
            drawable = null;
        }
        if (drawable instanceof C347017w8) {
            C347017w8 r2 = (C347017w8) drawable;
            A1N(AnonymousClass05K.A06);
            r2.A08();
            Object obj = this.A0g.get(i);
            obj.getClass();
            ((C273914nO) obj).A01(r2.A00);
            C354508Mh r1 = this.A15;
            r1.A00 = r2;
            AnonymousClass88K r0 = r1.A02;
            r0.A05();
            r0.A06(r1);
        }
    }

    public final void FIJ(boolean z) {
        AnonymousClass861 r0 = this.A1f;
        if (z) {
            r0.A01();
        } else {
            r0.A03();
        }
    }

    public final void FJt(boolean z) {
        if (this.A0D == AnonymousClass05K.A03) {
            AYL ayl = (AYL) this.A1b.get();
            ayl.A00 = ((C358368an) this.A1e.get()).A00;
            AYL.A02(ayl);
        }
        if (z) {
            if (!this.A0W) {
                if (!((C358958bk) this.A1Q.get()).A03.containsKey(A15())) {
                    return;
                }
            }
            C347017w8 A072 = A07(this, C369488uq.class);
            if (A072 != null) {
                C314676if r1 = this.A1e;
                C306576Mr A0T2 = ((C358368an) r1.get()).A0T();
                0qQ.A07(A0T2);
                AHM.A03(A072, A0T2);
                AHM.A02(A072, ((C358368an) r1.get()).A00);
            }
            C314676if r2 = this.A1e;
            C347017w8 r12 = ((C358368an) r2.get()).A0H;
            if (r12 != null) {
                C306576Mr A0T3 = ((C358368an) r2.get()).A0T();
                0qQ.A07(A0T3);
                AHM.A03(r12, A0T3);
                AHM.A02(r12, ((C358368an) r2.get()).A00);
            }
            IgImageView igImageView = ((C358368an) r2.get()).A1K;
            if (igImageView != null) {
                igImageView.invalidate();
            }
        }
    }

    public final void FKD(C306386Ly r4) {
        Object obj;
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1m;
        interactiveDrawableContainer.A0m(r4);
        if (A0s(r4) && this.A13.A02.A01() == C365758nd.A04) {
            this.A1K.A02(interactiveDrawableContainer.A0T(new AWM(this)));
        }
        C314676if r2 = this.A1Q;
        AnonymousClass9IZ r0 = (AnonymousClass9IZ) ((C358958bk) r2.get()).A03.get(r4);
        if (r0 != null) {
            obj = r0.A03;
        } else {
            obj = null;
        }
        if ((obj instanceof C347017w8) && obj != null) {
            C358958bk r22 = (C358958bk) r2.get();
            ((C358368an) this.A1e.get()).A1Z.get();
            C358958bk.A02(r4, r22, new C66312MMv(38, r4, r22));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        if (X.JY9.A0D(r4) != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r0.A03() == true) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r5 = this;
            X.6if r1 = r5.A1U
            boolean r0 = r1.A03
            r2 = 1
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.get()
            X.AeM r0 = (X.C40575AeM) r0
            X.8a4 r0 = r0.A0A
            boolean r0 = r0.A0M()
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            return r2
        L_0x0016:
            X.6if r1 = r5.A1L
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0090
            java.lang.Object r4 = r1.get()
            X.JY9 r4 = (X.JY9) r4
            X.JZL r0 = r4.A0L
            if (r0 == 0) goto L_0x0044
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r0.A04
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0044
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0044
            X.JZL r0 = r4.A0L
            if (r0 == 0) goto L_0x0015
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r0.A04
            java.lang.String r0 = ""
            r1.setText(r0)
            return r2
        L_0x0044:
            X.80U r1 = r4.A1E
            X.80V r0 = X.AnonymousClass80V.ASSET_PICKER
            boolean r0 = r1.CQ0(r0)
            if (r0 != 0) goto L_0x0056
            X.80V r0 = X.AnonymousClass80V.ASSET_PICKER_IN_STACKED_TIMELINE
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x0077
        L_0x0056:
            X.JZL r3 = r4.A0L
            if (r3 == 0) goto L_0x0085
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r3.A04
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x0085
            android.text.Editable r0 = r1.getText()
            if (r0 == 0) goto L_0x0085
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0085
            r3.A01()
        L_0x0071:
            boolean r0 = X.JY9.A0D(r4)
            if (r0 == 0) goto L_0x007a
        L_0x0077:
            X.JY9.A0C(r4, r2)
        L_0x007a:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r4.A09
            if (r0 == 0) goto L_0x0090
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0090
            return r2
        L_0x0085:
            X.Lbq r0 = r4.A0A
            if (r0 == 0) goto L_0x0077
            boolean r0 = r0.A03()
            if (r0 != r2) goto L_0x0077
            goto L_0x0071
        L_0x0090:
            com.instagram.ui.text.ConstrainedEditText r1 = r5.A2L
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x009c
            r1.clearFocus()
            return r2
        L_0x009c:
            X.6if r1 = r5.A1b
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r1.get()
            X.AYL r0 = (X.AYL) r0
            r0.onBackPressed()
        L_0x00ab:
            X.6if r1 = r5.A1O
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00be
            java.lang.Object r0 = r1.get()
            X.Lh1 r0 = (X.C64724Lh1) r0
            boolean r0 = r0.onBackPressed()
            if (r0 == 0) goto L_0x00be
            return r2
        L_0x00be:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.onBackPressed():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0109, code lost:
        if ((r7 instanceof X.C369948va) == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012c, code lost:
        if (r3 != -1) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(android.graphics.drawable.Drawable r12, X.AnonymousClass8ME r13, X.C310416b1 r14) {
        /*
            boolean r0 = A0w(r13)
            r2 = 0
            r8 = r14
            if (r0 == 0) goto L_0x0144
            com.instagram.common.session.UserSession r0 = r13.A0r
            boolean r0 = X.C394739yc.A00(r12, r0)
            if (r0 == 0) goto L_0x0136
            X.5MH r7 = A0C(r12, r13, r14)
            java.lang.Integer r0 = r14.A0B
            r6 = -1
            if (r0 == 0) goto L_0x0133
            int r4 = r0.intValue()
        L_0x001d:
            java.lang.Integer r0 = r14.A09
            if (r0 == 0) goto L_0x0130
            int r3 = r0.intValue()
        L_0x0025:
            java.lang.String r0 = r13.A0G
            if (r0 == 0) goto L_0x002d
            r7.A04 = r0
            r13.A0G = r2
        L_0x002d:
            X.8BN r0 = r13.A1I
            X.9tx r5 = r0.A01()
            boolean r0 = r5 instanceof X.C388479nt
            if (r0 == 0) goto L_0x012a
            X.9nt r5 = (X.C388479nt) r5
            boolean r1 = r5 instanceof X.C388469ns
            if (r1 == 0) goto L_0x0123
            r0 = r5
            X.9ns r0 = (X.C388469ns) r0
            int r0 = r0.A01
        L_0x0042:
            if (r0 == r6) goto L_0x012a
            if (r1 == 0) goto L_0x011d
            X.9ns r5 = (X.C388469ns) r5
            int r0 = r5.A00
        L_0x004a:
            if (r0 == r6) goto L_0x012a
            r4 = 0
            r3 = 0
        L_0x004e:
            r7.Eog(r4, r3)
            X.87s r0 = r13.A1J
            boolean r0 = r0.A0M()
            if (r0 == 0) goto L_0x011a
            X.87q r0 = r13.A1n
            X.05G r1 = r0.A08
            X.19B r0 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r0 = X.C226292g8.A00(r0, r1)
            java.lang.Object r0 = r0.A02()
            X.863 r0 = (X.AnonymousClass863) r0
            if (r0 == 0) goto L_0x0117
            int r0 = r0.CEG()
        L_0x006f:
            int r3 = r3 - r4
            r7.EXC(r0, r3)
        L_0x0073:
            r12.setCallback(r7)
            X.0eK r0 = r13.A1t
            r0.getClass()
            java.lang.Object r0 = r0.get()
            X.8cb r0 = (X.C359318cb) r0
            r0.A0L(r7)
        L_0x0084:
            X.80U r0 = r13.A1B
            boolean r0 = r0.CZe()
            if (r0 == 0) goto L_0x00cf
            java.util.List r0 = r13.A1q
            r0.add(r7)
            boolean r0 = r7 instanceof X.AnonymousClass5MH
            if (r0 == 0) goto L_0x00a4
            r1 = r7
            X.5MH r1 = (X.AnonymousClass5MH) r1
            X.87s r0 = r13.A1J
            boolean r0 = r0.A0M()
            if (r0 == 0) goto L_0x0114
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x00a2:
            r1.A03 = r0
        L_0x00a4:
            boolean r0 = A0s(r12)
            if (r0 == 0) goto L_0x00cf
            X.869 r1 = r13.A1K
            boolean r0 = r7 instanceof X.C306386Ly
            if (r0 == 0) goto L_0x00b3
            r2 = r7
            X.6Ly r2 = (X.C306386Ly) r2
        L_0x00b3:
            r1.A01(r2)
            X.8BA r1 = r13.A0y
            X.6if r0 = r1.A1g
            java.lang.Object r0 = r0.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            boolean r0 = r0.A1R()
            if (r0 == 0) goto L_0x00cf
            X.8AE r0 = r1.A1W
            X.8Zh r0 = r0.A00()
            r0.Exh()
        L_0x00cf:
            X.87s r0 = r13.A1J
            X.4gw r0 = r0.A04
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r7 instanceof X.AnonymousClass5MH
            if (r0 == 0) goto L_0x00f3
            r0 = r7
            X.5MH r0 = (X.AnonymousClass5MH) r0
            android.graphics.drawable.Drawable r1 = r0.A0A
            boolean r0 = r1 instanceof X.C347017w8
            if (r0 == 0) goto L_0x00f3
            X.7w8 r1 = (X.C347017w8) r1
            android.graphics.drawable.Drawable r0 = r1.A04()
            X.0qQ.A07(r0)
            boolean r0 = r0 instanceof X.C321016tR
            if (r0 == 0) goto L_0x00f3
            X.87z r0 = r13.A0n
            r0.A00 = r7
        L_0x00f3:
            boolean r11 = r7 instanceof X.C359008bp
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r13.A1m
            boolean r9 = X.C306406Ma.A0A(r12)
            X.82p r0 = r13.A13
            X.82o r0 = r0.A02
            boolean r0 = r0.A0A()
            r1 = 1
            if (r0 == 0) goto L_0x010b
            boolean r0 = r7 instanceof X.C369948va
            r10 = 1
            if (r0 != 0) goto L_0x010c
        L_0x010b:
            r10 = 0
        L_0x010c:
            int r0 = r6.A0K(r7, r8, r9, r10, r11)
            r13.A1P(r1)
            return r0
        L_0x0114:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x00a2
        L_0x0117:
            r0 = 0
            goto L_0x006f
        L_0x011a:
            r0 = r4
            goto L_0x006f
        L_0x011d:
            X.9nr r5 = (X.C388459nr) r5
            int r0 = r5.A00
            goto L_0x004a
        L_0x0123:
            r0 = r5
            X.9nr r0 = (X.C388459nr) r0
            int r0 = r0.A01
            goto L_0x0042
        L_0x012a:
            if (r4 == r6) goto L_0x0073
            if (r3 == r6) goto L_0x0073
            goto L_0x004e
        L_0x0130:
            r3 = -1
            goto L_0x0025
        L_0x0133:
            r4 = -1
            goto L_0x001d
        L_0x0136:
            X.0eK r0 = r13.A1t
            r0.getClass()
            java.lang.Object r0 = r0.get()
            X.8cb r0 = (X.C359318cb) r0
            r0.A0L(r12)
        L_0x0144:
            r7 = r12
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.A00(android.graphics.drawable.Drawable, X.8ME, X.6b1):int");
    }

    public static final int A01(Drawable drawable, AnonymousClass8ME r7, C310416b1 r8, String str, String str2, String str3, List list) {
        if (r7.A1X()) {
            if (182.A06(0Tu.A06, r7.A0r, 36320043047067544L)) {
                r8.A0P = true;
            }
        }
        int A002 = A00(drawable, r7, r8);
        C273914nO r3 = new C273914nO();
        r3.A06 = list;
        r3.A03 = str;
        r3.A04 = str2;
        r3.A05 = str3;
        if (drawable instanceof C347017w8) {
            r3.A01(((C347017w8) drawable).A00);
        }
        if (AnonymousClass9SF.A04(drawable)) {
            r3.A01 = C273924nP.ANIMATED_STICKERS;
            C321056tV A003 = AnonymousClass9SF.A00(drawable);
            if (A003 != null) {
                File A012 = AnonymousClass45F.A01();
                C321016tR r5 = (C321016tR) A003;
                String absolutePath = new File(A012.getAbsolutePath(), Integer.toHexString(r5.A0l.hashCode())).getAbsolutePath();
                0qQ.A0B(absolutePath, 0);
                r5.A0D = null;
                C321016tR.A04(r5, absolutePath);
            }
            AnonymousClass861 r2 = r7.A1f;
            if (r2.A0A.A02() == AnonymousClass8YU.PAUSED) {
                r2.A03();
            }
        } else {
            r3.A01 = C273924nP.STATIC_STICKERS;
        }
        r7.A0g.put(A002, r3);
        A0O(drawable, r7);
        return A002;
    }

    private final ImmutableList A05() {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Drawable drawable : this.A1m.getAllDrawables()) {
            if (drawable instanceof C347017w8) {
                drawable = ((C347017w8) drawable).A04();
            } else if (drawable instanceof AnonymousClass5MH) {
                drawable = ((AnonymousClass5MH) drawable).A08();
            }
            if (drawable instanceof AnonymousClass8N6) {
                builder.add(drawable);
            }
        }
        ImmutableList build = builder.build();
        0qQ.A07(build);
        return build;
    }

    private final B21 A0B(AnonymousClass80V r2) {
        C314676if r0;
        switch (r2.ordinal()) {
            case 16:
                r0 = this.A1S;
                break;
            case 17:
                r0 = this.A21;
                break;
            case 19:
                r0 = this.A22;
                break;
            case 25:
                r0 = this.A29;
                break;
            case 26:
                r0 = this.A28;
                break;
            case 27:
                r0 = this.A2B;
                break;
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                r0 = this.A24;
                break;
            case 30:
                r0 = this.A2C;
                break;
            case 31:
            case 32:
                r0 = this.A1O;
                break;
            case 33:
                r0 = this.A2F;
                break;
            case 59:
                r0 = this.A2I;
                break;
            case 60:
            case 61:
            case 62:
                r0 = this.A2A;
                break;
            case 63:
                r0 = this.A2H;
                break;
            case 64:
                r0 = this.A25;
                break;
            case 65:
                r0 = this.A2G;
                break;
            case 66:
                r0 = this.A2D;
                break;
            case 68:
                r0 = this.A23;
                break;
            case 73:
                r0 = this.A1R;
                break;
            case 74:
                r0 = this.A27;
                break;
            case 75:
                r0 = this.A1X;
                break;
            case 78:
                r0 = this.A1T;
                break;
            case 80:
                r0 = this.A1N;
                break;
            case 84:
                r0 = this.A26;
                break;
            default:
                return null;
        }
        return (B21) r0.get();
    }

    public static final void A0N(Drawable drawable, AnonymousClass8ME r8) {
        C306386Ly r2;
        if (A0s(drawable)) {
            if (drawable instanceof C306386Ly) {
                r2 = (C306386Ly) drawable;
            } else {
                r2 = null;
            }
            if (r8.A13.A02.A01() == C365758nd.A04) {
                r8.A1K.A01(r2);
            }
        }
        if (drawable instanceof C347017w8) {
            C347017w8 r6 = (C347017w8) drawable;
            r6.A07();
            ArrayList A062 = r6.A06(C369768vI.class);
            if (!A062.isEmpty()) {
                Iterator it = A062.iterator();
                while (it.hasNext()) {
                    C369768vI r4 = (C369768vI) it.next();
                    r4.A04();
                    if (r4.A0M == C318046oG.AVATAR_STATIC) {
                        if (182.A06(0Tu.A05, r8.A0r, 36323204142214143L)) {
                            r8.A0R(r6, r4);
                            r6.A09();
                        }
                    }
                }
            }
        }
        if (drawable instanceof C321016tR) {
            C321016tR r1 = (C321016tR) drawable;
            r1.A0J = true;
            C321016tR.A03(r1);
        }
        if ((drawable instanceof B3d) && !A0u(r8)) {
            C3506685r r12 = r8.A18;
            0qQ.A0B(drawable, 0);
            C3506685r.A00(drawable, r12);
        }
    }

    private final void A0R(C347017w8 r6, C369768vI r7) {
        C369768vI A082 = A08(r7);
        A082.A07 = AnonymousClass05K.A01;
        List list = r6.A08;
        list.add(A082);
        A082.setCallback(r6);
        C369768vI A083 = A08(r7);
        A083.A07 = AnonymousClass05K.A0C;
        list.add(A083);
        A083.setCallback(r6);
        if (182.A06(0Tu.A05, this.A0r, 36323204142345217L)) {
            C369768vI A084 = A08(r7);
            A084.A07 = AnonymousClass05K.A0N;
            list.add(A084);
            A084.setCallback(r6);
        }
    }

    public static final void A0U(AnonymousClass8ME r4) {
        C306386Ly A152 = r4.A15();
        if (A152 != null) {
            r4.A0h.postDelayed(new C41044AnS(r4, A152), 400);
            return;
        }
        r4.A0W = true;
        r4.A0h.post(new C40836Ak6(r4));
    }

    private final void A0f(C369668v8 r7) {
        Boolean bool;
        boolean A0u2 = A0u(this);
        if (A0u2) {
            1Av A002 = 1Au.A00(this.A0r);
            A002.A5i.Epx(A002, true, 1Av.A8a[457]);
        }
        C19469WaH waH = null;
        if (r7 == null || (waH = r7.A03) == null || (bool = waH.A00.A07) == null || bool.booleanValue()) {
            A0Z(this, C369668v8.class);
            this.A1B.E3H(new AnonymousClass8UD(waH, A0u2));
        }
    }

    public static final boolean A0v(AnonymousClass8ME r4) {
        if (!r4.Cc2() || !C367088qA.A03(r4.A0r)) {
            return false;
        }
        C3499482o r2 = r4.A13.A02;
        if (r2.A01() == C365758nd.A04 && r2.A01.A0U && r2.A05().size() == 1) {
            return true;
        }
        return false;
    }

    public final Drawable A10() {
        Class<AnonymousClass5MM> cls = AnonymousClass5MM.class;
        if (!A0w(this)) {
            return A03(this, cls);
        }
        ArrayList A0T2 = this.A1m.A0T(new AWL());
        0qQ.A0B(A0T2, 0);
        Drawable drawable = (Drawable) 00k.A0J(A0T2);
        if (drawable instanceof AnonymousClass5MH) {
            return drawable;
        }
        return null;
    }

    public final LinkedHashMap A1A() {
        Drawable drawable;
        LinkedHashMap A1B2 = A1B();
        boolean z = false;
        if (!A1B2.isEmpty()) {
            Iterator it = A1B2.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (entry != null) {
                        drawable = (Drawable) entry.getKey();
                    } else {
                        drawable = null;
                    }
                    if (AnonymousClass9SF.A01(drawable) != null) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : A1B().entrySet()) {
            Drawable drawable2 = (Drawable) entry2.getKey();
            Object value = entry2.getValue();
            if (z || AnonymousClass9SF.A04(drawable2)) {
                linkedHashMap.put(drawable2, value);
            }
        }
        return linkedHashMap;
    }

    public final void A1O(Integer num, boolean z) {
        if (A0r()) {
            Drawable A112 = A11();
            if (A112 != null) {
                A0L(A112);
                return;
            }
            UserSession userSession = this.A0r;
            27p.A01(userSession).A03.A07(C394299xr.A00(num));
            if (z) {
                this.A1B.E3H(new Object());
            } else {
                ((JY9) this.A1L.get()).A0J(C3515589i.STORY_MUSIC_STICKER, A13(), false);
            }
            if (25x.A00(userSession).A01.A00 instanceof C299715vi) {
                Application application = this.A0l.requireActivity().getApplication();
                0qQ.A07(application);
                0Tu r3 = 0Tu.A05;
                if (182.A06(r3, userSession, 36324458272731234L) || 182.A06(r3, userSession, 36324458272862307L)) {
                    ExpressoImpl A002 = C63509KyK.A00(application, userSession);
                    A002.A02(C63557Kz6.A01);
                    if (182.A06(r3, userSession, 36315898403098270L)) {
                        A002.A02(C63557Kz6.A00);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        27p.A01(this.A0r).A03.A07(C394299xr.A00(num));
        A0G();
    }

    public final boolean A1S() {
        Drawable drawable;
        LinkedHashMap A1B2 = A1B();
        if (A1B2.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : A1B2.entrySet()) {
            if (entry != null) {
                drawable = (Drawable) entry.getKey();
            } else {
                drawable = null;
            }
            C321056tV A002 = AnonymousClass9SF.A00(drawable);
            if (A002 != null && ((C321016tR) A002).A0s) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1U() {
        String str;
        ImmutableList A052 = A05();
        if (!(A052 instanceof Collection) || !A052.isEmpty()) {
            Iterator it = A052.iterator();
            while (it.hasNext()) {
                C321016tR r1 = (C321016tR) it.next();
                String str2 = r1.A0E;
                if ((str2 == null || str2.length() == 0) && (((str = r1.A0l) == null || str.length() == 0) && r1.A0Y != null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int AoK() {
        return A02(this);
    }

    public final List B9U() {
        return (List) A04(this).A01;
    }

    public final boolean Buo() {
        if (A1V()) {
            if (!182.A06(0Tu.A05, this.A0r, 36319939968245571L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean CXD() {
        if (A04(this).A00 < 20) {
            return true;
        }
        return false;
    }

    public final void Cur() {
        onBackPressed();
    }

    public final void CxQ(Drawable drawable, C317466nJ r4) {
        C317876nz BzU = r4.BzU();
        BzU.getClass();
        Dn1(drawable, BzU, (Long) null);
    }

    public final void D7Z() {
        onBackPressed();
    }

    public final void D7c() {
        onBackPressed();
    }

    public final void DRG(Drawable drawable, C317466nJ r5) {
        C317876nz BzU = r5.BzU();
        BzU.getClass();
        Dn1(drawable, BzU, (Long) null);
        if (drawable != null) {
            String str = ((C317966o8) BzU.A0O.get(0)).A0i;
            0qQ.A07(str);
            Map map = this.A1s;
            AbstractCollection abstractCollection = (AbstractCollection) map.get(str);
            if (abstractCollection == null) {
                abstractCollection = new ArrayList();
            }
            abstractCollection.add(drawable);
            map.put(str, abstractCollection);
        }
    }

    public final void DnB() {
        onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        r2 = r1.A0s.A0N;
        r1 = r2.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EFO(android.graphics.drawable.Drawable r5, android.graphics.drawable.Drawable r6) {
        /*
            r4 = this;
            boolean r0 = A0w(r4)
            if (r0 == 0) goto L_0x0064
            boolean r0 = r5 instanceof X.AnonymousClass5MH
            if (r0 == 0) goto L_0x0064
            com.instagram.common.session.UserSession r0 = r4.A0r
            boolean r0 = X.C394739yc.A00(r6, r0)
            if (r0 == 0) goto L_0x0035
            int r0 = X.AnonymousClass5MH.A0D
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            X.0qQ.A07(r1)
            android.content.Context r0 = r4.A0f
            X.5MH r3 = new X.5MH
            r3.<init>((android.content.Context) r0, (android.graphics.drawable.Drawable) r6, (java.lang.String) r1)
            r6 = r3
            r2 = r5
            X.5MH r2 = (X.AnonymousClass5MH) r2
            int r1 = r2.A01
            int r0 = r2.A00
            r3.Eog(r1, r0)
            java.lang.String r0 = r2.A04
            r3.A04 = r0
        L_0x0035:
            X.0eK r0 = r4.A1t
            r0.getClass()
            java.lang.Object r1 = r0.get()
            X.8cb r1 = (X.C359318cb) r1
            boolean r0 = r6 instanceof X.AnonymousClass5MH
            if (r0 == 0) goto L_0x0084
            com.instagram.pendingmedia.model.ClipInfo r0 = r1.A0G
            if (r0 == 0) goto L_0x0078
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r1.A0s
            X.83d r3 = r0.A0N
            java.util.List r2 = r3.A02
            int r0 = r2.indexOf(r5)
            if (r0 < 0) goto L_0x0064
            r2.set(r0, r6)
            X.05G r1 = r3.A0C
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.Epw(r0)
            X.C3500783d.A00(r3, r5, r6)
        L_0x0064:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r4.A1m
            r2.A0q(r5, r6)
            X.869 r1 = r4.A1K
            X.AWM r0 = new X.AWM
            r0.<init>(r4)
            java.util.ArrayList r0 = r2.A0T(r0)
            r1.A02(r0)
            return
        L_0x0078:
            java.util.List r1 = r1.A15
            int r0 = r1.indexOf(r5)
            if (r0 < 0) goto L_0x0064
            r1.set(r0, r6)
            goto L_0x0064
        L_0x0084:
            boolean r0 = r5 instanceof X.C268714ds
            if (r0 == 0) goto L_0x0064
            boolean r0 = r6 instanceof X.C268714ds
            if (r0 == 0) goto L_0x0064
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r1.A0s
            X.83d r2 = r0.A0N
            java.util.List r1 = r2.A01
            int r0 = r1.indexOf(r5)
            if (r0 < 0) goto L_0x0064
            r1.set(r0, r6)
            X.05G r0 = r2.A0B
            r0.Epw(r1)
            X.C3500783d.A00(r2, r5, r6)
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.EFO(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable):void");
    }

    public final boolean Erm() {
        return A0q();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: type inference failed for: r1v51, types: [java.lang.Object, X.2YM] */
    /* JADX WARNING: type inference failed for: r2v63, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8ME(android.app.Activity r36, android.view.View r37, android.view.View r38, android.view.View r39, android.view.View r40, android.view.View r41, X.AnonymousClass07i r42, X.28D r43, X.AnonymousClass4DH r44, X.C3503284f r45, X.AnonymousClass0iw r46, com.instagram.common.session.UserSession r47, X.AnonymousClass3E6 r48, X.C71662eb r49, X.C357638Yz r50, X.C3510387i r51, X.AnonymousClass8BA r52, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r53, X.C3506485o r54, X.C3499582p r55, X.AnonymousClass8BL r56, X.AnonymousClass8BQ r57, X.AnonymousClass88K r58, X.AnonymousClass8AL r59, X.AnonymousClass8C9 r60, X.C3506685r r61, X.C314446iH r62, X.AnonymousClass88Z r63, X.AnonymousClass8BE r64, X.AnonymousClass80U r65, X.AnonymousClass869 r66, X.C3499982t r67, X.C234462xu r68, com.instagram.reels.prompt.model.PromptStickerModel r69, X.C337257fy r70, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r71, java.util.List r72, X.AnonymousClass0eK r73, int r74, boolean r75, boolean r76, boolean r77) {
        /*
            r35 = this;
            r8 = r36
            r4 = r65
            r1 = 1
            X.0qQ.A0B(r8, r1)
            r2 = 2
            r31 = r55
            r0 = r31
            X.0qQ.A0B(r0, r2)
            r0 = 3
            r6 = r63
            X.0qQ.A0B(r6, r0)
            r0 = 4
            X.0qQ.A0B(r4, r0)
            r2 = 6
            r34 = r42
            r0 = r34
            X.0qQ.A0B(r0, r2)
            r0 = 7
            r11 = r37
            X.0qQ.A0B(r11, r0)
            r0 = 11
            r12 = r71
            X.0qQ.A0B(r12, r0)
            r2 = 12
            r33 = r49
            r0 = r33
            X.0qQ.A0B(r0, r2)
            r2 = 13
            r0 = 14
            r7 = r48
            X.0qQ.A0B(r7, r0)
            r0 = 15
            r3 = r53
            X.0qQ.A0B(r3, r0)
            r5 = 20
            r18 = r54
            r0 = r18
            X.0qQ.A0B(r0, r5)
            r0 = 21
            r14 = r61
            X.0qQ.A0B(r14, r0)
            r5 = 22
            r28 = r67
            r0 = r28
            X.0qQ.A0B(r0, r5)
            r0 = 23
            r5 = r68
            X.0qQ.A0B(r5, r0)
            r0 = 25
            r15 = r56
            X.0qQ.A0B(r15, r0)
            r0 = 26
            r13 = r64
            X.0qQ.A0B(r13, r0)
            r9 = 27
            r32 = r50
            r0 = r32
            X.0qQ.A0B(r0, r9)
            r17 = 28
            r20 = r46
            r9 = r20
            r0 = r17
            X.0qQ.A0B(r9, r0)
            r9 = 29
            r29 = r59
            r0 = r29
            X.0qQ.A0B(r0, r9)
            r16 = 30
            r10 = r66
            r0 = r16
            X.0qQ.A0B(r10, r0)
            r9 = 31
            r19 = r51
            r0 = r19
            X.0qQ.A0B(r0, r9)
            r9 = 32
            r22 = r43
            r0 = r22
            X.0qQ.A0B(r0, r9)
            r9 = 34
            r30 = r57
            r0 = r30
            X.0qQ.A0B(r0, r9)
            r9 = 39
            r21 = r45
            r0 = r21
            X.0qQ.A0B(r0, r9)
            r9 = r35
            r9.<init>()
            r0 = r31
            r9.A13 = r0
            r9.A1A = r6
            r9.A1B = r4
            r6 = r47
            r9.A0r = r6
            r9.A0h = r11
            r9.A1m = r12
            r9.A0s = r7
            r9.A10 = r3
            r0 = r52
            r9.A0y = r0
            r7 = r44
            r9.A0l = r7
            r3 = r58
            r9.A14 = r3
            r0 = r18
            r9.A12 = r0
            r9.A18 = r14
            r9.A1h = r5
            r0 = r73
            r9.A1t = r0
            r9.A1z = r15
            r9.A07 = r13
            r0 = r32
            r9.A0t = r0
            r0 = r20
            r9.A0o = r0
            r9.A1K = r10
            r0 = r19
            r9.A0x = r0
            r0 = r22
            r9.A0k = r0
            r0 = r62
            r9.A19 = r0
            r26 = r72
            r0 = r26
            r9.A1r = r0
            r0 = r69
            r9.A1i = r0
            r18 = r75
            r0 = r18
            r9.A1v = r0
            r0 = r60
            r9.A17 = r0
            r0 = r21
            r9.A0m = r0
            r0 = r76
            r9.A1w = r0
            r0 = r77
            r9.A1x = r0
            r0 = r74
            r9.A0e = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r9.A0g = r0
            X.0eO r5 = X.0eO.A02
            X.9LJ r0 = new X.9LJ
            r0.<init>(r9, r2)
            X.0eM r0 = X.AnonymousClass0eN.A00(r5, r0)
            r9.A1u = r0
            java.lang.String r0 = "QuickCaptureFragment"
            r9.A1o = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.A1q = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.A1s = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.A2M = r0
            r0 = 0
            r5 = 126(0x7e, float:1.77E-43)
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r2 = new com.instagram.stickersearch.AvatarStickerPreRenderInteractor
            r2.<init>(r0, r6, r5)
            r9.A1j = r2
            X.8MZ r5 = new X.8MZ
            r5.<init>(r6)
            X.8Ma r2 = new X.8Ma
            r2.<init>(r6, r5)
            r9.A2K = r2
            X.8Mb r10 = new X.8Mb
            r10.<init>(r9)
            r9.A0p = r10
            r9.A0d = r1
            java.lang.String r2 = ""
            r9.A0H = r2
            r9.A0X = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r9.A0I = r2
            r9.A2O = r1
            X.0Tu r5 = X.0Tu.A05
            r1 = 2342169340092102353(0x20810e9b000036d1, double:4.070953928094361E-152)
            boolean r1 = X.182.A06(r5, r6, r1)
            if (r1 == 0) goto L_0x019b
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r9.A0D = r1
        L_0x019b:
            r4.A7w(r9)
            X.80V r2 = X.AnonymousClass80V.MEDIA_EDIT
            X.80T r4 = (X.AnonymousClass80T) r4
            X.80W r1 = r4.A01
            r25 = r1
            r1.A01(r9, r2)
            r9.A0f = r8
            X.27r r1 = X.27p.A01(r6)
            X.283 r1 = r1.A04
            java.lang.String r4 = r1.A0L
            if (r4 != 0) goto L_0x01bc
            java.lang.String r4 = X.AnonymousClass6SR.A02()
            X.0qQ.A07(r4)
        L_0x01bc:
            r9.A1p = r4
            X.8Md r1 = new X.8Md
            r1.<init>(r12)
            r9.A1C = r1
            r1 = 2131437968(0x7f0b2990, float:1.849785E38)
            android.view.View r1 = r11.requireViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r9.A0i = r1
            r1 = 2131442533(0x7f0b3b65, float:1.8507109E38)
            android.view.View r1 = r11.requireViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r9.A0j = r1
            r1 = 2131442627(0x7f0b3bc3, float:1.85073E38)
            android.view.View r2 = r11.requireViewById(r1)
            com.instagram.ui.text.ConstrainedEditText r2 = (com.instagram.ui.text.ConstrainedEditText) r2
            r9.A2L = r2
            java.lang.String r1 = "image/*"
            r13 = 0
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2.setSupportedContentMimeTypes(r1)
            r1 = 2131432000(0x7f0b1240, float:1.8485745E38)
            android.view.View r2 = r11.findViewById(r1)
            com.instagram.ui.text.fittingtextview.FittingTextView r2 = (com.instagram.ui.text.fittingtextview.FittingTextView) r2
            r9.A1k = r2
            if (r2 == 0) goto L_0x0202
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.2eS.A04(r2, r1)
        L_0x0202:
            X.8BE r1 = r9.A07
            r9.A07 = r1
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r9.A1m
            boolean r1 = r1.CRa()
            r2.A0T = r1
            r1 = r32
            X.80m r1 = r1.A08
            r27 = r1
            java.lang.Object r1 = r1.A00
            X.4yO r1 = (X.C279284yO) r1
            r9.A05 = r1
            X.8Mh r1 = new X.8Mh
            r1.<init>(r3)
            r9.A15 = r1
            r1.A01 = r9
            r1 = 2131432566(0x7f0b1476, float:1.8486893E38)
            android.view.View r1 = r11.requireViewById(r1)
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r1 = (com.instagram.ui.widget.drawing.EyedropperColorPickerTool) r1
            r9.A1l = r1
            X.8Mi r1 = new X.8Mi
            r1.<init>(r6)
            r9.A1y = r1
            X.8Mj r1 = new X.8Mj
            r1.<init>(r9)
            r9.A0z = r1
            androidx.fragment.app.FragmentActivity r2 = r7.requireActivity()
            X.8BM r1 = new X.8BM
            r1.<init>(r2, r6)
            X.2YN r2 = new X.2YN
            r2.<init>(r1, r7)
            java.lang.Class<X.8BN> r1 = X.AnonymousClass8BN.class
            X.2YL r12 = r2.A00(r1)
            X.8BN r12 = (X.AnonymousClass8BN) r12
            r9.A1I = r12
            X.2Fk r3 = r12.A01
            X.8Ml r2 = new X.8Ml
            r2.<init>(r9)
            X.6q2 r1 = new X.6q2
            r1.<init>(r2)
            r3.A06(r7, r1)
            X.2Fk r3 = r12.A00
            X.8Mm r2 = new X.8Mm
            r2.<init>(r9)
            X.6q2 r1 = new X.6q2
            r1.<init>(r2)
            r3.A06(r7, r1)
            r3 = r8
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            X.87r r1 = X.C351878Au.A00(r3, r6)
            X.2YN r2 = new X.2YN
            r2.<init>(r1, r3)
            java.lang.Class<X.87s> r1 = X.C3511387s.class
            X.2YL r1 = r2.A00(r1)
            X.87s r1 = (X.C3511387s) r1
            r9.A1J = r1
            android.app.Application r2 = r3.getApplication()
            X.0qQ.A07(r2)
            X.85R r1 = new X.85R
            r1.<init>(r2, r6)
            X.2YN r2 = new X.2YN
            r2.<init>(r1, r3)
            java.lang.Class<com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel> r1 = com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel.class
            X.2YL r1 = r2.A00(r1)
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r1 = (com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel) r1
            r9.A11 = r1
            X.07U r22 = X.07U.A05
            X.07Z r21 = r7.getViewLifecycleOwner()
            X.0xx r2 = X.AnonymousClass07a.A00(r21)
            X.9KF r1 = new X.9KF
            r19 = r1
            r20 = r9
            r23 = r0
            r24 = r17
            r19.<init>(r20, r21, r22, r23, r24)
            X.19B r14 = X.19B.A00
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            X.1Eo.A03(r12, r14, r1, r2)
            X.2YN r2 = new X.2YN
            r2.<init>(r7)
            java.lang.Class<X.8Bz> r1 = X.C352168Bz.class
            X.2YL r1 = r2.A00(r1)
            X.8Bz r1 = (X.C352168Bz) r1
            r9.A1F = r1
            X.2Fk r15 = r1.A01
            X.8Mn r2 = new X.8Mn
            r2.<init>(r9)
            X.6q2 r1 = new X.6q2
            r1.<init>(r2)
            r15.A06(r7, r1)
            r1 = 36319939968376645(0x8108cb00141f45, double:3.032214512436353E-306)
            boolean r15 = X.182.A06(r5, r6, r1)
            int r2 = X.AnonymousClass0nB.A01(r8)
            X.8Mo r1 = new X.8Mo
            r1.<init>(r6, r15, r2)
            X.2YN r2 = new X.2YN
            r2.<init>(r1, r7)
            java.lang.Class<X.8Mp> r1 = X.C354588Mp.class
            X.2YL r1 = r2.A00(r1)
            X.8Mp r1 = (X.C354588Mp) r1
            r9.A1D = r1
            X.8Mq r1 = new X.8Mq
            r1.<init>()
            X.2YN r2 = new X.2YN
            r2.<init>(r1, r7)
            java.lang.Class<X.8Mr> r1 = X.C354608Mr.class
            X.2YL r1 = r2.A00(r1)
            X.8Mr r1 = (X.C354608Mr) r1
            r9.A1E = r1
            X.2Fk r2 = r1.A00
            X.8Mt r1 = new X.8Mt
            r1.<init>(r9)
            r2.A06(r7, r1)
            X.8Mu r15 = new X.8Mu
            r1 = r25
            r15.<init>(r1)
            X.2YN r2 = new X.2YN
            r2.<init>(r15, r7)
            java.lang.Class<X.8Mv> r1 = X.C354648Mv.class
            X.2YL r1 = r2.A00(r1)
            X.8Mv r1 = (X.C354648Mv) r1
            r9.A16 = r1
            X.07V r1 = r7.getLifecycle()
            X.0xx r15 = X.C71772f0.A00(r1)
            r2 = 41
            X.9Js r1 = new X.9Js
            r1.<init>(r9, r0, r2)
            X.1Eo.A03(r12, r14, r1, r15)
            X.2YN r2 = new X.2YN
            r2.<init>(r3)
            java.lang.Class<X.860> r1 = X.AnonymousClass860.class
            X.2YL r2 = r2.A00(r1)
            X.860 r2 = (X.AnonymousClass860) r2
            java.lang.String r1 = "post_capture"
            X.861 r1 = r2.A00(r1)
            r9.A1f = r1
            X.07g r8 = (X.AnonymousClass07g) r8
            X.0qQ.A0B(r8, r13)
            X.87p r1 = new X.87p
            r1.<init>(r6)
            X.2YN r2 = new X.2YN
            r2.<init>(r1, r8)
            java.lang.Class<X.87q> r1 = X.C3511187q.class
            X.2YL r1 = r2.A00(r1)
            X.87q r1 = (X.C3511187q) r1
            r9.A1n = r1
            boolean r1 = X.AnonymousClass3S1.A04(r26)
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x037e
            if (r75 == 0) goto L_0x038b
        L_0x037e:
            X.2YN r1 = new X.2YN
            r1.<init>(r8)
            java.lang.Class<X.8N0> r0 = X.AnonymousClass8N0.class
            X.2YL r0 = r1.A00(r0)
            X.8N0 r0 = (X.AnonymousClass8N0) r0
        L_0x038b:
            r9.A2J = r0
            android.app.Application r2 = r3.getApplication()
            X.0qQ.A07(r2)
            X.8Am r1 = new X.8Am
            r1.<init>(r2, r6)
            X.2YN r2 = new X.2YN
            r2.<init>(r1, r8)
            java.lang.Class<X.8An> r1 = X.C351818An.class
            X.2YL r1 = r2.A00(r1)
            X.8An r1 = (X.C351818An) r1
            r9.A1g = r1
            android.app.Application r2 = r3.getApplication()
            X.0qQ.A07(r2)
            X.8N1 r1 = new X.8N1
            r1.<init>(r2, r6)
            X.2YN r2 = new X.2YN
            r2.<init>(r1, r7)
            java.lang.Class<X.8N2> r1 = X.AnonymousClass8N2.class
            X.2YL r1 = r2.A00(r1)
            X.8N2 r1 = (X.AnonymousClass8N2) r1
            r9.A0u = r1
            X.8N7 r2 = new X.8N7
            r2.<init>(r9)
            r1 = r32
            r1.A0F(r2)
            X.8N8 r2 = new X.8N8
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A1Q = r1
            r1 = r31
            X.82o r1 = r1.A02
            boolean r12 = r1.A0F()
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = r1.A01(r6)
            java.lang.Integer r14 = r1.A0N()
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r2 = 0
            if (r14 != r1) goto L_0x03f2
            r2 = 1
        L_0x03f2:
            X.8N9 r14 = new X.8N9
            r1 = r34
            r14.<init>(r1, r9, r12, r2)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A1S = r1
            X.8NA r14 = new X.8NA
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A23 = r1
            X.8NB r14 = new X.8NB
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A21 = r1
            X.8NC r14 = new X.8NC
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A22 = r1
            X.8ND r14 = new X.8ND
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A1c = r1
            X.8NE r14 = new X.8NE
            r1 = r34
            r14.<init>(r1, r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A1Z = r1
            X.8NF r14 = new X.8NF
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A29 = r1
            X.8NG r14 = new X.8NG
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A28 = r1
            X.8NH r14 = new X.8NH
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A25 = r1
            X.8NI r14 = new X.8NI
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A2G = r1
            X.8NJ r14 = new X.8NJ
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A2C = r1
            X.8NK r15 = new X.8NK
            r14 = r30
            r1 = r29
            r15.<init>(r14, r1, r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r15, r1)
            r9.A1O = r1
            X.8NL r14 = new X.8NL
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A2F = r1
            X.8NM r14 = new X.8NM
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A2B = r1
            X.8NN r14 = new X.8NN
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A24 = r1
            X.8NO r14 = new X.8NO
            r1 = r34
            r14.<init>(r1, r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A1a = r1
            X.8NP r14 = new X.8NP
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A2I = r1
            X.8NQ r14 = new X.8NQ
            r14.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A2H = r1
            X.8NR r14 = new X.8NR
            r18 = r38
            r19 = r39
            r21 = r40
            r20 = r41
            r22 = r33
            r23 = r9
            r24 = r28
            r17 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A1L = r1
            X.8NS r14 = new X.8NS
            r1 = r28
            r14.<init>(r9, r1)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A1U = r1
            X.8NT r14 = new X.8NT
            r21 = r14
            r22 = r30
            r23 = r29
            r24 = r9
            r25 = r2
            r26 = r12
            r21.<init>(r22, r23, r24, r25, r26)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r14, r1)
            r9.A1b = r1
            X.8NU r2 = new X.8NU
            r17 = r2
            r21 = r33
            r22 = r9
            r17.<init>(r18, r19, r20, r21, r22)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A1Y = r1
            X.8NV r2 = new X.8NV
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A2A = r1
            X.8NW r2 = new X.8NW
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A1T = r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = r16
            if (r2 < r1) goto L_0x06ef
            X.7Gi r2 = X.AnonymousClass3E4.A00(r11)
        L_0x0562:
            X.0qQ.A0A(r2)
            X.8NX r11 = new X.8NX
            r1 = r34
            r11.<init>(r1, r2, r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r11, r1)
            r9.A1d = r1
            X.8NY r2 = new X.8NY
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A1P = r1
            X.8NZ r2 = new X.8NZ
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A2D = r1
            X.8Na r2 = new X.8Na
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A1M = r1
            X.8Nb r2 = new X.8Nb
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A27 = r1
            X.8Nc r2 = new X.8Nc
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A1X = r1
            X.8Nd r2 = new X.8Nd
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A1N = r1
            X.8Ne r2 = new X.8Ne
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A1R = r1
            X.8Nf r2 = new X.8Nf
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A26 = r1
            X.8Ng r2 = new X.8Ng
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A1W = r1
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r9.A1m
            r1.A0y(r9)
            X.8Nh r2 = new X.8Nh
            r19 = r70
            r14 = r2
            r15 = r34
            r16 = r30
            r17 = r29
            r18 = r9
            r14.<init>(r15, r16, r17, r18, r19)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A1e = r1
            X.8Ni r2 = new X.8Ni
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A2E = r1
            X.8Nj r2 = new X.8Nj
            r2.<init>(r9)
            X.6id[] r1 = new X.C314656id[r13]
            X.6if r1 = X.C314666ie.A00(r2, r1)
            r9.A1V = r1
            if (r0 == 0) goto L_0x062c
            X.2Fj r1 = r0.A00
            X.APc r0 = new X.APc
            r0.<init>(r9)
            r1.A06(r7, r0)
        L_0x062c:
            r0 = r27
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            A0Q(r0, r9)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r6)
            java.lang.Class<X.8Nm> r0 = X.C354818Nm.class
            r1.A01(r10, r0)
            X.8Nn r2 = new X.8Nn
            r2.<init>(r9)
            r9.A0q = r2
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r6)
            java.lang.Class<X.8No> r0 = X.C354838No.class
            r1.A01(r2, r0)
            r0 = 36315812503490100(0x81050a00000e34, double:3.029604287022135E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            r9.A2N = r0
            X.85w r0 = new X.85w
            r0.<init>(r6, r3)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r8)
            java.lang.Class<X.85x> r0 = X.C3507185x.class
            X.2YL r2 = r1.A00(r0)
            X.85x r2 = (X.C3507185x) r2
            r9.A1G = r2
            X.82v r0 = new X.82v
            r0.<init>(r6, r3)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r8)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel> r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.class
            X.2YL r0 = r1.A00(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r0
            r9.A1H = r0
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r2.A01
            X.2Fk r1 = r0.A05
            X.8Np r0 = X.C354848Np.A00
            X.2gB r1 = X.AnonymousClass72Y.A01(r1, r0)
            X.8Nq r0 = new X.8Nq
            r0.<init>(r9)
            r1.A06(r7, r0)
            X.87y r0 = new X.87y
            r0.<init>(r6)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r8)
            java.lang.Class<X.87z> r0 = X.C3512087z.class
            X.2YL r0 = r1.A00(r0)
            X.87z r0 = (X.C3512087z) r0
            r9.A0n = r0
            X.8Nr r0 = new X.8Nr
            r0.<init>()
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r8)
            java.lang.Class<X.8Ns> r0 = X.C354878Ns.class
            X.2YL r0 = r1.A00(r0)
            X.8Ns r0 = (X.C354878Ns) r0
            r9.A20 = r0
            X.8Nt r0 = new X.8Nt
            r0.<init>(r6)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r8)
            java.lang.Class<X.8Nu> r0 = X.C354898Nu.class
            X.2YL r0 = r1.A00(r0)
            X.8Nu r0 = (X.C354898Nu) r0
            r9.A0v = r0
            X.861 r3 = r9.A1f
            X.2Fj r1 = r3.A0G
            X.4DH r2 = r9.A0l
            X.8Nv r0 = new X.8Nv
            r0.<init>(r9)
            r1.A06(r2, r0)
            X.2Fj r1 = r3.A0A
            X.8Nw r0 = new X.8Nw
            r0.<init>(r9)
            r1.A06(r2, r0)
            X.8Nx r0 = new X.8Nx
            r0.<init>(r6, r4)
            r9.A0w = r0
            return
        L_0x06ef:
            X.3E5 r2 = X.AnonymousClass3E4.A01(r9, r13, r13)
            goto L_0x0562
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.<init>(android.app.Activity, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, X.07i, X.28D, X.4DH, X.84f, X.0iw, com.instagram.common.session.UserSession, X.3E6, X.2eb, X.8Yz, X.87i, X.8BA, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.85o, X.82p, X.8BL, X.8BQ, X.88K, X.8AL, X.8C9, X.85r, X.6iH, X.88Z, X.8BE, X.80U, X.869, X.82t, X.2xu, com.instagram.reels.prompt.model.PromptStickerModel, X.7fy, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.util.List, X.0eK, int, boolean, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.instagram.reels.musicpick.model.MusicPickStickerModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v134, resolved type: com.instagram.reels.prompt.model.PromptStickerModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v135, resolved type: com.instagram.reels.prompt.model.PromptStickerModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v142, resolved type: X.Aej} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v202, resolved type: X.Aeh} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.AZg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v68, types: [X.Aex, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v89, types: [java.lang.Object, X.9m1] */
    /* JADX WARNING: type inference failed for: r2v203 */
    /* JADX WARNING: type inference failed for: r6v204, types: [X.Aew, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v207, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r2v258 */
    /* JADX WARNING: type inference failed for: r2v259 */
    /* JADX WARNING: type inference failed for: r2v260 */
    /* JADX WARNING: type inference failed for: r2v261 */
    /* JADX WARNING: type inference failed for: r2v262 */
    /* JADX WARNING: type inference failed for: r2v263 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0598, code lost:
        if (r6 == true) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x059a, code lost:
        r6 = r0.A1B;
        r10 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x065b, code lost:
        r7 = X.AnonymousClass0t1.A01;
        r6 = r0.A0r;
        r10 = r7.A01(r6);
        r7 = r9.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0667, code lost:
        if (r7 == 0) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0669, code lost:
        if (r7 == 1) goto L_0x068a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x066b, code lost:
        r12 = r10.A03.Bx1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0671, code lost:
        r7 = (X.C16147UpY) A03(r0, X.C16147UpY.class);
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x067a, code lost:
        if (r7 == null) goto L_0x06c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x067c, code lost:
        r10 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x067e, code lost:
        if (r10 != null) goto L_0x0698;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0680, code lost:
        X.0qQ.A0F("smbSupportStickerModel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0689, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x068a, code lost:
        r12 = r10.A03.Bwz();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0691, code lost:
        r12 = r10.A03.Bx2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x069c, code lost:
        if (r10.A00() == null) goto L_0x06b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x069e, code lost:
        r7 = r10.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x06a2, code lost:
        if (r7 == null) goto L_0x06a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x06a4, code lost:
        r11 = r7.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x06ae, code lost:
        if (X.0qQ.A0K(r11, r6.A06) != false) goto L_0x06b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x06b0, code lost:
        r6 = r0.A0f;
        r5 = 2131974064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x06bb, code lost:
        if (r9 != r10.A01()) goto L_0x06c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x06bd, code lost:
        A0X(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x06c2, code lost:
        if (r12 == null) goto L_0x06c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x06c4, code lost:
        A1M(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x06cb, code lost:
        if (X.AnonymousClass05K.A00 != r9) goto L_0x0739;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x06cd, code lost:
        r0.A0V = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x06cf, code lost:
        r7 = X.0mE.A00(r0.A0l.getContext(), android.app.Activity.class);
        r7.getClass();
        r7 = (android.app.Activity) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x06e2, code lost:
        if (r0.A0T == false) goto L_0x0727;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x06e4, code lost:
        r9 = new java.util.HashMap();
        r9.put("entrypoint", "sticker");
        r9.put(X.AnonymousClass000.A00(1252), com.instagram.api.schemas.SMBPartnerType.A06.toString());
        r5 = X.C46649DiU.A04(X.AnonymousClass000.A00(1192), r9);
        r2 = new com.instagram.bloks.hosting.IgBloksScreenConfig(r6);
        r19 = com.instagram.modal.ModalActivity.class;
        X.0qQ.A0A(r5);
        r17 = X.C49891FBs.A00(r2, r5);
        r20 = "bloks";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0719, code lost:
        new X.AnonymousClass6W8(r7, r17, r6, r19, r20).A0C(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0729, code lost:
        if (r0.A0U == false) goto L_0x0f1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x072b, code lost:
        r19 = com.instagram.modal.ModalActivity.class;
        r17 = new android.os.Bundle();
        r20 = X.C273654mx.A00(798);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x073b, code lost:
        if (X.AnonymousClass05K.A01 != r9) goto L_0x0740;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x073d, code lost:
        r0.A0T = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0742, code lost:
        if (X.AnonymousClass05K.A0C != r9) goto L_0x06cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0744, code lost:
        r0.A0U = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0753, code lost:
        r5 = r2.A01();
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0759, code lost:
        A1K(r6, new X.C310416b1(r4), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x07c9, code lost:
        if (X.182.A06(X.0Tu.A05, r0.A0r, 36319939968769865L) != false) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x09ba, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x09c7, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x09db, code lost:
        A0y(r5, r3, new X.C310416b1(r4), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0a0f, code lost:
        if (r9.A0Q() != false) goto L_0x0a11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0a11, code lost:
        r7 = r9.A16;
        r5 = (double) (((float) r9.A0z) * 0.100000024f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0a4b, code lost:
        r10 = new X.C356648Ur(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0b0b, code lost:
        r7 = X.C16152Upd.class;
        r6 = r0.A1m.A0V(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0b17, code lost:
        if (r6.isEmpty() == false) goto L_0x0b92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0b19, code lost:
        A0Z(r0, r7);
        A0Z(r0, X.C389609pu.class);
        r9 = A0u(r0);
        r6 = ((X.C317966o8) r3.A0O.get(0)).A0n;
        r5 = (X.C317966o8) r3.A0O.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0b37, code lost:
        if (r6 == null) goto L_0x0b62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0b39, code lost:
        r5 = r5.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0b3b, code lost:
        if (r5 == null) goto L_0x0b43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0b3d, code lost:
        r10 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0b41, code lost:
        if (r10 != null) goto L_0x0b48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0b43, code lost:
        r10 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0b48, code lost:
        r6 = r0.A1B;
        r7 = r10.contains(com.instagram.reels.question.model.responsetype.QuestionResponseType.A05);
        r10.contains(com.instagram.reels.question.model.responsetype.QuestionResponseType.A06);
        r10 = new X.AnonymousClass8TC((X.C19477WaP) null, r9, r7, !r10.isEmpty());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0b62, code lost:
        r7 = r5.A0Y;
        r17 = com.instagram.reels.question.constants.QuestionStickerType.A08;
        r10 = r0.A0f;
        X.C19477WaP.A00(r10);
        X.C19477WaP.A01(r10);
        Dn8(new X.C19477WaP(X.AnonymousClass0t1.A01.A01(r0.A0r).Bh3(), r17, r7, X.C19477WaP.A00(r10), X.C19477WaP.A01(r10), r9, false), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0b92, code lost:
        A0i((X.C16152Upd) r6.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0c96, code lost:
        if (r7 == false) goto L_0x0c98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0d6f, code lost:
        if (r6 == null) goto L_0x0d78;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0d71, code lost:
        r2 = r7.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0d73, code lost:
        if (r2 == null) goto L_0x0d78;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0d75, code lost:
        r2.A02(r6, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0d78, code lost:
        r7 = r7.A16;
        r5 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0d7c, code lost:
        r7.A06(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0d81, code lost:
        r6 = r0.A0f;
        r5 = 2131973833;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0da8, code lost:
        X.C39582A0y.A00(r0.A0f, 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0dc5, code lost:
        r4.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0eb3, code lost:
        X.C59689JTv.A01(r6, (java.lang.String) null, r5, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0f23, code lost:
        if (A1S() == false) goto L_0x0f2e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0f29, code lost:
        if (X.AnonymousClass9SF.A04(r8) == false) goto L_0x0f2e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0f2b, code lost:
        r4.A05 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0f2e, code lost:
        if (r14 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0f30, code lost:
        r8.getClass();
        A0y(r8, r3, new X.C310416b1(r4), r35);
        r6 = r0.A1y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0f41, code lost:
        if (r3.A0X == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0f43, code lost:
        r4 = java.lang.System.currentTimeMillis();
        r2 = new java.lang.Object();
        r2.A02 = X.C317476nK.A06;
        r2.A01 = ((X.C317966o8) r3.A0O.get(0)).A0H;
        r2.A03 = r3;
        r2.A00 = r4;
        r6.A04(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0f70, code lost:
        r4.A0H = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0f74, code lost:
        r6 = r0.A0f;
        X.0qQ.A0B(r6, 0);
        r5 = 2131967837;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x03d4, code lost:
        if (A0t(r2, r0, true) != false) goto L_0x0f1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x03d6, code lost:
        r0.A0y.A0i(r3.A00());
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1I(android.graphics.drawable.Drawable r32, X.C317876nz r33, X.C39890ADo r34, java.lang.String r35) {
        /*
            r31 = this;
            r1 = 0
            java.lang.String r0 = "StickerOverlayController"
            r4 = r34
            r4.A0C = r0
            r3 = r33
            X.6oG r0 = r3.A00()
            int r9 = r0.ordinal()
            r7 = 2
            r6 = 20
            r2 = 0
            r14 = 0
            r5 = 1
            r0 = r31
            r8 = r32
            switch(r9) {
                case 1: goto L_0x0f72;
                case 2: goto L_0x03e1;
                case 3: goto L_0x001e;
                case 4: goto L_0x001e;
                case 5: goto L_0x001e;
                case 6: goto L_0x001e;
                case 7: goto L_0x001e;
                case 8: goto L_0x0058;
                case 9: goto L_0x001e;
                case 10: goto L_0x042c;
                case 11: goto L_0x00b8;
                case 12: goto L_0x001e;
                case 13: goto L_0x001e;
                case 14: goto L_0x001e;
                case 15: goto L_0x0505;
                case 16: goto L_0x0b01;
                case 17: goto L_0x0c73;
                case 18: goto L_0x001e;
                case 19: goto L_0x001e;
                case 20: goto L_0x0a1d;
                case 21: goto L_0x032c;
                case 22: goto L_0x001e;
                case 23: goto L_0x001e;
                case 24: goto L_0x001e;
                case 25: goto L_0x0f72;
                case 26: goto L_0x001e;
                case 27: goto L_0x01ee;
                case 28: goto L_0x001e;
                case 29: goto L_0x001e;
                case 30: goto L_0x0477;
                case 31: goto L_0x0f72;
                case 32: goto L_0x001e;
                case 33: goto L_0x0bf0;
                case 34: goto L_0x001e;
                case 35: goto L_0x09e5;
                case 36: goto L_0x09f8;
                case 37: goto L_0x0dc3;
                case 38: goto L_0x0f64;
                case 39: goto L_0x0a52;
                case 40: goto L_0x001e;
                case 41: goto L_0x001e;
                case 42: goto L_0x019a;
                case 43: goto L_0x0e39;
                case 44: goto L_0x001e;
                case 45: goto L_0x035f;
                case 46: goto L_0x03c4;
                case 47: goto L_0x04af;
                case 48: goto L_0x095f;
                case 49: goto L_0x0abb;
                case 50: goto L_0x0bc0;
                case 51: goto L_0x0a7b;
                case 52: goto L_0x001e;
                case 53: goto L_0x05a3;
                case 54: goto L_0x03ce;
                case 55: goto L_0x03cb;
                case 56: goto L_0x03cb;
                case 57: goto L_0x01b4;
                case 58: goto L_0x001e;
                case 59: goto L_0x001e;
                case 60: goto L_0x0d99;
                case 61: goto L_0x0148;
                case 62: goto L_0x0cda;
                case 63: goto L_0x0e7d;
                case 64: goto L_0x0150;
                case 65: goto L_0x001e;
                case 66: goto L_0x0284;
                case 67: goto L_0x001e;
                case 68: goto L_0x0264;
                case 69: goto L_0x001e;
                case 70: goto L_0x0a34;
                case 71: goto L_0x0beb;
                case 72: goto L_0x0bcd;
                case 73: goto L_0x0ce1;
                case 74: goto L_0x019a;
                case 75: goto L_0x001e;
                case 76: goto L_0x0556;
                case 77: goto L_0x001e;
                case 78: goto L_0x0b0b;
                case 79: goto L_0x001e;
                case 80: goto L_0x001e;
                case 81: goto L_0x0a84;
                case 82: goto L_0x045d;
                case 83: goto L_0x001e;
                case 84: goto L_0x05d7;
                case 85: goto L_0x04e8;
                case 86: goto L_0x0f72;
                case 87: goto L_0x0d53;
                case 88: goto L_0x001e;
                case 89: goto L_0x001e;
                case 90: goto L_0x0a61;
                case 91: goto L_0x0656;
                case 92: goto L_0x0653;
                case 93: goto L_0x0659;
                case 94: goto L_0x0763;
                case 95: goto L_0x001e;
                case 96: goto L_0x0b9d;
                case 97: goto L_0x0179;
                case 98: goto L_0x001e;
                case 99: goto L_0x0615;
                case 100: goto L_0x05cc;
                case 101: goto L_0x0634;
                case 102: goto L_0x001e;
                case 103: goto L_0x0bb7;
                case 104: goto L_0x001e;
                case 105: goto L_0x0daf;
                case 106: goto L_0x05f8;
                case 107: goto L_0x0dc9;
                case 108: goto L_0x0747;
                case 109: goto L_0x019a;
                case 110: goto L_0x087c;
                default: goto L_0x001e;
            }
        L_0x001e:
            java.lang.Integer r6 = r3.A0E
            if (r6 == 0) goto L_0x0f70
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7 = r0.A1m
            java.lang.Class<X.7w8> r6 = X.C347017w8.class
            java.util.ArrayList r12 = r7.A0V(r6)
            int r11 = r12.size()
            r10 = 0
            r9 = 0
        L_0x0030:
            if (r10 >= r11) goto L_0x0ef7
            java.lang.Object r6 = r12.get(r10)
            X.7w8 r6 = (X.C347017w8) r6
            android.graphics.drawable.Drawable r13 = r6.A04()
            X.0qQ.A07(r13)
            boolean r6 = r13 instanceof X.C369768vI
            if (r6 == 0) goto L_0x0055
            java.util.ArrayList r7 = r3.A01()
            X.8vI r13 = (X.C369768vI) r13
            X.6o8 r6 = r13.A0L
            java.lang.String r6 = r6.A0S
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x0055
            int r9 = r9 + 1
        L_0x0055:
            int r10 = r10 + 1
            goto L_0x0030
        L_0x0058:
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r7 = r6.toString()
            X.0qQ.A07(r7)
            java.lang.Boolean r9 = r3.A07
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            boolean r6 = X.0qQ.A0K(r9, r6)
            if (r6 == 0) goto L_0x0073
            boolean r6 = r0.A0N
            if (r6 == 0) goto L_0x00ac
        L_0x0073:
            boolean r6 = r0.A0M
            if (r6 != 0) goto L_0x00ac
            com.instagram.common.session.UserSession r10 = r0.A0r
            X.0Tu r9 = X.0Tu.A06
            r5 = 36323603574172981(0x810c2000002d35, double:3.0345313914941126E-306)
            boolean r5 = X.182.A06(r9, r10, r5)
            if (r5 == 0) goto L_0x009a
            X.4DH r5 = r0.A0l
            X.0xx r9 = X.AnonymousClass07a.A00(r5)
            r6 = 40
            X.MGE r5 = new X.MGE
            r5.<init>(r0, r7, r2, r6)
            X.19B r2 = X.19B.A00
            X.1Eo.A05(r2, r5, r9)
            goto L_0x0f1f
        L_0x009a:
            java.lang.String r2 = "ig_story_creation_sticker_tray"
            X.LRq.A02(r10, r2, r7)
            X.6if r2 = r0.A1L
            java.lang.Object r2 = r2.get()
            X.JY9 r2 = (X.JY9) r2
            r2.A0M(r7)
            goto L_0x0f1f
        L_0x00ac:
            X.6if r2 = r0.A1L
            java.lang.Object r7 = r2.get()
            X.JY9 r7 = (X.JY9) r7
            X.Ll8 r6 = r7.A0D
            goto L_0x0d6f
        L_0x00b8:
            r2 = 1069547520(0x3fc00000, float:1.5)
            r4.A00 = r2
            r2 = 1048576000(0x3e800000, float:0.25)
            r4.A01 = r2
            com.instagram.common.session.UserSession r9 = r0.A0r
            X.JbO r7 = X.JZM.A00(r9)
            X.0wc r6 = r7.A04
            r2 = 302(0x12e, float:4.23E-43)
            java.lang.String r5 = X.AnonymousClass000.A00(r2)
            X.0kJ r2 = r6.A00
            X.0Aj r6 = r6.A00(r2, r5)
            X.KkS r5 = X.C62666KkS.BIO_IG_STORY
            java.lang.String r2 = "entry_point"
            r6.A8M(r5, r2)
            com.instagram.common.session.UserSession r2 = r7.A05
            java.lang.String r5 = r2.A06
            java.lang.String r2 = "seller_igid"
            r6.AAJ(r2, r5)
            java.lang.String r5 = "seller_click_bio_sticker_in_sticker_tray"
            java.lang.String r2 = "event"
            r6.AAJ(r2, r5)
            r6.Cgf()
            java.lang.String r7 = "USD"
            X.0Tu r2 = X.0Tu.A05
            r5 = 36327645138401869(0x810fcd00003a4d, double:3.037087292986534E-306)
            boolean r2 = X.182.A06(r2, r9, r5)
            if (r2 != 0) goto L_0x013a
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.util.Currency r2 = java.util.Currency.getInstance(r2)
        L_0x0105:
            java.lang.String r6 = r2.getCurrencyCode()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.String r5 = "entrypoint"
            java.lang.String r2 = "bio_ig_story"
            r9.put(r5, r2)
            java.lang.String r2 = "currency_code"
            r9.put(r2, r6)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            X.B0C r6 = new X.B0C
            r6.<init>(r1, r0, r3, r4)
            r5 = 49
            X.G4S r2 = new X.G4S
            r2.<init>(r6, r5)
            X.Q3B r5 = new X.Q3B
            r5.<init>(r2)
            java.lang.String r2 = "callback"
            r7.put(r2, r5)
            r0.A0l(r9, r7)
            goto L_0x0f1f
        L_0x013a:
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0143 }
            java.util.Currency r2 = java.util.Currency.getInstance(r2)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0143 }
            goto L_0x0105
        L_0x0143:
            java.util.Currency r2 = java.util.Currency.getInstance(r7)
            goto L_0x0105
        L_0x0148:
            r2 = 1048576000(0x3e800000, float:0.25)
            r4.A01 = r2
            r5 = 1069547520(0x3fc00000, float:1.5)
            goto L_0x0dc5
        L_0x0150:
            com.instagram.api.schemas.TrackDataImpl r2 = r3.A02
            r2.getClass()
            X.JVX r5 = new X.JVX
            r5.<init>(r2)
            android.content.Context r2 = r0.A0f
            boolean r2 = X.C64131LPf.A02(r2, r5)
            if (r2 == 0) goto L_0x0f1f
            boolean r2 = r0.A0r()
            if (r2 == 0) goto L_0x0f1f
            X.6if r2 = r0.A1L
            java.lang.Object r2 = r2.get()
            X.JY9 r2 = (X.JY9) r2
            X.80U r6 = r2.A1E
            X.8UN r10 = new X.8UN
            r10.<init>(r5, r1, r1)
            goto L_0x0ef3
        L_0x0179:
            r2 = 1056964608(0x3f000000, float:0.5)
            r4.A01 = r2
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r2 = r0.A10
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r2 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r2
            X.81W r2 = r2.A0K
            int r2 = r2.getWidth()
            float r5 = (float) r2
            r8.getClass()
            int r2 = r8.getIntrinsicWidth()
            float r2 = (float) r2
            float r5 = r5 / r2
            r4.A00 = r5
            java.lang.Class<X.UpU> r2 = X.C16143UpU.class
            A0Z(r0, r2)
            goto L_0x0f72
        L_0x019a:
            r2 = 1056964608(0x3f000000, float:0.5)
            r4.A01 = r2
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r2 = r0.A10
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r2 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r2
            X.81W r2 = r2.A0K
            int r2 = r2.getWidth()
            float r5 = (float) r2
            r8.getClass()
            int r2 = r8.getIntrinsicWidth()
            float r2 = (float) r2
            float r5 = r5 / r2
            goto L_0x0dc5
        L_0x01b4:
            java.util.List r7 = r3.A0O
            int r6 = r7.size()
            if (r6 != r5) goto L_0x01eb
            java.lang.Object r5 = r7.get(r1)
            X.6o8 r5 = (X.C317966o8) r5
            java.lang.String r6 = r5.A0S
            X.0qQ.A07(r6)
        L_0x01c7:
            r8.getClass()
            X.6b1 r5 = new X.6b1
            r5.<init>(r4)
            java.util.ArrayList r25 = r3.A01()
            X.57C r17 = X.AnonymousClass57C.ASSET_PICKER
            r15 = r0
            r16 = r8
            r18 = r2
            r19 = r5
            r20 = r2
            r21 = r2
            r22 = r6
            r23 = r2
            r24 = r2
            r15.A0x(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0f1f
        L_0x01eb:
            java.lang.String r6 = "feed_post_sticker"
            goto L_0x01c7
        L_0x01ee:
            android.content.Context r11 = r0.A0f
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7 = r0.A1m
            int r6 = r7.getWidth()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r6 = X.C39898AIf.A01(r11, r6)
            float r10 = (float) r6
            int r6 = r7.getHeight()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r6 = X.C39898AIf.A00(r11, r6)
            float r9 = (float) r6
            java.lang.Integer r23 = X.AnonymousClass05K.A00
            X.8Mx r6 = X.C354668Mx.RECTANGLE
            com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes r16 = X.C48786Ek9.A00(r6)
            com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl r7 = new com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl
            r15 = r7
            r17 = r2
            r18 = r2
            r19 = r2
            r20 = r2
            r21 = r2
            r22 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            X.Aew r6 = new X.Aew
            r6.<init>()
            r6.A00 = r7
            r6.A01 = r5
            X.8bp r7 = new X.8bp
            r20 = r7
            r21 = r11
            r22 = r6
            r24 = r10
            r25 = r9
            r20.<init>(r21, r22, r23, r24, r25)
            X.6b1 r5 = new X.6b1
            r5.<init>(r4)
            int r6 = r0.A0y(r7, r3, r5, r2)
            X.8Bz r5 = r0.A1F
            if (r5 == 0) goto L_0x025d
            com.instagram.common.session.UserSession r2 = r5.A02
            boolean r2 = r7.CZ7(r2)
            if (r2 == 0) goto L_0x025d
            X.8C0 r2 = r5.A03
            java.util.Set r2 = r2.A00
            r2.add(r7)
            X.C352168Bz.A00(r7, r5, r6)
        L_0x025d:
            X.8BA r2 = r0.A0y
            X.AnonymousClass8BA.A0G(r2, r1, r1)
            goto L_0x0f1f
        L_0x0264:
            java.lang.Class<X.9pu> r6 = X.C389609pu.class
            android.graphics.drawable.Drawable r5 = A03(r0, r6)
            X.9pu r5 = (X.C389609pu) r5
            if (r5 == 0) goto L_0x0273
            X.Aeh r5 = r5.A03
            if (r5 == 0) goto L_0x0273
            r2 = r5
        L_0x0273:
            A0Z(r0, r6)
            java.lang.Class<X.Upd> r5 = X.C16152Upd.class
            A0Z(r0, r5)
            X.80U r6 = r0.A1B
            X.8Um r10 = new X.8Um
            r10.<init>(r2)
            goto L_0x0ef3
        L_0x0284:
            X.88Z r6 = r0.A1A
            X.88c r5 = X.C3512188a.A0c
            boolean r5 = r6.Cb8(r5)
            if (r5 != 0) goto L_0x029e
            boolean r7 = A0u(r0)
            android.content.Context r6 = r0.A0f
            r5 = 2131968678(0x7f1342a6, float:1.9574257E38)
            if (r7 == 0) goto L_0x0d94
            r5 = 2131968684(0x7f1342ac, float:1.957427E38)
            goto L_0x0d94
        L_0x029e:
            r5 = 1069547520(0x3fc00000, float:1.5)
            r4.A00 = r5
            r5 = 1048576000(0x3e800000, float:0.25)
            r4.A01 = r5
            android.content.Context r9 = r0.A0f
            com.instagram.common.session.UserSession r7 = r0.A0r
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r0.A1m
            int r6 = r5.getWidth()
            X.0qQ.A0B(r9, r1)
            boolean r5 = X.C346897vw.A01(r7)
            if (r5 == 0) goto L_0x0302
            r5 = 9
            X.J6V r10 = new X.J6V
            r10.<init>((int) r6, (int) r5, (java.lang.Object) r9, (java.lang.Object) r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r5 = "notify_me_sticker_redesign_default"
            java.lang.Object r5 = r10.invoke(r5)
            r6.add(r5)
            java.lang.String r5 = "notify_me_sticker_redesign_subtle"
            java.lang.Object r5 = r10.invoke(r5)
            r6.add(r5)
            java.lang.String r5 = "notify_me_sticker_redesign_rainbow"
            java.lang.Object r5 = r10.invoke(r5)
            r6.add(r5)
            java.lang.String r5 = "notify_me_sticker_redesign_hero"
            java.lang.Object r5 = r10.invoke(r5)
            r6.add(r5)
            java.lang.String r5 = "notify_me_sticker_redesign_vibrant"
            java.lang.Object r5 = r10.invoke(r5)
            r6.add(r5)
            java.lang.String r5 = "notify_me_sticker_redesign_monotone"
        L_0x02f4:
            java.lang.Object r5 = r10.invoke(r5)
            r6.add(r5)
            X.7w8 r5 = new X.7w8
            r5.<init>(r9, r7, r6)
            goto L_0x09db
        L_0x0302:
            r5 = 8
            X.J6V r10 = new X.J6V
            r10.<init>((int) r6, (int) r5, (java.lang.Object) r9, (java.lang.Object) r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r5 = "notify_me_sticker_default"
            java.lang.Object r5 = r10.invoke(r5)
            r6.add(r5)
            java.lang.String r5 = "notify_me_sticker_subtle"
            java.lang.Object r5 = r10.invoke(r5)
            r6.add(r5)
            java.lang.String r5 = "notify_me_sticker_rainbow"
            java.lang.Object r5 = r10.invoke(r5)
            r6.add(r5)
            java.lang.String r5 = "notify_me_sticker_hero"
            goto L_0x02f4
        L_0x032c:
            boolean r2 = A0t(r2, r0, r5)
            if (r2 != 0) goto L_0x0f1f
            com.instagram.common.session.UserSession r10 = r0.A0r
            android.content.Context r9 = r0.A0f
            X.0iw r2 = r0.A0o
            java.lang.String r6 = r2.getModuleName()
            X.0qQ.A0B(r9, r7)
            r2 = 3
            X.0qQ.A0B(r6, r2)
            com.instagram.api.schemas.StoryPromptTappableData r2 = r3.A01
            if (r2 == 0) goto L_0x0f1f
            X.7w8 r6 = X.C394029xQ.A00(r9, r2, r10, r6)
            if (r6 == 0) goto L_0x0f1f
            r4.A0P = r5
            r2 = 1048576000(0x3e800000, float:0.25)
            r4.A01 = r2
            r2 = 1069547520(0x3fc00000, float:1.5)
            r4.A00 = r2
            X.6nz r2 = X.C317876nz.A0h
            java.util.ArrayList r5 = r2.A01()
            goto L_0x0759
        L_0x035f:
            X.88c r2 = X.C3512188a.A0R
            boolean r2 = A0t(r2, r0, r5)
            if (r2 != 0) goto L_0x0f1f
            r2 = 9
            X.Ay8 r7 = new X.Ay8
            r7.<init>(r0, r2)
            java.lang.String r11 = "IMAGINE_ME"
            r5 = 500(0x1f4, double:2.47E-321)
            X.0eM r15 = X.C61300mW.A04
            java.lang.Object r2 = r15.getValue()
            java.util.AbstractMap r2 = (java.util.AbstractMap) r2
            boolean r2 = r2.containsKey(r11)
            r12 = 0
            if (r2 == 0) goto L_0x0394
            java.lang.Object r2 = r15.getValue()
            java.util.AbstractMap r2 = (java.util.AbstractMap) r2
            java.lang.Object r2 = r2.get(r11)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0394
            long r12 = r2.longValue()
        L_0x0394:
            long r12 = r12 + r5
            long r9 = java.lang.System.currentTimeMillis()
            int r2 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0f1f
            r7.invoke()
            java.lang.Object r7 = r15.getValue()
            java.util.AbstractMap r7 = (java.util.AbstractMap) r7
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r7.put(r11, r2)
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            android.os.Handler r7 = new android.os.Handler
            r7.<init>(r2)
            X.0mS r2 = new X.0mS
            r2.<init>()
            r7.postDelayed(r2, r5)
            goto L_0x0f1f
        L_0x03c4:
            X.88c r2 = X.C3512188a.A0T
            A0t(r2, r0, r5)
            goto L_0x0f1f
        L_0x03cb:
            X.88c r2 = X.C3512188a.A0W
            goto L_0x03d0
        L_0x03ce:
            X.88c r2 = X.C3512188a.A0A
        L_0x03d0:
            boolean r2 = A0t(r2, r0, r5)
            if (r2 != 0) goto L_0x0f1f
            X.6oG r5 = r3.A00()
            X.8BA r2 = r0.A0y
            r2.A0i(r5)
            goto L_0x0f1f
        L_0x03e1:
            com.instagram.common.session.UserSession r10 = r0.A0r
            boolean r2 = X.C395109zE.A00(r10)
            if (r2 == 0) goto L_0x0420
            X.4DH r2 = r0.A0l
            android.content.Context r6 = r2.getContext()
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.Object r9 = X.0mE.A00(r6, r2)
            r9.getClass()
            android.app.Activity r9 = (android.app.Activity) r9
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r2 = 168(0xa8, float:2.35E-43)
            java.lang.String r6 = X.C66579MXk.A00(r2)
            java.lang.String r2 = "entry_point"
            r7.putString(r2, r6)
            java.lang.Class<com.instagram.modal.ModalActivity> r19 = com.instagram.modal.ModalActivity.class
            r2 = 1447(0x5a7, float:2.028E-42)
            java.lang.String r20 = X.C273654mx.A00(r2)
            X.6W8 r15 = new X.6W8
            r17 = r7
            r18 = r10
            r16 = r9
            r15.<init>(r16, r17, r18, r19, r20)
            r15.A0C(r9)
        L_0x0420:
            X.6if r2 = r0.A1L
            java.lang.Object r7 = r2.get()
            X.JY9 r7 = (X.JY9) r7
            X.Ll3 r6 = r7.A0C
            goto L_0x0d6f
        L_0x042c:
            X.88c r2 = X.C3512188a.A0C
            boolean r2 = A0t(r2, r0, r5)
            if (r2 != 0) goto L_0x0f1f
            java.lang.Class<X.9pn> r2 = X.C389539pn.class
            android.graphics.drawable.Drawable r2 = A03(r0, r2)
            if (r2 != 0) goto L_0x0458
            X.6if r2 = r0.A1M
            java.lang.Object r6 = r2.get()
            X.AZU r6 = (X.AZU) r6
            java.util.List r5 = r3.A0Q
            if (r5 == 0) goto L_0x0458
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x0458
            java.util.List r2 = r6.A0O
            r2.clear()
            r2.addAll(r5)
            r6.A00 = r1
        L_0x0458:
            r0.A0H()
            goto L_0x0f1f
        L_0x045d:
            java.lang.Class<X.UpZ> r5 = X.C16148UpZ.class
            android.graphics.drawable.Drawable r2 = A03(r0, r5)
            X.UpZ r2 = (X.C16148UpZ) r2
            r0.A0k(r5)
            X.80U r6 = r0.A1B
            if (r2 == 0) goto L_0x0475
            X.WaI r2 = r2.A01
        L_0x046e:
            X.8UG r10 = new X.8UG
            r10.<init>(r2)
            goto L_0x0ef3
        L_0x0475:
            r2 = 0
            goto L_0x046e
        L_0x0477:
            X.8Nx r9 = r0.A0w
            X.0wc r7 = r9.A00
            java.lang.String r6 = "ig_fitness_stickers"
            X.0kJ r2 = r7.A00
            X.0Aj r7 = r7.A00(r2, r6)
            boolean r2 = r7.isSampled()
            if (r2 == 0) goto L_0x049a
            java.lang.String r6 = r9.A01
            java.lang.String r2 = "story_session_uuid"
            r7.AAJ(r2, r6)
            java.lang.String r6 = "TAP_FITNESS_STICKER_TRAY_ENTRYPOINT"
            java.lang.String r2 = "event_name"
            r7.AAJ(r2, r6)
            r7.Cgf()
        L_0x049a:
            X.6if r2 = r0.A1L
            java.lang.Object r9 = r2.get()
            X.JY9 r9 = (X.JY9) r9
            X.Lkz r6 = r9.A0F
            if (r6 == 0) goto L_0x0a11
            X.Lbq r2 = r9.A0A
            if (r2 == 0) goto L_0x0a11
            r2.A02(r6, r5)
            goto L_0x0a11
        L_0x04af:
            X.6if r2 = r0.A1N
            java.lang.Object r5 = r2.get()
            X.LmS r5 = (X.C65048LmS) r5
            java.util.List r2 = r3.A0N
            java.util.Map r7 = r5.A05
            r7.clear()
            if (r2 == 0) goto L_0x04da
            java.util.Iterator r6 = r2.iterator()
        L_0x04c4:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x04da
            java.lang.Object r5 = r6.next()
            X.N4G r5 = (X.N4G) r5
            java.lang.String r2 = r5.A01
            X.KiQ r2 = X.C63404KwP.A00(r2)
            r7.put(r2, r5)
            goto L_0x04c4
        L_0x04da:
            java.lang.Class<X.8v7> r2 = X.C369658v7.class
            r0.A0k(r2)
            X.80U r6 = r0.A1B
            X.8UY r10 = new X.8UY
            r10.<init>()
            goto L_0x0ef3
        L_0x04e8:
            java.lang.Class<X.7w5> r6 = X.C346987w5.class
            android.graphics.drawable.Drawable r5 = A03(r0, r6)
            X.7w5 r5 = (X.C346987w5) r5
            if (r5 == 0) goto L_0x04f9
            X.Aej r2 = r5.A02
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.model.SecretStickerClientModel"
            X.0qQ.A0C(r2, r5)
        L_0x04f9:
            r0.A0k(r6)
            X.80U r6 = r0.A1B
            X.8UX r10 = new X.8UX
            r10.<init>(r2)
            goto L_0x0ef3
        L_0x0505:
            X.6if r9 = r0.A2A
            java.lang.Object r10 = r9.get()
            X.LmT r10 = (X.C65049LmT) r10
            java.util.List r7 = r3.A0S
            if (r7 == 0) goto L_0x0521
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x0521
            java.util.List r6 = r10.A0A
            r6.clear()
            r6.addAll(r7)
            r10.A01 = r1
        L_0x0521:
            java.lang.Class<X.JZg> r6 = X.C59812JZg.class
            android.graphics.drawable.Drawable r7 = A03(r0, r6)
            X.JZg r7 = (X.C59812JZg) r7
            if (r7 == 0) goto L_0x0534
            com.instagram.reels.prompt.model.PromptStickerModel r6 = r7.A06
            boolean r6 = r6.A0L()
            if (r6 == 0) goto L_0x0534
            goto L_0x059a
        L_0x0534:
            boolean r6 = r8 instanceof X.C59812JZg
            if (r6 == 0) goto L_0x054d
            java.lang.Object r2 = r9.get()
            X.LmT r2 = (X.C65049LmT) r2
            r2.A0B = r5
            r2 = r8
            X.JZg r2 = (X.C59812JZg) r2
            com.instagram.reels.prompt.model.PromptStickerModel r2 = r2.A06
            r0.A0g(r2)
            r0.D9o()
            goto L_0x0f1f
        L_0x054d:
            if (r7 == 0) goto L_0x0551
            com.instagram.reels.prompt.model.PromptStickerModel r2 = r7.A06
        L_0x0551:
            r0.A0g(r2)
            goto L_0x0f1f
        L_0x0556:
            X.88c r6 = X.C3512188a.A0h
            boolean r6 = A0t(r6, r0, r5)
            if (r6 != 0) goto L_0x0f1f
            java.lang.Class<X.JZg> r9 = X.C59812JZg.class
            android.graphics.drawable.Drawable r6 = A03(r0, r9)
            X.JZg r6 = (X.C59812JZg) r6
            if (r6 != 0) goto L_0x0590
            X.6if r5 = r0.A2A
            java.lang.Object r7 = r5.get()
            X.LmT r7 = (X.C65049LmT) r7
            java.util.List r6 = r3.A0S
            if (r6 == 0) goto L_0x0584
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L_0x0584
            java.util.List r5 = r7.A0A
            r5.clear()
            r5.addAll(r6)
            r7.A01 = r1
        L_0x0584:
            r0.A0k(r9)
            X.80U r6 = r0.A1B
            X.8T9 r10 = new X.8T9
            r10.<init>(r2)
            goto L_0x0ef3
        L_0x0590:
            com.instagram.reels.prompt.model.PromptStickerModel r2 = r6.A06
            if (r2 == 0) goto L_0x0584
            boolean r6 = r2.A0L()
            if (r6 != r5) goto L_0x0584
        L_0x059a:
            X.80U r6 = r0.A1B
            X.8U2 r10 = new X.8U2
            r10.<init>()
            goto L_0x0ef3
        L_0x05a3:
            X.88Z r7 = r0.A1A
            X.88c r6 = X.C3512188a.A0l
            boolean r6 = r7.Cb8(r6)
            if (r6 == 0) goto L_0x0d81
            X.88c r6 = X.C3512188a.A0U
            boolean r6 = r7.Cb8(r6)
            if (r6 != 0) goto L_0x05bc
            android.content.Context r6 = r0.A0f
            r5 = 2131967739(0x7f133efb, float:1.9572353E38)
            goto L_0x0d94
        L_0x05bc:
            X.6if r2 = r0.A1L
            java.lang.Object r7 = r2.get()
            X.JY9 r7 = (X.JY9) r7
            r7.A0X = r1
            r7.A0Y = r1
            X.Ll2 r6 = r7.A0H
            goto L_0x0d6f
        L_0x05cc:
            android.content.Context r2 = r0.A0f
            X.9ps r6 = new X.9ps
            r6.<init>(r2)
            X.6nz r2 = X.C317876nz.A1X
            goto L_0x0753
        L_0x05d7:
            X.88Z r6 = r0.A1A
            X.88c r5 = X.C3512188a.A0P
            boolean r5 = r6.Cb8(r5)
            if (r5 == 0) goto L_0x05f1
            X.88c r5 = X.C3512188a.A0M
            boolean r5 = r6.Cb8(r5)
            if (r5 == 0) goto L_0x05f1
            X.88c r5 = X.C3512188a.A04
            boolean r5 = r6.Cb8(r5)
            if (r5 != 0) goto L_0x0f1f
        L_0x05f1:
            android.content.Context r6 = r0.A0f
            r5 = 2131972280(0x7f1350b8, float:1.9581563E38)
            goto L_0x0d94
        L_0x05f8:
            X.88Z r7 = r0.A1A
            X.88c r6 = X.C3512188a.A0p
            boolean r6 = r7.Cb8(r6)
            if (r6 != 0) goto L_0x0609
            android.content.Context r6 = r0.A0f
            r5 = 2131976022(0x7f135f56, float:1.9589153E38)
            goto L_0x0d94
        L_0x0609:
            X.6if r2 = r0.A1L
            java.lang.Object r7 = r2.get()
            X.JY9 r7 = (X.JY9) r7
            X.WUH r6 = r7.A0T
            goto L_0x0d6f
        L_0x0615:
            boolean r5 = r0.CXD()
            if (r5 == 0) goto L_0x0da8
            java.lang.Integer r19 = X.AnonymousClass05K.A00
            com.instagram.reels.smb.model.ProfileStickerModel r5 = new com.instagram.reels.smb.model.ProfileStickerModel
            r15 = r5
            r16 = r3
            r17 = r2
            r18 = r2
            r20 = r19
            r15.<init>(r16, r17, r18, r19, r20)
            X.80U r6 = r0.A1B
            X.8TR r10 = new X.8TR
            r10.<init>(r5)
            goto L_0x0ef3
        L_0x0634:
            boolean r5 = r0.CXD()
            if (r5 == 0) goto L_0x0da8
            java.lang.Integer r19 = com.instagram.reels.smb.model.ProfileStickerModel.A08
            java.lang.Integer r20 = X.AnonymousClass05K.A00
            com.instagram.reels.smb.model.ProfileStickerModel r5 = new com.instagram.reels.smb.model.ProfileStickerModel
            r15 = r5
            r16 = r3
            r17 = r2
            r18 = r2
            r15.<init>(r16, r17, r18, r19, r20)
            X.80U r6 = r0.A1B
            X.8TR r10 = new X.8TR
            r10.<init>(r5)
            goto L_0x0ef3
        L_0x0653:
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            goto L_0x065b
        L_0x0656:
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            goto L_0x065b
        L_0x0659:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
        L_0x065b:
            X.0eE r7 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r6 = r0.A0r
            com.instagram.user.model.User r10 = r7.A01(r6)
            int r7 = r9.intValue()
            if (r7 == r1) goto L_0x0691
            if (r7 == r5) goto L_0x068a
            X.4Cl r7 = r10.A03
            X.4os r12 = r7.Bx1()
        L_0x0671:
            java.lang.Class<X.UpY> r7 = X.C16147UpY.class
            android.graphics.drawable.Drawable r7 = A03(r0, r7)
            X.UpY r7 = (X.C16147UpY) r7
            r11 = 0
            if (r7 == 0) goto L_0x06c2
            X.Vuw r10 = r7.A00
            if (r10 != 0) goto L_0x0698
            java.lang.String r0 = "smbSupportStickerModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x068a:
            X.4Cl r7 = r10.A03
            X.4os r12 = r7.Bwz()
            goto L_0x0671
        L_0x0691:
            X.4Cl r7 = r10.A03
            X.4os r12 = r7.Bx2()
            goto L_0x0671
        L_0x0698:
            com.instagram.user.model.User r7 = r10.A00()
            if (r7 == 0) goto L_0x06b7
            com.instagram.user.model.User r7 = r10.A00()
            if (r7 == 0) goto L_0x06a8
            java.lang.String r11 = r7.getId()
        L_0x06a8:
            java.lang.String r7 = r6.A06
            boolean r7 = X.0qQ.A0K(r11, r7)
            if (r7 != 0) goto L_0x06b7
            android.content.Context r6 = r0.A0f
            r5 = 2131974064(0x7f1357b0, float:1.9585181E38)
            goto L_0x0eb3
        L_0x06b7:
            java.lang.Integer r2 = r10.A01()
            if (r9 != r2) goto L_0x06c2
            A0X(r0, r10)
            goto L_0x0f1f
        L_0x06c2:
            if (r12 == 0) goto L_0x06c9
            r0.A1M(r9)
            goto L_0x0f1f
        L_0x06c9:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r2 != r9) goto L_0x0739
            r0.A0V = r5
        L_0x06cf:
            X.4DH r2 = r0.A0l
            android.content.Context r5 = r2.getContext()
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.Object r7 = X.0mE.A00(r5, r2)
            r7.getClass()
            android.app.Activity r7 = (android.app.Activity) r7
            boolean r2 = r0.A0T
            if (r2 == 0) goto L_0x0727
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.String r5 = "entrypoint"
            java.lang.String r2 = "sticker"
            r9.put(r5, r2)
            com.instagram.api.schemas.SMBPartnerType r2 = com.instagram.api.schemas.SMBPartnerType.FOOD_DELIVERY
            java.lang.String r5 = r2.toString()
            r2 = 1252(0x4e4, float:1.754E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r9.put(r2, r5)
            r2 = 1192(0x4a8, float:1.67E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.DiU r5 = X.C46649DiU.A04(r2, r9)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r2.<init>((X.0lg) r6)
            java.lang.Class<com.instagram.modal.ModalActivity> r19 = com.instagram.modal.ModalActivity.class
            X.0qQ.A0A(r5)
            android.os.Bundle r17 = X.C49891FBs.A00(r2, r5)
            java.lang.String r20 = "bloks"
        L_0x0719:
            X.6W8 r15 = new X.6W8
            r18 = r6
            r16 = r7
            r15.<init>(r16, r17, r18, r19, r20)
            r15.A0C(r7)
            goto L_0x0f1f
        L_0x0727:
            boolean r2 = r0.A0U
            if (r2 == 0) goto L_0x0f1f
            java.lang.Class<com.instagram.modal.ModalActivity> r19 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r17 = new android.os.Bundle
            r17.<init>()
            r2 = 798(0x31e, float:1.118E-42)
            java.lang.String r20 = X.C273654mx.A00(r2)
            goto L_0x0719
        L_0x0739:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r2 != r9) goto L_0x0740
            r0.A0T = r5
            goto L_0x06cf
        L_0x0740:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r2 != r9) goto L_0x06cf
            r0.A0U = r5
            goto L_0x06cf
        L_0x0747:
            com.instagram.common.session.UserSession r6 = r0.A0r
            android.content.Context r5 = r0.A0f
            java.util.List r2 = r3.A0U
            X.7w8 r6 = X.C39819AAq.A01(r5, r6, r2)
            X.6nz r2 = X.C317876nz.A1f
        L_0x0753:
            java.util.ArrayList r5 = r2.A01()
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
        L_0x0759:
            X.6b1 r2 = new X.6b1
            r2.<init>(r4)
            r0.A1K(r6, r2, r5)
            goto L_0x0f1f
        L_0x0763:
            X.88c r6 = X.C3512188a.A0n
            boolean r6 = A0t(r6, r0, r5)
            if (r6 != 0) goto L_0x0f1f
            X.82p r6 = r0.A13
            X.82o r6 = r6.A02
            X.82Y r6 = r6.A01
            java.util.List r6 = r6.A0m
            int r6 = r6.size()
            if (r6 <= r5) goto L_0x0783
            android.content.Context r6 = r0.A0f
            X.0qQ.A0B(r6, r1)
            r5 = 2131968425(0x7f1341a9, float:1.9573744E38)
            goto L_0x0d94
        L_0x0783:
            java.lang.Class<X.8Nk> r6 = X.C354798Nk.class
            android.graphics.drawable.Drawable r6 = A03(r0, r6)
            X.8Nk r6 = (X.C354798Nk) r6
            if (r6 == 0) goto L_0x079a
            com.instagram.reels.prompt.model.PromptStickerModel r2 = r6.A0B
            boolean r2 = r2.A0M()
            if (r2 == 0) goto L_0x0f1f
            r0.A0h(r6)
            goto L_0x0f1f
        L_0x079a:
            X.6if r10 = r0.A1L
            java.lang.Object r6 = r10.get()
            X.JY9 r6 = (X.JY9) r6
            boolean r6 = r6.A0Q()
            if (r6 != 0) goto L_0x07cb
            X.AWO r7 = new X.AWO
            r7.<init>(r0)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r0.A1m
            java.util.ArrayList r6 = r6.A0T(r7)
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ 1
            if (r6 != 0) goto L_0x07cb
            com.instagram.common.session.UserSession r11 = r0.A0r
            X.0Tu r9 = X.0Tu.A05
            r6 = 36319939968769865(0x8108cb001a1f49, double:3.032214512685027E-306)
            boolean r6 = X.182.A06(r9, r11, r6)
            r13 = 1
            if (r6 == 0) goto L_0x07cc
        L_0x07cb:
            r13 = 0
        L_0x07cc:
            r12 = r13 ^ 1
            android.content.Context r9 = r0.A0f
            X.0iw r6 = r0.A0o
            java.lang.String r7 = r6.getModuleName()
            com.instagram.common.session.UserSession r6 = r0.A0r
            com.instagram.api.schemas.StoryPromptType r17 = com.instagram.api.schemas.StoryPromptType.STORY_TEMPLATE
            X.0eE r11 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r11 = r11.A01(r6)
            java.util.List r25 = java.util.Collections.singletonList(r11)
            X.0qQ.A07(r25)
            java.lang.String r20 = ""
            java.lang.Integer r19 = X.AnonymousClass05K.A00
            com.instagram.reels.prompt.model.PromptStickerModel r15 = new com.instagram.reels.prompt.model.PromptStickerModel
            r18 = r2
            r21 = r20
            r22 = r2
            r23 = r2
            r24 = r2
            r26 = r1
            r27 = r1
            r28 = r1
            r29 = r1
            r30 = r1
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.0qQ.A0B(r9, r1)
            X.0qQ.A0B(r7, r5)
            r20 = 112(0x70, float:1.57E-43)
            X.8Nk r11 = new X.8Nk
            r16 = r9
            r17 = r6
            r18 = r15
            r19 = r7
            r21 = r1
            r22 = r1
            r15 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            if (r13 == 0) goto L_0x087a
            java.lang.Object r5 = r10.get()
            X.JY9 r5 = (X.JY9) r5
            int r6 = r5.A0F()
            android.content.res.Resources r7 = r9.getResources()
            r5 = 2131165184(0x7f070000, float:1.7944578E38)
            int r5 = r7.getDimensionPixelSize(r5)
            int r6 = r6 + r5
            X.6M4 r5 = r11.A0A
            X.6Ly r5 = r5.A05
            int r5 = r5.A06
            int r6 = r6 + r5
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r9 = r0.A10
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r9 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r9
            int r5 = r9.A0F
            int r6 = r6 - r5
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = (float) r6
            X.81W r5 = r9.A0K
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r6 = r6 / r5
            float r7 = r7 - r6
            java.lang.Float r5 = java.lang.Float.valueOf(r7)
        L_0x0855:
            X.ABC.A01(r4, r5)
            X.8Mp r6 = r0.A1D
            java.util.List r5 = r3.A0T
            r6.A01(r5)
            X.6b1 r5 = new X.6b1
            r5.<init>(r4)
            r0.A0y(r11, r3, r5, r2)
            if (r12 == 0) goto L_0x0872
            boolean r2 = r0.A0o()
            if (r2 == 0) goto L_0x0872
            r0.A0h(r11)
        L_0x0872:
            if (r13 == 0) goto L_0x0f1f
            X.80U r6 = r0.A1B
            X.8Ui r10 = X.C356558Ui.A00
            goto L_0x0ef3
        L_0x087a:
            r5 = r2
            goto L_0x0855
        L_0x087c:
            java.lang.Class<X.8vD> r6 = X.C369718vD.class
            X.7w8 r6 = A07(r0, r6)
            if (r6 != 0) goto L_0x0958
            com.instagram.common.session.UserSession r6 = r0.A0r
            android.content.Context r9 = r0.A0f
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r10 = r0.A1m
            int r11 = r10.getWidth()
            X.0qQ.A0B(r9, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.J6V r10 = new X.J6V
            r10.<init>((int) r11, (int) r5, (java.lang.Object) r9, (java.lang.Object) r6)
            java.lang.String r5 = "vibrant_whatsapp_sticker_id"
            java.lang.Object r5 = r10.invoke(r5)
            r7.add(r5)
            java.lang.String r5 = "vibrant_chats_on_whatsapp_sticker_id"
            java.lang.Object r5 = r10.invoke(r5)
            r7.add(r5)
            java.lang.String r5 = "subtle_whatsapp_sticker_id"
            java.lang.Object r5 = r10.invoke(r5)
            r7.add(r5)
            java.lang.String r5 = "subtle_chats_on_whatsapp_sticker_id"
            java.lang.Object r5 = r10.invoke(r5)
            r7.add(r5)
            X.7w8 r5 = new X.7w8
            r5.<init>(r9, r6, r7)
            X.9F4 r7 = X.AnonymousClass9F3.A00(r6)
            X.0eM r7 = r7.A02
            java.lang.Object r7 = r7.getValue()
            X.9F7 r7 = (X.AnonymousClass9F7) r7
            java.lang.Class<X.6SL> r9 = X.AnonymousClass6SL.class
            com.facebook.common.callercontext.CallerContext r16 = com.facebook.common.callercontext.CallerContext.A00(r9)
            java.lang.String r17 = "ig_android_whatsapp_asset_ig_to_fb_crossposting"
            java.lang.String r18 = "user"
            java.lang.String r19 = "correctnessTest"
            java.lang.String r20 = "hasWhatsappNumber"
            X.9JK r15 = new X.9JK
            r15.<init>((com.facebook.common.callercontext.CallerContext) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20)
            java.lang.Object r7 = r7.Au3(r15)
            X.9Ge r7 = (X.C376009Ge) r7
            if (r7 == 0) goto L_0x0904
            X.9Gd r7 = r7.A00
            if (r7 == 0) goto L_0x0904
            com.facebook.common.callercontext.CallerContext r16 = com.facebook.common.callercontext.CallerContext.A00(r9)
            X.9JK r15 = new X.9JK
            r15.<init>((com.facebook.common.callercontext.CallerContext) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20)
            java.lang.String r7 = r7.A00(r15, r6)
            if (r7 == 0) goto L_0x0904
            int r7 = r7.length()
            if (r7 != 0) goto L_0x09db
        L_0x0904:
            X.A6g r2 = new X.A6g
            r2.<init>(r5, r3, r0, r4)
            X.AnonymousClass6SL.A00 = r2
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.String r5 = "entrypoint"
            java.lang.String r2 = "whatsapp_linking_in_ig_stories_sticker_tray"
            r10.put(r5, r2)
            java.lang.String r5 = r0.A1o
            java.lang.String r2 = "back_stack_tag"
            r10.put(r2, r5)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            X.4DH r2 = r0.A0l
            androidx.fragment.app.FragmentActivity r7 = r2.requireActivity()
            com.instagram.bloks.hosting.IgBloksScreenConfig r5 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r5.<init>((X.0lg) r6)
            java.lang.String r2 = "WhatsApp"
            r5.A0U = r2
            r2 = 46
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.DiU r2 = X.C46649DiU.A06(r2, r10, r9)
            java.lang.Class<com.instagram.modal.ModalActivity> r19 = com.instagram.modal.ModalActivity.class
            X.0qQ.A0A(r2)
            android.os.Bundle r17 = X.C49891FBs.A00(r5, r2)
            java.lang.String r20 = "bloks"
            X.6W8 r5 = new X.6W8
            r15 = r5
            r16 = r7
            r18 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            r2 = 1337(0x539, float:1.874E-42)
            r5.A0A(r7, r2)
            goto L_0x0f1f
        L_0x0958:
            android.content.Context r6 = r0.A0f
            r5 = 2131967743(0x7f133eff, float:1.957236E38)
            goto L_0x0d94
        L_0x095f:
            com.instagram.common.session.UserSession r13 = r0.A0r
            android.content.Context r12 = r0.A0f
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r0.A1m
            int r11 = r6.getWidth()
            X.0qQ.A0B(r12, r7)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r6 = r3.A0O
            java.util.Iterator r16 = r6.iterator()
            r9 = 0
            r7 = 0
        L_0x0979:
            boolean r6 = r16.hasNext()
            if (r6 == 0) goto L_0x09c9
            java.lang.Object r6 = r16.next()
            X.6o8 r6 = (X.C317966o8) r6
            java.lang.String r15 = r6.A0S
            int r6 = r15.hashCode()
            switch(r6) {
                case -1237411264: goto L_0x09bc;
                case -585878738: goto L_0x09ab;
                case 23827889: goto L_0x099f;
                case 1336519779: goto L_0x098f;
                default: goto L_0x098e;
            }
        L_0x098e:
            goto L_0x0979
        L_0x098f:
            r6 = 691(0x2b3, float:9.68E-43)
            java.lang.String r6 = X.C273654mx.A00(r6)
            boolean r6 = r15.equals(r6)
            if (r6 == 0) goto L_0x0979
            X.AII.A01(r12, r10, r5, r1, r11)
            goto L_0x09ba
        L_0x099f:
            java.lang.String r6 = "internal_sticker_subtle"
            boolean r6 = r15.equals(r6)
            if (r6 == 0) goto L_0x0979
            X.AII.A01(r12, r10, r1, r5, r11)
            goto L_0x09c7
        L_0x09ab:
            r6 = 690(0x2b2, float:9.67E-43)
            java.lang.String r6 = X.C273654mx.A00(r6)
            boolean r6 = r15.equals(r6)
            if (r6 == 0) goto L_0x0979
            X.AII.A01(r12, r10, r5, r5, r11)
        L_0x09ba:
            r7 = 1
            goto L_0x0979
        L_0x09bc:
            java.lang.String r6 = "internal_sticker_vibrant"
            boolean r6 = r15.equals(r6)
            if (r6 == 0) goto L_0x0979
            X.AII.A01(r12, r10, r1, r1, r11)
        L_0x09c7:
            r9 = 1
            goto L_0x0979
        L_0x09c9:
            X.7w8 r5 = new X.7w8
            r5.<init>(r12, r13, r10)
            X.9m1 r6 = new X.9m1
            r6.<init>()
            r6.A00 = r11
            r6.A01 = r9
            r6.A02 = r7
            r5.A03 = r6
        L_0x09db:
            X.6b1 r6 = new X.6b1
            r6.<init>(r4)
            r0.A0y(r5, r3, r6, r2)
            goto L_0x0f1f
        L_0x09e5:
            boolean r2 = r8 instanceof X.AnonymousClass9X8
            if (r2 == 0) goto L_0x0f1f
            X.87i r6 = r0.A0x
            X.9X8 r5 = r6.A09
            if (r5 == 0) goto L_0x09f4
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r0.A1m
            r2.A0S(r5)
        L_0x09f4:
            r4.A08 = r6
            goto L_0x0f72
        L_0x09f8:
            X.6if r2 = r0.A1L
            java.lang.Object r9 = r2.get()
            X.JY9 r9 = (X.JY9) r9
            X.Ll6 r6 = r9.A0G
            if (r6 == 0) goto L_0x0a0b
            X.Lbq r2 = r9.A0A
            if (r2 == 0) goto L_0x0a0b
            r2.A02(r6, r5)
        L_0x0a0b:
            boolean r2 = r9.A0Q()
            if (r2 == 0) goto L_0x0f1f
        L_0x0a11:
            X.2cs r7 = r9.A16
            int r2 = r9.A0z
            float r5 = (float) r2
            r2 = 1036831952(0x3dccccd0, float:0.100000024)
            float r5 = r5 * r2
            double r5 = (double) r5
            goto L_0x0d7c
        L_0x0a1d:
            X.80U r6 = r0.A1B
            X.80V r5 = r6.Atr()
            X.80V r2 = X.AnonymousClass80V.MEDIA_EDIT
            if (r5 == r2) goto L_0x0a4b
            X.6if r2 = r0.A1L
            java.lang.Object r2 = r2.get()
            X.JY9 r2 = (X.JY9) r2
            r2.A0G()
            goto L_0x0f1f
        L_0x0a34:
            X.80U r6 = r0.A1B
            X.80V r5 = r6.Atr()
            X.80V r2 = X.AnonymousClass80V.MEDIA_EDIT
            if (r5 == r2) goto L_0x0a4b
            X.6if r2 = r0.A1L
            java.lang.Object r2 = r2.get()
            X.JY9 r2 = (X.JY9) r2
            r2.A0H()
            goto L_0x0f1f
        L_0x0a4b:
            X.8Ur r10 = new X.8Ur
            r10.<init>(r3)
            goto L_0x0ef3
        L_0x0a52:
            X.6if r2 = r0.A1L
            java.lang.Object r5 = r2.get()
            X.JY9 r5 = (X.JY9) r5
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r5.A0L(r2)
            goto L_0x0f1f
        L_0x0a61:
            java.lang.Class<X.UpW> r5 = X.C16145UpW.class
            android.graphics.drawable.Drawable r2 = A03(r0, r5)
            X.UpW r2 = (X.C16145UpW) r2
            r0.A0k(r5)
            X.80U r6 = r0.A1B
            if (r2 == 0) goto L_0x0a79
            X.WaK r2 = r2.A0B
        L_0x0a72:
            X.8TB r10 = new X.8TB
            r10.<init>(r2)
            goto L_0x0ef3
        L_0x0a79:
            r2 = 0
            goto L_0x0a72
        L_0x0a7b:
            android.graphics.drawable.Drawable r2 = r0.A10()
            r0.A1F(r2)
            goto L_0x0f1f
        L_0x0a84:
            java.lang.Class<X.Upa> r6 = X.C16149Upa.class
            android.graphics.drawable.Drawable r2 = A03(r0, r6)
            X.Upa r2 = (X.C16149Upa) r2
            if (r2 != 0) goto L_0x0aad
            java.lang.String r5 = r3.A0J
            r5.getClass()
            java.util.Locale r2 = java.util.Locale.getDefault()
            X.0qQ.A07(r2)
            java.lang.String r2 = r5.toUpperCase(r2)
            X.0qQ.A07(r2)
            A0Z(r0, r6)
            X.80U r6 = r0.A1B
            X.8T7 r10 = new X.8T7
            r10.<init>((java.lang.String) r2)
            goto L_0x0ef3
        L_0x0aad:
            r0.A0k(r6)
            X.80U r6 = r0.A1B
            X.WaJ r2 = r2.A0H
            X.8T7 r10 = new X.8T7
            r10.<init>((X.C19471WaJ) r2)
            goto L_0x0ef3
        L_0x0abb:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r0.A1m
            java.lang.Class<X.8vE> r6 = X.C369728vE.class
            java.util.ArrayList r5 = r2.A0V(r6)
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x0af6
            A0Z(r0, r6)
            java.util.List r2 = r3.A0O
            java.lang.Object r2 = r2.get(r1)
            X.6o8 r2 = (X.C317966o8) r2
            X.80U r6 = r0.A1B
            java.lang.String r10 = ""
            r9 = r10
            java.lang.String r7 = r2.A0X
            java.lang.String r5 = r2.A0R
            java.lang.String r2 = r3.A0I
            if (r2 == 0) goto L_0x0ae2
            r9 = r2
        L_0x0ae2:
            X.Aex r2 = new X.Aex
            r2.<init>()
            r2.A02 = r7
            r2.A01 = r5
            r2.A00 = r9
            r2.A03 = r10
            X.8TV r10 = new X.8TV
            r10.<init>(r2)
            goto L_0x0ef3
        L_0x0af6:
            java.lang.Object r2 = r5.get(r1)
            X.8vE r2 = (X.C369728vE) r2
            A0W(r0, r2)
            goto L_0x0f1f
        L_0x0b01:
            X.6if r6 = r0.A2B
            java.lang.Object r6 = r6.get()
            X.WBM r6 = (X.WBM) r6
            r6.A0A = r5
        L_0x0b0b:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r0.A1m
            java.lang.Class<X.Upd> r7 = X.C16152Upd.class
            java.util.ArrayList r6 = r5.A0V(r7)
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L_0x0b92
            A0Z(r0, r7)
            java.lang.Class<X.9pu> r5 = X.C389609pu.class
            A0Z(r0, r5)
            boolean r9 = A0u(r0)
            java.util.List r5 = r3.A0O
            java.lang.Object r5 = r5.get(r1)
            X.6o8 r5 = (X.C317966o8) r5
            java.util.List r6 = r5.A0n
            java.util.List r5 = r3.A0O
            java.lang.Object r5 = r5.get(r1)
            X.6o8 r5 = (X.C317966o8) r5
            if (r6 == 0) goto L_0x0b62
            java.util.List r5 = r5.A0m
            if (r5 == 0) goto L_0x0b43
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r5)
            if (r10 != 0) goto L_0x0b48
        L_0x0b43:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0b48:
            X.80U r6 = r0.A1B
            com.instagram.reels.question.model.responsetype.QuestionResponseType r5 = com.instagram.reels.question.model.responsetype.QuestionResponseType.MEDIA
            boolean r7 = r10.contains(r5)
            com.instagram.reels.question.model.responsetype.QuestionResponseType r5 = com.instagram.reels.question.model.responsetype.QuestionResponseType.MUSIC
            r10.contains(r5)
            boolean r5 = r10.isEmpty()
            r5 = r5 ^ 1
            X.8TC r10 = new X.8TC
            r10.<init>(r2, r9, r7, r5)
            goto L_0x0ef3
        L_0x0b62:
            java.lang.String r7 = r5.A0Y
            com.instagram.reels.question.constants.QuestionStickerType r17 = com.instagram.reels.question.constants.QuestionStickerType.TEXT
            android.content.Context r10 = r0.A0f
            X.C19477WaP.A00(r10)
            X.C19477WaP.A01(r10)
            X.0eE r6 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r5 = r0.A0r
            com.instagram.user.model.User r5 = r6.A01(r5)
            com.instagram.common.typedurl.ImageUrl r16 = r5.Bh3()
            int r20 = X.C19477WaP.A01(r10)
            int r19 = X.C19477WaP.A00(r10)
            X.WaP r15 = new X.WaP
            r21 = r9
            r22 = r1
            r18 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r0.Dn8(r15, r2)
            goto L_0x0f1f
        L_0x0b92:
            java.lang.Object r2 = r6.get(r1)
            X.Upd r2 = (X.C16152Upd) r2
            r0.A0i(r2)
            goto L_0x0f1f
        L_0x0b9d:
            java.lang.Class<X.8v8> r5 = X.C369668v8.class
            android.graphics.drawable.Drawable r2 = A03(r0, r5)
            X.8v8 r2 = (X.C369668v8) r2
            A0Z(r0, r5)
            if (r2 == 0) goto L_0x0bb5
            X.WaH r2 = r2.A03
        L_0x0bac:
            X.80U r6 = r0.A1B
            X.8UE r10 = new X.8UE
            r10.<init>(r2)
            goto L_0x0ef3
        L_0x0bb5:
            r2 = 0
            goto L_0x0bac
        L_0x0bb7:
            X.80U r6 = r0.A1B
            X.8Sx r10 = new X.8Sx
            r10.<init>()
            goto L_0x0ef3
        L_0x0bc0:
            java.lang.Class<X.8v8> r2 = X.C369668v8.class
            android.graphics.drawable.Drawable r2 = A03(r0, r2)
            X.8v8 r2 = (X.C369668v8) r2
            r0.A0f(r2)
            goto L_0x0f1f
        L_0x0bcd:
            java.lang.Class<X.8v6> r6 = X.C369648v6.class
            android.graphics.drawable.Drawable r5 = A03(r0, r6)
            X.8v6 r5 = (X.C369648v6) r5
            if (r5 == 0) goto L_0x0be9
            boolean r2 = r5.A0B
            if (r2 != 0) goto L_0x0be9
            X.WaM r2 = r5.A09
        L_0x0bdd:
            r0.A0k(r6)
            X.80U r6 = r0.A1B
            X.8UC r10 = new X.8UC
            r10.<init>(r2)
            goto L_0x0ef3
        L_0x0be9:
            r2 = 0
            goto L_0x0bdd
        L_0x0beb:
            r0.A0I()
            goto L_0x0f1f
        L_0x0bf0:
            com.instagram.common.session.UserSession r9 = r0.A0r
            X.0Tu r10 = X.0Tu.A05
            r6 = 36315636409830847(0x8104e100000dbf, double:3.029492924682951E-306)
            boolean r6 = X.182.A06(r10, r9, r6)
            java.lang.String r7 = "STICKER_TRAY"
            if (r6 == 0) goto L_0x0c47
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r0.A1m
            boolean r5 = X.ABT.A01(r5)
            if (r5 == 0) goto L_0x0c12
            android.content.Context r1 = r0.A0f
            r0 = 2131968822(0x7f134336, float:1.957455E38)
            X.C59689JTv.A07(r1, r0)
            return
        L_0x0c12:
            X.4DH r11 = r0.A0l
            X.XSG r10 = X.XSG.IG_STANDALONE_FOR_CHARITY
            java.lang.String r12 = "sticker_tray_donate_button"
            X.0wc r13 = X.AnonymousClass0kN.A01(r11, r9)
            r5 = 1432(0x598, float:2.007E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r5)
            X.0kJ r5 = r13.A00
            X.0Aj r6 = r13.A00(r5, r6)
            java.lang.String r5 = "feature"
            r6.AAJ(r5, r12)
            java.lang.String r5 = "source_name"
            r6.AAJ(r5, r7)
            r5 = 151(0x97, float:2.12E-43)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r6.A8M(r10, r5)
            r6.Cgf()
            androidx.fragment.app.FragmentActivity r5 = r11.requireActivity()
            X.LTV.A06(r5, r9, r2, r7)
            goto L_0x0f1f
        L_0x0c47:
            java.lang.Class<X.8v3> r6 = X.C369618v3.class
            android.graphics.drawable.Drawable r2 = A03(r0, r6)
            X.8v3 r2 = (X.C369618v3) r2
            if (r2 == 0) goto L_0x0c62
            X.WaN r2 = r2.A09
            X.0qQ.A07(r2)
            A0Z(r0, r6)
            X.80U r6 = r0.A1B
            X.8TP r10 = new X.8TP
            r10.<init>(r2)
            goto L_0x0ef3
        L_0x0c62:
            X.4DH r2 = r0.A0l
            X.LTM.A02(r2, r9, r7)
            X.6if r2 = r0.A1L
            java.lang.Object r7 = r2.get()
            X.JY9 r7 = (X.JY9) r7
            X.Ll9 r6 = r7.A0N
            goto L_0x0d6f
        L_0x0c73:
            X.88Z r7 = r0.A1A
            X.88c r6 = X.C3512188a.A0J
            boolean r6 = r7.Cb8(r6)
            if (r6 == 0) goto L_0x0cd3
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r0.A1m
            java.lang.Class<X.9pw> r9 = X.C389629pw.class
            java.util.ArrayList r10 = r6.A0V(r9)
            java.util.List r6 = r3.A0O
            java.lang.Object r6 = r6.get(r1)
            X.6o8 r6 = (X.C317966o8) r6
            java.lang.Boolean r6 = r6.A0L
            if (r6 == 0) goto L_0x0c98
            boolean r7 = r6.booleanValue()
            r6 = 1
            if (r7 != 0) goto L_0x0c99
        L_0x0c98:
            r6 = 0
        L_0x0c99:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0cb5
            boolean r6 = r10.isEmpty()
            if (r6 == 0) goto L_0x0cd3
            X.6if r2 = r0.A1L
            java.lang.Object r7 = r2.get()
            X.JY9 r7 = (X.JY9) r7
            X.AZf r6 = r7.A0R
            goto L_0x0d6f
        L_0x0cb5:
            X.0qQ.A0B(r10, r1)
            java.lang.Object r2 = X.00k.A0J(r10)
            X.9pw r2 = (X.C389629pw) r2
            r0.A0k(r9)
            X.80U r6 = r0.A1B
            if (r2 == 0) goto L_0x0cd1
            X.WaO r5 = r2.A00
        L_0x0cc7:
            X.8TO r2 = new X.8TO
            r2.<init>(r5)
            r6.E3H(r2)
            goto L_0x0f1f
        L_0x0cd1:
            r5 = 0
            goto L_0x0cc7
        L_0x0cd3:
            android.content.Context r6 = r0.A0f
            r5 = 2131956773(0x7f131425, float:1.9550111E38)
            goto L_0x0d94
        L_0x0cda:
            java.lang.Integer r2 = X.AnonymousClass05K.A07
            r0.A1O(r2, r1)
            goto L_0x0f1f
        L_0x0ce1:
            X.88Z r7 = r0.A1A
            X.88c r5 = X.C3512188a.A0l
            boolean r5 = r7.Cb8(r5)
            if (r5 != 0) goto L_0x0cf6
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r0.A1m
            X.7w8 r5 = X.AJ2.A01(r6, r2)
            if (r5 == 0) goto L_0x0cf6
            r6.A0S(r5)
        L_0x0cf6:
            X.88c r5 = X.C3512188a.A0G
            boolean r5 = r7.Cb8(r5)
            if (r5 != 0) goto L_0x0d3b
            X.6if r2 = r0.A1a
            java.lang.Object r7 = r2.get()
            X.AJ2 r7 = (X.AJ2) r7
            X.LPD r6 = r7.A07
            boolean r2 = r6.A05()
            if (r2 == 0) goto L_0x0d18
            X.L5A r2 = r6.A01
            r2.getClass()
            X.AJ2.A05(r7, r2)
            goto L_0x0f1f
        L_0x0d18:
            com.instagram.common.session.UserSession r5 = r7.A04
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r2 = r2.A01(r5)
            boolean r2 = r2.A1R()
            if (r2 == 0) goto L_0x0d31
            boolean r2 = r6.A06()
            if (r2 == 0) goto L_0x0d31
            r6.A01()
            goto L_0x0f1f
        L_0x0d31:
            android.content.Context r5 = r7.A01
            r2 = 2131969842(0x7f134732, float:1.9576618E38)
            X.C59689JTv.A07(r5, r2)
            goto L_0x0f1f
        L_0x0d3b:
            boolean r5 = r0.CZu(r1)
            if (r5 == 0) goto L_0x0d87
            com.instagram.common.session.UserSession r2 = r0.A0r
            boolean r2 = X.C367088qA.A05(r2, r1)
            if (r2 == 0) goto L_0x0d4e
            A0T(r0)
            goto L_0x0f1f
        L_0x0d4e:
            r0.A1D()
            goto L_0x0f1f
        L_0x0d53:
            com.instagram.common.session.UserSession r6 = r0.A0r
            boolean r6 = X.C367088qA.A02(r6)
            if (r6 == 0) goto L_0x0f1f
            X.88Z r7 = r0.A1A
            X.88c r6 = X.C3512188a.A0U
            boolean r6 = r7.Cb8(r6)
            if (r6 == 0) goto L_0x0d81
            X.6if r2 = r0.A1L
            java.lang.Object r7 = r2.get()
            X.JY9 r7 = (X.JY9) r7
            X.Lky r6 = r7.A0I
        L_0x0d6f:
            if (r6 == 0) goto L_0x0d78
            X.Lbq r2 = r7.A0A
            if (r2 == 0) goto L_0x0d78
            r2.A02(r6, r5)
        L_0x0d78:
            X.2cs r7 = r7.A16
            r5 = 0
        L_0x0d7c:
            r7.A06(r5)
            goto L_0x0f1f
        L_0x0d81:
            android.content.Context r6 = r0.A0f
            r5 = 2131973833(0x7f1356c9, float:1.9584713E38)
            goto L_0x0d94
        L_0x0d87:
            X.88c r5 = X.C3512188a.A0Y
            boolean r5 = r7.Cb8(r5)
            if (r5 != 0) goto L_0x0f1f
            android.content.Context r6 = r0.A0f
            r5 = 2131967798(0x7f133f36, float:1.9572473E38)
        L_0x0d94:
            X.C59689JTv.A01(r6, r2, r5, r1)
            goto L_0x0f1f
        L_0x0d99:
            boolean r2 = r0.CXD()
            if (r2 == 0) goto L_0x0da8
            X.80U r6 = r0.A1B
            X.8UB r10 = new X.8UB
            r10.<init>()
            goto L_0x0ef3
        L_0x0da8:
            android.content.Context r2 = r0.A0f
            X.C39582A0y.A00(r2, r6)
            goto L_0x0f1f
        L_0x0daf:
            android.content.Context r5 = r0.A0f
            r2 = 2131975943(0x7f135f07, float:1.9588993E38)
            java.lang.String r2 = r5.getString(r2)
            r4.A0D = r2
            r2 = 1075838976(0x40200000, float:2.5)
            r4.A00 = r2
            r0.A0m(r1)
            goto L_0x0f1f
        L_0x0dc3:
            r5 = 1076887552(0x40300000, float:2.75)
        L_0x0dc5:
            r4.A00 = r5
            goto L_0x0f72
        L_0x0dc9:
            java.util.List r5 = r3.A0O
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0e31
            java.util.List r5 = r3.A0O
            java.lang.Object r12 = r5.get(r1)
            X.6o8 r12 = (X.C317966o8) r12
            java.lang.String r10 = r12.A0T
            if (r10 == 0) goto L_0x0e29
            int r5 = r12.A0B
            if (r5 == 0) goto L_0x0e21
            java.lang.String r11 = r12.A0W
            if (r11 != 0) goto L_0x0de9
            java.lang.String r11 = ""
        L_0x0de9:
            android.content.Context r6 = r0.A0f
            r5 = 2131976261(0x7f136045, float:1.9589638E38)
            java.lang.String r18 = r6.getString(r5)
            X.0qQ.A07(r18)
            int r9 = r12.A0B
            java.lang.String r7 = r12.A0g
            long r5 = r12.A0F
            java.lang.Long r17 = java.lang.Long.valueOf(r5)
            com.instagram.common.typedurl.SimpleImageUrl r5 = new com.instagram.common.typedurl.SimpleImageUrl
            r5.<init>(r11)
            X.JzL r15 = new X.JzL
            r16 = r5
            r19 = r2
            r20 = r10
            r21 = r7
            r22 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Class<X.UpV> r2 = X.C16144UpV.class
            A0Z(r0, r2)
            X.80U r6 = r0.A1B
            X.8TT r10 = new X.8TT
            r10.<init>(r15)
            goto L_0x0ef3
        L_0x0e21:
            java.lang.String r1 = "Creation of `Thank supporters sticker` is allowed just for broadcasts with supporters"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0e29:
            java.lang.String r1 = "Missing media_insights_id in `Thank supporters sticker data`"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0e31:
            java.lang.String r1 = "Missing `Thank supporters sticker data`"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0e39:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r9 = r0.A1m
            java.lang.Class<X.7w8> r5 = X.C347017w8.class
            java.util.ArrayList r5 = r9.A0V(r5)
            java.util.Iterator r10 = r5.iterator()
        L_0x0e45:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x0e7b
            java.lang.Object r7 = r10.next()
            r6 = r7
            X.7w8 r6 = (X.C347017w8) r6
            java.lang.Class<X.8ur> r5 = X.C369498ur.class
            boolean r5 = r6.A0E(r5)
            if (r5 == 0) goto L_0x0e45
        L_0x0e5a:
            X.7w8 r7 = (X.C347017w8) r7
            if (r7 == 0) goto L_0x0e73
            java.lang.Class<X.8ur> r2 = X.C369498ur.class
            java.util.ArrayList r2 = r7.A06(r2)
            java.lang.Object r2 = r2.get(r1)
            X.6Ly r2 = (X.C306386Ly) r2
            android.text.Spannable r2 = r2.A0F
            java.lang.String r2 = r2.toString()
            r9.A0S(r7)
        L_0x0e73:
            X.80U r6 = r0.A1B
            X.8UA r10 = new X.8UA
            r10.<init>(r2)
            goto L_0x0ef3
        L_0x0e7b:
            r7 = 0
            goto L_0x0e5a
        L_0x0e7d:
            X.88Z r7 = r0.A1A
            X.88c r6 = X.C3512188a.A0Y
            boolean r6 = r7.Cb8(r6)
            if (r6 == 0) goto L_0x0f74
            X.88c r6 = X.C3512188a.A0X
            boolean r6 = r7.Cb8(r6)
            if (r6 == 0) goto L_0x0f74
            X.88c r6 = X.C3512188a.A0N
            boolean r6 = r7.Cb8(r6)
            if (r6 == 0) goto L_0x0f74
            X.88c r6 = X.C3512188a.A0b
            boolean r6 = A0t(r6, r0, r5)
            if (r6 != 0) goto L_0x0f1f
            X.82p r6 = r0.A13
            X.82o r6 = r6.A02
            X.8nd r7 = r6.A01()
            X.8nd r6 = X.C365758nd.A07
            if (r7 != r6) goto L_0x0eb7
            android.content.Context r6 = r0.A0f
            X.0qQ.A0B(r6, r1)
            r5 = 2131967840(0x7f133f60, float:1.9572558E38)
        L_0x0eb3:
            X.C59689JTv.A01(r6, r2, r5, r1)
            goto L_0x0f1f
        L_0x0eb7:
            com.instagram.common.session.UserSession r9 = r0.A0r
            com.instagram.api.schemas.SoundPlatformProduct r7 = com.instagram.api.schemas.SoundPlatformProduct.IG_MUSIC_OVERLAY_POST_CAPTURE
            boolean r6 = X.C56327Hwe.A01(r7, r9)
            if (r6 == 0) goto L_0x0edc
            X.Hpl r2 = r0.A09
            if (r2 != 0) goto L_0x0ecc
            X.Hpl r2 = new X.Hpl
            r2.<init>()
            r0.A09 = r2
        L_0x0ecc:
            java.lang.String r7 = X.C56327Hwe.A00(r7, r9)
            r0.A0H = r7
            X.Hpl r6 = r0.A09
            if (r6 == 0) goto L_0x0f1f
            android.content.Context r2 = r0.A0f
            r6.A00(r2, r7, r5)
            goto L_0x0f1f
        L_0x0edc:
            java.lang.Class<X.7w6> r6 = X.C346997w6.class
            android.graphics.drawable.Drawable r5 = A03(r0, r6)
            X.7w6 r5 = (X.C346997w6) r5
            if (r5 == 0) goto L_0x0ee8
            com.instagram.reels.musicpick.model.MusicPickStickerModel r2 = r5.A01
        L_0x0ee8:
            r0.A0k(r6)
            X.80U r6 = r0.A1B
            r5 = 0
            X.8Ul r10 = new X.8Ul
            r10.<init>(r5, r2)
        L_0x0ef3:
            r6.E3H(r10)
            goto L_0x0f1f
        L_0x0ef7:
            java.lang.Integer r6 = r3.A0E
            r6.getClass()
            int r6 = r6.intValue()
            if (r9 < r6) goto L_0x0f70
            java.lang.Integer r5 = r3.A0E
            r5.getClass()
            android.content.Context r10 = r0.A0f
            android.content.res.Resources r9 = r10.getResources()
            r7 = 2131820974(0x7f1101ae, float:1.9274678E38)
            int r6 = r5.intValue()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r5 = r9.getQuantityString(r7, r6, r5)
            X.C59689JTv.A00(r10, r5, r2, r1)
        L_0x0f1f:
            boolean r2 = r0.A1S()
            if (r2 == 0) goto L_0x0f2e
            boolean r2 = X.AnonymousClass9SF.A04(r8)
            if (r2 == 0) goto L_0x0f2e
            r2 = -2
            r4.A05 = r2
        L_0x0f2e:
            if (r14 == 0) goto L_0x0f63
            r8.getClass()
            X.6b1 r2 = new X.6b1
            r2.<init>(r4)
            r4 = r35
            r0.A0y(r8, r3, r2, r4)
            X.8Mi r6 = r0.A1y
            boolean r0 = r3.A0X
            if (r0 == 0) goto L_0x0f63
            long r4 = java.lang.System.currentTimeMillis()
            X.AZg r2 = new X.AZg
            r2.<init>()
            X.6nK r0 = X.C317476nK.STICKER
            r2.A02 = r0
            java.util.List r0 = r3.A0O
            java.lang.Object r0 = r0.get(r1)
            X.6o8 r0 = (X.C317966o8) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0H
            r2.A01 = r0
            r2.A03 = r3
            r2.A00 = r4
            r6.A04(r2)
        L_0x0f63:
            return
        L_0x0f64:
            X.88Z r7 = r0.A1A
            X.88c r6 = X.C3512188a.A0a
            boolean r6 = r7.Cb8(r6)
            if (r6 == 0) goto L_0x0f74
            r4.A05 = r5
        L_0x0f70:
            r4.A0H = r5
        L_0x0f72:
            r14 = 1
            goto L_0x0f1f
        L_0x0f74:
            android.content.Context r6 = r0.A0f
            X.0qQ.A0B(r6, r1)
            r5 = 2131967837(0x7f133f5d, float:1.9572552E38)
            goto L_0x0eb3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.A1I(android.graphics.drawable.Drawable, X.6nz, X.ADo, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v40, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v45, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r8v58, types: [X.Aef, X.50v, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v93, types: [X.Aef, X.50v, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1001:0x18bc, code lost:
        ((X.C358368an) r1.A1e.get()).A0U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1002:0x18c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05d1, code lost:
        if (((X.C356568Uj) r0).A01.intValue() == 0) goto L_0x05d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x060b, code lost:
        r1.A1N(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x060e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x06bf, code lost:
        if ((r0 instanceof X.AnonymousClass8UP) != false) goto L_0x06c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x1143, code lost:
        if ((r0 instanceof X.AnonymousClass8VF) != false) goto L_0x1145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:860:0x15fc, code lost:
        if (r5 == X.AnonymousClass80V.ASSET_PICKER) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:874:0x168c, code lost:
        if (r8.A03 == null) goto L_0x168e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:915:0x1737, code lost:
        if (r7 == null) goto L_0x1739;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ae, code lost:
        if ((r0 instanceof X.C356678Uu) != false) goto L_0x02b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dmx(java.lang.Object r36, java.lang.Object r37, java.lang.Object r38) {
        /*
            r35 = this;
            r0 = r38
            r5 = r37
            r6 = r36
            X.80V r6 = (X.AnonymousClass80V) r6
            X.80V r5 = (X.AnonymousClass80V) r5
            r2 = 0
            X.0qQ.A0B(r6, r2)
            r4 = 1
            X.0qQ.A0B(r5, r4)
            r16 = 2
            r1 = r16
            X.0qQ.A0B(r0, r1)
            r1 = r35
            X.B21 r3 = r1.A0B(r6)
            if (r3 == 0) goto L_0x0fcd
            r3.DDW()
        L_0x0024:
            X.B21 r7 = r1.A0B(r5)
            r3 = 0
            if (r7 == 0) goto L_0x00a9
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            r1.A1N(r3)
            boolean r3 = r7 instanceof X.B20
            if (r3 == 0) goto L_0x17e3
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r1.A1m
            r4 = r7
            X.B20 r4 = (X.B20) r4
            java.lang.Class r3 = r4.Bza()
            java.util.ArrayList r3 = r5.A0V(r3)
            X.0qQ.A0B(r3, r2)
            java.lang.Object r8 = X.00k.A0J(r3)
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            if (r8 == 0) goto L_0x17e3
            X.8un r3 = r1.A0B
            if (r3 == 0) goto L_0x17e3
            android.view.View r3 = r4.Azx()
            if (r3 == 0) goto L_0x17e3
            com.instagram.common.session.UserSession r6 = r1.A0r
            X.0Tu r5 = X.0Tu.A05
            r3 = 36323302926462007(0x810bda00002c37, double:3.0343412606710815E-306)
            boolean r3 = X.182.A06(r5, r6, r3)
            if (r3 == 0) goto L_0x17e3
            X.8Md r4 = r1.A1C
            X.8un r5 = r1.A0B
            X.0qQ.A0A(r5)
            r3 = 45
            X.MJ9 r1 = new X.MJ9
            r1.<init>(r3, r7, r0)
            X.0qQ.A0B(r5, r2)
            X.8Me r3 = r4.A02
            r3.A02 = r8
            r3.A03 = r5
            r3.A04 = r1
            float r1 = r5.A06
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            r3.A01 = r0
            float r2 = r5.A05
            float r1 = java.lang.Math.abs(r2)
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x009d
            float r0 = -r2
        L_0x0092:
            r3.A00 = r0
            X.2cs r0 = r4.A00
            r0.A0A(r3)
            r0.A03()
        L_0x009c:
            return
        L_0x009d:
            r0 = 0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r0 = 360(0x168, float:5.04E-43)
            if (r1 >= 0) goto L_0x00a6
            r0 = -360(0xfffffffffffffe98, float:NaN)
        L_0x00a6:
            float r0 = (float) r0
            float r0 = r0 - r2
            goto L_0x0092
        L_0x00a9:
            int r5 = r5.ordinal()
            switch(r5) {
                case 2: goto L_0x05dd;
                case 3: goto L_0x060f;
                case 11: goto L_0x1882;
                case 12: goto L_0x0654;
                case 13: goto L_0x0654;
                case 14: goto L_0x00b1;
                case 15: goto L_0x0692;
                case 20: goto L_0x1915;
                case 21: goto L_0x00b5;
                case 22: goto L_0x026c;
                case 23: goto L_0x0270;
                case 34: goto L_0x06ad;
                case 35: goto L_0x084b;
                case 37: goto L_0x0274;
                case 38: goto L_0x0274;
                case 58: goto L_0x18bc;
                case 67: goto L_0x0ad4;
                case 69: goto L_0x1bd3;
                case 70: goto L_0x06ad;
                case 77: goto L_0x1be3;
                case 79: goto L_0x0e2e;
                case 81: goto L_0x0274;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            return
        L_0x00b1:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x060b
        L_0x00b5:
            X.6if r1 = r1.A1Z
            java.lang.Object r5 = r1.get()
            X.ALg r5 = (X.C39964ALg) r5
            r5.A09 = r3
            r8 = 3
            X.JwE[] r1 = new X.C61076JwE[r8]
            r5.A0B = r1
            r5.A06 = r3
            X.8TR r0 = (X.AnonymousClass8TR) r0
            com.instagram.reels.smb.model.ProfileStickerModel r1 = r0.A00
            X.6nz r0 = r1.A01
            r5.A07 = r0
            java.lang.Integer r0 = r1.A05
            r5.A0A = r0
            android.view.View r1 = r5.A02
            r0 = 0
            if (r1 == 0) goto L_0x00d8
            r0 = 1
        L_0x00d8:
            java.lang.String r1 = "Required value was null."
            if (r0 != 0) goto L_0x0185
            android.view.ViewStub r0 = r5.A0H
            android.view.View r6 = r0.inflate()
            r5.A01 = r6
            if (r6 == 0) goto L_0x1879
            r0 = 2131441224(0x7f0b3648, float:1.8504454E38)
            android.view.View r0 = r6.requireViewById(r0)
            r5.A02 = r0
            android.view.View r6 = r5.A01
            if (r6 == 0) goto L_0x1873
            r0 = 2131443605(0x7f0b3f95, float:1.8509283E38)
            android.view.View r6 = r6.requireViewById(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r6 = (com.instagram.ui.widget.searchedittext.SearchEditText) r6
            r5.A08 = r6
            if (r6 == 0) goto L_0x186d
            r6.A0F = r5
            X.ALe r0 = new X.ALe
            r0.<init>(r2)
            r6.addTextChangedListener(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r5.A08
            if (r0 == 0) goto L_0x1867
            r0.addTextChangedListener(r5)
            com.instagram.ui.widget.searchedittext.SearchEditText r6 = r5.A08
            if (r6 == 0) goto L_0x1861
            android.text.InputFilter$AllCaps r0 = new android.text.InputFilter$AllCaps
            r0.<init>()
            android.text.InputFilter[] r0 = new android.text.InputFilter[]{r0}
            r6.setFilters(r0)
            android.view.View r6 = r5.A01
            if (r6 == 0) goto L_0x185b
            r0 = 2131435629(0x7f0b206d, float:1.8493106E38)
            android.view.View r0 = r6.requireViewById(r0)
            r5.A00 = r0
            android.view.View r6 = r5.A01
            if (r6 == 0) goto L_0x1855
            r0 = 2131436107(0x7f0b224b, float:1.8494075E38)
            android.view.View r0 = r6.requireViewById(r0)
            r5.A03 = r0
            android.view.View r6 = r5.A01
            if (r6 == 0) goto L_0x184f
            r0 = 2131436109(0x7f0b224d, float:1.849408E38)
            android.view.View r7 = r6.requireViewById(r0)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r5.A05 = r7
            if (r7 == 0) goto L_0x1849
            android.content.Context r6 = r5.A0D
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r6, r2, r2)
            r7.setLayoutManager(r0)
            android.view.View r6 = r5.A01
            if (r6 == 0) goto L_0x1843
            r0 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.view.View r0 = r6.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.A04 = r0
            android.view.View r6 = r5.A01
            if (r6 == 0) goto L_0x183d
            r0 = 2131441797(0x7f0b3885, float:1.8505616E38)
            android.view.View r7 = r6.requireViewById(r0)
            X.0qQ.A07(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.Integer r6 = r5.A0A
            int r0 = r6.intValue()
            if (r0 == r2) goto L_0x0267
            if (r0 != r4) goto L_0x182d
            r0 = 2131973502(0x7f13557e, float:1.9584042E38)
        L_0x0182:
            r7.setText(r0)
        L_0x0185:
            android.content.Context r6 = r5.A0D
            android.content.res.Resources r7 = r6.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            int r7 = r7.getDimensionPixelSize(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r9 = r5.A08
            if (r9 == 0) goto L_0x1827
            java.lang.Integer r10 = r5.A0A
            X.0qQ.A0B(r10, r8)
            int r0 = r10.intValue()
            if (r0 == r2) goto L_0x0255
            if (r0 != r4) goto L_0x1817
            r0 = r16
            int[] r11 = new int[r0]
            r0 = 2131100774(0x7f060466, float:1.7813939E38)
            int r0 = r6.getColor(r0)
            r11[r2] = r0
            r0 = 2131100773(0x7f060465, float:1.7813937E38)
        L_0x01b3:
            int r0 = r6.getColor(r0)
            r11[r4] = r0
            android.content.res.Resources r10 = r6.getResources()
            X.0qQ.A0A(r10)
            r0 = 2131966138(0x7f1338ba, float:1.9569106E38)
            java.lang.String r4 = r10.getString(r0)
            X.0qQ.A07(r4)
            r0 = -1
            android.text.SpannedString r0 = X.AJB.A02(r10, r4, r11, r0, r7)
            r9.setHint(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r5.A08
            if (r0 == 0) goto L_0x1811
            r0.setOnFocusChangeListener(r5)
            com.instagram.ui.widget.searchedittext.SearchEditText r10 = r5.A08
            if (r10 == 0) goto L_0x180b
            java.lang.Integer r9 = r5.A0A
            X.0qQ.A0B(r9, r8)
            java.lang.String r0 = ""
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r0)
            android.content.res.Resources r4 = r6.getResources()
            X.0qQ.A07(r4)
            int[] r0 = X.ABE.A01(r6, r9)
            X.AJB.A0A(r4, r8, r0, r7)
            r10.setText(r8)
            com.instagram.ui.widget.searchedittext.SearchEditText r8 = r5.A08
            if (r8 == 0) goto L_0x1805
            X.0qq r4 = X.AnonymousClass0qo.A00(r6)
            X.0qm r0 = X.0qm.A0W
            android.graphics.Typeface r0 = r4.A02(r0)
            r8.setTypeface(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r5.A08
            if (r4 == 0) goto L_0x17ff
            float r0 = (float) r7
            X.C306486Mi.A00(r4, r0, r2)
            android.widget.ImageView r4 = r5.A04
            if (r4 == 0) goto L_0x17f9
            java.lang.Integer r0 = r5.A0A
            android.graphics.drawable.Drawable r0 = X.ABE.A00(r6, r0)
            r4.setImageDrawable(r0)
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x17f3
            android.view.View$OnTouchListener r4 = r5.A0E
            r0.setOnTouchListener(r4)
            android.view.View r0 = r5.A0F
            r0.setOnTouchListener(r4)
            android.view.View r8 = r5.A0G
            android.view.View r7 = r5.A01
            android.view.View r6 = r5.A03
            android.view.View r4 = r5.A02
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r5.A08
            android.view.View[] r0 = new android.view.View[]{r8, r7, r6, r4, r0}
            X.C294975nL.A04(r3, r0, r2)
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r5.A08
            if (r0 == 0) goto L_0x17ed
            r0.requestFocus()
            androidx.recyclerview.widget.RecyclerView r2 = r5.A05
            if (r2 == 0) goto L_0x17e7
            X.8b5 r0 = r5.A0L
            r2.setAdapter(r0)
            X.8ME r1 = r5.A0N
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            goto L_0x060b
        L_0x0255:
            r0 = r16
            int[] r11 = new int[r0]
            r0 = 2131100770(0x7f060462, float:1.781393E38)
            int r0 = r6.getColor(r0)
            r11[r2] = r0
            r0 = 2131099829(0x7f0600b5, float:1.7812022E38)
            goto L_0x01b3
        L_0x0267:
            r0 = 2131974786(0x7f135a82, float:1.9586646E38)
            goto L_0x0182
        L_0x026c:
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            goto L_0x060b
        L_0x0270:
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            goto L_0x060b
        L_0x0274:
            X.80V r5 = X.AnonymousClass80V.CLIPS_EDITOR
            if (r6 != r5) goto L_0x0281
            android.view.View r7 = r1.A04
            if (r7 == 0) goto L_0x0281
            android.view.ViewGroup r5 = r1.A0i
            r5.removeView(r7)
        L_0x0281:
            X.6if r5 = r1.A1L
            java.lang.Object r7 = r5.get()
            X.JY9 r7 = (X.JY9) r7
            X.80V r8 = X.AnonymousClass80V.BEFORE_AND_AFTER_STICKER_COMPOSE
            r5 = 0
            if (r6 != r8) goto L_0x028f
            r5 = 1
        L_0x028f:
            r7.A0c = r5
            boolean r5 = r0 instanceof X.AnonymousClass8UT
            r16 = r5
            r7.A0h = r5
            boolean r14 = r0 instanceof X.AnonymousClass8UQ
            r7.A0j = r14
            boolean r13 = r0 instanceof X.C356638Uq
            r7.A0d = r13
            boolean r12 = r0 instanceof X.C356648Ur
            r7.A0i = r12
            boolean r11 = r0 instanceof X.C356658Us
            r7.A0f = r11
            boolean r10 = r0 instanceof X.C356668Ut
            if (r10 != 0) goto L_0x02b0
            boolean r8 = r0 instanceof X.C356678Uu
            r5 = 0
            if (r8 == 0) goto L_0x02b1
        L_0x02b0:
            r5 = 1
        L_0x02b1:
            r7.A0g = r5
            boolean r9 = r0 instanceof X.C356568Uj
            r7.A0e = r9
            monitor-enter(r7)
            boolean r5 = r7.A0l     // Catch:{ all -> 0x187f }
            if (r5 != 0) goto L_0x02cc
            boolean r5 = X.JY9.A0D(r7)     // Catch:{ all -> 0x187f }
            if (r5 != 0) goto L_0x02cc
            com.facebook.quicklog.QuickPerformanceLogger r8 = r7.A15     // Catch:{ all -> 0x187f }
            r5 = 31798883(0x1e53663, float:8.4199356E-38)
            r8.markerStart(r5)     // Catch:{ all -> 0x187f }
            r7.A0l = r4     // Catch:{ all -> 0x187f }
        L_0x02cc:
            monitor-exit(r7)
            X.80V r8 = X.AnonymousClass80V.CAPTURE
            r5 = 0
            if (r6 != r8) goto L_0x02d3
            r5 = 1
        L_0x02d3:
            r7.A0n = r5
            X.80V r8 = X.AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE
            r5 = 0
            if (r6 != r8) goto L_0x02db
            r5 = 1
        L_0x02db:
            r7.A0o = r5
            X.JY9.A07(r7)
            boolean r5 = X.JY9.A0D(r7)
            if (r5 != 0) goto L_0x02fe
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r15 = r5.toString()
            X.0qQ.A07(r15)
            r7.A0V = r15
            X.LBr r8 = r7.A06
            if (r8 == 0) goto L_0x02fe
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r8.A00(r6, r5, r15)
        L_0x02fe:
            X.8Yz r5 = r7.A19
            X.80m r5 = r5.A08
            r18 = r5
            java.lang.Object r5 = r5.A00
            boolean r5 = r5 instanceof X.AnonymousClass80O
            if (r5 == 0) goto L_0x0374
            com.instagram.common.session.UserSession r5 = r7.A18
            r17 = r5
            X.1Av r5 = X.1Au.A00(r17)
            X.0xa r5 = r5.A01
            java.lang.String r8 = "clips_comment_poll_sticker_tray_toast_seen_count"
            int r6 = r5.getInt(r8, r2)
            r5 = 3
            if (r6 >= r5) goto L_0x0374
            boolean r5 = X.JUO.A00(r17)
            if (r5 == 0) goto L_0x0374
            android.view.View r5 = r7.A13
            android.content.Context r15 = r5.getContext()
            X.6ap r6 = new X.6ap
            r6.<init>()
            r6.A04()
            r5 = 2131969546(0x7f13460a, float:1.9576018E38)
            java.lang.String r5 = r15.getString(r5)
            r6.A0D = r5
            r5 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r5 = r15.getString(r5)
            X.0qQ.A07(r5)
            r6.A0G = r5
            r6.A0L = r4
            X.Adx r5 = new X.Adx
            r5.<init>()
            r6.A0A(r5)
            X.1xC r15 = X.1xC.A01
            X.Dc2 r6 = r6.A00()
            X.3GP r5 = new X.3GP
            r5.<init>(r6)
            r15.A00(r5)
            X.1Av r5 = X.1Au.A00(r17)
            X.0xa r6 = r5.A01
            int r5 = r6.getInt(r8, r2)
            X.0xY r6 = r6.AR4()
            int r5 = r5 + 1
            r6.E5Z(r8, r5)
            r6.apply()
        L_0x0374:
            android.view.View r5 = r7.A01
            if (r5 == 0) goto L_0x0385
            android.graphics.drawable.Drawable r8 = r5.getBackground()
            if (r8 == 0) goto L_0x0385
            int r6 = r7.A10
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_IN
            r8.setColorFilter(r6, r5)
        L_0x0385:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r5 = r7.A09
            if (r5 == 0) goto L_0x038c
            r5.setVisibility(r2)
        L_0x038c:
            com.instagram.common.session.UserSession r8 = r7.A18
            java.lang.String r5 = "ig_story_creation_sticker_tray"
            X.LRq.A00(r8, r5)
            boolean r5 = X.JY9.A0D(r7)
            if (r5 != 0) goto L_0x039c
            r7.A0O(r2)
        L_0x039c:
            boolean r5 = r0 instanceof X.AnonymousClass8TK
            if (r5 != 0) goto L_0x0537
            boolean r5 = r0 instanceof X.C356608Un
            if (r5 != 0) goto L_0x0537
            if (r14 == 0) goto L_0x0518
            r5 = r0
            X.8UQ r5 = (X.AnonymousClass8UQ) r5
            boolean r5 = r5.A00
            if (r5 == 0) goto L_0x050c
            X.JYC r9 = r7.A0O
            if (r9 == 0) goto L_0x03b9
            X.89i r6 = X.C3515589i.AUDIO_EDITOR_TRACK_DETAILS
            X.JVj r5 = X.C59725JVj.POST_CAPTURE
            r9.A01 = r6
            r9.A02 = r5
        L_0x03b9:
            X.Lbq r6 = r7.A0A
            if (r6 == 0) goto L_0x0509
            X.MXG r5 = r6.A00
        L_0x03bf:
            if (r5 != r9) goto L_0x0500
            if (r9 == 0) goto L_0x03c6
            r9.E0h()
        L_0x03c6:
            X.2cs r9 = r7.A16
            r5 = 0
        L_0x03ca:
            r9.A08(r5, r4)
            r7.DmC(r9)
        L_0x03d0:
            X.2cc r6 = X.C71342cb.A00(r8)
            X.0iw r5 = r7.A17
            r6.A0D(r5, r3, r2)
            java.lang.String r5 = "not_activity_or_fragment"
            r6.A0E(r5, r7)
            boolean r5 = X.JY9.A0D(r7)
            if (r5 != 0) goto L_0x0433
            X.82p r5 = r7.A1C
            X.82o r9 = r5.A02
            X.8nd r6 = r9.A01()
            X.8nd r5 = X.C365758nd.A07
            if (r6 != r5) goto L_0x04fc
            X.28t r11 = X.28t.A06
        L_0x03f2:
            boolean r5 = r0 instanceof X.C356558Ui
            if (r5 == 0) goto L_0x04f0
            java.lang.String r13 = "suggested_pinnables_peek"
        L_0x03f8:
            X.27r r6 = X.27p.A01(r8)
            X.82Y r0 = r9.A01
            X.50r r5 = r0.A0g
            X.50r r0 = X.C2801950r.FEED_POST
            if (r5 != r0) goto L_0x04ed
            X.4yP r10 = X.C279294yP.FEED
        L_0x0406:
            X.8C9 r0 = r7.A1D
            if (r0 == 0) goto L_0x04ea
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r0.A03
            boolean r0 = r0.A0G
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
        L_0x0412:
            X.29Z r9 = r6.A0F
            r14 = r3
            r15 = r3
            r9.A0R(r10, r11, r12, r13, r14, r15)
            r0 = r18
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x0433
            X.0Tu r0 = X.0Tu.A05
            r5 = 36319016549161777(0x8107f400011b31, double:3.03163053840656E-306)
            X.182.A06(r0, r8, r5)
            r5 = 36319716628766280(0x81089700001e48, double:3.032073271567442E-306)
            X.182.A06(r0, r8, r5)
        L_0x0433:
            X.8C9 r9 = r7.A1D
            if (r9 == 0) goto L_0x047a
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r9.A03
            boolean r3 = r0.A0G
            r0 = 0
            if (r3 != r4) goto L_0x043f
            r0 = 1
        L_0x043f:
            r10 = 8
            if (r0 == 0) goto L_0x047e
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r8)
            boolean r0 = r0.A2L()
            if (r0 == 0) goto L_0x047e
            X.0Tu r0 = X.0Tu.A05
            r5 = 36321619299346017(0x810a5200012661, double:3.033276528103507E-306)
            boolean r0 = X.182.A06(r0, r8, r5)
            if (r0 == 0) goto L_0x047e
            r7.A0b = r4
            X.JZL r3 = r7.A0L
            if (r3 == 0) goto L_0x046c
            android.view.View r0 = r3.A02
            r0.setVisibility(r10)
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r3.A04
            r0.setVisibility(r10)
        L_0x046c:
            android.widget.TextView r0 = r7.A05
            if (r0 == 0) goto L_0x0473
            r0.setVisibility(r2)
        L_0x0473:
            android.widget.TextView r0 = r7.A04
            if (r0 == 0) goto L_0x047a
            r0.setVisibility(r10)
        L_0x047a:
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            goto L_0x060b
        L_0x047e:
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r9.A03
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x047a
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r8)
            boolean r0 = r0.A2L()
            if (r0 == 0) goto L_0x047a
            X.0Tu r12 = X.0Tu.A05
            r3 = 36321619299346017(0x810a5200012661, double:3.033276528103507E-306)
            boolean r0 = X.182.A06(r12, r8, r3)
            if (r0 == 0) goto L_0x047a
            r7.A0b = r2
            X.JZL r3 = r7.A0L
            if (r3 == 0) goto L_0x04ad
            android.view.View r0 = r3.A02
            r0.setVisibility(r2)
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r3.A04
            r0.setVisibility(r2)
        L_0x04ad:
            android.widget.TextView r0 = r7.A05
            if (r0 == 0) goto L_0x04b4
            r0.setVisibility(r10)
        L_0x04b4:
            X.1Av r0 = X.1Au.A00(r8)
            X.0xa r11 = r0.A01
            r0 = 2586(0xa1a, float:3.624E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            int r0 = r11.getInt(r9, r2)
            long r5 = (long) r0
            r3 = 36603094276182894(0x820a520003136e, double:3.211282436863906E-306)
            long r3 = X.182.A01(r12, r8, r3)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0473
            android.widget.TextView r0 = r7.A04
            if (r0 == 0) goto L_0x04d9
            r0.setVisibility(r2)
        L_0x04d9:
            X.0xY r3 = r11.AR4()
            int r0 = r11.getInt(r9, r2)
            int r0 = r0 + 1
            r3.E5Z(r9, r0)
            r3.apply()
            goto L_0x047a
        L_0x04ea:
            r12 = r3
            goto L_0x0412
        L_0x04ed:
            r10 = r3
            goto L_0x0406
        L_0x04f0:
            boolean r0 = r0 instanceof X.AnonymousClass8U1
            if (r0 == 0) goto L_0x04f8
            java.lang.String r13 = "swipe"
            goto L_0x03f8
        L_0x04f8:
            java.lang.String r13 = "button"
            goto L_0x03f8
        L_0x04fc:
            X.28t r11 = X.28t.A05
            goto L_0x03f2
        L_0x0500:
            if (r9 == 0) goto L_0x03c6
            if (r6 == 0) goto L_0x03c6
            r6.A02(r9, r2)
            goto L_0x03c6
        L_0x0509:
            r5 = 0
            goto L_0x03bf
        L_0x050c:
            X.2cs r9 = r7.A16
            int r5 = r7.A0z
            float r6 = (float) r5
            r5 = 1036831952(0x3dccccd0, float:0.100000024)
            float r6 = r6 * r5
            double r5 = (double) r6
            goto L_0x03ca
        L_0x0518:
            boolean r5 = r0 instanceof X.C356488Ub
            if (r5 != 0) goto L_0x05d3
            if (r16 == 0) goto L_0x0527
            X.89i r6 = X.C3515589i.POST_CAPTURE_AUDIO_BUTTON
            X.JVj r5 = X.C59725JVj.POST_CAPTURE
        L_0x0522:
            r7.A0J(r6, r5, r2)
            goto L_0x03d0
        L_0x0527:
            if (r10 == 0) goto L_0x052e
            X.89i r6 = X.C3515589i.PRE_CAPTURE
            X.JVj r5 = X.C59725JVj.PRE_CAPTURE
            goto L_0x0522
        L_0x052e:
            boolean r5 = r0 instanceof X.C356678Uu
            if (r5 == 0) goto L_0x0542
            X.89i r6 = X.C3515589i.GALLERY_DESTINATION_BAR
            X.JVj r5 = X.C59725JVj.GALLERY
            goto L_0x0522
        L_0x0537:
            X.2cs r9 = r7.A16
            int r5 = r7.A0z
            float r6 = (float) r5
            r5 = 1036831952(0x3dccccd0, float:0.100000024)
            float r6 = r6 * r5
            double r5 = (double) r6
            goto L_0x056d
        L_0x0542:
            if (r13 != 0) goto L_0x05d8
            if (r11 == 0) goto L_0x0572
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            r7.A0U = r5
            X.JZL r6 = r7.A0L
            if (r6 == 0) goto L_0x0569
            r6.A00 = r2
            com.instagram.ui.widget.searchedittext.SearchEditText r5 = r6.A04
            boolean r5 = r5.hasFocus()
            if (r5 == 0) goto L_0x0563
            android.view.View r5 = r6.A01
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x0563
            r6.A05(r2)
        L_0x0563:
            r6.A06(r4, r4)
            r6.A03()
        L_0x0569:
            X.2cs r9 = r7.A16
            r5 = 0
        L_0x056d:
            r9.A06(r5)
            goto L_0x03d0
        L_0x0572:
            boolean r5 = r0 instanceof X.C356558Ui
            if (r5 == 0) goto L_0x058a
            r7.A0I()
            X.2cs r5 = r7.A16
            boolean r5 = r5.A0C()
            if (r5 == 0) goto L_0x0586
            X.JY9.A08(r7)
            goto L_0x03d0
        L_0x0586:
            r7.A0k = r4
            goto L_0x03d0
        L_0x058a:
            if (r12 == 0) goto L_0x05c6
            r5 = r0
            X.8Ur r5 = (X.C356648Ur) r5
            X.6nz r9 = r5.A00
            X.6oG r5 = r9.A00()
            int r6 = r5.ordinal()
            r5 = 70
            if (r6 == r5) goto L_0x05c1
            r5 = 20
            if (r6 == r5) goto L_0x05d8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = "Unhandled sticker type: "
            r6.append(r5)
            X.6oG r5 = r9.A00()
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r5 = 4310(0x10d6, float:6.04E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            X.0kD.A0E(r5, r6, r3)
            goto L_0x03d0
        L_0x05c1:
            r7.A0H()
            goto L_0x03d0
        L_0x05c6:
            if (r9 == 0) goto L_0x03d0
            r5 = r0
            X.8Uj r5 = (X.C356568Uj) r5
            java.lang.Integer r5 = r5.A01
            int r5 = r5.intValue()
            if (r5 != r2) goto L_0x03d0
        L_0x05d3:
            X.JY9.A06(r7)
            goto L_0x03d0
        L_0x05d8:
            r7.A0G()
            goto L_0x03d0
        L_0x05dd:
            X.6if r0 = r1.A1e
            java.lang.Object r0 = r0.get()
            X.8an r0 = (X.C358368an) r0
            r0.A0U()
            X.6if r2 = r1.A1O
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x05f7
            java.lang.Object r0 = r2.get()
            X.Lh1 r0 = (X.C64724Lh1) r0
            r0.A0A()
        L_0x05f7:
            java.lang.Integer r2 = r1.A0D
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x009c
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r1.A1m
            java.util.List r0 = r0.getInteractiveDrawables()
            int r0 = r0.size()
            if (r0 > 0) goto L_0x009c
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x060b:
            r1.A1N(r0)
            return
        L_0x060f:
            java.lang.Integer r2 = r1.A0D
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 != r0) goto L_0x0622
            X.28D r2 = r1.A0k
            X.28D r0 = X.28D.A22
            if (r2 != r0) goto L_0x0622
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r1.A1i
            if (r0 == 0) goto L_0x0622
            r1.A0g(r0)
        L_0x0622:
            X.8Mv r0 = r1.A16
            if (r0 == 0) goto L_0x009c
            X.8Mw r0 = r0.A00
            java.util.List r0 = r0.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x062e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r2.next()
            X.Jvl r0 = (X.C61047Jvl) r0
            java.lang.Object r1 = r0.A03
            X.8bq r1 = (X.C359018bq) r1
            if (r1 == 0) goto L_0x062e
            X.8bp r1 = (X.C359008bp) r1
            X.8vW r0 = r1.A02
            if (r0 == 0) goto L_0x064b
            r0.A03 = r3
            r0.invalidateSelf()
        L_0x064b:
            r1.invalidateSelf()
            r1.A02 = r3
            r1.invalidateSelf()
            goto L_0x062e
        L_0x0654:
            X.82p r2 = r1.A13
            X.82o r2 = r2.A02
            X.82Y r2 = r2.A01
            X.8Yz r3 = r2.A0X
            if (r3 == 0) goto L_0x009c
            X.8aL r2 = X.C358088aL.A0o
            X.8aL[] r2 = new X.C358088aL[]{r2}
            boolean r2 = r3.A0V(r2)
            if (r2 == 0) goto L_0x0679
            com.instagram.common.session.UserSession r5 = r1.A0r
            X.0Tu r4 = X.0Tu.A05
            r2 = 36316800346231438(0x8105f00004128e, double:3.030229002749481E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x009c
        L_0x0679:
            X.80V r2 = X.AnonymousClass80V.CLIPS_EDITOR
            if (r6 != r2) goto L_0x0686
            android.view.View r3 = r1.A04
            if (r3 == 0) goto L_0x0686
            android.view.ViewGroup r2 = r1.A0i
            r2.removeView(r3)
        L_0x0686:
            X.6if r1 = r1.A1e
            java.lang.Object r1 = r1.get()
            X.8an r1 = (X.C358368an) r1
            r1.A0g(r0)
            return
        L_0x0692:
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
            r1.A1N(r2)
            X.6if r1 = r1.A1e
            java.lang.Object r1 = r1.get()
            X.8an r1 = (X.C358368an) r1
            X.6if r1 = r1.A1Y
            if (r1 == 0) goto L_0x009c
            java.lang.Object r1 = r1.get()
            X.9Sf r1 = (X.C379049Sf) r1
            r1.DCS(r0)
            return
        L_0x06ad:
            r1.A0Q = r4
            X.6if r5 = r1.A1U
            java.lang.Object r10 = r5.get()
            X.AeM r10 = (X.C40575AeM) r10
            boolean r6 = r0 instanceof X.AnonymousClass8UO
            r13 = 0
            if (r6 != 0) goto L_0x06c1
            boolean r7 = r0 instanceof X.AnonymousClass8UP
            r5 = 0
            if (r7 == 0) goto L_0x06c2
        L_0x06c1:
            r5 = 1
        L_0x06c2:
            r10.A03 = r5
            X.8ME r7 = r10.A08
            android.graphics.drawable.Drawable r8 = r7.A11()
            if (r8 == 0) goto L_0x06ef
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r9 = r7.A1m
            X.8un r5 = r9.A0O(r8)
            r7.A0B = r5
            java.lang.Integer r5 = r9.A0S(r8)
            r7.A0C = r5
            X.ADh r5 = r7.A08
            if (r5 == 0) goto L_0x06ef
            java.util.Map r5 = r5.A02
            java.lang.Object r5 = r5.get(r8)
            X.9br r5 = (X.C381499br) r5
            if (r5 == 0) goto L_0x0848
            android.graphics.drawable.Drawable r5 = r5.A03
        L_0x06ea:
            r9.A0S(r5)
            r7.A03 = r3
        L_0x06ef:
            java.lang.Integer r5 = X.AnonymousClass05K.A02
            r7.A1N(r5)
            X.85o r5 = r7.A12
            r5.A07 = r4
            X.C3506485o.A00(r5, r2)
            r10.A01 = r8
            boolean r5 = r0 instanceof X.AnonymousClass8VH
            if (r5 != 0) goto L_0x07a9
            boolean r5 = r0 instanceof X.AnonymousClass8UN
            java.lang.String r9 = "Required value was null."
            r11 = 0
            if (r5 == 0) goto L_0x081c
            X.8UN r0 = (X.AnonymousClass8UN) r0
            boolean r8 = r0.A01
            X.MWx r5 = r0.A00
            com.instagram.music.common.model.MusicAssetModel r15 = com.instagram.music.common.model.MusicAssetModel.A02(r5)
            android.graphics.drawable.Drawable r5 = r10.A01
            if (r5 == 0) goto L_0x0818
            X.B3d r5 = X.C271404in.A09(r5)
            if (r5 == 0) goto L_0x0818
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r5.BUu()
            com.instagram.api.schemas.MusicProduct r6 = r5.A02
        L_0x0722:
            X.82t r5 = r10.A09
            java.lang.String r20 = r5.BUn()
            r14 = r6
            r16 = r3
            r17 = r3
            r18 = r3
            r19 = r3
            r21 = r3
            r22 = r3
            com.instagram.music.common.model.MusicOverlayStickerModel r3 = X.C59670JTa.A02(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r10.A02 = r3
            boolean r0 = r0.A02
            r10.A04 = r0
            r3 = 0
        L_0x0740:
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r0 = r15.A00
            long r5 = (long) r0
            long r5 = r12.toSeconds(r5)
            int r12 = (int) r5
            r0 = 15
            if (r12 <= r0) goto L_0x0750
            r12 = 15
        L_0x0750:
            r10.A00 = r12
            com.instagram.music.common.model.MusicOverlayStickerModel r6 = r10.A02
            int r0 = r15.A05()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            if (r6 == 0) goto L_0x0815
            X.A9I r0 = new X.A9I
            r0.<init>(r6)
            r0.A0L = r5
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.A00()
        L_0x0769:
            r10.A02 = r0
            X.8a4 r6 = r10.A0A
            X.85r r0 = r10.A06
            X.85t r0 = r0.A02()
            r6.A0b = r0
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x080f
            android.graphics.drawable.Drawable r0 = r10.A01
            if (r0 == 0) goto L_0x1c0c
            X.B3d r5 = X.C271404in.A09(r0)
            if (r5 == 0) goto L_0x1c06
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r10.A02
            if (r8 != 0) goto L_0x07e0
            if (r0 == 0) goto L_0x07a9
            java.lang.Integer r0 = r0.A0K
            if (r0 == 0) goto L_0x0791
            int r13 = r0.intValue()
        L_0x0791:
            X.6KJ r7 = r5.BV4()
            int r0 = r5.Aox()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r5 = r15
            r10 = r2
            r11 = r4
            r12 = r4
            r13 = r3
            X.C357918a4.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x07a9:
            X.6if r1 = r1.A1V
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r1.get()
            X.A59 r0 = (X.A59) r0
            X.3oV r0 = r0.A01
            android.view.View r0 = r0.getView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x009c
            java.lang.Object r2 = r1.get()
            X.A59 r2 = (X.A59) r2
            java.lang.Runnable r1 = r2.A00
            if (r1 == 0) goto L_0x07d4
            X.3oV r0 = r2.A01
            android.view.View r0 = r0.getView()
            r0.removeCallbacks(r1)
        L_0x07d4:
            X.3oV r0 = r2.A01
            android.view.View r1 = r0.getView()
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x07e0:
            if (r0 == 0) goto L_0x07a9
            java.lang.Integer r0 = r0.A0K
            if (r0 == 0) goto L_0x07a9
            int r18 = r0.intValue()
            X.6KJ r16 = r5.BV4()
            int r19 = r5.Aox()
            boolean r0 = r5 instanceof X.AnonymousClass9XK
            if (r0 == 0) goto L_0x07fc
            X.9XK r5 = (X.AnonymousClass9XK) r5
            if (r5 == 0) goto L_0x07fc
            java.lang.String r11 = r5.A02
        L_0x07fc:
            X.8d1 r14 = new X.8d1
            r17 = r11
            r20 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20)
            com.instagram.common.session.UserSession r0 = r7.A0r
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r0)
            r0.A00(r14)
            goto L_0x07a9
        L_0x080f:
            if (r8 != 0) goto L_0x07a9
            r6.A0L(r15, r4)
            goto L_0x07a9
        L_0x0815:
            r0 = 0
            goto L_0x0769
        L_0x0818:
            com.instagram.api.schemas.MusicProduct r6 = com.instagram.api.schemas.MusicProduct.POST_CAPTURE_STICKER
            goto L_0x0722
        L_0x081c:
            boolean r3 = r10.A03
            if (r3 == 0) goto L_0x1c18
            if (r8 == 0) goto L_0x1c12
            com.instagram.music.common.model.MusicOverlayStickerModel r3 = X.C271404in.A02(r8)
            com.instagram.music.common.model.MusicAssetModel r15 = com.instagram.music.common.model.MusicAssetModel.A03(r3)
            r10.A02 = r3
            r10.A04 = r2
            if (r6 == 0) goto L_0x0845
            r3 = r0
            X.8UO r3 = (X.AnonymousClass8UO) r3
            if (r3 == 0) goto L_0x0845
            boolean r8 = r3.A01
            boolean r3 = r3.A00
        L_0x0839:
            boolean r5 = r0 instanceof X.AnonymousClass8UP
            if (r5 == 0) goto L_0x0740
            X.8UP r0 = (X.AnonymousClass8UP) r0
            if (r0 == 0) goto L_0x0740
            boolean r3 = r0.A00
            goto L_0x0740
        L_0x0845:
            r8 = 0
            r3 = 0
            goto L_0x0839
        L_0x0848:
            r5 = 0
            goto L_0x06ea
        L_0x084b:
            X.80V r7 = X.AnonymousClass80V.SHOPPING_STICKER_EDIT_NAME
            if (r6 != r7) goto L_0x08ad
            X.6if r0 = r1.A1b
            java.lang.Object r4 = r0.get()
            X.AYL r4 = (X.AYL) r4
            com.instagram.ui.text.fittingtextview.FittingTextView r1 = r4.A0a
            android.view.View r0 = r4.A0L
            android.content.res.Resources r5 = r0.getResources()
            r0 = 2131960992(0x7f1324a0, float:1.9558668E38)
            java.lang.String r0 = r5.getString(r0)
            r1.setText(r0)
            android.widget.TextView r1 = r4.A0O
            r0 = 2131969851(0x7f13473b, float:1.9576637E38)
            java.lang.String r0 = r5.getString(r0)
            r1.setText(r0)
            android.view.View r0 = r4.A03
            r0.getClass()
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A08(r0, r2)
            X.8BQ r0 = r4.A0S
            r0.A03(r2, r2)
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r0 = r4.A0b
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A04(r3, r0, r2)
            boolean r0 = X.AYL.A03(r4)
            if (r0 == 0) goto L_0x08a1
            android.widget.TextView r0 = r4.A06
            r0.getClass()
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A04(r3, r0, r2)
        L_0x08a1:
            X.6if r0 = r4.A0Z
            java.lang.Object r0 = r0.get()
            X.8f8 r0 = (X.C360778f8) r0
            r0.A08()
            return
        L_0x08ad:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r10 = r1.A1m
            X.7w8 r5 = X.AJ2.A01(r10, r3)
            if (r5 == 0) goto L_0x08b8
            r10.A0S(r5)
        L_0x08b8:
            X.7w8 r5 = X.AJ2.A02(r10, r3)
            if (r5 == 0) goto L_0x08c1
            r10.A0S(r5)
        L_0x08c1:
            java.lang.Class<X.7w8> r11 = X.C347017w8.class
            java.util.ArrayList r5 = r10.A0V(r11)
            java.util.Iterator r9 = r5.iterator()
        L_0x08cb:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x08e5
            java.lang.Object r8 = r9.next()
            X.7w8 r8 = (X.C347017w8) r8
            java.lang.Class<X.8uw> r6 = X.C369548uw.class
            boolean r5 = r8.A0E(r6)
            if (r5 == 0) goto L_0x08cb
            r8.A06(r6)
            r10.A0S(r8)
        L_0x08e5:
            java.util.ArrayList r5 = r10.A0V(r11)
            java.util.Iterator r9 = r5.iterator()
        L_0x08ed:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0907
            java.lang.Object r8 = r9.next()
            X.7w8 r8 = (X.C347017w8) r8
            java.lang.Class<X.8ux> r6 = X.C369558ux.class
            boolean r5 = r8.A0E(r6)
            if (r5 == 0) goto L_0x08ed
            r8.A06(r6)
            r10.A0S(r8)
        L_0x0907:
            X.6if r8 = r1.A1b
            java.lang.Object r6 = r8.get()
            X.AYL r6 = (X.AYL) r6
            X.8nh r5 = A0A(r1)
            X.AE2 r1 = r6.A0V
            r1.A00 = r5
            java.lang.Object r5 = r8.get()
            X.AYL r5 = (X.AYL) r5
            X.8UF r0 = (X.AnonymousClass8UF) r0
            X.AIV r1 = r0.A01
            r1.getClass()
            r5.A08 = r1
            java.lang.String r1 = r0.A02
            r5.A0G = r1
            X.Khv r0 = r0.A00
            r5.A0E = r0
            android.widget.ImageView r0 = r5.A05
            if (r0 != 0) goto L_0x0952
            android.view.ViewStub r0 = r5.A0M
            android.view.View r1 = r0.inflate()
            r5.A02 = r1
            r0 = 2131438317(0x7f0b2aed, float:1.8498557E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.A05 = r0
            android.view.View r1 = r5.A02
            r0 = 2131438308(0x7f0b2ae4, float:1.849854E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A06 = r0
        L_0x0952:
            boolean r0 = X.AYL.A03(r5)
            android.widget.TextView r1 = r5.A06
            r1.getClass()
            if (r0 == 0) goto L_0x0a64
            r1.setVisibility(r2)
            android.widget.TextView r8 = r5.A06
            android.view.View r0 = r5.A0L
            android.content.Context r6 = r0.getContext()
            X.0qq r1 = X.AnonymousClass0qo.A00(r6)
            X.0qm r0 = X.0qm.A13
            android.graphics.Typeface r0 = r1.A02(r0)
            r8.setTypeface(r0)
            android.widget.TextView r0 = r5.A06
            android.text.TextPaint r0 = r0.getPaint()
            r0.setFakeBoldText(r4)
            android.widget.TextView r0 = r5.A06
            android.view.View$OnClickListener r1 = r5.A0J
            X.AnonymousClass0fU.A00(r1, r0)
            android.widget.ImageView r0 = r5.A05
            r0.getClass()
            X.AnonymousClass0fU.A00(r1, r0)
            android.widget.ImageView r4 = r5.A05
            X.80U r0 = r5.A0X
            boolean r1 = r0.CQ0(r7)
            r0 = 2131969845(0x7f134735, float:1.9576624E38)
            if (r1 == 0) goto L_0x099d
            r0 = 2131969846(0x7f134736, float:1.9576626E38)
        L_0x099d:
            java.lang.String r0 = r6.getString(r0)
            r4.setContentDescription(r0)
        L_0x09a4:
            X.AYL.A02(r5)
            X.8BQ r1 = r5.A0S
            java.util.List r0 = X.AnonymousClass8BR.A05
            r1.A01(r0)
            r5.A06()
            android.widget.ImageView r7 = r5.A04
            if (r7 == 0) goto L_0x0a8e
            X.AIV r0 = r5.A08
            if (r0 == 0) goto L_0x0a8e
            com.instagram.user.model.Product r0 = r0.A00
            if (r0 == 0) goto L_0x0a8e
            com.instagram.common.session.UserSession r6 = r5.A0Q
            X.0Tu r4 = X.0Tu.A05
            r0 = 36319866952687292(0x8108ba00011ebc, double:3.032168337020396E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x0a8e
            r7.setVisibility(r2)
            android.widget.TextView r0 = r5.A0O
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C315596kB.A08(r0, r2)
            java.util.ArrayList r0 = X.AD0.A02
            java.lang.Object r0 = r0.get(r2)
            X.0qQ.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r7.setImageResource(r0)
            r0 = -1
            r7.setColorFilter(r0)
            r0 = 2131231616(0x7f080380, float:1.8079318E38)
            r7.setBackgroundResource(r0)
            X.AIV r0 = r5.A08
            r0.getClass()
            com.instagram.user.model.Product r4 = r0.A00
            r4.getClass()
            X.AE2 r1 = r5.A0V
            android.view.View r0 = r5.A0L
            android.content.Context r0 = r0.getContext()
            X.0qQ.A0B(r0, r2)
            java.util.ArrayList r9 = r1.A01(r0)
            r0 = 3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            int r8 = r9.size()
        L_0x0a17:
            if (r2 >= r8) goto L_0x0a78
            java.lang.Object r0 = r9.get(r2)
            java.lang.String r10 = "null cannot be cast to non-null type com.instagram.reels.product.intf.ProductStickerDrawable"
            X.0qQ.A0C(r0, r10)
            X.8uu r0 = (X.C369528uu) r0
            java.lang.String r1 = r0.A03()
            java.lang.String r0 = "product_item_text_sticker_vibrant"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0a5a
            java.lang.Object r0 = r9.get(r2)
            X.0qQ.A0C(r0, r10)
            X.8uu r0 = (X.C369528uu) r0
            java.lang.String r1 = r0.A03()
            java.lang.String r0 = "product_item_list_cell_sticker_black_white"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0a5a
            java.lang.Object r0 = r9.get(r2)
            X.0qQ.A0C(r0, r10)
            X.8uu r0 = (X.C369528uu) r0
            java.lang.String r1 = r0.A03()
            java.lang.String r0 = "product_item_tile_sticker_black_white"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0a61
        L_0x0a5a:
            java.lang.Object r0 = r9.get(r2)
            r6.add(r0)
        L_0x0a61:
            int r2 = r2 + 1
            goto L_0x0a17
        L_0x0a64:
            r0 = 8
            r1.setVisibility(r0)
            android.widget.TextView r0 = r5.A06
            r0.setOnClickListener(r3)
            android.widget.ImageView r0 = r5.A05
            r0.getClass()
            r0.setOnClickListener(r3)
            goto L_0x09a4
        L_0x0a78:
            X.3NG r1 = new X.3NG
            r1.<init>(r7)
            android.view.View[] r0 = new android.view.View[]{r7}
            r1.A02(r0)
            X.9kS r0 = new X.9kS
            r0.<init>(r5, r4, r6)
            r1.A04 = r0
            r1.A00()
        L_0x0a8e:
            r2 = -1
            r5.A00 = r2
            X.AYL.A02(r5)
            X.88K r0 = r5.A0T
            r0.A06(r5)
            X.8ME r1 = r5.A0Y
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            r1.A1N(r0)
            X.6if r0 = r1.A1e
            java.lang.Object r0 = r0.get()
            X.8an r0 = (X.C358368an) r0
            r0.A0L = r3
            r0.A04 = r3
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r0 = r1.A1l
            r0.setColor(r2)
            X.8Mk r1 = r1.A0z
            r0 = 957(0x3bd, float:1.341E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.DnE(r0)
            X.KB3 r4 = r5.A0D
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            boolean r0 = r4.A01(r3)
            if (r0 == 0) goto L_0x009c
            android.view.View r2 = r5.A0L
            android.view.View r1 = r5.A01
            X.4DH r0 = r5.A0P
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            r4.A00(r0, r2, r1, r3)
            return
        L_0x0ad4:
            java.lang.Integer r5 = X.AnonymousClass05K.A07
            r1.A1N(r5)
            X.6if r1 = r1.A1M
            java.lang.Object r5 = r1.get()
            X.AZU r5 = (X.AZU) r5
            boolean r1 = r0 instanceof X.C356478Ua
            if (r1 == 0) goto L_0x0e22
            X.8Ua r0 = (X.C356478Ua) r0
            X.ACq r6 = r0.A00
            if (r6 != 0) goto L_0x0b45
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            com.instagram.api.schemas.StoryThenAndNowStickerDict r1 = new com.instagram.api.schemas.StoryThenAndNowStickerDict
            r1.<init>(r6, r3, r3, r3)
            X.Aef r8 = new X.Aef
            r8.<init>()
            r8.A00 = r1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            com.instagram.api.schemas.StoryThenAndNowStickerDict r1 = new com.instagram.api.schemas.StoryThenAndNowStickerDict
            r1.<init>(r6, r3, r3, r3)
            X.Aef r7 = new X.Aef
            r7.<init>()
            r7.A00 = r1
            X.0eE r6 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r1 = r5.A0J
            com.instagram.user.model.User r1 = r6.A01(r1)
            java.util.List r19 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r19)
            com.instagram.api.schemas.StoryPromptType r11 = com.instagram.api.schemas.StoryPromptType.BEFORE_AND_AFTER
            java.lang.String r14 = ""
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            com.instagram.reels.prompt.model.PromptStickerModel r9 = new com.instagram.reels.prompt.model.PromptStickerModel
            r12 = r3
            r15 = r14
            r16 = r3
            r17 = r3
            r18 = r3
            r20 = r2
            r21 = r2
            r22 = r2
            r23 = r2
            r24 = r2
            r10 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.50v[] r1 = new X.C2802350v[]{r8, r7, r9}
            java.util.ArrayList r1 = X.0sr.A1L(r1)
            X.ACq r6 = new X.ACq
            r6.<init>(r1)
        L_0x0b45:
            r5.A0C = r6
            boolean r0 = r0.A01
            r5.A0E = r0
            X.0eM r1 = r5.A0R
            java.lang.Object r0 = r1.getValue()
            X.3oV r0 = (X.C252063oV) r0
            boolean r0 = r0.CVM()
            if (r0 != 0) goto L_0x0c6a
            boolean r0 = r5.A0E
            if (r0 != 0) goto L_0x0b99
            android.content.Context r6 = r5.A0H
            r0 = 2131886088(0x7f120008, float:1.9406745E38)
            X.61R r8 = X.C303756Aq.A00(r6, r0)
            if (r8 == 0) goto L_0x0b96
            java.lang.Object r0 = r1.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r6 = r0.getView()
            r0 = 2131428641(0x7f0b0521, float:1.8478932E38)
            android.view.View r7 = r6.requireViewById(r0)
            com.instagram.common.ui.base.IgSimpleImageView r7 = (com.instagram.common.ui.base.IgSimpleImageView) r7
            r7.setImageDrawable(r8)
            android.content.Context r6 = r7.getContext()
            r0 = 2131953760(0x7f130860, float:1.9544E38)
            java.lang.String r0 = r6.getString(r0)
            r7.setContentDescription(r0)
            X.ANK r0 = new X.ANK
            r0.<init>(r8, r5)
            X.AnonymousClass0fU.A00(r0, r7)
            r5.A0A = r7
        L_0x0b96:
            X.AZU.A02(r5)
        L_0x0b99:
            java.lang.Object r0 = r1.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r6 = r0.getView()
            r0 = 2131428643(0x7f0b0523, float:1.8478936E38)
            android.view.View r8 = r6.requireViewById(r0)
            r5.A02 = r8
            if (r8 == 0) goto L_0x0be8
            r0 = 2131442593(0x7f0b3ba1, float:1.850723E38)
            android.view.View r7 = r8.requireViewById(r0)
            com.instagram.common.ui.base.IgEditText r7 = (com.instagram.common.ui.base.IgEditText) r7
            android.view.View$OnFocusChangeListener r0 = r5.A0I
            r7.setOnFocusChangeListener(r0)
            android.content.Context r6 = r7.getContext()
            X.0qQ.A0B(r6, r2)
            r0 = 2130970229(0x7f040675, float:1.7549162E38)
            int r0 = X.2Yu.A0H(r6, r0)
            int r0 = r6.getColor(r0)
            r7.setTextColor(r0)
            r0 = 2131953758(0x7f13085e, float:1.9543996E38)
            X.AZU.A01(r7, r0)
            r5.A06 = r7
            r0 = 2131428640(0x7f0b0520, float:1.847893E38)
            android.view.View r6 = r8.requireViewById(r0)
            X.AM6 r0 = new X.AM6
            r0.<init>(r5)
            X.AnonymousClass0fU.A00(r0, r6)
        L_0x0be8:
            java.lang.Object r0 = r1.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r6 = r0.getView()
            r0 = 2131427848(0x7f0b0208, float:1.8477324E38)
            android.view.View r8 = r6.requireViewById(r0)
            r5.A01 = r8
            if (r8 == 0) goto L_0x0c37
            r0 = 2131442593(0x7f0b3ba1, float:1.850723E38)
            android.view.View r7 = r8.requireViewById(r0)
            com.instagram.common.ui.base.IgEditText r7 = (com.instagram.common.ui.base.IgEditText) r7
            android.view.View$OnFocusChangeListener r0 = r5.A0I
            r7.setOnFocusChangeListener(r0)
            android.content.Context r6 = r7.getContext()
            X.0qQ.A0B(r6, r2)
            r0 = 2130970230(0x7f040676, float:1.7549164E38)
            int r0 = X.2Yu.A0H(r6, r0)
            int r0 = r6.getColor(r0)
            r7.setTextColor(r0)
            r0 = 2131953757(0x7f13085d, float:1.9543994E38)
            X.AZU.A01(r7, r0)
            r5.A05 = r7
            r0 = 2131428640(0x7f0b0520, float:1.847893E38)
            android.view.View r6 = r8.requireViewById(r0)
            X.AM7 r0 = new X.AM7
            r0.<init>(r5)
            X.AnonymousClass0fU.A00(r0, r6)
        L_0x0c37:
            java.lang.Object r0 = r1.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r6 = r0.getView()
            r0 = 2131441481(0x7f0b3749, float:1.8504975E38)
            android.view.View r0 = r6.requireViewById(r0)
            com.instagram.common.ui.base.IgSimpleImageView r0 = (com.instagram.common.ui.base.IgSimpleImageView) r0
            r5.A07 = r0
            java.lang.Object r0 = r1.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r6 = r0.getView()
            r0 = 2131441482(0x7f0b374a, float:1.8504977E38)
            android.view.View r0 = r6.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r5.A0B = r0
            android.view.View r6 = r5.A01
            if (r6 == 0) goto L_0x0c6a
            X.87F r0 = r5.A0M
            r0.A03(r6)
        L_0x0c6a:
            X.ACq r0 = r5.A0C
            if (r0 != 0) goto L_0x0c78
            java.lang.String r7 = "model"
        L_0x0c70:
            X.0qQ.A0F(r7)
        L_0x0c73:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0c78:
            java.util.List r6 = r0.A00
            r0 = 10
            int r0 = X.0Yv.A1E(r6, r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r0)
            java.util.Iterator r12 = r6.iterator()
            r8 = 0
        L_0x0c8a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0d43
            java.lang.Object r10 = r12.next()
            X.50v r10 = (X.C2802350v) r10
            boolean r0 = r10 instanceof X.C40591Aef
            if (r0 == 0) goto L_0x0d15
            X.Aef r10 = (X.C40591Aef) r10
            com.instagram.api.schemas.StoryThenAndNowStickerDict r0 = r10.A00
            java.lang.Boolean r0 = r0.A00
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x0ce6
            com.instagram.api.schemas.StoryThenAndNowStickerDict r0 = r10.A00
            java.lang.String r6 = r0.A02
            if (r6 == 0) goto L_0x0cbf
            com.instagram.common.ui.base.IgEditText r0 = r5.A06
            if (r0 == 0) goto L_0x0cbf
            r0.setText(r6)
        L_0x0cbf:
            com.instagram.common.gallery.Medium r0 = r10.A01
            if (r0 == 0) goto L_0x0cd0
            r0.A02()
        L_0x0cc6:
            com.instagram.common.gallery.Medium r0 = r10.A01
            r5.A04 = r0
        L_0x0cca:
            X.0gF r0 = X.C60340gF.A00
            r11.add(r0)
            goto L_0x0c8a
        L_0x0cd0:
            com.instagram.common.ui.base.IgSimpleImageView r7 = r5.A09
            if (r7 == 0) goto L_0x0cc6
            r7.setImageURI(r3)
            android.view.ViewTreeObserver r6 = r7.getViewTreeObserver()
            if (r6 == 0) goto L_0x0cc6
            X.APC r0 = new X.APC
            r0.<init>(r7, r5)
            r6.addOnGlobalLayoutListener(r0)
            goto L_0x0cc6
        L_0x0ce6:
            com.instagram.api.schemas.StoryThenAndNowStickerDict r0 = r10.A00
            java.lang.String r6 = r0.A01
            if (r6 == 0) goto L_0x0cf3
            com.instagram.common.ui.base.IgEditText r0 = r5.A05
            if (r0 == 0) goto L_0x0cf3
            r0.setText(r6)
        L_0x0cf3:
            com.instagram.common.gallery.Medium r0 = r10.A01
            if (r0 == 0) goto L_0x0cff
            r0.A02()
        L_0x0cfa:
            com.instagram.common.gallery.Medium r0 = r10.A01
            r5.A03 = r0
            goto L_0x0cca
        L_0x0cff:
            com.instagram.common.ui.base.IgSimpleImageView r7 = r5.A08
            if (r7 == 0) goto L_0x0cfa
            r7.setImageURI(r3)
            android.view.ViewTreeObserver r6 = r7.getViewTreeObserver()
            if (r6 == 0) goto L_0x0cfa
            X.APC r0 = new X.APC
            r0.<init>(r7, r5)
            r6.addOnGlobalLayoutListener(r0)
            goto L_0x0cfa
        L_0x0d15:
            boolean r0 = r10 instanceof com.instagram.reels.prompt.model.PromptStickerModel
            if (r0 == 0) goto L_0x0cca
            com.instagram.common.ui.base.IgSimpleImageView r9 = r5.A07
            if (r9 != 0) goto L_0x0d21
            java.lang.String r7 = "addYoursView"
            goto L_0x0c70
        L_0x0d21:
            android.content.Context r8 = r5.A0H
            X.0qQ.A06(r8)
            java.lang.String r7 = r5.A0N
            com.instagram.common.session.UserSession r6 = r5.A0J
            com.instagram.reels.prompt.model.PromptStickerModel r10 = (com.instagram.reels.prompt.model.PromptStickerModel) r10
            r18 = 112(0x70, float:1.57E-43)
            X.8Nk r0 = new X.8Nk
            r13 = r0
            r14 = r8
            r15 = r6
            r16 = r10
            r17 = r7
            r19 = r2
            r20 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r9.setImageDrawable(r0)
            r8 = 1
            goto L_0x0cca
        L_0x0d43:
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0d61
            com.instagram.common.ui.base.IgEditText r0 = r5.A05
            if (r0 == 0) goto L_0x0d54
            r0.setEnabled(r2)
            r0.clearFocus()
            r0.setOnFocusChangeListener(r3)
        L_0x0d54:
            com.instagram.common.ui.base.IgEditText r0 = r5.A06
            if (r0 == 0) goto L_0x0d61
            r0.setEnabled(r2)
            r0.clearFocus()
            r0.setOnFocusChangeListener(r3)
        L_0x0d61:
            java.lang.String r7 = "infoTextView"
            java.lang.String r4 = "addYoursView"
            if (r8 != 0) goto L_0x0e13
            com.instagram.common.gallery.Medium r0 = r5.A04
            if (r0 == 0) goto L_0x0e13
            com.instagram.common.gallery.Medium r0 = r5.A03
            if (r0 == 0) goto L_0x0e13
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.A07
            if (r0 == 0) goto L_0x0e1d
            r4 = 8
            r0.setVisibility(r4)
        L_0x0d78:
            com.instagram.common.ui.base.IgTextView r0 = r5.A0B
            if (r0 == 0) goto L_0x0c70
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgTextView r6 = r5.A0B
            if (r6 == 0) goto L_0x0c70
            X.0eE r4 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r5.A0J
            com.instagram.user.model.User r0 = r4.A01(r0)
            java.lang.Integer r4 = r0.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r4 != r0) goto L_0x0e08
            boolean r0 = r5.A0E
            r4 = 2131970896(0x7f134b50, float:1.9578756E38)
            if (r0 != 0) goto L_0x0d9d
            r4 = 2131970880(0x7f134b40, float:1.9578724E38)
        L_0x0d9d:
            r6.setText(r4)
            X.0eM r0 = r5.A0Q
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            com.instagram.ui.text.fittingtextview.FittingTextView r0 = (com.instagram.ui.text.fittingtextview.FittingTextView) r0
            X.AZU.A03(r5, r0)
            android.view.View r0 = r5.A01
            r4 = 0
            if (r0 == 0) goto L_0x0db6
            r0.setTranslationY(r4)
        L_0x0db6:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.A0A
            if (r0 == 0) goto L_0x0dbd
            r0.setTranslationY(r4)
        L_0x0dbd:
            X.0eM r0 = r5.A0P
            java.lang.Object r4 = r0.getValue()
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r0 = r1.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r0 = r0.getView()
            android.view.View[] r0 = new android.view.View[]{r4, r0}
            X.C294975nL.A04(r3, r0, r2)
            com.instagram.common.gallery.Medium r0 = r5.A04
            if (r0 == 0) goto L_0x0e00
            com.instagram.common.gallery.Medium r0 = r5.A03
            if (r0 == 0) goto L_0x0e00
        L_0x0dde:
            boolean r0 = r5.A0E
            if (r0 != 0) goto L_0x0ded
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.A0A
            if (r0 == 0) goto L_0x0ded
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A04(r3, r0, r2)
        L_0x0ded:
            java.lang.Object r0 = r1.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r1 = r0.getView()
            X.AOt r0 = new X.AOt
            r0.<init>(r5)
            r1.setOnTouchListener(r0)
            return
        L_0x0e00:
            com.instagram.common.ui.base.IgEditText r0 = r5.A05
            if (r0 == 0) goto L_0x0dde
            r0.requestFocus()
            goto L_0x0dde
        L_0x0e08:
            boolean r0 = r5.A0E
            r4 = 2131970881(0x7f134b41, float:1.9578726E38)
            if (r0 == 0) goto L_0x0d9d
            r4 = 2131970897(0x7f134b51, float:1.9578758E38)
            goto L_0x0d9d
        L_0x0e13:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.A07
            if (r0 == 0) goto L_0x0e1d
            r4 = 0
            r0.setVisibility(r2)
            goto L_0x0d78
        L_0x0e1d:
            X.0qQ.A0F(r4)
            goto L_0x0c73
        L_0x0e22:
            boolean r0 = r0 instanceof X.C356498Uc
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = "Unsupported event to exit the before and after editor."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0e2e:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r1.A1m
            java.lang.Class<X.7w5> r0 = X.C346987w5.class
            java.util.ArrayList r0 = r5.A0V(r0)
            X.0qQ.A0B(r0, r2)
            java.lang.Object r4 = X.00k.A0J(r0)
            X.7w5 r4 = (X.C346987w5) r4
            if (r4 == 0) goto L_0x009c
            r5.A0S = r2
            X.85r r0 = r1.A18
            X.85t r0 = r0.A02()
            r0.pause()
            X.Aej r10 = r4.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.model.SecretStickerClientModel"
            X.0qQ.A0C(r10, r0)
            X.8un r7 = r5.A0O(r4)
            X.6if r0 = r1.A1Y
            java.lang.Object r6 = r0.get()
            X.A7v r6 = (X.C39755A7v) r6
            r7.getClass()
            com.instagram.common.session.UserSession r8 = r1.A0r
            X.0Tu r0 = X.0Tu.A05
            r4 = 36323302926462007(0x810bda00002c37, double:3.0343412606710815E-306)
            boolean r0 = X.182.A06(r0, r8, r4)
            if (r0 == 0) goto L_0x0e7d
            X.6if r0 = r1.A1X
            java.lang.Object r0 = r0.get()
            X.AOd r0 = (X.C40021AOd) r0
            android.view.View r3 = r0.Azx()
        L_0x0e7d:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r1.A10
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            int r8 = r0.A0J
            X.0qQ.A0B(r10, r2)
            X.0eM r5 = r6.A03
            java.lang.Object r11 = r5.getValue()
            X.0qQ.A07(r11)
            android.view.View r11 = (android.view.View) r11
            java.lang.Object r4 = r5.getValue()
            X.0qQ.A07(r4)
            android.view.View r4 = (android.view.View) r4
            X.0sa r0 = r6.A07
            java.lang.Object r1 = r0.invoke()
            java.util.Collection r1 = (java.util.Collection) r1
            android.view.View[] r0 = new android.view.View[r2]
            java.lang.Object[] r1 = r1.toArray(r0)
            android.view.View[] r1 = (android.view.View[]) r1
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            android.view.View[] r1 = (android.view.View[]) r1
            java.lang.String r0 = "SecretStickerPreviewController"
            X.Vc0 r9 = new X.Vc0
            r9.<init>(r4, r0, r1)
            r0 = 8
            r9.A02 = r0
            r0 = 10
            r9.A00 = r0
            java.lang.Object r0 = r5.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            android.content.Context r4 = r0.getContext()
            java.lang.Object r0 = r5.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2130970245(0x7f040685, float:1.7549195E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r4.getColor(r0)
            r9.A03 = r0
            X.U1A r0 = new X.U1A
            r0.<init>(r9)
            r11.setBackground(r0)
            X.0eM r4 = r6.A06
            java.lang.Object r11 = X.AnonymousClass7TE.A14(r4)
            com.instagram.common.ui.base.IgSimpleImageView r11 = (com.instagram.common.ui.base.IgSimpleImageView) r11
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r4)
            com.instagram.common.ui.base.IgSimpleImageView r0 = (com.instagram.common.ui.base.IgSimpleImageView) r0
            android.content.Context r9 = r0.getContext()
            X.0qQ.A07(r9)
            X.0iw r0 = r6.A00
            java.lang.String r1 = r0.getModuleName()
            X.7w5 r0 = new X.7w5
            r0.<init>(r9, r10, r1)
            r11.setImageDrawable(r0)
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r4)
            com.instagram.common.ui.base.IgSimpleImageView r1 = (com.instagram.common.ui.base.IgSimpleImageView) r1
            float r0 = r7.A05
            r1.setRotation(r0)
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r4)
            com.instagram.common.ui.base.IgSimpleImageView r1 = (com.instagram.common.ui.base.IgSimpleImageView) r1
            float r0 = r7.A06
            r1.setScaleX(r0)
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r4)
            com.instagram.common.ui.base.IgSimpleImageView r1 = (com.instagram.common.ui.base.IgSimpleImageView) r1
            float r0 = r7.A06
            r1.setScaleY(r0)
            if (r3 == 0) goto L_0x0f9e
            android.graphics.RectF r0 = X.0nA.A01
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.getGlobalVisibleRect(r0)
            int r1 = r0.top
            int r0 = r0.bottom
            int r1 = r1 + r0
            float r3 = (float) r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r1
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r6.A02
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r1
            float r3 = r3 - r0
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r4)
            com.instagram.common.ui.base.IgSimpleImageView r1 = (com.instagram.common.ui.base.IgSimpleImageView) r1
            float r0 = (float) r8
            float r3 = r3 - r0
            float r0 = r7.A02
            float r3 = r3 + r0
            r1.setTranslationY(r3)
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r4)
            com.instagram.common.ui.base.IgSimpleImageView r1 = (com.instagram.common.ui.base.IgSimpleImageView) r1
            float r0 = r7.A01
            r1.setTranslationX(r0)
        L_0x0f6e:
            X.0eM r0 = r6.A05
            java.lang.Object r0 = r0.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r0 = r0.getView()
            r0.setVisibility(r2)
            java.lang.Object r0 = r5.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            X.0eM r0 = r6.A04
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r4)
            com.instagram.common.ui.base.IgSimpleImageView r0 = (com.instagram.common.ui.base.IgSimpleImageView) r0
            r0.setVisibility(r2)
            return
        L_0x0f9e:
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r4)
            com.instagram.common.ui.base.IgSimpleImageView r3 = (com.instagram.common.ui.base.IgSimpleImageView) r3
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r4)
            com.instagram.common.ui.base.IgSimpleImageView r0 = (com.instagram.common.ui.base.IgSimpleImageView) r0
            int r0 = r0.getLeft()
            float r1 = (float) r0
            float r0 = r7.A01
            float r1 = r1 + r0
            r3.setX(r1)
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r4)
            com.instagram.common.ui.base.IgSimpleImageView r3 = (com.instagram.common.ui.base.IgSimpleImageView) r3
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r4)
            com.instagram.common.ui.base.IgSimpleImageView r0 = (com.instagram.common.ui.base.IgSimpleImageView) r0
            int r0 = r0.getTop()
            float r1 = (float) r0
            float r0 = r7.A02
            float r1 = r1 + r0
            r3.setY(r1)
            goto L_0x0f6e
        L_0x0fcd:
            int r3 = r6.ordinal()
            switch(r3) {
                case 12: goto L_0x15fa;
                case 13: goto L_0x1600;
                case 15: goto L_0x1438;
                case 20: goto L_0x1367;
                case 21: goto L_0x1374;
                case 22: goto L_0x135b;
                case 23: goto L_0x135b;
                case 34: goto L_0x1145;
                case 35: goto L_0x1453;
                case 37: goto L_0x128f;
                case 38: goto L_0x128f;
                case 58: goto L_0x1141;
                case 67: goto L_0x1679;
                case 69: goto L_0x17b2;
                case 70: goto L_0x1145;
                case 71: goto L_0x17dc;
                case 72: goto L_0x0fd6;
                case 77: goto L_0x17c7;
                case 79: goto L_0x160e;
                case 81: goto L_0x128f;
                case 87: goto L_0x17dc;
                default: goto L_0x0fd4;
            }
        L_0x0fd4:
            goto L_0x0024
        L_0x0fd6:
            X.88c r3 = X.C3512188a.A0W
            boolean r3 = A0t(r3, r1, r2)
            r18 = 7
            r7 = r3 ^ 1
            X.88c r3 = X.C3512188a.A0A
            boolean r3 = A0t(r3, r1, r2)
            r3 = r3 ^ 1
            if (r7 != 0) goto L_0x0fec
            if (r3 == 0) goto L_0x0024
        L_0x0fec:
            boolean r3 = r0 instanceof X.C356308Tj
            if (r3 == 0) goto L_0x1033
            r3 = r0
            X.8Tj r3 = (X.C356308Tj) r3
            X.8Cl r13 = r3.A01
            java.lang.String r7 = r3.A02
        L_0x0ff7:
            X.8An r3 = r1.A1g
            if (r3 == 0) goto L_0x0024
            com.instagram.common.session.UserSession r14 = r3.A09
            com.instagram.reels.prompt.model.PromptStickerModel r9 = r3.A06
            r12 = 15
            java.util.List r8 = r13.A0p
            r3 = 0
            if (r8 == 0) goto L_0x0024
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r17 = r8.iterator()
        L_0x100f:
            boolean r8 = r17.hasNext()
            if (r8 == 0) goto L_0x103f
            java.lang.Object r11 = r17.next()
            r8 = r11
            X.LMH r8 = (X.LMH) r8
            X.0qQ.A0B(r8, r2)
            com.instagram.api.schemas.CameraTool r8 = r8.A00
            int r10 = r8.ordinal()
            if (r10 == r12) goto L_0x102f
            r8 = 115(0x73, float:1.61E-43)
            if (r10 == r8) goto L_0x102f
            r8 = 4
            if (r10 == r8) goto L_0x102f
            goto L_0x100f
        L_0x102f:
            r15.add(r11)
            goto L_0x100f
        L_0x1033:
            boolean r3 = r0 instanceof X.C356318Tk
            if (r3 == 0) goto L_0x0024
            r3 = r0
            X.8Tk r3 = (X.C356318Tk) r3
            X.8Cl r13 = r3.A00
            java.lang.String r7 = r3.A01
            goto L_0x0ff7
        L_0x103f:
            java.lang.Object r10 = X.00k.A0J(r15)
            X.LMH r10 = (X.LMH) r10
            if (r10 == 0) goto L_0x0024
            X.0eE r8 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r22 = r8.A01(r14)
            if (r9 == 0) goto L_0x113e
            com.instagram.api.schemas.StoryPromptType r8 = r9.A03()
        L_0x1053:
            com.instagram.api.schemas.StoryPromptType r14 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP
            if (r8 != r14) goto L_0x10be
            com.instagram.reels.prompt.model.PromptStickerModel r3 = r9.A04()
            java.util.List r8 = java.util.Collections.singletonList(r22)
            X.0qQ.A07(r8)
            com.instagram.api.schemas.StoryPromptTappableDataIntf r7 = r9.A00
            java.util.List r7 = r7.B3f()
            java.util.ArrayList r7 = X.00k.A0S(r7, r8)
            java.util.List r7 = X.00k.A0W(r7)
            r3.A0C(r7)
            com.instagram.api.schemas.GenAIToolInfoDict r8 = X.C63191Ksy.A00(r10)
            com.instagram.api.schemas.StoryPromptTappableDataIntf r7 = r3.A00
            X.Vib r7 = r7.AKQ()
            r7.A02 = r8
            com.instagram.api.schemas.StoryPromptTappableData r7 = r7.A00()
            r3.A00 = r7
        L_0x1085:
            boolean r7 = r3.A0L()
            if (r7 == 0) goto L_0x1091
            com.instagram.api.schemas.StoryPromptType r7 = r3.A03()
            if (r7 != r14) goto L_0x0024
        L_0x1091:
            com.instagram.api.schemas.StoryPromptType r7 = r3.A03()
            int r8 = r7.ordinal()
            r7 = r18
            if (r8 == r7) goto L_0x10bb
            r7 = 6
            if (r8 == r7) goto L_0x10b8
            r7 = 9
            if (r8 != r7) goto L_0x0024
            java.lang.String r9 = "magic_mod_restyle_sticker_bundle_id"
        L_0x10a6:
            java.lang.Class<X.9q0> r7 = X.C389669q0.class
            X.7w8 r8 = A07(r1, r7)
            if (r8 == 0) goto L_0x10b3
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7 = r1.A1m
            r7.A0j(r8)
        L_0x10b3:
            r1.Dn8(r3, r9)
            goto L_0x0024
        L_0x10b8:
            java.lang.String r9 = "magic_mod_add_yours_backdrop_sticker_bundle_id"
            goto L_0x10a6
        L_0x10bb:
            java.lang.String r9 = "magic_mod_backdrop_sticker_bundle_id"
            goto L_0x10a6
        L_0x10be:
            com.instagram.api.schemas.CameraTool r8 = r10.A00
            int r11 = r8.ordinal()
            r8 = 115(0x73, float:1.61E-43)
            if (r11 == r12) goto L_0x1130
            if (r11 != r8) goto L_0x0024
            com.instagram.api.schemas.StoryPromptType r21 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_RESTYLE
        L_0x10cc:
            if (r11 == r12) goto L_0x112d
            if (r11 == r8) goto L_0x112a
            r11 = r3
        L_0x10d1:
            if (r7 != 0) goto L_0x10d7
            X.LN5 r7 = r10.A01
            java.lang.String r7 = r7.A02
        L_0x10d7:
            java.lang.Integer r8 = r13.A0R
            if (r8 == 0) goto L_0x1128
            int r8 = r8.intValue()
        L_0x10df:
            java.lang.String r27 = X.0nH.A0E(r8)
            if (r9 == 0) goto L_0x10eb
            com.instagram.api.schemas.StoryPromptTappableDataIntf r3 = r9.A00
            java.lang.String r3 = r3.getText()
        L_0x10eb:
            boolean r3 = X.0qQ.A0K(r3, r7)
            if (r3 == 0) goto L_0x1125
            java.lang.String r8 = r9.A03
        L_0x10f3:
            java.util.List r29 = java.util.Collections.singletonList(r22)
            X.0qQ.A07(r29)
            com.instagram.api.schemas.GenAIToolInfoDict r20 = X.C63191Ksy.A00(r10)
            if (r9 == 0) goto L_0x1108
            com.instagram.api.schemas.StoryPromptTappableDataIntf r3 = r9.A00
            java.lang.String r28 = r3.Bzk()
            if (r28 != 0) goto L_0x110a
        L_0x1108:
            r28 = r11
        L_0x110a:
            java.lang.String r25 = ""
            java.lang.Integer r23 = X.AnonymousClass05K.A00
            com.instagram.reels.prompt.model.PromptStickerModel r3 = new com.instagram.reels.prompt.model.PromptStickerModel
            r24 = r8
            r26 = r7
            r30 = r2
            r31 = r2
            r32 = r2
            r33 = r2
            r34 = r2
            r19 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x1085
        L_0x1125:
            java.lang.String r8 = ""
            goto L_0x10f3
        L_0x1128:
            r8 = -1
            goto L_0x10df
        L_0x112a:
            java.lang.String r11 = "restyle_sticker_default"
            goto L_0x10d1
        L_0x112d:
            java.lang.String r11 = "backdrop_sticker_default"
            goto L_0x10d1
        L_0x1130:
            if (r7 == 0) goto L_0x113b
            int r15 = r7.length()
            if (r15 == 0) goto L_0x113b
            r21 = r14
            goto L_0x10cc
        L_0x113b:
            com.instagram.api.schemas.StoryPromptType r21 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_BACKDROP
            goto L_0x10cc
        L_0x113e:
            r8 = r3
            goto L_0x1053
        L_0x1141:
            boolean r3 = r0 instanceof X.AnonymousClass8VF
            if (r3 == 0) goto L_0x0024
        L_0x1145:
            r1.A0Q = r2
            X.6if r3 = r1.A1U
            java.lang.Object r8 = r3.get()
            X.AeM r8 = (X.C40575AeM) r8
            boolean r3 = r0 instanceof X.AnonymousClass8UQ
            if (r3 == 0) goto L_0x1238
            X.8a4 r3 = r8.A0A
            r3.A0F()
            X.8ME r7 = r8.A08
            android.graphics.drawable.Drawable r3 = r8.A01
            if (r3 == 0) goto L_0x11f5
            android.content.Context r13 = r7.A0f
            com.instagram.common.session.UserSession r12 = r7.A0r
            com.instagram.api.schemas.MusicProduct r10 = X.C271404in.A01(r3)
            com.instagram.api.schemas.MusicProduct r9 = com.instagram.api.schemas.MusicProduct.MUSIC_CAMERA_FORMAT
            r23 = 0
            if (r10 != r9) goto L_0x116e
            r23 = 1
        L_0x116e:
            boolean r9 = r3 instanceof X.B3d
            r10 = 0
            if (r9 == 0) goto L_0x117c
            r9 = r3
            X.B3d r9 = (X.B3d) r9
            if (r9 == 0) goto L_0x117c
            X.6KJ r10 = r9.BV4()
        L_0x117c:
            X.6KJ r9 = X.AnonymousClass6KJ.MUSIC_ONLY
            r24 = 0
            if (r10 == r9) goto L_0x1184
            r24 = 1
        L_0x1184:
            r10 = 0
            boolean r9 = r3 instanceof X.AnonymousClass5MI
            r20 = 0
            if (r9 == 0) goto L_0x1198
            r11 = r3
            X.5MI r11 = (X.AnonymousClass5MI) r11
            if (r11 == 0) goto L_0x1198
            int r11 = r11.Byn()
            java.lang.Integer r20 = java.lang.Integer.valueOf(r11)
        L_0x1198:
            r21 = 0
            if (r9 == 0) goto L_0x11a9
            r11 = r3
            X.5MI r11 = (X.AnonymousClass5MI) r11
            if (r11 == 0) goto L_0x11a9
            int r11 = r11.B1e()
            java.lang.Integer r21 = java.lang.Integer.valueOf(r11)
        L_0x11a9:
            java.lang.String r22 = "StickerOverlayController"
            r25 = r4
            r17 = r13
            r18 = r12
            r19 = r10
            X.6b1 r19 = X.C39900AIi.A04(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r11 = r3
            X.C271404in.A02(r3)
            boolean r12 = r3 instanceof X.C347017w8
            if (r12 == 0) goto L_0x1223
            r12 = r3
            X.7w8 r12 = (X.C347017w8) r12
            java.lang.Class<X.B3d> r9 = X.B3d.class
            java.util.ArrayList r9 = r12.A06(r9)
        L_0x11c8:
            java.util.ArrayList r23 = X.C271404in.A0A(r9)
            r17 = r11
            r18 = r7
            r20 = r10
            r21 = r10
            r22 = r10
            int r12 = A01(r17, r18, r19, r20, r21, r22, r23)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r11 = r7.A1m
            X.8un r9 = r7.A0B
            r9.getClass()
            r11.A0r(r3, r9)
            r7.A0B = r10
            X.8Bz r11 = r7.A1F
            if (r11 == 0) goto L_0x11f5
            java.lang.Integer r9 = r7.A0C
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r11.A05(r9, r3)
            r7.A0C = r10
        L_0x11f5:
            X.85r r3 = r7.A18
            X.85t r3 = r3.A02()
            r3.pause()
            X.85o r3 = r7.A12
            r3.A07 = r2
            X.C3506485o.A00(r3, r2)
            boolean r3 = A0u(r7)
            if (r3 == 0) goto L_0x1218
            X.80U r3 = r7.A1B
            boolean r3 = r3.CZU()
            if (r3 == 0) goto L_0x1218
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r7.A1N(r3)
        L_0x1218:
            r8.A03 = r2
            r8.A04 = r4
            r3 = 0
            r8.A01 = r3
            r8.A02 = r3
            goto L_0x0024
        L_0x1223:
            if (r9 == 0) goto L_0x1230
            X.5MI r11 = (X.AnonymousClass5MI) r11
            android.graphics.drawable.Drawable r11 = r11.AfT()
            java.lang.String r9 = "null cannot be cast to non-null type com.instagram.reels.music.view.MusicStickerDrawable"
            X.0qQ.A0C(r11, r9)
        L_0x1230:
            java.util.List r9 = java.util.Collections.singletonList(r11)
            X.0qQ.A07(r9)
            goto L_0x11c8
        L_0x1238:
            boolean r3 = r0 instanceof X.AnonymousClass8UR
            if (r3 == 0) goto L_0x1249
            r3 = r0
            X.8UR r3 = (X.AnonymousClass8UR) r3
            X.7zz r9 = r3.A00
            java.lang.String r7 = r3.A01
            boolean r3 = r3.A02
            X.C40575AeM.A01(r8, r9, r7, r3)
            goto L_0x1218
        L_0x1249:
            boolean r3 = r0 instanceof X.C356708Ux
            if (r3 == 0) goto L_0x1257
            r3 = r0
            X.8Ux r3 = (X.C356708Ux) r3
            X.7zz r7 = r3.A00
            r3 = 0
            X.C40575AeM.A01(r8, r7, r3, r2)
            goto L_0x1218
        L_0x1257:
            boolean r3 = r0 instanceof X.AnonymousClass8US
            if (r3 == 0) goto L_0x127f
            X.8a4 r3 = r8.A0A
            r3.A0F()
            X.8ME r9 = r8.A08
            X.85r r7 = r9.A18
            X.C3506685r.A01(r7)
            X.2xu r3 = r7.A04
            r3.A00()
            X.85t r3 = r7.A02()
            r3.E2p()
            X.85o r3 = r9.A12
            r3.A07 = r2
            X.C3506485o.A00(r3, r2)
            r3 = 0
            r9.A1J(r3, r3, r2, r2)
            goto L_0x1218
        L_0x127f:
            boolean r3 = r0 instanceof X.AnonymousClass8VC
            if (r3 != 0) goto L_0x1218
            boolean r3 = r0 instanceof X.AnonymousClass8VD
            if (r3 != 0) goto L_0x1218
            java.lang.String r1 = "Unsupported event to exit the music editor!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x128f:
            X.80V r3 = X.AnonymousClass80V.ASSET_PICKER_IN_STACKED_TIMELINE
            if (r6 != r3) goto L_0x129a
            X.80V r3 = X.AnonymousClass80V.CLIPS_EDITOR
            if (r5 != r3) goto L_0x129a
            A0e(r1, r2)
        L_0x129a:
            X.6if r3 = r1.A1L
            java.lang.Object r11 = r3.get()
            X.JY9 r11 = (X.JY9) r11
            boolean r3 = r0 instanceof X.AnonymousClass8U6
            r8 = 1
            if (r3 != 0) goto L_0x135e
            boolean r3 = r0 instanceof X.AnonymousClass8U3
            if (r3 != 0) goto L_0x135e
            X.JZL r3 = r11.A0L
            if (r3 == 0) goto L_0x12b2
            r3.A01()
        L_0x12b2:
            java.lang.String r10 = r11.A0V
            boolean r3 = X.JY9.A0D(r11)
            if (r3 != 0) goto L_0x12ff
            if (r10 == 0) goto L_0x12ff
            X.JZL r3 = r11.A0L
            if (r3 == 0) goto L_0x12ff
            X.LBr r7 = r11.A06
            if (r7 == 0) goto L_0x12ff
            com.instagram.ui.widget.searchedittext.SearchEditText r3 = r3.A04
            android.text.Editable r3 = r3.getText()
            java.lang.String r12 = r3.toString()
            X.0qQ.A0B(r12, r4)
            X.0wc r9 = r7.A00
            java.lang.String r7 = "avatar_stickers_measurement_global_sticker_tray_exit"
            X.0kJ r3 = r9.A00
            X.0Aj r9 = r9.A00(r3, r7)
            boolean r3 = r9.isSampled()
            if (r3 == 0) goto L_0x12ff
            X.9ZG r7 = new X.9ZG
            r7.<init>()
            java.lang.String r3 = "search_query"
            r7.A06(r3, r12)
            java.lang.String r3 = "event_data"
            r9.AAK(r7, r3)
            java.lang.String r3 = "avatar_session_id"
            r9.AAJ(r3, r10)
            java.lang.String r7 = "navigation"
            java.lang.String r3 = "product"
            r9.AAJ(r3, r7)
            r9.Cgf()
        L_0x12ff:
            X.80V r10 = X.AnonymousClass80V.MEDIA_EDIT
            if (r5 == r10) goto L_0x1308
            X.80V r3 = X.AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY
            if (r5 == r3) goto L_0x1308
            r8 = 0
        L_0x1308:
            X.JY9.A0C(r11, r8)
            X.80V r3 = X.AnonymousClass80V.MUSIC_OVERLAY_STICKER_COMPOSE
            if (r5 == r3) goto L_0x1318
            X.Lbq r7 = r11.A0A
            if (r7 == 0) goto L_0x1318
            X.MXG r3 = r7.A02
            r7.A02(r3, r4)
        L_0x1318:
            com.instagram.common.session.UserSession r3 = r11.A18
            X.2cc r9 = X.C71342cb.A00(r3)
            r8 = 0
            r9.A0D(r11, r8, r2)
            X.0iw r7 = r11.A17
            java.lang.String r3 = "not_activity_or_fragment"
            r9.A0E(r3, r7)
            X.3Ar r3 = r11.A0P
            if (r3 == 0) goto L_0x1330
            r3.AHq()
        L_0x1330:
            r3 = 4
            X.JY9.A0A(r11, r8, r3)
            X.80U r7 = r1.A1B
            boolean r3 = r7.CQ0(r10)
            if (r3 != 0) goto L_0x135b
            X.80V r3 = X.AnonymousClass80V.CAPTURE
            boolean r3 = r7.CQ0(r3)
            if (r3 != 0) goto L_0x1354
            X.80V r3 = X.AnonymousClass80V.CONFIGURE_CAMERA
            boolean r3 = r7.CQ0(r3)
            if (r3 != 0) goto L_0x1354
            X.80V r3 = X.AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY
            boolean r3 = r7.CQ0(r3)
            if (r3 == 0) goto L_0x0024
        L_0x1354:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
        L_0x1356:
            r1.A1N(r3)
            goto L_0x0024
        L_0x135b:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x1356
        L_0x135e:
            X.JZL r3 = r11.A0L
            if (r3 == 0) goto L_0x12b2
            r3.A02()
            goto L_0x12b2
        L_0x1367:
            X.6if r3 = r1.A1c
            java.lang.Object r3 = r3.get()
            X.WBO r3 = (X.WBO) r3
            r3.A04(r2)
            goto L_0x0024
        L_0x1374:
            X.6if r3 = r1.A1Z
            java.lang.Object r9 = r3.get()
            X.ALg r9 = (X.C39964ALg) r9
            X.8ME r10 = r9.A0N
            com.instagram.reels.smb.model.ProfileStickerModel r7 = X.C39964ALg.A00(r9)
            com.instagram.user.model.User r3 = r7.A03
            if (r3 == 0) goto L_0x13d4
            android.content.Context r3 = r10.A0f
            X.9pq r11 = new X.9pq
            r11.<init>(r3, r7)
            X.6nz r13 = r7.A01
            if (r13 == 0) goto L_0x13d4
            boolean r3 = r11.A0D
            if (r3 == 0) goto L_0x1434
            boolean r3 = r11.A04
            if (r3 != 0) goto L_0x1434
            java.lang.String r3 = "share_professional_thumbnails"
        L_0x139b:
            java.util.List r8 = java.util.Collections.singletonList(r3)
            X.0qQ.A07(r8)
            X.ADo r12 = r10.A16()
            java.lang.Float r3 = r13.A0D
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x1430
            float r3 = r3.floatValue()
        L_0x13b0:
            r12.A01 = r3
            java.lang.Float r3 = r13.A0C
            if (r3 == 0) goto L_0x13ba
            float r7 = r3.floatValue()
        L_0x13ba:
            r12.A00 = r7
            java.lang.Boolean r3 = r13.A0B
            if (r3 == 0) goto L_0x142e
            boolean r3 = r3.booleanValue()
        L_0x13c4:
            r12.A0P = r3
            X.6b1 r7 = new X.6b1
            r7.<init>(r12)
            r3 = 3970(0xf82, float:5.563E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r10.A0z(r11, r7, r3, r8)
        L_0x13d4:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r10.A1N(r3)
            X.0ng r3 = r9.A06
            if (r3 == 0) goto L_0x13e8
            X.0no r7 = X.0no.A00()
            X.0ng r3 = r9.A06
            if (r3 == 0) goto L_0x1c32
            r7.A02(r3)
        L_0x13e8:
            android.view.View r3 = r9.A02
            if (r3 == 0) goto L_0x1422
            android.view.View r10 = r9.A0G
            android.view.View r8 = r9.A01
            android.view.View r7 = r9.A03
            android.view.View r3 = r9.A00
            android.view.View[] r3 = new android.view.View[]{r10, r8, r7, r3}
            X.C294975nL.A05(r3, r2)
            com.instagram.ui.widget.searchedittext.SearchEditText r3 = r9.A08
            java.lang.String r7 = "Required value was null."
            if (r3 == 0) goto L_0x1c2c
            r3.clearFocus()
            com.instagram.ui.widget.searchedittext.SearchEditText r3 = r9.A08
            if (r3 == 0) goto L_0x1c26
            android.text.Editable r8 = r3.getText()
            com.instagram.ui.widget.searchedittext.SearchEditText r3 = r9.A08
            if (r3 == 0) goto L_0x1c20
            android.text.Editable r3 = r3.getText()
            int r7 = r3.length()
            java.lang.String r3 = ""
            r8.replace(r2, r7, r3)
            X.8b5 r3 = r9.A0L
            r3.A01()
        L_0x1422:
            r7 = 0
            r9.A09 = r7
            r3 = 3
            X.JwE[] r3 = new X.C61076JwE[r3]
            r9.A0B = r3
            r9.A06 = r7
            goto L_0x0024
        L_0x142e:
            r3 = 0
            goto L_0x13c4
        L_0x1430:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x13b0
        L_0x1434:
            java.lang.String r3 = "share_professional_no_thumbnails"
            goto L_0x139b
        L_0x1438:
            X.6if r3 = r1.A1e
            java.lang.Object r3 = r3.get()
            X.8an r3 = (X.C358368an) r3
            X.6if r7 = r3.A1Y
            if (r7 == 0) goto L_0x0024
            boolean r3 = r7.A03
            if (r3 == 0) goto L_0x0024
            java.lang.Object r3 = r7.get()
            X.9Sf r3 = (X.C379049Sf) r3
            r3.DDW()
            goto L_0x0024
        L_0x1453:
            X.80V r7 = X.AnonymousClass80V.SHOPPING_STICKER_EDIT_NAME
            X.6if r3 = r1.A1b
            java.lang.Object r14 = r3.get()
            X.AYL r14 = (X.AYL) r14
            if (r5 != r7) goto L_0x152b
            X.AIV r3 = r14.A08
            r3.getClass()
            X.VzI r9 = r14.A07
            if (r9 != 0) goto L_0x1482
            android.view.View r3 = r14.A03
            if (r3 != 0) goto L_0x1474
            android.view.ViewStub r3 = r14.A0N
            android.view.View r3 = r3.inflate()
            r14.A03 = r3
        L_0x1474:
            r3.getClass()
            X.A8W r7 = r14.A0U
            android.view.View r3 = r14.A03
            X.VzI r9 = new X.VzI
            r9.<init>(r3, r7)
            r14.A07 = r9
        L_0x1482:
            X.AIV r3 = r14.A08
            com.instagram.user.model.Product r3 = r3.A00
            r3.getClass()
            java.lang.String r8 = r3.A0J
            if (r8 == 0) goto L_0x14b3
            java.lang.String r3 = r9.A00
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x14b3
            r3 = 0
            r9.A00 = r3
            java.util.List r7 = r9.A04
            r7.clear()
            java.util.List r3 = r9.A03
            r3.clear()
            android.view.ViewGroup r3 = r9.A01
            r3.removeAllViews()
            r9.A00 = r8
            java.util.ArrayList r3 = X.C18268Voi.A01(r8)
            r7.addAll(r3)
            X.C18737VzI.A00(r9)
        L_0x14b3:
            X.C18737VzI.A01(r9)
            X.VzI r3 = r14.A07
            java.util.List r8 = r3.A03
            r8.clear()
            java.util.List r3 = r3.A04
            java.util.Iterator r7 = r3.iterator()
        L_0x14c3:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x14d9
            java.lang.Object r3 = r7.next()
            X.VWi r3 = (X.C17455VWi) r3
            boolean r3 = r3.A00
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r8.add(r3)
            goto L_0x14c3
        L_0x14d9:
            com.instagram.ui.text.fittingtextview.FittingTextView r7 = r14.A0a
            android.view.View r3 = r14.A0L
            android.content.res.Resources r8 = r3.getResources()
            r3 = 2131969849(0x7f134739, float:1.9576632E38)
            java.lang.String r3 = r8.getString(r3)
            r7.setText(r3)
            r3 = 2131969848(0x7f134738, float:1.957663E38)
            java.lang.String r3 = r8.getString(r3)
            r7.setContentDescription(r3)
            android.widget.TextView r7 = r14.A0O
            r3 = 2131969850(0x7f13473a, float:1.9576634E38)
            java.lang.String r3 = r8.getString(r3)
            r7.setText(r3)
            X.8BQ r3 = r14.A0S
            r3.A02(r2)
            android.widget.TextView r7 = r14.A06
            r7.getClass()
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r3 = r14.A0b
            android.view.View[] r3 = new android.view.View[]{r7, r3}
            X.C315596kB.A08(r3, r2)
            X.6if r3 = r14.A0Z
            java.lang.Object r3 = r3.get()
            X.8f8 r3 = (X.C360778f8) r3
            r3.A0A(r2)
            android.view.View r3 = r14.A03
            android.view.View[] r7 = new android.view.View[]{r3}
            r3 = 0
            X.C294975nL.A04(r3, r7, r2)
            goto L_0x0024
        L_0x152b:
            X.8ME r13 = r14.A0Y
            X.AIV r12 = r14.A08
            r12.getClass()
            java.lang.String r3 = r14.A0G
            r17 = r3
            java.lang.String r3 = r14.A0H
            if (r3 != 0) goto L_0x1544
            java.lang.String r3 = X.AYL.A00(r14)
            if (r3 == 0) goto L_0x15f6
            java.lang.String r3 = X.AYL.A00(r14)
        L_0x1544:
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r3)
            int r15 = r14.A00
            boolean r24 = X.AYL.A04(r14)
            X.8bb r10 = r14.A0F
            X.Khv r9 = r14.A0E
            X.6if r3 = r13.A1e
            java.lang.Object r3 = r3.get()
            X.8an r3 = (X.C358368an) r3
            r3.A0Z()
            X.6if r8 = r13.A1a
            java.lang.Object r3 = r8.get()
            X.AJ2 r3 = (X.AJ2) r3
            X.8nh r7 = A0A(r13)
            X.AE2 r3 = r3.A05
            r3.A00 = r7
            int r3 = r11.length()
            if (r3 <= 0) goto L_0x1595
            java.lang.Object r8 = r8.get()
            X.AJ2 r8 = (X.AJ2) r8
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7 = r13.A1m
            X.7w8 r3 = X.AJ2.A00(r12, r7)
            if (r3 != 0) goto L_0x15e8
            r21 = r10
            r22 = r17
            r23 = r15
            r25 = r2
            r19 = r12
            r20 = r9
            r17 = r11
            r18 = r8
            X.AJ2.A03(r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x1595:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r13.A1N(r3)
            X.8Mk r7 = r13.A0z
            r3 = 957(0x3bd, float:1.341E-42)
            java.lang.String r3 = X.C273654mx.A00(r3)
            r7.Dn9(r3)
            r14.A05()
            r8 = 0
            r14.A08 = r8
            r14.A0G = r8
            r14.A0H = r8
            r14.A0B = r8
            r14.A09 = r8
            r14.A0A = r8
            r14.A0C = r8
            r3 = -1
            r14.A00 = r3
            android.widget.ImageView r3 = r14.A05
            if (r3 == 0) goto L_0x15c1
            r3.setImageDrawable(r8)
        L_0x15c1:
            X.88K r7 = r14.A0T
            java.util.List r3 = r7.A09
            r3.remove(r14)
            android.graphics.Bitmap r3 = r7.A02
            if (r3 == 0) goto L_0x15d1
            r3.recycle()
            r7.A02 = r8
        L_0x15d1:
            X.VzI r7 = r14.A07
            if (r7 == 0) goto L_0x0024
            r7.A00 = r8
            java.util.List r3 = r7.A04
            r3.clear()
            java.util.List r3 = r7.A03
            r3.clear()
            android.view.ViewGroup r3 = r7.A01
            r3.removeAllViews()
            goto L_0x0024
        L_0x15e8:
            r7.A0S(r3)
            int r7 = r3.A00
            if (r7 == 0) goto L_0x15f2
            X.C347017w8.A03(r3, r2)
        L_0x15f2:
            X.AJ2.A04(r3, r8, r12)
            goto L_0x1595
        L_0x15f6:
            java.lang.String r3 = ""
            goto L_0x1544
        L_0x15fa:
            X.80V r3 = X.AnonymousClass80V.ASSET_PICKER
            if (r5 != r3) goto L_0x1600
            goto L_0x0024
        L_0x1600:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7 = r1.A1m
            int r3 = r7.getActiveDrawableId()
            r7.A0h(r3, r4)
            r7.invalidate()
            goto L_0x0024
        L_0x160e:
            X.6if r3 = r1.A1Y
            java.lang.Object r9 = r3.get()
            X.A7v r9 = (X.C39755A7v) r9
            X.0eM r7 = r9.A05
            java.lang.Object r3 = r7.getValue()
            X.3oV r3 = (X.C252063oV) r3
            boolean r3 = r3.CVM()
            if (r3 == 0) goto L_0x1664
            java.lang.Object r3 = r7.getValue()
            X.3oV r3 = (X.C252063oV) r3
            android.view.View r3 = r3.getView()
            r8 = 8
            r3.setVisibility(r8)
            X.0eM r7 = r9.A03
            java.lang.Object r3 = r7.getValue()
            X.0qQ.A07(r3)
            android.view.View r3 = (android.view.View) r3
            r3.setVisibility(r8)
            X.0eM r3 = r9.A04
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            r3.setVisibility(r8)
            X.0eM r3 = r9.A06
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r3)
            com.instagram.common.ui.base.IgSimpleImageView r3 = (com.instagram.common.ui.base.IgSimpleImageView) r3
            r3.setVisibility(r8)
            java.lang.Object r7 = r7.getValue()
            X.0qQ.A07(r7)
            android.view.View r7 = (android.view.View) r7
            r3 = 0
            r7.setBackground(r3)
        L_0x1664:
            X.85r r7 = r1.A18
            android.graphics.drawable.Drawable r3 = r1.A11()
            if (r3 == 0) goto L_0x1673
            X.85t r3 = r7.A02()
            r3.E2p()
        L_0x1673:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r1.A1m
            r3.A0S = r4
            goto L_0x0024
        L_0x1679:
            X.6if r3 = r1.A1M
            java.lang.Object r8 = r3.get()
            X.AZU r8 = (X.AZU) r8
            boolean r3 = r0 instanceof X.C356488Ub
            if (r3 != 0) goto L_0x0024
            com.instagram.common.gallery.Medium r3 = r8.A04
            if (r3 == 0) goto L_0x168e
            com.instagram.common.gallery.Medium r7 = r8.A03
            r3 = 1
            if (r7 != 0) goto L_0x168f
        L_0x168e:
            r3 = 0
        L_0x168f:
            r7 = 0
            if (r3 == 0) goto L_0x1741
            X.ACq r3 = r8.A0C
            java.lang.String r15 = "model"
            if (r3 == 0) goto L_0x1739
            java.util.List r3 = r3.A00
            java.util.Iterator r14 = r3.iterator()
        L_0x169e:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x1735
            java.lang.Object r11 = r14.next()
            X.50v r11 = (X.C2802350v) r11
            boolean r3 = r11 instanceof X.C40591Aef
            if (r3 == 0) goto L_0x1710
            X.Aef r11 = (X.C40591Aef) r11
            com.instagram.api.schemas.StoryThenAndNowStickerDict r3 = r11.A00
            java.lang.Boolean r3 = r3.A00
            boolean r3 = X.AnonymousClass7TG.A1X(r3)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            boolean r3 = X.0qQ.A0K(r9, r3)
            if (r3 == 0) goto L_0x16eb
            com.instagram.common.ui.base.IgEditText r3 = r8.A06
            if (r3 == 0) goto L_0x16e9
            java.lang.String r13 = X.AZU.A00(r3)
        L_0x16ce:
            com.instagram.api.schemas.StoryThenAndNowStickerDict r3 = r11.A00
            X.0qQ.A0B(r3, r4)
            java.lang.String r12 = r3.A01
            java.lang.String r10 = r3.A03
            java.lang.Boolean r9 = r3.A00
            if (r13 != 0) goto L_0x16dd
            java.lang.String r13 = ""
        L_0x16dd:
            com.instagram.api.schemas.StoryThenAndNowStickerDict r3 = new com.instagram.api.schemas.StoryThenAndNowStickerDict
            r3.<init>(r9, r12, r13, r10)
            r11.A00 = r3
            com.instagram.common.gallery.Medium r3 = r8.A04
            r11.A01 = r3
            goto L_0x169e
        L_0x16e9:
            r13 = r7
            goto L_0x16ce
        L_0x16eb:
            com.instagram.common.ui.base.IgEditText r3 = r8.A05
            if (r3 == 0) goto L_0x170e
            java.lang.String r13 = X.AZU.A00(r3)
        L_0x16f3:
            com.instagram.api.schemas.StoryThenAndNowStickerDict r3 = r11.A00
            X.0qQ.A0B(r3, r4)
            java.lang.String r12 = r3.A02
            java.lang.String r10 = r3.A03
            java.lang.Boolean r9 = r3.A00
            if (r13 != 0) goto L_0x1702
            java.lang.String r13 = ""
        L_0x1702:
            com.instagram.api.schemas.StoryThenAndNowStickerDict r3 = new com.instagram.api.schemas.StoryThenAndNowStickerDict
            r3.<init>(r9, r13, r12, r10)
            r11.A00 = r3
            com.instagram.common.gallery.Medium r3 = r8.A03
            r11.A01 = r3
            goto L_0x169e
        L_0x170e:
            r13 = r7
            goto L_0x16f3
        L_0x1710:
            boolean r3 = r11 instanceof com.instagram.reels.prompt.model.PromptStickerModel
            if (r3 == 0) goto L_0x169e
            com.instagram.reels.prompt.model.PromptStickerModel r11 = (com.instagram.reels.prompt.model.PromptStickerModel) r11
            com.instagram.common.ui.base.IgEditText r3 = r8.A06
            if (r3 == 0) goto L_0x1733
            java.lang.String r10 = X.AZU.A00(r3)
        L_0x171e:
            java.lang.String r9 = " / "
            com.instagram.common.ui.base.IgEditText r3 = r8.A05
            if (r3 == 0) goto L_0x1731
            java.lang.String r3 = X.AZU.A00(r3)
        L_0x1728:
            java.lang.String r3 = X.002.A0g(r10, r9, r3)
            r11.A0B(r3)
            goto L_0x169e
        L_0x1731:
            r3 = r7
            goto L_0x1728
        L_0x1733:
            r10 = r7
            goto L_0x171e
        L_0x1735:
            X.ACq r7 = r8.A0C
            if (r7 != 0) goto L_0x1741
        L_0x1739:
            X.0qQ.A0F(r15)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x1741:
            X.8ME r10 = r8.A0L
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r10.A1N(r3)
            if (r7 == 0) goto L_0x1761
            java.util.List r3 = r7.A00
            java.util.Iterator r9 = r3.iterator()
        L_0x1750:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x1761
            java.lang.Object r7 = r9.next()
            X.50v r7 = (X.C2802350v) r7
            r3 = 0
            r10.Dn8(r7, r3)
            goto L_0x1750
        L_0x1761:
            X.0eM r9 = r8.A0R
            java.lang.Object r3 = r9.getValue()
            X.3oV r3 = (X.C252063oV) r3
            boolean r3 = r3.CVM()
            if (r3 == 0) goto L_0x1797
            X.0eM r3 = r8.A0P
            java.lang.Object r7 = r3.getValue()
            android.view.View r7 = (android.view.View) r7
            java.lang.Object r3 = r9.getValue()
            X.3oV r3 = (X.C252063oV) r3
            android.view.View r3 = r3.getView()
            android.view.View[] r3 = new android.view.View[]{r7, r3}
            X.C294975nL.A05(r3, r2)
            boolean r3 = r8.A0E
            if (r3 != 0) goto L_0x1797
            com.instagram.common.ui.base.IgSimpleImageView r3 = r8.A0A
            if (r3 == 0) goto L_0x1797
            android.view.View[] r3 = new android.view.View[]{r3}
            X.C294975nL.A05(r3, r2)
        L_0x1797:
            r3 = 0
            r8.A04 = r3
            r8.A03 = r3
            com.instagram.common.ui.base.IgEditText r7 = r8.A06
            if (r7 == 0) goto L_0x17a6
            r3 = 2131953758(0x7f13085e, float:1.9543996E38)
            X.AZU.A01(r7, r3)
        L_0x17a6:
            com.instagram.common.ui.base.IgEditText r7 = r8.A05
            if (r7 == 0) goto L_0x0024
            r3 = 2131953757(0x7f13085d, float:1.9543994E38)
            X.AZU.A01(r7, r3)
            goto L_0x0024
        L_0x17b2:
            X.80V r3 = X.AnonymousClass80V.CAPTION_COMPOSE
            if (r5 == r3) goto L_0x0024
            X.6if r3 = r1.A1d
            java.lang.Object r3 = r3.get()
            X.Ljc r3 = (X.C64876Ljc) r3
            X.JjN r3 = X.C64876Ljc.A00(r3)
            r3.A07()
            goto L_0x0024
        L_0x17c7:
            X.80V r3 = X.AnonymousClass80V.STICKER_LAYERING
            if (r5 == r3) goto L_0x0024
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r1.A1m
            r3.A0F = r2
            X.6if r3 = r1.A1P
            java.lang.Object r3 = r3.get()
            X.Lze r3 = (X.C65786Lze) r3
            r3.A05()
            goto L_0x0024
        L_0x17dc:
            X.8BA r3 = r1.A0y
            r3.D48(r1)
            goto L_0x0024
        L_0x17e3:
            r7.DCS(r0)
            return
        L_0x17e7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x17ed:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x17f3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x17f9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x17ff:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1805:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x180b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1811:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1817:
            java.lang.String r1 = "Unexpected SupportBusinessProfileSticker Theme: "
            java.lang.String r0 = X.A16.A00(r10)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1827:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x182d:
            java.lang.String r1 = "Unexpected SupportBusinessProfileSticker Theme: "
            java.lang.String r0 = X.A16.A00(r6)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x183d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1843:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1849:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x184f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1855:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x185b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1861:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1867:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x186d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1873:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1879:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x187f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x1882:
            boolean r2 = r0 instanceof X.AnonymousClass8UN
            if (r2 == 0) goto L_0x18c8
            com.instagram.common.session.UserSession r6 = r1.A0r
            X.0Tu r5 = X.0Tu.A05
            r2 = 36326030230762970(0x810e55000135da, double:3.0360660188929835E-306)
            boolean r2 = X.182.A06(r5, r6, r2)
            if (r2 == 0) goto L_0x18c8
            X.6if r2 = r1.A1U
            java.lang.Object r4 = r2.get()
            X.AeM r4 = (X.C40575AeM) r4
            X.8UN r0 = (X.AnonymousClass8UN) r0
            X.MWx r0 = r0.A00
            com.instagram.music.common.model.MusicAssetModel r3 = com.instagram.music.common.model.MusicAssetModel.A02(r0)
            com.instagram.common.session.UserSession r0 = r4.A05
            X.1Av r2 = X.1Au.A00(r0)
            boolean r0 = r3.A0O
            X.6KJ r2 = X.C271404in.A08(r2, r0)
            X.6KJ r0 = X.AnonymousClass6KJ.UNKNOWN
            if (r2 != r0) goto L_0x18b7
            X.6KJ r2 = X.AnonymousClass6KJ.MUSIC_OVERLAY_SIMPLE
        L_0x18b7:
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.POST_CAPTURE_STICKER
            r4.A04(r0, r3, r2)
        L_0x18bc:
            X.6if r0 = r1.A1e
            java.lang.Object r0 = r0.get()
            X.8an r0 = (X.C358368an) r0
            r0.A0U()
            return
        L_0x18c8:
            boolean r2 = r0 instanceof X.C356718Uy
            if (r2 == 0) goto L_0x18bc
            X.6if r2 = r1.A1U
            java.lang.Object r5 = r2.get()
            X.AeM r5 = (X.C40575AeM) r5
            X.8Uy r0 = (X.C356718Uy) r0
            X.MWx r6 = r0.A01
            boolean r0 = r6.CSR()
            if (r0 != 0) goto L_0x18f7
            boolean r0 = r6 instanceof X.DHT
            if (r0 == 0) goto L_0x1912
            r0 = r6
            X.DHT r0 = (X.DHT) r0
            if (r0 == 0) goto L_0x1912
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r0.A02
            java.lang.Boolean r2 = r0.CSQ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x1912
        L_0x18f7:
            com.instagram.common.session.UserSession r4 = r1.A0r
            X.0Tu r0 = X.0Tu.A05
            r2 = 36325201302139600(0x810d94000232d0, double:3.0355418010937366E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x1912
            X.6KJ r3 = X.AnonymousClass6KJ.MUSIC_VINYL
        L_0x1908:
            com.instagram.api.schemas.MusicProduct r2 = com.instagram.api.schemas.MusicProduct.MUSIC_FIRST
            com.instagram.music.common.model.MusicAssetModel r0 = com.instagram.music.common.model.MusicAssetModel.A02(r6)
            r5.A04(r2, r0, r3)
            goto L_0x18bc
        L_0x1912:
            X.6KJ r3 = X.AnonymousClass6KJ.MUSIC_OVERLAY_ALBUM_ART
            goto L_0x1908
        L_0x1915:
            X.6if r1 = r1.A1c
            java.lang.Object r5 = r1.get()
            X.WBO r5 = (X.WBO) r5
            X.8TQ r0 = (X.AnonymousClass8TQ) r0
            X.Vuw r6 = r0.A00
            java.lang.Integer r0 = r6.A01()
            if (r0 == 0) goto L_0x1bcb
            r5.A0G = r0
            android.view.View r0 = r5.A04
            if (r0 != 0) goto L_0x1ae7
            android.view.ViewStub r0 = r5.A0P
            android.view.View r7 = r0.inflate()
            r5.A03 = r7
            java.lang.String r1 = "Required value was null."
            if (r7 == 0) goto L_0x1bc5
            r0 = 2131441814(0x7f0b3896, float:1.850565E38)
            android.view.View r7 = r7.requireViewById(r0)
            r5.A04 = r7
            X.87F r0 = r5.A0S
            if (r7 == 0) goto L_0x1bbf
            r0.A03(r7)
            X.8Z5 r0 = r0.A03
            r0.A04 = r4
            android.view.View r4 = r5.A04
            if (r4 == 0) goto L_0x1bb9
            r0 = 2131433283(0x7f0b1743, float:1.8488347E38)
            android.view.View r0 = r4.findViewById(r0)
            com.instagram.reels.interactive.view.AvatarView r0 = (com.instagram.reels.interactive.view.AvatarView) r0
            r5.A0D = r0
            android.view.View r4 = r5.A04
            if (r4 == 0) goto L_0x1bb3
            r0 = 2131433317(0x7f0b1765, float:1.8488416E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = (com.instagram.common.ui.widget.imageview.CircularImageView) r0
            r5.A0B = r0
            if (r0 == 0) goto L_0x1bad
            r0.setVisibility(r2)
            android.content.Context r7 = r5.A0N
            r0 = 2131239062(0x7f082096, float:1.809442E38)
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            if (r0 == 0) goto L_0x1ba7
            android.graphics.drawable.Drawable r4 = r0.mutate()
            java.lang.String r9 = "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"
            X.0qQ.A0C(r4, r9)
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4
            android.graphics.drawable.GradientDrawable$Orientation r8 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            r4.setOrientation(r8)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r5.A0B
            if (r0 == 0) goto L_0x1ba1
            r0.setBackground(r4)
            android.view.View r4 = r5.A04
            if (r4 == 0) goto L_0x1b9b
            r0 = 2131433285(0x7f0b1745, float:1.8488351E38)
            android.view.View r0 = r4.requireViewById(r0)
            r5.A02 = r0
            if (r0 == 0) goto L_0x1b95
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            X.0qQ.A0C(r0, r9)
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            r0.setOrientation(r8)
            android.view.View r4 = r5.A04
            if (r4 == 0) goto L_0x1b8f
            r0 = 2131433319(0x7f0b1767, float:1.848842E38)
            android.view.View r4 = r4.requireViewById(r0)
            android.widget.EditText r4 = (android.widget.EditText) r4
            r5.A05 = r4
            if (r4 == 0) goto L_0x1b89
            android.text.InputFilter$AllCaps r0 = new android.text.InputFilter$AllCaps
            r0.<init>()
            android.text.InputFilter[] r0 = new android.text.InputFilter[]{r0}
            r4.setFilters(r0)
            android.widget.EditText r0 = r5.A05
            if (r0 == 0) goto L_0x1b83
            X.C306466Mg.A00(r0)
            android.widget.EditText r0 = r5.A05
            if (r0 == 0) goto L_0x1b7d
            r0.setOnFocusChangeListener(r5)
            android.widget.EditText r8 = r5.A05
            if (r8 == 0) goto L_0x1b77
            java.lang.Integer r4 = r5.A0G
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            r0 = 0
            if (r4 != r9) goto L_0x19e8
            r0 = 1
        L_0x19e8:
            r8.setEnabled(r0)
            android.widget.EditText r4 = r5.A05
            if (r4 == 0) goto L_0x1b71
            X.UsZ r0 = new X.UsZ
            r0.<init>(r4)
            r5.A0E = r0
            java.lang.Integer r0 = r5.A0G
            if (r0 != r9) goto L_0x1a04
            android.widget.EditText r4 = r5.A05
            if (r4 == 0) goto L_0x1b6b
            r0 = 2131964860(0x7f1333bc, float:1.9566514E38)
            r4.setHint(r0)
        L_0x1a04:
            android.view.View r4 = r5.A04
            if (r4 == 0) goto L_0x1b65
            r0 = 2131433318(0x7f0b1766, float:1.8488418E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A0A = r0
            android.view.View r4 = r5.A04
            if (r4 == 0) goto L_0x1b5f
            r0 = 2131433301(0x7f0b1755, float:1.8488384E38)
            android.view.View r0 = r4.findViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r2, r2)
            r5.A0C = r0
            android.view.View r4 = r5.A04
            if (r4 == 0) goto L_0x1b59
            r0 = 2131433299(0x7f0b1753, float:1.848838E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A07 = r0
            android.view.View r4 = r5.A03
            if (r4 == 0) goto L_0x1b53
            r0 = 2131443457(0x7f0b3f01, float:1.8508983E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.A06 = r0
            android.view.View r4 = r5.A04
            if (r4 == 0) goto L_0x1b4d
            r0 = 2131441775(0x7f0b386f, float:1.8505571E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A08 = r0
            android.view.View r4 = r5.A03
            if (r4 == 0) goto L_0x1b47
            r0 = 2131441776(0x7f0b3870, float:1.8505573E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A09 = r0
            android.view.View r4 = r5.A03
            if (r4 == 0) goto L_0x1b41
            r0 = 2131433286(0x7f0b1746, float:1.8488353E38)
            android.view.View r8 = r4.requireViewById(r0)
            X.0qQ.A07(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 2131238397(0x7f081dfd, float:1.8093072E38)
            r8.setImageResource(r0)
            X.3NG r4 = new X.3NG
            r4.<init>(r8)
            android.view.View r0 = r5.A04
            android.view.View[] r0 = new android.view.View[]{r8, r0}
            r4.A02(r0)
            X.UjR r0 = new X.UjR
            r0.<init>(r5)
            r4.A04 = r0
            r4.A00()
            java.lang.Integer r0 = r5.A0G
            if (r0 == r9) goto L_0x1aab
            android.view.View r4 = r5.A03
            if (r4 == 0) goto L_0x1b3b
            r0 = 2131435237(0x7f0b1ee5, float:1.849231E38)
            android.view.View r4 = r4.requireViewById(r0)
            X.0qQ.A07(r4)
            r4.setVisibility(r2)
            X.AMF r0 = new X.AMF
            r0.<init>(r5)
            X.AnonymousClass0fU.A00(r0, r4)
        L_0x1aab:
            android.content.res.Resources r9 = r7.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r8 = r9.getDimensionPixelSize(r0)
            android.widget.TextView r0 = r5.A07
            if (r0 == 0) goto L_0x1b35
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            X.0qQ.A0C(r4, r7)
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r0 = r9.getDimensionPixelSize(r0)
            r4.height = r0
            r4.setMargins(r8, r2, r8, r8)
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r4 = r9.getDimensionPixelSize(r0)
            android.widget.TextView r0 = r5.A0A
            if (r0 == 0) goto L_0x1b2f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0qQ.A0C(r0, r7)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.setMargins(r4, r2, r4, r8)
        L_0x1ae7:
            android.view.View r1 = r5.A0O
            android.view.View r0 = r5.A03
            android.view.View[] r1 = new android.view.View[]{r1, r0}
            X.2co r0 = X.C315596kB.A02
            X.C294975nL.A04(r3, r1, r2)
            X.87F r1 = r5.A0S
            android.view.View r0 = r1.A01
            r1.A02(r0)
            android.widget.EditText r0 = r5.A05
            if (r0 == 0) goto L_0x1b27
            r0.requestFocus()
            X.WBO.A03(r5, r6)
            android.widget.EditText r1 = r5.A05
            if (r1 == 0) goto L_0x1b1f
            X.UsZ r0 = r5.A0E
            r1.addTextChangedListener(r0)
            X.8ME r1 = r5.A0R
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r1.A1N(r0)
            X.8Mk r1 = r1.A0z
            X.6nz r0 = X.C317876nz.A1P
            java.lang.String r0 = r0.A0Z
            r1.DnE(r0)
            return
        L_0x1b1f:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b27:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b47:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b4d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b53:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b59:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b65:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b71:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b77:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b7d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b83:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b89:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b8f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b95:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b9b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1ba1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1ba7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1bad:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1bb3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1bb9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1bbf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1bc5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1bcb:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1bd3:
            X.6if r0 = r1.A1d
            java.lang.Object r0 = r0.get()
            X.Ljc r0 = (X.C64876Ljc) r0
            X.JjN r0 = X.C64876Ljc.A00(r0)
            r0.A06()
            return
        L_0x1be3:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r1.A1m
            r2.A0F = r4
            X.6if r2 = r1.A1P
            java.lang.Object r4 = r2.get()
            X.Lze r4 = (X.C65786Lze) r4
            X.8VI r0 = (X.AnonymousClass8VI) r0
            int r3 = r0.A01
            float r2 = r0.A00
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = r1.A10
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r1 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r1
            X.81W r1 = r1.A0K
            int r1 = r1.getHeight()
            float r1 = (float) r1
            boolean r0 = r0.A02
            r4.A06(r2, r1, r3, r0)
            return
        L_0x1c06:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x1c0c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x1c12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x1c18:
            java.lang.String r1 = "invalid transition event"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1c20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x1c26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x1c2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x1c32:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8ME.Dmx(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }
}
