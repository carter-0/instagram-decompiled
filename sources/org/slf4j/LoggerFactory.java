package org.slf4j;

import X.002;
import X.AnonymousClass460;
import X.AnonymousClass461;
import X.AnonymousClass462;
import X.AnonymousClass466;
import X.AnonymousClass469;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import org.slf4j.impl.StaticLoggerBinder;

public final class LoggerFactory {
    public static int A00;
    public static AnonymousClass462 A01 = new Object();
    public static AnonymousClass460 A02 = new AnonymousClass460();
    public static final String[] A03 = {"1.6", "1.7"};

    public static AnonymousClass469 getLogger(String str) {
        AnonymousClass461 r0;
        String[] strArr;
        Enumeration<URL> enumeration;
        if (A00 == 0) {
            A00 = 1;
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = LoggerFactory.class.getClassLoader();
                    if (classLoader == null) {
                        enumeration = ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class");
                    } else {
                        enumeration = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    }
                    while (enumeration.hasMoreElements()) {
                        linkedHashSet.add(enumeration.nextElement());
                    }
                } catch (IOException e) {
                    System.err.println("Error getting resources from path");
                    System.err.println("Reported exception:");
                    e.printStackTrace();
                }
                if (linkedHashSet.size() > 1) {
                    AnonymousClass466.A00("Class path contains multiple SLF4J bindings.");
                    for (Object next : linkedHashSet) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Found binding in [");
                        sb.append(next);
                        sb.append("]");
                        AnonymousClass466.A00(sb.toString());
                    }
                    AnonymousClass466.A00("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
                }
                StaticLoggerBinder.getSingleton();
                A00 = 3;
                if (linkedHashSet.size() > 1) {
                    AnonymousClass466.A00(002.A0g("Actual binding is of type [", StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr(), "]"));
                }
                AnonymousClass460 r02 = A02;
                ArrayList arrayList = new ArrayList();
                List list = r02.A00;
                synchronized (list) {
                    arrayList.addAll(list);
                }
                if (arrayList.size() != 0) {
                    AnonymousClass466.A00("The following loggers will not work because they were created");
                    AnonymousClass466.A00("during the default configuration phase of the underlying logging system.");
                    AnonymousClass466.A00("See also http://www.slf4j.org/codes.html#substituteLogger");
                    for (int i = 0; i < arrayList.size(); i++) {
                        AnonymousClass466.A00((String) arrayList.get(i));
                    }
                }
            } catch (NoClassDefFoundError e2) {
                String message = e2.getMessage();
                if (message == null || (message.indexOf("org/slf4j/impl/StaticLoggerBinder") == -1 && message.indexOf("org.slf4j.impl.StaticLoggerBinder") == -1)) {
                    A00 = 2;
                    System.err.println("Failed to instantiate SLF4J LoggerFactory");
                    System.err.println("Reported exception:");
                    e2.printStackTrace();
                    throw e2;
                }
                A00 = 4;
                AnonymousClass466.A00("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                AnonymousClass466.A00("Defaulting to no-operation (NOP) logger implementation");
                AnonymousClass466.A00("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } catch (NoSuchMethodError e3) {
                String message2 = e3.getMessage();
                if (!(message2 == null || message2.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") == -1)) {
                    A00 = 2;
                    AnonymousClass466.A00("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    AnonymousClass466.A00("Your binding is version 1.5.5 or earlier.");
                    AnonymousClass466.A00("Upgrade your binding to version 1.6.x.");
                }
                throw e3;
            } catch (Exception e4) {
                A00 = 2;
                System.err.println("Failed to instantiate SLF4J LoggerFactory");
                System.err.println("Reported exception:");
                e4.printStackTrace();
                throw new IllegalStateException("Unexpected initialization failure", e4);
            }
            if (A00 == 3) {
                try {
                    String str2 = StaticLoggerBinder.REQUESTED_API_VERSION;
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        strArr = A03;
                        if (i2 >= 2) {
                            break;
                        }
                        if (str2.startsWith(strArr[i2])) {
                            z = true;
                        }
                        i2++;
                    }
                    if (!z) {
                        AnonymousClass466.A00(002.A0u("The requested version ", str2, " by your slf4j binding is not compatible with ", Arrays.asList(strArr).toString()));
                        AnonymousClass466.A00("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
                    }
                } catch (NoSuchFieldError unused) {
                } catch (Throwable th) {
                    System.err.println("Unexpected problem occured during version sanity check");
                    System.err.println("Reported exception:");
                    th.printStackTrace();
                }
            }
        }
        int i3 = A00;
        if (i3 == 1) {
            r0 = A02;
        } else if (i3 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i3 == 3) {
            r0 = StaticLoggerBinder.getSingleton().getLoggerFactory();
        } else if (i3 == 4) {
            r0 = A01;
        } else {
            throw new IllegalStateException("Unreachable code");
        }
        return r0.BO4(str);
    }
}
