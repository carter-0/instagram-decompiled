package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.music.common.model.AudioOverlayTrack;

public final class K52 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "MusicProfileFragment";
    public Context A00;
    public AudioOverlayTrack A01;
    public AudioOverlayTrack A02;
    public LEC A03;
    public C322326ve A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final String A08 = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A09 = DbS.A0I(MMS.A00(this, 27), MMS.A00(this, 26), MMW.A00((Object) null, this, 42), DbS.A0z(C322296vZ.class));
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131967856);
        DbX.A1A(new C64273LXz(this, 5), DbV.A0K(), r4);
        r4.ErD(new C64273LXz(this, 6), R.drawable.instagram_check_pano_outline_24);
        AnonymousClass9IP r0 = (AnonymousClass9IP) ((C322296vZ) this.A09.getValue()).A01.A02();
        boolean z = true;
        if (r0 == null || !r0.A02) {
            z = false;
        }
        r4.ARJ(z);
    }

    public final String getModuleName() {
        return "music_settings";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0I = DbX.A0I(view, R.id.music_profile_fragment_container);
        if (this.A06) {
            AnonymousClass0eM r2 = this.A09;
            ((C322296vZ) r2.getValue()).A00();
            Context context = this.A00;
            if (context == null) {
                str = "context";
            } else {
                U56 u56 = new U56(context);
                u56.A02(AnonymousClass7TF.A0d(DbV.A05(this), 2131967793), false);
                A0I.addView(u56, 0);
                LEC lec = new LEC(JTR.A0X(view, R.id.music_on_profile_stub));
                this.A03 = lec;
                lec.A00();
                LEC lec2 = this.A03;
                str = "viewHolder";
                if (lec2 != null) {
                    IgdsButton igdsButton = lec2.A06;
                    if (igdsButton != null) {
                        igdsButton.setText(2131971974);
                        C64273LXz.A00(igdsButton, 7, this);
                    }
                    LEC lec3 = this.A03;
                    if (lec3 != null) {
                        ConstraintLayout constraintLayout = lec3.A00;
                        if (constraintLayout != null) {
                            C64273LXz.A00(constraintLayout, 8, this);
                        }
                        DbV.A1F(getViewLifecycleOwner(), ((C322296vZ) r2.getValue()).A01, new MP7(this, 34), 26);
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        if (this.A07) {
            this.A07 = false;
            view.postDelayed(new C65912M4b(this), 500);
        }
        DbZ.A1C(this, new C66929MfO(this, A0I, (AnonymousClass4D7) null, 38), ((C322296vZ) this.A09.getValue()).A04);
    }

    public static final void A00(K52 k52, boolean z) {
        AudioOverlayTrack audioOverlayTrack = k52.A02;
        if (audioOverlayTrack != null) {
            AnonymousClass0eM r3 = k52.A0A;
            Bundle A092 = DbY.A09(JTS.A0J(r3));
            A092.putBoolean("is_existing_track", z);
            A092.putParcelable("selected_audio_track", audioOverlayTrack);
            K73 k73 = new K73();
            k73.setArguments(A092);
            C331127Pr A0f = DbX.A0f(r3);
            A0f.A0T = k73;
            DbY.A13(k52, k73, A0f);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-407004925);
        K52.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireContext();
        AnonymousClass0eM r1 = this.A0A;
        this.A06 = AnonymousClass30D.A0A(AnonymousClass7TE.A0l(r1));
        this.A07 = requireArguments.getBoolean("music_profile_should_open_for_editing");
        this.A04 = C322316vd.A00(AnonymousClass7TE.A0l(r1));
        if (this.A07) {
            this.A05 = true;
            this.A02 = (AudioOverlayTrack) requireArguments.getParcelable("music_profile_open_for_editing_audio_track");
        }
        AnonymousClass0fD.A09(26099513, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(378089355);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.music_profile_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1579839057, A022);
        return inflate;
    }
}
