/*
 * Copyright 2016 Tarik Curto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test;

import com.tarikcurto.plain.compare.Comparator;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Tarik Curto - centro.tarik at live.com
 */
public class Test {

    public Test(){
        
        Comparator comparator = new Comparator();
        comparator.add("Hello World, good job!");
        comparator.add("Hello Java, good task!");
        comparator.compare();
        
        ArrayList<String> equals = comparator.equals.get();
        ArrayList<String[]> diffs = comparator.diffs.get();
    }
    
    public static void main(String[] args) {
        Test test = new Test();
    }
    
}
