package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.9lA  reason: invalid class name and case insensitive filesystem */
public final class C386789lA extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass9I2 A01;
    public final /* synthetic */ List A02;

    public final void run() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        List list = this.A02;
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1QU r0 = ((C252013oQ) AnonymousClass7TF.A0a(it)).A04;
            0qQ.A06(r0);
            boolean A002 = AnonymousClass1RU.A00(r0);
            int ordinal = r0.A09.ordinal();
            if (A002) {
                if (ordinal == 3 || ordinal == 2) {
                    i++;
                } else if (ordinal == 1) {
                    i3++;
                } else if (ordinal == 8) {
                    i5++;
                }
            } else if (ordinal == 3 || ordinal == 2) {
                i2++;
            } else if (ordinal == 1) {
                i4++;
            } else if (ordinal == 8) {
                i6++;
            }
        }
        AnonymousClass9I2 r5 = this.A01;
        0qQ.A0B(r5, 1);
        1wo.A00();
        int i7 = this.A00;
        if (02m.A0p.isMarkerOn(25624577, i7)) {
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_PENDING_REQUEST", size);
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_ONSCREEN_VIDEO_REQUESTS_PENDING", i3);
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_ONSCREEN_IMAGE_REQUESTS_PENDING", i);
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_ONSCREEN_ANALYTICS_REQUESTS_PENDING", i5);
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_OFFSCREEN_VIDEO_REQUESTS_PENDING", i4);
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_OFFSCREEN_IMAGE_REQUESTS_PENDING", i2);
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_OFFSCREEN_ANALYTICS_REQUESTS_PENDING", i6);
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_EXECUTING_REQUEST", r5.A06);
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_ONSCREEN_VIDEO_REQUESTS_EXECUTING", r5.A05);
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_ONSCREEN_IMAGE_REQUESTS_EXECUTING", r5.A03);
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_ONSCREEN_ANALYTICS_REQUESTS_EXECUTING", r5.A01);
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_OFFSCREEN_VIDEO_REQUESTS_EXECUTING", r5.A04);
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_OFFSCREEN_IMAGE_REQUESTS_EXECUTING", r5.A02);
            02m.A0p.markerAnnotate(25624577, i7, "NUMBER_OFFSCREEN_ANALYTICS_REQUESTS_EXECUTING", r5.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386789lA(AnonymousClass9I2 r4, List list, int i) {
        super(8, 5, false, false);
        this.A02 = list;
        this.A01 = r4;
        this.A00 = i;
    }
}
