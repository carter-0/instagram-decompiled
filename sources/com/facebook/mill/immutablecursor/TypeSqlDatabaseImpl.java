package com.facebook.mill.immutablecursor;

import X.03t;
import X.0qQ;
import X.2HY;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DbS;
import X.JTQ;
import X.SBI;
import X.SBJ;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mill.runtime.TypeSqlQuery;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import java.util.Arrays;
import java.util.List;

public final class TypeSqlDatabaseImpl {
    public final SqliteHolder sqliteHolder;

    public TypeSqlDatabaseImpl(SqliteHolder sqliteHolder2) {
        0qQ.A0B(sqliteHolder2, 1);
        this.sqliteHolder = sqliteHolder2;
        SBJ.A00();
        SBI.A00();
    }

    private final native boolean execSQL(SqliteHolder sqliteHolder2, String str, List list);

    private final native TypeSqlQuery rawQuery(SqliteHolder sqliteHolder2, String str, List list);

    public SqliteHolder getSqliteHolder() {
        return this.sqliteHolder;
    }

    public void exec(String str, Object... objArr) {
        List asList;
        AnonymousClass7TG.A1N(str, objArr);
        SqliteHolder sqliteHolder2 = this.sqliteHolder;
        if (objArr.length == 0) {
            asList = null;
        } else {
            asList = Arrays.asList(objArr);
            0qQ.A07(asList);
        }
        execSQL(sqliteHolder2, str, asList);
    }

    public TypeSqlQuery prepare(byte[] bArr, String str, Object... objArr) {
        AnonymousClass7TG.A1T(bArr, str, objArr);
        TypeSqlQuery rawQuery = rawQuery(this.sqliteHolder, str, 03t.A0J(objArr));
        rawQuery.setColumnTypes(bArr);
        return rawQuery;
    }

    public void exec(Object... objArr) {
        Object[] copyOf;
        0qQ.A0B(objArr, 0);
        int length = objArr.length;
        boolean z = !AnonymousClass7TF.A1Q(length);
        Integer valueOf = Integer.valueOf(length);
        if (z) {
            String str = objArr[0];
            DbS.A1Y(str);
            String str2 = str;
            if (length == 1) {
                copyOf = new Object[0];
            } else {
                Object[] array = 03t.A0D(new 2HY(1, length - 1), objArr).toArray(new Object[0]);
                copyOf = Arrays.copyOf(array, array.length);
            }
            exec(str2, copyOf);
            return;
        }
        throw AnonymousClass7TE.A0w(StringFormatUtil.formatStrLocaleSafe("args must contains at least sql statement argument size = %d", valueOf));
    }

    public TypeSqlQuery prepare(Object... objArr) {
        Object[] copyOf;
        0qQ.A0B(objArr, 0);
        int length = objArr.length;
        boolean A1P = JTQ.A1P(length, 2);
        Integer valueOf = Integer.valueOf(length);
        if (A1P) {
            byte[] bArr = objArr[0];
            0qQ.A0C(bArr, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr2 = bArr;
            String str = objArr[1];
            DbS.A1Y(str);
            String str2 = str;
            if (length == 2) {
                copyOf = new Object[0];
            } else {
                Object[] array = 03t.A0D(new 2HY(2, length - 1), objArr).toArray(new Object[0]);
                copyOf = Arrays.copyOf(array, array.length);
            }
            return prepare(bArr2, str2, copyOf);
        }
        throw AnonymousClass7TE.A0w(StringFormatUtil.formatStrLocaleSafe("args must contains at least sql statement and columnTypes arguments size = %d", valueOf));
    }
}
