/*
 * Copyright (c) 2011,2012 Eric Berry <elberry@tellurianring.com>
 * Copyright (c) 2013 Christopher J. Stehno <chris@stehno.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package templates.tasks.java
import org.junit.Test
import templates.AbstractTaskTester

import static templates.tasks.java.CreateJavaClassTask.NEW_CLASS_NAME

class CreateJavaClassTaskTest extends AbstractTaskTester {

    CreateJavaClassTaskTest(){
        super( CreateJavaClassTask )
    }

    @Test void create(){
        project.apply plugin:'java'

        project.ext[NEW_CLASS_NAME] = 'foo.Something'

        task.create()

        assertFileContains testRoot, 'src/main/java/foo/Something.java', 'class Something'
    }
}
