package X;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5J5  reason: invalid class name */
public final class AnonymousClass5J5 {
    public static final AnonymousClass5J6 A01 = new Object();
    public final Integer A00;

    public final C265674Vs A01(SidecarDeviceState sidecarDeviceState, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        0sn arrayList;
        C18547Vtz vtz;
        C18546Vty vty;
        if (sidecarWindowLayoutInfo == null) {
            arrayList = 0sn.A00;
        } else {
            SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
            AnonymousClass5J6 r4 = A01;
            AnonymousClass5J6.A01(sidecarDeviceState2, r4.A02(sidecarDeviceState));
            List<SidecarDisplayFeature> A002 = AnonymousClass5J6.A00(sidecarWindowLayoutInfo);
            0qQ.A0B(A002, 0);
            arrayList = new ArrayList();
            for (SidecarDisplayFeature sidecarDisplayFeature : A002) {
                0qQ.A0B(sidecarDisplayFeature, 0);
                Integer num = this.A00;
                Sg4 sg4 = Sg4.A00;
                0qQ.A0B(num, 2);
                0qQ.A0B(sg4, 3);
                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new C7482QFl(sg4, num, sidecarDisplayFeature).A00("Type must be either TYPE_FOLD or TYPE_HINGE", TWf.A00).A00("Feature bounds must not be 0", TWg.A00).A00("TYPE_FOLD must have 0 area", TWh.A00).A00("Feature be pinned to either left or top", TWi.A00).A01();
                if (sidecarDisplayFeature2 != null) {
                    int type = sidecarDisplayFeature2.getType();
                    if (type == 1) {
                        vtz = C18547Vtz.A01;
                    } else if (type == 2) {
                        vtz = C18547Vtz.A02;
                    }
                    int A02 = r4.A02(sidecarDeviceState2);
                    if (!(A02 == 0 || A02 == 1)) {
                        if (A02 == 2) {
                            vty = C18546Vty.A02;
                        } else if (A02 == 3 || A02 != 4) {
                            vty = C18546Vty.A01;
                        }
                        Rect rect = sidecarDisplayFeature.getRect();
                        0qQ.A07(rect);
                        arrayList.add(new C18958WEl(new 2YF(rect), vty, vtz));
                    }
                }
            }
        }
        return new C265674Vs(arrayList);
    }

    public AnonymousClass5J5(Integer num) {
        this.A00 = num;
    }

    public static final boolean A00(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (0qQ.A0K(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null) {
            return false;
        }
        AnonymousClass5J6 r0 = A01;
        if (r0.A02(sidecarDeviceState) != r0.A02(sidecarDeviceState2)) {
            return false;
        }
        return true;
    }

    public final boolean A02(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (0qQ.A0K(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        List A002 = AnonymousClass5J6.A00(sidecarWindowLayoutInfo);
        List A003 = AnonymousClass5J6.A00(sidecarWindowLayoutInfo2);
        if (A002 == A003) {
            return true;
        }
        if (!(A002 == null || A003 == null || A002.size() != A003.size())) {
            int size = A002.size();
            int i = 0;
            while (i < size) {
                SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) A002.get(i);
                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) A003.get(i);
                if (0qQ.A0K(sidecarDisplayFeature, sidecarDisplayFeature2) || (sidecarDisplayFeature != null && sidecarDisplayFeature2 != null && sidecarDisplayFeature.getType() == sidecarDisplayFeature2.getType() && 0qQ.A0K(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect()))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public AnonymousClass5J5() {
        this(AnonymousClass05K.A0C);
    }
}
