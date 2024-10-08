package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.List;

/* renamed from: X.8pV  reason: invalid class name and case insensitive filesystem */
public final class C366688pV {
    public static final AnonymousClass3QG A0D;
    public CameraAREffect A00;
    public TransformMatrixConfig A01;
    public C370198vz A02;
    public C370158vv A03 = new C370158vv(false);
    public C366668pT A04;
    public AnonymousClass8PW A05;
    public FilterGroupModel A06;
    public AnonymousClass3QS A07 = new AnonymousClass3QS();
    public AnonymousClass3QG A08;
    @Deprecated
    public String A09;
    @Deprecated
    public List A0A;
    public boolean A0B;
    public boolean A0C;

    static {
        AnonymousClass3QG r1 = new AnonymousClass3QG();
        r1.A01 = 0;
        r1.A00 = 100;
        A0D = r1;
    }

    public C366688pV(CameraAREffect cameraAREffect, TransformMatrixConfig transformMatrixConfig, C370198vz r5, C370158vv r6, C366668pT r7, AnonymousClass8PW r8, FilterGroupModel filterGroupModel, AnonymousClass3QS r10, AnonymousClass3QG r11, boolean z, boolean z2) {
        String str;
        this.A04 = r7;
        this.A08 = r11;
        this.A0B = z;
        this.A02 = r5;
        this.A00 = cameraAREffect;
        if (cameraAREffect != null) {
            str = cameraAREffect.A0K;
        } else {
            str = null;
        }
        this.A09 = str;
        this.A05 = r8;
        this.A01 = transformMatrixConfig;
        this.A0C = z2;
        this.A07 = r10;
        this.A03 = r6;
        this.A06 = filterGroupModel;
    }

    public C366688pV() {
    }
}
