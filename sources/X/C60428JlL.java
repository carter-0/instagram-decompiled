package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.clips.model.LayoutTransform;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraCapturer;

/* renamed from: X.JlL  reason: case insensitive filesystem */
public final class C60428JlL extends 2Rw {
    public int A00 = CameraCapturer.OPEN_CAMERA_DELAY_MS;
    public C66544MVy A01;
    public List A02 = 0sn.A00;
    public 0sL A03;
    public boolean A04;
    public final ArrayMap A05 = new ArrayMap();
    public final ClipsCreationViewModel A06;
    public final AnonymousClass8RF A07;
    public final C3516889w A08;
    public final C62320sa A09;
    public final int A0A;
    public final UserSession A0B;
    public final C62320sa A0C;

    public C60428JlL(UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RF r4, C3516889w r5, C62320sa r6, C62320sa r7, int i) {
        0qQ.A0B(userSession, 1);
        this.A0B = userSession;
        this.A08 = r5;
        this.A06 = clipsCreationViewModel;
        this.A07 = r4;
        this.A0A = i;
        this.A0C = r6;
        this.A09 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (X.182.A06(r2, r3, 36318161850800083L) == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C249703kE onCreateViewHolder(android.view.ViewGroup r10, int r11) {
        /*
            r9 = this;
            r3 = 0
            X.0qQ.A0B(r10, r3)
            if (r11 != r3) goto L_0x001d
            android.view.LayoutInflater r1 = X.JTP.A0G(r10)
            r0 = 2131627368(0x7f0e0d68, float:1.8881998E38)
            android.view.View r2 = X.DbT.A0D(r1, r10, r0, r3)
            int r0 = r9.A0A
            int r1 = r0 / 2
            X.0sa r0 = r9.A0C
            X.Jnz r3 = new X.Jnz
            r3.<init>(r2, r0, r1)
            return r3
        L_0x001d:
            r8 = 1
            if (r11 != r8) goto L_0x004a
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r10)
            X.MVy r4 = r9.A01
            com.instagram.common.session.UserSession r3 = r9.A0B
            X.0Tu r2 = X.0Tu.A06
            r0 = 36318161850603473(0x81072d000017d1, double:3.031090023596694E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0043
            r0 = 36318161850800083(0x81072d000317d3, double:3.031090023721031E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            X.KMZ r3 = new X.KMZ
            r3.<init>(r5, r4, r0)
            return r3
        L_0x004a:
            r0 = 2
            if (r11 != r0) goto L_0x007a
            android.content.Context r4 = r10.getContext()
            int r0 = X.DbY.A01(r4)
            int r1 = r0 * 2
            int r2 = r9.A0A
            X.89w r0 = r9.A08
            X.89v r0 = r0.A00()
            int r0 = r0.A02
            int r0 = r0 * 2
            int r2 = r2 - r0
            int r2 = r2 - r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r0 = 2131627486(0x7f0e0dde, float:1.8882238E38)
            android.view.View r1 = X.DbT.A0D(r1, r10, r0, r3)
            com.instagram.common.session.UserSession r0 = r9.A0B
            X.9Yt r3 = new X.9Yt
            r3.<init>(r1, r0, r2)
            return r3
        L_0x007a:
            android.view.LayoutInflater r1 = X.JTP.A0G(r10)
            r0 = 2131627469(0x7f0e0dcd, float:1.8882203E38)
            android.view.View r4 = X.DbT.A0D(r1, r10, r0, r3)
            X.89w r0 = r9.A08
            X.89v r7 = r0.A00()
            r5 = 0
            X.L0T r6 = new X.L0T
            r6.<init>(r5)
            X.Jpc r3 = new X.Jpc
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60428JlL.onCreateViewHolder(android.view.ViewGroup, int):X.3kE");
    }

    public final void onViewRecycled(C249703kE r2) {
        C380589Yt r22;
        ValueAnimator valueAnimator;
        0qQ.A0B(r2, 0);
        if ((r2 instanceof C380589Yt) && (r22 = (C380589Yt) r2) != null && (valueAnimator = r22.A00) != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v119, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final void onBindViewHolder(C249703kE r23, int i) {
        KMG kmg;
        KMJ kmj;
        boolean z;
        ViewGroup viewGroup;
        FilmstripTimelineView filmstripTimelineView;
        float f;
        KMH kmh;
        KMI kmi;
        ImageView.ScaleType scaleType;
        boolean z2;
        C249703kE r5 = r23;
        0qQ.A0B(r5, 0);
        int i2 = i;
        if (r5 instanceof C380589Yt) {
            C380589Yt r52 = (C380589Yt) r5;
            L0V l0v = (L0V) 00k.A0O(this.A02, i2);
            if ((l0v instanceof KMI) && (kmi = (KMI) l0v) != null) {
                Context A072 = DbS.A07(r52);
                int i3 = ((i - 1) / 2) - 1;
                if (kmi.A03) {
                    0qQ.A0A(A072);
                    int i4 = this.A08.A00().A02;
                    0qQ.A0B(A072, 0);
                    int A002 = (C3516489r.A00(A072, i4) + (DbY.A01(A072) * 3)) - AnonymousClass7TG.A03(A072);
                    int i5 = 0;
                    if (i == 0) {
                        i5 = A002;
                    }
                    if (i2 != getItemCount() - 1) {
                        A002 = 0;
                    }
                    0nA.A0h(JTO.A0F(r52), i5, A002);
                    int i6 = kmi.A00;
                    B07 b07 = new B07(i3, 0, A072, this);
                    r52.A03 = true;
                    r52.A02 = b07;
                    r52.A00();
                    r52.A06.setVisibility(8);
                    AnonymousClass0eM r1 = r52.A09;
                    if (((C252063oV) r1.getValue()).CFV() == 8) {
                        ((C252063oV) r1.getValue()).setVisibility(0);
                        r52.itemView.post(new C41055And(r52, i6));
                    }
                    0nA.A0d(JTO.A0F(r52), 0);
                    0nA.A0U(JTO.A0F(r52), 0);
                    return;
                }
                int i7 = kmi.A02;
                int i8 = kmi.A01;
                int i9 = kmi.A00;
                boolean z3 = kmi.A04;
                r52.A03 = z3;
                r52.A02 = null;
                0qQ.A07(A072);
                float A042 = 0nA.A04(A072, 20);
                ? r3 = r52.A06;
                int i10 = (int) A042;
                0nA.A0f(r3, i10);
                0nA.A0V(r3, i10);
                float f2 = A042 / 2.0f;
                0nA.A0d(JTO.A0F(r52), -((int) (((float) i7) + f2)));
                0nA.A0U(JTO.A0F(r52), -((int) (f2 + ((float) i8))));
                0nA.A0h(JTO.A0F(r52), i7, i8);
                ((C252063oV) r52.A09.getValue()).setVisibility(8);
                r3.setVisibility(0);
                Context context = r3.getContext();
                DbU.A11(context, r3, R.drawable.stacked_timeline_transition_button_background);
                if (i9 <= 0) {
                    DbU.A13(context, r3, R.drawable.stacked_timeline_transition_empty_state);
                    scaleType = ImageView.ScaleType.CENTER;
                } else {
                    DbU.A13(context, r3, ((C391219sX) A2K.A00.get(i9 - 1)).A00);
                    scaleType = ImageView.ScaleType.FIT_CENTER;
                }
                r3.setScaleType(scaleType);
                r3.setEnabled(z3);
                ArrayMap arrayMap = this.A05;
                Integer valueOf = Integer.valueOf(i2);
                Boolean bool = (Boolean) arrayMap.get(valueOf);
                if (bool != null) {
                    z2 = kmi.A05;
                    if (!bool.equals(Boolean.valueOf(z2)) && kmi.A06) {
                        boolean booleanValue = bool.booleanValue();
                        r52.itemView.setVisibility(0);
                        ValueAnimator valueAnimator = r52.A00;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float f3 = 1.0f;
                        float A003 = C51971G9r.A00(z2 ? 1 : 0);
                        float[] A1b = C51965G9l.A1b();
                        if (!booleanValue) {
                            f3 = 0.0f;
                        }
                        A1b[0] = f3;
                        A1b[1] = A003;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
                        ofFloat.addUpdateListener(new C64201LTo(0, r52, z2));
                        ofFloat.setDuration(150);
                        r52.A00 = ofFloat;
                        ofFloat.start();
                        arrayMap.put(valueOf, Boolean.valueOf(z2));
                    }
                }
                z2 = kmi.A05;
                ValueAnimator valueAnimator2 = r52.A00;
                int i11 = 0;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    View view = r52.itemView;
                    if (!z2) {
                        i11 = 8;
                    }
                    view.setVisibility(i11);
                    float f4 = 1.0f;
                    r3.setAlpha(C51971G9r.A00(z2 ? 1 : 0));
                    float f5 = 0.8f;
                    if (z2) {
                        f5 = 1.0f;
                    }
                    r3.setScaleX(f5);
                    if (!z2) {
                        f4 = 0.8f;
                    }
                    r3.setScaleY(f4);
                }
                arrayMap.put(valueOf, Boolean.valueOf(z2));
            }
        } else if (r5 instanceof C60691Jpc) {
            C60691Jpc jpc = (C60691Jpc) r5;
            L0V l0v2 = (L0V) 00k.A0O(this.A02, i2);
            int i12 = (i / 2) - 1;
            if (!this.A04 || i12 != 0) {
                filmstripTimelineView = jpc.A09;
                f = 1.0f;
            } else {
                filmstripTimelineView = jpc.A09;
                f = 0.5f;
            }
            filmstripTimelineView.setAlpha(f);
            View view2 = jpc.A04;
            int i13 = i12 + 1;
            view2.setContentDescription(002.A0G(DbS.A07(jpc).getString(2131955365), ' ', i13));
            filmstripTimelineView.setContentDescription(002.A0G(DbS.A07(jpc).getString(2131955449), ' ', i13));
            if ((l0v2 instanceof KMH) && (kmh = (KMH) l0v2) != null) {
                Context A073 = DbS.A07(jpc);
                Resources resources = A073.getResources();
                int i14 = R.dimen.abc_button_padding_horizontal_material;
                0nA.A0d(filmstripTimelineView, resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
                TextView textView = jpc.A06;
                Resources resources2 = A073.getResources();
                if (!kmh.A02) {
                    i14 = R.dimen.abc_edit_text_inset_top_material;
                }
                0nA.A0X(textView, resources2.getDimensionPixelSize(i14));
                0nA.A0Z(textView, AnonymousClass7TG.A03(A073));
                AnonymousClass51P r8 = kmh.A00;
                this.A08.A01(r8, new J9H(i12, 1, this, A073, jpc, r8, kmh));
                long A082 = (long) JTP.A08((AnonymousClass51M) r8);
                String A0u = DbV.A0u(A073, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(A082)), Long.valueOf((A082 % 1000) / 100), 2131955446);
                0qQ.A07(A0u);
                textView.setText(A0u);
                int i15 = 0;
                textView.setVisibility(0);
                if (!kmh.A01) {
                    i15 = 4;
                }
                view2.setVisibility(i15);
                AnonymousClass0fU.A00(new LXL(this, i12, i2), view2);
                C3516489r.A01(JTO.A0F(jpc)).start();
            }
        } else if (r5 instanceof KMZ) {
            KMZ kmz = (KMZ) r5;
            L0V l0v3 = (L0V) 00k.A0O(this.A02, i2);
            LayoutTransform layoutTransform = null;
            if ((l0v3 instanceof KMJ) && (kmj = (KMJ) l0v3) != null) {
                boolean z4 = kmj.A0C;
                boolean z5 = kmj.A09;
                int i16 = this.A00;
                boolean z6 = kmj.A0B;
                if (z6) {
                    z = false;
                } else {
                    z = kmj.A0D;
                }
                boolean z7 = kmj.A0A;
                C60059Jea jea = kmz.A01;
                jea.setEnableTrim(z4);
                jea.A0M = z5;
                jea.setThumbnailSampleRateMs(i16);
                ViewParent viewParent = null;
                if (!z || z7) {
                    ImageView imageView = kmz.A00;
                    if (imageView != null) {
                        viewParent = imageView.getParent();
                    }
                    if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
                        viewGroup.removeView(imageView);
                    }
                } else {
                    ImageView imageView2 = kmz.A00;
                    if (imageView2 == null || imageView2.getParent() == null) {
                        jea.addView(imageView2);
                    }
                }
                int i17 = kmj.A04;
                int i18 = kmj.A03;
                int i19 = kmj.A01;
                ClipsCreationViewModel clipsCreationViewModel = this.A06;
                jea.A0H = i17;
                jea.A0G = i18;
                jea.A0C = i19;
                jea.A0D = (clipsCreationViewModel.A0E() - JTO.A07(clipsCreationViewModel)) + kmj.A02;
                jea.A08();
                jea.setMinStartTimeMs(AnonymousClass7TG.A0A(kmj.A07));
                jea.A0e.A00 = new BigDecimal((double) kmj.A00).setScale(1, RoundingMode.HALF_UP).floatValue();
                jea.setIsInVideoAdjustMode(z7);
                jea.setTargetBitmapAspectRatio(kmj.A06);
                jea.setFetchBitmapDelegateV2(kmj.A08);
                jea.setIsPhoto(z6);
                C381689cA r0 = kmj.A05;
                if (r0 != null) {
                    layoutTransform = new LayoutTransform(AnonymousClass05K.A00, r0.A02, r0.A00, r0.A03, -r0.A01, 0, 0, false);
                }
                jea.setLayoutTransform(layoutTransform);
                jea.setDimView(false);
            }
        } else if (r5 instanceof C60590Jnz) {
            C60590Jnz jnz = (C60590Jnz) r5;
            L0V l0v4 = (L0V) 00k.A0O(this.A02, i2);
            if ((l0v4 instanceof KMG) && (kmg = (KMG) l0v4) != null) {
                0nA.A0f(JTO.A0F(jnz), kmg.A00);
                boolean z8 = kmg.A02;
                C62320sa r2 = this.A09;
                Boolean bool2 = kmg.A01;
                0qQ.A0B(r2, 1);
                if (!z8 || bool2 == null) {
                    jnz.A00.setVisibility(8);
                    return;
                }
                IgLinearLayout igLinearLayout = jnz.A00;
                igLinearLayout.setVisibility(0);
                LY4.A01(igLinearLayout, 68, r2);
                IgImageView igImageView = jnz.A01;
                boolean booleanValue2 = bool2.booleanValue();
                int i20 = R.drawable.instagram_volume_pano_outline_16;
                if (booleanValue2) {
                    i20 = R.drawable.instagram_volume_none_pano_outline_16;
                }
                igImageView.setImageResource(i20);
                0nA.A0n(igLinearLayout, JTO.A0F(jnz), R.dimen.abc_edit_text_inset_top_material);
            }
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(32991567);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(1004981119, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        Integer num;
        int i2;
        int A032 = AnonymousClass0fD.A03(45972371);
        L0V l0v = (L0V) 00k.A0O(this.A02, i);
        if (l0v != null) {
            num = l0v.A00;
        } else {
            num = AnonymousClass05K.A00;
        }
        switch (num.intValue()) {
            case 0:
                i2 = 0;
                break;
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        AnonymousClass0fD.A0A(-2101789065, A032);
        return i2;
    }
}
