package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.8lx  reason: invalid class name and case insensitive filesystem */
public final class C364758lx {
    public int A00;
    public CameraAREffect A01;
    public CropInfo A02;
    public TransformMatrixConfig A03;
    public C366668pT A04;
    public AnonymousClass8PW A05;
    public FilterGroupModel A06;
    public LinkedHashMap A07;
    public List A08;
    @Deprecated
    public List A09;
    public boolean A0A;

    public C364758lx(CameraAREffect cameraAREffect, CropInfo cropInfo, TransformMatrixConfig transformMatrixConfig, C366668pT r4, AnonymousClass8PW r5, FilterGroupModel filterGroupModel, LinkedHashMap linkedHashMap, List list, int i, boolean z) {
        this.A04 = r4;
        this.A00 = i;
        this.A01 = cameraAREffect;
        this.A06 = filterGroupModel;
        this.A05 = r5;
        this.A03 = transformMatrixConfig;
        this.A07 = linkedHashMap;
        this.A02 = cropInfo;
        this.A0A = z;
        this.A08 = list;
    }

    public C364758lx() {
    }
}
