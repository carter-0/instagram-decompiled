package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

public final class PzF implements Runnable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A00;
    public final /* synthetic */ File A01;

    public PzF(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, File file) {
        this.A00 = shortcutInfoCompatSaverImpl;
        this.A01 = file;
    }

    public final void run() {
        FileInputStream fileInputStream;
        ComponentName componentName;
        try {
            File file = this.A01;
            if (!file.exists() || file.isDirectory() || file.delete()) {
                Pxg.A1L(file);
            }
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.A00;
            File file2 = shortcutInfoCompatSaverImpl.A01;
            if (!file2.exists() || file2.isDirectory() || file2.delete()) {
                Pxg.A1L(file2);
            }
            Map map = shortcutInfoCompatSaverImpl.A04;
            File file3 = shortcutInfoCompatSaverImpl.A02;
            Context context = shortcutInfoCompatSaverImpl.A00;
            0yf A0N = Pxe.A0N(0);
            try {
                fileInputStream = new FileInputStream(file3);
                if (file3.exists()) {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(fileInputStream, "UTF_8");
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (next == 2 && newPullParser.getName().equals("target") && newPullParser.getName().equals("target")) {
                                String A002 = Pz6.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, newPullParser);
                                String A003 = Pz6.A00("short_label", newPullParser);
                                if (!TextUtils.isEmpty(A002) && !TextUtils.isEmpty(A003)) {
                                    int parseInt = Integer.parseInt(Pz6.A00("rank", newPullParser));
                                    String A004 = Pz6.A00("long_label", newPullParser);
                                    String A005 = Pz6.A00("disabled_message", newPullParser);
                                    String A006 = Pz6.A00("component", newPullParser);
                                    if (TextUtils.isEmpty(A006)) {
                                        componentName = null;
                                    } else {
                                        componentName = ComponentName.unflattenFromString(A006);
                                    }
                                    String A007 = Pz6.A00("icon_resource_name", newPullParser);
                                    String A008 = Pz6.A00("icon_bitmap_path", newPullParser);
                                    ArrayList arrayList = new ArrayList();
                                    HashSet hashSet = new HashSet();
                                    while (true) {
                                        int next2 = newPullParser.next();
                                        if (next2 != 1) {
                                            if (next2 != 2) {
                                                if (next2 == 3 && newPullParser.getName().equals("target")) {
                                                    break;
                                                }
                                            } else {
                                                String name = newPullParser.getName();
                                                if (name.equals("intent")) {
                                                    String A009 = Pz6.A00("action", newPullParser);
                                                    String A0010 = Pz6.A00("targetPackage", newPullParser);
                                                    String A0011 = Pz6.A00("targetClass", newPullParser);
                                                    if (A009 != null) {
                                                        Intent intent = new Intent(A009);
                                                        if (!TextUtils.isEmpty(A0010) && !TextUtils.isEmpty(A0011)) {
                                                            intent.setClassName(A0010, A0011);
                                                        }
                                                        arrayList.add(intent);
                                                    }
                                                } else if (name.equals("categories")) {
                                                    String A0012 = Pz6.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, newPullParser);
                                                    if (!TextUtils.isEmpty(A0012)) {
                                                        hashSet.add(A0012);
                                                    }
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    PzB pzB = new PzB(context, A002);
                                    PzA pzA = pzB.A01;
                                    pzA.A0B = A003;
                                    pzA.A02 = parseInt;
                                    if (!TextUtils.isEmpty(A004)) {
                                        pzA.A0C = A004;
                                    }
                                    if (!TextUtils.isEmpty(A005)) {
                                        pzA.A0A = A005;
                                    }
                                    if (componentName != null) {
                                        pzA.A04 = componentName;
                                    }
                                    if (!arrayList.isEmpty()) {
                                        pzA.A0P = (Intent[]) arrayList.toArray(new Intent[0]);
                                    }
                                    if (!hashSet.isEmpty()) {
                                        04u r0 = new 04u(0);
                                        r0.addAll(hashSet);
                                        pzA.A0F = r0;
                                    }
                                    PzC pzC = new PzC(pzB.A00(), A007, A008);
                                    A0N.put(pzC.A00.A0D, pzC);
                                }
                            }
                        }
                    }
                    fileInputStream.close();
                    map.putAll(A0N);
                    shortcutInfoCompatSaverImpl.A04(Dba.A0e(map));
                    return;
                }
                fileInputStream.close();
            } catch (Exception e) {
                file3.delete();
                Log.e("ShortcutInfoCompatSaver", 002.A0g("Failed to load saved values from file ", file3.getAbsolutePath(), ". Old state removed, new added"), e);
            } catch (Throwable th) {
                C9153RRe.A00(th, th);
            }
            map.putAll(A0N);
            shortcutInfoCompatSaverImpl.A04(Dba.A0e(map));
            return;
            throw th;
        } catch (Exception e2) {
            Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e2);
        }
    }
}
