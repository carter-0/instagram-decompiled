package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.direct.view.ReshareTogglePickerView;
import com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView;

/* renamed from: X.8CT  reason: invalid class name */
public final class AnonymousClass8CT implements AnonymousClass85Y {
    public float A00;
    public ViewGroup A01;
    public C351988Bf A02;
    public C40240AXe A03;
    public C366798ph A04;
    public C378249Pb A05;
    public boolean A06;
    public int A07;
    public boolean A08;
    public final Context A09;
    public final ImmutableList A0A;
    public final UserSession A0B;
    public final int A0C;

    public AnonymousClass8CT(Context context, AnonymousClass9IV r5, UserSession userSession, C378249Pb r7, int i) {
        0qQ.A0B(userSession, 2);
        this.A09 = context;
        this.A0B = userSession;
        this.A05 = r7;
        this.A0C = i;
        ImmutableList copyOf = ImmutableList.copyOf((Object[]) r5.A00);
        0qQ.A07(copyOf);
        this.A0A = copyOf;
        this.A07 = i;
        C351988Bf r1 = (C351988Bf) r5.A01;
        if (!copyOf.contains(r1)) {
            Object obj = copyOf.get(0);
            0qQ.A07(obj);
            r1 = (C351988Bf) obj;
        }
        this.A02 = r1;
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final void A00(boolean z) {
        EphemeralMediaToggleView ephemeralMediaToggleView;
        AnonymousClass0eM r0;
        C252063oV r02;
        View view;
        C378249Pb r1;
        AnonymousClass0eM r03;
        C252063oV r04;
        View view2;
        C378249Pb r05;
        AnonymousClass0eM r06;
        C252063oV r07;
        View view3;
        ViewGroup viewGroup;
        AnonymousClass0eM r08;
        ReshareTogglePickerView reshareTogglePickerView;
        AnonymousClass0eM r09;
        C252063oV r010;
        View view4;
        C378249Pb r12;
        View view5;
        AnonymousClass0eM r011;
        ReshareTogglePickerView reshareTogglePickerView2;
        AnonymousClass0eM r012;
        C252063oV r013;
        View view6;
        C378249Pb r13;
        View view7;
        if (!this.A08 || z) {
            this.A08 = true;
            int i = this.A07;
            if (i == 2) {
                ViewGroup viewGroup2 = this.A01;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                C378249Pb r014 = this.A05;
                if (r014 != null) {
                    AnonymousClass0eM r015 = r014.A0B;
                    if (r015 != null) {
                        ((C252063oV) r015.getValue()).getView().setVisibility(0);
                        C378249Pb r016 = this.A05;
                        if (!(r016 == null || (r0 = r016.A0B) == null || (r02 = (C252063oV) r0.getValue()) == null || (view = r02.getView()) == null || (r1 = this.A05) == null)) {
                            r1.A0A = (EphemeralMediaToggleView) view.requireViewById(R.id.mode_picker);
                        }
                        C378249Pb r017 = this.A05;
                        if (r017 != null) {
                            View requireViewById = r017.A0D.requireViewById(R.id.recipient_view_mode_picker_toggle_gradient_dim);
                            0qQ.A07(requireViewById);
                            requireViewById.setVisibility(0);
                            requireViewById.getLayoutParams().height = this.A09.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_text_button_min_width);
                        }
                        C378249Pb r018 = this.A05;
                        if (r018 != null && (ephemeralMediaToggleView = r018.A0A) != null) {
                            this.A04 = new C366798ph(this.A09, this.A0A, this.A0B, this.A02, ephemeralMediaToggleView);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            } else if (i == 3) {
                C378249Pb r2 = this.A05;
                if (r2 != null) {
                    TextView textView = null;
                    AnonymousClass0eM r019 = r2.A0B;
                    if (r019 != null) {
                        r2.A06 = (ViewGroup) ((C252063oV) r019.getValue()).getView().requireViewById(R.id.mode_picker);
                        C378249Pb r020 = this.A05;
                        if (!(r020 == null || (viewGroup = r020.A06) == null)) {
                            textView = (TextView) viewGroup.findViewById(R.id.static_picker);
                        }
                        C378249Pb r021 = this.A05;
                        if (textView == null) {
                            if (!(r021 == null || (r06 = r021.A0B) == null || (r07 = (C252063oV) r06.getValue()) == null || (view3 = r07.getView()) == null)) {
                                view3.setVisibility(8);
                            }
                            ViewGroup viewGroup3 = this.A01;
                            if (viewGroup3 == null && (r05 = this.A05) != null) {
                                View inflate = ((ViewStub) r05.A0D.requireViewById(R.id.recipient_view_mode_one_day_expiry_stub)).inflate();
                                0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                                viewGroup3 = (ViewGroup) inflate;
                                this.A01 = viewGroup3;
                            }
                            if (viewGroup3 != null) {
                                viewGroup3.setVisibility(0);
                                viewGroup3.requireViewById(R.id.static_picker);
                                return;
                            }
                            return;
                        }
                        if (!(r021 == null || (r03 = r021.A0B) == null || (r04 = (C252063oV) r03.getValue()) == null || (view2 = r04.getView()) == null)) {
                            view2.setVisibility(8);
                        }
                        textView.setText(2131971403);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            } else if (i == 4) {
                C378249Pb r022 = this.A05;
                if (r022 != null && (r08 = r022.A0B) != null) {
                    C252063oV r023 = (C252063oV) r08.getValue();
                    if (!(r023 == null || (view5 = r023.getView()) == null)) {
                        view5.setVisibility(0);
                    }
                    C378249Pb r024 = this.A05;
                    if (!(r024 == null || (r09 = r024.A0B) == null || (r010 = (C252063oV) r09.getValue()) == null || (view4 = r010.getView()) == null || (r12 = this.A05) == null)) {
                        r12.A09 = (ReshareTogglePickerView) view4.requireViewById(R.id.mode_picker);
                    }
                    C378249Pb r025 = this.A05;
                    if (r025 != null) {
                        View requireViewById2 = r025.A0D.requireViewById(R.id.recipient_view_mode_picker_toggle_gradient_dim);
                        0qQ.A07(requireViewById2);
                        requireViewById2.setVisibility(0);
                        requireViewById2.getLayoutParams().height = this.A09.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_text_button_min_width);
                    }
                    C378249Pb r026 = this.A05;
                    if (r026 != null && (reshareTogglePickerView = r026.A09) != null) {
                        this.A03 = new C40240AXe(this.A09, this.A0B, reshareTogglePickerView, AnonymousClass05K.A00);
                    }
                }
            } else if (i == 5) {
                C378249Pb r027 = this.A05;
                if (r027 != null && (r011 = r027.A0B) != null) {
                    C252063oV r028 = (C252063oV) r011.getValue();
                    if (!(r028 == null || (view7 = r028.getView()) == null)) {
                        view7.setVisibility(0);
                    }
                    C378249Pb r029 = this.A05;
                    if (!(r029 == null || (r012 = r029.A0B) == null || (r013 = (C252063oV) r012.getValue()) == null || (view6 = r013.getView()) == null || (r13 = this.A05) == null)) {
                        r13.A09 = (ReshareTogglePickerView) view6.requireViewById(R.id.mode_picker);
                    }
                    C378249Pb r030 = this.A05;
                    if (!(r030 == null || (reshareTogglePickerView2 = r030.A09) == null)) {
                        reshareTogglePickerView2.setVisibility(8);
                    }
                    C378249Pb r031 = this.A05;
                    if (r031 != null) {
                        View requireViewById3 = r031.A0D.requireViewById(R.id.recipient_view_mode_picker_toggle_gradient_dim);
                        0qQ.A07(requireViewById3);
                        requireViewById3.setVisibility(0);
                        requireViewById3.getLayoutParams().height = this.A09.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_text_button_min_width);
                    }
                }
            } else if (i != 7) {
                0kD.A07("DirectViewModesPickerController", "unidentified view mode entry point", (Throwable) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r4.A0L == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r6 != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(boolean r6) {
        /*
            r5 = this;
            X.9Pb r4 = r5.A05
            if (r4 == 0) goto L_0x0029
            android.view.View r1 = r4.A0D
            android.content.Context r3 = r1.getContext()
            r0 = 2131431733(0x7f0b1135, float:1.8485204E38)
            android.view.View r2 = r1.requireViewById(r0)
            X.0qQ.A07(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0 = 2131968361(0x7f134169, float:1.9573614E38)
            java.lang.String r1 = r3.getString(r0)
            X.0qQ.A07(r1)
            if (r6 == 0) goto L_0x002c
            r2.setText(r1)
        L_0x0025:
            r0 = 3
        L_0x0026:
            r5.A07 = r0
            return
        L_0x0029:
            if (r6 == 0) goto L_0x004c
            goto L_0x0025
        L_0x002c:
            java.lang.CharSequence r0 = r2.getText()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x004c
            int r1 = r4.A00
            r0 = 2
            if (r1 != r0) goto L_0x0042
            boolean r1 = r4.A0L
            r0 = 2131960305(0x7f1321f1, float:1.9557275E38)
            if (r1 != 0) goto L_0x0045
        L_0x0042:
            r0 = 2131960296(0x7f1321e8, float:1.9557257E38)
        L_0x0045:
            java.lang.String r0 = r3.getString(r0)
            r2.setText(r0)
        L_0x004c:
            int r0 = r5.A0C
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8CT.A01(boolean):void");
    }
}
