package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jl0  reason: case insensitive filesystem */
public final class C60407Jl0 extends 2Rw {
    public List A00 = 0sn.A00;
    public Map A01;
    public final float A02;
    public final Context A03;
    public final LEZ A04;
    public final L0W A05;
    public final Map A06 = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A07 = MMR.A00(this, 2);

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60693Jpe(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.layout_stacked_timeline_volume_controls_item, false), this, this.A04);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r11, int i) {
        ConstraintLayout constraintLayout;
        IgTextView igTextView;
        IgTextView igTextView2;
        String A0i;
        Integer A012;
        C60693Jpe jpe = (C60693Jpe) r11;
        0qQ.A0B(jpe, 0);
        C60964JuM juM = (C60964JuM) this.A00.get(i);
        0qQ.A0B(juM, 1);
        jpe.A03 = juM;
        L0W l0w = juM.A03;
        String str = "";
        if (l0w instanceof C61789KMd) {
            jpe.A06.setVisibility(0);
            IgImageView igImageView = jpe.A02;
            JYP.A00(igImageView, juM.A02);
            igImageView.setVisibility(0);
            IgTextView igTextView3 = jpe.A08;
            igTextView3.setText(juM.A07);
            igTextView3.setVisibility(0);
            IgTextView igTextView4 = jpe.A07;
            String str2 = juM.A06;
            if (str2 != null) {
                str = str2;
            }
            igTextView4.setText(str);
            igTextView4.setVisibility(0);
        } else {
            if (l0w instanceof C61790KMe) {
                jpe.A06.setVisibility(0);
                jpe.A02.setVisibility(8);
                C60407Jl0 jl0 = jpe.A0D;
                L0W l0w2 = jl0.A05;
                IgTextView igTextView5 = jpe.A08;
                Context context = jl0.A03;
                Resources resources = context.getResources();
                int i2 = 2131955288;
                if (l0w2 == null) {
                    i2 = 2131955289;
                }
                DbU.A1A(resources, igTextView5, i2);
                igTextView5.setVisibility(0);
                if (l0w2 == null) {
                    igTextView2 = jpe.A07;
                    A0i = context.getResources().getString(2131955290);
                } else {
                    int A062 = AnonymousClass7TE.A06(jl0.A02, 100.0f);
                    if (A062 < 100) {
                        igTextView2 = jpe.A07;
                        A0i = JTS.A0i(context.getResources(), A062, 2131955291);
                    }
                    igTextView = jpe.A07;
                }
                igTextView2.setText(A0i);
                igTextView = jpe.A07;
            } else {
                if (0qQ.A0K(l0w, C61794KMi.A00)) {
                    if (juM.A00 == -1.0f) {
                        constraintLayout = jpe.A06;
                    }
                    jpe.A06.setVisibility(0);
                    jpe.A02.setVisibility(8);
                    IgTextView igTextView6 = jpe.A08;
                    igTextView6.setText(juM.A07);
                    igTextView6.setVisibility(0);
                    constraintLayout = jpe.A07;
                } else {
                    if (!0qQ.A0K(l0w, C61791KMf.A00) && !0qQ.A0K(l0w, C61792KMg.A00)) {
                        if (0qQ.A0K(l0w, C61793KMh.A00)) {
                            jpe.A06.setVisibility(0);
                            jpe.A02.setVisibility(8);
                            IgTextView igTextView7 = jpe.A08;
                            igTextView7.setText(juM.A07);
                            igTextView7.setVisibility(0);
                            igTextView = jpe.A07;
                            if (juM.A01) {
                                String str3 = juM.A06;
                                if (str3 != null) {
                                    str = str3;
                                }
                            } else {
                                str = jpe.A0D.A03.getResources().getString(2131955234);
                                0qQ.A0A(str);
                            }
                            igTextView.setText(str);
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                    }
                    jpe.A06.setVisibility(0);
                    jpe.A02.setVisibility(8);
                    IgTextView igTextView62 = jpe.A08;
                    igTextView62.setText(juM.A07);
                    igTextView62.setVisibility(0);
                    constraintLayout = jpe.A07;
                }
                constraintLayout.setVisibility(8);
            }
            igTextView.setVisibility(0);
            igTextView.setMaxLines(Integer.MAX_VALUE);
        }
        float f = juM.A00;
        jpe.A01 = f;
        if (f == 0.0f) {
            A012 = C60693Jpe.A00(jpe);
        } else {
            A012 = C60693Jpe.A01(jpe);
        }
        C60693Jpe.A04(jpe, A012);
        IgEditSeekBar igEditSeekBar = jpe.A0C;
        igEditSeekBar.setOnSliderChangeListener(new C65760LzE(jpe, jpe.A0D, juM, i));
        IgImageView igImageView2 = jpe.A0A;
        0nA.A0n(igImageView2, jpe.A05, R.dimen.abc_edit_text_inset_top_material);
        LY9.A00(igImageView2, juM, jpe, i, 4);
        C60693Jpe.A03(jpe, l0w, jpe.A01);
        igEditSeekBar.setEnabled(juM.A01);
    }

    public C60407Jl0(Context context, LEZ lez, L0W l0w, float f) {
        this.A03 = context;
        this.A04 = lez;
        this.A05 = l0w;
        this.A02 = f;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1229726250);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(974093896, A032);
        return size;
    }
}
