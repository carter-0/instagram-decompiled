package X;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.7Rx  reason: invalid class name and case insensitive filesystem */
public final class C331677Rx extends C331647Ru implements C13907Tl7, C331687Ry {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public RecyclerView A04;
    public AnonymousClass2t9 A05;
    public C252063oV A06;
    public IgdsButton A07;
    public IgdsButton A08;
    public IgdsButton A09;
    public IgdsButton A0A;
    public final AnonymousClass4DH A0B;
    public final AnonymousClass0eM A0C = AnonymousClass1YB.A00(new AnonymousClass9L5(this, 23));
    public final C62320sa A0D;
    public final C62320sa A0E;
    public final 0sP A0F;
    public final 0sP A0G;
    public final AnonymousClass0eM A0H;

    public final void D5M(AnonymousClass7GK r2) {
        0qQ.A0B(r2, 0);
        A00(this).updateThread(r2);
    }

    public final void D8w(AnonymousClass7L2 r2) {
        0qQ.A0B(r2, 0);
        A00(this).updateTheme(r2);
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public static final CreatorAgentSuggestedRepliesViewModel A00(C331677Rx r0) {
        return (CreatorAgentSuggestedRepliesViewModel) r0.A0H.getValue();
    }

    public static final void A01(C331677Rx r2) {
        String str;
        IgdsButton igdsButton = r2.A08;
        if (igdsButton == null) {
            str = "edit";
        } else {
            igdsButton.setVisibility(8);
            IgdsButton igdsButton2 = r2.A0A;
            if (igdsButton2 == null) {
                str = "send";
            } else {
                igdsButton2.setVisibility(8);
                IgdsButton igdsButton3 = r2.A09;
                if (igdsButton3 == null) {
                    str = "refresh";
                } else {
                    igdsButton3.setVisibility(8);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 108) {
            A00(this).checkIfNuxAccepted();
        }
    }

    public final void onDestroy(AnonymousClass07Z r4) {
        C62320sa r2 = this.A0D;
        AnonymousClass3E6 r1 = (AnonymousClass3E6) r2.invoke();
        if (r1 != null) {
            r1.EEH((C252213ok) this.A0C.getValue());
        }
        AnonymousClass3E6 r0 = (AnonymousClass3E6) r2.invoke();
        if (r0 != null) {
            r0.onDestroy();
        }
        A00(this).updateThread((AnonymousClass7GK) null);
    }

    public final void onPause(AnonymousClass07Z r2) {
        AnonymousClass3E6 r0 = (AnonymousClass3E6) this.A0D.invoke();
        if (r0 != null) {
            r0.onStop();
        }
    }

    public final void onResume(AnonymousClass07Z r3) {
        AnonymousClass3E6 r1 = (AnonymousClass3E6) this.A0D.invoke();
        if (r1 != null) {
            r1.DmJ(this.A0B.requireActivity());
        }
    }

    public C331677Rx(AnonymousClass4DH r6, C331627Rs r7, C62320sa r8, C62320sa r9, 0sP r10, 0sP r11) {
        super(r7);
        this.A0B = r6;
        this.A0D = r8;
        this.A0F = r10;
        this.A0G = r11;
        this.A0E = r9;
        this.A0H = new C227862kA(new AnonymousClass9L5(this, 24), new AnonymousClass9L5(r7, 25), C317496nM.A00, new 0Yh(CreatorAgentSuggestedRepliesViewModel.class));
    }
}
