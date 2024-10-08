package X;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.meta.compose.component.swipeable.SwipeableState;

/* renamed from: X.AwB  reason: case insensitive filesystem */
public final class C41545AwB extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final float A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41545AwB(Object obj, Object obj2, AnonymousClass4D7 r4, float f, int i) {
        super(2, r4);
        this.A02 = i;
        this.A03 = obj;
        this.A00 = obj2;
        this.A01 = f;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.AwB, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.AwB, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        int i;
        float f;
        Object obj2;
        Object obj3;
        AnonymousClass4D7 r5 = r10;
        switch (this.A02) {
            case 0:
                obj3 = this.A03;
                obj2 = this.A00;
                f = this.A01;
                i = 0;
                break;
            case 1:
                obj3 = this.A03;
                obj2 = this.A00;
                f = this.A01;
                i = 1;
                break;
            default:
                ? awB = new C41545AwB((SwipeableState) this.A03, r10, this.A01);
                awB.A00 = obj;
                return awB;
        }
        return new C41545AwB(obj3, obj2, r5, f, i);
    }

    public final Object invokeSuspend(Object obj) {
        WindowManager windowManager;
        Display defaultDisplay;
        switch (this.A02) {
            case 0:
                0eS.A00(obj);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                FragmentActivity activity = ((Fragment) this.A03).getActivity();
                if (!(activity == null || (windowManager = activity.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
                ((AnonymousClass37D) this.A00).A0F(this.A01);
                break;
            case 1:
                0eS.A00(obj);
                AnonymousClass8GT r3 = (AnonymousClass8GT) this.A03;
                1FH.A00(AnonymousClass8GV.NORMAL, AnonymousClass8GV.EASING, r3.A09);
                float f = this.A01;
                AnonymousClass8GD r1 = r3.A06;
                C340547lR r0 = ((BasicCameraOutputController) C340297l2.A02((C340297l2) this.A00)).A04;
                if (r0 != null) {
                    r0.A0N.Evu(r1, f);
                    break;
                }
                break;
            default:
                0eS.A00(obj);
                ((JNO) this.A00).AQD(this.A01 - AnonymousClass7TE.A04(((SwipeableState) this.A03).A04.getValue()));
                break;
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C41545AwB) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41545AwB(SwipeableState swipeableState, AnonymousClass4D7 r3, float f) {
        super(2, r3);
        this.A02 = 2;
        this.A01 = f;
        this.A03 = swipeableState;
    }
}
