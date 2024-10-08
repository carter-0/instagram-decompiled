package X;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* renamed from: X.XIh  reason: case insensitive filesystem */
public final class C21187XIh extends C22176Xwi {
    public final /* bridge */ /* synthetic */ YAf ENL(Boolean bool, int i) {
        super.ENL(bool, 2);
        return this;
    }

    public final long ABj() {
        SQLiteStatement sQLiteStatement;
        String str;
        SQLiteDatabase AWy = this.A03.AWy();
        XnD xnD = this.A01;
        String str2 = this.A04;
        synchronized (xnD) {
            C21425Xaa A00 = XnD.A00(AWy, xnD);
            sQLiteStatement = A00.A02;
            if (sQLiteStatement == null) {
                if (str2 == null) {
                    String str3 = xnD.A00;
                    String[] strArr = xnD.A02;
                    String str4 = xnD.A01;
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append(C273654mx.A00(516));
                    A1A.append(str3);
                    A1A.append(" SET ");
                    for (int i = 0; i < strArr.length; i++) {
                        if (i > 0) {
                            str = ",";
                        } else {
                            str = "";
                        }
                        A1A.append(str);
                        A1A.append(strArr[i]);
                        A1A.append("=?");
                    }
                    A1A.append(AnonymousClass000.A00(1980));
                    str2 = AnonymousClass7TF.A0l(str4, A1A);
                }
                sQLiteStatement = AWy.compileStatement(str2);
                A00.A02 = sQLiteStatement;
            }
        }
        Object[] objArr = this.A06;
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            DatabaseUtils.bindObjectToProgram(sQLiteStatement, i3, objArr[i2]);
            i2 = i3;
        }
        try {
            AnonymousClass0fa.A00(-1224059165);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            AnonymousClass0fa.A00(1913163113);
            long j = (long) executeUpdateDelete;
            XZ0 xz0 = this.A02;
            if (xz0 != null) {
                xz0.A00.A06.A00++;
            }
            return j;
        } finally {
            sQLiteStatement.clearBindings();
        }
    }

    public final /* bridge */ /* synthetic */ YAf A00(int i) {
        super.A00(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ YAf ENJ(Long l, int i) {
        super.ENJ(l, i);
        return this;
    }

    public final /* bridge */ /* synthetic */ YAf ENK(String str, int i) {
        super.ENK(str, i);
        return this;
    }
}
