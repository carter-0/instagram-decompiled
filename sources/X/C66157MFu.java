package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.os.CancellationSignal;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.appreciation.analytics.LoggingData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.MFu  reason: case insensitive filesystem */
public final class C66157MFu extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06 = 0;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final String A0A;
    public final String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66157MFu(C59774JXr jXr, AnonymousClass0iw r3, 1Xj r4, Boolean bool, Boolean bool2, String str, String str2, AnonymousClass4D7 r9) {
        super(2, r9);
        this.A04 = jXr;
        this.A07 = r3;
        this.A0B = str;
        this.A0A = str2;
        this.A01 = r4;
        this.A09 = bool;
        this.A08 = bool2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.MFu, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.MFu, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        AnonymousClass4D7 r10 = r13;
        if (this.A06 != 0) {
            String str = this.A0B;
            boolean z = this.A05;
            AnonymousClass4D7 r6 = r13;
            ? mFu = new C66157MFu((C61805KMt) this.A09, this.A0A, str, r6, (C62320sa) this.A07, (0sL) this.A08, z);
            mFu.A01 = obj;
            return mFu;
        }
        ? mFu2 = new C66157MFu((C59774JXr) this.A04, (AnonymousClass0iw) this.A07, (1Xj) this.A01, (Boolean) this.A09, (Boolean) this.A08, this.A0B, this.A0A, r10);
        mFu2.A02 = obj;
        return mFu2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MFu, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        02o r6;
        boolean z;
        LTO lto;
        Object A0f;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        String str;
        Object obj2;
        C61805KMt kMt;
        String str2;
        Cursor query;
        String str3;
        0sn A1C;
        Object obj3 = obj;
        if (this.A06 != 0) {
            Object obj4 = 1Hj.A02;
            int i = this.A00;
            if (i == 0) {
                0eS.A00(obj3);
                try {
                    kMt = (C61805KMt) this.A09;
                    AnonymousClass2NQ r7 = kMt.A07;
                    str2 = this.A0A;
                    1WY A0M = JTO.A0M("SELECT * FROM audio_amplitudes WHERE audio_asset_id = ?", 1);
                    A0M.ADh(1, str2);
                    C251983oI r10 = r7.A00;
                    r10.assertNotSuspendingTransaction();
                    r10.beginTransaction();
                    L6P l6p = null;
                    try {
                        query = r10.query((AnonymousClass1WA) A0M, (CancellationSignal) null);
                        int A012 = 1Wd.A01(query, "audio_asset_id");
                        int A013 = 1Wd.A01(query, "audio_amplitudes_list");
                        int A014 = 1Wd.A01(query, "last_used_time_ms");
                        if (query.moveToFirst()) {
                            String string = query.getString(A012);
                            String string2 = query.getString(A013);
                            0qQ.A0B(string2, 0);
                            if (string2.equals("")) {
                                A1C = 0sn.A00;
                            } else {
                                List A0R = 00l.A0R(string2, new String[]{"␞"}, 0);
                                A1C = AnonymousClass7TE.A1C();
                                Iterator it = A0R.iterator();
                                while (it.hasNext()) {
                                    try {
                                        Float A0q = 012.A0q(AnonymousClass7TE.A18(it));
                                        if (A0q != null) {
                                            A1C.add(A0q);
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            l6p = new L6P(query.getLong(A014), string, A1C);
                        }
                        r10.setTransactionSuccessful();
                        query.close();
                        A0M.A00();
                        r10.endTransaction();
                        if (l6p != null) {
                            Object obj5 = this.A08;
                            String str4 = this.A0B;
                            ClipsCreationViewModel clipsCreationViewModel = kMt.A04;
                            List list = l6p.A02;
                            0qQ.A0B(str2, 0);
                            clipsCreationViewModel.A0K.A04.A05(str2, list);
                            1Eo.A05(AnonymousClass12T.A00.A04, new C59842JaI(obj5, l6p, str4, (AnonymousClass4D7) null, 8), C318116oQ.A00(kMt));
                            r7.A00(new L6P(System.currentTimeMillis(), str2, list));
                        } else {
                            boolean z2 = this.A05;
                            Object obj6 = this.A07;
                            obj2 = this.A08;
                            str = this.A0B;
                            1Eo.A05(AnonymousClass12T.A00.A04, new MG0(obj6, (AnonymousClass4D7) null, 27), C318116oQ.A00(kMt));
                            UserSession userSession = kMt.A00;
                            boolean A1P = AnonymousClass7TF.A1P(z2 ? 1 : 0);
                            0qQ.A0B(str2, 1);
                            Locale locale = Locale.US;
                            if (A1P) {
                                str3 = "music/track/%s/oa_amplitudes/";
                            } else {
                                str3 = "music/track/%s/amplitudes/";
                            }
                            String format = String.format(locale, str3, Arrays.copyOf(new Object[]{str2}, 1));
                            0qQ.A07(format);
                            1NY A0b = AnonymousClass7TG.A0b(userSession);
                            A0b.A0E = format;
                            A0b.A9m("product", C14245TsS.A00(MusicProduct.CLIPS_CAMERA_FORMAT_V2));
                            A0b.A0O((15p) null, CFS.class, C45696D1v.class, false);
                            A0b.A03();
                            A0b.A0A = format;
                            1OC A0M2 = A0b.A0M();
                            this.A01 = kMt;
                            this.A02 = str2;
                            this.A03 = obj2;
                            this.A04 = str;
                            this.A00 = 1;
                            obj3 = A0M2.A00(352652612, this);
                            if (obj3 == obj4) {
                                return obj4;
                            }
                        }
                    } catch (Throwable th) {
                        r10.endTransaction();
                        throw th;
                    }
                } catch (SQLiteBlobTooBigException unused2) {
                    1Eo.A05(AnonymousClass12T.A00.A04, new C66187MGy(this.A08, this.A0B, (AnonymousClass4D7) null, 17), C318116oQ.A00((2YL) this.A09));
                }
            } else if (i == 1) {
                str = (String) this.A04;
                obj2 = this.A03;
                str2 = (String) this.A02;
                kMt = (C61805KMt) this.A01;
                0eS.A00(obj3);
            } else {
                throw AnonymousClass7TE.A0x();
            }
            Object obj7 = (C239803Ii) obj3;
            if (obj7 instanceof C239793Ih) {
                List list2 = ((CFS) ((C239793Ih) obj7).A00).A00;
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                int size = list2.size();
                float f = 1.0f;
                float f2 = 0.0f;
                for (int i2 = 0; i2 < size; i2++) {
                    if (AnonymousClass7TG.A00(list2, i2) > f2) {
                        f2 = AnonymousClass7TG.A00(list2, i2);
                    }
                    if (AnonymousClass7TG.A00(list2, i2) < f) {
                        f = AnonymousClass7TG.A00(list2, i2);
                    }
                }
                float f3 = f2 - f;
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    JTP.A1V(A1C2, ((float) AnonymousClass7TE.A05((AnonymousClass7TG.A00(list2, i3) - f) / f3, 100.0f)) / 100.0f);
                }
                1Eo.A05(AnonymousClass12T.A00.A04, new C59842JaI(obj2, A1C2, str, (AnonymousClass4D7) null, 9), C318116oQ.A00(kMt));
                kMt.A07.A00(new L6P(System.currentTimeMillis(), str2, A1C2));
                obj7 = C51967G9n.A0d();
            } else if (!(obj7 instanceof C297815sO)) {
                throw AnonymousClass7TE.A1K();
            }
            if (!(obj7 instanceof C239793Ih)) {
                if (obj7 instanceof C297815sO) {
                    0kD.A07("StackedTimelineAudioTrackViewModel", "fetchAmplitudesForAudioOverlay failed", (Throwable) null);
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
        } else {
            Object obj8 = 1Hj.A02;
            int i4 = this.A00;
            if (i4 == 0) {
                0eS.A00(obj3);
                r6 = (02o) this.A02;
                C59774JXr jXr = (C59774JXr) this.A04;
                UserSession userSession2 = jXr.A01;
                AnonymousClass0iw r9 = (AnonymousClass0iw) this.A07;
                String str5 = this.A0B;
                lto = new LTO(new LoggingData(str5, this.A0A), r9, AnonymousClass0kN.A01(r9, userSession2));
                z = jXr.A02.A05(UserMonetizationProductType.CONTENT_APPRECIATION);
                this.A02 = r6;
                this.A03 = lto;
                this.A05 = z;
                this.A00 = 1;
                obj3 = jXr.A00.A00((1Xj) this.A01, (Boolean) this.A09, (Boolean) this.A08, str5, this);
                if (obj3 == obj8) {
                    return obj8;
                }
            } else if (i4 != 1) {
                0eS.A00(obj3);
            } else {
                z = this.A05;
                lto = (LTO) this.A03;
                r6 = JTO.A1H(this.A02, obj3);
            }
            C239803Ii r92 = (C239803Ii) obj3;
            Boolean bool = (Boolean) this.A09;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                String A2n = ((1Xj) this.A01).A2n();
                if (A2n != null) {
                    if (booleanValue) {
                        num6 = AnonymousClass05K.A15;
                    } else {
                        num6 = AnonymousClass05K.A1F;
                    }
                    LTO.A06(lto, num6, A2n, z);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            Boolean bool2 = (Boolean) this.A08;
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                String A2n2 = ((1Xj) this.A01).A2n();
                if (A2n2 != null) {
                    if (booleanValue2) {
                        num5 = AnonymousClass05K.A0A;
                    } else {
                        num5 = AnonymousClass05K.A0B;
                    }
                    LTO.A06(lto, num5, A2n2, z);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            if (r92 instanceof C239793Ih) {
                if (bool != null) {
                    boolean booleanValue3 = bool.booleanValue();
                    String A2n3 = ((1Xj) this.A01).A2n();
                    if (A2n3 != null) {
                        if (booleanValue3) {
                            num4 = AnonymousClass05K.A15;
                        } else {
                            num4 = AnonymousClass05K.A1F;
                        }
                        LTO.A07(lto, num4, A2n3, z);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                if (bool2 != null) {
                    boolean booleanValue4 = bool2.booleanValue();
                    String A2n4 = ((1Xj) this.A01).A2n();
                    if (A2n4 != null) {
                        if (booleanValue4) {
                            num3 = AnonymousClass05K.A0A;
                        } else {
                            num3 = AnonymousClass05K.A0B;
                        }
                        LTO.A07(lto, num3, A2n4, z);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                A0f = C41845B3m.A0d(((C239793Ih) r92).A00);
                this.A02 = null;
                this.A03 = null;
                this.A00 = 2;
            } else if (r92 instanceof C297815sO) {
                if (bool != null) {
                    boolean booleanValue5 = bool.booleanValue();
                    String A2n5 = ((1Xj) this.A01).A2n();
                    if (A2n5 != null) {
                        if (booleanValue5) {
                            num2 = AnonymousClass05K.A15;
                        } else {
                            num2 = AnonymousClass05K.A1F;
                        }
                        LTO.A05(lto, num2, A2n5, z);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                if (bool2 != null) {
                    boolean booleanValue6 = bool2.booleanValue();
                    String A2n6 = ((1Xj) this.A01).A2n();
                    if (A2n6 != null) {
                        if (booleanValue6) {
                            num = AnonymousClass05K.A0A;
                        } else {
                            num = AnonymousClass05K.A0B;
                        }
                        LTO.A05(lto, num, A2n6, z);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                A0f = DbU.A0f();
                this.A02 = null;
                this.A03 = null;
                this.A00 = 3;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            if (r6.emit(A0f, this) == obj8) {
                return obj8;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66157MFu) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66157MFu(C61805KMt kMt, String str, String str2, AnonymousClass4D7 r5, C62320sa r6, 0sL r7, boolean z) {
        super(2, r5);
        this.A09 = kMt;
        this.A0A = str;
        this.A08 = r7;
        this.A0B = str2;
        this.A05 = z;
        this.A07 = r6;
    }
}
