package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.android.R;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;
import com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: X.7Hl  reason: invalid class name and case insensitive filesystem */
public final class C329067Hl {
    public static boolean A2V;
    public int A00;
    public int A01;
    public TextWatcher A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public FrameLayout A07;
    public ImageView A08;
    public 06N A09;
    public AnonymousClass7I6 A0A;
    public 1wn A0B;
    public 1wn A0C;
    public 1wn A0D;
    public 1wn A0E;
    public 1wn A0F;
    public IgTextView A0G;
    public ColorFilterAlphaImageView A0H;
    public ColorFilterAlphaImageView A0I;
    public AnonymousClass7I3 A0J;
    public DirectStickerSuggestionsController A0K;
    public C329857Km A0L;
    public C70964OTl A0M;
    public AnonymousClass7SL A0N;
    public AnonymousClass7IW A0O;
    public AnonymousClass7IX A0P;
    public C329907Kr A0Q;
    public C327797Cf A0R;
    public C71003OWa A0S;
    public A7C A0T;
    public AnonymousClass7L0 A0U;
    public AnonymousClass9HP A0V;
    public 2Er A0W;
    public C70824OMw A0X;
    public OE7 A0Y;
    public C331617Rr A0Z;
    public C329897Kq A0a;
    public C329307Ij A0b;
    public C329797Kg A0c;
    public C329787Kf A0d;
    public C329647Jr A0e;
    public AnonymousClass7KX A0f;
    public C70797OLs A0g;
    public C329867Kn A0h;
    public C329827Kj A0i;
    public AnonymousClass7AW A0j;
    public C329247Id A0k;
    public C49694F2e A0l;
    public C70830ONc A0m;
    public AnonymousClass7Q0 A0n;
    public C329877Ko A0o;
    public OKT A0p;
    public AnonymousClass792 A0q;
    public AnonymousClass7J9 A0r;
    public OZO A0s;
    public C329847Kl A0t;
    public AnonymousClass7JI A0u;
    public N3L A0v;
    public Integer A0w;
    public String A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public View A1H;
    public ViewGroup A1I;
    public ImageView A1J;
    public AnonymousClass7OE A1K;
    public IgTextView A1L;
    public C329837Kk A1M;
    public C328757Gc A1N;
    public C308476Uk A1O;
    public boolean A1P;
    public boolean A1Q;
    public final Context A1R;
    public final Rect A1S;
    public final Handler A1T = new Handler(Looper.getMainLooper());
    public final View.OnFocusChangeListener A1U;
    public final ViewGroup A1V;
    public final AnonymousClass7IT A1W;
    public final AnonymousClass0iw A1X;
    public final 1a8 A1Y;
    public final UserSession A1Z;
    public final C252213ok A1a;
    public final AnonymousClass3E6 A1b;
    public final AnonymousClass7IS A1c;
    public final AnonymousClass7IR A1d;
    public final AnonymousClass7HC A1e;
    public final AnonymousClass7IJ A1f;
    public final AnonymousClass7H6 A1g;
    public final C329207Hz A1h;
    public final C331697Sa A1i;
    public final C329057Hk A1j;
    public final AnonymousClass7IG A1k;
    public final AnonymousClass7IK A1l;
    public final AnonymousClass7I8 A1m;
    public final AnonymousClass7UH A1n;
    public final AnonymousClass9HS A1o;
    public final AnonymousClass7II A1p;
    public final C329187Hx A1q;
    public final AnonymousClass7IV A1r;
    public final AnonymousClass7IM A1s;
    public final AnonymousClass7IO A1t;
    public final AnonymousClass7I2 A1u;
    public final AnonymousClass7IU A1v;
    public final AnonymousClass7H1 A1w;
    public final AnonymousClass9HW A1x;
    public final C331037Pg A1y;
    public final C254783t2 A1z;
    public final C328897Gr A20;
    public final String A21;
    public final AnonymousClass0eK A22;
    public final AnonymousClass0eK A23;
    public final AnonymousClass0eK A24;
    public final AnonymousClass0eK A25;
    public final AnonymousClass0eK A26;
    public final boolean A27;
    public final boolean A28;
    public final boolean A29;
    public final boolean A2A;
    public final View.OnLayoutChangeListener A2B;
    public final C249453jo A2C;
    public final 0wc A2D;
    public final C314466iJ A2E;
    public final C332827Wn A2F;
    public final C329077Hm A2G;
    public final C329147Ht A2H;
    public final C329087Hn A2I;
    public final C329107Hp A2J;
    public final C329117Hq A2K;
    public final C329127Hr A2L;
    public final C329137Hs A2M;
    public final C328887Gq A2N;
    public final C331717Sc A2O;
    public final AnonymousClass0eK A2P;
    public final AnonymousClass0eM A2Q;
    public final boolean A2R;
    public final boolean A2S;
    public final boolean A2T;
    public final boolean A2U;

    public static C72654PEh A06(Activity activity, C329067Hl r12, Integer num) {
        UserSession userSession = r12.A1Z;
        Context context = r12.A1R;
        AnonymousClass7I2 r6 = r12.A1u;
        return new C72654PEh(activity, context, userSession, r12.A1i, r12, r6, num, r12.A21, new C41431Atr(r12), r12.A28);
    }

    public static String A0A(C53401GnY gnY, C329067Hl r11, Long l, String str) {
        String str2 = str;
        if (!A0s(r11) && (gnY == null || !C71052OaU.A03((List) gnY.A00))) {
            return null;
        }
        String A002 = HZX.A00();
        if (gnY != null) {
            str2 = gnY.A03;
        }
        String A0F2 = A0F(r11);
        AnonymousClass5D7 A003 = AnonymousClass5D5.A00(r11.A1Z);
        Boolean valueOf = Boolean.valueOf(!0mp.A0B(A0F2));
        String str3 = r11.A21;
        boolean z = false;
        if (gnY != null) {
            z = true;
        }
        A003.A00(HNL.THREADVIEW_USER_INPUT_PROMPT, valueOf, l, str2, A0F2, str3, A002, z, true);
        return A002;
    }

    public static void A0R(C329067Hl r25) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BitSet bitSet = new BitSet(0);
        C329067Hl r3 = r25;
        r3.A16();
        2Er r0 = r3.A0W;
        String str2 = "";
        if (r0 == null || r0.C6C() == null) {
            str = str2;
        } else {
            str = r3.A0W.C6C();
        }
        linkedHashMap.put("message_send_callback", new Q3B(new C66310MMt(new C73513Pdv(r3), 18)));
        linkedHashMap.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        if (bitSet.nextClearBit(0) >= 0) {
            C11844ShW shW = new C11844ShW("com.bloks.www.genai.metaai.experiences.discovery.screen_query.BloksGenAIMetaAIDiscoveryScreenQuery", (String) null, (String) null, 0Yt.A0B(linkedHashMap), 0Yt.A0E(), 719983200, 0, true);
            Context context = r3.A1R;
            C307506Qj A002 = C48721Ej6.A00(r3.A1Z, false);
            FRI fri = new FRI(new UKI((UKS) null, context.getString(2131958785)), false, (Integer) null, (Integer) null, 1.0f, false, false, false, true);
            0qQ.A0B(A002, 1);
            shW.E0s(context, fri, A002);
            2Er r5 = r3.A0W;
            if (!(r5 == null || r5.BZK() == null)) {
                str2 = r3.A0W.BZK().getId();
            }
            AnonymousClass7I3 r52 = r3.A0J;
            String A0D2 = A0D(r3);
            1Ln A0J2 = 1Ln.A0J(r52.A01);
            if (A0J2.A00.isSampled()) {
                A0J2.A0Z(18);
                A0J2.A0X(0);
                A0J2.A0R("selected_item", "hamburger_menu");
                A0J2.A0R("agent_id", str2);
                A0J2.A0R("agent_personality", (String) null);
                A0J2.A0M(XSV.A02, "thread_type");
                A0J2.A0O("is_e2ee", false);
                A0J2.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A0D2);
                A0J2.A0M(C69503Nml.A05, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A0J2.A0O("is_request_button_activated", (Boolean) null);
                A0J2.A0O("is_waitlist", (Boolean) null);
                A0J2.A0Y(0);
                A0J2.A0R("prompt_id", (String) null);
                A0J2.A0S("displayed_prompt_ids", (List) null);
                A0J2.Cgf();
            }
            FragmentActivity fragmentActivity = (FragmentActivity) 0mE.A00(context, FragmentActivity.class);
            if (fragmentActivity != null) {
                AnonymousClass2uJ.A04(fragmentActivity, context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_background)));
                if (r3.A09 == null) {
                    C46727DkG dkG = new C46727DkG(fragmentActivity, r3);
                    r3.A09 = dkG;
                    fragmentActivity.getSupportFragmentManager().A0r(dkG, true);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(C66579MXk.A00(586));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009b, code lost:
        if (X.AnonymousClass6W3.A07(r7) == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c3, code lost:
        if (r1 == null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0100, code lost:
        if (r2.Axj() == false) goto L_0x0102;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0i(X.C329067Hl r13, java.lang.Integer r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, boolean r19) {
        /*
            r9 = r14
            r10 = r16
            if (r18 == 0) goto L_0x0040
            X.7UH r3 = r13.A1n
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.3tH r4 = A05(r13, r8)
            X.2Er r0 = r13.A0W
            if (r0 == 0) goto L_0x0127
            boolean r0 = r0.CUG()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x0019:
            java.util.HashMap r11 = A0H(r13)
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            X.0eK r0 = r13.A24
            java.lang.Object r1 = r0.get()
            java.lang.String r0 = "ephemeral_lifetime_ms"
            r12.put(r0, r1)
            X.3t2 r5 = r13.A1z
            com.instagram.common.session.UserSession r1 = r13.A1Z
            com.instagram.model.direct.DirectThreadKey r0 = A09(r13)
            boolean r0 = X.AnonymousClass796.A07(r1, r0, r8)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0040:
            boolean r2 = X.C71052OaU.A02(r15)
            int r0 = r10.hashCode()
            com.instagram.common.session.UserSession r5 = r13.A1Z
            r8 = 1
            X.0qQ.A0B(r5, r8)
            X.Nhu r4 = X.C328727Fx.A01(r5, r0)
            if (r4 == 0) goto L_0x011c
            boolean r0 = r13.A1S()
            r4.onStartFlow(r0)
            r4.onLogDataProcessingStart()
            r4.onLogTransportMessageStart()
            r4.annotateLocalDataId(r10)
            r0 = r19
            r4.annotateIsBundledWithMediaSend(r0)
            r0 = r17
            r4.annotateSendSurface(r0)
            X.3t2 r7 = r13.A1z
            java.lang.String r0 = X.AnonymousClass4KK.A02(r7)
            r4.annotateOpenThreadId(r0)
            int r1 = r14.intValue()
            java.lang.String r0 = X.AnonymousClass48O.A00(r1)
            r4.annotateThreadType(r1, r0)
            r0 = 0
            X.0qQ.A0B(r7, r0)
            boolean r6 = r7 instanceof X.AnonymousClass9HR
            if (r6 == 0) goto L_0x0123
            X.3tH r0 = X.AnonymousClass6W3.A00(r7)
        L_0x008e:
            java.lang.String r0 = r0.A00
            r4.annotateTransportType(r0)
            r3 = 1
            if (r6 == 0) goto L_0x009d
            boolean r1 = X.AnonymousClass6W3.A07(r7)
            r0 = 1
            if (r1 != 0) goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            r4.annotateIsEncrypted(r0)
            if (r6 == 0) goto L_0x00bc
            r4.annotateIsMsys(r8)
            java.lang.Long r0 = X.AnonymousClass4KK.A01(r7)
            r4.annotateOccamadilloThreadId(r0)
            X.3sy r0 = X.AnonymousClass6W3.A06(r7)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = X.C66647MaG.A07(r0)
            if (r0 == 0) goto L_0x00bc
            long r0 = r0.A00
            r4.annotateMsysThreadId(r0)
        L_0x00bc:
            X.7Kg r0 = r13.A0c
            if (r0 == 0) goto L_0x0121
            X.OHv r1 = r0.A09
            r0 = 1
            if (r1 != 0) goto L_0x00c6
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            r4.annotateIsReply(r0)
            if (r1 == 0) goto L_0x00d4
            X.2FW r0 = r1.A03
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = r0.A00
            r4.annotateReplyToType(r0)
        L_0x00d4:
            r4.annotateIsLink(r2)
            com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes r0 = com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes.TEXT
            r4.annotateMessageType(r0)
            X.0eK r0 = r13.A22
            java.lang.Object r2 = r0.get()
            X.2Ep r2 = (X.AnonymousClass2Ep) r2
            X.0eK r1 = r13.A26
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x011f
            java.lang.Object r0 = r1.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L_0x00f6:
            r4.annotateIsVm(r0)
            if (r2 == 0) goto L_0x0102
            boolean r1 = r2.Axj()
            r0 = 1
            if (r1 != 0) goto L_0x0103
        L_0x0102:
            r0 = 0
        L_0x0103:
            r4.annotateIsDm(r0)
            X.0eK r0 = r13.A24
            java.lang.Object r0 = r0.get()
            java.lang.Long r0 = (java.lang.Long) r0
            r4.annotateEphemeralLifetimeMs(r0)
            if (r2 == 0) goto L_0x011d
            boolean r0 = r2.CVa(r5)
            if (r0 == 0) goto L_0x011d
        L_0x0119:
            r4.annotateIsInstamadillo(r3)
        L_0x011c:
            return
        L_0x011d:
            r3 = 0
            goto L_0x0119
        L_0x011f:
            r0 = 0
            goto L_0x00f6
        L_0x0121:
            r1 = 0
            goto L_0x00c5
        L_0x0123:
            X.3tH r0 = X.C254923tH.DJANGO
            goto L_0x008e
        L_0x0127:
            r6 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A0i(X.7Hl, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void A1L(C69319NjK njK, String str, String str2) {
        A16();
        AnonymousClass7ON.A02((AnonymousClass4DH) null, A07(njK, this, str, str2));
    }

    public static int A00(C329067Hl r0) {
        2Er r02 = r0.A0W;
        if (r02 != null) {
            return r02.C6a();
        }
        return 0;
    }

    public static View A02(C329067Hl r2) {
        if (r2.A1H == null) {
            View requireViewById = r2.A1V.requireViewById(R.id.composer_overlay_top);
            r2.A1H = requireViewById;
            requireViewById.setOnClickListener((View.OnClickListener) null);
        }
        return r2.A1H;
    }

    public static IGAIAgentType A03(C329067Hl r1) {
        2Er r0 = r1.A0W;
        if (r0 == null || r0.BZK() == null) {
            return null;
        }
        return r1.A0W.BZK().A03.AaX();
    }

    public static C254933tI A04(C329067Hl r1) {
        C70726OHv oHv;
        C329797Kg r0 = r1.A0c;
        if (r0 == null || (oHv = r0.A09) == null) {
            return null;
        }
        return oHv.A02.A01;
    }

    public static C254923tH A05(C329067Hl r2, Integer num) {
        if (AnonymousClass796.A07(r2.A1Z, A09(r2), num)) {
            return C254923tH.ACT;
        }
        return AnonymousClass6W3.A00(r2.A1z);
    }

    public static C72656PEj A07(C69319NjK njK, C329067Hl r39, String str, String str2) {
        C329067Hl r10 = r39;
        UserSession userSession = r10.A1Z;
        Context context = r10.A1R;
        Handler handler = r10.A1T;
        boolean z = false;
        if (A00(r10) == 29) {
            z = true;
        }
        C254783t2 r1 = r10.A1z;
        0qQ.A0B(r1, 0);
        boolean z2 = r1 instanceof AnonymousClass9HR;
        ArrayList A0G2 = A0G(r10);
        DirectThreadKey A092 = A09(r10);
        AnonymousClass793 r9 = new AnonymousClass793(A08(r10));
        AnonymousClass7L0 r13 = r10.A0U;
        2Er r12 = r10.A0W;
        AnonymousClass7I2 r11 = r10.A1u;
        C329207Hz r8 = r10.A1h;
        AnonymousClass7IV r7 = r10.A1r;
        OZO ozo = r10.A0s;
        C331697Sa r5 = r10.A1i;
        C329797Kg r4 = r10.A0c;
        C69319NjK njK2 = njK;
        0sL pdw = new C73514Pdw(njK2, r10);
        C41429Atp atp = new C41429Atp(r10);
        boolean z3 = r10.A28;
        UserSession userSession2 = userSession;
        return new C72656PEj(context, handler, userSession2, r8, r5, njK2, r13, r12, r10, r4, r7, r11, r9, ozo, A092, AnonymousClass05K.A00, str, str2, r10.A21, A0G2, atp, pdw, z, z2, z3);
    }

    public static AnonymousClass7KY A08(C329067Hl r10) {
        UserSession userSession = r10.A1Z;
        boolean z = r10.A29;
        boolean z2 = r10.A0y;
        AnonymousClass0eK r0 = r10.A23;
        r0.getClass();
        C329607Jn r6 = new C329607Jn(r0);
        AnonymousClass0eK r02 = r10.A26;
        r02.getClass();
        AnonymousClass7U6 r7 = new AnonymousClass7U6(r02);
        C254783t2 r5 = r10.A1z;
        return new AnonymousClass7KY(userSession, r10.A0W, r10.A0Z, r10.A0c, r5, r6, r7, z, z2);
    }

    public static DirectThreadKey A09(C329067Hl r1) {
        2Er r0 = r1.A0W;
        if (r0 == null || !(r0.BJz() instanceof DirectThreadKey)) {
            return null;
        }
        return (DirectThreadKey) r1.A0W.BJz();
    }

    public static String A0C(C329067Hl r5) {
        String str;
        if (((Boolean) r5.A0Z.A0G.getValue()).booleanValue()) {
            str = "stickers";
        } else {
            str = "gifs";
        }
        if (25x.A00(r5.A1Z).A01.A00 != C299715vi.A00) {
            return str;
        }
        AnonymousClass7IJ r1 = r5.A1f;
        if (r1.A00()) {
            return str;
        }
        if (182.A06(0Tu.A05, r1.A00, 36319312901905533L)) {
            return AnonymousClass000.A00(4515);
        }
        return str;
    }

    public static String A0D(C329067Hl r2) {
        2Er r0 = r2.A0W;
        if (r0 == null || r0.C6C() == null) {
            return "";
        }
        return r2.A0W.C6C();
    }

    public static String A0E(C329067Hl r1) {
        2Er r0 = r1.A0W;
        if (r0 == null || r0.BRZ().isEmpty()) {
            return null;
        }
        return ((User) r1.A0W.BRZ().get(0)).getId();
    }

    public static ArrayList A0G(C329067Hl r3) {
        ArrayList arrayList = new ArrayList();
        2Er r1 = r3.A0W;
        if (r1 != null && !r3.A1S()) {
            for (User id : r1.BRZ()) {
                arrayList.add(id.getId());
            }
        }
        return arrayList;
    }

    public static HashMap A0H(C329067Hl r3) {
        HashMap hashMap = new HashMap();
        hashMap.put("is_mixvm", Boolean.valueOf(r3.A29));
        hashMap.put("is_vm", r3.A26.get());
        hashMap.put("is_mixvm_eligible", r3.A2P.get());
        return hashMap;
    }

    private void A0J() {
        ImageView imageView;
        if (!182.A06(0Tu.A05, this.A1Z, 36320511197716997L)) {
            IgTextView igTextView = this.A1L;
            if (igTextView == null) {
                return;
            }
            if (this.A0U.A0K.length > 1) {
                AnonymousClass7I8 r1 = this.A1m;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, (float) r1.A00(), this.A0U.A0K, (float[]) null, Shader.TileMode.REPEAT);
                this.A1L.getPaint().setShader(linearGradient);
                this.A1K = new C3266477p(linearGradient);
                if (this.A07.getHeight() != 0) {
                    A0g(this, r1.A00() - this.A07.getHeight());
                    return;
                }
                return;
            }
            igTextView.getPaint().setShader((Shader) null);
            this.A1K = null;
            int[] iArr = this.A0U.A0K;
            int length = iArr.length;
            IgTextView igTextView2 = this.A1L;
            if (length == 1) {
                igTextView2.setTextColor(iArr[0]);
            } else {
                Context context = this.A1R;
                igTextView2.setTextColor(02K.A02(context, 2Yu.A0H(context, R.attr.igds_color_primary_button)));
            }
            imageView = this.A1L;
        } else if (this.A1I != null && this.A08 != null && this.A1J != null && this.A0U != null) {
            Context context2 = this.A1R;
            float dimensionPixelSize = (float) context2.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize}, (RectF) null, (float[]) null));
            int[] iArr2 = this.A0U.A0K;
            int length2 = iArr2.length;
            if (length2 == 0) {
                int A0F2 = 2Yu.A0F(context2, R.attr.cyanBubbleBackground);
                C308486Ul.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, A0F2);
            } else if (length2 == 1) {
                int i = iArr2[0];
                C308486Ul.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, i);
            } else {
                AnonymousClass7I8 r12 = this.A1m;
                float A002 = (float) r12.A00();
                int[] iArr3 = this.A0U.A0K;
                0qQ.A0B(iArr3, 2);
                Shape shape = shapeDrawable.getShape();
                C308486Ul.A01((Bitmap) null, Paint.Cap.BUTT, Paint.Style.FILL, shapeDrawable, shape, iArr3, A002, 0.0f).Eov(r12.A00() - this.A07.getHeight());
            }
            this.A08.setBackground(shapeDrawable);
            this.A1J.getDrawable().setColorFilter(AnonymousClass37O.A00(this.A0U.A05));
            this.A08.invalidate();
            imageView = this.A1J;
        } else {
            return;
        }
        imageView.invalidate();
    }

    private void A0K(Activity activity) {
        AnonymousClass7JU r3;
        if (this.A0e == null) {
            AnonymousClass9IV r12 = new AnonymousClass9IV(20);
            UserSession userSession = this.A1Z;
            UserSession userSession2 = userSession;
            if (182.A06(0Tu.A05, userSession, 36323513380383962L)) {
                r3 = AnonymousClass7JU.RIGHT_INSET;
            } else {
                r3 = AnonymousClass7JU.LEFT_INSET;
            }
            AnonymousClass7H1 r2 = this.A1w;
            if (r2 != null) {
                AnonymousClass7H0 r22 = (AnonymousClass7H0) r2;
                r12.A00 = new AnonymousClass7JZ(r3, r22.A0D(AnonymousClass7JY.AI));
                r12.A01 = new AnonymousClass7JZ(AnonymousClass7JU.LEFT_INSET, r22.A0D(AnonymousClass7JY.IMAGINE));
            }
            C329477Ja r0 = new C329477Ja(this);
            Context context = this.A1R;
            boolean z = !A0s(this);
            C329487Jb r02 = new C329487Jb(this);
            Activity activity2 = activity;
            C329497Jc r03 = new C329497Jc(activity2, this);
            C329507Jd r04 = new C329507Jd(activity2, this);
            AnonymousClass7IR r50 = this.A1d;
            AnonymousClass7IO r49 = this.A1t;
            C329517Je r05 = new C329517Je(this);
            C329527Jf r15 = new C329527Jf(this);
            C329537Jg r11 = new C329537Jg(this);
            C329247Id r48 = this.A0k;
            boolean z2 = this.A28;
            C254783t2 r26 = this.A1z;
            C331697Sa r23 = this.A1i;
            AnonymousClass0iw r222 = this.A1X;
            C329307Ij r24 = this.A0b;
            0sP r10 = new C329547Jh(this);
            C329557Ji r9 = new C329557Ji(this);
            C329567Jj r8 = new C329567Jj(this);
            C329577Jk r7 = new C329577Jk(this);
            C329587Jl r6 = new C329587Jl(this);
            C329597Jm r5 = new C329597Jm(this);
            AnonymousClass0eK r06 = this.A23;
            r06.getClass();
            boolean z3 = z2;
            Activity activity3 = activity2;
            Context context2 = context;
            AnonymousClass9IV r18 = r12;
            AnonymousClass0iw r19 = r222;
            UserSession userSession3 = userSession2;
            AnonymousClass7IR r223 = r50;
            AnonymousClass7IO r262 = r49;
            C329247Id r27 = r48;
            this.A0e = new C329647Jr(activity3, context2, r18, r19, userSession3, this.A0J, r223, r23, r24, this.A1s, r262, r27, r26, r0, r02, r03, r04, r05, r15, r11, r9, r8, r7, r6, r5, new C329607Jn(r06), new C329617Jo(this), new C329627Jp(activity2, this), new C329637Jq(this), r10, z, z3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0487, code lost:
        if (X.182.A06(r2, r3, 36324831935672724L) == false) goto L_0x0489;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x04cb, code lost:
        if (X.182.A06(r2, r3, 36329367420354629L) == false) goto L_0x04cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
        if (r1.A00 <= 0) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0368  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0M(androidx.fragment.app.FragmentActivity r34, int r35) {
        /*
            r33 = this;
            r5 = r33
            android.view.ViewGroup r4 = r5.A1V
            r0 = 2131436171(0x7f0b228b, float:1.8494205E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r5.A07 = r0
            com.instagram.common.session.UserSession r3 = r5.A1Z
            boolean r0 = X.AnonymousClass7S3.A00(r3)
            if (r0 == 0) goto L_0x0117
            r0 = 2131431813(0x7f0b1185, float:1.8485366E38)
            android.view.View r0 = r4.requireViewById(r0)
        L_0x001e:
            r5.A03 = r0
            android.widget.FrameLayout r1 = r5.A07
            r0 = 2131436174(0x7f0b228e, float:1.849421E38)
            android.view.View r9 = r1.findViewById(r0)
            android.widget.FrameLayout r1 = r5.A07
            r0 = 2131431560(0x7f0b1088, float:1.8484853E38)
            android.view.View r12 = r1.findViewById(r0)
            android.view.ViewStub r12 = (android.view.ViewStub) r12
            r2 = r35
            r12.setLayoutResource(r2)
            X.2ia r1 = X.AnonymousClass2iW.A00(r3)
            r0 = 2131624872(0x7f0e03a8, float:1.8876936E38)
            r13 = 0
            if (r2 != r0) goto L_0x0048
            int r1 = r1.A00
            r0 = 1
            if (r1 > 0) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r6 = 0
            if (r0 == 0) goto L_0x012b
            r11 = 0
            r10 = 0
            r1 = 0
            boolean r0 = X.2Su.A07
            int r2 = r12.getLayoutResource()
            boolean r0 = X.2Su.A07
            if (r0 == 0) goto L_0x0114
            com.facebook.quicklog.QuickPerformanceLogger r8 = X.2Su.A09
            r7 = 264583695(0xfc53a0f, float:1.9448063E-29)
            if (r8 == 0) goto L_0x0089
            r8.markerStart(r7)
            X.0eM r0 = X.2Su.A0B
            java.lang.Object r0 = r0.getValue()
            X.2T0 r0 = (X.AnonymousClass2T0) r0
            int r1 = r0.A00(r2)
            java.lang.String r0 = "cache_size"
            r8.markerAnnotate(r7, r0, r1)
            java.util.Map r1 = X.2Su.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            X.9IO r0 = (X.AnonymousClass9IO) r0
            if (r0 == 0) goto L_0x0111
            int r1 = r0.A01
        L_0x0084:
            java.lang.String r0 = "cache_max_size"
            r8.markerAnnotate(r7, r0, r1)
        L_0x0089:
            r14 = 1
            r1 = r2
        L_0x008b:
            X.0eM r0 = X.2Su.A0B
            java.lang.Object r0 = r0.getValue()
            X.2T0 r0 = (X.AnonymousClass2T0) r0
            int r7 = r12.getLayoutResource()
            X.0eM r0 = r0.A00
            java.lang.Object r2 = r0.getValue()
            X.01r r2 = (X.01r) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object r0 = r2.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x010f
            java.lang.Object r7 = X.018.A15(r0)
            android.view.View r7 = (android.view.View) r7
        L_0x00b1:
            boolean r0 = X.2Su.A04
            if (r0 == 0) goto L_0x00c7
            int r2 = r12.getLayoutResource()
            android.view.LayoutInflater r0 = r12.getLayoutInflater()
            android.content.Context r0 = r0.getContext()
            X.0qQ.A07(r0)
            X.2Su.A02(r0, r2, r13, r13)
        L_0x00c7:
            r12.setOnInflateListener(r6)
            if (r7 == 0) goto L_0x010a
            if (r14 == 0) goto L_0x00cf
            r11 = 1
        L_0x00cf:
            android.view.ViewParent r8 = r12.getParent()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r8, r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r2 = r8.indexOfChild(r12)
            r8.removeViewInLayout(r12)
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            if (r0 == 0) goto L_0x0106
            if (r14 == 0) goto L_0x00ea
            r10 = 1
        L_0x00ea:
            r8.addView(r7, r2, r0)
        L_0x00ed:
            if (r14 == 0) goto L_0x013d
            com.facebook.quicklog.QuickPerformanceLogger r8 = X.2Su.A09
            r2 = 264583695(0xfc53a0f, float:1.9448063E-29)
            if (r8 == 0) goto L_0x013d
            java.lang.String r0 = "view_fetched"
            r8.markerPoint(r2, r0)
            java.lang.String r0 = "cache_hit"
            r8.markerAnnotate(r2, r0, r11)
            java.lang.String r0 = "use_layout_params"
            r8.markerAnnotate(r2, r0, r10)
            goto L_0x0120
        L_0x0106:
            r8.addView(r7, r2)
            goto L_0x00ed
        L_0x010a:
            android.view.View r7 = r12.inflate()
            goto L_0x00ed
        L_0x010f:
            r7 = 0
            goto L_0x00b1
        L_0x0111:
            r1 = 0
            goto L_0x0084
        L_0x0114:
            r14 = 0
            goto L_0x008b
        L_0x0117:
            r0 = 2131427570(0x7f0b00f2, float:1.847676E38)
            android.view.View r0 = r4.findViewById(r0)
            goto L_0x001e
        L_0x0120:
            android.content.Context r0 = X.C60960kU.A00     // Catch:{ all -> 0x0132 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x0132 }
            java.lang.String r1 = r0.getResourceEntryName(r1)     // Catch:{ all -> 0x0132 }
            goto L_0x0134
        L_0x012b:
            android.view.View r7 = r12.inflate()
            r5.A05 = r7
            goto L_0x0142
        L_0x0132:
            java.lang.String r1 = "unknown"
        L_0x0134:
            java.lang.String r0 = "view_name"
            r8.markerAnnotate(r2, r0, r1)
            r0 = 2
            r8.markerEnd(r2, r0)
        L_0x013d:
            X.0qQ.A0A(r7)
            r5.A05 = r7
        L_0x0142:
            r0 = 2131440515(0x7f0b3383, float:1.8503016E38)
            android.view.View r0 = r7.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.A06 = r0
            android.view.View r1 = r5.A05
            r0 = 2131440533(0x7f0b3395, float:1.8503052E38)
            android.view.View r14 = r1.findViewById(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320511197716997(0x81095000002205, double:3.032575760171348E-306)
            boolean r7 = X.182.A06(r2, r3, r0)
            if (r7 == 0) goto L_0x017d
            int r12 = r14.getPaddingLeft()
            int r11 = r14.getPaddingTop()
            int r10 = r14.getPaddingBottom()
            android.content.res.Resources r8 = r14.getResources()
            r7 = 2131165206(0x7f070016, float:1.7944623E38)
            int r7 = r8.getDimensionPixelSize(r7)
            r14.setPadding(r12, r11, r7, r10)
        L_0x017d:
            android.widget.FrameLayout r8 = r5.A07
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r8 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r8
            X.7IY r7 = new X.7IY
            r7.<init>(r5)
            r8.CNi(r7)
            r10 = 1
            r8.setKeepObservingAfterRequestDisallowTouchEvent(r10)
            X.7IZ r7 = new X.7IZ
            r7.<init>(r5)
            r9.setOnTouchListener(r7)
            X.0eK r14 = r5.A22
            X.3t2 r7 = r5.A1z
            r32 = r7
            X.7Ia r12 = new X.7Ia
            r9 = r34
            r12.<init>(r9, r5)
            java.util.List r20 = A0I(r5)
            X.7Ib r11 = new X.7Ib
            r11.<init>(r5)
            X.7Ic r8 = new X.7Ic
            r8.<init>(r5)
            X.0iw r7 = r5.A1X
            r31 = r7
            X.7Id r7 = new X.7Id
            r15 = r7
            r16 = r31
            r17 = r3
            r18 = r12
            r19 = r32
            r21 = r14
            r22 = r11
            r23 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r5.A0k = r7
            X.2Er r8 = r5.A0W
            if (r8 == 0) goto L_0x01df
            X.7LW r11 = X.AnonymousClass7LV.A00
            boolean r8 = r11.A02(r3, r8)
            if (r8 != 0) goto L_0x01df
            X.2Er r8 = r5.A0W
            boolean r8 = r11.A03(r3, r8)
            if (r8 != 0) goto L_0x01df
            r13 = 1
        L_0x01df:
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01fa
            android.view.View r1 = r5.A05
            r0 = 2131440529(0x7f0b3391, float:1.8503044E38)
            android.view.View r1 = r1.findViewById(r0)
            r1.getClass()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.6Uk r0 = new X.6Uk
            r0.<init>(r1)
            r5.A1O = r0
        L_0x01fa:
            android.view.View r0 = r5.A05
            r30 = r0
            if (r13 == 0) goto L_0x0521
            X.7H1 r0 = r5.A1w
            r29 = r0
        L_0x0204:
            X.7Gq r0 = r5.A2N
            r25 = r0
            boolean r0 = r5.A28
            r28 = r0
            X.6Uk r0 = r5.A1O
            r16 = r0
            boolean r0 = A0v(r5)
            if (r0 == 0) goto L_0x04ec
            r0 = 36325742468281522(0x810e12000634b2, double:3.035884036740989E-306)
        L_0x021b:
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0223
            X.7Gc r6 = r5.A1N
        L_0x0223:
            X.7Hm r15 = r5.A2G
            android.widget.FrameLayout r14 = r5.A07
            X.7Ig r13 = new X.7Ig
            r13.<init>(r5)
            X.7Ih r12 = new X.7Ih
            r12.<init>(r5)
            X.7Ii r11 = new X.7Ii
            r11.<init>(r5)
            X.7IO r8 = r5.A1t
            X.7IM r1 = r5.A1s
            X.7Ij r0 = new X.7Ij
            r18 = r15
            r19 = r13
            r20 = r12
            r21 = r11
            r22 = r6
            r23 = r1
            r24 = r8
            r26 = r7
            r27 = r16
            r11 = r0
            r12 = r9
            r13 = r30
            r15 = r29
            r16 = r31
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r5.A0b = r0
            X.7J7 r1 = new X.7J7
            r1.<init>(r9, r5)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r0.A0S
            r0.A00 = r1
            boolean r0 = A0s(r5)
            if (r0 == 0) goto L_0x0299
            boolean r0 = A0v(r5)
            if (r0 != 0) goto L_0x0299
            r0 = 36325145469072015(0x810d870019328f, double:3.035506492036974E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0299
            X.7Ij r11 = r5.A0b
            X.2Er r0 = r5.A0W
            java.lang.String r0 = r0.BZM()
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r8 = r11.A0S
            android.content.Context r6 = r8.getContext()
            r1 = 2131960522(0x7f1322ca, float:1.9557715E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r6.getString(r1, r0)
            r11.A0C = r0
            r8.setHint(r0)
        L_0x0299:
            X.7Ij r0 = r5.A0b
            r6 = 0
            X.0qQ.A0B(r0, r6)
            r7.A00 = r0
            X.7Ij r0 = r5.A0b
            X.7Gr r1 = r5.A20
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r0.A0S
            r0.A01(r1)
            X.7Ij r0 = r5.A0b
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r7 = r0.A0R
            X.7J9 r0 = new X.7J9
            r0.<init>()
            r5.A0r = r0
            boolean r0 = A12(r5)
            if (r0 == 0) goto L_0x02f1
            X.7J9 r11 = r5.A0r
            android.content.Context r12 = r5.A1R
            X.7Cd r8 = new X.7Cd
            r8.<init>(r5)
            X.7Ce r1 = new X.7Ce
            r1.<init>(r5)
            X.7I3 r0 = r5.A0J
            boolean r21 = r5.A1S()
            boolean r22 = A0u(r5)
            java.lang.String r18 = A0F(r5)
            X.7Cf r13 = new X.7Cf
            r14 = r9
            r15 = r12
            r16 = r3
            r17 = r0
            r19 = r8
            r20 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r5.A0R = r13
            X.7Ch[] r1 = new X.C327817Ch[]{r13}
            java.util.List r0 = r11.A02
            X.018.A18(r0, r1)
        L_0x02f1:
            boolean r0 = A0s(r5)
            X.0qQ.A0B(r3, r6)
            if (r0 == 0) goto L_0x04e5
            r0 = 2342167733774463264(0x20810d2500023120, double:4.069591906996515E-152)
        L_0x02ff:
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x032a
            r0 = 36324724561293606(0x810d25000a3126, double:3.035240308263049E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x032a
            X.7J9 r11 = r5.A0r
            X.PEn r8 = new X.PEn
            r8.<init>(r7)
            X.O8X r1 = new X.O8X
            r1.<init>(r5)
            java.util.Set r0 = r8.A01
            r0.add(r1)
            X.7Ch[] r1 = new X.C327817Ch[]{r8}
            java.util.List r0 = r11.A02
            X.018.A18(r0, r1)
        L_0x032a:
            X.7J9 r0 = r5.A0r
            r7.setCustomSelectionActionModeCallback(r0)
            X.7Ij r12 = r5.A0b
            X.7IG r0 = r5.A1k
            android.content.Context r8 = r5.A1R
            X.7JA r11 = new X.7JA
            r11.<init>(r8, r3, r0)
            r0 = 4
            X.0qQ.A0B(r12, r0)
            java.lang.String[] r1 = X.AnonymousClass7JB.A02
            X.7JC r0 = new X.7JC
            r0.<init>(r11, r7)
            r7.setInputContentInfoListener(r1, r0)
            r0 = 36319415981055371(0x81085100001d8b, double:3.031883140744452E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x035b
            X.LYI r0 = new X.LYI
            r0.<init>(r9, r3, r11, r12)
            r7.setOnDragListener(r0)
        L_0x035b:
            r0 = 36320511197716997(0x81095000002205, double:3.032575760171348E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            android.view.View r1 = r5.A05
            if (r0 == 0) goto L_0x04d8
            r0 = 2131440529(0x7f0b3391, float:1.8503044E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.A1I = r0
            android.view.View r1 = r5.A05
            r0 = 2131440528(0x7f0b3390, float:1.8503042E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.A08 = r0
            android.view.View r1 = r5.A05
            r0 = 2131440530(0x7f0b3392, float:1.8503046E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.A1J = r0
        L_0x038d:
            X.7Ij r0 = r5.A0b
            X.7J3 r7 = r0.A0X
            X.7J1 r1 = X.AnonymousClass7J1.A00
            com.instagram.common.session.UserSession r0 = r7.A04
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x03ab
            X.0eM r0 = r7.A08
            java.lang.Object r1 = r0.getValue()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L_0x03ab
            r0 = 2131237845(0x7f081bd5, float:1.8091952E38)
            X.AnonymousClass7BG.A02(r1, r0, r10)
        L_0x03ab:
            boolean r0 = r5.A0q()
            if (r0 == 0) goto L_0x03e3
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.String r0 = A0E(r5)
            if (r0 == 0) goto L_0x03cb
            java.lang.String r0 = A0E(r5)
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.add(r0)
        L_0x03cb:
            android.view.ViewGroup r7 = r5.A1I
            if (r7 != 0) goto L_0x03d1
            com.instagram.common.ui.base.IgTextView r7 = r5.A1L
        L_0x03d1:
            X.0qQ.A0B(r7, r6)
            X.3Dp r1 = X.C238833Dp.A00(r3)
            X.0qQ.A07(r1)
            X.7BD r0 = new X.7BD
            r0.<init>(r11)
            r1.A0A(r7, r0)
        L_0x03e3:
            X.7Ij r0 = r5.A0b
            android.view.View r1 = r0.A0J
            r0 = 2131440534(0x7f0b3396, float:1.8503054E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r0
            r5.A0I = r0
            android.widget.FrameLayout r12 = r5.A07
            r0 = 2131431562(0x7f0b108a, float:1.8484857E38)
            android.view.View r0 = r12.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            X.2eb r11 = new X.2eb
            r11.<init>(r0)
            r0 = 2131431561(0x7f0b1089, float:1.8484855E38)
            android.view.View r0 = r4.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            X.2eb r7 = new X.2eb
            r7.<init>(r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r5.A0I
            r0 = 2131442743(0x7f0b3c37, float:1.8507534E38)
            android.view.View r17 = r4.findViewById(r0)
            X.7JE r15 = new X.7JE
            r18 = r4
            r19 = r12
            r20 = r11
            r21 = r7
            r16 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21)
            X.7JF r1 = new X.7JF
            r1.<init>(r5)
            X.7Pg r0 = r5.A1y
            r11 = r8
            r12 = r3
            r13 = r0
            r14 = r1
            r16 = r32
            r17 = r10
            r18 = r6
            X.7JI r0 = X.AnonymousClass7JH.A00(r11, r12, r13, r14, r15, r16, r17, r18)
            r5.A0u = r0
            X.7Ij r10 = r5.A0b
            X.7JT r7 = X.AnonymousClass7JT.META_AI_DISCOVERY
            X.7JU r4 = X.AnonymousClass7JU.RIGHT_INSET
            X.7JV r1 = new X.7JV
            r1.<init>(r5)
            boolean r0 = A0w(r5)
            r10.ErS(r4, r7, r1, r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup r0 = r5.A06
            X.0nA.A0X(r0, r1)
            android.view.ViewGroup r0 = r5.A06
            X.0nA.A0Z(r0, r1)
            android.view.ViewGroup r0 = r5.A06
            X.0nA.A0b(r0, r1)
            A0e(r5, r6)
            X.7Ij r10 = r5.A0b
            X.7JT r7 = X.AnonymousClass7JT.META_AI_VOICE
            X.7JW r6 = new X.7JW
            r6.<init>(r5)
            boolean r0 = A0v(r5)
            if (r0 == 0) goto L_0x0489
            r0 = 36324831935672724(0x810d3e000d3194, double:3.035308212252765E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x048a
        L_0x0489:
            r0 = 0
        L_0x048a:
            r10.ErS(r4, r7, r6, r0)
            boolean r0 = A0v(r5)
            if (r0 == 0) goto L_0x04aa
            r0 = 36324831935672724(0x810d3e000d3194, double:3.035308212252765E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x04aa
            X.0nO r1 = X.0nY.A00()
            X.NS0 r0 = new X.NS0
            r0.<init>(r3, r8)
            r1.ATE(r0)
        L_0x04aa:
            boolean r0 = r5.A1S()
            if (r0 == 0) goto L_0x04d5
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x04b2:
            X.7Ij r8 = r5.A0b
            X.7JT r7 = X.AnonymousClass7JT.META_AI_INVOCATION
            X.7JX r6 = new X.7JX
            r6.<init>(r9, r5, r0)
            boolean r0 = A0s(r5)
            if (r0 != 0) goto L_0x04cd
            r0 = 36329367420354629(0x81115e00014045, double:3.0381764710285325E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x04ce
        L_0x04cd:
            r0 = 0
        L_0x04ce:
            r8.ErS(r4, r7, r6, r0)
            A0b(r5)
            return
        L_0x04d5:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x04b2
        L_0x04d8:
            r0 = 2131440508(0x7f0b337c, float:1.8503001E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r5.A1L = r0
            goto L_0x038d
        L_0x04e5:
            r0 = 36324724560834849(0x810d2500033121, double:3.035240307972929E-306)
            goto L_0x02ff
        L_0x04ec:
            com.instagram.api.schemas.IGAIAgentType r1 = A03(r5)
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A05
            if (r1 != r0) goto L_0x04fb
            r0 = 36325742468150448(0x810e12000434b0, double:3.0358840366580975E-306)
            goto L_0x021b
        L_0x04fb:
            com.instagram.api.schemas.IGAIAgentType r1 = A03(r5)
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A08
            if (r1 != r0) goto L_0x050a
            r0 = 36325742468412596(0x810e12000834b4, double:3.035884036823881E-306)
            goto L_0x021b
        L_0x050a:
            com.instagram.api.schemas.IGAIAgentType r0 = A03(r5)
            if (r0 != 0) goto L_0x0223
            int r0 = A00(r5)
            boolean r0 = X.AnonymousClass48O.A04(r0)
            if (r0 != 0) goto L_0x0223
            r0 = 36325742468347059(0x810e12000734b3, double:3.035884036782435E-306)
            goto L_0x021b
        L_0x0521:
            r29 = r6
            goto L_0x0204
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A0M(androidx.fragment.app.FragmentActivity, int):void");
    }

    public static void A0N(N34 n34, C69319NjK njK, C329067Hl r9, String str) {
        Long l;
        AnonymousClass7IR r3 = r9.A1d;
        List A0I2 = A0I(r9);
        C254783t2 r4 = r9.A1z;
        String obj = njK.toString();
        0qQ.A0B(r4, 1);
        0qQ.A0B(obj, 2);
        0wc r2 = r3.A00;
        0Aj A002 = r2.A00(r2.A00, "direct_composer_sticker_send");
        if (A002.isSampled()) {
            A002.AAe("recipient_ids", A0I2);
            A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, obj);
            A002.AAJ("open_thread_id", AnonymousClass4KK.A02(r4));
            A002.A9F("occamadillo_thread_id", AnonymousClass4KK.A01(r4));
            A002.A7p("is_e2ee", Boolean.valueOf(AnonymousClass6W3.A07(r4)));
            if (str != null) {
                A002.AAJ(C66579MXk.A00(11), str);
            }
            UserSession userSession = r3.A01;
            0Tu r32 = 0Tu.A05;
            if (182.A06(r32, userSession, 36328328039382254L) && n34 != null) {
                A002.A8M(n34.A01, "sticker_type");
                String str2 = n34.A04;
                if (str2 != null) {
                    l = 00y.A0n(10, str2);
                } else {
                    l = null;
                }
                A002.A9F("pack_id", l);
                A002.A7p("is_animated", n34.A02);
                A002.A7p("is_favorited", n34.A03);
                A002.AAJ("tray_source", n34.A05);
                A002.A7p("is_overflow", Boolean.valueOf(n34.A06));
                A002.A7p("is_visible_on_tray_open", (Boolean) null);
                if (182.A06(r32, userSession, 36328328039447791L)) {
                    A002.A9F(C66579MXk.A00(1147), Long.valueOf((long) n34.A00));
                }
            }
            A002.Cgf();
        }
    }

    public static void A0P(C254933tI r12, C329067Hl r13, Integer num, String str) {
        Integer num2;
        LocalSendSpeedMessageTypes localSendSpeedMessageTypes;
        2Er r0 = r13.A0W;
        Boolean bool = null;
        if (r0 != null) {
            num2 = Integer.valueOf(r0.C6a());
        } else {
            num2 = null;
        }
        Integer num3 = num;
        if (num == AnonymousClass05K.A0j) {
            localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.GIF;
        } else {
            localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.STICKER;
        }
        String str2 = str;
        A0O(r12, r13, localSendSpeedMessageTypes, num2, str);
        AnonymousClass7UH r3 = r13.A1n;
        C254923tH A052 = A05(r13, AEM.A01(num));
        2Er r02 = r13.A0W;
        if (r02 != null) {
            bool = Boolean.valueOf(r02.CUG());
        }
        HashMap A0H2 = A0H(r13);
        HashMap hashMap = new HashMap();
        hashMap.put("ephemeral_lifetime_ms", r13.A24.get());
        r3.A00(A052, r13.A1z, bool, Boolean.valueOf(AnonymousClass796.A07(r13.A1Z, A09(r13), AnonymousClass05K.A06)), num3, num2, str2, A0H2, hashMap);
    }

    public static void A0Q(C329067Hl r2) {
        AnonymousClass37D A012 = AnonymousClass7ON.A01(r2.A1R, r2.A1Z);
        if (A012 != null && ((AnonymousClass37F) A012).A0g && (A012.A09() instanceof C74332Pt8)) {
            C74332Pt8 A092 = A012.A09();
            AnonymousClass7L0 r0 = r2.A0U;
            if (r0 != null) {
                A092.ADi(r0);
            }
        }
    }

    public static void A0S(C329067Hl r2) {
        ViewGroup viewGroup;
        C329857Km r1 = r2.A0L;
        if (r1 != null && r2.A0U != null && (viewGroup = r1.A00) != null && viewGroup.getVisibility() == 0) {
            r1.A01();
            A0e(r2, 0);
            r2.A1B = true;
        }
    }

    public static void A0T(C329067Hl r1) {
        C329867Kn r12 = r1.A0h;
        if (r12 != null) {
            r12.A05 = false;
            C329867Kn.A02(r12, false);
        }
    }

    public static void A0U(C329067Hl r5) {
        C329797Kg r0;
        2FW r3;
        if (((C74493Pvn) r5.A0u.A0V.getValue()).isRecording()) {
            2Er r02 = r5.A0W;
            if ((r02 == null || !r02.CVr()) && (r0 = r5.A0c) != null && r0.A09 != null && ((Boolean) r5.A0Z.A0I.getValue()).booleanValue()) {
                C254783t2 r1 = r5.A1z;
                0qQ.A0B(r1, 0);
                boolean z = r1 instanceof AnonymousClass9HR;
                AnonymousClass7IK r4 = r5.A1l;
                C254933tI A042 = A04(r5);
                if (A042 != null) {
                    r3 = A042.A0F;
                } else {
                    r3 = null;
                }
                if (!z) {
                    boolean z2 = r5.A0y;
                    AnonymousClass0eK r03 = r5.A23;
                    r03.getClass();
                    if (r4.A03(r3, new C329607Jn(r03), z2, A0u(r5))) {
                        return;
                    }
                } else if (00k.A0u(AnonymousClass7IK.A08, r3)) {
                    if (182.A06(0Tu.A05, r4.A00, 36318187620538331L)) {
                        return;
                    }
                }
            }
            r5.A0u.A0D();
        }
    }

    public static void A0V(C329067Hl r2) {
        View findViewById;
        C329907Kr r1 = (C329907Kr) r2.A0d.A0H.getValue();
        r2.A0Q = r1;
        2Er r0 = r2.A0W;
        if (r0 != null && r0.BHS() != 0 && r1 != null && (findViewById = r1.A04.findViewById(R.id.nux_banner)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public static void A0W(C329067Hl r2) {
        C329897Kq r1 = r2.A0a;
        if (r1 != null && ((View) r1.A07.getValue()).getVisibility() == 0) {
            r2.A1B = true;
            ((View) r1.A07.getValue()).setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r2 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        if (r1 != false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c8, code lost:
        if (r9 == X.2FW.A1v) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d2, code lost:
        if (r9 == X.2FW.A20) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00dc, code lost:
        if (r9 == X.2FW.A1p) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e6, code lost:
        if (r9 == X.2FW.A1r) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r0 != null) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0X(X.C329067Hl r10) {
        /*
            X.7Kn r5 = r10.A0h
            if (r5 == 0) goto L_0x00a1
            com.instagram.common.session.UserSession r4 = r5.A0C
            X.2Dm r2 = X.1bJ.A00(r4)
            X.3t1 r0 = r5.A0F
            X.3sy r1 = X.AnonymousClass6W3.A06(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey"
            X.0qQ.A0C(r1, r0)
            com.instagram.model.direct.DirectThreadKey r1 = (com.instagram.model.direct.DirectThreadKey) r1
            X.3su r6 = r2.BLN(r1)
            r3 = 0
            if (r6 == 0) goto L_0x010d
            java.lang.String r1 = r4.A06
            java.lang.String r0 = r6.BsI()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x010d
            X.2FW r9 = r6.A10
            X.2FW r0 = X.2FW.A1T
            if (r9 != r0) goto L_0x00a4
            X.7Q3 r0 = r6.A0O()
        L_0x0034:
            if (r0 == 0) goto L_0x007c
        L_0x0036:
            java.util.Set r1 = X.C329867Kn.A0M
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x0074
            X.0Tu r6 = X.0Tu.A05
            r1 = 36314880495651692(0x81043100010b6c, double:3.0290148815122316E-306)
            boolean r1 = X.182.A06(r6, r4, r1)
            if (r1 != 0) goto L_0x0068
            r1 = 36314880495782765(0x81043100030b6d, double:3.029014881595123E-306)
            boolean r1 = X.182.A06(r6, r4, r1)
            if (r1 != 0) goto L_0x0068
            r1 = 36314880495913838(0x81043100050b6e, double:3.029014881678014E-306)
            boolean r2 = X.182.A06(r6, r4, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            X.0qQ.A0A(r1)
            if (r2 == 0) goto L_0x0074
        L_0x0068:
            r1 = 36314880496241521(0x810431000a0b71, double:3.029014881885242E-306)
            boolean r1 = X.182.A06(r6, r4, r1)
            if (r1 != 0) goto L_0x0074
            r3 = 1
        L_0x0074:
            r5.A05 = r3
            java.lang.String r0 = r0.name()
            r5.A04 = r0
        L_0x007c:
            X.2Er r1 = r10.A0W
            if (r1 == 0) goto L_0x00a2
            com.instagram.common.session.UserSession r0 = r10.A1Z
            java.lang.String r0 = r1.Ayt(r0)
        L_0x0086:
            boolean r1 = r10.A1A
            if (r1 == 0) goto L_0x0094
            X.7Ij r0 = r10.A0b
            X.7Iv r0 = r0.A0Y
            java.lang.String r0 = r0.A00
            java.lang.String r0 = r0.trim()
        L_0x0094:
            if (r0 == 0) goto L_0x009d
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x009e
        L_0x009d:
            r0 = 1
        L_0x009e:
            A0l(r10, r0)
        L_0x00a1:
            return
        L_0x00a2:
            r0 = 0
            goto L_0x0086
        L_0x00a4:
            X.2FW r0 = X.2FW.A1y
            if (r9 != r0) goto L_0x00b9
            X.2FW r1 = r6.A0z
            X.2FW r0 = X.2FW.A1g
            if (r1 != r0) goto L_0x00b1
            X.7Q3 r0 = X.AnonymousClass7Q3.REPLY
            goto L_0x0036
        L_0x00b1:
            X.2FW r0 = X.2FW.A0m
            if (r1 != r0) goto L_0x00c1
            X.7Q3 r0 = X.AnonymousClass7Q3.EMOJI_REACTION
            goto L_0x0036
        L_0x00b9:
            X.2FW r0 = X.2FW.A1x
            if (r9 != r0) goto L_0x00c1
            X.7Q3 r0 = X.AnonymousClass7Q3.MENTION
            goto L_0x0036
        L_0x00c1:
            X.2FW r0 = X.2FW.A1D
            if (r9 == r0) goto L_0x00ca
            X.2FW r0 = X.2FW.A1v
            r8 = 0
            if (r9 != r0) goto L_0x00cb
        L_0x00ca:
            r8 = 1
        L_0x00cb:
            X.2FW r0 = X.2FW.A1e
            if (r9 == r0) goto L_0x00d4
            X.2FW r0 = X.2FW.A20
            r7 = 0
            if (r9 != r0) goto L_0x00d5
        L_0x00d4:
            r7 = 1
        L_0x00d5:
            X.2FW r0 = X.2FW.A0W
            if (r9 == r0) goto L_0x00de
            X.2FW r0 = X.2FW.A1p
            r2 = 0
            if (r9 != r0) goto L_0x00df
        L_0x00de:
            r2 = 1
        L_0x00df:
            X.2FW r0 = X.2FW.A0t
            if (r9 == r0) goto L_0x00e8
            X.2FW r1 = X.2FW.A1r
            r0 = 0
            if (r9 != r1) goto L_0x00e9
        L_0x00e8:
            r0 = 1
        L_0x00e9:
            if (r8 != 0) goto L_0x00f1
            if (r7 != 0) goto L_0x00f1
            if (r2 != 0) goto L_0x00f1
            if (r0 == 0) goto L_0x007c
        L_0x00f1:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314880495979375(0x81043100060b6f, double:3.0290148817194597E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0109
            r0 = 36314880496175984(0x81043100090b70, double:3.029014881843796E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x007c
        L_0x0109:
            X.2FW r0 = r6.A10
            goto L_0x0034
        L_0x010d:
            r5.A05 = r3
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A0X(X.7Hl):void");
    }

    public static void A0Y(C329067Hl r15) {
        C69270NiW niW;
        C329907Kr r2 = (C329907Kr) r15.A0d.A0H.getValue();
        r15.A0Q = r2;
        2Er r12 = r15.A0W;
        if (r12 != null) {
            UserSession userSession = r15.A1Z;
            AnonymousClass7L0 r11 = r15.A0U;
            N3L n3l = r15.A0v;
            0qQ.A0B(userSession, 0);
            Integer num = r2.A00;
            if (num == null) {
                C329907Kr.A00(userSession, r2, r12);
            } else {
                switch (num.intValue()) {
                    case 6:
                        C48826Eko.A00(r2.A04, r2.A07);
                        break;
                    case 7:
                        C48831Ekt.A00(r2.A04, userSession, r2.A07, r12, true);
                        break;
                    case 8:
                        C48830Eks.A00(r2.A04, r2.A07);
                        break;
                    case 11:
                        C3269378s.A00.A09(r2.A04, userSession, r2.A07, r11, r12);
                        break;
                    case 19:
                        0wc A012 = AnonymousClass0kN.A01(r2.A05, userSession);
                        0Aj A002 = A012.A00(A012.A00, "ig_creator_connections_events");
                        A002.AAJ("event", C66579MXk.A00(143));
                        A002.AAJ("target", "direct_thread_nux");
                        A002.A8M(EZb.DIRECT_THREAD, "screen");
                        A002.A8M(C271174i4.A00(userSession), "project");
                        A002.Cgf();
                        View view = r2.A04;
                        C314466iJ r3 = r2.A07;
                        View findViewById = view.findViewById(R.id.nux_banner);
                        if (findViewById != null && findViewById.getVisibility() == 0) {
                            F9V.A00(findViewById, userSession, r3, r12);
                            break;
                        }
                    case 22:
                        OPM.A00(r2.A04, r2.A05, userSession, r2.A07, n3l);
                        break;
                    case 24:
                        View view2 = r2.A04;
                        C314466iJ r32 = r2.A07;
                        View findViewById2 = view2.findViewById(R.id.nux_banner);
                        0qQ.A0A(findViewById2);
                        findViewById2.setVisibility(8);
                        r32.DUr();
                        break;
                    case 26:
                        C48828Ekq.A00(r2.A04, r2.A07);
                        break;
                }
                FragmentActivity fragmentActivity = r2.A02;
                0qQ.A0C(fragmentActivity, AnonymousClass000.A00(22));
                FragmentActivity fragmentActivity2 = fragmentActivity;
                C254793t3 A082 = C66647MaG.A08(r12.BJz());
                int C6a = r12.C6a();
                int AdN = r12.AdN();
                String AsX = r12.AsX();
                boolean A0K2 = 0qQ.A0K(r12.Amk(), true);
                0qQ.A0B(fragmentActivity2, 1);
                AnonymousClass4kA A003 = AnonymousClass4k9.A00(userSession);
                if (C6a == 29 && 0qQ.A0K(AsX, userSession.A06) && ((Number) A003.A06.CDM(A003, AnonymousClass4kA.A0c[30])).longValue() == 0 && 182.A06(0Tu.A05, userSession, 36319407399050628L)) {
                    if (A0K2) {
                        niW = C69270NiW.ENGAGEMENT_NUX;
                    } else {
                        niW = C69270NiW.ACTIVATION_NUX;
                    }
                    C69873Ntb.A00(fragmentActivity2, userSession, niW, A082, "thread_view", (String) null, AdN);
                    r2.A07.CLU();
                    r2.A00 = AnonymousClass05K.A04;
                }
            }
            OZO ozo = r15.A0s;
            if (ozo != null) {
                OZO.A00(ozo, true);
            }
        }
    }

    public static void A0a(C329067Hl r3) {
        1wn r2 = r3.A0C;
        if (r2 != null) {
            AnonymousClass1Nd.A00(r3.A1Z).A02(r2, AnonymousClass7O5.class);
        }
        1wn r22 = r3.A0D;
        if (r22 != null) {
            AnonymousClass1Nd.A00(r3.A1Z).A02(r22, C3268778m.class);
        }
    }

    public static void A0b(C329067Hl r4) {
        ImageView imageView;
        if (!r4.A1P && r4.A0q()) {
            C329307Ij r0 = r4.A0b;
            AnonymousClass7BE r1 = new AnonymousClass7BE(r4);
            AnonymousClass7J3 r3 = r0.A0X;
            View view = (View) r3.A07.getValue();
            if ((view instanceof ImageView) && (imageView = (ImageView) view) != null) {
                AnonymousClass0fU.A00(new AnonymousClass7BF(r1), imageView);
                if (AnonymousClass7J1.A00.A01(r3.A04)) {
                    imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.instagram_camera_pano_outline_24));
                } else {
                    AnonymousClass7BG.A02(imageView, R.drawable.direct_message_composer_thread_camera_icon, true);
                }
            }
            AnonymousClass7L0 r2 = r4.A0U;
            if (r2 != null) {
                r4.A0b.A04(r2, false);
            }
            r4.A1P = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (X.AnonymousClass48O.A07(java.lang.Integer.valueOf(A00(r5))) != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0c(X.C329067Hl r5) {
        /*
            X.0eK r0 = r5.A23
            java.lang.Object r4 = r0.get()
            X.7Kc r4 = (X.C329757Kc) r4
            X.2Er r0 = r5.A0W
            r3 = 0
            if (r0 == 0) goto L_0x004e
            com.instagram.common.session.UserSession r2 = r5.A1Z
            X.7LW r1 = X.AnonymousClass7LV.A00
            boolean r0 = r1.A02(r2, r0)
            if (r0 != 0) goto L_0x004e
            X.2Er r0 = r5.A0W
            boolean r0 = r1.A03(r2, r0)
            if (r0 != 0) goto L_0x004e
            com.instagram.model.direct.DirectThreadKey r0 = A09(r5)
            boolean r0 = r4.Cet(r2, r0)
            if (r0 != 0) goto L_0x0033
            com.instagram.model.direct.DirectThreadKey r0 = A09(r5)
            boolean r0 = r4.CX4(r2, r0)
            if (r0 == 0) goto L_0x004e
        L_0x0033:
            boolean r0 = A0s(r5)
            if (r0 == 0) goto L_0x003f
            boolean r0 = r5.A0o()
            if (r0 == 0) goto L_0x004e
        L_0x003f:
            int r0 = A00(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.AnonymousClass48O.A07(r0)
            r2 = 1
            if (r0 == 0) goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            boolean r0 = r5.A16
            if (r0 == r2) goto L_0x008e
            X.7Ij r0 = r5.A0b
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r0.A0M
            r0 = 8
            if (r2 == 0) goto L_0x005c
            r0 = 0
        L_0x005c:
            r1.setVisibility(r0)
            X.7JI r0 = r5.A0u
            android.view.View r1 = X.AnonymousClass7JI.A00(r0)
            r0 = 8
            if (r2 == 0) goto L_0x006a
            r0 = 0
        L_0x006a:
            r1.setVisibility(r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = r5.A0H
            if (r0 == 0) goto L_0x0078
            if (r2 != 0) goto L_0x0075
            r3 = 8
        L_0x0075:
            r0.setVisibility(r3)
        L_0x0078:
            r5.A16 = r2
            X.7Ij r0 = r5.A0b
            X.7J3 r0 = r0.A0X
            if (r2 == 0) goto L_0x008f
            r2 = 1
            android.view.View r1 = r0.A01
            android.view.ViewGroup r0 = r0.A02
            X.AnonymousClass7OT.A01(r1, r0, r2)
        L_0x0088:
            r5.A0J()
            r5.A1C()
        L_0x008e:
            return
        L_0x008f:
            android.view.ViewGroup r1 = r0.A02
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A0c(X.7Hl):void");
    }

    public static void A0d(C329067Hl r6, int i) {
        C69503Nml nml;
        String str = r6.A21;
        if (str != null && A0s(r6)) {
            if (str.startsWith("core_search") || str.startsWith("explore_search") || str.startsWith("ig_search")) {
                nml = C69503Nml.A09;
                String A0F2 = A0F(r6);
                boolean z = !r6.A28;
                0wc r0 = r6.A2D;
                0qQ.A0B(r0, 0);
                C48798EkM.A00(r0, new C73956Pma(nml, A0F2, i, z ? 1 : 0, 0));
            }
            if (str.startsWith("igd_universal_search")) {
                nml = C69503Nml.A0I;
            } else if (str.startsWith("inbox")) {
                nml = C69503Nml.A0H;
            }
            String A0F22 = A0F(r6);
            boolean z2 = !r6.A28;
            0wc r02 = r6.A2D;
            0qQ.A0B(r02, 0);
            C48798EkM.A00(r02, new C73956Pma(nml, A0F22, i, z2 ? 1 : 0, 0));
        }
        nml = C69503Nml.A0J;
        String A0F222 = A0F(r6);
        boolean z22 = !r6.A28;
        0wc r022 = r6.A2D;
        0qQ.A0B(r022, 0);
        C48798EkM.A00(r022, new C73956Pma(nml, A0F222, i, z22 ? 1 : 0, 0));
    }

    public static void A0e(C329067Hl r0, int i) {
        View view = r0.A05;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public static void A0f(C329067Hl r4, int i) {
        if (!182.A06(0Tu.A05, r4.A1Z, 36325394575537080L) || r4.A07.getVisibility() != i) {
            r4.A07.setVisibility(i);
            AnonymousClass7IX r1 = r4.A0P;
            if (r1 == null) {
                return;
            }
            if (i == 8) {
                r1.A00(0, 0, 0, false);
            } else {
                0nA.A0t(r4.A07, new C3268878n(r4));
            }
        }
    }

    public static void A0g(C329067Hl r1, int i) {
        AnonymousClass7OE r0;
        if (r1.A1L != null && (r0 = r1.A1K) != null) {
            r0.Eov(i);
            r1.A1L.invalidate();
        }
    }

    public static void A0j(C329067Hl r3, boolean z) {
        C329797Kg r2 = r3.A0c;
        if (r2 != null && r2.A02()) {
            ViewGroup viewGroup = r2.A03;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                viewGroup.setVisibility(8);
            }
            r2.A09 = null;
            r2.A07 = null;
            r3.A1C();
            A0e(r3, 0);
            r3.A1B = z;
            A0L(Editable.Factory.getInstance().newEditable(r3.A0b.A0Y.A00.trim()), r3);
            OZO ozo = r3.A0s;
            if (ozo != null && ozo.A02()) {
                O02.A00(ozo.A01, true, false);
            }
        }
    }

    public static void A0k(C329067Hl r5, boolean z) {
        int height;
        int i;
        View view;
        if (r5.A0P != null) {
            if (r5.A1U() || r5.A1G) {
                height = r5.A07.getHeight();
            } else {
                height = 0;
            }
            if (r5.A2A && r5.A04 == null) {
                r5.A04 = r5.A07.findViewById(R.id.direct_composer_ai_suggested_replies);
            }
            View view2 = r5.A04;
            if (view2 == null || view2.getVisibility() != 0) {
                i = 0;
            } else {
                i = r5.A04.getHeight();
            }
            C70824OMw oMw = r5.A0X;
            int i2 = 0;
            if (oMw != null) {
                C252063oV r1 = oMw.A08;
                if (r1.CVM() && r1.getView().getVisibility() == 0) {
                    C252063oV r12 = r5.A0X.A08;
                    if (r12.CVM() && (view = r12.getView()) != null) {
                        i2 = view.getHeight();
                    }
                }
            }
            r5.A0P.A00(height - i, i, i2, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r0.A02() == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r0.A00 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r2.findViewById(com.instagram.android.R.id.nux_banner).getVisibility() != 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        if (r0.getVisibility() != 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        if (r1 != 0) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0l(X.C329067Hl r14, boolean r15) {
        /*
            X.7L0 r6 = r14.A0U
            X.7Kn r5 = r14.A0h
            if (r5 == 0) goto L_0x01a5
            if (r6 == 0) goto L_0x01a5
            X.2Er r0 = r14.A0W
            if (r0 == 0) goto L_0x01a5
            boolean r0 = r0.isPending()
            if (r0 != 0) goto L_0x01a5
            X.7Kg r0 = r14.A0c
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.A02()
            r7 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r7 = 0
        L_0x001e:
            X.OWa r0 = r14.A0S
            if (r0 == 0) goto L_0x0027
            android.view.ViewGroup r0 = r0.A00
            r4 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            android.view.ViewGroup r2 = r14.A1V
            r1 = 2131437189(0x7f0b2685, float:1.849627E38)
            android.view.View r0 = r2.findViewById(r1)
            if (r0 == 0) goto L_0x003e
            android.view.View r0 = r2.findViewById(r1)
            int r0 = r0.getVisibility()
            r3 = 1
            if (r0 == 0) goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            X.7Kl r0 = r14.A0t
            if (r0 == 0) goto L_0x004e
            android.view.ViewGroup r0 = r0.A02
            if (r0 == 0) goto L_0x004e
            int r0 = r0.getVisibility()
            r2 = 1
            if (r0 == 0) goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            X.7Km r0 = r14.A0L
            if (r0 == 0) goto L_0x005e
            android.view.ViewGroup r0 = r0.A00
            if (r0 == 0) goto L_0x005e
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r7 != 0) goto L_0x01a5
            if (r4 != 0) goto L_0x01a5
            if (r3 != 0) goto L_0x01a5
            if (r2 != 0) goto L_0x01a5
            if (r0 != 0) goto L_0x01a5
            boolean r0 = r5.A05
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x01a2
            if (r15 == 0) goto L_0x01a2
            boolean r0 = r5.A03()
            if (r0 != 0) goto L_0x01a5
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x00f1
            r5.A07 = r3
            android.view.ViewStub r0 = r5.A0A
            android.view.View r7 = r0.inflate()
            r0 = 2131432293(0x7f0b1365, float:1.848634E38)
            android.view.View r0 = r7.requireViewById(r0)
            r5.A00 = r0
            r0 = 2131432296(0x7f0b1368, float:1.8486345E38)
            android.view.View r0 = r7.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A01 = r0
            java.lang.Integer r0 = r5.A0H
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x0148
            if (r0 != r3) goto L_0x0140
            r0 = 2131432328(0x7f0b1388, float:1.848641E38)
            android.view.View r9 = r7.requireViewById(r0)
            X.0qQ.A07(r9)
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            android.content.Context r10 = r5.A09
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            r8.<init>(r10, r4, r4)
            r1 = 22
            X.JGK r0 = new X.JGK
            r0.<init>(r5, r1)
            X.Mv7 r2 = new X.Mv7
            r2.<init>(r10, r0)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r9.setAdapter(r2)
            r9.setVisibility(r4)
            r9.setLayoutManager(r8)
            X.3V7 r0 = new X.3V7
            r0.<init>(r4, r1)
            r9.A11(r0)
        L_0x00db:
            int r2 = X.0nA.A09(r10)
            r7.measure(r4, r4)
            int r1 = r7.getMeasuredHeight()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r4, r2, r1)
            r7.setClipBounds(r0)
            X.C329867Kn.A00(r5)
        L_0x00f1:
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x011d
            X.7Q4 r8 = r5.A0E
            java.lang.String r7 = r5.A0I
            java.lang.String r2 = r5.A04
            if (r2 != 0) goto L_0x0107
            java.lang.String r1 = "lastMessageReelTypeForLogging"
        L_0x00ff:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0107:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r0 = "thread_id"
            r1.put(r0, r7)
            java.lang.String r0 = "message_type"
            r1.put(r0, r2)
            java.lang.String r0 = "emoji_tray_impression"
            X.AnonymousClass7Q4.A00(r8, r0, r1)
            r5.A08 = r3
        L_0x011d:
            android.view.View r0 = r5.A00
            java.lang.String r1 = "emojiContainerView"
            if (r0 == 0) goto L_0x00ff
            X.5nL r0 = X.C294975nL.A01(r0, r4)
            r0.A0G()
            X.5nL r2 = r0.A0F(r3)
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x00ff
            int r0 = r0.getMeasuredHeight()
            float r1 = (float) r0
            r0 = 0
            r2.A0T(r1, r0)
            r2.A04 = r4
            r2.A0H()
        L_0x0140:
            r14.A1B = r3
            int r0 = r6.A02
            A0e(r14, r0)
            return
        L_0x0148:
            r0 = 2131432327(0x7f0b1387, float:1.8486408E38)
            android.view.View r12 = r7.requireViewById(r0)
            X.0qQ.A07(r12)
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            android.content.Context r10 = r5.A09
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165222(0x7f070026, float:1.7944655E38)
            int r11 = r1.getDimensionPixelSize(r0)
            java.util.Set r0 = X.C329867Kn.A0L
            java.util.Iterator r13 = r0.iterator()
        L_0x0167:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00db
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            X.7fS r0 = X.C317486nL.A04
            com.instagram.common.session.UserSession r9 = r5.A0C
            X.6nL r8 = r0.A05(r9, r1)
            if (r8 == 0) goto L_0x0167
            java.util.Set r1 = r5.A0J
            java.lang.String r0 = r8.A01
            r1.add(r0)
            com.instagram.common.ui.base.IgFrameLayout r0 = X.C337077fe.A01(r10, r11, r4)
            r12.addView(r0)
            java.lang.Object r2 = r0.getTag()
            r0 = 148(0x94, float:2.07E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r2, r0)
            X.7fc r2 = (X.C337057fc) r2
            X.0iw r1 = r5.A0B
            X.7Q6 r0 = r5.A0G
            X.C337077fe.A02(r1, r9, r8, r0, r2)
            goto L_0x0167
        L_0x01a2:
            X.C329867Kn.A02(r5, r3)
        L_0x01a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A0l(X.7Hl, boolean):void");
    }

    public static void A0m(C329067Hl r5, boolean z, boolean z2) {
        ViewGroup viewGroup;
        C329847Kl r4 = r5.A0t;
        if (r4 != null && r5.A0U != null && (viewGroup = r4.A02) != null && viewGroup.getVisibility() == 0) {
            if (z2) {
                if (182.A06(0Tu.A05, r5.A1Z, 36314047272061310L)) {
                    return;
                }
            }
            ViewGroup viewGroup2 = r4.A02;
            if (viewGroup2 != null) {
                if (viewGroup2.getVisibility() == 0) {
                    ViewGroup viewGroup3 = r4.A02;
                    if (viewGroup3 != null) {
                        viewGroup3.setVisibility(8);
                    }
                }
                if (!z) {
                    A0e(r5, 0);
                }
                r5.A1B = true;
                return;
            }
            0qQ.A0F("rootView");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    private boolean A0n() {
        String Ayt;
        if (this.A1A) {
            return this.A0b.A0Y.A00.trim().isEmpty();
        }
        2Er r1 = this.A0W;
        if (r1 == null || (Ayt = r1.Ayt(this.A1Z)) == null || Ayt.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean A0q() {
        if (((((Boolean) this.A0Z.A0H.getValue()).booleanValue() || A00(this) == 29) && !A0s(this)) || A0r()) {
            return true;
        }
        return false;
    }

    public static boolean A0u(C329067Hl r1) {
        AnonymousClass2Es r0 = (AnonymousClass2Es) r1.A22.get();
        if (r0 == null || !C331057Pi.A02(r0.AiM())) {
            return false;
        }
        return true;
    }

    public static boolean A0v(C329067Hl r1) {
        2Er r0 = r1.A0W;
        if (r0 == null || r0.BZK() == null) {
            return false;
        }
        return r1.A0W.BZK().A1X();
    }

    public static boolean A0x(C329067Hl r1) {
        C329797Kg r0 = r1.A0c;
        if (r0 == null || !r0.A02()) {
            return false;
        }
        return true;
    }

    public static boolean A0z(C329067Hl r6) {
        C254783t2 r0 = r6.A1z;
        0qQ.A0B(r0, 0);
        if ((r0 instanceof AnonymousClass9HR) || AnonymousClass48O.A03(A00(r6))) {
            return false;
        }
        UserSession userSession = r6.A1Z;
        if (!((C329757Kc) r6.A23.get()).Cba(userSession)) {
            return false;
        }
        if (A0v(r6)) {
            0qQ.A0B(userSession, 0);
            if (!182.A06(0Tu.A05, userSession, 36323625050385744L)) {
                return false;
            }
        }
        if (!A0u(r6)) {
            return C395059z9.A00(userSession);
        }
        0qQ.A0B(userSession, 0);
        if (!C395059z9.A00(userSession) || !182.A06(0Tu.A05, userSession, 36323625049402691L)) {
            return false;
        }
        return true;
    }

    public static boolean A10(C329067Hl r1) {
        2Er r0 = r1.A0W;
        if (r0 == null || !r0.CVr()) {
            return ((Boolean) r1.A0Z.A0E.getValue()).booleanValue();
        }
        return false;
    }

    public static boolean A11(C329067Hl r2) {
        if (!r2.A2U || A00(r2) == 29 || A0s(r2) || AnonymousClass48O.A07(Integer.valueOf(A00(r2)))) {
            return false;
        }
        return true;
    }

    public static boolean A12(C329067Hl r3) {
        if (r3.A1x.A00(AnonymousClass6W3.A05(r3.A1z), 52) && !A0s(r3)) {
            if (!182.A06(0Tu.A05, r3.A1Z, 36323513379859671L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A13(C329067Hl r19, C67555Mpp mpp, C74347PtN ptN) {
        C67555Mpp mpp2;
        Set A012;
        Set set;
        String str;
        Boolean valueOf;
        Long l;
        Long l2;
        long j;
        long j2;
        Set A013;
        C329067Hl r6 = r19;
        if (r6.A1S()) {
            return false;
        }
        C254783t2 r0 = r6.A1z;
        0qQ.A0B(r0, 0);
        if (r0 instanceof AnonymousClass9HR) {
            return false;
        }
        C332347Up A002 = C332337Uo.A00(r6.A1Z);
        if (!A002.A01()) {
            return false;
        }
        C67559Mpt mpt = C67559Mpt.CANONICAL_THREAD_VIEW;
        String A0E2 = A0E(r6);
        if (!A002.A01()) {
            return false;
        }
        C332357Uq r12 = A002.A01;
        C332377Us r2 = r12.A01;
        synchronized (r2) {
            mpp2 = mpp;
            A012 = C332377Us.A01(r2, mpp2, C332377Us.A00(r2, mpt, (Set) r2.A05.getValue()));
        }
        Set A003 = C332357Uq.A00(r12, A012);
        if (A0E2 != null) {
            synchronized (r2) {
                0sl r02 = (Set) ((Map) r2.A08.getValue()).get(A0E2);
                if (r02 == null) {
                    r02 = 0sl.A00;
                }
                A013 = C332377Us.A01(r2, mpp2, C332377Us.A00(r2, mpt, r02));
            }
            set = C332357Uq.A00(r12, A013);
        } else {
            set = 0sl.A00;
        }
        Iterator it = 094.A00(set, A003).iterator();
        Object obj = null;
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int i = ((AnonymousClass9VE) obj).A00;
                do {
                    Object next = it.next();
                    int i2 = ((AnonymousClass9VE) next).A00;
                    if (i < i2) {
                        obj = next;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        }
        AnonymousClass9VE r11 = (AnonymousClass9VE) obj;
        if (r11 == null) {
            return false;
        }
        String str2 = r11.A06;
        BB6 bb6 = r11.A02;
        if (bb6 != null) {
            str = bb6.A00;
        } else {
            str = null;
        }
        if (!"MINOR_TO_ADULT_MEDIA_SHARE_EDUCATION".equalsIgnoreCase(str2) && !"MINOR_TO_HIGH_RISK_ADULT_MEDIA_SHARE_EDUCATION".equalsIgnoreCase(str2)) {
            return false;
        }
        UserSession userSession = r12.A00;
        AnonymousClass9VH r03 = r11.A01;
        int i3 = r03.A00;
        int A062 = (int) C229632nm.A06(AnonymousClass30M.A06(AnonymousClass30J.SECONDS, r03.A02), -2147483648L, 2147483647L);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str2, 3);
        String obj2 = AnonymousClass0HM.A00().toString();
        0qQ.A07(obj2);
        Context context = r6.A1R;
        0qQ.A0B(context, 0);
        0Tu r8 = 0Tu.A06;
        if (182.A06(r8, userSession, 36317182598189895L)) {
            valueOf = Boolean.valueOf(182.A06(0Tu.A05, userSession, 36317182598124358L));
        } else {
            valueOf = Boolean.valueOf(182.A06(r8, userSession, 36317182598124358L));
        }
        0qQ.A0A(valueOf);
        C74347PtN ptN2 = ptN;
        if (valueOf.booleanValue()) {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj3 = C332367Ur.A00(userSession).A03.get(str2);
            if (obj3 == null) {
                obj3 = null;
            }
            A6J a6j = (A6J) obj3;
            0wc A022 = AnonymousClass0kN.A02(userSession);
            0Aj A004 = A022.A00(A022.A00, "mwb_ts_education_intervention_triggered");
            if (A004.isSampled()) {
                A004.AAJ(C66579MXk.A00(943), obj2);
                Long l3 = null;
                if (A0E2 != null) {
                    l = 00y.A0n(10, A0E2);
                } else {
                    l = null;
                }
                A004.A9F("other_userid", l);
                A004.AAJ("intervention_type", str2);
                A004.AAJ("trigger_action_type", mpp2.A00);
                A004.AAJ("trigger_action_location", "CANONICAL_THREAD_VIEW");
                A004.A9F("trigger_event_timestamp", Long.valueOf(currentTimeMillis));
                if (a6j != null) {
                    C381629c4 r04 = a6j.A00;
                    if (r04 != null) {
                        j2 = r04.A00;
                    } else {
                        j2 = 0;
                    }
                    l2 = Long.valueOf(j2);
                } else {
                    l2 = null;
                }
                A004.A9F("last_impression_timestamp", l2);
                if (a6j != null) {
                    C381629c4 r05 = a6j.A00;
                    if (r05 != null) {
                        j = r05.A01;
                    } else {
                        j = 0;
                    }
                    l3 = Long.valueOf(j);
                }
                A004.A9F("total_num_impressions", l3);
                A004.A9F("max_num_impressions_allowed", Long.valueOf((long) i3));
                A004.A9F("impression_candence_sec", Long.valueOf((long) A062));
                A004.Cgf();
            }
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
            igBloksScreenConfig.A0R = "com.bloks.www.safety_intervention.media_share.bottom_sheet";
            C49618Ezb ezb = new C49618Ezb(context);
            Map map = ezb.A03;
            map.put("intervetion_type", str2);
            map.put("flow_context", str);
            map.put("action_type", mpp2.A00);
            map.put("location", mpt.A00);
            map.put(C66955Mfo.A00(), obj2);
            Q3B q3b = new Q3B(new DII(ezb, new C73914Plp(ptN2, 20)));
            Map map2 = ezb.A02;
            map2.put("onShareActionClick", q3b);
            map2.put("onDontShareActionClick", new Q3B(new DIH(ezb, new C73914Plp(ptN2, 21))));
            C46649DiU A063 = C46649DiU.A06("com.bloks.www.safety_intervention.media_share.bottom_sheet", C359608dC.A01(map), map2);
            A063.A00 = -1;
            A063.A05 = null;
            A063.A01 = 0;
            A063.A06 = null;
            A063.A03 = null;
            A063.A02 = null;
            A063.A04 = null;
            A063.A0H(ezb.A01);
            A063.A0E(ezb.A00, igBloksScreenConfig);
            C332377Us A005 = C332367Ur.A00(userSession);
            1Eo.A05(19B.A00, new MFo(A005, str2, A0E2, (AnonymousClass4D7) null), A005.A04);
            return true;
        }
        ptN2.DG7(AnonymousClass05K.A00);
        return true;
    }

    public final C60340gF A14(Activity activity, C56087Hsa hsa) {
        C69503Nml nml;
        PS2 ps2 = new PS2(this);
        UserSession userSession = this.A1Z;
        if (!C331227Qb.A02(userSession)) {
            Activity activity2 = activity;
            if (182.A06(0Tu.A05, userSession, 36329367420420166L)) {
                AnonymousClass9B9.A00().A02(activity, userSession, C69503Nml.A05.toString(), new C73507Pdo(this, hsa, ps2));
            } else {
                if (hsa.A00 == AnonymousClass05K.A00) {
                    nml = C69503Nml.A05;
                } else {
                    nml = C69503Nml.A06;
                }
                AnonymousClass9B9.A00().A01(activity2, nml, userSession, (AnonymousClass7JY) null, false, true);
            }
        } else {
            A1P(hsa, ps2);
        }
        return C60340gF.A00;
    }

    public final void A15() {
        C70797OLs oLs = this.A0g;
        if (oLs != null) {
            if (oLs.A00()) {
                ((View) oLs.A07.getValue()).setVisibility(8);
                oLs.A02 = null;
                oLs.A03 = null;
                OBY oby = oLs.A01;
                if (oby != null) {
                    AnonymousClass77W r3 = oby.A01;
                    r3.A01 = false;
                    C249403jg r1 = r3.A00;
                    0qQ.A0C(r1, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.OnScrollListener");
                    ((RecyclerView) r3.A03.getValue()).A16(r1);
                    ArrayList arrayList = r3.A02;
                    Iterator it = arrayList.iterator();
                    0qQ.A07(it);
                    while (it.hasNext()) {
                        C70740OJl oJl = (C70740OJl) it.next();
                        if (oJl != null) {
                            oJl.A00();
                        }
                    }
                    arrayList.clear();
                    ((AnonymousClass7WY) r3.A05.invoke()).A01(1.0f);
                }
            }
            C329307Ij r4 = this.A0b;
            r4.A0Y.A00 = "";
            r4.A0S.post(new PZG((OED) null, r4));
            A1C();
            A0e(this, 0);
            A02(this).setVisibility(8);
            this.A1B = true;
            AnonymousClass7H1 r12 = this.A1w;
            if (r12 instanceof AnonymousClass7H0) {
                AnonymousClass7H0 r13 = (AnonymousClass7H0) r12;
                r13.A06 = false;
                AnonymousClass7H0.A00(r13);
            }
        }
        C249453jo r14 = this.A2C;
        if (r14.AYJ() != null) {
            r14.AYJ().A0P.setAlpha(1.0f);
        }
    }

    public final void A16() {
        0nA.A0N(this.A0b.A0S);
    }

    public final void A17() {
        C329857Km r4 = (C329857Km) this.A0d.A0J.getValue();
        this.A0L = r4;
        2Er r1 = this.A0W;
        if (r4 != null && this.A1A && this.A0U != null && r1 != null && !r1.isPending()) {
            if (!A0n()) {
                String trim = this.A0b.A0Y.A00.trim();
                0qQ.A0B(trim, 0);
                if (r4.A00 == null) {
                    ViewStub viewStub = r4.A04;
                    viewStub.setLayoutResource(R.layout.contact_share_container);
                    View inflate = viewStub.inflate();
                    0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                    r4.A00 = (ViewGroup) inflate;
                }
                if (r4.A01 != null && r4.A02 != null && C329857Km.A00(r4, trim) && !r4.A03) {
                    if (182.A06(0Tu.A05, r4.A06, 36322662976334170L)) {
                        ViewGroup viewGroup = r4.A00;
                        if (viewGroup != null) {
                            if (viewGroup.getVisibility() == 8) {
                                ViewGroup viewGroup2 = r4.A00;
                                if (viewGroup2 != null) {
                                    ((TextView) viewGroup2.findViewById(R.id.contact_share_business_name_label)).setText(r4.A08);
                                    ViewGroup viewGroup3 = r4.A00;
                                    if (viewGroup3 != null) {
                                        ((TextView) viewGroup3.findViewById(R.id.contact_share_number_label)).setText(r4.A02);
                                        ViewGroup viewGroup4 = r4.A00;
                                        if (viewGroup4 != null) {
                                            AnonymousClass0fU.A00(new C39968AMa(r4), viewGroup4.findViewById(R.id.dismiss_button));
                                            ImageUrl imageUrl = r4.A07;
                                            if (imageUrl != null) {
                                                ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(imageUrl);
                                                ViewGroup viewGroup5 = r4.A00;
                                                if (viewGroup5 != null) {
                                                    viewGroup5.findViewById(R.id.profile_image_view).setUrl(extendedImageUrl, r4.A05);
                                                }
                                            }
                                            ViewGroup viewGroup6 = r4.A00;
                                            if (viewGroup6 != null) {
                                                C294975nL A012 = C294975nL.A01(viewGroup6, 0);
                                                A012.A0G();
                                                C294975nL A0A2 = A012.A0A();
                                                ViewGroup viewGroup7 = r4.A00;
                                                if (viewGroup7 != null) {
                                                    A0A2.A0T((float) viewGroup7.getMeasuredHeight(), 0.0f);
                                                    A0A2.A04 = 0;
                                                    A0A2.A0H();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        0qQ.A0F("rootView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                if (C329857Km.A00(r4, trim) || !r4.A03) {
                    r4.A01();
                } else {
                    r4.A03 = false;
                }
            } else {
                this.A2J.A00();
            }
        }
    }

    public final void A18() {
        C329107Hp r8;
        String str;
        SettableFuture settableFuture;
        SmartSuggestion Bwx;
        C255273tr r1;
        C329847Kl r3 = (C329847Kl) this.A0d.A0P.getValue();
        this.A0t = r3;
        2Er r6 = this.A0W;
        if (r3 != null && this.A1A && this.A0U != null && r6 != null && !r6.isPending()) {
            if (A0n()) {
                Bundle bundle = this.A1i.A00.A0r;
                if (bundle.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_LOCAL_SMART_SUGGESTION") != null) {
                    Bwx = (SmartSuggestion) bundle.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_LOCAL_SMART_SUGGESTION");
                } else {
                    AnonymousClass4kA A002 = AnonymousClass4k9.A00(this.A1Z);
                    if (((Boolean) A002.A0T.CDM(A002, AnonymousClass4kA.A0c[8])).booleanValue()) {
                        Bwx = r6.Bwx();
                    }
                    r8 = this.A2J;
                }
                if (Bwx != null) {
                    String str2 = Bwx.A04;
                    Integer num = Bwx.A03;
                    Integer num2 = AnonymousClass05K.A01;
                    if (num == num2 && (r1 = Bwx.A02) != C255273tr.A09 && str2 != null && str2.length() != 0 && !r3.A0F && r1 == C255273tr.A07) {
                        UserSession userSession = r3.A0K;
                        if (182.A06(0Tu.A05, userSession, 36315215503101029L)) {
                            C329847Kl.A01(r3, Bwx.A02, "smart_suggestion");
                            r8 = r3.A0L;
                            str = "suggestedReplyLogger";
                            if (!r8.A02(false)) {
                                OWQ owq = r3.A09;
                                if (owq != null) {
                                    owq.A01(Bwx.A02, "smart_suggestion");
                                }
                            } else {
                                Context context = r3.A0J;
                                C255273tr r13 = Bwx.A02;
                                String str3 = Bwx.A06;
                                0qQ.A0B(r13, 2);
                                List singletonList = Collections.singletonList(C71058Oab.A00(context, userSession, r13, num2, "", "smart_suggestion", str2, str3));
                                0qQ.A07(singletonList);
                                C329847Kl.A02(r3, singletonList, new AnonymousClass9M5(11, r3, Bwx));
                                r8.A01();
                                r3.A08 = Bwx;
                                if (!r3.A0E) {
                                    OWQ owq2 = r3.A09;
                                    if (owq2 != null) {
                                        owq2.A03(Bwx.A02, "smart_suggestion", r3.A0D, 1);
                                        C3725591j r4 = r3.A07;
                                        if (r4 == null) {
                                            str = "smartSuggestionLogger";
                                        } else {
                                            r4.A02(userSession.A06, (String) 00k.A0O(r3.A0N, 0), Bwx.A05);
                                            r3.A0E = true;
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
                r8 = r3.A0L;
            } else {
                UserSession userSession2 = this.A1Z;
                AnonymousClass4kA A003 = AnonymousClass4k9.A00(userSession2);
                if (((Boolean) A003.A0T.CDM(A003, AnonymousClass4kA.A0c[8])).booleanValue()) {
                    0qQ.A0B(userSession2, 0);
                    if (182.A06(0Tu.A06, userSession2, 36316194755907674L)) {
                        String trim = this.A0b.A0Y.A00.trim();
                        0qQ.A0B(trim, 0);
                        if (!r3.A0F) {
                            C329847Kl.A01(r3, C255273tr.A07, "sayt");
                            OVJ ovj = r3.A05;
                            String str4 = null;
                            if (ovj == null) {
                                str = "previousReplyManager";
                                0qQ.A0F(str);
                                throw AnonymousClass00P.createAndThrow();
                            }
                            C71062Oah oah = ovj.A00;
                            synchronized (oah) {
                                C70549OAx oAx = new C70549OAx(trim);
                                oah.A04.add(oAx);
                                C71062Oah.A01(oah);
                                settableFuture = oAx.A00;
                            }
                            OGH ogh = r3.A0A;
                            if (ogh != null) {
                                str4 = ogh.A03;
                            }
                            if (!trim.equals(str4)) {
                                C255183ti.A04(new C71819OrM(r3, trim), settableFuture, 1Lf.A01);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                if (AnonymousClass4k9.A00(userSession2).A08()) {
                    String trim2 = this.A0b.A0Y.A00.trim();
                    0qQ.A0B(trim2, 0);
                    if (!r3.A0F) {
                        UserSession userSession3 = r3.A0K;
                        if (AnonymousClass7OG.A00(userSession3)) {
                            C255273tr r7 = C255273tr.A08;
                            C329847Kl.A01(r3, r7, "sayt");
                            OGH ogh2 = r3.A0A;
                            String str5 = null;
                            if (ogh2 != null) {
                                str5 = ogh2.A03;
                            }
                            if (!trim2.equals(str5)) {
                                C66777McN mcN = r3.A03;
                                if (mcN == null) {
                                    str = "quickReplyManager";
                                } else {
                                    ArrayList A032 = mcN.A03(trim2);
                                    if (!A032.isEmpty()) {
                                        OWQ owq3 = r3.A09;
                                        str = "suggestedReplyLogger";
                                        if (owq3 != null) {
                                            owq3.A02(r7, r3.A0D, trim2.length());
                                            C329107Hp r42 = r3.A0L;
                                            if (!r42.A02(true)) {
                                                OWQ owq4 = r3.A09;
                                                if (owq4 != null) {
                                                    owq4.A01(r7, "sayt");
                                                    r42.A00();
                                                    return;
                                                }
                                            } else {
                                                OWQ owq5 = r3.A09;
                                                if (owq5 != null) {
                                                    owq5.A03(r7, "sayt", r3.A0D, A032.size());
                                                    C329847Kl.A02(r3, C71058Oab.A01(r3.A0J, userSession3, trim2, A032), new C73933PmD(r3, 21));
                                                    r42.A01();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                0qQ.A0F(str);
                                throw AnonymousClass00P.createAndThrow();
                            }
                            return;
                        }
                    }
                    r8 = r3.A0L;
                }
                r8 = this.A2J;
            }
            r8.A00();
        }
    }

    public final void A19() {
        if (this.A1Q) {
            this.A1Q = false;
            if (!this.A18) {
                A16();
            }
            this.A0b.A0R.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            this.A07.removeOnLayoutChangeListener(this.A2B);
            AnonymousClass7JI r1 = this.A0u;
            if (((C74493Pvn) r1.A0V.getValue()).isRecording()) {
                r1.A0D();
            }
            r1.A0E = AnonymousClass05K.A0j;
            C331697Sa r12 = this.A1i;
            String trim = this.A0b.A0Y.A00.trim();
            0qQ.A0B(trim, 0);
            AnonymousClass9H7 r5 = r12.A00;
            if (AnonymousClass9H7.A07(r5) != null) {
                String string = r5.A0r.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_PREFILL_TEXT");
                if (string == null || string.length() == 0) {
                    AnonymousClass7TI A012 = AnonymousClass9H7.A01(r5);
                    C333517Zg r0 = A012.A08;
                    if (r0 != null) {
                        if (r0.C6l().CdE()) {
                            C333517Zg r02 = A012.A08;
                            if (r02 != null) {
                                C254743sy B8S = r02.C6l().B8S();
                                1a8 r2 = A012.A0b;
                                C333517Zg r03 = A012.A08;
                                if (r03 != null) {
                                    AnonymousClass7ZA C62 = r03.C62();
                                    0qQ.A0A(B8S);
                                    r2.A02(C62.EJz(B8S, trim, A012.A0F, false), PTC.A00);
                                }
                            }
                        }
                    }
                    0qQ.A0F("clientInfra");
                    throw AnonymousClass00P.createAndThrow();
                }
                if (r5.A13.A00(C376179Gx.SORT_BY_DRAFT_TIMESTAMP) && (r5.A0b instanceof DirectThreadKey)) {
                    2Dr A002 = 2L2.A00(r5.A10);
                    DirectThreadKey A032 = C66647MaG.A03(r5.A0b);
                    2Dr r22 = A002;
                    synchronized (r22) {
                        0qQ.A0B(A032, 0);
                        AnonymousClass48S A0P2 = r22.A0P(A032);
                        if (A0P2 != null) {
                            synchronized (A0P2) {
                                A0P2.A0Q();
                            }
                            2Dr.A0F(r22, A0P2);
                        }
                    }
                }
            }
            DirectStickerSuggestionsController directStickerSuggestionsController = this.A0K;
            if (directStickerSuggestionsController != null && !DirectStickerSuggestionsController.A02(directStickerSuggestionsController)) {
                if (19E.A07(directStickerSuggestionsController.A07)) {
                    19E.A05((CancellationException) null, directStickerSuggestionsController.A07);
                    directStickerSuggestionsController.A07 = 19E.A02(AnonymousClass12T.A00.AOJ(891758784, 3));
                }
                OL5 ol5 = directStickerSuggestionsController.A02;
                if (ol5 != null) {
                    ol5.A00();
                }
            }
        }
    }

    public final void A1B() {
        A0f(this, 8);
        if (!this.A18) {
            0nA.A0N(this.A07);
        }
        A0V(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e0, code lost:
        if (r7 == 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1.A00() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1C() {
        /*
            r26 = this;
            r0 = r26
            boolean r1 = r0.A0z
            if (r1 == 0) goto L_0x0084
            X.OLs r1 = r0.A0g
            if (r1 == 0) goto L_0x0011
            boolean r1 = r1.A00()
            r11 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r11 = 0
        L_0x0012:
            boolean r9 = A0x(r0)
            X.7Ij r1 = r0.A0b
            X.7Iv r1 = r1.A0Y
            java.lang.String r1 = r1.A00
            java.lang.String r1 = r1.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r10 = r1 ^ 1
            X.7Jr r3 = r0.A0e
            if (r3 == 0) goto L_0x0084
            X.7Rr r13 = r0.A0Z
            X.3tI r1 = A04(r0)
            if (r1 == 0) goto L_0x00e4
            X.2FW r14 = r1.A0F
        L_0x0034:
            X.7Ij r1 = r0.A0b
            boolean r19 = r1.A07()
            X.7Ij r1 = r0.A0b
            X.7Iv r1 = r1.A0Y
            java.lang.String r1 = r1.A00
            java.lang.String r2 = r1.trim()
            r1 = 0
            X.0qQ.A0B(r13, r1)
            r1 = 6
            X.0qQ.A0B(r2, r1)
            java.util.List r4 = r3.A0H
            boolean r1 = r4 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0087
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x0087
        L_0x0058:
            r16 = 1
        L_0x005a:
            X.7Jt r1 = r3.A0B
            r17 = r11
            r18 = r10
            r14 = r1
            r15 = r2
            r14.Cnn(r15, r16, r17, r18, r19)
            X.7Jr r5 = r0.A0e
            X.7Rr r6 = r0.A0Z
            X.3tI r1 = A04(r0)
            if (r1 == 0) goto L_0x0085
            X.2FW r7 = r1.A0F
        L_0x0071:
            X.7Ij r1 = r0.A0b
            boolean r12 = r1.A07()
            X.7Ij r0 = r0.A0b
            X.7Iv r0 = r0.A0Y
            java.lang.String r0 = r0.A00
            java.lang.String r8 = r0.trim()
            r5.A00(r6, r7, r8, r9, r10, r11, r12)
        L_0x0084:
            return
        L_0x0085:
            r7 = 0
            goto L_0x0071
        L_0x0087:
            java.util.Iterator r8 = r4.iterator()
            r7 = 0
        L_0x008c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00de
            java.lang.Object r12 = r8.next()
            X.7Jt r12 = (X.C329667Jt) r12
            X.3t2 r15 = r3.A0G
            X.0sa r1 = r3.A0K
            java.lang.Object r6 = r1.invoke()
            X.2Er r6 = (X.2Er) r6
            r18 = 0
            if (r6 == 0) goto L_0x00b8
            X.7LW r5 = X.AnonymousClass7LV.A00
            com.instagram.common.session.UserSession r4 = r3.A02
            boolean r1 = r5.A02(r4, r6)
            if (r1 != 0) goto L_0x00b6
            boolean r1 = r5.A03(r4, r6)
            if (r1 == 0) goto L_0x00b8
        L_0x00b6:
            r18 = 1
        L_0x00b8:
            X.0sa r1 = r3.A0I
            r17 = r9
            r16 = r1
            boolean r22 = r12.A03(r13, r14, r15, r16, r17, r18)
            r20 = r12
            r21 = r2
            r23 = r11
            r24 = r10
            r25 = r19
            boolean r1 = r20.Cnn(r21, r22, r23, r24, r25)
            if (r1 == 0) goto L_0x008c
            int r7 = r7 + 1
            if (r7 >= 0) goto L_0x008c
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00de:
            r16 = 0
            if (r7 != 0) goto L_0x005a
            goto L_0x0058
        L_0x00e4:
            r14 = 0
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A1C():void");
    }

    public final void A1D() {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A0b.A0S;
        composerAutoCompleteTextView.requestFocus();
        if (composerAutoCompleteTextView.isLaidOut()) {
            0nA.A0Q(composerAutoCompleteTextView);
        } else {
            0nA.A0R(composerAutoCompleteTextView);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        if (r1 != null) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1E() {
        /*
            r8 = this;
            X.7Kf r0 = r8.A0d
            X.0eM r0 = r0.A0I
            java.lang.Object r6 = r0.getValue()
            X.7Kk r6 = (X.C329837Kk) r6
            r8.A1M = r6
            if (r6 == 0) goto L_0x00da
            boolean r0 = r8.A1A
            if (r0 == 0) goto L_0x00da
            X.2Er r1 = r8.A0W
            if (r1 == 0) goto L_0x001b
            com.instagram.common.session.UserSession r0 = r8.A1Z
            r1.Ayt(r0)
        L_0x001b:
            X.0eK r0 = r8.A22
            java.lang.Object r0 = r0.get()
            X.2Ep r0 = (X.AnonymousClass2Ep) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            r5 = 1
            X.P0j r7 = r6.A03
            r7.A00 = r0
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0082
            java.util.List r0 = r6.A05
            java.util.Iterator r2 = r0.iterator()
        L_0x0036:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r1 = r2.next()
            X.OZg r1 = (X.C71029OZg) r1
            X.OZg r0 = r6.A00
            if (r0 != 0) goto L_0x0050
            java.lang.String r2 = "currentTray"
        L_0x0048:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0050:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00f2
            boolean r0 = r1.A02(r7)
            if (r0 == 0) goto L_0x0036
        L_0x005c:
            r6.A01 = r4
            android.widget.FrameLayout r1 = r6.A02
            X.5nL r0 = X.C294975nL.A01(r1, r4)
            r0.A0G()
            X.5nL r2 = r0.A0F(r5)
            int r0 = r1.getMeasuredHeight()
            float r1 = (float) r0
            r0 = 0
            r2.A0T(r0, r1)
            r0 = 8
            r2.A03 = r0
            X.PQ9 r0 = new X.PQ9
            r0.<init>(r6)
            r2.A05 = r0
            r2.A0H()
        L_0x0082:
            java.util.List r0 = r6.A05
            java.util.Iterator r1 = r0.iterator()
        L_0x0088:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r3 = r1.next()
            X.OZg r3 = (X.C71029OZg) r3
            boolean r0 = r3.A02(r7)
            if (r0 == 0) goto L_0x0088
            r6.A00 = r3
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x00db
            android.view.View r1 = r3.A00
            if (r1 == 0) goto L_0x010a
        L_0x00a4:
            r3.A01(r1, r7)
            r6.A01 = r5
            android.widget.FrameLayout r3 = r6.A02
            r3.addView(r1)
            r3.measure(r4, r4)
            X.7Hr r0 = r6.A04
            X.7Hl r1 = r0.A00
            r1.A1B = r5
            X.7L0 r0 = r1.A0U
            r0.getClass()
            int r0 = r0.A02
            A0e(r1, r0)
            X.5nL r0 = X.C294975nL.A01(r3, r4)
            r0.A0G()
            X.5nL r2 = r0.A0F(r5)
            int r0 = r3.getMeasuredHeight()
            float r1 = (float) r0
            r0 = 0
            r2.A0T(r1, r0)
            r2.A04 = r4
            r2.A0H()
        L_0x00da:
            return
        L_0x00db:
            android.view.LayoutInflater r2 = r3.A06
            r1 = 2131624988(0x7f0e041c, float:1.8877171E38)
            r0 = 0
            android.view.View r1 = r2.inflate(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            r3.A04 = r5
            X.0qQ.A0B(r1, r4)
            r3.A00 = r1
            goto L_0x00a4
        L_0x00f2:
            X.OZg r0 = r6.A00
            java.lang.String r2 = "currentTray"
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.A02(r7)
            if (r0 == 0) goto L_0x005c
            X.OZg r1 = r6.A00
            if (r1 == 0) goto L_0x0048
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x010a
            r1.A01(r0, r7)
            return
        L_0x010a:
            java.lang.String r2 = "view"
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A1E():void");
    }

    public final void A1F(float f) {
        if (this.A07.getTranslationY() != f) {
            if (Build.VERSION.SDK_INT < 30) {
                C294975nL A012 = C294975nL.A01(this.A07, 0);
                A012.A0G();
                C294975nL A0F2 = A012.A0F(true);
                A0F2.A0K(f);
                A0F2.A0H();
                C70797OLs oLs = this.A0g;
                if (oLs != null && oLs.A00()) {
                    A02(this).setTranslationY(((float) (-this.A07.getHeight())) + f + ((float) this.A1R.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material)));
                }
                C328887Gq r0 = this.A2N;
                if (r0 != null) {
                    r0.A05.setTranslationY(f);
                }
            }
            AnonymousClass7IW r4 = this.A0O;
            if (r4 != null) {
                AnonymousClass9H7 r3 = r4.A01;
                NIE nie = r3.A0L;
                if (nie != null && nie.isVisible()) {
                    C71870OsD osD = nie.A02;
                    if (!osD.A0G) {
                        float f2 = r3.A00;
                        float f3 = f;
                        osD.A00 = f;
                        boolean z = osD.A0Z;
                        if (z) {
                            osD.A00 = 0.0f;
                        } else {
                            osD.A0B.getClass();
                            C294975nL A002 = C294975nL.A00(osD.A0B);
                            A002.A0G();
                            C294975nL A0F3 = A002.A0F(true);
                            A0F3.A0K(f);
                            A0F3.A0H();
                        }
                        float f4 = f - f2;
                        PopupWindow popupWindow = osD.A0C;
                        if (!(popupWindow == null || popupWindow.getContentView() == null)) {
                            int i = (int) (((float) osD.A02) + f4);
                            osD.A02 = i;
                            if (z || f == 0.0f) {
                                popupWindow.update(osD.A01, i, -1, -1);
                            }
                        }
                        C71085Ob8 ob8 = osD.A0F;
                        if (ob8 != null) {
                            FrameLayout frameLayout = osD.A0A;
                            PopupWindow popupWindow2 = osD.A0C;
                            if (!(!z || popupWindow2 == null || popupWindow2.getContentView() == null || frameLayout == null)) {
                                Rect rect = new Rect();
                                frameLayout.getGlobalVisibleRect(rect);
                                int[] iArr = new int[2];
                                popupWindow2.getContentView().getLocationOnScreen(iArr);
                                float f5 = ((float) rect.bottom) + f4;
                                float f6 = (float) iArr[1];
                                if (f5 > f6) {
                                    f3 = f + (f6 - (f5 + ((float) frameLayout.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material))));
                                }
                            }
                            if (ob8.A0D) {
                                FrameLayout frameLayout2 = ob8.A0N;
                                float y = (frameLayout2.getY() + f3) - f2;
                                if (z) {
                                    frameLayout2.setY(y);
                                } else if (f3 == 0.0f) {
                                    C294975nL A003 = C294975nL.A00(frameLayout2);
                                    0qQ.A07(A003);
                                    if (A003.A0W()) {
                                        frameLayout2.setAlpha(1.0f);
                                        frameLayout2.setScaleX(1.0f);
                                        frameLayout2.setScaleY(1.0f);
                                    }
                                    C294975nL A004 = C294975nL.A00(frameLayout2);
                                    A004.A0G();
                                    C294975nL A0F4 = A004.A0F(true);
                                    A0F4.A0K(y);
                                    A0F4.A0H();
                                }
                            }
                        }
                    }
                }
                r4.A00.A0S(f);
                r3.A00 = f;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01bd, code lost:
        r1 = r0.A0U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0213, code lost:
        r1 = r2.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void A1G(int r10) {
        /*
            r9 = this;
            boolean r4 = r9.A15
            r3 = 0
            r0 = 0
            if (r10 <= 0) goto L_0x0007
            r0 = 1
        L_0x0007:
            r9.A15 = r0
            r9.A01 = r10
            X.7Cf r0 = r9.A0R
            if (r0 == 0) goto L_0x0023
            java.lang.Integer r0 = r0.A01
            if (r0 != 0) goto L_0x0023
            boolean r0 = A12(r9)
            if (r0 == 0) goto L_0x0023
            X.7Cf r1 = r9.A0R
            int r0 = r9.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
        L_0x0023:
            X.7Ko r2 = r9.A0o
            if (r2 == 0) goto L_0x0032
            boolean r1 = r9.A15
            boolean r0 = r2.A02
            if (r0 == r1) goto L_0x0032
            r2.A02 = r1
            r2.A01()
        L_0x0032:
            X.7Kf r0 = r9.A0d
            X.0eM r0 = r0.A0H
            java.lang.Object r2 = r0.getValue()
            X.7Kr r2 = (X.C329907Kr) r2
            r9.A0Q = r2
            boolean r5 = r9.A15
            if (r4 == r5) goto L_0x007b
            com.instagram.common.session.UserSession r0 = r9.A1Z
            X.0qQ.A0B(r0, r3)
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L_0x0057
            int r1 = r0.intValue()
            r0 = 11
            if (r1 == r0) goto L_0x0213
            r0 = 20
            if (r1 == r0) goto L_0x0213
        L_0x0057:
            if (r4 == 0) goto L_0x01dc
            X.OWa r0 = r9.A0S
            if (r0 == 0) goto L_0x0075
            boolean r0 = r9.A0p()
            if (r0 == 0) goto L_0x0075
            X.OWa r0 = r9.A0S
            android.view.ViewGroup r0 = r0.A00
            if (r0 == 0) goto L_0x006c
            r0.setVisibility(r3)
        L_0x006c:
            X.7L0 r0 = r9.A0U
            if (r0 == 0) goto L_0x0075
            int r0 = r0.A02
            A0e(r9, r0)
        L_0x0075:
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r0 = r9.A0K
            if (r0 == 0) goto L_0x007b
            r0.A09 = r3
        L_0x007b:
            boolean r0 = r9.A1U()
            if (r0 == 0) goto L_0x0084
            A0k(r9, r3)
        L_0x0084:
            X.7I8 r1 = r9.A1m
            int r5 = r1.A00()
            int r5 = r5 - r10
            android.widget.FrameLayout r0 = r9.A07
            int r0 = r0.getHeight()
            int r5 = r5 - r0
            boolean r0 = r9.A0z
            if (r0 == 0) goto L_0x00b8
            X.7Ij r0 = r9.A0b
            if (r0 == 0) goto L_0x00b8
            X.7J3 r6 = r0.A0X
            X.7J1 r2 = X.AnonymousClass7J1.A00
            com.instagram.common.session.UserSession r0 = r6.A04
            boolean r0 = r2.A01(r0)
            r2 = 0
            if (r0 == 0) goto L_0x01d8
            X.0eM r0 = r6.A08
        L_0x00a9:
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x00b5
            android.graphics.drawable.Drawable r2 = r0.getBackground()
        L_0x00b5:
            X.AnonymousClass7PT.A00(r2, r5)
        L_0x00b8:
            android.widget.ImageView r2 = r9.A08
            if (r2 == 0) goto L_0x00c9
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            if (r0 == 0) goto L_0x00c9
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            X.AnonymousClass7PT.A00(r0, r5)
        L_0x00c9:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r2 < r0) goto L_0x00da
            X.7Ij r0 = r9.A0b
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r0.A0R
            android.graphics.drawable.Drawable r0 = r0.getTextCursorDrawable()
            X.AnonymousClass7PT.A00(r0, r5)
        L_0x00da:
            X.7Rr r0 = r9.A0Z
            X.0eM r0 = r0.A0G
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0111
            X.7Ij r0 = r9.A0b
            if (r0 == 0) goto L_0x0111
            X.7J3 r0 = r0.A0X
            X.0eM r2 = r0.A09
            java.lang.Object r0 = r2.getValue()
            X.3oV r0 = (X.C252063oV) r0
            boolean r0 = r0.CVM()
            if (r0 == 0) goto L_0x0111
            java.lang.Object r0 = r2.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r0 = r0.getView()
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L_0x0111
            X.AnonymousClass7PT.A00(r0, r5)
        L_0x0111:
            boolean r0 = r9.A16
            if (r0 == 0) goto L_0x0118
            A0g(r9, r5)
        L_0x0118:
            X.7JI r0 = r9.A0u
            r0.A00 = r10
            android.view.View r0 = r0.A08
            if (r0 == 0) goto L_0x0127
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            X.AnonymousClass7PT.A00(r0, r5)
        L_0x0127:
            android.view.View r5 = r9.A05
            X.7Kl r6 = r9.A0t
            if (r6 == 0) goto L_0x0167
            if (r5 == 0) goto L_0x0167
            int r7 = r1.A00()
            int r0 = r5.getHeight()
            int r7 = r7 - r0
            int r7 = r7 - r10
            com.instagram.common.session.UserSession r8 = r6.A0K
            X.0Tu r2 = X.0Tu.A05
            r0 = 36595522248706201(0x82036f00010899, double:3.206493856197538E-306)
            long r1 = X.182.A01(r2, r8, r0)
            int r0 = (int) r1
            int r1 = r0 / 100
            boolean r0 = X.C226122ff.A03()
            if (r0 == 0) goto L_0x01d5
            int r0 = X.C226122ff.A01()
        L_0x0153:
            int r7 = r7 - r0
            int r7 = r7 * r1
            r6.A01 = r7
            android.view.ViewGroup r0 = r6.A02
            if (r0 == 0) goto L_0x015e
            X.C329847Kl.A00(r6)
        L_0x015e:
            if (r4 != 0) goto L_0x0167
            boolean r0 = r9.A15
            if (r0 == 0) goto L_0x0167
            r9.A18()
        L_0x0167:
            X.7Km r0 = r9.A0L
            if (r0 == 0) goto L_0x0176
            if (r5 == 0) goto L_0x0176
            if (r4 != 0) goto L_0x0176
            boolean r0 = r9.A15
            if (r0 == 0) goto L_0x0176
            r9.A17()
        L_0x0176:
            X.OLs r1 = r9.A0g
            if (r1 == 0) goto L_0x019f
            if (r4 == 0) goto L_0x019f
            boolean r0 = r9.A15
            if (r0 != 0) goto L_0x019f
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x019f
            X.OBY r5 = r1.A01
            if (r5 == 0) goto L_0x019f
            X.77W r0 = r5.A01
            java.util.ArrayList r2 = r0.A02
            X.0eM r0 = r0.A03
            java.lang.Object r1 = r0.getValue()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            android.view.View r0 = r5.A00
            X.OJl r0 = X.C70866OPf.A01(r0, r1, r3)
            r2.add(r0)
        L_0x019f:
            boolean r0 = r9.A15
            if (r0 != 0) goto L_0x01aa
            if (r4 == 0) goto L_0x01aa
            X.7Sa r0 = r9.A1i
            r0.A08(r3)
        L_0x01aa:
            int r0 = -r10
            float r0 = (float) r0
            r9.A1F(r0)
            android.os.Handler r1 = r9.A1T
            X.7PW r0 = new X.7PW
            r0.<init>(r9, r10)
            r1.post(r0)
            X.7Ij r0 = r9.A0b
            if (r0 == 0) goto L_0x01d4
            r2 = 1
            X.7Iy r1 = r0.A0U
            X.8Ov r0 = r1.A01
            if (r0 == 0) goto L_0x01d4
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x01d4
            X.C329457Iy.A01(r1, r2)
            X.8Ov r0 = r1.A01
            if (r0 == 0) goto L_0x01d4
            r0.dismiss()
        L_0x01d4:
            return
        L_0x01d5:
            r0 = 0
            goto L_0x0153
        L_0x01d8:
            X.0eM r0 = r6.A07
            goto L_0x00a9
        L_0x01dc:
            com.instagram.common.ui.base.IgTextView r0 = r9.A0G
            if (r0 == 0) goto L_0x01ed
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01ed
            com.instagram.common.ui.base.IgTextView r1 = r9.A0G
            r0 = 8
            r1.setVisibility(r0)
        L_0x01ed:
            X.OWa r0 = r9.A0S
            if (r0 == 0) goto L_0x0205
            boolean r0 = r9.A0p()
            if (r0 == 0) goto L_0x0205
            X.OWa r0 = r9.A0S
            android.view.ViewGroup r1 = r0.A00
            if (r1 == 0) goto L_0x0202
            r0 = 8
            r1.setVisibility(r0)
        L_0x0202:
            A0e(r9, r3)
        L_0x0205:
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r1 = r9.A0K
            if (r1 == 0) goto L_0x020c
            r0 = 1
            r1.A09 = r0
        L_0x020c:
            r0 = 2
            A0h(r9, r0)
            goto L_0x007b
        L_0x0213:
            android.view.View r1 = r2.A04
            r0 = 2131437189(0x7f0b2685, float:1.849627E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x0057
            int r0 = r0.getVisibility()
            r2 = 0
            if (r0 != 0) goto L_0x0057
            r0 = 2131437680(0x7f0b2870, float:1.8497265E38)
            android.view.View r1 = r1.findViewById(r0)
            X.0qQ.A0A(r1)
            r0 = r5 ^ 1
            if (r0 != 0) goto L_0x0235
            r2 = 8
        L_0x0235:
            r1.setVisibility(r2)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A1G(int):void");
    }

    public final /* synthetic */ void A1H(int i) {
        int i2;
        ViewGroup viewGroup = this.A1V;
        int measuredHeight = viewGroup.getMeasuredHeight() - this.A07.getMeasuredHeight();
        View view = this.A03;
        if (view != null) {
            i2 = view.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            FrameLayout frameLayout = this.A07;
            Rect rect = this.A1S;
            frameLayout.getDrawingRect(rect);
            viewGroup.offsetDescendantRectToMyCoords(this.A07, rect);
            int i3 = rect.top - i2;
            C329307Ij r2 = this.A0b;
            int max = Math.max(-1, i3);
            r2.A02 = max;
            C328887Gq r0 = r2.A09;
            if (r0 != null) {
                r0.A00(max);
                return;
            }
            return;
        }
        int i4 = (measuredHeight - i) - i2;
        if (i4 > 0) {
            C329307Ij r02 = this.A0b;
            r02.A02 = i4;
            C328887Gq r03 = r02.A09;
            if (r03 != null) {
                r03.A00(i4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b9, code lost:
        if (X.182.A06(X.0Tu.A05, r15, 36319398805052665L) == false) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1I(android.app.Activity r22, com.google.common.collect.ImmutableList r23, X.AnonymousClass2Ep r24, java.lang.Boolean r25, java.lang.Boolean r26, java.lang.String r27, java.lang.String r28) {
        /*
            r21 = this;
            r7 = r24
            if (r24 == 0) goto L_0x0029
            r3 = r21
            com.instagram.common.session.UserSession r15 = r3.A1Z
            r2 = 0
            X.0qQ.A0B(r15, r2)
            X.0Tu r4 = X.0Tu.A06
            r0 = 36316435273748851(0x81059b00001173, double:3.029998129441464E-306)
            boolean r0 = X.182.A06(r4, r15, r0)
            if (r0 == 0) goto L_0x002a
            X.0Tu r4 = X.0Tu.A05
            r0 = 36316435273814388(0x81059b00011174, double:3.02999812948291E-306)
            boolean r0 = X.182.A06(r4, r15, r0)
            if (r0 == 0) goto L_0x002a
            r3.A1E()
        L_0x0029:
            return
        L_0x002a:
            r5 = r23
            r8 = r26
            r9 = r27
            r10 = r28
            r6 = r15
            X.7Er r0 = X.C328397Eq.A00(r5, r6, r7, r8, r9, r10)
            java.util.List r9 = r0.A05
            X.9IV r6 = r0.A00
            boolean r10 = r0.A06
            X.Cte r4 = r0.A01
            X.3su r5 = r0.A02
            java.lang.Boolean r1 = r0.A04
            java.lang.Boolean r0 = r0.A03
            boolean r8 = X.AnonymousClass4KJ.A00(r9)
            if (r8 == 0) goto L_0x0057
            if (r10 != 0) goto L_0x0057
            if (r4 != 0) goto L_0x0057
            X.OWa r0 = r3.A0S
            if (r0 == 0) goto L_0x0029
            r0.A01()
            return
        L_0x0057:
            X.OWa r8 = r3.A0S
            if (r8 != 0) goto L_0x0094
            java.lang.String r17 = r7.C6C()
            android.widget.FrameLayout r13 = r3.A07
            android.content.Context r8 = r13.getContext()
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r8)
            if (r17 != 0) goto L_0x006d
            java.lang.String r17 = ""
        L_0x006d:
            com.instagram.user.model.User r16 = X.AnonymousClass48N.A05(r7)
            X.0iw r14 = r3.A1X
            X.3U9 r7 = (X.AnonymousClass3U9) r7
            X.3S9 r7 = r7.A01
            boolean r8 = r7.A2T
            X.Auc r7 = new X.Auc
            r7.<init>(r3)
            X.OWa r10 = new X.OWa
            r11 = r22
            r18 = r7
            r19 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.A0S = r10
            X.7L0 r8 = r3.A0U
            boolean r7 = r3.A0p()
            r10.A03(r8, r7)
        L_0x0094:
            boolean r19 = r3.A0p()
            X.OWa r7 = r3.A0S
            boolean r16 = r25.booleanValue()
            boolean r17 = r1.booleanValue()
            boolean r18 = r0.booleanValue()
            boolean r0 = A0s(r3)
            if (r0 == 0) goto L_0x00bb
            X.0Tu r8 = X.0Tu.A05
            r0 = 36319398805052665(0x81084d003b1cf9, double:3.0318722785711785E-306)
            boolean r0 = X.182.A06(r8, r15, r0)
            r20 = 1
            if (r0 != 0) goto L_0x00bd
        L_0x00bb:
            r20 = 0
        L_0x00bd:
            r13 = r4
            r14 = r5
            r15 = r9
            r11 = r7
            r12 = r6
            r11.A02(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r19 == 0) goto L_0x00d0
            X.7L0 r0 = r3.A0U
            if (r0 == 0) goto L_0x00d0
            int r0 = r0.A02
            A0e(r3, r0)
        L_0x00d0:
            r0 = 1
            A0m(r3, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A1I(android.app.Activity, com.google.common.collect.ImmutableList, X.2Ep, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.7KY, X.7KZ] */
    /* JADX WARNING: type inference failed for: r8v26, types: [X.7KY, X.7KZ] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (X.182.A06(r2, r3, 36324724561031460L) == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1J(androidx.fragment.app.FragmentActivity r39) {
        /*
            r38 = this;
            r5 = r38
            boolean r0 = r5.A0z
            if (r0 != 0) goto L_0x02a1
            X.7Sc r7 = r5.A2O
            r6 = 0
            r7.EwO(r6)
            boolean r9 = A0s(r5)
            com.instagram.common.session.UserSession r3 = r5.A1Z
            r8 = 0
            X.0qQ.A0B(r3, r8)
            X.0Tu r2 = X.0Tu.A05
            if (r9 == 0) goto L_0x02ff
            r0 = 2342167733774463264(0x20810d2500023120, double:4.069591906996515E-152)
        L_0x001f:
            boolean r0 = X.182.A06(r2, r3, r0)
            r4 = r39
            if (r0 == 0) goto L_0x0048
            r0 = 36324724560638238(0x810d250000311e, double:3.0352403078485914E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0048
            if (r9 == 0) goto L_0x0040
            r0 = 36324724561031460(0x810d2500063124, double:3.0352403080972665E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            X.OE7 r0 = new X.OE7
            r0.<init>(r4, r1)
            r5.A0Y = r0
        L_0x0048:
            X.0t1 r0 = X.0eE.A00(r3)
            com.instagram.user.model.User r16 = r0.A00()
            boolean r0 = A0s(r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02a2
            r0 = 2131624872(0x7f0e03a8, float:1.8876936E38)
            r5.A0M(r4, r0)
            r5.A0K(r4)
            X.7Rr r0 = r5.A0Z
            X.0eM r0 = r0.A0G
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r10 = 1
            if (r0 == 0) goto L_0x008b
            X.7Ij r0 = r5.A0b
            android.view.View r1 = r0.A0J
            r0 = 2131440512(0x7f0b3380, float:1.850301E38)
            android.view.View r1 = r1.findViewById(r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r1
            r5.A0H = r1
            if (r1 == 0) goto L_0x008b
            X.7BH r0 = new X.7BH
            r0.<init>(r5, r10)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x008b:
            boolean r0 = r5.A14
            if (r0 == 0) goto L_0x00b9
            X.0eK r0 = r5.A22
            java.lang.Object r8 = r0.get()
            X.2Ep r8 = (X.AnonymousClass2Ep) r8
            android.view.ViewGroup r0 = r5.A1V
            if (r0 == 0) goto L_0x00b9
            if (r8 == 0) goto L_0x00b9
            X.7k5 r1 = X.C339717k3.A00(r3)
            java.lang.String r0 = r8.C6f()
            r1.A03 = r0
            int r0 = r8.BRT()
            r1.A00 = r0
            com.instagram.common.typedurl.ImageUrl r0 = r8.Asd()
            r1.A01 = r0
            java.lang.String r0 = r8.C6C()
            r1.A02 = r0
        L_0x00b9:
            int r1 = A00(r5)
            r0 = 29
            if (r1 != r0) goto L_0x00ee
            X.2Er r0 = r5.A0W
            if (r0 == 0) goto L_0x00ee
            int r0 = r0.BHS()
            if (r0 != 0) goto L_0x00ee
            r0 = 36319407396953447(0x81084f00591d67, double:3.03187771212383E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00ee
            X.OKT r8 = r5.A0p
            if (r8 != 0) goto L_0x00eb
            X.7Ij r0 = r5.A0b
            android.view.View r1 = r0.A0J
            X.3t2 r0 = r5.A1z
            X.7Zj r0 = X.C70172NyQ.A00(r3, r0)
            X.OKT r8 = new X.OKT
            r8.<init>(r1, r0)
            r5.A0p = r8
        L_0x00eb:
            r8.A00()
        L_0x00ee:
            boolean r0 = A11(r5)
            if (r0 == 0) goto L_0x011d
            boolean r0 = A11(r5)
            X.17k.A0E(r0)
            X.7Pz r9 = new X.7Pz
            r9.<init>(r5)
            java.util.List r22 = A0I(r5)
            X.0iw r8 = r5.A1X
            X.7Ij r1 = r5.A0b
            r0 = 3
            X.0qQ.A0B(r8, r0)
            X.7Q0 r0 = new X.7Q0
            r17 = r0
            r18 = r8
            r19 = r3
            r20 = r9
            r21 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            r5.A0n = r0
        L_0x011d:
            boolean r0 = r5.A19
            if (r0 != 0) goto L_0x0129
            boolean r0 = r5.A11
            if (r0 != 0) goto L_0x0129
            boolean r0 = r5.A13
            if (r0 == 0) goto L_0x0137
        L_0x0129:
            X.0iw r8 = r5.A1X
            X.Etw r1 = new X.Etw
            r1.<init>(r5)
            X.ONc r0 = new X.ONc
            r0.<init>(r4, r8, r3, r1)
            r5.A0m = r0
        L_0x0137:
            boolean r0 = A10(r5)
            if (r0 == 0) goto L_0x014b
            X.0iw r8 = r5.A1X
            X.Etv r1 = new X.Etv
            r1.<init>(r5)
            X.F2e r0 = new X.F2e
            r0.<init>(r8, r3, r1)
            r5.A0l = r0
        L_0x014b:
            android.content.Context r1 = r5.A1R
            X.0iw r0 = r5.A1X
            X.7KX r8 = new X.7KX
            r8.<init>(r4, r1, r0, r3)
            r5.A0f = r8
            X.7KY r9 = A08(r5)
            X.7KZ r8 = new X.7KZ
            r8.<init>(r9)
            boolean r8 = r8.A06(r10)
            if (r8 == 0) goto L_0x0172
            X.7AW r8 = r5.A0j
            if (r8 != 0) goto L_0x0172
            X.7IR r9 = r5.A1d
            X.7AW r8 = new X.7AW
            r8.<init>(r4, r1, r3, r9)
            r5.A0j = r8
        L_0x0172:
            boolean r8 = r16.A2L()
            if (r8 == 0) goto L_0x01a8
            X.7Q1 r10 = new X.7Q1
            r10.<init>(r5)
            java.lang.String r8 = "DirectMessageComposerController"
            com.facebook.common.callercontext.CallerContext r18 = com.facebook.common.callercontext.CallerContext.A01(r8)
            java.lang.String r19 = "ig_android_ig_business_asset_edit_profile"
            java.lang.String r20 = "ig_direct"
            java.lang.String r21 = "whatsapp_number_share"
            java.lang.String r22 = "fetching_number"
            X.9JK r9 = new X.9JK
            r17 = r9
            r17.<init>((com.facebook.common.callercontext.CallerContext) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22)
            X.9F1 r12 = X.AnonymousClass9F1.A00
            X.9F4 r8 = X.AnonymousClass9F3.A00(r3)
            X.0eM r8 = r8.A02
            java.lang.Object r11 = r8.getValue()
            X.9F7 r11 = (X.AnonymousClass9F7) r11
            X.7Q2 r8 = new X.7Q2
            r8.<init>(r9, r3, r10)
            r11.AUs(r9, r12, r8)
        L_0x01a8:
            android.widget.FrameLayout r8 = r5.A07
            r37 = r8
            X.3t2 r8 = r5.A1z
            r26 = r8
            boolean r8 = r5.A29
            r31 = r8
            java.lang.String r8 = r5.A21
            r27 = r8
            X.7Hn r8 = r5.A2I
            r21 = r8
            X.7Hr r8 = r5.A2L
            r24 = r8
            X.7Hp r8 = r5.A2J
            r22 = r8
            X.7Hq r8 = r5.A2K
            r23 = r8
            X.7Hs r8 = r5.A2M
            r25 = r8
            X.7Ht r8 = r5.A2H
            r19 = r8
            X.6iJ r8 = r5.A2E
            r18 = r8
            X.7Kd r12 = new X.7Kd
            r12.<init>(r5)
            boolean r15 = r5.A2R
            boolean r14 = r5.A2A
            boolean r13 = r5.A2S
            X.0t1 r8 = X.0eE.A00(r3)
            com.instagram.user.model.User r8 = r8.A00()
            java.lang.String r28 = r8.getUsername()
            com.instagram.common.typedurl.ImageUrl r17 = r16.Bh3()
            boolean r11 = r5.A2T
            X.0eM r8 = r5.A2Q
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r36 = r8.booleanValue()
            X.7Wn r10 = r5.A2F
            X.7Ke r9 = new X.7Ke
            r9.<init>(r5)
            X.7Kf r8 = new X.7Kf
            r20 = r19
            r29 = r12
            r30 = r9
            r32 = r15
            r33 = r14
            r34 = r13
            r35 = r11
            r11 = r8
            r12 = r4
            r13 = r1
            r14 = r37
            r15 = r0
            r16 = r3
            r19 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r5.A0d = r8
            X.0eM r0 = r8.A0N
            java.lang.Object r0 = r0.getValue()
            X.7Kg r0 = (X.C329797Kg) r0
            r5.A0c = r0
            X.7Kf r0 = r5.A0d
            X.0eM r0 = r0.A0Q
            java.lang.Object r0 = r0.getValue()
            X.7Kj r0 = (X.C329827Kj) r0
            r5.A0i = r0
            X.7Kf r0 = r5.A0d
            X.0eM r0 = r0.A0I
            java.lang.Object r0 = r0.getValue()
            X.7Kk r0 = (X.C329837Kk) r0
            r5.A1M = r0
            X.7Kf r0 = r5.A0d
            X.0eM r0 = r0.A0P
            java.lang.Object r0 = r0.getValue()
            X.7Kl r0 = (X.C329847Kl) r0
            r5.A0t = r0
            X.7Kf r0 = r5.A0d
            X.0eM r0 = r0.A0J
            java.lang.Object r0 = r0.getValue()
            X.7Km r0 = (X.C329857Km) r0
            r5.A0L = r0
            X.7Kf r0 = r5.A0d
            X.0eM r0 = r0.A0L
            java.lang.Object r0 = r0.getValue()
            X.7Kn r0 = (X.C329867Kn) r0
            r5.A0h = r0
            X.7Kf r0 = r5.A0d
            X.0eM r0 = r0.A0O
            java.lang.Object r0 = r0.getValue()
            X.7Ko r0 = (X.C329877Ko) r0
            r5.A0o = r0
            r0 = 36324677317112043(0x810d1a001130eb, double:3.035210430852391E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x028c
            X.7Kf r0 = r5.A0d
            X.0eM r0 = r0.A0M
            java.lang.Object r0 = r0.getValue()
            X.7Kq r0 = (X.C329897Kq) r0
            r5.A0a = r0
        L_0x028c:
            X.7Kf r0 = r5.A0d
            X.0eM r0 = r0.A0H
            java.lang.Object r0 = r0.getValue()
            X.7Kr r0 = (X.C329907Kr) r0
            r5.A0Q = r0
            r7.Eyv(r6)
            r5.A1C()
            r0 = 1
            r5.A0z = r0
        L_0x02a1:
            return
        L_0x02a2:
            r0 = 2131624873(0x7f0e03a9, float:1.8876938E38)
            r5.A0M(r4, r0)
            r5.A0K(r4)
            X.7Rr r0 = r5.A0Z
            X.0eM r0 = r0.A0G
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02d4
            X.7Ij r0 = r5.A0b
            android.view.View r1 = r0.A0J
            r0 = 2131440512(0x7f0b3380, float:1.850301E38)
            android.view.View r1 = r1.findViewById(r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r1
            r5.A0H = r1
            if (r1 == 0) goto L_0x02d4
            X.7BH r0 = new X.7BH
            r0.<init>(r5, r8)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x02d4:
            X.7KY r1 = A08(r5)
            X.7KZ r0 = new X.7KZ
            r0.<init>(r1)
            boolean r0 = r0.A06(r8)
            if (r0 == 0) goto L_0x02f2
            X.7AW r0 = r5.A0j
            if (r0 != 0) goto L_0x02f2
            android.content.Context r8 = r5.A1R
            X.7IR r1 = r5.A1d
            X.7AW r0 = new X.7AW
            r0.<init>(r4, r8, r3, r1)
            r5.A0j = r0
        L_0x02f2:
            android.content.Context r1 = r5.A1R
            X.0iw r0 = r5.A1X
            X.7KX r8 = new X.7KX
            r8.<init>(r4, r1, r0, r3)
            r5.A0f = r8
            goto L_0x0172
        L_0x02ff:
            r0 = 36324724560834849(0x810d2500033121, double:3.035240307972929E-306)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A1J(androidx.fragment.app.FragmentActivity):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x026b, code lost:
        if (r1 != null) goto L_0x0227;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1K(androidx.fragment.app.FragmentActivity r30, com.instagram.model.direct.messageid.MessageIdentifier r31, boolean r32) {
        /*
            r29 = this;
            r0 = r29
            r9 = r30
            android.view.ViewGroup r1 = r0.A1V
            X.0nA.A0N(r1)
            r0.A19()
            r0.A16()
            X.0eK r1 = r0.A22
            java.lang.Object r7 = r1.get()
            X.2Ep r7 = (X.AnonymousClass2Ep) r7
            if (r7 == 0) goto L_0x010e
            if (r32 == 0) goto L_0x010e
            X.3tI r14 = A04(r0)
            com.instagram.common.session.UserSession r13 = r0.A1Z
            android.content.Context r12 = r0.A1R
            java.lang.String r16 = A0F(r0)
            r17 = 8
            r15 = r7
            com.instagram.model.direct.camera.DirectCameraViewModel r3 = X.C71046OaO.A01(r12, r13, r14, r15, r16, r17)
            X.OZO r8 = r0.A0s
            if (r8 == 0) goto L_0x004c
            com.instagram.common.session.UserSession r6 = r8.A03
            r5 = 0
            X.0Tu r4 = X.0Tu.A05
            r1 = 36323144012737436(0x810bb500012b9c, double:3.0342407629917686E-306)
            boolean r1 = X.182.A06(r4, r6, r1)
            if (r1 == 0) goto L_0x00aa
            X.2Er r1 = r8.A04
            if (r1 == 0) goto L_0x00aa
            boolean r1 = X.OZO.A01(r6, r1, r8, r5)
            if (r1 != 0) goto L_0x00b4
        L_0x004c:
            r12 = 0
        L_0x004d:
            boolean r10 = r7.CVr()
            X.0eK r1 = r0.A26
            java.lang.Object r1 = r1.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            X.3t2 r1 = r0.A1z
            X.3tH r5 = X.AnonymousClass4KK.A00(r1)
            boolean r8 = r0.A1T()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r8)
            com.instagram.model.direct.DirectThreadKey r7 = A09(r0)
            boolean r6 = r0.A0o()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r1 = 106(0x6a, float:1.49E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.putParcelable(r1, r3)
            r1 = 903(0x387, float:1.265E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.putBoolean(r1, r10)
            r1 = 218(0xda, float:3.05E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.putBoolean(r1, r2)
            if (r12 == 0) goto L_0x009e
            boolean r2 = r12.booleanValue()
            java.lang.String r1 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SHOULD_XPOST_MESSAGE"
            r4.putBoolean(r1, r2)
        L_0x009e:
            if (r5 == 0) goto L_0x00a7
            java.lang.String r2 = r5.A00
            java.lang.String r1 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_TRANSPORT_TYPE"
            r4.putString(r1, r2)
        L_0x00a7:
            if (r14 == 0) goto L_0x00d7
            goto L_0x00bf
        L_0x00aa:
            android.view.View r1 = r8.A02
            if (r1 == 0) goto L_0x004c
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x004c
        L_0x00b4:
            X.OZO r1 = r0.A0s
            boolean r1 = r1.A02()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            goto L_0x004d
        L_0x00bf:
            r1 = 224(0xe0, float:3.14E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ IOException -> 0x00cd }
            java.lang.String r2 = X.C292605jE.A00(r14)     // Catch:{ IOException -> 0x00cd }
            r4.putString(r1, r2)     // Catch:{ IOException -> 0x00cd }
            goto L_0x00d7
        L_0x00cd:
            r5 = move-exception
            X.0kg r3 = X.0kg.A05
            java.lang.String r2 = "serialize_replied_to_message"
            java.lang.String r1 = "Failed"
            X.0wb.A02(r3, r2, r1, r5)
        L_0x00d7:
            if (r11 == 0) goto L_0x00de
            java.lang.String r1 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_VIDEO_SUPPORTED"
            r4.putBoolean(r1, r8)
        L_0x00de:
            if (r7 == 0) goto L_0x00e9
            r1 = 15
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.putParcelable(r1, r7)
        L_0x00e9:
            java.lang.String r1 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_MESSAGE_COMPOSER_ENABLED"
            r4.putBoolean(r1, r6)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r14 = com.instagram.modal.TransparentModalActivity.class
            java.lang.String r15 = "direct_permanent_media_edit_fragment"
            X.6W8 r3 = new X.6W8
            r10 = r3
            r11 = r9
            r12 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            r2 = 1
            r3.A0C = r2
            r1 = 0
            r3.A0H = r1
            r3.A0B = r2
            r3.A09(r1)
            r3.A0F = r2
            r3.A0C(r9)
            A0j(r0, r2)
            return
        L_0x010e:
            com.instagram.common.session.UserSession r11 = r0.A1Z
            r4 = 0
            X.0qQ.A0B(r11, r4)
            X.0Tu r1 = X.0Tu.A05
            r2 = 37168049980047823(0x840c25000e01cf, double:3.5685626988821104E-306)
            double r2 = X.182.A00(r1, r11, r2)
            float r15 = (float) r2
            X.2jG r2 = new X.2jG
            r2.<init>(r11)
            boolean r2 = r2.A00()
            r22 = 0
            if (r2 == 0) goto L_0x0131
            r15 = 1065353216(0x3f800000, float:1.0)
            r22 = 1
        L_0x0131:
            X.3t2 r8 = r0.A1z
            X.3tH r12 = X.AnonymousClass4KK.A00(r8)
            com.instagram.model.direct.DirectThreadKey r13 = A09(r0)
            r2 = 36323625049271617(0x810c2500042d41, double:3.0345449724329633E-306)
            boolean r18 = X.182.A06(r1, r11, r2)
            X.0qQ.A0B(r8, r4)
            boolean r2 = r8 instanceof X.AnonymousClass9HR
            if (r2 != 0) goto L_0x0278
            r2 = 36323625049599301(0x810c2500092d45, double:3.034544972640192E-306)
            boolean r2 = X.182.A06(r1, r11, r2)
            if (r2 != 0) goto L_0x015c
            boolean r2 = r0.A0o()
            if (r2 == 0) goto L_0x0278
        L_0x015c:
            r19 = 1
        L_0x015e:
            r2 = 36323625050058059(0x810c2500102d4b, double:3.0345449729303124E-306)
            boolean r21 = X.182.A06(r1, r11, r2)
            r2 = 37168049979589070(0x840c25000701ce, double:3.568562698591993E-306)
            double r2 = X.182.A00(r1, r11, r2)
            float r14 = (float) r2
            r16 = 1065353216(0x3f800000, float:1.0)
            r23 = 1
            r20 = r4
            r17 = r4
            X.K6K r12 = X.LNF.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.AcM r14 = new X.AcM
            r3 = r31
            r14.<init>(r0, r3)
            X.7H6 r15 = r0.A1g
            X.2Er r2 = r0.A0W
            if (r2 == 0) goto L_0x018d
            r2.CVr()
        L_0x018d:
            X.0eK r2 = r0.A26
            java.lang.Object r2 = r2.get()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r22 = r2.booleanValue()
            r2 = 0
            if (r31 == 0) goto L_0x019d
            r2 = 1
        L_0x019d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            int r20 = r0.A01(r2)
            android.content.Context r10 = r0.A1R
            X.7Sa r4 = r0.A1i
            boolean r27 = r0.A1T()
            boolean r28 = A0v(r0)
            X.AcL r13 = new X.AcL
            r23 = r13
            r24 = r10
            r25 = r11
            r26 = r4
            r23.<init>(r24, r25, r26, r27, r28)
            r6 = 0
            if (r31 == 0) goto L_0x0274
            android.content.res.Resources r5 = r10.getResources()
            r3 = 2131959724(0x7f131fac, float:1.9556097E38)
            java.lang.String r19 = r5.getString(r3)
        L_0x01cc:
            boolean r3 = r0.A0o()
            if (r3 == 0) goto L_0x01d4
            X.7SL r6 = r0.A0N
        L_0x01d4:
            boolean r23 = r0.A0o()
            boolean r3 = r0.A0o()
            if (r3 == 0) goto L_0x026e
            boolean r3 = A0s(r0)
            if (r3 == 0) goto L_0x026e
            r2 = 36608767927850751(0x820f7b000116ff, double:3.21487047702462E-306)
            long r2 = X.182.A01(r1, r11, r2)
            int r5 = (int) r2
        L_0x01ee:
            boolean r24 = r0.A1T()
            r16 = r6
            r17 = r7
            r18 = r8
            r21 = r5
            r12.A04(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = 36323625050123596(0x810c2500112d4c, double:3.034544972971758E-306)
            boolean r1 = X.182.A06(r1, r11, r2)
            if (r1 == 0) goto L_0x0269
            X.2k4 r1 = X.AnonymousClass2k4.NIGHT
            r12.setDayNightMode(r1)
            android.content.Context r3 = X.2Yn.A01(r10)
            java.util.List r2 = java.util.Collections.emptyList()
            android.os.Parcelable$Creator r1 = com.instagram.direct.capabilities.Capabilities.CREATOR
            com.instagram.direct.capabilities.Capabilities r2 = X.C376189Gz.A00(r2)
            X.9HD r1 = X.AnonymousClass9HC.A1b
            X.9HC r1 = r1.A00(r11, r2)
            X.7L2 r1 = X.C250563lf.A05(r3, r1)
            X.7L0 r1 = r1.A07
        L_0x0227:
            r12.ADi(r1)
        L_0x022a:
            boolean r1 = r9 instanceof X.C74317Pst
            if (r1 == 0) goto L_0x0264
            X.Pst r9 = (X.C74317Pst) r9
            X.37D r6 = r9.AhO()
        L_0x0234:
            X.7I2 r5 = r0.A1u
            boolean r3 = r0.A28
            java.lang.String r2 = r0.A21
            X.Pdp r1 = new X.Pdp
            r1.<init>(r12, r0, r6)
            r0 = 2
            X.0qQ.A0B(r5, r0)
            r0 = 5
            X.0qQ.A0B(r4, r0)
            if (r6 == 0) goto L_0x027c
            if (r3 == 0) goto L_0x027c
            java.lang.String r0 = "follow_button"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x027c
            r4.A02()
            X.PQv r1 = new X.PQv
            r1.<init>(r12, r4, r5, r6)
            r0 = r6
            X.37F r0 = (X.AnonymousClass37F) r0
            r0.A0H = r1
            r6.A0B()
            return
        L_0x0264:
            X.37D r6 = X.AnonymousClass7ON.A00(r9)
            goto L_0x0234
        L_0x0269:
            X.7L0 r1 = r0.A0U
            if (r1 == 0) goto L_0x022a
            goto L_0x0227
        L_0x026e:
            int r5 = r0.A01(r2)
            goto L_0x01ee
        L_0x0274:
            r19 = r6
            goto L_0x01cc
        L_0x0278:
            r19 = 0
            goto L_0x015e
        L_0x027c:
            r1.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A1K(androidx.fragment.app.FragmentActivity, com.instagram.model.direct.messageid.MessageIdentifier, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0353, code lost:
        if (X.182.A06(r4, r10, 36320511198044681L) == false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ce, code lost:
        if (r2 != null) goto L_0x01d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1M(X.AnonymousClass7L0 r21, boolean r22) {
        /*
            r20 = this;
            r0 = r20
            X.7L0 r1 = r0.A0U
            r5 = 0
            if (r1 != 0) goto L_0x0008
            r5 = 1
        L_0x0008:
            r1 = r21
            r0.A0U = r1
            boolean r2 = r0.A0z
            if (r2 == 0) goto L_0x02f1
            boolean r2 = r0.A16
            if (r2 == 0) goto L_0x0017
            r0.A0J()
        L_0x0017:
            X.7Ij r8 = r0.A0b
            if (r8 == 0) goto L_0x03b4
            X.2Er r2 = r0.A0W
            if (r2 == 0) goto L_0x002a
            boolean r2 = r2.CUG()
            if (r2 == 0) goto L_0x002a
            X.2Er r2 = r0.A0W
            r2.BRZ()
        L_0x002a:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r6 = r8.A0S
            if (r6 != 0) goto L_0x003c
            X.0wj r4 = X.0wj.A01
            r3 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r2 = "mMessageEditText is null"
            X.0f9 r2 = r4.AEf(r2, r3)
            r2.report()
        L_0x003c:
            android.content.Context r7 = r6.getContext()
            int r2 = r1.A0E
            android.view.ContextThemeWrapper r10 = new android.view.ContextThemeWrapper
            r10.<init>(r7, r2)
            int r9 = r1.A03
            if (r9 == 0) goto L_0x03ad
            boolean r2 = r1.A0J
            if (r2 == 0) goto L_0x03aa
            android.content.res.Resources r3 = r7.getResources()
            r2 = 2131165293(0x7f07006d, float:1.79448E38)
            int r2 = r3.getDimensionPixelSize(r2)
            float r4 = (float) r2
        L_0x005b:
            android.content.res.Resources r3 = r7.getResources()
            r2 = 2131165223(0x7f070027, float:1.7944657E38)
            int r3 = r3.getDimensionPixelSize(r2)
            X.7OF r2 = new X.7OF
            r2.<init>(r3, r9, r4, r4)
        L_0x006b:
            r8.A07 = r2
            android.graphics.drawable.Drawable r11 = r1.A0F
            android.graphics.drawable.GradientDrawable r11 = (android.graphics.drawable.GradientDrawable) r11
            if (r11 == 0) goto L_0x0085
            int r2 = r1.A04
            r11.setColor(r2)
            X.7OF r2 = r8.A07
            int r9 = r2.A03
            int r4 = r2.A02
            float r3 = r2.A01
            float r2 = r2.A00
            r11.setStroke(r9, r4, r3, r2)
        L_0x0085:
            android.view.View r2 = r8.A0I
            r2.setBackground(r11)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r9 = r8.A0M
            android.graphics.drawable.Drawable r2 = r1.A0G
            r9.setImageDrawable(r2)
            int r4 = r1.A0C
            int r3 = r1.A0D
            r9.A04(r4, r3)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r2 = r8.A0O
            r2.A04(r4, r3)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r2 = r8.A0N
            if (r2 == 0) goto L_0x00a4
            r2.A04(r4, r3)
        L_0x00a4:
            r2 = 2132017861(0x7f1402c5, float:1.9674012E38)
            r6.setTextAppearance(r10, r2)
            com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl r2 = com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01
            if (r2 == 0) goto L_0x03a7
            X.1pr r4 = r2.A00
        L_0x00b0:
            java.lang.Integer r3 = r1.A0H
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            if (r3 != r2) goto L_0x03a1
            if (r4 == 0) goto L_0x03a1
            r2 = 2131960939(0x7f13246b, float:1.955856E38)
            java.lang.String r2 = r7.getString(r2)
        L_0x00bf:
            r6.setHint(r2)
            int r2 = r1.A0B
            if (r2 == 0) goto L_0x00c9
            r6.setHintTextColor(r2)
        L_0x00c9:
            A0c(r0)
        L_0x00cc:
            com.instagram.common.session.UserSession r6 = r0.A1Z
            X.0Tu r4 = X.0Tu.A05
            r2 = 36324677317046506(0x810d1a001030ea, double:3.0352104308109454E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            if (r2 == 0) goto L_0x00df
            boolean r2 = r0.A1A
            if (r2 == 0) goto L_0x00e6
        L_0x00df:
            X.7JI r3 = r0.A0u
            X.0eM r2 = r1.A0I
            r3.A0G(r2)
        L_0x00e6:
            boolean r8 = A0w(r0)
            X.7Ij r7 = r0.A0b
            if (r7 == 0) goto L_0x00f5
            X.7JT r3 = X.AnonymousClass7JT.META_AI_DISCOVERY
            X.7JU r2 = X.AnonymousClass7JU.RIGHT_INSET
            r7.FMR(r2, r3, r8)
        L_0x00f5:
            X.7Ij r2 = r0.A0b
            if (r2 == 0) goto L_0x014d
            X.7Iy r9 = r2.A0U
            X.7J1 r8 = X.AnonymousClass7J1.A00
            com.instagram.common.session.UserSession r2 = r9.A04
            boolean r2 = r8.A01(r2)
            if (r2 != 0) goto L_0x0116
            X.0eM r2 = r9.A07
            java.lang.Object r7 = r2.getValue()
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r7 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r7
            if (r7 == 0) goto L_0x0116
            int r3 = r1.A0C
            int r2 = r1.A0D
            r7.A04(r3, r2)
        L_0x0116:
            r2 = r22
            r9.A03 = r2
            X.7Ij r2 = r0.A0b
            boolean r12 = A12(r0)
            X.7J3 r3 = r2.A0X
            com.instagram.common.session.UserSession r2 = r3.A04
            boolean r2 = r8.A01(r2)
            if (r2 == 0) goto L_0x014d
            X.0eM r2 = r3.A08
            java.lang.Object r8 = r2.getValue()
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 == 0) goto L_0x014d
            android.graphics.drawable.Drawable r2 = r8.getDrawable()
            if (r2 == 0) goto L_0x014d
            android.widget.FrameLayout r7 = r3.A03
            X.0sa r2 = r3.A0A
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            int r10 = r2.intValue()
            r9 = r1
            r11 = r5
            X.AnonymousClass7BG.A01(r7, r8, r9, r10, r11, r12)
        L_0x014d:
            X.7Q0 r2 = r0.A0n
            if (r2 == 0) goto L_0x0158
            X.7Il r2 = r2.A04
            if (r2 == 0) goto L_0x0158
            r2.ADj(r1)
        L_0x0158:
            X.7Kf r2 = r0.A0d
            X.0eM r2 = r2.A0L
            java.lang.Object r3 = r2.getValue()
            X.7Kn r3 = (X.C329867Kn) r3
            r0.A0h = r3
            if (r3 == 0) goto L_0x017d
            int r2 = r1.A02
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.A03 = r2
            int r2 = r1.A0D
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.A02 = r2
            boolean r2 = r3.A07
            if (r2 == 0) goto L_0x017d
            X.C329867Kn.A00(r3)
        L_0x017d:
            X.7Kl r3 = r0.A0t
            if (r3 == 0) goto L_0x0191
            int r2 = r1.A02
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.A0B = r2
            int r2 = r1.A0D
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.A0C = r2
        L_0x0191:
            r2 = 36324677317112043(0x810d1a001130eb, double:3.035210430852391E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            if (r2 == 0) goto L_0x01a0
            boolean r2 = r0.A1A
            if (r2 == 0) goto L_0x01a9
        L_0x01a0:
            X.7Kq r3 = r0.A0a
            if (r3 == 0) goto L_0x01a9
            android.view.View r2 = r0.A05
            r3.A01(r2, r1)
        L_0x01a9:
            X.7Kf r2 = r0.A0d
            X.0eM r2 = r2.A0I
            java.lang.Object r2 = r2.getValue()
            X.7Kk r2 = (X.C329837Kk) r2
            r0.A1M = r2
            if (r2 == 0) goto L_0x01be
            android.widget.FrameLayout r3 = r2.A02
            int r2 = r1.A02
            r3.setBackgroundColor(r2)
        L_0x01be:
            X.7Kg r2 = r0.A0c
            if (r2 != 0) goto L_0x01d0
            X.7Kf r2 = r0.A0d
            X.0eM r2 = r2.A0N
            java.lang.Object r2 = r2.getValue()
            X.7Kg r2 = (X.C329797Kg) r2
            r0.A0c = r2
            if (r2 == 0) goto L_0x01d3
        L_0x01d0:
            r2.A01(r1)
        L_0x01d3:
            X.7Rr r2 = r0.A0Z
            X.0eM r2 = r2.A0H
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x01e9
            boolean r2 = r0.A0r()
            if (r2 == 0) goto L_0x01ee
        L_0x01e9:
            X.7Ij r2 = r0.A0b
            r2.A04(r1, r5)
        L_0x01ee:
            X.7Rr r2 = r0.A0Z
            X.0eM r2 = r2.A0G
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x021b
            X.7Ij r2 = r0.A0b
            if (r2 == 0) goto L_0x021b
            r8 = 0
            X.7J3 r7 = r2.A0X
            java.lang.Integer r3 = r7.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r3 != r2) goto L_0x0322
            X.0eM r2 = r7.A09
            java.lang.Object r2 = r2.getValue()
            X.3oV r2 = (X.C252063oV) r2
            android.view.View r9 = r2.getView()
            r2 = 0
        L_0x0218:
            r9.setBackground(r2)
        L_0x021b:
            X.7L0 r2 = r0.A0U
            if (r2 == 0) goto L_0x023f
            int[] r2 = r2.A0K
            int r7 = r2.length
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r3 < r2) goto L_0x023f
            if (r7 <= 0) goto L_0x023f
            X.7Ij r2 = r0.A0b
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r2 = r2.A0R
            android.graphics.drawable.Drawable r5 = r2.getTextCursorDrawable()
            if (r5 == 0) goto L_0x023f
            X.7L0 r2 = r0.A0U
            int[] r3 = r2.A0K
            int r2 = r7 + -1
            r2 = r3[r2]
            r5.setTint(r2)
        L_0x023f:
            X.7Kf r2 = r0.A0d
            X.0eM r2 = r2.A0H
            java.lang.Object r5 = r2.getValue()
            X.7Kr r5 = (X.C329907Kr) r5
            r0.A0Q = r5
            boolean r2 = r0.A17
            if (r2 == 0) goto L_0x0270
            X.2Er r3 = r0.A0W
            java.lang.Integer r2 = r5.A00
            if (r2 == 0) goto L_0x026b
            int r7 = r2.intValue()
            r2 = 11
            if (r7 == r2) goto L_0x0313
            r2 = 7
            if (r7 == r2) goto L_0x0301
            r2 = 8
            if (r7 == r2) goto L_0x0301
            r2 = 19
            if (r7 == r2) goto L_0x0301
            switch(r7) {
                case 0: goto L_0x0301;
                case 9: goto L_0x0301;
                case 20: goto L_0x02f2;
                case 23: goto L_0x0301;
                case 26: goto L_0x0301;
                default: goto L_0x026b;
            }
        L_0x026b:
            int r2 = r1.A02
            A0e(r0, r2)
        L_0x0270:
            r2 = 36324677317177580(0x810d1a001230ec, double:3.035210430893837E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            if (r2 == 0) goto L_0x027f
            boolean r2 = r0.A1A
            if (r2 == 0) goto L_0x0282
        L_0x027f:
            A0Q(r0)
        L_0x0282:
            X.OWa r3 = r0.A0S
            if (r3 == 0) goto L_0x028d
            boolean r2 = r0.A0p()
            r3.A03(r1, r2)
        L_0x028d:
            X.OE7 r4 = r0.A0Y
            if (r4 == 0) goto L_0x02be
            r19 = 0
            android.content.Context r6 = r4.A01
            boolean r3 = r4.A02
            int r8 = r1.A0C
            int r9 = r1.A0D
            int r10 = r1.A08
            android.content.res.Resources r5 = r6.getResources()
            r2 = 2131165220(0x7f070024, float:1.794465E38)
            int r11 = r5.getDimensionPixelSize(r2)
            r7 = 0
            r14 = 1
            r12 = 2132017950(0x7f14031e, float:1.9674193E38)
            r13 = 2132017949(0x7f14031d, float:1.967419E38)
            X.Mhg r5 = new X.Mhg
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4.A00 = r5
        L_0x02be:
            X.OZO r3 = r0.A0s
            if (r3 == 0) goto L_0x02ca
            int r2 = r1.A02
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.A00 = r2
        L_0x02ca:
            X.OMw r2 = r0.A0X
            if (r2 == 0) goto L_0x02ea
            r2.A00(r1)
            X.OMw r2 = r0.A0X
            X.3oV r3 = r2.A08
            boolean r2 = r3.CVM()
            if (r2 == 0) goto L_0x02ea
            android.view.View r2 = r3.getView()
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x02ea
            int r2 = r1.A02
            A0e(r0, r2)
        L_0x02ea:
            X.7Ko r0 = r0.A0o
            if (r0 == 0) goto L_0x02f1
            r0.A02(r1)
        L_0x02f1:
            return
        L_0x02f2:
            X.78x r7 = X.C3269878x.A00
            com.instagram.common.session.UserSession r10 = r5.A06
            android.content.Context r8 = r5.A03
            android.view.View r9 = r5.A04
            r11 = r1
            r12 = r3
            r7.A00(r8, r9, r10, r11, r12)
            goto L_0x026b
        L_0x0301:
            android.view.View r3 = r5.A04
            r2 = 2131437189(0x7f0b2685, float:1.849627E38)
            android.view.View r3 = r3.findViewById(r2)
            if (r3 == 0) goto L_0x026b
            int r2 = r1.A02
            r3.setBackgroundColor(r2)
            goto L_0x026b
        L_0x0313:
            X.78s r7 = X.C3269378s.A00
            com.instagram.common.session.UserSession r10 = r5.A06
            android.content.Context r8 = r5.A03
            android.view.View r9 = r5.A04
            r11 = r1
            r12 = r3
            r7.A08(r8, r9, r10, r11, r12)
            goto L_0x026b
        L_0x0322:
            com.instagram.common.session.UserSession r10 = r7.A04
            X.0eM r2 = r7.A09
            java.lang.Object r9 = r2.getValue()
            X.3oV r9 = (X.C252063oV) r9
            android.widget.FrameLayout r11 = r7.A03
            X.0sa r2 = r7.A0A
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            int r13 = r2.intValue()
            r7 = 1
            X.0qQ.A0B(r9, r7)
            r2 = 36320511197716997(0x81095000002205, double:3.032575760171348E-306)
            boolean r2 = X.182.A06(r4, r10, r2)
            if (r2 == 0) goto L_0x0355
            r2 = 36320511198044681(0x81095000052209, double:3.0325757603785765E-306)
            boolean r3 = X.182.A06(r4, r10, r2)
            r2 = 1
            if (r3 != 0) goto L_0x0356
        L_0x0355:
            r2 = 0
        L_0x0356:
            android.view.View r9 = r9.getView()
            if (r2 == 0) goto L_0x0395
            X.0qQ.A0B(r9, r8)
            android.content.Context r10 = r9.getContext()
            int[] r2 = r1.A0K
            if (r2 == 0) goto L_0x0378
            int r2 = r2.length
            if (r2 == 0) goto L_0x0378
            X.0qQ.A0A(r10)
            r16 = r8
            r12 = r1
            r14 = r5
            r15 = r7
            android.graphics.drawable.ShapeDrawable r2 = X.AnonymousClass7BG.A00(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0218
        L_0x0378:
            android.graphics.drawable.shapes.OvalShape r3 = new android.graphics.drawable.shapes.OvalShape
            r3.<init>()
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            r2.<init>(r3)
            r3 = 2131100036(0x7f060184, float:1.7812442E38)
            int r8 = r10.getColor(r3)
            android.graphics.drawable.shapes.Shape r7 = r2.getShape()
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r3 = 0
            X.C308486Ul.A02(r5, r2, r7, r3, r8)
            goto L_0x0218
        L_0x0395:
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r10 = r11
            r11 = r9
            r12 = r1
            r14 = r5
            r15 = r8
            X.AnonymousClass7BG.A01(r10, r11, r12, r13, r14, r15)
            goto L_0x021b
        L_0x03a1:
            java.lang.String r2 = r8.A0C
            r8.A0C = r2
            goto L_0x00bf
        L_0x03a7:
            r4 = 0
            goto L_0x00b0
        L_0x03aa:
            r4 = 0
            goto L_0x005b
        L_0x03ad:
            X.7OF r2 = new X.7OF
            r2.<init>()
            goto L_0x006b
        L_0x03b4:
            int r2 = r1.A02
            A0e(r0, r2)
            X.0wj r4 = X.0wj.A01
            r3 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r2 = "mDirectMessageComposerViewHolder is null"
            X.0f9 r2 = r4.AEf(r2, r3)
            r2.report()
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A1M(X.7L0, boolean):void");
    }

    public final void A1N(AnonymousClass7JY r3) {
        C3260875i A0D2;
        AnonymousClass7H1 r1 = this.A1w;
        if ((r1 instanceof AnonymousClass7H0) && (A0D2 = ((AnonymousClass7H0) r1).A0D(r3)) != null) {
            this.A0b.A05(A0D2);
        }
    }

    public final void A1O(AnonymousClass7JY r9) {
        Editable text = this.A0b.A0S.getText();
        for (OCB ocb : (OCB[]) text.getSpans(0, text.length(), OCB.class)) {
            Integer A032 = ocb.A00.A03();
            if (A032 != null && A032.intValue() == r9.A00) {
                text.replace(text.getSpanStart(ocb), text.getSpanEnd(ocb), "");
            }
        }
    }

    public final void A1P(C56087Hsa hsa, C59583JPd jPd) {
        Context context = this.A1R;
        UserSession userSession = this.A1Z;
        IgMetaSessionImpl A012 = C56316HwT.A01(userSession);
        C56088Hsb hsb = new C56088Hsb(hsa, 182.A01(0Tu.A05, userSession, 36612453009725777L));
        0qQ.A0B(context, 0);
        0qQ.A0B(jPd, 3);
        C59105J6n j6n = new C59105J6n(jPd, 35);
        C55227HeI heI = C54553HIo.A06;
        C56086HsZ hsZ = new C56086HsZ(A012, hsb);
        synchronized (heI) {
            if (!C54553HIo.A05) {
                new C54553HIo(context, hsZ, j6n).A0J();
                C54553HIo.A05 = true;
            }
        }
    }

    public final void A1Q(String str) {
        if ((this.A1w instanceof AnonymousClass7H0) && !C393979xL.A00(str)) {
            ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A0b.A0S;
            composerAutoCompleteTextView.setSelection(0);
            composerAutoCompleteTextView.A04(str);
            composerAutoCompleteTextView.setSelection(composerAutoCompleteTextView.length());
        }
    }

    public final void A1R(List<A52> list) {
        C40368Ab1 ab1;
        C328757Gc r0;
        String str;
        if (list == null) {
            list = new ArrayList<>();
        }
        UserSession userSession = this.A1Z;
        if (182.A06(0Tu.A06, userSession, 36325742468871355L)) {
            AnonymousClass7IR r2 = this.A1d;
            C254783t2 r5 = this.A1z;
            XSV A002 = OP1.A00((AnonymousClass2Ep) this.A22.get());
            Long valueOf = Long.valueOf((long) list.size());
            List A0I2 = A0I(this);
            0wc r22 = r2.A00;
            0Aj A003 = r22.A00(r22.A00, "direct_composer_tap");
            if (A003.isSampled()) {
                A003.AAJ("target", "media_editor_add_message");
                A003.A8M(A002, "thread_type");
                A003.A9F("num_images", valueOf);
                A003.AAe("recipient_ids", A0I2);
                Boolean bool = null;
                if (r5 != null) {
                    str = AnonymousClass4KK.A02(r5);
                } else {
                    str = null;
                }
                A003.AAJ("open_thread_id", str);
                if (r5 != null) {
                    bool = Boolean.valueOf(AnonymousClass6W3.A07(r5));
                }
                A003.A7p("is_e2ee", bool);
                A003.Cgf();
            }
        }
        C329307Ij r1 = this.A0b;
        if (!(r1.A06 == null || (r0 = r1.A08) == null)) {
            r0.A00(list);
            r1.A06.notifyDataSetChanged();
        }
        DirectThreadKey A092 = A09(this);
        if (C70083Nwz.A00(userSession, A092) && A092 != null) {
            for (A52 a52 : list) {
                AnonymousClass9HP r3 = this.A0V;
                0qQ.A0B(a52, 0);
                C41819B1z b1z = a52.A01;
                if ((b1z instanceof C40368Ab1) && (ab1 = (C40368Ab1) b1z) != null) {
                    ab1.A01(new C74185PqR(31, (Object) A092, (Object) r3));
                }
            }
        }
    }

    public final boolean A1S() {
        2Er r0 = this.A0W;
        if (r0 == null || !r0.CUG()) {
            return false;
        }
        return true;
    }

    public final boolean A1T() {
        AnonymousClass2Ep r1 = (AnonymousClass2Ep) this.A22.get();
        if ((r1 == null || C69960Nv0.A00(this.A1Z, r1)) && ((C329757Kc) this.A23.get()).CeY(this.A1Z, A09(this))) {
            return true;
        }
        return false;
    }

    public final boolean A1U() {
        FrameLayout frameLayout = this.A07;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    private int A01(Boolean bool) {
        if (bool.booleanValue()) {
            return Long.valueOf(182.A01(0Tu.A05, this.A1Z, 36597923138440255L)).intValue();
        } else if (A0z(this)) {
            return 10;
        } else {
            if (!A0o() || !A0s(this)) {
                return Integer.MAX_VALUE;
            }
            UserSession userSession = this.A1Z;
            0qQ.A0B(userSession, 0);
            return (int) 182.A01(0Tu.A05, userSession, 36608767927785214L);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        if (r2 != null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005d, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        if (r2.CVa(r1) != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0065, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        r4.A00(r17, r6, r7, r19, r9, r10, r20, r12, r13, r14, r15, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0038, code lost:
        if (r2.CVE() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0058, code lost:
        if (r2.Axj() == false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0B(X.C254933tI r17, X.C329067Hl r18, java.lang.Integer r19, int r20) {
        /*
            java.lang.String r10 = X.HZX.A00()
            r3 = r18
            X.0eK r0 = r3.A22
            java.lang.Object r2 = r0.get()
            X.2Ep r2 = (X.AnonymousClass2Ep) r2
            com.instagram.common.session.UserSession r1 = r3.A1Z
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 46
            X.Plm r4 = new X.Plm
            r4.<init>(r1, r0)
            java.lang.Class<X.A8r> r0 = X.A8r.class
            java.lang.Object r4 = r1.A01(r0, r4)
            X.A8r r4 = (X.A8r) r4
            X.7Sa r0 = r3.A1i
            com.instagram.model.direct.DirectShareTarget r6 = r0.A00()
            int r0 = A00(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L_0x003a
            boolean r0 = r2.CVE()
            r12 = 1
            if (r0 != 0) goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            boolean r13 = r3.A29
            X.0eK r0 = r3.A2P
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            X.0eK r0 = r3.A24
            java.lang.Object r9 = r0.get()
            java.lang.Long r9 = (java.lang.Long) r9
            if (r2 == 0) goto L_0x005a
            boolean r0 = r2.Axj()
            r15 = 1
            if (r0 != 0) goto L_0x005d
        L_0x005a:
            r15 = 0
            if (r2 == 0) goto L_0x0065
        L_0x005d:
            boolean r0 = r2.CVa(r1)
            r16 = 1
            if (r0 != 0) goto L_0x0067
        L_0x0065:
            r16 = 0
        L_0x0067:
            r5 = r17
            r8 = r19
            r11 = r20
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A0B(X.3tI, X.7Hl, java.lang.Integer, int):java.lang.String");
    }

    public static String A0F(C329067Hl r0) {
        String str;
        DirectThreadKey A092 = A09(r0);
        if (A092 == null || (str = A092.A00) == null) {
            return "";
        }
        return str;
    }

    public static List A0I(C329067Hl r0) {
        List list;
        DirectThreadKey A092 = A09(r0);
        if (A092 == null || (list = A092.A02) == null) {
            return new ArrayList();
        }
        return list;
    }

    public static void A0L(Editable editable, C329067Hl r7) {
        A0W(r7);
        if (editable.length() >= 4) {
            String obj = editable.toString();
            Context context = r7.A1R;
            UserSession userSession = r7.A1Z;
            OWT A002 = C70174NyS.A00(context, userSession);
            C254783t2 r1 = r7.A1z;
            0qQ.A0B(r1, 0);
            if ((((r1 instanceof AnonymousClass9HR) && 182.A06(0Tu.A05, userSession, 2342156773019027687L)) || A0y(r7) || (!A0u(r7) && 182.A06(0Tu.A05, userSession, 36324595711619248L))) && A002.A02(obj)) {
                A002.A01(obj);
                if (!A0x(r7)) {
                    OWT A003 = C70174NyS.A00(context, userSession);
                    N2L A004 = A003.A00(obj);
                    if (A004 != null) {
                        byte[] bArr = A004.A09;
                        String str = A004.A07;
                        String str2 = A004.A06;
                        if (r7.A0a != null) {
                            AnonymousClass7L0 r0 = r7.A0U;
                            r0.getClass();
                            A0e(r7, r0.A02);
                            r7.A1B = true;
                            r7.A0a.A02(str, str2, bArr);
                            return;
                        }
                        return;
                    }
                    r7.A1Y.A02(A003.A01.A0T(C60340gF.A00).A0L(new C72024Ouy(A003, obj)).A0N(new C72172Oxh()).A0H().A0P(C318146oT.A01), new PSB(r7));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r4.CVE() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r4.Axj() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r4.CVa(r7) == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0O(X.C254933tI r8, X.C329067Hl r9, com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes r10, java.lang.Integer r11, java.lang.String r12) {
        /*
            int r0 = r12.hashCode()
            com.instagram.common.session.UserSession r7 = r9.A1Z
            r1 = 1
            X.0qQ.A0B(r7, r1)
            X.Nhu r3 = X.C328727Fx.A01(r7, r0)
            if (r3 == 0) goto L_0x00e5
            X.2Er r0 = r9.A0W
            r5 = 0
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r0.CUG()
        L_0x0019:
            r3.onStartFlow(r0)
            r3.onLogDataProcessingStart()
            r3.onLogTransportMessageStart()
            r3.annotateMessageType(r10)
            X.0eK r0 = r9.A22
            java.lang.Object r4 = r0.get()
            X.2Ep r4 = (X.AnonymousClass2Ep) r4
            if (r4 == 0) goto L_0x0036
            boolean r2 = r4.CVa(r7)
            r0 = 1
            if (r2 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r3.annotateIsInstamadillo(r0)
            if (r4 == 0) goto L_0x0043
            boolean r2 = r4.CVE()
            r0 = 1
            if (r2 != 0) goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r3.annotateIsVm(r0)
            if (r4 == 0) goto L_0x0050
            boolean r2 = r4.Axj()
            r0 = 1
            if (r2 != 0) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            r3.annotateIsDm(r0)
            if (r4 == 0) goto L_0x00f4
            X.ODs r0 = r4.B25()
            if (r0 == 0) goto L_0x00f4
            X.ODs r0 = r4.B25()
            java.lang.Long r0 = r0.A01
        L_0x0062:
            r3.annotateEphemeralLifetimeMs(r0)
            if (r11 == 0) goto L_0x0072
            int r2 = r11.intValue()
            java.lang.String r0 = X.AnonymousClass48O.A00(r2)
            r3.annotateThreadType(r2, r0)
        L_0x0072:
            r3.annotateLocalDataId(r12)
            X.3t2 r6 = r9.A1z
            java.lang.String r0 = X.AnonymousClass4KK.A02(r6)
            r3.annotateOpenThreadId(r0)
            r0 = 0
            if (r8 == 0) goto L_0x0082
            r0 = 1
        L_0x0082:
            r3.annotateIsReply(r0)
            if (r8 == 0) goto L_0x008e
            X.2FW r0 = r8.A0F
            java.lang.String r0 = r0.A00
            r3.annotateReplyToType(r0)
        L_0x008e:
            X.0qQ.A0B(r6, r5)
            boolean r4 = r6 instanceof X.AnonymousClass9HR
            if (r4 == 0) goto L_0x00ae
            r3.annotateIsMsys(r1)
            java.lang.Long r0 = X.AnonymousClass4KK.A01(r6)
            r3.annotateOccamadilloThreadId(r0)
            X.3sy r0 = X.AnonymousClass6W3.A06(r6)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = X.C66647MaG.A07(r0)
            if (r0 == 0) goto L_0x00ae
            long r0 = r0.A00
            r3.annotateMsysThreadId(r0)
        L_0x00ae:
            com.instagram.model.direct.DirectThreadKey r0 = A09(r9)
            if (r0 == 0) goto L_0x00cd
            com.instagram.model.direct.DirectThreadKey r2 = A09(r9)
            java.lang.Integer r1 = X.AEM.A00(r10)
            if (r8 == 0) goto L_0x00f2
            boolean r0 = r8.A05()
        L_0x00c2:
            X.797 r0 = X.AnonymousClass796.A04(r7, r2, r1, r0)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00cd
            r5 = 1
        L_0x00cd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            if (r4 == 0) goto L_0x00e6
            X.3tH r2 = X.AnonymousClass6W3.A00(r6)
        L_0x00d7:
            java.lang.String r0 = r2.A00
            r3.annotateTransportType(r0)
            X.3tH r1 = X.C254923tH.ACT
            r0 = 0
            if (r2 != r1) goto L_0x00e2
            r0 = 1
        L_0x00e2:
            r3.annotateIsEncrypted(r0)
        L_0x00e5:
            return
        L_0x00e6:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ef
            X.3tH r2 = X.C254923tH.ACT
            goto L_0x00d7
        L_0x00ef:
            X.3tH r2 = X.C254923tH.DJANGO
            goto L_0x00d7
        L_0x00f2:
            r0 = 0
            goto L_0x00c2
        L_0x00f4:
            r0 = 0
            goto L_0x0062
        L_0x00f7:
            r0 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.A0O(X.3tI, X.7Hl, com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes, java.lang.Integer, java.lang.String):void");
    }

    public static void A0Z(C329067Hl r1) {
        r1.A1C();
        A0e(r1, r1.A0U.A02);
        r1.A0b.A0R.requestFocus();
        r1.A1D();
        A0m(r1, true, true);
        A0T(r1);
        A0W(r1);
        A0U(r1);
        r1.A1B = true;
    }

    public static void A0h(C329067Hl r5, long j) {
        C252063oV r0;
        View view;
        Activity activity;
        if (A0w(r5)) {
            UserSession userSession = r5.A1Z;
            if (!1Au.A00(userSession).A01.getBoolean("meta_ai_discovery_nux_seen", false) && j == 182.A01(0Tu.A05, userSession, 36607677006157410L) && (r0 = (C252063oV) r5.A0b.A0P.A06.getValue()) != null && (view = r0.getView()) != null && (activity = (Activity) 0mE.A00(r5.A1R, FragmentActivity.class)) != null && !activity.isFinishing()) {
                r5.A0J.A04();
                view.postDelayed(new C51504FvC(activity, view, new C40559Ae6(r5), 2131958784), 500);
            }
        }
    }

    private boolean A0o() {
        UserSession userSession;
        0Tu r2;
        long j;
        if (A0v(this)) {
            userSession = this.A1Z;
            r2 = 0Tu.A05;
            j = 36325742468215985L;
        } else if (A03(this) == IGAIAgentType.A05) {
            userSession = this.A1Z;
            r2 = 0Tu.A05;
            j = 36325742468150448L;
        } else if (A03(this) == IGAIAgentType.A08) {
            userSession = this.A1Z;
            r2 = 0Tu.A05;
            j = 36325742468478133L;
        } else if (A03(this) != null) {
            return false;
        } else {
            userSession = this.A1Z;
            r2 = 0Tu.A05;
            j = 36325742468019374L;
        }
        return 182.A06(r2, userSession, j);
    }

    private boolean A0p() {
        if (A0s(this)) {
            if (!182.A06(0Tu.A05, this.A1Z, 36319398804528370L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean A0r() {
        UserSession userSession;
        0Tu r2;
        long j;
        if (A0v(this)) {
            userSession = this.A1Z;
            r2 = 0Tu.A05;
            j = 36325742468281522L;
        } else if (A03(this) != IGAIAgentType.A08) {
            return false;
        } else {
            userSession = this.A1Z;
            r2 = 0Tu.A05;
            j = 36325742468412596L;
        }
        return 182.A06(r2, userSession, j);
    }

    public static boolean A0s(C329067Hl r0) {
        return AnonymousClass48O.A06(Integer.valueOf(A00(r0)));
    }

    public static boolean A0t(C329067Hl r4) {
        if (A09(r4) == null || !AnonymousClass796.A04(r4.A1Z, A09(r4), AnonymousClass05K.A00, false).A00()) {
            return false;
        }
        return true;
    }

    public static boolean A0w(C329067Hl r3) {
        if (A0v(r3)) {
            UserSession userSession = r3.A1Z;
            0qQ.A0B(userSession, 0);
            if (!182.A06(0Tu.A05, userSession, 36324625776390333L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0y(C329067Hl r4) {
        boolean A0u2 = A0u(r4);
        UserSession userSession = r4.A1Z;
        boolean A072 = AnonymousClass796.A07(userSession, A09(r4), AnonymousClass05K.A0C);
        if (!A0u2) {
            return A072;
        }
        if (!A072 || !182.A06(0Tu.A05, userSession, 2342165852579113488L)) {
            return false;
        }
        return true;
    }

    public final void A1A() {
        if (A1U() && !this.A1Q) {
            this.A1Q = true;
            this.A0b.A0R.setOnFocusChangeListener(this.A1U);
            TextWatcher textWatcher = this.A02;
            if (textWatcher != null) {
                this.A0b.A0R.addTextChangedListener(textWatcher);
            }
            this.A07.addOnLayoutChangeListener(this.A2B);
            this.A0u.A0E = AnonymousClass05K.A00;
            OKT okt = this.A0p;
            if (okt != null) {
                okt.A00();
            }
            DirectStickerSuggestionsController directStickerSuggestionsController = this.A0K;
            if (directStickerSuggestionsController != null) {
                directStickerSuggestionsController.A04();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0167, code lost:
        if (X.DcI.A00(r11) == false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0149, code lost:
        if (X.AnonymousClass0t1.A01.A01(r11).A2L() == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x015b, code lost:
        if (X.AnonymousClass0t1.A01.A01(r11).A2L() == false) goto L_0x015d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C329067Hl(android.content.Context r7, android.view.ViewGroup r8, X.C249453jo r9, X.AnonymousClass0iw r10, com.instagram.common.session.UserSession r11, X.AnonymousClass3E6 r12, X.AnonymousClass7H6 r13, X.AnonymousClass7SL r14, X.C331697Sa r15, X.C329057Hk r16, X.C332827Wn r17, X.AnonymousClass9HP r18, X.AnonymousClass9HS r19, X.C331617Rr r20, X.C328757Gc r21, X.C328887Gq r22, X.AnonymousClass7H1 r23, X.C331717Sc r24, X.C331037Pg r25, X.C254783t2 r26, X.C328897Gr r27, java.lang.Boolean r28, java.lang.String r29, X.AnonymousClass0eK r30, X.AnonymousClass0eK r31, X.AnonymousClass0eK r32, X.AnonymousClass0eK r33, X.AnonymousClass0eK r34, X.AnonymousClass0eK r35, boolean r36, boolean r37) {
        /*
            r6 = this;
            r6.<init>()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r6.A1T = r0
            r2 = 0
            r6.A1C = r2
            r6.A10 = r2
            r6.A11 = r2
            r6.A13 = r2
            r6.A19 = r2
            r6.A14 = r2
            r6.A18 = r2
            r6.A12 = r2
            r6.A00 = r2
            r6.A1P = r2
            r6.A0y = r2
            r6.A1E = r2
            r6.A1F = r2
            r6.A1D = r2
            r1 = 0
            r6.A0s = r1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.A1S = r0
            r6.A01 = r2
            r6.A0p = r1
            r6.A0e = r1
            r0 = 1
            r6.A16 = r0
            X.1a8 r0 = new X.1a8
            r0.<init>(r1)
            r6.A1Y = r0
            r6.A0w = r1
            r6.A0x = r1
            X.7Hm r0 = new X.7Hm
            r0.<init>(r6)
            r6.A2G = r0
            X.7Hn r0 = new X.7Hn
            r0.<init>(r6)
            r6.A2I = r0
            X.7Ho r0 = new X.7Ho
            r0.<init>(r6)
            r6.A2E = r0
            X.7Hp r0 = new X.7Hp
            r0.<init>(r6)
            r6.A2J = r0
            X.7Hq r0 = new X.7Hq
            r0.<init>(r6)
            r6.A2K = r0
            X.7Hr r0 = new X.7Hr
            r0.<init>(r6)
            r6.A2L = r0
            X.7Hs r0 = new X.7Hs
            r0.<init>(r6)
            r6.A2M = r0
            X.7Ht r0 = new X.7Ht
            r0.<init>(r6)
            r6.A2H = r0
            X.7Hu r0 = new X.7Hu
            r0.<init>(r6)
            r6.A1U = r0
            X.7Hv r0 = new X.7Hv
            r0.<init>(r6)
            r6.A02 = r0
            X.7Hw r0 = new X.7Hw
            r0.<init>(r6)
            r6.A2B = r0
            X.7Hx r0 = new X.7Hx
            r0.<init>(r6)
            r6.A1q = r0
            X.7Hy r0 = new X.7Hy
            r0.<init>(r6)
            r6.A1h = r0
            X.7I0 r1 = new X.7I0
            r1.<init>(r6)
            r6.A1a = r1
            X.7I1 r3 = new X.7I1
            r3.<init>(r6)
            X.7I2 r0 = new X.7I2
            r0.<init>(r3)
            r6.A1u = r0
            r6.A1R = r7
            boolean r0 = r28.booleanValue()
            r6.A28 = r0
            r0 = r21
            r6.A1N = r0
            r0 = r18
            r6.A0V = r0
            r6.A0N = r14
            r6.A1Z = r11
            X.7I3 r0 = new X.7I3
            r0.<init>(r11)
            r6.A0J = r0
            X.7I6 r0 = X.AnonymousClass7I4.A00(r11)
            r6.A0A = r0
            X.0wc r0 = X.AnonymousClass0kN.A01(r10, r11)
            r6.A2D = r0
            r6.A1b = r12
            r6.A1X = r10
            r6.A1V = r8
            r0 = r23
            r6.A1w = r0
            r6.A1i = r15
            r0 = r20
            r6.A0Z = r0
            r4 = r26
            r6.A1z = r4
            r0 = r37
            r6.A29 = r0
            r0 = r31
            r6.A26 = r0
            r0 = r32
            r6.A2P = r0
            r0 = r33
            r6.A24 = r0
            r0 = r34
            r6.A25 = r0
            r0 = r35
            r6.A23 = r0
            r3 = r30
            r6.A22 = r3
            r6.A1g = r13
            r0 = r24
            r6.A2O = r0
            r0 = r22
            r6.A2N = r0
            r0 = r27
            r6.A20 = r0
            r12.A9Y(r1)
            r0 = r29
            r6.A21 = r0
            r6.A2C = r9
            X.9HW r0 = X.AnonymousClass9HV.A00(r11)
            r6.A1x = r0
            r0 = r25
            r6.A1y = r0
            X.0Tu r5 = X.0Tu.A05
            r0 = 36316435273748851(0x81059b00001173, double:3.029998129441464E-306)
            boolean r0 = X.182.A06(r5, r11, r0)
            r6.A2R = r0
            if (r36 != 0) goto L_0x014b
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r11)
            boolean r1 = r0.A2L()
            r0 = 1
            if (r1 != 0) goto L_0x014c
        L_0x014b:
            r0 = 0
        L_0x014c:
            r6.A2A = r0
            if (r36 != 0) goto L_0x015d
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r11)
            boolean r1 = r0.A2L()
            r0 = 1
            if (r1 != 0) goto L_0x015e
        L_0x015d:
            r0 = 0
        L_0x015e:
            r6.A2S = r0
            if (r36 != 0) goto L_0x0169
            boolean r1 = X.DcI.A00(r11)
            r0 = 1
            if (r1 != 0) goto L_0x016a
        L_0x0169:
            r0 = 0
        L_0x016a:
            r6.A2U = r0
            r0 = r17
            r6.A2F = r0
            r0 = r16
            r6.A1j = r0
            r0 = 36319510470335943(0x81086700001dc7, double:3.0319428961459636E-306)
            boolean r0 = X.182.A06(r5, r11, r0)
            r6.A27 = r0
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r11)
            boolean r0 = r0.A2L()
            if (r0 == 0) goto L_0x0190
            boolean r0 = r4 instanceof X.C254773t1
            if (r0 == 0) goto L_0x0190
            r2 = 1
        L_0x0190:
            r6.A2T = r2
            X.7I7 r0 = new X.7I7
            r0.<init>(r6)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r6.A2Q = r0
            X.7I8 r0 = new X.7I8
            r0.<init>(r7)
            r6.A1m = r0
            X.7I9 r0 = new X.7I9
            r0.<init>(r11, r6)
            X.7IG r0 = X.AnonymousClass7IB.A00(r7, r11, r0)
            r6.A1k = r0
            X.7II r0 = new X.7II
            r0.<init>(r7, r11)
            r6.A1p = r0
            X.7UH r0 = X.AnonymousClass7UG.A00(r11)
            r6.A1n = r0
            X.7IJ r0 = new X.7IJ
            r0.<init>(r11)
            r6.A1f = r0
            X.7IK r0 = new X.7IK
            r0.<init>(r11)
            r6.A1l = r0
            r0 = r19
            r6.A1o = r0
            X.7IL r1 = new X.7IL
            r1.<init>(r6)
            X.7IM r0 = new X.7IM
            r0.<init>(r1)
            r6.A1s = r0
            X.7IN r1 = new X.7IN
            r1.<init>(r3)
            X.7IO r0 = new X.7IO
            r0.<init>(r10, r11, r1)
            r6.A1t = r0
            X.7IR r0 = new X.7IR
            r0.<init>(r10, r11)
            r6.A1d = r0
            X.7IS r0 = new X.7IS
            r0.<init>(r11)
            r6.A1c = r0
            X.7HC r0 = new X.7HC
            r0.<init>(r10, r11)
            r6.A1e = r0
            X.7IT r0 = new X.7IT
            r0.<init>(r11)
            r6.A1W = r0
            X.7IU r0 = new X.7IU
            r0.<init>(r11)
            r6.A1v = r0
            X.7IV r0 = new X.7IV
            r0.<init>(r11)
            r6.A1r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329067Hl.<init>(android.content.Context, android.view.ViewGroup, X.3jo, X.0iw, com.instagram.common.session.UserSession, X.3E6, X.7H6, X.7SL, X.7Sa, X.7Hk, X.7Wn, X.9HP, X.9HS, X.7Rr, X.7Gc, X.7Gq, X.7H1, X.7Sc, X.7Pg, X.3t2, X.7Gr, java.lang.Boolean, java.lang.String, X.0eK, X.0eK, X.0eK, X.0eK, X.0eK, X.0eK, boolean, boolean):void");
    }
}
