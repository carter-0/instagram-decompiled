package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.voice.view.VoiceMessageTrimFrame;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.concurrent.TimeUnit;

/* renamed from: X.NIm  reason: case insensitive filesystem */
public final class C68448NIm extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "VoiceMessagePreviewFragment";
    public int A00;
    public UserSession A01;
    public AnonymousClass7JO A02;
    public C301265yp A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass0eM A08 = A02(this, 42);
    public final AnonymousClass0eM A09 = A02(this, 43);
    public final AnonymousClass0eM A0A = A02(this, 44);
    public final AnonymousClass0eM A0B = A02(this, 45);
    public final AnonymousClass0eM A0C = A02(this, 46);
    public final AnonymousClass0eM A0D = A02(this, 48);
    public final AnonymousClass0eM A0E = A02(this, 47);
    public final AnonymousClass0eM A0F = A02(this, 49);

    public final void A07() {
        String str;
        this.A04 = false;
        A00(this).A0E.clear();
        AnonymousClass7JO r0 = this.A02;
        if (r0 == null) {
            str = "delegate";
        } else {
            C63822L8d l8d = r0.A04;
            if (l8d != null) {
                A00(this).A04(00k.A0a(l8d.A03), 1.0f);
            }
            A06(this, false);
            A04(this);
            AnonymousClass7TH.A06(this.A0B).setEnabled(true);
            AnonymousClass7TH.A06(this.A08).setEnabled(true);
            AnonymousClass7TH.A06(this.A0C).setEnabled(true);
            C301265yp r02 = this.A03;
            if (r02 == null) {
                str = "voiceMessagingGatingUtil";
            } else {
                if (182.A06(0Tu.A05, r02.A00, 36323642229009753L)) {
                    A01(this).setVisibility(0);
                    VoiceMessageTrimFrame A012 = A01(this);
                    AnonymousClass0eM r3 = this.A0D;
                    float A002 = C66582MXn.A00(r3);
                    float A022 = AnonymousClass7TE.A02(A01(this)) - C66582MXn.A00(r3);
                    RectF rectF = A012.A01;
                    rectF.left = A002;
                    rectF.right = A022;
                    A012.postInvalidateOnAnimation();
                    A00(this).setActiveWindowEnabled(true);
                    A00(this).A03(0.0f, AnonymousClass7TE.A02(A00(this)));
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A04(this);
        AnonymousClass0eM r2 = this.A0C;
        ((IgdsMediaButton) AnonymousClass7TE.A14(r2)).setButtonStyle(C296235pj.CREATION_FLOW_BLUE);
        C71402Ok1.A00(AnonymousClass7TH.A06(r2), 14, this);
        C71402Ok1.A00(AnonymousClass7TH.A06(this.A0A), 15, this);
        C71402Ok1.A00(AnonymousClass7TH.A06(this.A08), 16, this);
        C301265yp r0 = this.A03;
        if (r0 != null) {
            UserSession userSession = r0.A00;
            0Tu r6 = 0Tu.A05;
            boolean A062 = 182.A06(r6, userSession, 36323642229468509L);
            View A063 = AnonymousClass7TH.A06(this.A0B);
            if (A062) {
                C71402Ok1.A00(A063, 17, this);
            } else {
                A063.setVisibility(8);
            }
            A00(this).A07 = true;
            A00(this).A09 = false;
            AnonymousClass7JO r02 = this.A02;
            if (r02 != null) {
                C63822L8d l8d = r02.A04;
                if (l8d != null) {
                    A00(this).A04(00k.A0a(l8d.A03), 1.0f);
                }
                C301265yp r03 = this.A03;
                if (r03 != null) {
                    if (182.A06(r6, r03.A00, 36323642229009753L)) {
                        A00(this).setActiveWindowEnabled(true);
                        A01(this).setVisibility(0);
                        C71439Oke.A01(A01(this), 10, this);
                    }
                    AnonymousClass7JO r04 = this.A02;
                    if (r04 != null) {
                        C63822L8d l8d2 = r04.A04;
                        if (l8d2 != null) {
                            A05(this, (long) l8d2.A00);
                            return;
                        }
                        return;
                    }
                }
            }
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("voiceMessagingGatingUtil");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final VoiceVisualizer A00(C68448NIm nIm) {
        return (VoiceVisualizer) AnonymousClass7TE.A14(nIm.A0F);
    }

    public static final VoiceMessageTrimFrame A01(C68448NIm nIm) {
        return (VoiceMessageTrimFrame) AnonymousClass7TE.A14(nIm.A0E);
    }

    public static AnonymousClass0eM A02(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73907Pli(obj, i));
    }

    public static final 0eP A03(C68448NIm nIm) {
        int i;
        int i2;
        Integer valueOf;
        String str;
        AnonymousClass7JO r0 = nIm.A02;
        if (r0 == null) {
            str = "delegate";
        } else {
            C63822L8d l8d = r0.A04;
            if (l8d != null) {
                i = l8d.A00;
            } else {
                i = 0;
            }
            C301265yp r02 = nIm.A03;
            if (r02 == null) {
                str = "voiceMessagingGatingUtil";
            } else {
                if (182.A06(0Tu.A05, r02.A00, 36323642229009753L)) {
                    0eP selectionBoundsPercent = A01(nIm).getSelectionBoundsPercent();
                    float A042 = AnonymousClass7TE.A04(selectionBoundsPercent.A00);
                    float A043 = AnonymousClass7TE.A04(selectionBoundsPercent.A01);
                    float f = (float) i;
                    i2 = Integer.valueOf((int) (A042 * f));
                    valueOf = Integer.valueOf((int) (f * A043));
                } else {
                    i2 = 0;
                    valueOf = Integer.valueOf(i);
                }
                return AnonymousClass7TE.A1L(i2, valueOf);
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(C68448NIm nIm) {
        AnonymousClass7L2 A072;
        Drawable A002;
        UserSession userSession = nIm.A01;
        if (userSession != null) {
            View requireView = nIm.requireView();
            AnonymousClass9HD r1 = AnonymousClass9HC.A1b;
            Parcelable.Creator creator = Capabilities.CREATOR;
            AnonymousClass9HC A0X = C66581MXm.A0X(userSession, r1, 0sn.A00);
            boolean z = nIm.A04;
            Context context = requireView.getContext();
            if (z) {
                A072 = C250563lf.A05(context, A0X);
            } else {
                A072 = C250563lf.A07(context, A0X, false);
            }
            0qQ.A0A(A072);
            if (nIm.A04) {
                A002 = JTO.A0D(((AnonymousClass7OK) A072.A07.A0I.getValue()).A0A);
                if (A002 != null) {
                    AnonymousClass7PT.A00(A002, nIm.A00);
                } else {
                    A002 = null;
                }
            } else {
                C328637Fo r5 = C328637Fo.NONE;
                A002 = C328037De.A00();
                AnonymousClass7FB.A06(A002, (AnonymousClass5FV) null, r5, A072, false, false, false, false, false);
            }
            requireView.requireViewById(R.id.direct_voice_message_preview_message_background).setBackground(A002);
            ImageView A0Z = JTR.A0Z(nIm.A0A);
            int i = A072.A06.A04;
            C66581MXm.A1C(A0Z, i);
            JTQ.A0A(nIm.A09).setTextColor(i);
            A00(nIm).setSegmentColor(i);
        }
    }

    public static final void A05(C68448NIm nIm, long j) {
        JTQ.A0A(nIm.A09).setText(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    public final String getModuleName() {
        return "direct_voice_message_preview_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return this.A01;
    }

    public static final void A06(C68448NIm nIm, boolean z) {
        View A062;
        int i;
        Context context = nIm.getContext();
        if (context != null) {
            boolean z2 = nIm.A04;
            AnonymousClass0eM r2 = nIm.A0A;
            ImageView A0Z = JTR.A0Z(r2);
            if (z2) {
                A0Z.setImageResource(R.drawable.instagram_pause_pano_filled_24);
                A062 = AnonymousClass7TH.A06(r2);
                i = 2131960722;
            } else if (z) {
                A0Z.setImageResource(R.drawable.instagram_pause_pano_filled_24);
                A062 = AnonymousClass7TH.A06(r2);
                i = 2131960721;
            } else {
                A0Z.setImageResource(R.drawable.instagram_play_pano_filled_24);
                A062 = AnonymousClass7TH.A06(r2);
                i = 2131960718;
            }
            DbU.A12(context, A062, i);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1735021025);
        View A0D2 = DbT.A0D(DbV.A0E(this), viewGroup, R.layout.direct_voice_message_preview, false);
        AnonymousClass0fD.A09(-1191476954, A022);
        return A0D2;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1307590815);
        C68448NIm.super.onPause();
        AnonymousClass7JO r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A00();
        AnonymousClass0fD.A09(1342636045, A022);
    }
}
