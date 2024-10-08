package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.transition.Fade;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.contentnotes.data.ContentNotesRepository$postNote$1;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView;
import com.instagram.direct.inbox.notes.creation.NotesCreationPogView;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.ui.widget.badgeicon.BadgeIconView;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NIn  reason: case insensitive filesystem */
public final class C68449NIn extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "NotesCreationFragment";
    public int A00;
    public View.OnClickListener A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public CardView A07;
    public CardView A08;
    public CardView A09;
    public CardView A0A;
    public RecyclerView A0B;
    public GPK A0C;
    public 2dZ A0D;
    public 1wn A0E;
    public AnonymousClass2t9 A0F;
    public ImageUrl A0G;
    public IgEditText A0H;
    public IgEditText A0I;
    public IgLinearLayout A0J;
    public IgTextView A0K;
    public IgTextView A0L;
    public IgTextView A0M;
    public IgTextView A0N;
    public IgTextView A0O;
    public IgTextView A0P;
    public IgTextView A0Q;
    public IgImageView A0R;
    public IgImageView A0S;
    public IgImageView A0T;
    public IgImageView A0U;
    public C252063oV A0V;
    public C252063oV A0W;
    public C252063oV A0X;
    public C252063oV A0Y;
    public OI6 A0Z;
    public NotesCreationBubbleView A0a;
    public NotesCreationPogView A0b;
    public NoteAudienceItem A0c;
    public C67324Mm0 A0d;
    public IgdsMediaButton A0e;
    public AudioOverlayTrack A0f;
    public BadgeIconView A0g;
    public Integer A0h;
    public Integer A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q = AnonymousClass7TG.A0j();
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v = true;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y = true;
    public boolean A0z;
    public View A10;
    public CardView A11;
    public CardView A12;
    public CardView A13;
    public IgdsSwitch A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public final Handler A19 = AnonymousClass7TF.A0D();
    public final TextWatcher A1A = new C71273OhE(this, 18);
    public final View.OnClickListener A1B = new C71397Ojw(this, 25);
    public final C73082PVp A1C = new C73082PVp(this);
    public final List A1D = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A1E = DbS.A0I(new C73928Pm8(this, 43), new C73928Pm8(this, 26), new C73916Plr(16, (Object) null, this), DbS.A0z(C67738Mtr.class));
    public final AnonymousClass0eM A1F = DbS.A0I(new C73928Pm8(this, 42), new C73928Pm8(this, 27), new C73916Plr(15, (Object) null, this), DbS.A0z(C53016Gh7.class));
    public final AnonymousClass0eM A1G = C73928Pm8.A00(this, 29);
    public final AnonymousClass0eM A1H = C73928Pm8.A00(this, 30);
    public final AnonymousClass0eM A1I = AnonymousClass0eN.A00(0eO.A02, new C73673Phm((Object) null, this, "arg_immersive_content_notes_ui_state", 8));
    public final AnonymousClass0eM A1J = C73928Pm8.A00(this, 31);
    public final AnonymousClass0eM A1K = C73928Pm8.A00(this, 32);
    public final AnonymousClass0eM A1L = C73928Pm8.A00(this, 33);
    public final AnonymousClass0eM A1M = C73928Pm8.A00(this, 34);
    public final AnonymousClass0eM A1N = C73928Pm8.A00(this, 35);
    public final AnonymousClass0eM A1O = C73928Pm8.A00(this, 36);
    public final AnonymousClass0eM A1P = C73928Pm8.A00(this, 37);
    public final AnonymousClass0eM A1Q = C73928Pm8.A00(this, 38);
    public final AnonymousClass0eM A1R = C73928Pm8.A00(this, 39);
    public final AnonymousClass0eM A1S = C73928Pm8.A00(this, 40);
    public final AnonymousClass0eM A1T = C227642jf.A02(this);
    public final TextWatcher A1U = new C71273OhE(this, 17);
    public final View.OnClickListener A1V = new C71397Ojw(this, 18);
    public final View.OnClickListener A1W = new C71397Ojw(this, 26);
    public final C74382Ptx A1X = new C71848Orp(this);
    public final AnonymousClass0eM A1Y = DbS.A0I(new C73928Pm8(this, 41), new C73928Pm8(this, 28), new C73916Plr(14, (Object) null, this), DbS.A0z(C67761MuH.class));

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (X.00l.A05(r4, '@', X.C66581MXm.A04(r4) - 1) != -1) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(android.text.Editable r7, com.instagram.common.ui.base.IgEditText r8, X.C68449NIn r9) {
        /*
            r6 = 0
            if (r7 == 0) goto L_0x0057
            java.lang.String r0 = r7.toString()
            int r5 = X.0mp.A00(r0)
            X.0eM r1 = r9.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            int r0 = X.AnonymousClass4AJ.A00(r0)
            int r5 = r5 - r0
            if (r5 <= 0) goto L_0x0053
            com.instagram.common.ui.base.IgEditText r0 = r9.A0I
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "promptEditText"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0026:
            boolean r0 = r0.isFocused()
            if (r0 != 0) goto L_0x0058
            java.lang.String r4 = r7.toString()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            r0 = 0
            X.0Tu r2 = X.DbS.A0J(r3, r0)
            r0 = 36316074497216426(0x810547000b0faa, double:3.029769972909628E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0058
            r1 = 64
            int r0 = X.C66581MXm.A04(r4)
            int r0 = r0 + -1
            int r1 = X.00l.A05(r4, r1, r0)
            r0 = -1
            if (r1 == r0) goto L_0x0058
        L_0x0053:
            java.lang.String r6 = r7.toString()
        L_0x0057:
            return r6
        L_0x0058:
            int r1 = r7.length()
            int r1 = r1 - r5
            int r0 = r7.length()
            android.text.Editable r7 = r7.delete(r1, r0)
            r8.setText(r7)
            X.C66580MXl.A1E(r8)
            if (r7 == 0) goto L_0x0057
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68449NIn.A03(android.text.Editable, com.instagram.common.ui.base.IgEditText, X.NIn):java.lang.String");
    }

    public static final void A0P(C68449NIn nIn, User user) {
        User user2 = user;
        if (user.A2G()) {
            Number number = (Number) A02(nIn).A0a.getValue();
            if (number != null) {
                int intValue = number.intValue();
                IgEditText igEditText = nIn.A0H;
                if (igEditText != null) {
                    SpannableStringBuilder A0C2 = DbS.A0C(igEditText.getText());
                    A0C2.replace(intValue + 1, A0C2.length(), user.getUsername()).setSpan(new StyleSpan(1), intValue, A0C2.length(), 33);
                    A0C2.append(' ');
                    igEditText.setText(A0C2);
                    IgEditText igEditText2 = nIn.A0H;
                    if (igEditText2 != null) {
                        JTR.A1F(igEditText2);
                        C67761MuH A022 = A02(nIn);
                        C337257fy r0 = A022.A01;
                        if (r0 != null) {
                            r0.EhX((String) null);
                        }
                        A022.A09.Epw((Object) null);
                        return;
                    }
                }
                0qQ.A0F("noteEditText");
                throw AnonymousClass00P.createAndThrow();
            }
            return;
        }
        FGc.A04(nIn.requireContext(), AnonymousClass7TE.A0l(nIn.A1T), user2, (C336187eD) null, "notes", (C62320sa) null, (C62320sa) null);
    }

    public final String getModuleName() {
        return "notes_creation_sheet";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        C67761MuH A022;
        int i3 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        if (i == 8051) {
            String str = null;
            if (intent != null && intent.getData() != null && intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString(AnonymousClass000.A00(1674));
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        z = extras2.getBoolean(C273654mx.A00(781));
                    } else {
                        z = false;
                    }
                    Bundle extras3 = intent.getExtras();
                    if (extras3 != null) {
                        str = extras3.getString("file_path");
                    }
                    if (!z || str == null) {
                        A0R(this, "captured new video");
                        A022 = A02(this);
                        A022.A0R.Epw(intent.getData());
                        A022.A0S.Epw(string);
                    } else {
                        A022 = A02(this);
                        A022.A0Q.Epw(str);
                    }
                    C67761MuH.A02(A022);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        } else if (i == 1361) {
            ImmutableList immutableList = C71024OZb.A01;
            AnonymousClass0eM r1 = this.A1T;
            new C71024OZb(AnonymousClass7TE.A0l(r1)).A01(requireActivity(), intent2, this.A1X, AnonymousClass7TE.A0l(r1), i3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0245  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            r21 = this;
            r0 = 0
            r2 = r22
            X.0qQ.A0B(r2, r0)
            r13 = r21
            r1 = r23
            super.onViewCreated(r2, r1)
            android.view.View r2 = r13.requireView()
            r1 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            android.view.ViewGroup r2 = X.DbX.A0I(r2, r1)
            r5 = 1
            X.Ojw r1 = new X.Ojw
            r1.<init>(r13, r5)
            X.2dZ r2 = X.2dY.A01(r1, r2)
            r13.A0D = r2
            r7 = 3
            X.LcR r1 = new X.LcR
            r1.<init>(r13, r7)
            r2.A0X(r1)
            X.0eM r1 = r13.A1E
            java.lang.Object r1 = r1.getValue()
            X.Mtr r1 = (X.C67738Mtr) r1
            X.0Ud r2 = r1.A04
            r8 = 31
            X.PeL r1 = new X.PeL
            r1.<init>(r13, r8)
            X.C69976NvG.A00(r13, r1, r2)
            X.MuH r1 = A02(r13)
            X.0Ud r2 = r1.A0e
            r6 = 32
            X.PeL r1 = new X.PeL
            r1.<init>(r13, r6)
            X.C69976NvG.A00(r13, r1, r2)
            X.MuH r1 = A02(r13)
            X.0Ud r3 = r1.A0Z
            r2 = 33
            X.PeL r1 = new X.PeL
            r1.<init>(r13, r2)
            X.C69976NvG.A00(r13, r1, r3)
            X.0xx r3 = X.DbW.A0E(r13)
            r14 = 0
            r1 = 34
            X.Pfm r2 = new X.Pfm
            r2.<init>(r13, r14, r1)
            X.19B r1 = X.19B.A00
            X.1Eo.A05(r1, r2, r3)
            X.0xx r4 = X.DbW.A0E(r13)
            r3 = 36
            X.Pfm r2 = new X.Pfm
            r2.<init>(r13, r14, r3)
            X.1Eo.A05(r1, r2, r4)
            boolean r2 = r13.A0a()
            if (r2 == 0) goto L_0x00bb
            X.MuH r4 = A02(r13)
            android.content.Context r15 = r13.requireContext()
            X.0eM r2 = r13.A1T
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r2)
            X.0gy r16 = X.AnonymousClass07i.A00(r13)
            java.lang.String r18 = "story_user_tag_page"
            r19 = r5
            r20 = r0
            X.7fy r3 = X.AnonymousClass8C6.A01(r15, r16, r17, r18, r19, r20)
            r4.A01 = r3
            X.PPb r2 = new X.PPb
            r2.<init>(r4, r5)
            r3.EcJ(r2)
            X.MuH r2 = A02(r13)
            X.0Ud r4 = r2.A0i
            r3 = 4
            X.Pe1 r2 = new X.Pe1
            r2.<init>(r13, r3)
            X.C69976NvG.A00(r13, r2, r4)
        L_0x00bb:
            boolean r2 = A0f(r13)
            if (r2 == 0) goto L_0x00e4
            X.07U r12 = X.07U.A05
            X.07Z r11 = r13.getViewLifecycleOwner()
            X.0xx r2 = X.AnonymousClass07a.A00(r11)
            r15 = 27
            X.MHI r10 = new X.MHI
            r10.<init>(r11, r12, r13, r14, r15)
            X.07Z r11 = X.JTP.A0I(r13, r1, r10, r2)
            X.0xx r2 = X.AnonymousClass07a.A00(r11)
            r15 = 29
            X.MHI r10 = new X.MHI
            r10.<init>(r11, r12, r13, r14, r15)
            X.1Eo.A05(r1, r10, r2)
        L_0x00e4:
            com.instagram.common.session.UserSession r9 = X.C66580MXl.A0Q(r13)
            X.0Tu r4 = X.0Tu.A05
            r2 = 36329577873752269(0x81118f000140cd, double:3.038309562604628E-306)
            boolean r2 = X.182.A06(r4, r9, r2)
            if (r2 == 0) goto L_0x0109
            X.07U r12 = X.07U.A05
            X.07Z r11 = r13.getViewLifecycleOwner()
            X.0xx r2 = X.AnonymousClass07a.A00(r11)
            r15 = 28
            X.MHI r10 = new X.MHI
            r10.<init>(r11, r12, r13, r14, r15)
            X.1Eo.A05(r1, r10, r2)
        L_0x0109:
            X.0eM r9 = r13.A1T
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r9)
            boolean r2 = A0c(r13)
            if (r2 != 0) goto L_0x0131
            boolean r2 = A0g(r13)
            if (r2 != 0) goto L_0x0131
            boolean r2 = X.AnonymousClass4AJ.A06(r3)
            if (r2 == 0) goto L_0x0131
            X.MuH r2 = A02(r13)
            X.0Ud r10 = r2.A0c
            r3 = 37
            X.PeL r2 = new X.PeL
            r2.<init>(r13, r3)
            X.C69976NvG.A00(r13, r2, r10)
        L_0x0131:
            boolean r2 = r13.A0Z()
            if (r2 == 0) goto L_0x0143
            X.0xx r3 = X.DbW.A0E(r13)
            X.Pfm r2 = new X.Pfm
            r2.<init>(r13, r14, r8)
            X.1Eo.A05(r1, r2, r3)
        L_0x0143:
            boolean r2 = r13.A0X()
            if (r2 == 0) goto L_0x0155
            X.0xx r3 = X.DbW.A0E(r13)
            X.Pfm r2 = new X.Pfm
            r2.<init>(r13, r14, r6)
            X.1Eo.A05(r1, r2, r3)
        L_0x0155:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r9)
            X.1Am r2 = X.1Al.A01(r2)
            X.1An r10 = X.1An.A2K
            java.lang.Class r6 = r13.getClass()
            X.0xa r3 = r2.A04(r10, r6)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r9)
            X.1Av r12 = X.1Au.A00(r2)
            boolean r2 = r13.A0w
            if (r2 != 0) goto L_0x026e
            boolean r2 = A0c(r13)
            if (r2 != 0) goto L_0x026e
            boolean r2 = A0g(r13)
            if (r2 != 0) goto L_0x026e
            X.0eM r2 = r13.A1L
            boolean r2 = X.AnonymousClass7TF.A1Z(r2)
            if (r2 != 0) goto L_0x026e
            java.lang.String r2 = "NOTES_CREATION_NUX_SHOWN"
            boolean r2 = r3.getBoolean(r2, r0)
            if (r2 != 0) goto L_0x026e
            X.0s0 r11 = r12.A4C
            X.0YZ[] r3 = X.1Av.A8a
            r2 = 397(0x18d, float:5.56E-43)
            boolean r2 = X.AnonymousClass7TG.A1a(r12, r11, r3, r2)
            if (r2 != 0) goto L_0x026e
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r9)
            X.1Am r2 = X.1Al.A01(r2)
            X.0xa r11 = r2.A04(r10, r6)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r9)
            X.1Av r12 = X.1Au.A00(r2)
            X.MuH r2 = A02(r13)
            X.6oS r3 = X.C318116oQ.A00(r2)
            X.MHI r10 = new X.MHI
            r15 = r8
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x01bd:
            X.1Eo.A05(r1, r10, r3)
        L_0x01c0:
            X.0eM r1 = r13.A1L
            boolean r1 = X.AnonymousClass7TF.A1Z(r1)
            if (r1 == 0) goto L_0x020c
            com.instagram.common.ui.base.IgEditText r3 = r13.A0I
            java.lang.String r6 = "promptEditText"
            if (r3 == 0) goto L_0x037f
            X.0eM r2 = r13.A1S
            java.lang.String r1 = X.DbS.A0t(r2)
            r3.setText(r1)
            com.instagram.common.ui.base.IgEditText r1 = r13.A0I
            if (r1 == 0) goto L_0x037f
            r1.setEnabled(r0)
            com.instagram.common.ui.base.IgEditText r1 = r13.A0I
            if (r1 == 0) goto L_0x037f
            r1.setFocusable(r0)
            com.instagram.common.ui.base.IgEditText r1 = r13.A0I
            if (r1 == 0) goto L_0x037f
            r1.setActivated(r0)
            X.MuH r6 = A02(r13)
            X.0eM r0 = r13.A1R
            java.lang.String r3 = X.DbS.A0t(r0)
            java.lang.String r2 = X.DbS.A0t(r2)
            X.05G r1 = r6.A0E
            X.NjF r0 = X.C69314NjF.PROMPT_NOTE
            r1.Epw(r0)
            if (r2 == 0) goto L_0x0205
            r6.A06 = r2
        L_0x0205:
            if (r3 == 0) goto L_0x0209
            r6.A07 = r3
        L_0x0209:
            X.C67761MuH.A02(r6)
        L_0x020c:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r9)
            X.0qQ.A0B(r0, r5)
            X.02m r2 = X.02m.A0p
            r1 = 275915176(0x107221a8, float:4.7752013E-29)
            r0 = 2
            r2.markerEnd(r1, r0)
            X.0eM r0 = r13.A1P
            java.lang.Object r3 = r0.getValue()
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            if (r3 == 0) goto L_0x026d
            boolean r0 = r3.A2G()
            if (r0 == 0) goto L_0x026d
            java.lang.String r0 = r3.getUsername()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x026d
            com.instagram.common.session.UserSession r2 = X.C66580MXl.A0Q(r13)
            r0 = 36323161194245057(0x810bb9001a2bc1, double:3.0342516286463725E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x026d
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "@"
            r1.append(r0)
            java.lang.String r0 = r3.getUsername()
            r1.append(r0)
            com.instagram.common.ui.base.IgEditText r0 = r13.A0H
            java.lang.String r6 = "noteEditText"
            if (r0 == 0) goto L_0x037f
            r0.setText(r1)
            A0P(r13, r3)
            com.instagram.common.ui.base.IgEditText r0 = r13.A0H
            if (r0 == 0) goto L_0x037f
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            r13.A0p = r0
            r13.A0z = r5
        L_0x026d:
            return
        L_0x026e:
            boolean r2 = r13.A0Y()
            if (r2 == 0) goto L_0x02aa
            X.0r1 r3 = new X.0r1
            r3.<init>()
            X.Lyv r11 = new X.Lyv
            r11.<init>(r0, r3, r13)
            X.0eE r6 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r9)
            com.instagram.user.model.User r2 = r6.A01(r2)
            X.4Cl r2 = r2.A03
            java.lang.Boolean r2 = r2.CcO()
            boolean r6 = X.AnonymousClass7TG.A1X(r2)
            X.Ojx r12 = new X.Ojx
            r12.<init>((int) r7, (java.lang.Object) r13, (java.lang.Object) r3, (boolean) r6)
            X.MuH r2 = A02(r13)
            X.6oS r3 = X.C318116oQ.A00(r2)
            r15 = 9
            X.JTf r10 = new X.JTf
            r16 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x01bd
        L_0x02aa:
            boolean r2 = A0f(r13)
            if (r2 == 0) goto L_0x02dd
            boolean r2 = A0g(r13)
            if (r2 != 0) goto L_0x02dd
            java.lang.Object r2 = X.C67761MuH.A00(r13)
            if (r2 != 0) goto L_0x02dd
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r9)
            X.0xa r3 = X.AnonymousClass7TE.A0q(r2)
            java.lang.String r2 = "has_seen_video_pog_creation_nux"
            boolean r2 = r3.getBoolean(r2, r0)
            if (r2 != 0) goto L_0x02dd
            X.MuH r2 = A02(r13)
            X.6oS r3 = X.C318116oQ.A00(r2)
            r2 = 37
            X.Pfm r10 = new X.Pfm
            r10.<init>(r13, r14, r2)
            goto L_0x01bd
        L_0x02dd:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r9)
            X.1Am r2 = X.1Al.A01(r2)
            X.0xa r8 = r2.A04(r10, r6)
            boolean r2 = r13.A0w
            if (r2 != 0) goto L_0x0335
            boolean r2 = A0c(r13)
            if (r2 != 0) goto L_0x0335
            boolean r2 = A0g(r13)
            if (r2 != 0) goto L_0x0335
            X.0eM r2 = r13.A1L
            boolean r2 = X.AnonymousClass7TF.A1Z(r2)
            if (r2 != 0) goto L_0x0335
            com.instagram.common.session.UserSession r7 = X.C66580MXl.A0Q(r13)
            r2 = 36323255681821728(0x810bcf00002c20, double:3.03431138297033E-306)
            boolean r2 = X.182.A06(r4, r7, r2)
            if (r2 == 0) goto L_0x0335
            java.lang.String r2 = "NOTES_CHAT_NUX_SHOWN"
            boolean r2 = r8.getBoolean(r2, r0)
            if (r2 != 0) goto L_0x0335
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r9)
            X.1Am r2 = X.1Al.A01(r2)
            X.0xa r6 = r2.A04(r10, r6)
            X.MuH r2 = A02(r13)
            X.6oS r3 = X.C318116oQ.A00(r2)
            r2 = 49
        L_0x032e:
            X.Pfp r10 = new X.Pfp
            r10.<init>(r6, r13, r14, r2)
            goto L_0x01bd
        L_0x0335:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r9)
            X.1Am r2 = X.1Al.A01(r2)
            X.0xa r6 = r2.A04(r10, r6)
            boolean r2 = r13.A0w
            if (r2 != 0) goto L_0x01c0
            boolean r2 = A0c(r13)
            if (r2 != 0) goto L_0x01c0
            boolean r2 = A0g(r13)
            if (r2 != 0) goto L_0x01c0
            com.instagram.common.session.UserSession r7 = X.C66580MXl.A0Q(r13)
            r2 = 36321310061634811(0x810a0a000024fb, double:3.03308096492974E-306)
            boolean r2 = X.182.A06(r4, r7, r2)
            if (r2 == 0) goto L_0x01c0
            java.lang.String r2 = "NOTES_PROMPTS_NUX_SHOWN"
            boolean r2 = r6.getBoolean(r2, r0)
            if (r2 != 0) goto L_0x01c0
            X.0eM r2 = r13.A1L
            boolean r2 = X.AnonymousClass7TF.A1Z(r2)
            if (r2 != 0) goto L_0x01c0
            boolean r2 = r13.A0u
            if (r2 != 0) goto L_0x01c0
            X.MuH r2 = A02(r13)
            X.6oS r3 = X.C318116oQ.A00(r2)
            r2 = 46
            goto L_0x032e
        L_0x037f:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68449NIn.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final ImageUrl A01(C68449NIn nIn) {
        AnonymousClass0eM r5 = nIn.A1T;
        if (!182.A06(0Tu.A06, AnonymousClass7TE.A0l(r5), 36324668726194392L)) {
            0eE r4 = AnonymousClass0t1.A01;
            if (r4.A01(AnonymousClass7TE.A0l(r5)).A0E() != null) {
                if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(r5), 36324668726128855L)) {
                    return r4.A01(AnonymousClass7TE.A0l(r5)).A0E();
                }
            }
        }
        return AnonymousClass0t1.A01.A01(AnonymousClass7TE.A0l(r5)).Bh3();
    }

    public static final C67761MuH A02(C68449NIn nIn) {
        return (C67761MuH) nIn.A1Y.getValue();
    }

    public static final void A09(C69506Nmo nmo, C68449NIn nIn) {
        AnonymousClass0eM r3 = nIn.A1T;
        C3018660j.A01(AnonymousClass7TE.A0l(r3)).A0C(nmo);
        AnonymousClass9PJ.A00(AnonymousClass7TE.A0l(r3)).A07(28D.A3f, true);
        Bundle A0B2 = DbY.A0B("arg_is_in_friend_map_mode", Boolean.valueOf(A0g(nIn)));
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(nIn.getActivity(), A0B2, AnonymousClass7TE.A0l(r3), TransparentModalActivity.class, C273654mx.A00(1010));
        A022.A0J = ModalActivity.A07;
        A022.A0D(nIn, 8051);
    }

    public static final void A0B(C68449NIn nIn) {
        String str;
        View view = nIn.A02;
        if (view == null) {
            str = "audiencePickerContainer";
        } else {
            0nA.A0N(view);
            FragmentActivity requireActivity = nIn.requireActivity();
            UserSession A0l2 = AnonymousClass7TE.A0l(nIn.A1T);
            boolean A0c2 = A0c(nIn);
            boolean A0g2 = A0g(nIn);
            NoteAudienceItem noteAudienceItem = nIn.A0c;
            if (noteAudienceItem == null) {
                str = "currentAudience";
            } else {
                C72959PQr pQr = new C72959PQr(nIn, 9);
                boolean A1X2 = DbW.A1X(A0l2);
                C68490NKj nKj = new C68490NKj();
                C331127Pr A0V2 = DbV.A0V(AnonymousClass7TG.A0P("is_friend_map", Boolean.valueOf(A0g2), C66581MXm.A14("is_content_note", A0c2)), nKj, A0l2);
                DbZ.A0z(requireActivity, A0V2, 2131956914);
                C331137Ps A0h2 = C51971G9r.A0h(A1X2 ? 1 : 0);
                A0h2.A06 = requireActivity.getString(2131956915);
                A0h2.A05 = new C71405Ok4(69, nKj, noteAudienceItem);
                A0V2.A0Q = A0h2.A00();
                A0V2.A0U = pQr;
                DbU.A0y(requireActivity, nKj, A0V2);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0C(C68449NIn nIn) {
        if (!nIn.A0t) {
            View view = nIn.A03;
            if (view == null) {
                0qQ.A0F("avatarContainer");
                throw AnonymousClass00P.createAndThrow();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), 0.0f});
            ofFloat.setDuration(250);
            ofFloat.start();
        }
    }

    public static final void A0E(C68449NIn nIn) {
        boolean z;
        Parcelable parcelable;
        NoteCreationSource noteCreationSource;
        NoteCreationSource noteCreationSource2;
        C68449NIn nIn2 = nIn;
        C69288Nio nio = (C69288Nio) A02(nIn2).A0e.getValue();
        int ordinal = nio.ordinal();
        if (ordinal == 2) {
            NoteAudienceItem noteAudienceItem = nIn2.A0c;
            if (noteAudienceItem == null) {
                0qQ.A0F("currentAudience");
                throw AnonymousClass00P.createAndThrow();
            }
            boolean A1V2 = AnonymousClass7TF.A1V(C67761MuH.A00(nIn2));
            boolean A1V3 = AnonymousClass7TF.A1V(C67761MuH.A01(nIn2));
            Bundle bundle = nIn2.mArguments;
            if (bundle != null) {
                z = bundle.getBoolean("arg_is_from_try_it");
            } else {
                z = false;
            }
            Bundle bundle2 = nIn2.mArguments;
            Parcelable parcelable2 = null;
            if (bundle2 != null) {
                parcelable = bundle2.getParcelable("arg_music_to_display");
            } else {
                parcelable = null;
            }
            if (parcelable instanceof AudioOverlayTrack) {
                parcelable2 = parcelable;
            }
            boolean z2 = !AnonymousClass7TF.A1Y(parcelable2, false);
            if (A1V2 || A1V3) {
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                if (A1V2) {
                    AnonymousClass3Q2 A032 = 28K.A00(AnonymousClass7TE.A0l(nIn2.A1T)).A03((String) A02(nIn2).A0X.getValue());
                    if (A032 == null) {
                        A032 = AnonymousClass9T3.A02(JTQ.A0Z());
                        A032.A0i(String.valueOf(C67761MuH.A00(nIn2)));
                        A032.A3L = A032.A3V;
                        A032.A0e(ShareType.VIDEO_IN_NOTE_POG);
                        A032.A0N = 11;
                        A032.A02 = 1.0f;
                    } else {
                        A032.A0e(ShareType.VIDEO_IN_NOTE_POG);
                        A032.A0N = 11;
                    }
                    A032.A5F = true;
                    A032.A0a(new 1vK());
                    A1C2.add(A032);
                }
                if (A1V3) {
                    AnonymousClass3Q2 A012 = AnonymousClass9T3.A01(JTQ.A0Z());
                    String valueOf = String.valueOf(C67761MuH.A01(nIn2));
                    A012.A33 = valueOf;
                    A012.A3L = valueOf;
                    A012.A0e(ShareType.VIDEO_IN_NOTE_POG);
                    A012.A0N = 11;
                    A012.A0a(new 1vK());
                    A1C2.add(A012);
                }
                C67761MuH A022 = A02(nIn2);
                Context requireContext = nIn2.requireContext();
                if (nIn2.A0w) {
                    noteCreationSource = NoteCreationSource.PROFILE_HEADER;
                } else {
                    noteCreationSource = NoteCreationSource.INBOX_TRAY;
                }
                A022.A06(requireContext, noteAudienceItem, noteCreationSource, nIn2.A0q, A1C2, z, z2);
                Dbb.A0z(nIn2);
            } else {
                String str = nIn2.A0l;
                if (str == null || str.length() == 0) {
                    C67761MuH A023 = A02(nIn2);
                    Context requireContext2 = nIn2.requireContext();
                    if (nIn2.A0w) {
                        noteCreationSource2 = NoteCreationSource.PROFILE_HEADER;
                    } else {
                        noteCreationSource2 = NoteCreationSource.INBOX_TRAY;
                    }
                    A023.A06(requireContext2, noteAudienceItem, noteCreationSource2, nIn2.A0q, 0sn.A00, z, z2);
                } else {
                    C67761MuH A024 = A02(nIn2);
                    String str2 = nIn2.A0l;
                    if (str2 != null) {
                        String str3 = nIn2.A0n;
                        String str4 = nIn2.A0k;
                        if (str4 == null) {
                            str4 = "notes_creation_sheet";
                        }
                        GPK gpk = nIn2.A0C;
                        if (gpk == null) {
                            gpk = GPK.UNKNOWN;
                        }
                        String str5 = nIn2.A0m;
                        String str6 = nIn2.A0o;
                        Integer num = nIn2.A0i;
                        String str7 = nIn2.A0j;
                        Integer num2 = nIn2.A0h;
                        String A0m2 = DbU.A0m(nIn2, 2131968569);
                        ImageUrl imageUrl = nIn2.A0G;
                        AnonymousClass4JK r6 = A024.A0N;
                        String str8 = A024.A05;
                        if (str8 == null) {
                            str8 = "";
                        }
                        if (182.A06(0Tu.A05, A024.A0M, 36323161194179520L)) {
                            str8 = new 11S("[\n\r\t]|\\\\[nrt]").A00(str8, " ");
                        }
                        NoteAudience noteAudience = noteAudienceItem.A00;
                        0qQ.A0B(noteAudience, 3);
                        String str9 = str5;
                        String str10 = str6;
                        GPK gpk2 = gpk;
                        ImageUrl imageUrl2 = imageUrl;
                        AnonymousClass4JK r15 = r6;
                        AnonymousClass7TE.A1Z(new ContentNotesRepository$postNote$1(gpk2, imageUrl2, r15, noteAudience, num, num2, str2, str8, str4, str9, str10, str7, A0m2, str3, (AnonymousClass4D7) null, 2131966155), r6.A01);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                OI6 oi6 = nIn2.A0Z;
                if (nIn2.A0t && oi6 != null) {
                    LN3.A00((LN3) nIn2.A1K.getValue(), oi6);
                }
                Dbb.A0z(nIn2);
            }
            C247323g9.A00(AnonymousClass7TE.A0l(nIn2.A1T));
        } else if (ordinal == 1 || ordinal == 0) {
            boolean A1W2 = AnonymousClass7TF.A1W(nio, C69288Nio.NoteWithoutPrompt);
            1xC r3 = 1xC.A01;
            C310336ap A0a2 = DbS.A0a();
            int i = 2131970844;
            if (A1W2) {
                i = 2131970843;
            }
            A0a2.A0D = nIn2.getString(i);
            A0a2.A02();
            A0a2.A07(R.drawable.instagram_error_pano_outline_24);
            DbY.A1K(r3, A0a2);
        }
    }

    public static final void A0F(C68449NIn nIn) {
        if (AnonymousClass7TF.A1Z(nIn.A1L) || !nIn.A0Z()) {
            IgLinearLayout igLinearLayout = nIn.A0J;
            if (igLinearLayout != null) {
                igLinearLayout.setVisibility(8);
                return;
            }
        } else {
            IgLinearLayout igLinearLayout2 = nIn.A0J;
            if (igLinearLayout2 != null) {
                C66580MXl.A1D(C66583MXo.A0E(igLinearLayout2.animate(), 0.0f), new C73076PVj(nIn));
                return;
            }
        }
        0qQ.A0F("noteTypeEntryPointsLayout");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (X.182.A06(X.0Tu.A05, X.C66580MXl.A0Q(r7), 36321310062880013L) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0G(X.C68449NIn r7) {
        /*
            android.view.View r6 = r7.A02
            if (r6 != 0) goto L_0x000e
            java.lang.String r3 = "audiencePickerContainer"
        L_0x0006:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            X.0eM r0 = r7.A1L
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r4 = 8
            r2 = 0
            if (r0 == 0) goto L_0x002c
            com.instagram.common.session.UserSession r5 = X.C66580MXl.A0Q(r7)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321310062880013(0x810a0a0013250d, double:3.033080965717211E-306)
            boolean r1 = X.182.A06(r3, r5, r0)
            r0 = 8
            if (r1 != 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r6.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0B
            if (r0 == 0) goto L_0x0037
            r0.setVisibility(r4)
        L_0x0037:
            A0J(r7)
            boolean r0 = A0e(r7)
            if (r0 == 0) goto L_0x0047
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r7.A0e
            if (r0 == 0) goto L_0x0047
            r0.setVisibility(r2)
        L_0x0047:
            com.instagram.common.ui.base.IgTextView r0 = r7.A0N
            java.lang.String r3 = "mentionsDisclaimerTextView"
            if (r0 == 0) goto L_0x0006
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x008c
            android.view.View r1 = r7.mView
            X.C66580MXl.A1R(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.UF6 r0 = new X.UF6
            r0.<init>()
            X.C14283TtH.A02(r1, r0)
            com.instagram.common.ui.base.IgTextView r0 = r7.A0N
            if (r0 == 0) goto L_0x0006
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgTextView r0 = r7.A0K
            java.lang.String r3 = "characterCounterTextView"
            if (r0 == 0) goto L_0x0006
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x008c
            X.MuH r0 = A02(r7)
            X.0Ud r0 = r0.A0Y
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x008c
            com.instagram.common.ui.base.IgTextView r0 = r7.A0K
            if (r0 == 0) goto L_0x0006
            r0.setVisibility(r2)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68449NIn.A0G(X.NIn):void");
    }

    public static final void A0L(C68449NIn nIn) {
        String str;
        C69314NjF njF;
        IgEditText igEditText = nIn.A0H;
        String str2 = "noteEditText";
        if (igEditText != null) {
            igEditText.requestFocus();
            nIn.A0u = false;
            if (A0f(nIn)) {
                A0M(nIn);
                A0A(nIn);
            }
            IgEditText igEditText2 = nIn.A0H;
            if (igEditText2 == null) {
                str = str2;
            } else {
                igEditText2.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                IgEditText igEditText3 = nIn.A0I;
                str = "promptEditText";
                if (igEditText3 != null) {
                    igEditText3.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                    View view = nIn.A05;
                    if (view == null) {
                        str = "bubbleNestedScrollView";
                    } else {
                        view.setOnTouchListener((View.OnTouchListener) null);
                        IgEditText igEditText4 = nIn.A0I;
                        if (igEditText4 != null) {
                            igEditText4.removeTextChangedListener(nIn.A1A);
                            View view2 = nIn.A03;
                            if (view2 == null) {
                                str2 = "avatarContainer";
                            } else {
                                A08(view2, Integer.valueOf(R.dimen.abc_dropdownitem_icon_width), (0sP) null);
                                IgEditText igEditText5 = nIn.A0I;
                                if (igEditText5 != null) {
                                    DbS.A1C(igEditText5);
                                    IgEditText igEditText6 = nIn.A0I;
                                    if (igEditText6 != null) {
                                        igEditText6.setVisibility(8);
                                        IgImageView igImageView = nIn.A0T;
                                        if (igImageView == null) {
                                            str2 = "promptXButton";
                                        } else {
                                            igImageView.setVisibility(8);
                                            IgImageView igImageView2 = nIn.A0S;
                                            if (igImageView2 != null) {
                                                igImageView2.setVisibility(8);
                                            }
                                            C66581MXm.A1K(nIn, 8);
                                            IgEditText igEditText7 = nIn.A0H;
                                            if (igEditText7 != null) {
                                                igEditText7.requestFocus();
                                                IgEditText igEditText8 = nIn.A0H;
                                                if (igEditText8 != null) {
                                                    C66580MXl.A1E(igEditText8);
                                                    IgEditText igEditText9 = nIn.A0H;
                                                    if (igEditText9 != null) {
                                                        C69979NvJ.A00(igEditText9);
                                                        C67761MuH A022 = A02(nIn);
                                                        05G r2 = A022.A0E;
                                                        if (r2.getValue() == C69314NjF.PROMPT_NOTE_WITH_MUSIC) {
                                                            njF = C69314NjF.MUSIC_NOTE;
                                                        } else {
                                                            njF = C69314NjF.A06;
                                                        }
                                                        r2.Epw(njF);
                                                        A022.A06 = null;
                                                        C67761MuH.A02(A022);
                                                        IgEditText igEditText10 = nIn.A0H;
                                                        if (igEditText10 != null) {
                                                            igEditText10.setHint(A04(nIn));
                                                            A0N(nIn);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0N(C68449NIn nIn) {
        NotesCreationBubbleView notesCreationBubbleView = nIn.A0a;
        String str = "bubbleView";
        if (notesCreationBubbleView != null) {
            notesCreationBubbleView.getLayoutParams().width = -2;
            NotesCreationBubbleView notesCreationBubbleView2 = nIn.A0a;
            if (notesCreationBubbleView2 != null) {
                C66580MXl.A1C(notesCreationBubbleView2.A00, -2);
                NotesCreationBubbleView notesCreationBubbleView3 = nIn.A0a;
                if (notesCreationBubbleView3 != null) {
                    C66580MXl.A1B(notesCreationBubbleView3.A00, -2);
                    IgEditText igEditText = nIn.A0H;
                    str = "noteEditText";
                    if (igEditText != null) {
                        C66580MXl.A1C(igEditText, -2);
                        IgEditText igEditText2 = nIn.A0H;
                        if (igEditText2 != null) {
                            Editable text = igEditText2.getText();
                            if (!(text == null || text.length() == 0)) {
                                IgEditText igEditText3 = nIn.A0H;
                                if (igEditText3 != null) {
                                    igEditText3.setHint("");
                                }
                            }
                            C319756rA r3 = C319756rA.A00;
                            IgEditText igEditText4 = nIn.A0H;
                            if (igEditText4 != null) {
                                r3.A04(igEditText4, new C73928Pm8(nIn, 44), false, true);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0O(C68449NIn nIn, AudioOverlayTrack audioOverlayTrack, boolean z) {
        if (audioOverlayTrack != null) {
            AnonymousClass0eM r5 = nIn.A1T;
            UserSession A0l2 = AnonymousClass7TE.A0l(r5);
            L1S l1s = new L1S(nIn);
            C67761MuH A022 = A02(nIn);
            AnonymousClass7TF.A1D(A0l2, 0, A022);
            Bundle A092 = DbY.A09(A0l2);
            A092.putBoolean("is_existing_track", z);
            A092.putParcelable("selected_audio_track", audioOverlayTrack);
            K7I k7i = new K7I();
            k7i.setArguments(A092);
            k7i.A00 = l1s;
            k7i.A01 = A022;
            C331127Pr A0W2 = DbS.A0W(AnonymousClass7TE.A0l(r5));
            A0W2.A0T = k7i;
            A0W2.A0U = new C65745Lyz(nIn, 12);
            DbY.A13(nIn, k7i, A0W2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.0r1, java.lang.Object] */
    public static final void A0Q(C68449NIn nIn, String str) {
        C68449NIn nIn2 = nIn;
        27p.A01(DbX.A0U(nIn2)).A03.A07(str);
        IgEditText igEditText = nIn2.A0H;
        Object obj = null;
        if (igEditText == null) {
            0qQ.A0F("noteEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        0nA.A0N(igEditText);
        ? obj2 = new Object();
        0rm A112 = C51965G9l.A11();
        C61081JwJ jwJ = (C61081JwJ) A02(nIn2).A0c.getValue();
        if (jwJ != null) {
            obj = jwJ.A00;
        }
        A112.A00 = obj;
        ? obj3 = new Object();
        Context requireContext = nIn2.requireContext();
        UserSession A0l2 = AnonymousClass7TE.A0l(nIn2.A1T);
        AnonymousClass80X r18 = AnonymousClass80X.UNINITIALIZED;
        ImmutableList of = ImmutableList.of(AudioTrackType.ORIGINAL, AudioTrackType.REACTIVE);
        0qQ.A07(of);
        C65106LnU lnU = new C65106LnU(nIn2, obj2, obj3, A112);
        P01 p01 = new P01(nIn2, obj3, obj2, A112);
        MusicProduct musicProduct = MusicProduct.MUSIC_NOTES;
        boolean A0X2 = nIn2.A0X();
        new C3515789k(requireContext, C3515589i.CHOOSE_MUSIC_ON_NOTES, of, musicProduct, nIn2, A0l2, (TargetViewSizeProvider) null, (C3506485o) null, (C3502083s) null, p01, lnU, (MusicAttributionConfig) null, C3515689j.UNKNOWN, r18, (String) null, false, true, false, !AnonymousClass1GD.A03(), A0X2).A0A((AudioOverlayTrack) null, (MusicOverlaySearchTab) null, false, false);
    }

    public static final void A0R(C68449NIn nIn, String str) {
        C67324Mm0 mm0 = nIn.A0d;
        if (mm0 != null) {
            mm0.A02(C66580MXl.A10("notes_creation_sheet", str));
        }
        nIn.A0d = null;
    }

    public static final void A0S(C68449NIn nIn, 0sn r4) {
        0nA.A0N(nIn.mView);
        AnonymousClass37D A0g2 = DbV.A0g(nIn, AnonymousClass37D.A00);
        if (A0g2 != null) {
            L1R l1r = new L1R(nIn);
            KXi kXi = new KXi();
            kXi.A02 = l1r;
            if (r4 == null) {
                r4 = 0sn.A00;
            }
            kXi.A03 = r4;
            A0g2.A0J(kXi);
        }
    }

    public static final void A0V(C68449NIn nIn, boolean z) {
        String str;
        C252063oV r0 = nIn.A0X;
        if (r0 == null) {
            str = "spotifyMusicBubble";
        } else {
            r0.setVisibility(8);
            C252063oV r02 = nIn.A0Y;
            str = "spotifyPlaceholderBubble";
            if (r02 != null) {
                r02.setVisibility(0);
                C252063oV r03 = nIn.A0Y;
                if (r03 != null) {
                    TextView A0d2 = AnonymousClass7TE.A0d(r03.getView(), R.id.share_from_spotify_title);
                    int A022 = AnonymousClass7TG.A02(nIn.requireContext());
                    Drawable A052 = AnonymousClass3JT.A05(nIn.requireContext(), R.drawable.instagram_app_spotify_pano_filled_24, C66584MXp.A05(nIn));
                    int i = 179;
                    if (z) {
                        i = 255;
                    }
                    A052.setAlpha(i);
                    A052.setBounds(0, 0, A022, A022);
                    if (A0d2 != null) {
                        Resources A053 = DbV.A05(nIn);
                        int i2 = 2131965116;
                        if (z) {
                            i2 = 2131965118;
                        }
                        DbU.A1A(A053, A0d2, i2);
                        A0d2.setCompoundDrawablePadding(JTR.A05(nIn.requireContext()));
                        A0d2.setCompoundDrawables(A052, (Drawable) null, (Drawable) null, (Drawable) null);
                        float f = 0.3f;
                        if (z) {
                            f = 1.0f;
                        }
                        A0d2.setAlpha(f);
                    }
                    IgTextView igTextView = nIn.A0L;
                    if (igTextView == null) {
                        return;
                    }
                    if (!z) {
                        DbX.A1G(igTextView, AnonymousClass4A2.A00(nIn.requireContext(), AnonymousClass7TE.A0l(nIn.A1T), true, false));
                        igTextView.setVisibility(0);
                        return;
                    }
                    igTextView.setVisibility(8);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0c(X.C68449NIn r1) {
        /*
            java.lang.String r0 = r1.A0l
            if (r0 == 0) goto L_0x000b
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68449NIn.A0c(X.NIn):boolean");
    }

    public static final boolean A0d(C68449NIn nIn) {
        if (nIn.A0t) {
            UserSession A0l2 = AnonymousClass7TE.A0l(nIn.A1T);
            if (!182.A06(AnonymousClass7TF.A0H(A0l2), A0l2, 36323161194310594L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0e(C68449NIn nIn) {
        if (!nIn.A0t && !A0g(nIn)) {
            UserSession A0l2 = AnonymousClass7TE.A0l(nIn.A1T);
            if (!182.A06(AnonymousClass7TF.A0H(A0l2), A0l2, 36329513449177253L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0g(C68449NIn nIn) {
        if (nIn.A1G.getValue() == null && nIn.A1H.getValue() == null) {
            return false;
        }
        return true;
    }

    public static final boolean A0h(C68449NIn nIn) {
        return AnonymousClass7TF.A1Z(nIn.A1L);
    }

    public final UserSession A0i() {
        return AnonymousClass7TE.A0l(this.A1T);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A1T);
    }

    public static final SpannableStringBuilder A00(C68449NIn nIn, String str, boolean z) {
        Drawable drawable;
        SpannableStringBuilder A0E2 = C51965G9l.A0E();
        if (z) {
            drawable = nIn.requireContext().getDrawable(R.drawable.music_explicit);
        } else {
            drawable = null;
        }
        int color = nIn.requireContext().getColor(2Yu.A09(nIn.getContext()));
        int A022 = DbZ.A02(nIn);
        if (drawable != null) {
            drawable.setBounds(0, 0, A022, A022);
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
        }
        A0E2.append(str);
        if (z && drawable != null) {
            C263324Kh.A02(drawable, A0E2, A0E2.length(), 16, 16);
        }
        return A0E2;
    }

    public static final String A04(C68449NIn nIn) {
        return AnonymousClass4A2.A03(nIn.requireContext(), AnonymousClass7TE.A0l(nIn.A1T), A02(nIn).A08(), AnonymousClass7TF.A1W(A02(nIn).A0E.getValue(), C69314NjF.NOTE_CHAT), A0c(nIn), nIn.A0t, AnonymousClass7TF.A1W(A02(nIn).A0E.getValue(), C69314NjF.GIF_NOTE));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        if (r4.length() == 0) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b3, code lost:
        r1 = r2 ^ 1;
        r0 = r9.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b7, code lost:
        if (r0 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b9, code lost:
        X.0qQ.A0F("noteEditText");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c2, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        if (r4 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e9, code lost:
        r0.setGravity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ec, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(android.text.Editable r7, com.instagram.common.ui.base.IgEditText r8, X.C68449NIn r9) {
        /*
            java.lang.String r4 = A03(r7, r8, r9)
            X.MuH r7 = A02(r9)
            java.lang.String r2 = r7.A05
            r0 = 0
            if (r4 == 0) goto L_0x00e6
            java.lang.String r1 = X.DbV.A12(r4)
        L_0x0011:
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x0073
            if (r4 == 0) goto L_0x00e3
            java.lang.String r1 = X.DbV.A12(r4)
        L_0x001d:
            r7.A05 = r1
            X.C67761MuH.A02(r7)
            java.lang.String r1 = r7.A05
            X.C67761MuH.A03(r7, r1)
            if (r4 == 0) goto L_0x0073
            X.05G r6 = r7.A09
            java.lang.String r2 = "@"
            int r5 = r4.length()
            int r1 = r5 + -1
            int r3 = X.00l.A07(r4, r2, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1 = -1
            boolean r1 = X.JTQ.A1O(r3, r1)
            boolean r1 = X.C66581MXm.A1a(r1)
            if (r1 != 0) goto L_0x0047
            r2 = r0
        L_0x0047:
            r6.Epw(r2)
            X.7fy r3 = r7.A01
            if (r3 == 0) goto L_0x0073
            java.lang.Object r1 = r6.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0070
            int r1 = r1.intValue()
            int r1 = r1 + 1
            java.lang.CharSequence r2 = r4.subSequence(r1, r5)
            r1 = 32
            boolean r1 = X.00l.A0X(r2, r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0070
            if (r2 == 0) goto L_0x0070
            java.lang.String r0 = r2.toString()
        L_0x0070:
            r3.EhX(r0)
        L_0x0073:
            X.MuH r0 = A02(r9)
            X.0Ud r0 = r0.A0c
            java.lang.Object r0 = r0.getValue()
            r2 = 0
            r5 = 1
            if (r0 != 0) goto L_0x00e0
            X.MuH r0 = A02(r9)
            X.05G r0 = r0.A0E
            java.lang.Object r1 = r0.getValue()
            X.NjF r0 = X.C69314NjF.SPOTIFY_NOTE
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            if (r0 != 0) goto L_0x00e0
            X.6rA r3 = X.C319756rA.A00
            r1 = 13
            X.Plr r0 = new X.Plr
            r0.<init>(r1, r8, r9)
            r3.A04(r8, r0, r2, r5)
            if (r4 == 0) goto L_0x00c3
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = ""
            r8.setHint(r0)
        L_0x00ac:
            int r0 = r4.length()
            if (r0 != 0) goto L_0x00b3
        L_0x00b2:
            r2 = 1
        L_0x00b3:
            r1 = r2 ^ 1
            com.instagram.common.ui.base.IgEditText r0 = r9.A0H
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = "noteEditText"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c3:
            java.lang.String r0 = A04(r9)
            r8.setHint(r0)
            X.MuH r0 = A02(r9)
            X.05G r0 = r0.A0E
            java.lang.Object r1 = r0.getValue()
            X.NjF r0 = X.C69314NjF.NOTE_CHAT
            if (r1 != r0) goto L_0x00e0
            r1 = 1093664768(0x41300000, float:11.0)
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r8.setTextSize(r1)
        L_0x00e0:
            if (r4 == 0) goto L_0x00b2
            goto L_0x00ac
        L_0x00e3:
            r1 = r0
            goto L_0x001d
        L_0x00e6:
            r1 = r0
            goto L_0x0011
        L_0x00e9:
            r0.setGravity(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68449NIn.A05(android.text.Editable, com.instagram.common.ui.base.IgEditText, X.NIn):void");
    }

    public static final void A06(View view, int i) {
        View A0U2 = JTR.A0U(view);
        A0U2.post(new C73306PaR(view, i, A0U2));
    }

    public static final void A07(View view, C68449NIn nIn) {
        0nA.A0N(view);
        C70857OOm.A01(nIn.getContext(), AnonymousClass7TE.A0l(nIn.A1T), C69319NjK.NOTES_CREATION_GIF_BUTTON, "", C66580MXl.A14(nIn, 24));
    }

    public static final void A08(View view, Integer num, 0sP r6) {
        int i;
        ViewGroup.MarginLayoutParams A0G2 = DbX.A0G(view);
        if (r6 != null) {
            i = AnonymousClass7TE.A0M(r6.invoke(C66580MXl.A0B(view)));
        } else if (num != null) {
            i = view.getResources().getDimensionPixelSize(num.intValue());
        } else {
            i = 0;
        }
        A0G2.setMargins(0, i, 0, 0);
        view.setLayoutParams(A0G2);
    }

    public static final void A0A(C68449NIn nIn) {
        View.OnClickListener onClickListener;
        boolean A0W2 = nIn.A0W();
        NotesCreationPogView notesCreationPogView = nIn.A0b;
        if (A0W2) {
            if (notesCreationPogView != null) {
                onClickListener = nIn.A1W;
            }
            0qQ.A0F("pogViewContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        if (notesCreationPogView != null) {
            onClickListener = nIn.A1V;
        }
        0qQ.A0F("pogViewContainer");
        throw AnonymousClass00P.createAndThrow();
        AnonymousClass0fU.A00(onClickListener, notesCreationPogView);
    }

    public static final void A0D(C68449NIn nIn) {
        Context context = nIn.getContext();
        if (context != null) {
            AnonymousClass0eM r3 = nIn.A1T;
            boolean A0D2 = AnonymousClass4AJ.A0D(AnonymousClass7TE.A0l(r3));
            Resources resources = context.getResources();
            int i = 2131957542;
            if (A0D2) {
                i = 2131957541;
            }
            String string = resources.getString(i);
            0qQ.A0A(string);
            C46498Dg1 dg1 = new C46498Dg1(context, AnonymousClass7TE.A0l(r3));
            dg1.A0A(string, new C71395Oju(nIn, 70));
            dg1.A0C(AnonymousClass7TF.A0d(context.getResources(), 2131954796), new C71397Ojw(nIn, 0));
            new C49945FFy(dg1).A05(context);
        }
    }

    public static final void A0H(C68449NIn nIn) {
        View view;
        String str;
        if (nIn.A0W()) {
            view = nIn.A0A;
            if (view == null) {
                str = "videoNoteCardEntrypointButton";
            }
            view.setVisibility(8);
            return;
        }
        view = nIn.A0g;
        if (view == null) {
            str = "videoPogInNoteCreationEntrypoint";
        }
        view.setVisibility(8);
        return;
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0I(C68449NIn nIn) {
        C300845y2 r0;
        C67761MuH A022 = A02(nIn);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next : (Iterable) A022.A0O.A0p.getValue()) {
            C279864zZ r2 = (C279864zZ) next;
            if (C51966G9m.A1W(A022.A0M, r2.A0D.getId()) && (!((r0 = r2.A0A) == null || r0.A08 == null) || r2.A0H.equals("2"))) {
                A1C2.add(next);
            }
        }
        if (A1C2.size() >= 1) {
            C358248ab A0U2 = DbW.A0U(nIn);
            A0U2.A09(2131968529);
            A0U2.A0q(DbV.A05(nIn).getString(2131968530));
            A0U2.A0E(C71223Ofo.A00);
            DbT.A1V(A0U2);
        } else {
            A02(nIn).A0E.Epw(C69314NjF.NOTE_CHAT);
        }
        C3018660j.A01(AnonymousClass7TE.A0l(nIn.A1T)).A09(C69466NmA.NOTE_CHAT);
    }

    public static final void A0J(C68449NIn nIn) {
        View view;
        TextView A0d2;
        View inflate;
        if (A02(nIn).A0h.getValue() == C69314NjF.MUSIC_NOTE && !nIn.A0t) {
            AnonymousClass0eM r5 = nIn.A1T;
            if (AnonymousClass4AJ.A07(AnonymousClass7TE.A0l(r5))) {
                View view2 = nIn.A06;
                if (view2 == null) {
                    View view3 = nIn.A04;
                    View view4 = null;
                    if (view3 == null) {
                        0qQ.A0F("bottomBarContainer");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    ViewStub A0F2 = DbS.A0F(view3, R.id.music_note_reshare_setting_toggle);
                    if (!(A0F2 == null || (inflate = A0F2.inflate()) == null)) {
                        IgdsSwitch igdsSwitch = (IgdsSwitch) inflate.requireViewById(R.id.reshare_setting_toggle);
                        igdsSwitch.A07 = new C72739PHt(nIn, 14);
                        if (1Au.A00(AnonymousClass7TE.A0l(r5)).A01.getBoolean("notes_music_reshare_enabled_pref", true)) {
                            igdsSwitch.toggle();
                        }
                        view4 = inflate;
                    }
                    nIn.A06 = view4;
                    if (!(JTS.A0e(AnonymousClass7TE.A0l(r5)) != AnonymousClass05K.A0C || (view = nIn.A06) == null || (A0d2 = AnonymousClass7TE.A0d(view, R.id.reshare_setting_toggle_text)) == null)) {
                        DbU.A1A(DbV.A05(nIn), A0d2, 2131968591);
                    }
                } else {
                    view2.setVisibility(0);
                }
                View view5 = nIn.A06;
                if (view5 != null) {
                    ((OL6) nIn.A1Q.getValue()).A00(view5, C226262fy.ABOVE_ANCHOR, AnonymousClass05K.A0Y, AnonymousClass7TF.A0d(DbV.A05(nIn), 2131968590));
                }
            }
        }
    }

    public static final void A0K(C68449NIn nIn) {
        if (A02(nIn).A0c.getValue() == null) {
            A0Q(nIn, AnonymousClass000.A00(3637));
        }
        C3018660j.A01(AnonymousClass7TE.A0l(nIn.A1T)).A09(C69466NmA.MUSIC);
    }

    public static final void A0M(C68449NIn nIn) {
        View view;
        String str;
        if (nIn.A0W()) {
            view = nIn.A0A;
            if (view == null) {
                str = "videoNoteCardEntrypointButton";
            }
            view.setVisibility(0);
            return;
        }
        view = nIn.A0g;
        if (view == null) {
            str = "videoPogInNoteCreationEntrypoint";
        }
        view.setVisibility(0);
        return;
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0T(C68449NIn nIn, List list) {
        String str;
        if (nIn.A0Z()) {
            IgLinearLayout igLinearLayout = nIn.A0J;
            str = "noteTypeEntryPointsLayout";
            if (igLinearLayout != null) {
                if (igLinearLayout.getScaleX() != 1.0f) {
                    IgLinearLayout igLinearLayout2 = nIn.A0J;
                    if (igLinearLayout2 != null) {
                        C66583MXo.A0E(igLinearLayout2.animate(), 1.0f).withStartAction(new C73075PVi(nIn)).start();
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            str = "noteTypeEntryPointsLayout";
            if (nIn.A0t) {
                IgLinearLayout igLinearLayout3 = nIn.A0J;
                if (igLinearLayout3 != null) {
                    igLinearLayout3.setVisibility(8);
                    return;
                }
            } else {
                IgLinearLayout igLinearLayout4 = nIn.A0J;
                if (igLinearLayout4 != null) {
                    igLinearLayout4.setVisibility(0);
                    Iterator it = nIn.A1D.iterator();
                    while (it.hasNext()) {
                        View A0H2 = JTO.A0H(it);
                        if (list.contains(A0H2)) {
                            A0H2.setVisibility(0);
                        } else {
                            A0H2.setVisibility(8);
                        }
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0U(C68449NIn nIn, boolean z) {
        int A032 = AnonymousClass7TG.A03(nIn.requireContext());
        int dimensionPixelSize = DbV.A05(nIn).getDimensionPixelSize(R.dimen.accent_edge_thickness);
        IgEditText igEditText = nIn.A0I;
        if (igEditText == null) {
            0qQ.A0F("promptEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        ViewGroup.MarginLayoutParams A0G2 = DbX.A0G(igEditText);
        int i = 1;
        if (z) {
            i = -1;
        }
        int i2 = A032 + (dimensionPixelSize * i);
        int i3 = A0G2.topMargin;
        if (i2 != i3) {
            ValueAnimator A052 = JTQ.A05(i3, i2);
            A052.addUpdateListener(new I83(8, (Object) A0G2, (Object) nIn));
            A052.setInterpolator(new AccelerateDecelerateInterpolator());
            A052.setDuration(250);
            A052.start();
        }
    }

    private final boolean A0W() {
        if (A0f(this) && !A0g(this)) {
            UserSession A0l2 = AnonymousClass7TE.A0l(this.A1T);
            if (!182.A06(AnonymousClass7TF.A0H(A0l2), A0l2, 36320502608306692L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean A0X() {
        if (!A0c(this) && !A0g(this) && !AnonymousClass7TF.A1Z(this.A1L) && !this.A0u) {
            UserSession A0l2 = AnonymousClass7TE.A0l(this.A1T);
            if (!182.A06(AnonymousClass7TF.A0H(A0l2), A0l2, 36329165556825950L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean A0Y() {
        if (!AnonymousClass7TF.A1W(A02(this).A0E.getValue(), C69314NjF.SPOTIFY_NOTE)) {
            0eE r2 = AnonymousClass0t1.A01;
            AnonymousClass0eM r1 = this.A1T;
            Boolean CcO = r2.A01(AnonymousClass7TE.A0l(r1)).A03.CcO();
            if ((CcO == null || !CcO.booleanValue()) && !DbT.A1a(AnonymousClass7TE.A0q(AnonymousClass7TE.A0l(r1)), "has_seen_spotify_note_creation_nux") && A0X()) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0Z() {
        if (!A0c(this) && !A0g(this)) {
            UserSession A0l2 = AnonymousClass7TE.A0l(this.A1T);
            if (!182.A06(AnonymousClass7TF.A0H(A0l2), A0l2, 36320055931183006L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean A0a() {
        long j;
        boolean A0c2 = A0c(this);
        UserSession A0l2 = AnonymousClass7TE.A0l(this.A1T);
        0Tu A0H2 = AnonymousClass7TF.A0H(A0l2);
        if (A0c2) {
            j = 36323766782995922L;
        } else {
            j = 36316074497216426L;
        }
        return 182.A06(A0H2, A0l2, j);
    }

    public static final boolean A0b(UserSession userSession) {
        if (AnonymousClass4AJ.A0B(userSession) || 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36325828367234302L)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r6.A0u != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0f(X.C68449NIn r6) {
        /*
            boolean r0 = A0c(r6)
            r5 = 1
            r4 = r0 ^ 1
            X.0eM r0 = r6.A1T
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            r0 = 0
            X.0Tu r3 = X.DbS.A0J(r2, r0)
            r0 = 36321310062159106(0x810a0a00082502, double:3.0330809652613065E-306)
            boolean r2 = X.182.A06(r3, r2, r0)
            X.0eM r0 = r6.A1L
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x0028
            boolean r0 = r6.A0u
            r1 = 0
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            if (r4 == 0) goto L_0x0044
            boolean r0 = r6.A0w
            if (r0 == 0) goto L_0x003f
            com.instagram.common.session.UserSession r2 = X.C66580MXl.A0Q(r6)
            r0 = 36322207710062595(0x810adb00042803, double:3.033648641410011E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x0044
        L_0x003e:
            return r5
        L_0x003f:
            if (r1 == 0) goto L_0x003e
            if (r2 == 0) goto L_0x0044
            return r5
        L_0x0044:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68449NIn.A0f(X.NIn):boolean");
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String str3;
        Serializable serializable;
        GPK gpk;
        String str4;
        String str5;
        Integer num;
        String str6;
        Integer num2;
        ImageUrl imageUrl;
        boolean z2;
        boolean z3;
        AudioOverlayTrack audioOverlayTrack;
        Bundle bundle2;
        Window window;
        int A022 = AnonymousClass0fD.A02(-1997166474);
        C68449NIn.super.onCreate(bundle);
        Fade fade = new Fade();
        fade.setDuration(200);
        fade.excludeTarget(16908335, true);
        fade.excludeTarget(16908336, true);
        FragmentActivity activity = getActivity();
        String str7 = null;
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setExitTransition(fade);
            window.setEnterTransition(fade);
            Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                sharedElementEnterTransition.setDuration(200);
            }
            window.setSharedElementReturnTransition((Transition) null);
            Transition sharedElementEnterTransition2 = window.getSharedElementEnterTransition();
            if (sharedElementEnterTransition2 != null) {
                sharedElementEnterTransition2.addListener(new C71279OhK(this, 0));
            }
        }
        Bundle bundle3 = this.mArguments;
        boolean z4 = false;
        if (bundle3 != null) {
            z = bundle3.getBoolean("replace_note");
        } else {
            z = false;
        }
        this.A0x = z;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str = bundle4.getString("content_id");
        } else {
            str = null;
        }
        this.A0l = str;
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str2 = bundle5.getString("content_media_code");
        } else {
            str2 = null;
        }
        this.A0n = str2;
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            str3 = bundle6.getString("content_container_module");
        } else {
            str3 = null;
        }
        this.A0k = str3;
        Bundle bundle7 = this.mArguments;
        if (bundle7 != null) {
            serializable = bundle7.getSerializable("content_event_source");
        } else {
            serializable = null;
        }
        if (serializable instanceof GPK) {
            gpk = (GPK) serializable;
        } else {
            gpk = null;
        }
        this.A0C = gpk;
        Bundle bundle8 = this.mArguments;
        if (bundle8 != null) {
            str4 = bundle8.getString("content_inventory_source");
        } else {
            str4 = null;
        }
        this.A0m = str4;
        Bundle bundle9 = this.mArguments;
        if (bundle9 != null) {
            str5 = bundle9.getString("content_ranking_info_token");
        } else {
            str5 = null;
        }
        this.A0o = str5;
        Bundle bundle10 = this.mArguments;
        if (bundle10 != null) {
            num = DbV.A0o(bundle10, "content_media_position");
        } else {
            num = null;
        }
        this.A0i = num;
        Bundle bundle11 = this.mArguments;
        if (bundle11 != null) {
            str6 = bundle11.getString("content_carousel_child_id");
        } else {
            str6 = null;
        }
        this.A0j = str6;
        Bundle bundle12 = this.mArguments;
        if (bundle12 == null || !bundle12.containsKey("content_carousel_child_index") || (bundle2 = this.mArguments) == null) {
            num2 = null;
        } else {
            num2 = DbV.A0o(bundle2, "content_carousel_child_index");
        }
        this.A0h = num2;
        Bundle bundle13 = this.mArguments;
        if (bundle13 != null) {
            imageUrl = (ImageUrl) 2Yc.A01(bundle13, ImageUrl.class, "content_preview_url");
        } else {
            imageUrl = null;
        }
        this.A0G = imageUrl;
        Bundle bundle14 = this.mArguments;
        if (bundle14 != null) {
            z2 = bundle14.getBoolean("profile_creation_point");
        } else {
            z2 = false;
        }
        this.A0w = z2;
        ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A1M)).A9Y((C252213ok) this.A1N.getValue());
        Bundle bundle15 = this.mArguments;
        if (bundle15 != null) {
            z3 = bundle15.getBoolean("arg_feed_creation_point");
        } else {
            z3 = false;
        }
        this.A15 = z3;
        Bundle bundle16 = this.mArguments;
        if (bundle16 != null) {
            audioOverlayTrack = (AudioOverlayTrack) bundle16.getParcelable("arg_music_to_preload");
        } else {
            audioOverlayTrack = null;
        }
        this.A0f = audioOverlayTrack;
        C67761MuH A023 = A02(this);
        Bundle bundle17 = this.mArguments;
        if (bundle17 != null) {
            str7 = bundle17.getString("arg_music_note_original_author_id");
        }
        A023.A04 = str7;
        A02(this).A07(this.A0f, (String) null);
        Bundle bundle18 = this.mArguments;
        if (bundle18 != null) {
            z4 = bundle18.getBoolean("arg_is_in_immersive_mode");
        }
        this.A0t = z4;
        if (z4) {
            C53016Gh7 gh7 = (C53016Gh7) this.A1F.getValue();
            String str8 = this.A0l;
            if (str8 == null) {
                str8 = "";
            }
            gh7.A00(str8);
        }
        C249223jK r2 = C249223jK.A00;
        AnonymousClass0eM r1 = this.A1T;
        this.A0s = r2.A07(AnonymousClass7TE.A0l(r1));
        this.A18 = r2.A07(AnonymousClass7TE.A0l(r1));
        this.A17 = C249223jK.A05(AnonymousClass7TE.A0l(r1));
        UserSession A0l2 = AnonymousClass7TE.A0l(r1);
        this.A16 = 182.A06(AnonymousClass7TF.A0H(A0l2), A0l2, 36330084679827900L);
        if (A0X()) {
            NotesRepository notesRepository = A02(this).A0O;
            C73565Pfm.A02(notesRepository, notesRepository.A01, 23);
        }
        AnonymousClass0fD.A09(1069893702, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1501781786);
        super.onDestroy();
        ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A1M)).onDestroy();
        if (this.A0t && !C71106Ock.A00.A04(AnonymousClass7TE.A0l(this.A1T))) {
            C53016Gh7 gh7 = (C53016Gh7) this.A1F.getValue();
            String str = this.A0l;
            if (str == null) {
                str = "";
            }
            gh7.A01(str, (String) null);
        }
        if (AnonymousClass7TF.A1W(A02(this).A0E.getValue(), C69314NjF.SPOTIFY_NOTE)) {
            C67761MuH A023 = A02(this);
            NotesRepository notesRepository = A023.A0O;
            C73565Pfm.A02(notesRepository, notesRepository.A01, 26);
            A023.A0E.Epw(C69314NjF.A06);
            C67761MuH.A02(A023);
        }
        AnonymousClass0fD.A09(-1887826724, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1854463929);
        super.onDestroyView();
        1wn r2 = this.A0E;
        if (r2 != null) {
            AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A1T)).A02(r2, C64648Lfa.class);
        }
        RecyclerView recyclerView = this.A0B;
        if (recyclerView != null) {
            recyclerView.setAdapter((2Rw) null);
        }
        this.A0B = null;
        A0R(this, "onDestroyView");
        AnonymousClass0fD.A09(-1213975917, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1619136139);
        C68449NIn.super.onPause();
        NotesCreationPogView notesCreationPogView = this.A0b;
        if (notesCreationPogView == null) {
            0qQ.A0F("pogViewContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        C252063oV r1 = notesCreationPogView.A06;
        if (r1.CVM()) {
            ((VideoView) r1.getView()).pause();
        }
        C67324Mm0 mm0 = this.A0d;
        if (mm0 != null) {
            C67324Mm0.A00(mm0, "notes_creation_sheet", " onPause");
        }
        this.A19.removeCallbacks(this.A1C);
        AnonymousClass0fD.A09(-284424162, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(400909171);
        super.onResume();
        NotesCreationPogView notesCreationPogView = this.A0b;
        String str = "pogViewContainer";
        if (notesCreationPogView != null) {
            notesCreationPogView.A07.setTransitionName((String) null);
            NotesCreationBubbleView notesCreationBubbleView = this.A0a;
            if (notesCreationBubbleView == null) {
                str = "bubbleView";
            } else {
                notesCreationBubbleView.setTransitionName((String) null);
                NotesCreationPogView notesCreationPogView2 = this.A0b;
                if (notesCreationPogView2 != null) {
                    C252063oV r1 = notesCreationPogView2.A06;
                    if (r1.CVM()) {
                        ((VideoView) r1.getView()).seekTo(0);
                        NotesCreationPogView notesCreationPogView3 = this.A0b;
                        if (notesCreationPogView3 != null) {
                            ((VideoView) notesCreationPogView3.A06.getView()).start();
                        }
                    }
                    C67324Mm0 mm0 = this.A0d;
                    if (mm0 != null) {
                        String A0R2 = 002.A0R("notes_creation_sheet", " onResume");
                        0qQ.A0B(A0R2, 0);
                        C14044Tol tol = mm0.A00;
                        if (tol != null) {
                            tol.A0C(A0R2, false);
                        }
                    }
                    if (!A0Y()) {
                        IgEditText igEditText = this.A0H;
                        if (igEditText == null) {
                            str = "noteEditText";
                        } else {
                            C69979NvJ.A00(igEditText);
                        }
                    }
                    if (AnonymousClass7TF.A1W(A02(this).A0E.getValue(), C69314NjF.SPOTIFY_NOTE)) {
                        NotesRepository notesRepository = A02(this).A0O;
                        C73565Pfm.A02(notesRepository, notesRepository.A01, 22);
                    }
                    C61081JwJ jwJ = (C61081JwJ) A02(this).A0c.getValue();
                    if (!(jwJ == null || jwJ.A01 == null)) {
                        this.A19.post(this.A1C);
                    }
                    AnonymousClass0fD.A09(266475786, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (X.AnonymousClass4AJ.A06(r1) == false) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r8 = this;
            r0 = 823353085(0x31135efd, float:2.144531E-9)
            int r6 = X.AnonymousClass0fD.A02(r0)
            X.C68449NIn.super.onStart()
            X.0eM r0 = r8.A1M
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            X.3E6 r0 = (X.AnonymousClass3E6) r0
            X.JTP.A17(r8, r0)
            android.os.Bundle r1 = r8.mArguments
            r7 = 0
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = "arg_launch_music_flow"
            boolean r2 = r1.getBoolean(r0)
        L_0x0020:
            android.os.Bundle r1 = r8.mArguments
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = "arg_launch_video_flow"
            boolean r7 = r1.getBoolean(r0)
        L_0x002a:
            X.0eM r0 = r8.A1T
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = A0c(r8)
            if (r0 != 0) goto L_0x0043
            boolean r0 = A0g(r8)
            if (r0 != 0) goto L_0x0043
            boolean r1 = X.AnonymousClass4AJ.A06(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            java.lang.String r5 = "noteEditText"
            r3 = 250(0xfa, double:1.235E-321)
            if (r0 == 0) goto L_0x007b
            if (r2 == 0) goto L_0x007b
            com.instagram.common.ui.base.IgEditText r1 = r8.A0H
            if (r1 == 0) goto L_0x008f
            X.PVl r0 = new X.PVl
            r0.<init>(r8)
        L_0x0055:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.postDelayed(r0, r3)
        L_0x005a:
            android.os.Bundle r1 = r8.mArguments
            if (r1 == 0) goto L_0x0074
            java.lang.String r0 = "arg_music_to_display"
            android.os.Parcelable r2 = r1.getParcelable(r0)
            com.instagram.music.common.model.AudioOverlayTrack r2 = (com.instagram.music.common.model.AudioOverlayTrack) r2
            if (r2 == 0) goto L_0x0074
            com.instagram.common.ui.base.IgEditText r1 = r8.A0H
            if (r1 == 0) goto L_0x008f
            X.PYn r0 = new X.PYn
            r0.<init>(r8, r2)
            r1.postDelayed(r0, r3)
        L_0x0074:
            r0 = -573201878(0xffffffffddd5a22a, float:-1.92423908E18)
            X.AnonymousClass0fD.A09(r0, r6)
            return
        L_0x007b:
            boolean r0 = A0f(r8)
            if (r0 == 0) goto L_0x005a
            if (r7 == 0) goto L_0x005a
            com.instagram.common.ui.base.IgEditText r1 = r8.A0H
            if (r1 == 0) goto L_0x008f
            X.PVm r0 = new X.PVm
            r0.<init>(r8)
            goto L_0x0055
        L_0x008d:
            r2 = 0
            goto L_0x0020
        L_0x008f:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68449NIn.onStart():void");
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(2128669522);
        C68449NIn.super.onStop();
        ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A1M)).onStop();
        AnonymousClass0fD.A09(-1034503988, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x036d, code lost:
        if (X.AnonymousClass4AJ.A06(r1) == false) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0a9b, code lost:
        if (r0 != false) goto L_0x0a9d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r36, android.view.ViewGroup r37, android.os.Bundle r38) {
        /*
            r35 = this;
            r0 = 1138459378(0x43db82f2, float:439.023)
            int r17 = X.AnonymousClass0fD.A02(r0)
            r4 = 0
            r2 = r36
            X.0qQ.A0B(r2, r4)
            r0 = 2131625714(0x7f0e06f2, float:1.8878644E38)
            r1 = r37
            android.view.View r3 = r2.inflate(r0, r1, r4)
            r5 = r35
            boolean r0 = r5.A0t
            if (r0 == 0) goto L_0x0c5e
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x0058
            r0 = 2131435212(0x7f0b1ecc, float:1.849226E38)
            android.view.View r6 = r1.findViewById(r0)
            if (r6 == 0) goto L_0x0058
            X.0eM r0 = r5.A1K
            java.lang.Object r2 = r0.getValue()
            X.LN3 r2 = (X.LN3) r2
            X.Ock r1 = X.C71106Ock.A00
            com.instagram.common.session.UserSession r0 = r2.A03
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x004a
            com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState r0 = r2.A05
            r1 = 1
            if (r0 == 0) goto L_0x0058
            com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams r0 = r0.A00
            if (r0 == 0) goto L_0x0058
            boolean r0 = r0.A02
            if (r0 != r1) goto L_0x0058
        L_0x004a:
            android.content.Context r1 = r6.getContext()
            r0 = 2130970205(0x7f04065d, float:1.7549114E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A16(r1, r6, r0)
        L_0x0058:
            boolean r0 = r5.A0t
            r11 = 1
            if (r0 == 0) goto L_0x0087
            X.Ock r7 = X.C71106Ock.A00
            androidx.fragment.app.FragmentActivity r6 = r5.getActivity()
            X.0eM r0 = r5.A1T
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r1 = r5.A1I
            java.lang.Object r0 = r1.getValue()
            com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState r0 = (com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState) r0
            if (r0 == 0) goto L_0x0c5b
            boolean r0 = r0.A02
            if (r0 != r11) goto L_0x0c5b
            java.lang.Object r0 = r1.getValue()
            com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState r0 = (com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState) r0
            if (r0 == 0) goto L_0x0083
            com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams r0 = r0.A00
            if (r0 != 0) goto L_0x0c5b
        L_0x0083:
            r0 = 1
        L_0x0084:
            r7.A03(r6, r2, r0)
        L_0x0087:
            r0 = 2131428910(0x7f0b062e, float:1.8479478E38)
            android.view.ViewStub r2 = X.DbS.A0F(r3, r0)
            boolean r0 = r5.A0t
            if (r0 == 0) goto L_0x0c4a
            com.instagram.common.session.UserSession r7 = X.C66580MXl.A0Q(r5)
            X.0Tu r6 = X.0Tu.A05
            r0 = 2342166170407807935(0x20810bb900182bbf, double:4.068266304689468E-152)
            boolean r1 = X.182.A06(r6, r7, r0)
            r0 = 2131626374(0x7f0e0986, float:1.8879982E38)
            if (r1 == 0) goto L_0x00a9
            r0 = 2131626373(0x7f0e0985, float:1.887998E38)
        L_0x00a9:
            r2.setLayoutResource(r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x00c4
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            if (r1 == 0) goto L_0x00c4
            X.0eM r0 = r5.A1K
            r0.getValue()
            r0 = -1
            r1.height = r0
            r1.width = r0
            r1.gravity = r4
        L_0x00c4:
            android.view.View r0 = r2.inflate()
            r5.A04 = r0
            r0 = 2131431893(0x7f0b11d5, float:1.8485528E38)
            com.instagram.common.ui.base.IgTextView r0 = X.JTO.A0X(r3, r0)
            r5.A0L = r0
            boolean r1 = r5.A0t
            r0 = 2131437092(0x7f0b2624, float:1.8496073E38)
            if (r1 == 0) goto L_0x00dd
            r0 = 2131437091(0x7f0b2623, float:1.849607E38)
        L_0x00dd:
            android.view.View r0 = X.JTR.A0V(r3, r0)
            r5.A03 = r0
            boolean r0 = r5.A0t
            r7 = 2131437097(0x7f0b2629, float:1.8496083E38)
            if (r0 == 0) goto L_0x00ed
            r7 = 2131437096(0x7f0b2628, float:1.849608E38)
        L_0x00ed:
            com.instagram.common.session.UserSession r6 = X.C66580MXl.A0Q(r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317633569822109(0x8106b20003159d, double:3.030755936703343E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0c45
            android.view.ViewStub r0 = X.DbS.A0F(r3, r7)
            r0.inflate()
            r0 = 2131437095(0x7f0b2627, float:1.8496079E38)
        L_0x0108:
            com.instagram.common.ui.base.IgTextView r0 = X.JTO.A0X(r3, r0)
            r5.A0K = r0
            r0 = 2131430558(0x7f0b0c9e, float:1.848282E38)
            android.view.View r0 = r3.findViewById(r0)
            r5.A10 = r0
            boolean r1 = r5.A0t
            r0 = 2131437102(0x7f0b262e, float:1.8496093E38)
            if (r1 == 0) goto L_0x0121
            r0 = 2131437101(0x7f0b262d, float:1.8496091E38)
        L_0x0121:
            android.view.View r1 = X.JTR.A0V(r3, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView"
            X.0qQ.A0C(r1, r0)
            com.instagram.common.ui.base.IgTextView r1 = (com.instagram.common.ui.base.IgTextView) r1
            r5.A0N = r1
            r0 = 2131428394(0x7f0b042a, float:1.8478431E38)
            android.view.View r0 = r3.findViewById(r0)
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = (com.instagram.direct.inbox.notes.creation.NotesCreationPogView) r0
            r5.A0b = r0
            r0 = 2131437032(0x7f0b25e8, float:1.8495951E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r5.A08 = r0
            r0 = 2131437033(0x7f0b25e9, float:1.8495953E38)
            com.instagram.common.ui.base.IgTextView r0 = X.JTO.A0X(r3, r0)
            r5.A0Q = r0
            r0 = 2131443716(0x7f0b4004, float:1.8509508E38)
            android.view.View r0 = r3.findViewById(r0)
            com.instagram.ui.widget.badgeicon.BadgeIconView r0 = (com.instagram.ui.widget.badgeicon.BadgeIconView) r0
            r5.A0g = r0
            r0 = 2131443714(0x7f0b4002, float:1.8509504E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r5.A0A = r0
            r0 = 2131433178(0x7f0b16da, float:1.8488134E38)
            android.view.View r0 = r3.findViewById(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r0
            r5.A14 = r0
            r0 = 2131441210(0x7f0b363a, float:1.8504425E38)
            X.3oV r0 = X.DbU.A0Y(r3, r0)
            r5.A0W = r0
            r0 = 2131441631(0x7f0b37df, float:1.850528E38)
            X.3oV r0 = X.DbU.A0Y(r3, r0)
            r5.A0Y = r0
            r0 = 2131441624(0x7f0b37d8, float:1.8505265E38)
            X.3oV r0 = X.DbU.A0Y(r3, r0)
            r5.A0X = r0
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r1 = r5.A0b
            java.lang.String r22 = "pogViewContainer"
            if (r1 == 0) goto L_0x0c40
            com.instagram.common.typedurl.ImageUrl r0 = A01(r5)
            r1.setProfilePhotoPog(r0, r5)
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r5.A0b
            if (r0 == 0) goto L_0x0c40
            r0.setVisibility(r4)
            boolean r0 = A0f(r5)
            if (r0 == 0) goto L_0x0209
            boolean r0 = r5.A0W()
            java.lang.String r9 = "videoNoteCardEntrypointButton"
            r8 = 0
            r7 = 0
            if (r0 == 0) goto L_0x0bfc
            androidx.cardview.widget.CardView r6 = r5.A0A
            if (r6 == 0) goto L_0x0bf7
            r6.setVisibility(r4)
            r1 = 1098907648(0x41800000, float:16.0)
            android.content.Context r0 = r5.requireContext()
            float r0 = X.C61380mr.A00(r0, r1)
            r6.setRadius(r0)
            android.view.View$OnClickListener r0 = r5.A1B
            X.AnonymousClass0fU.A00(r0, r6)
            androidx.cardview.widget.CardView r0 = r5.A0A
            if (r0 == 0) goto L_0x0bf7
            X.2eS.A01(r0)
            java.util.List r1 = r5.A1D
            androidx.cardview.widget.CardView r0 = r5.A0A
            if (r0 == 0) goto L_0x0bf7
            r1.add(r0)
        L_0x01d6:
            A0A(r5)
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L_0x01e3
            java.lang.String r0 = "arg_show_video_tooltip"
            boolean r8 = r1.getBoolean(r0)
        L_0x01e3:
            boolean r0 = r5.A0W()
            if (r0 == 0) goto L_0x0209
            if (r8 == 0) goto L_0x0209
            X.0eM r0 = r5.A1Q
            java.lang.Object r8 = r0.getValue()
            X.OL6 r8 = (X.OL6) r8
            androidx.cardview.widget.CardView r7 = r5.A0A
            if (r7 == 0) goto L_0x0bf7
            X.2fy r6 = X.C226262fy.BELOW_ANCHOR
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131968580(0x7f134244, float:1.9574059E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            r8.A00(r7, r6, r0, r1)
        L_0x0209:
            r0 = 2131430975(0x7f0b0e3f, float:1.8483666E38)
            android.view.View r8 = r3.findViewById(r0)
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r8 = (com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView) r8
            r5.A0a = r8
            java.lang.String r16 = "bubbleView"
            if (r8 == 0) goto L_0x079c
            boolean r7 = r5.A0s
            boolean r6 = r5.A18
            boolean r1 = r5.A17
            boolean r0 = r5.A16
            r8.A01 = r7
            r8.A04 = r6
            r8.A03 = r1
            r8.A02 = r0
            boolean r0 = r5.A0t
            r8.A05 = r0
            androidx.cardview.widget.CardView r0 = r8.A00
            r8.setIconicRedesignLayout(r0)
            r8.invalidate()
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r0 = r5.A0a
            if (r0 == 0) goto L_0x079c
            r0.setVisibility(r4)
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r1 = r5.A0a
            if (r1 == 0) goto L_0x079c
            r0 = 2131437794(0x7f0b28e2, float:1.8497497E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.base.IgEditText r0 = (com.instagram.common.ui.base.IgEditText) r0
            r5.A0H = r0
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r1 = r5.A0a
            if (r1 == 0) goto L_0x079c
            r0 = 2131429150(0x7f0b071e, float:1.8479965E38)
            android.view.View r0 = r1.findViewById(r0)
            r5.A05 = r0
            com.instagram.common.ui.base.IgEditText r1 = r5.A0H
            java.lang.String r18 = "noteEditText"
            if (r1 == 0) goto L_0x0bf2
            android.text.TextWatcher r0 = r5.A1U
            r1.addTextChangedListener(r0)
            r0 = 2131428015(0x7f0b02af, float:1.8477663E38)
            android.view.View r6 = r3.findViewById(r0)
            com.instagram.common.ui.base.IgLinearLayout r6 = (com.instagram.common.ui.base.IgLinearLayout) r6
            r5.A0J = r6
            boolean r1 = r5.A0t
            java.lang.String r12 = "noteTypeEntryPointsLayout"
            r0 = 8
            if (r1 == 0) goto L_0x027a
            if (r6 == 0) goto L_0x06e3
            r6.setVisibility(r0)
        L_0x027a:
            r0 = 2131441042(0x7f0b3592, float:1.8504084E38)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = X.JTO.A0Y(r3, r0)
            r5.A0U = r7
            java.lang.String r6 = "selectedNoteXButton"
            if (r7 == 0) goto L_0x0c3b
            android.content.res.Resources r19 = r3.getResources()
            r1 = 2131165207(0x7f070017, float:1.7944625E38)
            r0 = r19
            int r0 = r0.getDimensionPixelSize(r1)
            A06(r7, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A0U
            if (r1 == 0) goto L_0x0c3b
            r0 = 12
            X.C71397Ojw.A00(r1, r0, r5)
            X.Ojq r0 = X.Ojq.A00
            X.AnonymousClass0fU.A00(r0, r3)
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r5.A0b
            if (r0 == 0) goto L_0x0c40
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            boolean r6 = r5.A0t
            r0 = 1094713344(0x41400000, float:12.0)
            if (r6 == 0) goto L_0x02bb
            r0 = 0
        L_0x02bb:
            android.content.Context r6 = r3.getContext()
            X.0qQ.A07(r6)
            float r0 = X.C61380mr.A00(r6, r0)
            int r0 = (int) r0
            r1.bottomMargin = r0
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r5.A0b
            if (r0 == 0) goto L_0x0c40
            r0.setLayoutParams(r1)
            r0 = 2131430366(0x7f0b0bde, float:1.848243E38)
            X.3oV r0 = X.DbU.A0Y(r3, r0)
            r5.A0V = r0
            com.instagram.common.session.UserSession r7 = X.C66580MXl.A0Q(r5)
            r0 = 36329577873752269(0x81118f000140cd, double:3.038309562604628E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            r7 = 1098907648(0x41800000, float:16.0)
            if (r0 == 0) goto L_0x032e
            X.3oV r0 = r5.A0V
            java.lang.String r1 = "collabNoteEntryPointButton"
            if (r0 == 0) goto L_0x0759
            r0.setVisibility(r4)
            X.3oV r0 = r5.A0V
            if (r0 == 0) goto L_0x0759
            android.view.View r10 = r0.getView()
            androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
            X.2eS.A01(r10)
            X.0qQ.A07(r6)
            float r0 = X.C61380mr.A00(r6, r7)
            r10.setRadius(r0)
            r0 = 13
            X.C71397Ojw.A00(r10, r0, r5)
            X.0eM r0 = r5.A1Q
            java.lang.Object r9 = r0.getValue()
            X.OL6 r9 = (X.OL6) r9
            X.2fy r8 = X.C226262fy.BELOW_ANCHOR
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131956250(0x7f13121a, float:1.954905E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            r9.A00(r10, r8, r0, r1)
            java.util.List r0 = r5.A1D
            r0.add(r10)
        L_0x032e:
            r0 = 2131436676(0x7f0b2484, float:1.849523E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r5.A07 = r0
            r0 = 2131436677(0x7f0b2485, float:1.8495231E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.JTO.A0Y(r3, r0)
            r5.A0R = r0
            r0 = 2131436674(0x7f0b2482, float:1.8495225E38)
            com.instagram.common.ui.base.IgTextView r0 = X.JTO.A0X(r3, r0)
            r5.A0O = r0
            r0 = 2131436683(0x7f0b248b, float:1.8495243E38)
            com.instagram.common.ui.base.IgTextView r0 = X.JTO.A0X(r3, r0)
            r5.A0P = r0
            X.0eM r0 = r5.A1T
            r34 = r0
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r34)
            boolean r0 = A0c(r5)
            if (r0 != 0) goto L_0x036f
            boolean r0 = A0g(r5)
            if (r0 != 0) goto L_0x036f
            boolean r1 = X.AnonymousClass4AJ.A06(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0370
        L_0x036f:
            r0 = 0
        L_0x0370:
            java.lang.String r21 = "musicNoteEntryPointButton"
            if (r0 == 0) goto L_0x0407
            androidx.cardview.widget.CardView r0 = r5.A07
            if (r0 == 0) goto L_0x0bed
            r0.setVisibility(r4)
            androidx.cardview.widget.CardView r0 = r5.A07
            if (r0 == 0) goto L_0x0bed
            X.2eS.A01(r0)
            androidx.cardview.widget.CardView r1 = r5.A07
            if (r1 == 0) goto L_0x0bed
            X.0qQ.A07(r6)
            float r0 = X.C61380mr.A00(r6, r7)
            r1.setRadius(r0)
            androidx.cardview.widget.CardView r1 = r5.A07
            if (r1 == 0) goto L_0x0bed
            r0 = 14
            X.C71397Ojw.A00(r1, r0, r5)
            boolean r0 = r5.A0X()
            if (r0 == 0) goto L_0x03bd
            X.0eM r0 = r5.A1Q
            java.lang.Object r10 = r0.getValue()
            X.OL6 r10 = (X.OL6) r10
            androidx.cardview.widget.CardView r9 = r5.A07
            if (r9 == 0) goto L_0x0bed
            X.2fy r8 = X.C226262fy.BELOW_ANCHOR
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131973460(0x7f135554, float:1.9583956E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r10.A00(r9, r8, r0, r1)
        L_0x03bd:
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L_0x03e7
            java.lang.String r0 = "arg_show_music_tooltip"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x03e7
            X.0eM r0 = r5.A1Q
            java.lang.Object r10 = r0.getValue()
            X.OL6 r10 = (X.OL6) r10
            androidx.cardview.widget.CardView r9 = r5.A07
            if (r9 == 0) goto L_0x0bed
            X.2fy r8 = X.C226262fy.BELOW_ANCHOR
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131968574(0x7f13423e, float:1.9574046E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            r10.A00(r9, r8, r0, r1)
        L_0x03e7:
            X.MuH r0 = A02(r5)
            X.0Ud r0 = r0.A0Y
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x03fe
            com.instagram.common.ui.base.IgLinearLayout r0 = r5.A0J
            if (r0 == 0) goto L_0x06e3
            r0.setPadding(r4, r4, r4, r4)
        L_0x03fe:
            java.util.List r1 = r5.A1D
            androidx.cardview.widget.CardView r0 = r5.A07
            if (r0 == 0) goto L_0x0bed
            r1.add(r0)
        L_0x0407:
            r0 = 2131435682(0x7f0b20a2, float:1.8493213E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r5.A12 = r0
            r0 = 2131435684(0x7f0b20a4, float:1.8493217E38)
            com.instagram.common.ui.base.IgTextView r0 = X.JTO.A0X(r3, r0)
            r5.A0M = r0
            boolean r0 = r5.A0Z()
            java.lang.String r20 = "locationNoteEntryPointButton"
            if (r0 == 0) goto L_0x0474
            androidx.cardview.widget.CardView r0 = r5.A12
            if (r0 == 0) goto L_0x0be8
            r0.setVisibility(r4)
            androidx.cardview.widget.CardView r1 = r5.A12
            if (r1 == 0) goto L_0x0be8
            X.0qQ.A07(r6)
            float r0 = X.C61380mr.A00(r6, r7)
            r1.setRadius(r0)
            androidx.cardview.widget.CardView r0 = r5.A12
            if (r0 == 0) goto L_0x0be8
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            X.2eS.A04(r0, r12)
            androidx.cardview.widget.CardView r8 = r5.A12
            if (r8 == 0) goto L_0x0be8
            r1 = 15
            X.LYE r0 = new X.LYE
            r0.<init>((java.lang.Object) r5, (int) r1)
            X.AnonymousClass0fU.A00(r0, r8)
            X.0eM r0 = r5.A1Q
            java.lang.Object r10 = r0.getValue()
            X.OL6 r10 = (X.OL6) r10
            androidx.cardview.widget.CardView r9 = r5.A12
            if (r9 == 0) goto L_0x0be8
            X.2fy r8 = X.C226262fy.BELOW_ANCHOR
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131965505(0x7f133641, float:1.9567822E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            r10.A00(r9, r8, r12, r0)
            java.util.List r1 = r5.A1D
            androidx.cardview.widget.CardView r0 = r5.A12
            if (r0 == 0) goto L_0x0be8
            r1.add(r0)
        L_0x0474:
            boolean r0 = r5.A0a()
            if (r0 == 0) goto L_0x04e5
            android.view.LayoutInflater r0 = r5.getLayoutInflater()
            X.2tC r9 = new X.2tC
            r9.<init>(r0)
            r0 = 23
            X.PgU r8 = X.C66580MXl.A14(r5, r0)
            boolean r1 = r5.A0t
            X.NPy r0 = new X.NPy
            r0.<init>(r5, r8, r1)
            X.2t9 r0 = X.DbU.A0U(r9, r0)
            r5.A0F = r0
            boolean r1 = r5.A0t
            r0 = 2131437105(0x7f0b2631, float:1.84961E38)
            if (r1 == 0) goto L_0x04a0
            r0 = 2131437104(0x7f0b2630, float:1.8496097E38)
        L_0x04a0:
            android.view.View r1 = X.DbY.A0F(r3, r0)
            r0 = 4
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r5.A0B = r1
            if (r1 == 0) goto L_0x04b7
            X.2t9 r0 = r5.A0F
            r1.setAdapter(r0)
        L_0x04b7:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0B
            if (r0 == 0) goto L_0x04be
            X.DbV.A1A(r6, r0)
        L_0x04be:
            X.0eM r0 = r5.A1Q
            java.lang.Object r10 = r0.getValue()
            X.OL6 r10 = (X.OL6) r10
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r9 = r5.A0a
            if (r9 == 0) goto L_0x079c
            X.2fy r8 = X.C226262fy.ABOVE_ANCHOR
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131966148(0x7f1338c4, float:1.9569126E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r10.A00(r9, r8, r0, r1)
            com.instagram.common.ui.base.IgEditText r1 = r5.A0H
            if (r1 == 0) goto L_0x0bf2
            r0 = 15
            X.C71397Ojw.A00(r1, r0, r5)
        L_0x04e5:
            r0 = 2131438733(0x7f0b2c8d, float:1.8499401E38)
            android.view.View r0 = r3.findViewById(r0)
            com.instagram.common.ui.base.IgEditText r0 = (com.instagram.common.ui.base.IgEditText) r0
            r5.A0I = r0
            r0 = 2131438797(0x7f0b2ccd, float:1.8499531E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.JTO.A0Y(r3, r0)
            r5.A0T = r0
            boolean r0 = r5.A15
            if (r0 != 0) goto L_0x05da
            boolean r0 = r5.A0w
            if (r0 != 0) goto L_0x05da
            boolean r0 = A0c(r5)
            if (r0 != 0) goto L_0x05da
            boolean r0 = A0g(r5)
            if (r0 != 0) goto L_0x05da
            com.instagram.common.session.UserSession r8 = X.C66580MXl.A0Q(r5)
            r0 = 36321310061634811(0x810a0a000024fb, double:3.03308096492974E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x05da
            r0 = 2131438743(0x7f0b2c97, float:1.8499422E38)
            android.view.View r1 = r3.findViewById(r0)
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            r1.setVisibility(r4)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r1)
            float r0 = X.C61380mr.A00(r0, r7)
            r1.setRadius(r0)
            r0 = 6
            X.C71397Ojw.A00(r1, r0, r5)
            java.util.List r0 = r5.A1D
            r0.add(r1)
            r5.A09 = r1
            com.instagram.common.session.UserSession r8 = X.C66580MXl.A0Q(r5)
            r0 = 36325828367234302(0x810e26000034fe, double:3.0359383595846146E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x05da
            r0 = 2131437112(0x7f0b2638, float:1.8496113E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.JTO.A0Y(r3, r0)
            r5.A0S = r0
            android.content.Context r8 = r5.getContext()
            if (r8 == 0) goto L_0x059e
            r0 = 2131100376(0x7f0602d8, float:1.7813132E38)
            int r1 = r8.getColor(r0)
            r0 = 2131886088(0x7f120008, float:1.9406745E38)
            X.61R r12 = X.C303756Aq.A00(r8, r0)
            if (r12 == 0) goto L_0x0756
            int r10 = android.graphics.Color.red(r1)
            int r9 = android.graphics.Color.green(r1)
            int r8 = android.graphics.Color.blue(r1)
            int r1 = android.graphics.Color.alpha(r1)
            X.2dn r0 = new X.2dn
            r0.<init>(r10, r9, r8, r1)
            X.2dv r1 = r12.A01
            X.C305716Jg.A00(r0, r1)
            r0 = 0
            r12.EL2(r0)
        L_0x058a:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A0S
            if (r1 == 0) goto L_0x059e
            r1.setImageDrawable(r12)
            X.Ok7 r0 = new X.Ok7
            r0.<init>((int) r11, (java.lang.Object) r5, (java.lang.Object) r12)
            r5.A01 = r0
            X.AnonymousClass0fU.A00(r0, r1)
            X.2eS.A01(r1)
        L_0x059e:
            X.MuH r0 = A02(r5)
            android.content.res.Resources r12 = X.AnonymousClass7TF.A0A(r6)
            X.KWa r10 = r0.A0P
            long r0 = r10.A00
            long r8 = r10.A02
            long r0 = r0 + r8
            long r13 = java.lang.System.currentTimeMillis()
            int r8 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x05c0
            X.4Cq r8 = r10.A01
            r1 = 0
            X.MGe r0 = new X.MGe
            r0.<init>((java.lang.Object) r10, (java.lang.Object) r12, (X.AnonymousClass4D7) r1, (int) r11)
            X.AnonymousClass7TE.A1Z(r0, r8)
        L_0x05c0:
            X.07U r25 = X.07U.A05
            X.07Z r24 = r5.getViewLifecycleOwner()
            X.0xx r1 = X.AnonymousClass07a.A00(r24)
            r27 = 0
            r28 = 30
            X.MHI r0 = new X.MHI
            r23 = r0
            r26 = r5
            r23.<init>(r24, r25, r26, r27, r28)
            X.AnonymousClass7TE.A1Z(r0, r1)
        L_0x05da:
            boolean r0 = r5.A15
            if (r0 != 0) goto L_0x064c
            boolean r0 = r5.A0w
            if (r0 != 0) goto L_0x064c
            boolean r0 = A0c(r5)
            if (r0 != 0) goto L_0x064c
            boolean r0 = A0g(r5)
            if (r0 != 0) goto L_0x064c
            com.instagram.common.session.UserSession r8 = X.C66580MXl.A0Q(r5)
            r0 = 36323255681821728(0x810bcf00002c20, double:3.03431138297033E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x064c
            r0 = 2131429844(0x7f0b09d4, float:1.8481372E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r5.A13 = r0
            java.lang.String r12 = "noteChatEntryPoint"
            if (r0 == 0) goto L_0x06e3
            r0.setVisibility(r4)
            androidx.cardview.widget.CardView r1 = r5.A13
            if (r1 == 0) goto L_0x06e3
            X.0qQ.A07(r6)
            float r0 = X.C61380mr.A00(r6, r7)
            r1.setRadius(r0)
            androidx.cardview.widget.CardView r1 = r5.A13
            if (r1 == 0) goto L_0x06e3
            r0 = 7
            X.C71397Ojw.A00(r1, r0, r5)
            X.0eM r0 = r5.A1Q
            java.lang.Object r10 = r0.getValue()
            X.OL6 r10 = (X.OL6) r10
            androidx.cardview.widget.CardView r9 = r5.A13
            if (r9 == 0) goto L_0x06e3
            X.2fy r8 = X.C226262fy.BELOW_ANCHOR
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131968535(0x7f134217, float:1.9573967E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r10.A00(r9, r8, r0, r1)
            java.util.List r1 = r5.A1D
            androidx.cardview.widget.CardView r0 = r5.A13
            if (r0 == 0) goto L_0x06e3
            r1.add(r0)
        L_0x064c:
            boolean r0 = r5.A15
            if (r0 != 0) goto L_0x06a1
            boolean r0 = r5.A0w
            if (r0 != 0) goto L_0x06a1
            boolean r0 = A0c(r5)
            if (r0 != 0) goto L_0x06a1
            boolean r0 = A0g(r5)
            if (r0 != 0) goto L_0x06a1
            com.instagram.common.session.UserSession r8 = X.C66580MXl.A0Q(r5)
            r0 = 36328727470161463(0x8110c900003e37, double:3.037771763949502E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x06a1
            r0 = 2131433554(0x7f0b1852, float:1.8488897E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r5.A11 = r0
            java.lang.String r15 = "gifNoteEntryPointButton"
            if (r0 == 0) goto L_0x0892
            r0.setVisibility(r4)
            androidx.cardview.widget.CardView r1 = r5.A11
            if (r1 == 0) goto L_0x0892
            X.0qQ.A07(r6)
            float r0 = X.C61380mr.A00(r6, r7)
            r1.setRadius(r0)
            androidx.cardview.widget.CardView r1 = r5.A11
            if (r1 == 0) goto L_0x0892
            r0 = 8
            X.C71397Ojw.A00(r1, r0, r5)
            java.util.List r1 = r5.A1D
            androidx.cardview.widget.CardView r0 = r5.A11
            if (r0 == 0) goto L_0x0892
            r1.add(r0)
        L_0x06a1:
            boolean r0 = A0g(r5)
            if (r0 == 0) goto L_0x0705
            com.instagram.direct.inbox.notes.models.NoteAudience r6 = com.instagram.direct.inbox.notes.models.NoteAudience.MUTUAL_FOLLOWERS
            r1 = 0
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r0 = new com.instagram.direct.inbox.notes.models.NoteAudienceItem
            r0.<init>(r6, r1, r1, r4)
        L_0x06af:
            r5.A0c = r0
            boolean r0 = r5.A0t
            java.lang.String r15 = "fragmentContainer"
            if (r0 == 0) goto L_0x06fd
            com.instagram.common.session.UserSession r6 = X.C66580MXl.A0Q(r5)
            r0 = 36323161194310594(0x810bb9001b2bc2, double:3.0342516286878184E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x06fd
            android.view.View r1 = r5.A10
            if (r1 == 0) goto L_0x0892
            r0 = 2131437099(0x7f0b262b, float:1.8496087E38)
            android.view.View r1 = X.JTR.A0V(r1, r0)
            r0 = 2131434724(0x7f0b1ce4, float:1.849127E38)
            android.view.View r1 = r1.requireViewById(r0)
        L_0x06d8:
            r0 = 9
            X.C71397Ojw.A00(r1, r0, r5)
            r5.A02 = r1
            if (r1 != 0) goto L_0x06eb
            java.lang.String r12 = "audiencePickerContainer"
        L_0x06e3:
            X.0qQ.A0F(r12)
        L_0x06e6:
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x06eb:
            X.2eS.A01(r1)
            X.0eM r0 = r5.A1E
            java.lang.Object r0 = r0.getValue()
            X.Mtr r0 = (X.C67738Mtr) r0
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r1 = r5.A0c
            if (r1 != 0) goto L_0x075d
            java.lang.String r12 = "currentAudience"
            goto L_0x06e3
        L_0x06fd:
            r0 = 2131430575(0x7f0b0caf, float:1.8482855E38)
            android.view.View r1 = r3.requireViewById(r0)
            goto L_0x06d8
        L_0x0705:
            X.0eM r0 = r5.A1E
            java.lang.Object r8 = r0.getValue()
            X.Mtr r8 = (X.C67738Mtr) r8
            com.instagram.common.session.UserSession r7 = r8.A03
            X.1Am r6 = X.1Al.A01(r7)
            boolean r1 = r8.A06
            if (r1 == 0) goto L_0x0753
            X.1An r0 = X.1An.A0u
        L_0x0719:
            X.0xa r9 = X.C51969G9p.A0n(r6, r0, r8)
            java.lang.String r0 = "AudiencePickerViewModel.DefaultNotesAudience"
            r6 = 0
            java.lang.String r10 = r9.getString(r0, r6)
            if (r10 == 0) goto L_0x0750
            com.instagram.direct.inbox.notes.models.NoteAudience r9 = com.instagram.direct.inbox.notes.models.NoteAudience.valueOf(r10)
            com.instagram.direct.inbox.notes.models.NoteAudience r0 = com.instagram.direct.inbox.notes.models.NoteAudience.INTERNAL_ONLY
            if (r9 != r0) goto L_0x0734
            boolean r0 = X.1CI.A00(r7)
            if (r0 == 0) goto L_0x0750
        L_0x0734:
            if (r1 != 0) goto L_0x0745
            boolean r0 = r8.A07
            if (r0 != 0) goto L_0x0745
            r0 = 36323891337113172(0x810c6300022e54, double:3.034713373936218E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 != 0) goto L_0x0750
        L_0x0745:
            com.instagram.direct.inbox.notes.models.NoteAudience r1 = com.instagram.direct.inbox.notes.models.NoteAudience.valueOf(r10)
        L_0x0749:
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r0 = new com.instagram.direct.inbox.notes.models.NoteAudienceItem
            r0.<init>(r1, r6, r6, r4)
            goto L_0x06af
        L_0x0750:
            com.instagram.direct.inbox.notes.models.NoteAudience r1 = com.instagram.direct.inbox.notes.models.NoteAudience.MUTUAL_FOLLOWERS
            goto L_0x0749
        L_0x0753:
            X.1An r0 = X.1An.A2K
            goto L_0x0719
        L_0x0756:
            r12 = 0
            goto L_0x058a
        L_0x0759:
            X.0qQ.A0F(r1)
            goto L_0x06e6
        L_0x075d:
            X.05G r0 = r0.A01
            r0.Epw(r1)
            com.instagram.common.ui.base.IgEditText r1 = r5.A0H
            if (r1 == 0) goto L_0x0bf2
            boolean r0 = r5.A0x
            if (r0 != 0) goto L_0x089a
            com.instagram.music.common.model.AudioOverlayTrack r0 = r5.A0f
            if (r0 != 0) goto L_0x089a
            java.lang.String r0 = ""
        L_0x0770:
            r1.setHint(r0)
            com.instagram.common.ui.base.IgEditText r1 = r5.A0H
            if (r1 == 0) goto L_0x0bf2
            r0 = 1096810496(0x41600000, float:14.0)
            r7 = 1061158912(0x3f400000, float:0.75)
            float r0 = r0 / r7
            r1.setTextSize(r0)
            com.instagram.common.ui.base.IgEditText r0 = r5.A0H
            if (r0 == 0) goto L_0x0bf2
            r8 = 4
            r0.setTextAlignment(r8)
            com.instagram.common.ui.base.IgEditText r0 = r5.A0H
            if (r0 == 0) goto L_0x0bf2
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r1 = -2
            r0.width = r1
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r6 = r5.A0a
            if (r6 == 0) goto L_0x079c
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r5.A0b
            if (r0 != 0) goto L_0x07a1
            r16 = r22
        L_0x079c:
            X.0qQ.A0F(r16)
            goto L_0x06e6
        L_0x07a1:
            X.C319756rA.A02(r6, r0)
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r0 = r5.A0a
            if (r0 == 0) goto L_0x079c
            X.C66580MXl.A1C(r0, r1)
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r0 = r5.A0a
            if (r0 == 0) goto L_0x079c
            androidx.cardview.widget.CardView r0 = r0.A00
            X.C66580MXl.A1C(r0, r1)
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r0 = r5.A0a
            if (r0 == 0) goto L_0x079c
            r0.A06 = r11
            androidx.cardview.widget.CardView r0 = r0.A00
            X.C66580MXl.A1B(r0, r1)
            android.content.Context r1 = r5.requireContext()
            r0 = 1109393408(0x42200000, float:40.0)
            float r0 = r0 / r7
            float r0 = X.C61380mr.A00(r1, r0)
            int r1 = (int) r0
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r0 = r5.A0a
            if (r0 == 0) goto L_0x079c
            r0.setMinimumHeight(r1)
            com.instagram.common.ui.base.IgEditText r0 = r5.A0H
            if (r0 == 0) goto L_0x0bf2
            r0.setMinWidth(r1)
            android.content.Context r6 = r5.requireContext()
            r1 = 0
            r0 = 1118568448(0x42ac0000, float:86.0)
            float r0 = r0 - r1
            float r0 = r0 / r7
            float r0 = X.C61380mr.A00(r6, r0)
            int r1 = (int) r0
            com.instagram.common.ui.base.IgEditText r0 = r5.A0H
            if (r0 == 0) goto L_0x0bf2
            r0.setMaxWidth(r1)
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r0 = r5.A0a
            if (r0 == 0) goto L_0x079c
            android.view.ViewGroup$MarginLayoutParams r6 = X.DbX.A0G(r0)
            r1 = 23
            android.content.Context r0 = r5.requireContext()
            int r0 = X.C61380mr.A01(r0, r1)
            int r0 = -r0
            r6.setMargins(r4, r4, r4, r0)
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r0 = r5.A0a
            if (r0 == 0) goto L_0x079c
            r0.invalidate()
            boolean r0 = A0c(r5)
            if (r0 == 0) goto L_0x086f
            com.instagram.common.ui.base.IgTextView r0 = r5.A0L
            X.AnonymousClass7TH.A0R(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r34)
            java.lang.String r13 = r5.A0k
            if (r13 != 0) goto L_0x0820
            java.lang.String r13 = "notes_creation_sheet"
        L_0x0820:
            X.GPK r12 = r5.A0C
            if (r12 != 0) goto L_0x0826
            X.GPK r12 = X.GPK.UNKNOWN
        L_0x0826:
            java.lang.String r10 = r5.A0m
            java.lang.String r7 = r5.A0o
            java.lang.String r14 = r5.A0l
            if (r14 == 0) goto L_0x0c6e
            java.lang.String r9 = r5.A0j
            java.lang.Integer r1 = r5.A0h
            X.0qQ.A0B(r0, r4)
            X.0wc r6 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "instagram_media_note_reshare_sheet_add_note_client"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r6, r0)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x086f
            java.lang.String r0 = "media_id"
            r6.AAJ(r0, r14)
            java.lang.String r0 = "container_module"
            r6.AAJ(r0, r13)
            java.lang.String r0 = "event_source"
            r6.A8M(r12, r0)
            java.lang.String r0 = "inventory_source"
            r6.AAJ(r0, r10)
            java.lang.Long r1 = X.DbZ.A0c(r1)
            java.lang.String r0 = "carousel_index"
            r6.A9F(r0, r1)
            java.lang.String r0 = "carousel_media_id"
            X.C51973G9u.A14(r6, r0, r9)
            java.lang.String r0 = "ranking_info_token"
            r6.AAJ(r0, r7)
            r6.Cgf()
        L_0x086f:
            boolean r0 = r5.A0t
            if (r0 == 0) goto L_0x0b2b
            X.0eM r13 = r5.A1K
            java.lang.Object r6 = r13.getValue()
            X.LN3 r6 = (X.LN3) r6
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x0897
            r0 = 2131435212(0x7f0b1ecc, float:1.849226E38)
            android.view.View r23 = r1.findViewById(r0)
        L_0x0888:
            android.view.View r7 = r5.A10
            if (r7 == 0) goto L_0x0892
            android.view.View r12 = r5.A03
            if (r12 != 0) goto L_0x08a0
            java.lang.String r15 = "avatarContainer"
        L_0x0892:
            X.0qQ.A0F(r15)
            goto L_0x06e6
        L_0x0897:
            r23 = 0
            goto L_0x0888
        L_0x089a:
            java.lang.String r0 = A04(r5)
            goto L_0x0770
        L_0x08a0:
            com.instagram.common.session.UserSession r6 = r6.A03
            r0 = 36323161194310594(0x810bb9001b2bc2, double:3.0342516286878184E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            r31 = 0
            if (r0 == 0) goto L_0x0a45
            r0 = 2131437099(0x7f0b262b, float:1.8496087E38)
            android.view.View r27 = r7.findViewById(r0)
            r0 = 2131434724(0x7f0b1ce4, float:1.849127E38)
            android.view.View r26 = r7.findViewById(r0)
            r0 = 2131434746(0x7f0b1cfa, float:1.8491315E38)
            android.view.View r10 = r7.findViewById(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r10 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r10
            r0 = 2131434598(0x7f0b1c66, float:1.8491014E38)
            android.view.View r28 = r7.findViewById(r0)
            r0 = 2131430575(0x7f0b0caf, float:1.8482855E38)
            android.view.View r0 = r7.findViewById(r0)
            r1 = 8
            if (r0 == 0) goto L_0x08db
            r0.setVisibility(r1)
        L_0x08db:
            r0 = 2131434608(0x7f0b1c70, float:1.8491035E38)
            android.view.View r0 = r7.findViewById(r0)
            if (r0 == 0) goto L_0x08e7
            r0.setVisibility(r1)
        L_0x08e7:
            r0 = 36323161194441668(0x810bb9001d2bc4, double:3.03425162877071E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x08f9
            r0 = 2131437113(0x7f0b2639, float:1.8496115E38)
            X.3oV r31 = X.DbU.A0Y(r7, r0)
        L_0x08f9:
            r0 = 2131428907(0x7f0b062b, float:1.8479472E38)
            android.view.View r9 = X.AnonymousClass7TE.A0b(r7, r0)
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r0 = 2131437794(0x7f0b28e2, float:1.8497497E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r7, r0)
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r1 = (com.instagram.ui.text.backinterceptedittext.BackInterceptEditText) r1
            r0 = 2131437100(0x7f0b262c, float:1.849609E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r7, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.OI6 r6 = new X.OI6
            r22 = r6
            r24 = r7
            r25 = r12
            r29 = r0
            r30 = r9
            r32 = r10
            r33 = r1
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r12 = r13.getValue()
            X.LN3 r12 = (X.LN3) r12
            r0 = 10
            X.Ojw r1 = new X.Ojw
            r1.<init>(r5, r0)
            r0 = 46
            X.PmE r9 = new X.PmE
            r9.<init>(r5, r0)
            android.view.View r7 = r6.A03
            r0 = 2131437094(0x7f0b2626, float:1.8496077E38)
            android.view.View r0 = r7.findViewById(r0)
            r10 = 8
            r0.setVisibility(r10)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r14 = r6.A09
            X.AnonymousClass0fU.A00(r1, r14)
            r1 = 31
            X.LY8 r0 = new X.LY8
            r0.<init>(r1, r6, r12)
            X.AnonymousClass0fU.A00(r0, r7)
            android.view.View r1 = r6.A01
            X.Ojg r0 = X.C71382Ojg.A00
            X.AnonymousClass0fU.A00(r0, r1)
            android.view.View r13 = r6.A04
            if (r13 == 0) goto L_0x0968
            X.Ojh r0 = X.C71383Ojh.A00
            X.AnonymousClass0fU.A00(r0, r13)
        L_0x0968:
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r6.A0A
            r16 = r0
            r0 = 33
            X.GNG r13 = new X.GNG
            r13.<init>(r0, r6, r12)
            r0 = r16
            r0.setOnBackCallback(r13)
            android.widget.TextView r15 = r6.A06
            android.content.Context r13 = r15.getContext()
            int r0 = X.2Yu.A0A(r13)
            X.DbT.A17(r13, r15, r0)
            com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState r13 = r12.A05
            if (r13 == 0) goto L_0x0a08
            com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams r15 = r13.A00
            if (r15 == 0) goto L_0x0a08
            boolean r0 = r15.A02
            if (r0 != r11) goto L_0x0a08
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r7)
            android.app.Activity r13 = X.C61270mF.A01(r0)
            boolean r0 = X.C71106Ock.A01()
            if (r0 == 0) goto L_0x0a05
            if (r13 == 0) goto L_0x0a03
            android.view.Window r0 = r13.getWindow()
            if (r0 == 0) goto L_0x0a03
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x0a03
            X.04k r0 = X.C586203k.A00(r0)
            if (r0 == 0) goto L_0x0a03
            int r0 = X.OOp.A00(r0)
        L_0x09b7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0a03
            int r13 = r0.intValue()
        L_0x09c1:
            r1.setVisibility(r8)
            android.view.View r0 = r6.A02
            X.OOp.A01(r0, r13)
            X.M8W r0 = new X.M8W
            r0.<init>(r15, r12, r6)
            r14.post(r0)
        L_0x09d1:
            com.instagram.common.session.UserSession r12 = r12.A03
            X.3oV r8 = r6.A08
            if (r8 == 0) goto L_0x0b29
            boolean r0 = r8.CVM()
            if (r0 != 0) goto L_0x0b29
            r0 = 36886111147918007(0x830bb9001e02b7, double:3.3902634461666616E-306)
            java.lang.String r14 = X.182.A04(r2, r12, r0)
            java.lang.StringBuilder r13 = X.AnonymousClass7TE.A1A()
            int r12 = r14.length()
            r2 = 0
        L_0x09ef:
            if (r2 >= r12) goto L_0x0a5b
            char r1 = r14.charAt(r2)
            r0 = 92
            if (r1 == r0) goto L_0x0a00
            r0 = 85
            if (r1 == r0) goto L_0x0a00
            r13.append(r1)
        L_0x0a00:
            int r2 = r2 + 1
            goto L_0x09ef
        L_0x0a03:
            r13 = 0
            goto L_0x09c1
        L_0x0a05:
            int r0 = r15.A00
            goto L_0x09b7
        L_0x0a08:
            boolean r0 = X.C71106Ock.A01()
            if (r0 == 0) goto L_0x0a37
            r1.setVisibility(r8)
            com.instagram.common.session.UserSession r14 = r12.A03
            android.app.Activity r8 = r12.A01
            r1 = 1
            if (r13 == 0) goto L_0x0a35
            boolean r0 = r13.A02
            if (r0 != r11) goto L_0x0a35
        L_0x0a1c:
            X.LFq r13 = new X.LFq
            r13.<init>(r8, r1)
            r1 = 27
            X.MMC r0 = new X.MMC
            r0.<init>(r12, r1)
            X.Lk2 r8 = new X.Lk2
            r8.<init>(r14, r6, r13, r0)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r6.A07
            X.3E6 r0 = r12.A04
            X.C63119Krn.A00(r7, r1, r0, r8)
            goto L_0x09d1
        L_0x0a35:
            r1 = 0
            goto L_0x0a1c
        L_0x0a37:
            r16.requestFocus()
            X.3E6 r1 = r12.A04
            X.Oz5 r0 = new X.Oz5
            r0.<init>(r6, r4)
            r1.A9Y(r0)
            goto L_0x09d1
        L_0x0a45:
            r0 = 2131430575(0x7f0b0caf, float:1.8482855E38)
            android.view.View r26 = r7.findViewById(r0)
            r0 = 2131434608(0x7f0b1c70, float:1.8491035E38)
            android.view.View r10 = r7.findViewById(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r10 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r10
            r27 = r31
            r28 = r10
            goto L_0x08e7
        L_0x0a5b:
            java.lang.String r0 = X.DbT.A10(r13)
            java.util.List r0 = X.DbX.A0x(r0)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)     // Catch:{ IllegalArgumentException -> 0x0a8b }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ IllegalArgumentException -> 0x0a8b }
        L_0x0a6b:
            boolean r0 = r12.hasNext()     // Catch:{ IllegalArgumentException -> 0x0a8b }
            if (r0 == 0) goto L_0x0a8d
            java.lang.String r1 = X.AnonymousClass7TE.A18(r12)     // Catch:{ IllegalArgumentException -> 0x0a8b }
            X.I0g r0 = X.I0g.A03     // Catch:{ IllegalArgumentException -> 0x0a8b }
            int r0 = X.I5S.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0a8b }
            char[] r1 = java.lang.Character.toChars(r0)     // Catch:{ IllegalArgumentException -> 0x0a8b }
            X.0qQ.A07(r1)     // Catch:{ IllegalArgumentException -> 0x0a8b }
            java.lang.String r0 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x0a8b }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0a8b }
            r2.add(r0)     // Catch:{ IllegalArgumentException -> 0x0a8b }
            goto L_0x0a6b
        L_0x0a8b:
            java.util.List r2 = X.O43.A00
        L_0x0a8d:
            int r0 = r2.size()
            if (r0 != r10) goto L_0x0b1a
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0b04
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0b04
        L_0x0a9d:
            android.view.View r0 = r8.getView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.0kx r13 = new X.0kx
            r13.<init>(r0)
            r1 = 0
        L_0x0aa9:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0b1d
            java.lang.Object r14 = r13.next()
            int r16 = r1 + 1
            if (r1 >= 0) goto L_0x0abc
            X.0sr.A1T()
            goto L_0x06e6
        L_0x0abc:
            android.view.View r14 = (android.view.View) r14
            java.lang.String r12 = X.C51966G9m.A1G(r2, r1)
            if (r12 == 0) goto L_0x0b01
            boolean r0 = r14 instanceof com.instagram.common.ui.widget.imageview.IgImageView
            if (r0 == 0) goto L_0x0aeb
            r10 = r14
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            if (r10 == 0) goto L_0x0aeb
            android.content.Context r15 = X.AnonymousClass7TE.A0S(r7)
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.6Ly r1 = new X.6Ly
            r1.<init>(r15, r0)
            r1.A0M(r12)
            float r0 = (float) r0
            r1.A0A(r0)
            r10.setImageDrawable(r1)
        L_0x0aeb:
            X.3NG r10 = X.AnonymousClass7TE.A0m(r14)
            android.view.View[] r0 = new android.view.View[]{r14}
            r10.A02(r0)
            r1 = 2
            X.KHq r0 = new X.KHq
            r0.<init>(r12, r9, r1)
            r10.A04 = r0
            r10.A00()
        L_0x0b01:
            r1 = r16
            goto L_0x0aa9
        L_0x0b04:
            java.util.Iterator r1 = r2.iterator()
        L_0x0b08:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a9d
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            boolean r0 = X.0mp.A0D(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0b08
        L_0x0b1a:
            java.util.List r2 = X.O43.A00
            goto L_0x0a9d
        L_0x0b1d:
            android.view.View r1 = r8.getView()
            X.Ojf r0 = X.C71381Ojf.A00
            X.AnonymousClass0fU.A00(r0, r1)
            X.C66580MXl.A1Q(r8, r4)
        L_0x0b29:
            r5.A0Z = r6
        L_0x0b2b:
            boolean r0 = A0g(r5)
            if (r0 == 0) goto L_0x0b8e
            X.C66581MXm.A1K(r5, r4)
            com.instagram.common.ui.base.IgTextView r2 = r5.A0L
            if (r2 == 0) goto L_0x0b42
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131962738(0x7f132b72, float:1.956221E38)
            X.DbU.A1A(r1, r2, r0)
        L_0x0b42:
            X.0eM r0 = r5.A1G
            java.lang.String r6 = X.DbS.A0t(r0)
            if (r6 == 0) goto L_0x0b6a
            X.0eM r0 = r5.A1H
            java.lang.String r1 = X.DbS.A0t(r0)
            if (r1 == 0) goto L_0x0b6a
            X.MuH r2 = A02(r5)
            float r0 = java.lang.Float.parseFloat(r6)
            float r1 = java.lang.Float.parseFloat(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.A02 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2.A03 = r0
        L_0x0b6a:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r34)
            boolean r0 = X.AnonymousClass3HF.A04(r0)
            if (r0 == 0) goto L_0x0b8e
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r5.A14
            if (r1 != 0) goto L_0x0b7c
            java.lang.String r12 = "friendMapLockableNoteToggle"
            goto L_0x06e3
        L_0x0b7c:
            boolean r0 = com.instagram.igds.components.switchbutton.IgdsSwitch.A0O
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r1.A0A = r0
            r1.setVisibility(r4)
            X.PHu r0 = new X.PHu
            r0.<init>(r11, r5, r1)
            r1.A07 = r0
        L_0x0b8e:
            boolean r0 = A0e(r5)
            if (r0 == 0) goto L_0x0ba6
            r0 = 2131441199(0x7f0b362f, float:1.8504403E38)
            android.view.View r1 = r3.findViewById(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r1
            r5.A0e = r1
            if (r1 == 0) goto L_0x0ba6
            r0 = 11
            X.C71397Ojw.A00(r1, r0, r5)
        L_0x0ba6:
            androidx.cardview.widget.CardView r1 = r5.A07
            if (r1 == 0) goto L_0x0bed
            r2 = 2131165196(0x7f07000c, float:1.7944602E38)
            r0 = r19
            int r0 = r0.getDimensionPixelSize(r2)
            A06(r1, r0)
            androidx.cardview.widget.CardView r1 = r5.A12
            if (r1 == 0) goto L_0x0be8
            r0 = r19
            int r0 = r0.getDimensionPixelSize(r2)
            A06(r1, r0)
            androidx.cardview.widget.CardView r1 = r5.A09
            if (r1 == 0) goto L_0x0bd0
            r0 = r19
            int r0 = r0.getDimensionPixelSize(r2)
            A06(r1, r0)
        L_0x0bd0:
            com.instagram.common.ui.base.IgEditText r0 = r5.A0H
            if (r0 == 0) goto L_0x0bf2
            android.text.Editable r1 = r0.getText()
            com.instagram.common.ui.base.IgEditText r0 = r5.A0H
            if (r0 == 0) goto L_0x0bf2
            A05(r1, r0, r5)
            r1 = 136130744(0x81d30b8, float:4.7302738E-34)
            r0 = r17
            X.AnonymousClass0fD.A09(r1, r0)
            return r3
        L_0x0be8:
            X.0qQ.A0F(r20)
            goto L_0x06e6
        L_0x0bed:
            X.0qQ.A0F(r21)
            goto L_0x06e6
        L_0x0bf2:
            X.0qQ.A0F(r18)
            goto L_0x06e6
        L_0x0bf7:
            X.0qQ.A0F(r9)
            goto L_0x06e6
        L_0x0bfc:
            com.instagram.ui.widget.badgeicon.BadgeIconView r1 = r5.A0g
            java.lang.String r6 = "videoPogInNoteCreationEntrypoint"
            if (r1 == 0) goto L_0x0c3b
            r1.setVisibility(r4)
            r0 = 2131238031(0x7f081c8f, float:1.809233E38)
            r1.setIconDrawable((int) r0)
            r0 = 1082130432(0x40800000, float:4.0)
            r1.setBorderWidth(r0)
            android.content.Context r0 = r5.requireContext()
            android.content.res.ColorStateList r0 = X.1QE.A0C(r0, r7)
            int r0 = r0.getDefaultColor()
            r1.setIconTintColor(r0)
            android.content.Context r0 = r5.requireContext()
            android.content.res.ColorStateList r0 = X.1QE.A0B(r0, r7)
            int r0 = r0.getDefaultColor()
            int[] r0 = new int[]{r0, r0}
            r1.setBackgroundColorGradient(r0)
            com.instagram.ui.widget.badgeicon.BadgeIconView r0 = r5.A0g
            if (r0 == 0) goto L_0x0c3b
            X.2eS.A01(r0)
            goto L_0x01d6
        L_0x0c3b:
            X.0qQ.A0F(r6)
            goto L_0x06e6
        L_0x0c40:
            X.0qQ.A0F(r22)
            goto L_0x06e6
        L_0x0c45:
            r0 = 2131437093(0x7f0b2625, float:1.8496075E38)
            goto L_0x0108
        L_0x0c4a:
            boolean r1 = A0e(r5)
            r0 = 2131626376(0x7f0e0988, float:1.8879986E38)
            if (r1 == 0) goto L_0x0c56
            r0 = 2131626375(0x7f0e0987, float:1.8879984E38)
        L_0x0c56:
            r2.setLayoutResource(r0)
            goto L_0x00c4
        L_0x0c5b:
            r0 = 0
            goto L_0x0084
        L_0x0c5e:
            android.content.Context r1 = r3.getContext()
            r0 = 2130970269(0x7f04069d, float:1.7549243E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A16(r1, r3, r0)
            goto L_0x0058
        L_0x0c6e:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r1 = 113197677(0x6bf426d, float:7.194382E-35)
            r0 = r17
            X.AnonymousClass0fD.A09(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68449NIn.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
