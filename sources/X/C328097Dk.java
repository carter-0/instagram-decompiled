package X;

import android.content.ClipData;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;

/* renamed from: X.7Dk  reason: invalid class name and case insensitive filesystem */
public final class C328097Dk implements C328107Dl {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass7DS A01;
    public final /* synthetic */ AnonymousClass7DU A02;
    public final /* synthetic */ AnonymousClass7DW A03;
    public final /* synthetic */ C3266177m A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ boolean A06;

    public final /* bridge */ /* synthetic */ boolean DRb(MotionEvent motionEvent, Object obj) {
        0qQ.A0B(motionEvent, 1);
        return this.A01.DRa(motionEvent, obj, this.A05);
    }

    public final /* bridge */ /* synthetic */ void DRg(MotionEvent motionEvent, Object obj, boolean z) {
        0qQ.A0B(motionEvent, 1);
        this.A03.DRg(motionEvent, obj, z);
        if (this.A06) {
            try {
                this.A00.startDragAndDrop(ClipData.newPlainText("message_long_press_drag", ""), new C52842GdY(), (Object) null, 0);
            } catch (Surface.OutOfResourcesException | IllegalStateException unused) {
            }
        }
    }

    public C328097Dk(View view, AnonymousClass7DS r2, AnonymousClass7DU r3, AnonymousClass7DW r4, C3266177m r5, Object obj, boolean z) {
        this.A01 = r2;
        this.A05 = obj;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = z;
        this.A00 = view;
        this.A04 = r5;
    }

    public final /* bridge */ /* synthetic */ boolean DA7(Object obj) {
        return this.A02.DA8(obj, this.A05);
    }

    public final /* bridge */ /* synthetic */ boolean DsN(MotionEvent motionEvent, Object obj) {
        AnonymousClass7FU r6 = (AnonymousClass7FU) obj;
        C3266177m r0 = this.A04;
        if (r0 == null) {
            return false;
        }
        AnonymousClass7XA r2 = r0.A00;
        C68820NYe nYe = (C68820NYe) r6;
        if (nYe.A02 != AnonymousClass05K.A01) {
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        ((AnonymousClass7Y3) r2).CLb(nYe.BSG().A01);
        ((AnonymousClass7TK) r2).ARf(true);
        return false;
    }
}
