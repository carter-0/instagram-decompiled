package com.instagram.debug.devoptions.sandboxselector;

import X.1Vf;
import X.1Vg;
import X.1WY;
import X.1Wa;
import X.1Wd;
import X.1wR;
import X.1wT;
import X.AnonymousClass0r6;
import X.AnonymousClass1WV;
import X.AnonymousClass1t4;
import X.AnonymousClass4D7;
import X.AnonymousClass7TF;
import X.C251983oI;
import X.C60340gF;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;

public final class DevServerDao_Impl extends DevServerDao {
    public final C251983oI __db;
    public final 1Vf __insertionAdapterOfDevServerEntity;
    public final 1Vg __preparedStmtOfDeleteAll;

    public Object deleteAll(AnonymousClass4D7 r3) {
        return 1wR.A01(this.__db, new Callable() {
            public C60340gF call() {
                AnonymousClass1WV acquire = DevServerDao_Impl.this.__preparedStmtOfDeleteAll.acquire();
                try {
                    DevServerDao_Impl.this.__db.beginTransaction();
                    acquire.ATQ();
                    DevServerDao_Impl.this.__db.setTransactionSuccessful();
                    C60340gF r1 = C60340gF.A00;
                    DevServerDao_Impl.this.__db.endTransaction();
                    DevServerDao_Impl.this.__preparedStmtOfDeleteAll.release(acquire);
                    return r1;
                } catch (Throwable th) {
                    DevServerDao_Impl.this.__preparedStmtOfDeleteAll.release(acquire);
                    throw th;
                }
            }
        }, r3);
    }

    public AnonymousClass0r6 getAll(long j) {
        TreeMap treeMap = 1WY.A08;
        final 1WY A00 = 1Wa.A00("SELECT * FROM internal_dev_servers WHERE cache_timestamp > ?", 1);
        A00.ADa(1, j);
        return 1wR.A02(this.__db, new Callable() {
            public List call() {
                Cursor A00 = 1wT.A00(DevServerDao_Impl.this.__db, A00, false);
                try {
                    int A01 = 1Wd.A01(A00, "url");
                    int A012 = 1Wd.A01(A00, DevServerEntity.COLUMN_HOST_TYPE);
                    int A013 = 1Wd.A01(A00, DevServerEntity.COLUMN_DESCRIPTION);
                    int A014 = 1Wd.A01(A00, DevServerEntity.COLUMN_SUPPORTS_VPNLESS);
                    int A015 = 1Wd.A01(A00, DevServerEntity.COLUMN_CACHE_TIMESTAMP);
                    ArrayList A0o = AnonymousClass7TF.A0o(A00);
                    while (A00.moveToNext()) {
                        A0o.add(new DevServerEntity(A00.getString(A01), A00.getString(A012), A00.getString(A013), AnonymousClass7TF.A1P(A00.getInt(A014)), A00.getLong(A015)));
                    }
                    return A0o;
                } finally {
                    A00.close();
                }
            }

            public void finalize() {
                A00.A00();
            }
        }, new String[]{DevServerEntity.TABLE_NAME}, false);
    }

    public Object insertAll(final List list, AnonymousClass4D7 r4) {
        return 1wR.A01(this.__db, new Callable() {
            public C60340gF call() {
                DevServerDao_Impl.this.__db.beginTransaction();
                try {
                    DevServerDao_Impl.this.__insertionAdapterOfDevServerEntity.insert(list);
                    DevServerDao_Impl.this.__db.setTransactionSuccessful();
                    return C60340gF.A00;
                } finally {
                    DevServerDao_Impl.this.__db.endTransaction();
                }
            }
        }, r4);
    }

    public Object replaceAll(List list, AnonymousClass4D7 r4) {
        return AnonymousClass1t4.A00(this.__db, r4, new DevServerDao_Impl$$ExternalSyntheticLambda0(this, list));
    }

    public DevServerDao_Impl(C251983oI r2) {
        this.__db = r2;
        this.__insertionAdapterOfDevServerEntity = new 1Vf(r2) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `internal_dev_servers` (`url`,`host_type`,`description`,`supports_vpnless`,`cache_timestamp`) VALUES (?,?,?,?,?)";
            }

            public void bind(AnonymousClass1WV r4, DevServerEntity devServerEntity) {
                r4.ADh(1, devServerEntity.url);
                r4.ADh(2, devServerEntity.hostType);
                r4.ADh(3, devServerEntity.description);
                r4.ADa(4, devServerEntity.supportsVpnless ? 1 : 0);
                r4.ADa(5, devServerEntity.cacheTimestamp);
            }
        };
        this.__preparedStmtOfDeleteAll = new 1Vg(r2) {
            public String createQuery() {
                return "DELETE FROM internal_dev_servers";
            }
        };
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    /* renamed from: lambda$replaceAll$0$com-instagram-debug-devoptions-sandboxselector-DevServerDao_Impl  reason: not valid java name */
    public /* synthetic */ Object m72lambda$replaceAll$0$cominstagramdebugdevoptionssandboxselectorDevServerDao_Impl(List list, AnonymousClass4D7 r3) {
        return DevServerDao.replaceAll$suspendImpl(this, list, r3);
    }
}
