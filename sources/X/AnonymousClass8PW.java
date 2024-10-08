package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8PW  reason: invalid class name */
public final class AnonymousClass8PW {
    public int A00;
    public int A01;
    public BrandedContentGatingInfo A02;
    public BrandedContentProjectMetadata A03;
    public MediaGenAIDetectionMethod A04;
    public UserSession A05;
    public C354948Nz A06;
    public C354998Oe A07;
    public String A08;
    public LinkedHashMap A09;
    public List A0A;
    public List A0B;
    public List A0C;
    public List A0D;
    public List A0E;
    public List A0F;
    public List A0G;
    public List A0H;
    public List A0I;
    public List A0J;
    public Map A0K;
    public AnonymousClass0eM A0L;
    public AnonymousClass0eM A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public int A0S;
    public boolean A0T;
    public final TransformMatrixParams A0U;

    public AnonymousClass8PW(TransformMatrixParams transformMatrixParams, BrandedContentGatingInfo brandedContentGatingInfo, BrandedContentProjectMetadata brandedContentProjectMetadata, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, C354948Nz r10, C354998Oe r11, String str, LinkedHashMap linkedHashMap, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TransformMatrixParams transformMatrixParams2 = new TransformMatrixParams();
        this.A0U = transformMatrixParams2;
        this.A05 = userSession;
        transformMatrixParams2.A00(transformMatrixParams);
        this.A0K = map;
        this.A07 = r11;
        ArrayList arrayList3 = null;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list);
        }
        this.A0D = arrayList;
        this.A06 = r10;
        this.A02 = brandedContentGatingInfo;
        this.A0A = list2;
        this.A03 = brandedContentProjectMetadata;
        this.A0Q = z;
        this.A0N = z2;
        List list11 = list3;
        if (list3 == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(list11);
        }
        this.A0C = arrayList2;
        this.A0E = new ArrayList(list4);
        this.A0F = new ArrayList(list5);
        this.A0B = list6 != null ? new ArrayList(list6) : arrayList3;
        this.A09 = new LinkedHashMap(linkedHashMap);
        this.A0I = list7;
        this.A0H = list8;
        this.A0G = list9;
        this.A0J = list10;
        this.A08 = str;
        this.A0S = i;
        this.A0T = z3;
        this.A0R = z4;
        this.A0O = false;
        this.A0P = z5;
        this.A04 = mediaGenAIDetectionMethod;
        this.A0M = AnonymousClass0eN.A01(new AnonymousClass8PX(this));
        this.A0L = AnonymousClass0eN.A01(new AnonymousClass8PY(this));
    }

    public final boolean A00() {
        C354998Oe r0 = this.A07;
        if (r0 != null) {
            return !r0.A00.isEmpty();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r1.equals(r0) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L_0x0004
            r0 = 1
            return r0
        L_0x0004:
            r2 = 0
            if (r4 == 0) goto L_0x003d
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r0 = r4.getClass()
            if (r1 != r0) goto L_0x003d
            X.8PW r4 = (X.AnonymousClass8PW) r4
            int r1 = r3.A0S
            int r0 = r4.A0S
            if (r1 != r0) goto L_0x003d
            boolean r1 = r3.A0T
            boolean r0 = r4.A0T
            if (r1 != r0) goto L_0x003d
            boolean r1 = r3.A0O
            boolean r0 = r4.A0O
            if (r1 != r0) goto L_0x003d
            boolean r1 = r3.A0Q
            boolean r0 = r4.A0Q
            if (r1 != r0) goto L_0x003d
            boolean r1 = r3.A0N
            boolean r0 = r4.A0N
            if (r1 != r0) goto L_0x003d
            java.util.Map r1 = r3.A0K
            java.util.Map r0 = r4.A0K
            if (r1 == 0) goto L_0x003e
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0041
        L_0x003d:
            return r2
        L_0x003e:
            if (r0 == 0) goto L_0x0041
            return r2
        L_0x0041:
            X.8Oe r1 = r3.A07
            X.8Oe r0 = r4.A07
            if (r1 == 0) goto L_0x004e
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0051
            return r2
        L_0x004e:
            if (r0 == 0) goto L_0x0051
            return r2
        L_0x0051:
            java.util.List r1 = r3.A0D
            java.util.List r0 = r4.A0D
            if (r1 == 0) goto L_0x005e
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0061
            return r2
        L_0x005e:
            if (r0 == 0) goto L_0x0061
            return r2
        L_0x0061:
            X.8Nz r1 = r3.A06
            X.8Nz r0 = r4.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            com.instagram.api.schemas.BrandedContentGatingInfo r1 = r3.A02
            com.instagram.api.schemas.BrandedContentGatingInfo r0 = r4.A02
            if (r1 == 0) goto L_0x0078
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007b
            return r2
        L_0x0078:
            if (r0 == 0) goto L_0x007b
            return r2
        L_0x007b:
            java.util.List r1 = r3.A0A
            java.util.List r0 = r4.A0A
            if (r1 == 0) goto L_0x0088
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008b
            return r2
        L_0x0088:
            if (r0 == 0) goto L_0x008b
            return r2
        L_0x008b:
            com.instagram.api.schemas.BrandedContentProjectMetadata r1 = r3.A03
            com.instagram.api.schemas.BrandedContentProjectMetadata r0 = r4.A03
            boolean r0 = X.2Ob.A00(r1, r0)
            if (r0 == 0) goto L_0x003d
            java.util.List r1 = r3.A0C
            java.util.List r0 = r4.A0C
            if (r1 == 0) goto L_0x00a2
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a5
            return r2
        L_0x00a2:
            if (r0 == 0) goto L_0x00a5
            return r2
        L_0x00a5:
            java.util.List r1 = r3.A0E
            java.util.List r0 = r4.A0E
            if (r1 == 0) goto L_0x00b2
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00b5
            return r2
        L_0x00b2:
            if (r0 == 0) goto L_0x00b5
            return r2
        L_0x00b5:
            java.util.List r1 = r3.A0F
            java.util.List r0 = r4.A0F
            if (r1 == 0) goto L_0x00c2
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00c5
            return r2
        L_0x00c2:
            if (r0 == 0) goto L_0x00c5
            return r2
        L_0x00c5:
            java.util.List r1 = r3.A0B
            java.util.List r0 = r4.A0B
            if (r1 == 0) goto L_0x00d2
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d5
            return r2
        L_0x00d2:
            if (r0 == 0) goto L_0x00d5
            return r2
        L_0x00d5:
            java.util.LinkedHashMap r1 = r3.A09
            java.util.LinkedHashMap r0 = r4.A09
            if (r1 == 0) goto L_0x00e2
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00e5
            return r2
        L_0x00e2:
            if (r0 == 0) goto L_0x00e5
            return r2
        L_0x00e5:
            boolean r1 = r3.A0R
            boolean r0 = r4.A0R
            if (r1 != r0) goto L_0x003d
            int r1 = r3.A01
            int r0 = r4.A01
            if (r1 != r0) goto L_0x003d
            int r1 = r3.A00
            int r0 = r4.A00
            if (r1 != r0) goto L_0x003d
            java.lang.String r1 = r3.A08
            java.lang.String r0 = r4.A08
            if (r1 == 0) goto L_0x0104
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0107
            return r2
        L_0x0104:
            if (r0 == 0) goto L_0x0107
            return r2
        L_0x0107:
            com.instagram.api.schemas.MediaGenAIDetectionMethod r1 = r3.A04
            com.instagram.api.schemas.MediaGenAIDetectionMethod r0 = r4.A04
            if (r1 == 0) goto L_0x0114
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0117
            return r2
        L_0x0114:
            if (r0 == 0) goto L_0x0117
            return r2
        L_0x0117:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = r3.A0U
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r4.A0U
            boolean r0 = X.2Ob.A00(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PW.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Map map = this.A0K;
        int i13 = 0;
        if (map != null) {
            i = map.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((i * 31) + this.A0U.hashCode()) * 31;
        C354998Oe r0 = this.A07;
        if (r0 != null) {
            i2 = r0.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (((((hashCode + i2) * 31) + this.A0S) * 31) + (this.A0T ? 1 : 0)) * 31;
        List list = this.A0D;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = (((i14 + i3) * 31) + this.A06.hashCode()) * 31;
        BrandedContentGatingInfo brandedContentGatingInfo = this.A02;
        if (brandedContentGatingInfo != null) {
            i4 = brandedContentGatingInfo.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (hashCode2 + i4) * 31;
        List list2 = this.A0A;
        if (list2 != null) {
            i5 = list2.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        BrandedContentProjectMetadata brandedContentProjectMetadata = this.A03;
        if (brandedContentProjectMetadata != null) {
            i6 = brandedContentProjectMetadata.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (((((((((i16 + i6) * 31) + this.A01) * 31) + this.A00) * 31) + (this.A0Q ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31;
        List list3 = this.A0C;
        if (list3 != null) {
            i7 = list3.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 31;
        List list4 = this.A0E;
        if (list4 != null) {
            i8 = list4.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 31;
        List list5 = this.A0F;
        if (list5 != null) {
            i9 = list5.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 31;
        List list6 = this.A0B;
        if (list6 != null) {
            i10 = list6.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 31;
        LinkedHashMap linkedHashMap = this.A09;
        if (linkedHashMap != null) {
            i11 = linkedHashMap.hashCode();
        } else {
            i11 = 0;
        }
        int i22 = (i21 + i11) * 31;
        String str = this.A08;
        if (str != null) {
            i12 = str.hashCode();
        } else {
            i12 = 0;
        }
        int i23 = (((((((i22 + i12) * 31) + (this.A0O ? 1 : 0)) * 31) + (this.A0P ? 1 : 0)) * 31) + (this.A0R ? 1 : 0)) * 31;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = this.A04;
        if (!(mediaGenAIDetectionMethod == null || mediaGenAIDetectionMethod == MediaGenAIDetectionMethod.A0B)) {
            i13 = 1;
        }
        return i23 + i13;
    }

    public AnonymousClass8PW() {
        this.A0U = new TransformMatrixParams();
    }
}
