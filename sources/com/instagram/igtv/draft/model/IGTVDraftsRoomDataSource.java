package com.instagram.igtv.draft.model;

import X.0qQ;
import X.0sn;
import X.1Hj;
import X.1VA;
import X.1VC;
import X.1WY;
import X.1wO;
import X.1wR;
import X.AnonymousClass00P;
import X.AnonymousClass0r6;
import X.AnonymousClass1VF;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C53368Gms;
import X.C60340gF;
import X.C60983Juf;
import X.C60990Jum;
import X.C60993Jup;
import X.C60994Juq;
import X.C61017JvH;
import X.C61035JvZ;
import X.C66541MVv;
import X.JTO;
import X.JTS;
import X.JXE;
import X.JXF;
import X.MB5;
import X.MB7;
import X.MCA;
import X.Y48;
import android.graphics.RectF;
import android.os.CancellationSignal;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.persistence.IGTVDatabase;
import com.instagram.igtv.persistence.IGTVDatabase_Impl;
import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class IGTVDraftsRoomDataSource implements C66541MVv {
    public final JXF A00;

    public IGTVDraftsRoomDataSource(UserSession userSession) {
        JXF jxf;
        0qQ.A0B(userSession, 1);
        JXE jxe = IGTVDatabase.A08;
        Class<IGTVDatabase> cls = IGTVDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (jxe) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    1VA A0F = JTS.A0F(userSession, jxe, cls);
                    1VC.A00(A0F, 823, 824, false);
                    A0F.A02(Arrays.copyOf(IGTVDatabase.A09, 6));
                    A0F.A05 = true;
                    A0F.A03 = true;
                    A0F.A03(new AnonymousClass1VF[]{IGTVDatabase.A05, IGTVDatabase.A06, IGTVDatabase.A07, IGTVDatabase.A00, IGTVDatabase.A01, IGTVDatabase.A02, IGTVDatabase.A03, IGTVDatabase.A04});
                    igRoomDatabase = (IgRoomDatabase) A0F.A00();
                    userSession.A04(cls, igRoomDatabase);
                }
            }
        }
        IGTVDatabase_Impl iGTVDatabase_Impl = (IGTVDatabase_Impl) ((IGTVDatabase) igRoomDatabase);
        if (iGTVDatabase_Impl.A00 != null) {
            jxf = iGTVDatabase_Impl.A00;
        } else {
            synchronized (iGTVDatabase_Impl) {
                if (iGTVDatabase_Impl.A00 == null) {
                    iGTVDatabase_Impl.A00 = new JXF(iGTVDatabase_Impl);
                }
                jxf = iGTVDatabase_Impl.A00;
            }
        }
        this.A00 = jxf;
    }

    public static final C60983Juf A00(C61035JvZ jvZ) {
        List list;
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        C61035JvZ jvZ2 = jvZ;
        int i = jvZ2.A06;
        long j = jvZ2.A0A;
        C60993Jup jup = new C60993Jup(jvZ2.A0M, jvZ2.A08, jvZ2.A09, jvZ2.A07, jvZ2.A0B);
        String str = jvZ2.A0L;
        String str2 = jvZ2.A0I;
        C53368Gms gms = new C53368Gms(jvZ2.A04, jvZ2.A05, 17);
        C60990Jum jum = new C60990Jum(0, jvZ2.A00, jvZ2.A0T);
        boolean z = jvZ2.A0P;
        C60994Juq juq = new C60994Juq(jvZ2.A0H, jvZ2.A03, jvZ2.A02, jvZ2.A01, z, jvZ2.A0Q);
        boolean z2 = jvZ2.A0W;
        RectF rectF = jvZ2.A0D;
        RectF rectF2 = jvZ2.A0E;
        boolean z3 = jvZ2.A0S;
        String str3 = jvZ2.A0J;
        boolean z4 = jvZ2.A0a;
        boolean z5 = jvZ2.A0N;
        boolean z6 = jvZ2.A0O;
        boolean z7 = jvZ2.A0R;
        boolean z8 = jvZ2.A0V;
        IGTVBrandedContentTags iGTVBrandedContentTags = jvZ2.A0F;
        if (iGTVBrandedContentTags != null) {
            list = iGTVBrandedContentTags.A01;
            if (list == null) {
                0qQ.A0F("brandedContentTags");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            list = 0sn.A00;
        }
        if (iGTVBrandedContentTags != null) {
            brandedContentProjectMetadata = iGTVBrandedContentTags.A00;
        } else {
            brandedContentProjectMetadata = null;
        }
        C61017JvH jvH = new C61017JvH((BrandedContentProjectMetadataIntf) brandedContentProjectMetadata, list, z5, z6, z7, z8, jvZ2.A0Z, jvZ2.A0U);
        String str4 = jvZ2.A0K;
        String str5 = str3;
        return new C60983Juf(rectF, rectF2, gms, jum, jvH, juq, jup, jvZ2.A0G, str, str2, str5, str4, i, j, z2, z3, z4, jvZ2.A0X);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, com.instagram.igtv.persistence.draft.IGTVBrandedContentTags] */
    public static final C61035JvZ A01(C60983Juf juf, int i) {
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        C60983Juf juf2 = juf;
        C60993Jup jup = juf2.A08;
        String str = jup.A04;
        int i2 = jup.A01;
        int i3 = jup.A02;
        int i4 = jup.A00;
        long j = jup.A03;
        String str2 = juf2.A0D;
        String str3 = juf2.A0A;
        String str4 = juf2.A0C;
        boolean z = juf2.A0G;
        C53368Gms gms = juf2.A04;
        int i5 = gms.A00;
        int i6 = gms.A01;
        C60990Jum jum = juf2.A05;
        float f = jum.A00;
        boolean z2 = jum.A02;
        C60994Juq juq = juf2.A07;
        boolean z3 = juq.A04;
        String str5 = juq.A03;
        int i7 = juq.A02;
        int i8 = juq.A01;
        int i9 = juq.A00;
        boolean z4 = juq.A05;
        boolean z5 = juf2.A0F;
        RectF rectF = juf2.A02;
        RectF rectF2 = juf2.A03;
        boolean z6 = juf2.A0E;
        String str6 = juf2.A0B;
        boolean z7 = juf2.A0H;
        C61017JvH jvH = juf2.A06;
        boolean z8 = jvH.A03;
        boolean z9 = jvH.A04;
        boolean z10 = jvH.A06;
        boolean z11 = jvH.A05;
        boolean z12 = jvH.A07;
        List list = (List) jvH.A02;
        BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = (BrandedContentProjectMetadataIntf) jvH.A01;
        if (brandedContentProjectMetadataIntf != null) {
            brandedContentProjectMetadata = brandedContentProjectMetadataIntf.F0y();
        } else {
            brandedContentProjectMetadata = null;
        }
        0qQ.A0B(list, 1);
        ? obj = new Object();
        obj.A01 = list;
        obj.A00 = brandedContentProjectMetadata;
        boolean z13 = jvH.A08;
        IGTVShoppingMetadata iGTVShoppingMetadata = juf2.A09;
        int i10 = i6;
        int i11 = i7;
        int i12 = i8;
        int i13 = i9;
        return new C61035JvZ(rectF, rectF2, obj, iGTVShoppingMetadata, str, str2, str3, str4, str5, str6, f, i, i2, i3, i4, i5, i10, i11, i12, i13, j, juf2.A01, System.currentTimeMillis(), false, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13);
    }

    public final Object A8E(C60983Juf juf, AnonymousClass4D7 r6) {
        JXF jxf = this.A00;
        Object A01 = MB7.A01(jxf.A02, jxf, A01(juf, 0), r6, 20);
        if (A01 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A01;
    }

    public final Object AOT(int i, AnonymousClass4D7 r6) {
        JXF jxf = this.A00;
        Object A01 = 1wR.A01(jxf.A02, new MB5(jxf, i, 2), r6);
        if (A01 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A01;
    }

    public final Object AOU(List list, AnonymousClass4D7 r5) {
        JXF jxf = this.A00;
        Object A01 = MB7.A01(jxf.A02, jxf, list, r5, 19);
        if (A01 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A01;
    }

    public final AnonymousClass0r6 Aaz() {
        JXF jxf = this.A00;
        return MCA.A00(this, 1wR.A02(jxf.A02, new Y48(1, JTO.A0M("SELECT * FROM drafts WHERE is_uploading = 0 ORDER BY last_modified_timestamp DESC", 0), jxf), new String[]{"drafts"}, false), 52);
    }

    public final Object Aru(int i, AnonymousClass4D7 r8) {
        JXF jxf = this.A00;
        1WY A0M = JTO.A0M("SELECT cover_image_file_path FROM drafts WHERE id = ?", 1);
        A0M.ADa(1, (long) i);
        return 1wR.A00(new CancellationSignal(), jxf.A02, new MB7(17, jxf, A0M), r8, false);
    }

    public final Object Arv(List list, AnonymousClass4D7 r8) {
        JXF jxf = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SELECT cover_image_file_path FROM drafts WHERE id in (");
        int size = list.size();
        1wO.A00(A1A, size);
        1WY A0M = JTO.A0M(AnonymousClass7TF.A0l(")", A1A), size);
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            A0M.ADa(i, (long) AnonymousClass7TG.A0F(it));
            i++;
        }
        return 1wR.A00(new CancellationSignal(), jxf.A02, new MB7(18, jxf, A0M), r8, false);
    }

    public final AnonymousClass0r6 Ayp(int i) {
        JXF jxf = this.A00;
        1WY A0M = JTO.A0M("SELECT * FROM drafts WHERE id = ?", 1);
        A0M.ADa(1, (long) i);
        return MCA.A00(this, 1wR.A02(jxf.A02, new Y48(3, A0M, jxf), new String[]{"drafts"}, false), 53);
    }

    public final Object BXM(AnonymousClass4D7 r8) {
        JXF jxf = this.A00;
        return 1wR.A00(new CancellationSignal(), jxf.A02, new MB7(16, jxf, JTO.A0M("SELECT COUNT(*) FROM drafts WHERE is_uploading = 1", 0)), r8, false);
    }

    public final AnonymousClass0r6 CCB(long j) {
        JXF jxf = this.A00;
        1WY A0M = JTO.A0M("SELECT * FROM drafts WHERE is_uploading = 1 AND last_modified_timestamp < ?", 1);
        A0M.ADa(1, j);
        return MCA.A00(this, 1wR.A02(jxf.A02, new Y48(2, A0M, jxf), new String[]{"drafts"}, false), 54);
    }

    public final Object FKC(C60983Juf juf, AnonymousClass4D7 r6) {
        JXF jxf = this.A00;
        Object A01 = MB7.A01(jxf.A02, jxf, A01(juf, juf.A00), r6, 21);
        if (A01 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A01;
    }

    public final Object FKe(AnonymousClass4D7 r5, int i, boolean z) {
        JXF jxf = this.A00;
        Object A01 = 1wR.A01(jxf.A02, new MB5(jxf, i, 3), r5);
        if (A01 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A01;
    }
}
