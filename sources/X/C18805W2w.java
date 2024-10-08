package X;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.W2w  reason: case insensitive filesystem */
public final class C18805W2w {
    public static final Map A00 = new HashMap();
    public static final Map A01 = new HashMap();

    public static void A04(ReactPropGroup reactPropGroup, Class cls, Method method, Map map) {
        Object ut5;
        C18752Vzn vzn;
        ReactPropGroup reactPropGroup2 = reactPropGroup;
        String[] names = reactPropGroup.names();
        int i = 0;
        Method method2 = method;
        if (cls == Dynamic.class) {
            while (i < names.length) {
                map.put(names[i], new C18752Vzn(reactPropGroup2, BaseViewManager.STATE_MIXED, method, i));
                i++;
            }
        } else if (cls == Integer.TYPE) {
            while (i < names.length) {
                boolean equals = "Color".equals(reactPropGroup2.customType());
                String str = names[i];
                int defaultInt = reactPropGroup2.defaultInt();
                if (equals) {
                    ut5 = new UT2(reactPropGroup2, method, i, defaultInt);
                } else {
                    ut5 = new UT5(reactPropGroup2, method, i, defaultInt);
                }
                map.put(str, ut5);
                i++;
            }
        } else if (cls == Float.TYPE) {
            while (i < names.length) {
                map.put(names[i], new UT4(reactPropGroup2, method, reactPropGroup2.defaultFloat(), i));
                i++;
            }
        } else if (cls == Double.TYPE) {
            while (i < names.length) {
                map.put(names[i], new UT3(reactPropGroup2, method2, reactPropGroup2.defaultDouble(), i));
                i++;
            }
        } else if (cls != Integer.class) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized type: ");
            sb.append(cls);
            sb.append(" for method: ");
            sb.append(method.getDeclaringClass().getName());
            sb.append("#");
            throw new RuntimeException(AnonymousClass7TF.A0l(method.getName(), sb));
        } else {
            while (i < names.length) {
                boolean equals2 = "Color".equals(reactPropGroup2.customType());
                String str2 = names[i];
                if (equals2) {
                    vzn = new C18752Vzn(reactPropGroup2, BaseViewManager.STATE_MIXED, method, i);
                } else {
                    vzn = new C18752Vzn(reactPropGroup2, "number", method, i);
                }
                map.put(str2, vzn);
                i++;
            }
        }
    }

    public static C18752Vzn A00(ReactProp reactProp, Class cls, Method method) {
        if (cls == Dynamic.class) {
            return new C18752Vzn(reactProp, BaseViewManager.STATE_MIXED, method);
        }
        if (cls == Boolean.TYPE) {
            return new UT1(reactProp, method, reactProp.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            boolean equals = "Color".equals(reactProp.customType());
            int defaultInt = reactProp.defaultInt();
            if (equals) {
                return new UT2(reactProp, method, defaultInt);
            }
            return new UT5(reactProp, method, defaultInt);
        } else if (cls == Float.TYPE) {
            return new UT4(reactProp, method, reactProp.defaultFloat());
        } else {
            if (cls == Double.TYPE) {
                return new UT3(reactProp, method, reactProp.defaultDouble());
            }
            if (cls == String.class) {
                return new C18752Vzn(reactProp, "String", method);
            }
            if (cls == Boolean.class) {
                return new C18752Vzn(reactProp, "boolean", method);
            }
            if (cls == Integer.class) {
                if ("Color".equals(reactProp.customType())) {
                    return new C18752Vzn(reactProp, BaseViewManager.STATE_MIXED, method);
                }
                return new C18752Vzn(reactProp, "number", method);
            } else if (cls == ReadableArray.class) {
                return new C18752Vzn(reactProp, "Array", method);
            } else {
                if (cls == ReadableMap.class) {
                    return new C18752Vzn(reactProp, "Map", method);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized type: ");
                sb.append(cls);
                sb.append(" for method: ");
                sb.append(method.getDeclaringClass().getName());
                sb.append("#");
                throw new RuntimeException(AnonymousClass7TF.A0l(method.getName(), sb));
            }
        }
    }

    public static RuntimeException A01(Class cls, String str, Executable executable) {
        return new RuntimeException(002.A0u(str, cls.getName(), "#", executable.getName()));
    }

    public static Map A02(Class cls) {
        if (cls != null) {
            Class<ReactShadowNode>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (i < length) {
                if (interfaces[i] != ReactShadowNode.class) {
                    i++;
                }
            }
            Map map = A00;
            Map map2 = (Map) map.get(cls);
            if (map2 != null) {
                return map2;
            }
            HashMap hashMap = new HashMap(A02(cls.getSuperclass()));
            for (Method method : cls.getDeclaredMethods()) {
                ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
                if (reactProp != null) {
                    Class[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        hashMap.put(reactProp.name(), A00(reactProp, parameterTypes[0], method));
                    } else {
                        throw A01(cls, "Wrong number of args for prop setter: ", method);
                    }
                }
                ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
                if (reactPropGroup != null) {
                    Class[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes2.length != 2) {
                        throw A01(cls, "Wrong number of args for group prop setter: ", method);
                    } else if (parameterTypes2[0] == Integer.TYPE) {
                        A04(reactPropGroup, parameterTypes2[1], method, hashMap);
                    } else {
                        throw A01(cls, "Second argument should be property index: ", method);
                    }
                }
            }
            map.put(cls, hashMap);
            return hashMap;
        }
        return A01;
    }

    public static Map A03(Class cls) {
        if (cls == ViewManager.class) {
            return A01;
        }
        Map map = A00;
        Map map2 = (Map) map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap hashMap = new HashMap(A03(cls.getSuperclass()));
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
            if (reactProp != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw A01(cls, "Wrong number of args for prop setter: ", method);
                } else if (View.class.isAssignableFrom(parameterTypes[0])) {
                    hashMap.put(reactProp.name(), A00(reactProp, parameterTypes[1], method));
                } else {
                    throw A01(cls, "First param should be a view subclass to be updated: ", method);
                }
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
            if (reactPropGroup != null) {
                Class[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw A01(cls, "Wrong number of args for group prop setter: ", method);
                } else if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw A01(cls, "First param should be a view subclass to be updated: ", method);
                } else if (parameterTypes2[1] == Integer.TYPE) {
                    A04(reactPropGroup, parameterTypes2[2], method, hashMap);
                } else {
                    throw A01(cls, "Second argument should be property index: ", method);
                }
            }
        }
        map.put(cls, hashMap);
        return hashMap;
    }
}
