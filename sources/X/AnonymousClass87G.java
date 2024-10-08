package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductItemWithAR;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.87G  reason: invalid class name */
public final class AnonymousClass87G implements AnonymousClass518 {
    public static final AnonymousClass87G A0T = new AnonymousClass87G(new AnonymousClass8YE((Drawable) null, AnonymousClass87I.EMPTY, (String) null));
    public static final AnonymousClass87G A0U = new AnonymousClass87G(new AnonymousClass8YE((Drawable) null, AnonymousClass87I.LOADING_AR_EFFECT, (String) null));
    public int A00;
    public Drawable A01;
    public C42040BEs A02;
    public CameraAREffect A03;
    public AnonymousClass87I A04;
    public ImageUrl A05;
    public ProductItemWithAR A06;
    public UY8 A07;
    public AnonymousClass8YF A08;
    public C45241Csw A09;
    public C45242Csx A0A;
    public C39688A5e A0B;
    public C42141BIw A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public List A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public int A0P;
    public String A0Q;
    public String A0R;
    public String A0S;

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass87G r5 = (AnonymousClass87G) obj;
            AnonymousClass87I r1 = this.A04;
            if (r1 == AnonymousClass87I.FILTER) {
                if (r1 != r5.A04) {
                    return false;
                }
                obj2 = this.A0E;
                obj3 = r5.A0E;
            } else if (r1 == AnonymousClass87I.EMPTY_AVATAR_BACKGROUND || r1 == AnonymousClass87I.AVATAR_BACKGROUND) {
                if (r1 != r5.A04) {
                    return false;
                }
                obj2 = this.A0Q;
                obj3 = r5.A0Q;
            } else if (r1 != r5.A04) {
                return false;
            } else {
                obj2 = this.A03;
                obj3 = r5.A03;
            }
            return 2Ob.A00(obj2, obj3);
        }
    }

    public final CameraAREffect A00() {
        AnonymousClass87I r1 = this.A04;
        if ((r1 == AnonymousClass87I.AR_EFFECT || r1 == AnonymousClass87I.AVATAR_PRESET) && this.A03 == null) {
            0wb.A03("DialElement", "DialElement.getCameraArEffect() found null");
        }
        return this.A03;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.WaP] */
    public final List A02() {
        List<UNR> list = this.A0J;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (UNR unr : list) {
            0qQ.A0B(unr, 0);
            ? obj = new Object();
            obj.A00 = unr;
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final boolean A03() {
        CameraAREffect cameraAREffect = this.A03;
        if (cameraAREffect == null || !"INSTAGRAM_CAMERA".equals(cameraAREffect.A0E)) {
            return false;
        }
        return true;
    }

    public final boolean A04() {
        AnonymousClass87I r2 = this.A04;
        if (r2 == null) {
            r2 = AnonymousClass87I.EMPTY;
        }
        if (r2 == AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT || r2 == AnonymousClass87I.QUICK_SNAP_CLOSE_FRIENDS_AUDIENCE || r2 == AnonymousClass87I.QUICK_SNAP_AUDIENCE_MEMBER || r2 == AnonymousClass87I.QUICK_SNAP_AUDIENCE_LIST) {
            return true;
        }
        return false;
    }

    public final String getId() {
        String str;
        AnonymousClass87I r1 = this.A04;
        if (r1 == null) {
            r1 = AnonymousClass87I.EMPTY;
        }
        if (r1 == AnonymousClass87I.AR_EFFECT || r1 == AnonymousClass87I.AVATAR_EFFECT || r1 == AnonymousClass87I.AVATAR_PRESET) {
            CameraAREffect A002 = A00();
            if (A002 != null) {
                return A002.A0K;
            }
            0wb.A03("DialElement", "DialElement.getId() found null cameraArEffect");
        } else {
            if (r1 == AnonymousClass87I.CLIPS_TRANSITION || r1 == AnonymousClass87I.FILTER) {
                str = this.A0E;
            } else if (r1 == AnonymousClass87I.EMPTY_AVATAR_BACKGROUND || r1 == AnonymousClass87I.AVATAR_BACKGROUND) {
                str = this.A0Q;
            } else if (r1 == AnonymousClass87I.QUICK_SNAP_AUDIENCE_MEMBER) {
                str = this.A0S;
            } else if (r1 == AnonymousClass87I.QUICK_SNAP_AUDIENCE_LIST) {
                str = this.A0R;
            }
            str.getClass();
            return str;
        }
        return this.A04.A00;
    }

    public final int hashCode() {
        Object[] objArr;
        Object obj;
        AnonymousClass87I r4 = this.A04;
        if (r4 == AnonymousClass87I.FILTER) {
            objArr = new Object[2];
            objArr[0] = r4;
            obj = this.A0E;
        } else if (r4 == AnonymousClass87I.EMPTY_AVATAR_BACKGROUND || r4 == AnonymousClass87I.AVATAR_BACKGROUND) {
            objArr = new Object[2];
            objArr[0] = r4;
            obj = this.A0Q;
        } else {
            objArr = new Object[2];
            objArr[0] = r4;
            obj = this.A03;
        }
        objArr[1] = obj;
        return Arrays.hashCode(objArr);
    }

    public AnonymousClass87G(AnonymousClass8YE r2) {
        this.A04 = r2.A0E;
        this.A0G = r2.A0I;
        this.A05 = r2.A02;
        this.A01 = r2.A0C;
        this.A03 = r2.A0D;
        this.A06 = r2.A0F;
        this.A08 = r2.A0G;
        this.A0H = null;
        this.A0E = r2.A0H;
        this.A00 = r2.A00;
        this.A0Q = r2.A03;
        this.A0D = r2.A04;
        this.A0M = r2.A09;
        this.A0N = r2.A0A;
        this.A0S = r2.A07;
        this.A0R = r2.A06;
        this.A0K = r2.A08;
        this.A0F = r2.A05;
        this.A0P = r2.A01;
        this.A0O = r2.A0B;
    }

    public final String A01(Context context) {
        int i;
        CameraAREffect A002 = A00();
        AnonymousClass87I r1 = this.A04;
        if (r1 == null) {
            r1 = AnonymousClass87I.EMPTY;
        }
        if (r1 == AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT) {
            i = 2131971113;
        } else if (r1 == AnonymousClass87I.QUICK_SNAP_CLOSE_FRIENDS_AUDIENCE || (r1 == AnonymousClass87I.QUICK_SNAP_AUDIENCE_LIST && this.A0O)) {
            int i2 = this.A0P;
            if (i2 > 0) {
                return context.getResources().getQuantityString(R.plurals.quick_snap_audience_list_dial_element_subtitle, i2, new Object[]{Integer.valueOf(i2)});
            }
            i = 2131971162;
        } else if (A002 == null) {
            return null;
        } else {
            return context.getString(2131953212, new Object[]{A002.A0C});
        }
        return context.getString(i);
    }

    public AnonymousClass87G() {
    }
}
