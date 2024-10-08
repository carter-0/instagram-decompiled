package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.6Ut  reason: invalid class name and case insensitive filesystem */
public final class C308566Ut {
    public final View A00;
    public final AnonymousClass6V6 A01;
    public final AnonymousClass6V4 A02;
    public final C308576Uu A03;
    public final AnonymousClass6V1 A04;
    public final AnonymousClass6V5 A05;
    public final AnonymousClass6V2 A06;
    public final AnonymousClass6V3 A07;
    public final Map A08;
    public final 0sJ A09;
    public final 0sJ A0A;
    public final 0sJ A0B;
    public final 0sJ A0C;
    public final 0sJ A0D;
    public final 0sJ A0E;
    public final 0sJ A0F;

    public C308566Ut(View view) {
        View view2 = view;
        0qQ.A0B(view2, 1);
        this.A00 = view2;
        View requireViewById = view2.requireViewById(R.id.reel_viewer_superlative_intro_view_stub);
        0qQ.A07(requireViewById);
        C308576Uu r15 = new C308576Uu((ViewStub) requireViewById);
        this.A03 = r15;
        AnonymousClass9LQ r0 = new AnonymousClass9LQ(this, 7);
        this.A0B = r0;
        View requireViewById2 = this.A00.requireViewById(R.id.reel_viewer_superlative_lots_of_heart_view_stub);
        0qQ.A07(requireViewById2);
        AnonymousClass6V1 r13 = new AnonymousClass6V1((ViewStub) requireViewById2);
        this.A04 = r13;
        AnonymousClass9LQ r12 = new AnonymousClass9LQ(this, 8);
        this.A0C = r12;
        View requireViewById3 = this.A00.requireViewById(R.id.reel_viewer_superlative_top_account_view_stub);
        0qQ.A07(requireViewById3);
        AnonymousClass6V2 r11 = new AnonymousClass6V2((ViewStub) requireViewById3);
        this.A06 = r11;
        AnonymousClass9LQ r9 = new AnonymousClass9LQ(this, 10);
        this.A0E = r9;
        View requireViewById4 = this.A00.requireViewById(R.id.reel_viewer_superlative_top_content_view_stub);
        0qQ.A07(requireViewById4);
        AnonymousClass6V3 r8 = new AnonymousClass6V3((ViewStub) requireViewById4);
        this.A07 = r8;
        AnonymousClass9LQ r7 = new AnonymousClass9LQ(this, 11);
        this.A0F = r7;
        View requireViewById5 = this.A00.requireViewById(R.id.reel_viewer_superlative_day_one_view_stub);
        0qQ.A07(requireViewById5);
        AnonymousClass6V4 r6 = new AnonymousClass6V4((ViewStub) requireViewById5);
        this.A02 = r6;
        AnonymousClass9LQ r5 = new AnonymousClass9LQ(this, 5);
        this.A09 = r5;
        View requireViewById6 = this.A00.requireViewById(R.id.reel_viewer_superlative_tag_teammate_view_stub);
        0qQ.A07(requireViewById6);
        AnonymousClass6V5 r4 = new AnonymousClass6V5((ViewStub) requireViewById6);
        this.A05 = r4;
        AnonymousClass9LQ r3 = new AnonymousClass9LQ(this, 9);
        this.A0D = r3;
        View requireViewById7 = this.A00.requireViewById(R.id.reel_viewer_superlative_conclusion_view_stub);
        0qQ.A07(requireViewById7);
        AnonymousClass6V6 r2 = new AnonymousClass6V6((ViewStub) requireViewById7);
        this.A01 = r2;
        AnonymousClass9LQ r1 = new AnonymousClass9LQ(this, 6);
        this.A0A = r1;
        0eP r152 = new 0eP(C250963mL.SUPERLATIVE_INTRO, new AnonymousClass6V7(r15, r0));
        0eP r122 = new 0eP(C250963mL.SUPERLATIVE_SUPERSTAR, new AnonymousClass6V7(r13, r12));
        0eP r16 = r122;
        this.A08 = 0Yt.A06(new 0eP[]{r152, r16, new 0eP(C250963mL.SUPERLATIVE_TOP_ACCOUNT, new AnonymousClass6V7(r11, r9)), new 0eP(C250963mL.SUPERLATIVE_TOP_CONTENT, new AnonymousClass6V7(r8, r7)), new 0eP(C250963mL.SUPERLATIVE_DAY_ONE, new AnonymousClass6V7(r6, r5)), new 0eP(C250963mL.SUPERLATIVE_TAG_TEAMMATE, new AnonymousClass6V7(r4, r3)), new 0eP(C250963mL.SUPERLATIVE_END_SUMMARY, new AnonymousClass6V7(r2, r1))});
    }
}
