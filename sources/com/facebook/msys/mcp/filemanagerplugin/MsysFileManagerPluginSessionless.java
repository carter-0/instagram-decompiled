package com.facebook.msys.mcp.filemanagerplugin;

import X.0KC;
import X.0cp;
import X.AnonymousClass7TE;
import X.C9260RVl;
import X.Pxj;
import android.net.Uri;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.FileManager;
import com.facebook.valueholder.ValueHolder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MsysFileManagerPluginSessionless extends Sessionless {
    public static final String TAG = "MsysFileManagerPluginSessionless";

    public void MsysFileManagerImpl_MsysFileManagerClearURLResourcePropertyCacheFileSize(Uri uri) {
    }

    public Uri MsysFileManagerImpl_MsysFileManagerCopyHomeDirectoryURL() {
        return null;
    }

    public List MsysFileManagerImpl_MsysFileManagerCopyContentsOfDirectoryAtURL(Uri uri) {
        if (FileManager.sInitialized) {
            String[] listDirectory = FileManager.listDirectory(uri.toString());
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (String A00 : listDirectory) {
                A1C.add(0cp.A03(C9260RVl.A00(A00, false)));
            }
            return A1C;
        }
        throw new MsysError(MsysError.initNativeHolder("FileManagerInitializationError", 0, (Map) null));
    }

    public boolean MsysFileManagerImpl_MsysFileManagerCopyFile(Uri uri, Uri uri2, ValueHolder valueHolder) {
        if (FileManager.sInitialized) {
            FileManager.copyFile(uri.toString(), uri2.toString());
            return true;
        }
        throw Pxj.A0T();
    }

    public Uri MsysFileManagerImpl_MsysFileManagerCreateCacheDirectory(String str) {
        if (FileManager.sInitialized) {
            return 0cp.A03(C9260RVl.A00(FileManager.createCacheDirectory(str), true));
        }
        throw Pxj.A0T();
    }

    public byte[] MsysFileManagerImpl_MsysFileManagerCreateDataWithContentsOfFile(Uri uri, int i, ValueHolder valueHolder) {
        if (FileManager.sInitialized) {
            uri.getClass();
            return FileManager.readFile(uri.toString());
        }
        throw Pxj.A0T();
    }

    public boolean MsysFileManagerImpl_MsysFileManagerCreateDirectory(Uri uri) {
        if (FileManager.sInitialized) {
            FileManager.createDirectory(uri.toString());
            return true;
        }
        throw Pxj.A0T();
    }

    public String MsysFileManagerImpl_MsysFileManagerCreateStringWithContentsOfFile(Uri uri, int i, ValueHolder valueHolder) {
        if (FileManager.sInitialized) {
            return new String(FileManager.readFile(uri.toString()), StandardCharsets.UTF_8);
        }
        throw new MsysError(MsysError.initNativeHolder("FileManagerInitializationError", 0, (Map) null));
    }

    public Uri MsysFileManagerImpl_MsysFileManagerCreateTemporaryDirectoryURL() {
        if (FileManager.sInitialized) {
            return 0cp.A03(C9260RVl.A00(FileManager.mCacheDir.toString(), true));
        }
        0KC.A0C(TAG, "FileManager is not initialized");
        return null;
    }

    public boolean MsysFileManagerImpl_MsysFileManagerDeleteItem(Uri uri) {
        if (FileManager.sInitialized) {
            FileManager.deleteItem(uri.toString());
            return true;
        }
        throw Pxj.A0T();
    }

    public boolean MsysFileManagerImpl_MsysFileManagerItemExists(Uri uri) {
        if (FileManager.sInitialized) {
            return FileManager.itemExists(uri.toString());
        }
        0KC.A0C(TAG, "FileManager is not initialized");
        return false;
    }

    public boolean MsysFileManagerImpl_MsysFileManagerMoveFile(Uri uri, Uri uri2, ValueHolder valueHolder, ValueHolder valueHolder2) {
        if (FileManager.sInitialized) {
            FileManager.moveFile(uri.toString(), uri2.toString());
            return true;
        }
        throw Pxj.A0T();
    }

    public boolean MsysFileManagerImpl_MsysFileManagerWriteDataToFile(byte[] bArr, Uri uri, ValueHolder valueHolder, boolean z) {
        if (FileManager.sInitialized) {
            FileManager.writeDataToFile(bArr, uri.toString(), z);
            return true;
        }
        throw Pxj.A0T();
    }

    public boolean MsysFileManagerImpl_MsysFileManagerDeleteDatabaseFile(Uri uri) {
        return MsysFileManagerImpl_MsysFileManagerDeleteItem(uri);
    }
}
