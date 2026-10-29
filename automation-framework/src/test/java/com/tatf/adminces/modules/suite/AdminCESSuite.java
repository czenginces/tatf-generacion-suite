package com.tatf.adminces.modules.suite;

import com.tatf.adminces.modules.adminces.test.AdminCESTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite AdminCES")
@SelectClasses(AdminCESTest.class)
public class AdminCESSuite {
}
