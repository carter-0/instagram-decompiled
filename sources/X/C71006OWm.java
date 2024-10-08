package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.OWm  reason: case insensitive filesystem */
public abstract class C71006OWm {
    public final 01r A00;
    public final 01r A01;
    public final 01r A02;

    public final N00 A03() {
        N00 n00 = (N00) this;
        Parcel parcel = n00.A05;
        int dataPosition = parcel.dataPosition();
        int i = n00.A02;
        if (i == n00.A04) {
            i = n00.A03;
        }
        return new N00(parcel, n00.A01, n00.A02, n00.A00, 002.A0R(n00.A07, "  "), dataPosition, i);
    }

    public final C345717ty A04() {
        String readString = ((N00) this).A05.readString();
        if (readString == null) {
            return null;
        }
        N00 A03 = A03();
        Class<C71006OWm> cls = C71006OWm.class;
        try {
            01r r3 = this.A01;
            Method method = (Method) r3.get(readString);
            if (method == null) {
                method = Class.forName(readString, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
                r3.put(readString, method);
            }
            return (C345717ty) method.invoke((Object) null, new Object[]{A03});
        } catch (IllegalAccessException e) {
            throw C41845B3m.A0j(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException) && !(cause instanceof Error)) {
                cause = C41845B3m.A0j(e2);
            }
            throw cause;
        } catch (NoSuchMethodException e3) {
            throw C41845B3m.A0j(e3);
        } catch (ClassNotFoundException e4) {
            throw C41845B3m.A0j(e4);
        }
    }

    public final void A05(int i) {
        N00 n00 = (N00) this;
        int i2 = n00.A00;
        if (i2 >= 0) {
            int i3 = n00.A06.get(i2);
            Parcel parcel = n00.A05;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        n00.A00 = i;
        SparseIntArray sparseIntArray = n00.A06;
        Parcel parcel2 = n00.A05;
        sparseIntArray.put(i, parcel2.dataPosition());
        parcel2.writeInt(0);
        parcel2.writeInt(i);
    }

    public final boolean A09(int i) {
        N00 n00 = (N00) this;
        while (true) {
            int i2 = n00.A02;
            int i3 = n00.A03;
            int i4 = n00.A01;
            if (i2 < i3) {
                if (i4 != i) {
                    if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                        break;
                    }
                    Parcel parcel = n00.A05;
                    parcel.setDataPosition(i2);
                    int readInt = parcel.readInt();
                    n00.A01 = parcel.readInt();
                    n00.A02 += readInt;
                } else {
                    return true;
                }
            } else if (i4 == i) {
                return true;
            }
        }
        return false;
    }

    private Class A00(Class cls) {
        01r r4 = this.A00;
        String name = cls.getName();
        Class cls2 = (Class) r4.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        r4.put(name, cls3);
        return cls3;
    }

    public final void A08(C345717ty r8) {
        if (r8 == null) {
            ((N00) this).A05.writeString((String) null);
            return;
        }
        try {
            Class<?> cls = r8.getClass();
            ((N00) this).A05.writeString(A00(cls).getName());
            N00 A03 = A03();
            try {
                01r r4 = this.A02;
                String name = cls.getName();
                Method method = (Method) r4.get(name);
                if (method == null) {
                    method = A00(cls).getDeclaredMethod("write", new Class[]{cls, C71006OWm.class});
                    r4.put(name, method);
                }
                method.invoke((Object) null, new Object[]{r8, A03});
                int i = A03.A00;
                if (i >= 0) {
                    int i2 = A03.A06.get(i);
                    Parcel parcel = A03.A05;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e) {
                throw C41845B3m.A0j(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof RuntimeException) && !(cause instanceof Error)) {
                    cause = C41845B3m.A0j(e2);
                }
                throw cause;
            } catch (NoSuchMethodException e3) {
                throw C41845B3m.A0j(e3);
            } catch (ClassNotFoundException e4) {
                throw C41845B3m.A0j(e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(002.A0R(C51968G9o.A16(r8), " does not have a Parcelizer"), e5);
        }
    }

    public C71006OWm(01r r1, 01r r2, 01r r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public final int A01(int i, int i2) {
        if (A09(i2)) {
            return ((N00) this).A05.readInt();
        }
        return i;
    }

    public final Parcelable A02(Parcelable parcelable, int i) {
        if (!A09(i)) {
            return parcelable;
        }
        N00 n00 = (N00) this;
        return C41847B3o.A03(n00.A05, n00.getClass());
    }

    public final void A06(int i, int i2) {
        A05(i2);
        ((N00) this).A05.writeInt(i);
    }

    public final void A07(Parcelable parcelable, int i) {
        A05(i);
        ((N00) this).A05.writeParcelable(parcelable, 0);
    }
}
